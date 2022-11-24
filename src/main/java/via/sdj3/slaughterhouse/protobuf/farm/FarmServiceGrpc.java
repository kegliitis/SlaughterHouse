package via.sdj3.slaughterhouse.protobuf.farm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Farm.proto")
public final class FarmServiceGrpc {

  private FarmServiceGrpc() {}

  public static final String SERVICE_NAME = "via.sdj3.slaughterhouse.protobuf.farm.FarmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest,
      via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> getCreateFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createFarm",
      requestType = via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest.class,
      responseType = via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest,
      via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> getCreateFarmMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest, via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> getCreateFarmMethod;
    if ((getCreateFarmMethod = FarmServiceGrpc.getCreateFarmMethod) == null) {
      synchronized (FarmServiceGrpc.class) {
        if ((getCreateFarmMethod = FarmServiceGrpc.getCreateFarmMethod) == null) {
          FarmServiceGrpc.getCreateFarmMethod = getCreateFarmMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest, via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createFarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FarmServiceMethodDescriptorSupplier("createFarm"))
              .build();
        }
      }
    }
    return getCreateFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest,
      via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> getGetFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFarm",
      requestType = via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest.class,
      responseType = via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest,
      via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> getGetFarmMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest, via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> getGetFarmMethod;
    if ((getGetFarmMethod = FarmServiceGrpc.getGetFarmMethod) == null) {
      synchronized (FarmServiceGrpc.class) {
        if ((getGetFarmMethod = FarmServiceGrpc.getGetFarmMethod) == null) {
          FarmServiceGrpc.getGetFarmMethod = getGetFarmMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest, via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FarmServiceMethodDescriptorSupplier("getFarm"))
              .build();
        }
      }
    }
    return getGetFarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FarmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceStub>() {
        @java.lang.Override
        public FarmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceStub(channel, callOptions);
        }
      };
    return FarmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FarmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceBlockingStub>() {
        @java.lang.Override
        public FarmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceBlockingStub(channel, callOptions);
        }
      };
    return FarmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FarmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmServiceFutureStub>() {
        @java.lang.Override
        public FarmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmServiceFutureStub(channel, callOptions);
        }
      };
    return FarmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FarmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createFarm(via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFarmMethod(), responseObserver);
    }

    /**
     */
    public void getFarm(via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFarmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest,
                via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse>(
                  this, METHODID_CREATE_FARM)))
          .addMethod(
            getGetFarmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest,
                via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse>(
                  this, METHODID_GET_FARM)))
          .build();
    }
  }

  /**
   */
  public static final class FarmServiceStub extends io.grpc.stub.AbstractAsyncStub<FarmServiceStub> {
    private FarmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceStub(channel, callOptions);
    }

    /**
     */
    public void createFarm(via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFarm(via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FarmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FarmServiceBlockingStub> {
    private FarmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse createFarm(via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse getFarm(via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FarmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FarmServiceFutureStub> {
    private FarmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse> createFarm(
        via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse> getFarm(
        via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFarmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FARM = 0;
  private static final int METHODID_GET_FARM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FarmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FarmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FARM:
          serviceImpl.createFarm((via.sdj3.slaughterhouse.protobuf.farm.CreateFarmRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.CreateFarmResponse>) responseObserver);
          break;
        case METHODID_GET_FARM:
          serviceImpl.getFarm((via.sdj3.slaughterhouse.protobuf.farm.GetFarmRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.farm.GetFarmResponse>) responseObserver);
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

  private static abstract class FarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FarmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.farm.Farm.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FarmService");
    }
  }

  private static final class FarmServiceFileDescriptorSupplier
      extends FarmServiceBaseDescriptorSupplier {
    FarmServiceFileDescriptorSupplier() {}
  }

  private static final class FarmServiceMethodDescriptorSupplier
      extends FarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FarmServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FarmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FarmServiceFileDescriptorSupplier())
              .addMethod(getCreateFarmMethod())
              .addMethod(getGetFarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
