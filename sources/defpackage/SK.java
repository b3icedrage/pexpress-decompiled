package defpackage;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.util.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SK implements a.InterfaceC0383a {
    public static String b(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static void c(C5274mI1 c5274mI1, Class cls, Class cls2, Class cls3, Class cls4) {
        c5274mI1.register(cls).provides(cls2);
        c5274mI1.register(cls3).provides(cls4);
    }

    @Override // io.sentry.android.core.util.a.InterfaceC0383a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (Throwable unused) {
            return null;
        }
    }
}
