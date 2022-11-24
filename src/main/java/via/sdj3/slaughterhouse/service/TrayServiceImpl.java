package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse.model.Tray;
import via.sdj3.slaughterhouse.protobuf.tray.*;
import via.sdj3.slaughterhouse.repository.TrayRepository;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@GRpcService
public class TrayServiceImpl extends TrayServiceGrpc.TrayServiceImplBase {

    private EntityManager emf;

    private TrayRepository trayRepository;

    public TrayServiceImpl(TrayRepository trayRepository){this.trayRepository=trayRepository;}

    @Override
    public void createTray(CreateTrayRequest request, StreamObserver<CreateTrayResponse> responseObserver)
    {
        Tray tray = new Tray();
        tray.setDescription(request.getDescription());
        tray.setMaxWeight(request.getWeight());

    }


    @Override
    public void getTray(GetTrayRequest request, StreamObserver<GetTrayResponse> responseStreamObserver)
    {
        Optional<Tray> tray = trayRepository.findById(request.getId());
        Tray trayfound = tray.get();
        GetTrayResponse.Builder builder = GetTrayResponse.newBuilder();
        builder.setId(trayfound.getId());
        builder.setDescription(trayfound.getDescription());
        builder.setWeight(trayfound.getMaxWeight());

        GetTrayResponse response = builder.build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }
}
