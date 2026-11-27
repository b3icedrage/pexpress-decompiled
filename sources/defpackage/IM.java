package defpackage;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class IM extends C5494nM {
    public IM(HS0 hs0) {
        j(hs0);
    }

    public static String q() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused) {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement != null && !inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isAnyLocalAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            throw new UnknownHostException();
        }
    }
}
