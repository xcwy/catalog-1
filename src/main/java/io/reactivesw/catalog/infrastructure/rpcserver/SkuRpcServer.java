package io.reactivesw.catalog.infrastructure.rpcserver;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.application.SkuApplication;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.domain.service.SkuService;
import io.reactivesw.catalog.grpc.GrpcSkuDetail;
import io.reactivesw.catalog.grpc.IntValue;
import io.reactivesw.catalog.grpc.LongValue;
import io.reactivesw.catalog.grpc.SkuIdList;
import io.reactivesw.catalog.grpc.SkuInformation;
import io.reactivesw.catalog.grpc.SkuInformationList;
import io.reactivesw.catalog.grpc.SkuServiceGrpc;
import io.reactivesw.catalog.grpc.StringValue;
import io.reactivesw.catalog.infrastructure.dto.SkuDetailDTO;
import io.reactivesw.catalog.infrastructure.mapper.SkuMapper;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.exception.NullParameterException;
import io.reactivesw.catalog.infrastructure.exception.SkuNotActiveException;
import io.reactivesw.catalog.infrastructure.utils.GrpcResponseUtils;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for sku.
 * Created by Davis on 16/9/26.
 */
@GRpcService
public class SkuRpcServer extends SkuServiceGrpc.SkuServiceImplBase {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(SkuRpcServer.class);

  /**
   * sku service.
   */
  @Autowired
  private transient SkuService skuService;

  /**
   * sku application.
   */
  @Autowired
  private transient SkuApplication skuApplication;
  /**
   * query sku inventory by sku id.
   *
   * @param request          sku id.
   * @param responseObserver inventory number.
   */
  @Override
  public void querySkuInventory(LongValue request, StreamObserver<IntValue> responseObserver) {
    final long skuId = request.getValue();
    LOG.debug("start querySkuInventory, sku id is {}.", skuId);
    try {
      final int inventory = skuService.queryQuantity(skuId);
      final IntValue reply = IntValue.newBuilder().setValue(inventory).build();
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end querySkuInventory, sku id is {}, inventory is {}.", skuId, inventory);
    } catch (NotFoundException exception) {
      LOG.debug("query sku quantity fail, can not find sku.", exception);
      final Status status = Status.NOT_FOUND.withDescription("sku is not exit");
      throw new StatusRuntimeException(status);
    } catch (SkuNotActiveException exception) {
      LOG.debug("query sku quantity fail, sku is not active.", exception);
      final Status status = Status.UNAVAILABLE.withDescription("sku is not active");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * query sku simple information by sku id.
   *
   * @param request          sku id.
   * @param responseObserver SkuInformation.
   */
  @Override
  public void querySkuSimpleInformation(LongValue request, StreamObserver<SkuInformation>
      responseObserver) {
    final long skuId = request.getValue();
    LOG.debug("start querySkuSimpleInformation, id is {}.", skuId);
    try {
      final Sku sku = skuService.querySkuById(skuId);
      final SkuInformation reply = SkuMapper.transferToSkuInformation(sku);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end querySkuSimpleInformation, get sku information {}.", reply.toString());
    } catch (NotFoundException exception) {
      LOG.debug("query sku quantity fail, can not find sku.", exception);
      final Status status = Status.NOT_FOUND.withDescription("sku is not exit");
      throw new StatusRuntimeException(status);
    } catch (SkuNotActiveException exception) {
      LOG.debug("query sku quantity fail, sku is not active.", exception);
      final Status status = Status.UNAVAILABLE.withDescription("sku is not active");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * query list sku information.
   *
   * @param request          list of skuId.
   * @param responseObserver list of sku information.
   */
  @Override
  public void querySkuInformationList(SkuIdList request, StreamObserver<SkuInformationList>
      responseObserver) {
    final List<Long> skuIds = request.getSkuIdList();
    LOG.debug("start querySkuInformationList.");
    try {
      final List<Sku> skus = skuService.queryListSku(skuIds);
      final SkuInformationList reply = SkuMapper.transferToSkuInformationList(skus);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end querySkuInformationList, get {} sku.", reply.getSkuInformationCount());
    } catch (NullParameterException exception) {
      LOG.debug("queryListSku fail. ", exception);
      final Status status = Status.DATA_LOSS.withDescription("list of id is null");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * query sku detail by sku number
   *
   * @param request          sku number
   * @param responseObserver SkuDetailDTO
   */
  @Override
  public void querySkuDetail(StringValue request, StreamObserver<GrpcSkuDetail> responseObserver) {
    final String skuNumber = request.getValue();
    LOG.debug("start querySkuDetail, request is {}.", request.toString());
    try {
      final SkuDetailDTO sku = skuApplication.getSkuDetailByNumber(skuNumber);
      final GrpcSkuDetail reply = SkuMapper.transferToGrpcSkuDetail(sku);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end querySkuDetail");
    } catch (NotFoundException e) {
      LOG.debug("querySkuDetail fail.", e);
      final Status status = Status.NOT_FOUND.withDescription("Sku is not exist");
      throw new StatusRuntimeException(status);
    }
  }
}
