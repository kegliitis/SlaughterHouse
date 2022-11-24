package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.TrayClient;
import via.sdj3.slaughterhouse.model.Tray;
import via.sdj3.slaughterhouse.protobuf.product.CreateProductRequest;
import via.sdj3.slaughterhouse.protobuf.product.ProductServiceGrpc;
import via.sdj3.slaughterhouse.protobuf.tray.*;

public class TrayClientImpl implements TrayClient {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();
    private TrayServiceGrpc.TrayServiceBlockingStub blockingStub = TrayServiceGrpc.newBlockingStub(channel);


    @Override
    public String createTray(Tray tray) {
            CreateTrayRequest input = CreateTrayRequest.newBuilder()
                    .setDescription(tray.getDescription())
                    .setWeight(tray.getMaxWeight())
                    .build();

        CreateTrayResponse response = blockingStub.createTray(input);
        return response.getConfirmation();

    }

    @Override
    public Tray getTray(int trayId) {
        GetTrayRequest input = GetTrayRequest.newBuilder().setId(trayId).build();

        GetTrayResponse response = blockingStub.getTray(input);
        Tray tray = new Tray(response.getId(), response.getDescription(), response.getWeight());
        return tray;
    }
}
