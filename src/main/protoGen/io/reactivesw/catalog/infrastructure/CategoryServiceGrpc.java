package io.reactivesw.catalog.infrastructure;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 **
 * define catelog rpc service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: catalog-service.proto")
public class CategoryServiceGrpc {

  private CategoryServiceGrpc() {}

  public static final String SERVICE_NAME = "io.reactivesw.catalog.infrastructure.CategoryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.reactivesw.catalog.infrastructure.CategoryList> METHOD_GET_CATEGORIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catalog.infrastructure.CategoryService", "getCategories"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catalog.infrastructure.CategoryList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryServiceStub newStub(io.grpc.Channel channel) {
    return new CategoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CategoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CategoryServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CategoryService {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.CategoryList> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class CategoryServiceImplBase implements CategoryService, io.grpc.BindableService {

    @java.lang.Override
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.CategoryList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CATEGORIES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return CategoryServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CategoryServiceBlockingClient {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public io.reactivesw.catalog.infrastructure.CategoryList getCategories(com.google.protobuf.Empty request);
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CategoryServiceFutureClient {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.CategoryList> getCategories(
        com.google.protobuf.Empty request);
  }

  public static class CategoryServiceStub extends io.grpc.stub.AbstractStub<CategoryServiceStub>
      implements CategoryService {
    private CategoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoryServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.CategoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CATEGORIES, getCallOptions()), request, responseObserver);
    }
  }

  public static class CategoryServiceBlockingStub extends io.grpc.stub.AbstractStub<CategoryServiceBlockingStub>
      implements CategoryServiceBlockingClient {
    private CategoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoryServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public io.reactivesw.catalog.infrastructure.CategoryList getCategories(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CATEGORIES, getCallOptions(), request);
    }
  }

  public static class CategoryServiceFutureStub extends io.grpc.stub.AbstractStub<CategoryServiceFutureStub>
      implements CategoryServiceFutureClient {
    private CategoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoryServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.CategoryList> getCategories(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CATEGORIES, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractCategoryService extends CategoryServiceImplBase {}

  private static final int METHODID_GET_CATEGORIES = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryService serviceImpl;
    private final int methodId;

    public MethodHandlers(CategoryService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATEGORIES:
          serviceImpl.getCategories((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.CategoryList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_CATEGORIES);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final CategoryService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_CATEGORIES,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              io.reactivesw.catalog.infrastructure.CategoryList>(
                serviceImpl, METHODID_GET_CATEGORIES)))
        .build();
  }
}
