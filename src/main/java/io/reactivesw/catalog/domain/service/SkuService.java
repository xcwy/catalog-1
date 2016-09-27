package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.exception.SkuNotActiveException;
import io.reactivesw.catalog.infrastructure.repository.SkuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this is service class for sku.
 * Created by Davis on 16/9/26.
 */
@Service("skuService")
public class SkuService {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(SkuService.class);

  /**
   * sku repository.
   */
  @Autowired
  private transient SkuRepository skuRepository;

  /**
   * query inventory by sku id.
   *
   * @param skuId sku id.
   * @return int sku inventory.
   */
  public int queryQuantity(long skuId) {
    LOG.debug("query sku quantity by it's id {}.", skuId);
    final Sku sku = skuRepository.findOne(skuId);
    if (sku == null) {
      LOG.warn("can not find sku with id {}.", skuId);
      throw new NotFoundException("sku is not exist.");
    } else if (!sku.isActive()) {
      LOG.debug("sku is not active, id is {}.", skuId);
      throw new SkuNotActiveException("sku is not active");
    }
    final int quantity = sku.getQuantity();
    LOG.debug("end query sku quantity, id is {}, quantity is {}", skuId, quantity);
    return quantity;
  }

  /**
   * query sku by sku id.
   *
   * @param skuId id of sku
   * @return Sku Sku
   */
  public Sku querySkuById(long skuId) {
    LOG.debug("query sku by id {}.", skuId);
    final Sku sku = skuRepository.findOne(skuId);

    if (sku == null) {
      LOG.warn("can not find sku with id {}.", skuId);
      throw new NotFoundException("sku is not exist.");
    } else if (!sku.isActive()) {
      LOG.debug("sku is not active, id is {}.", skuId);
      throw new SkuNotActiveException("sku is not active");
    }

    LOG.debug("end query sku, get sku: {}", sku.toString());
    return sku;
  }
}
