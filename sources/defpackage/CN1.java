package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class CN1 implements Comparator<InetAddress> {
    @Override // java.util.Comparator
    public final int compare(InetAddress inetAddress, InetAddress inetAddress2) {
        InetAddress inetAddress3 = inetAddress;
        if (inetAddress3.getClass() == inetAddress2.getClass()) {
            return 0;
        }
        return inetAddress3 instanceof Inet6Address ? -1 : 1;
    }
}
