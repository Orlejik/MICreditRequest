package Helpers;

import java.io.IOException;
import java.net.InetAddress;

public class IsNetworkPersists {
    public static boolean isConnected() throws IOException {
        InetAddress googleAddress = InetAddress.getByName("google.com");
        return googleAddress.isReachable(5000);
    }
}
