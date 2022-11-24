package via.sdj3.slaughterhouse.protobuf.store;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Store.proto")
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "via.sdj3.slaughterhouse.protobuf.store.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest,
      via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> getCreateStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStore",
      requestType = via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest.class,
      responseType = via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest,
      via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> getCreateStoreMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest, via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> getCreateStoreMethod;
    if ((getCreateStoreMethod = StoreServiceGrpc.getCreateStoreMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getCreateStoreMethod = StoreServiceGrpc.getCreateStoreMethod) == null) {
          StoreServiceGrpc.getCreateStoreMethod = getCreateStoreMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest, via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("CreateStore"))
              .build();
        }
      }
    }
    return getCreateStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest,
      via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> getGetStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStore",
      requestType = via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest.class,
      responseType = via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest,
      via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> getGetStoreMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest, via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> getGetStoreMethod;
    if ((getGetStoreMethod = StoreServiceGrpc.getGetStoreMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetStoreMethod = StoreServiceGrpc.getGetStoreMethod) == null) {
          StoreServiceGrpc.getGetStoreMethod = getGetStoreMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest, via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("GetStore"))
              .build();
        }
      }
    }
    return getGetStoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub>() {
        @java.lang.Override
        public StoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceStub(channel, callOptions);
        }
      };
    return StoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub>() {
        @java.lang.Override
        public StoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceBlockingStub(channel, callOptions);
        }
      };
    return StoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub>() {
        @java.lang.Override
        public StoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceFutureStub(channel, callOptions);
        }
      };
    return StoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createStore(via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStoreMethod(), responseObserver);
    }

    /**
     */
    public void getStore(via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest,
                via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse>(
                  this, METHODID_CREATE_STORE)))
          .addMethod(
            getGetStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest,
                via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse>(
                  this, METHODID_GET_STORE)))
          .build();
    }
  }

  /**
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractAsyncStub<StoreServiceStub> {
    private StoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void createStore(via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStore(via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse createStore(via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse getStore(via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStoreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse> createStore(
        via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse> getStore(
        via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STORE = 0;
  private static final int METHODID_GET_STORE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STORE:
          serviceImpl.createStore((via.sdj3.slaughterhouse.protobuf.store.CreateStoreRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.CreateStoreResponse>) responseObserver);
          break;
        case METHODID_GET_STORE:
          serviceImpl.getStore((via.sdj3.slaughterhouse.protobuf.store.GetStoreRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.store.GetStoreResponse>) responseObserver);
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

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.store.Store.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getCreateStoreMethod())
              .addMethod(getGetStoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
