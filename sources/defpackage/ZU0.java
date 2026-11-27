package defpackage;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

/* JADX INFO: loaded from: classes.dex */
public final class ZU0 {
    public static boolean a(MBeanServer mBeanServer, ObjectName objectName) {
        return mBeanServer.isRegistered(objectName);
    }

    public static ObjectName b(HS0 hs0, FD0 fd0, String str) {
        String strD = C1039Gc0.d("Failed to convert [", str, "] to ObjectName");
        C4538ir c4538ir = hs0.g;
        try {
            return new ObjectName(str);
        } catch (NullPointerException e) {
            N70 n70 = new N70(strD, e, 2, fd0);
            if (c4538ir == null) {
                return null;
            }
            c4538ir.a(n70);
            return null;
        } catch (MalformedObjectNameException e2) {
            N70 n71 = new N70(strD, e2, 2, fd0);
            if (c4538ir == null) {
                return null;
            }
            c4538ir.a(n71);
            return null;
        }
    }
}
