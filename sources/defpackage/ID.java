package defpackage;

import android.os.Build;
import io.sentry.util.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ID implements InterfaceC1608Nj0, l.a {
    public static int a(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static String c(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        return ((TD) obj).d();
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable unused) {
            NG1 ng1 = NG1.DEBUG;
            return null;
        }
    }
}
