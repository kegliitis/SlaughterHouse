package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.Tray;

public interface TrayClient {
    String createTray(Tray tray);

    Tray getTray(int trayId);

}
