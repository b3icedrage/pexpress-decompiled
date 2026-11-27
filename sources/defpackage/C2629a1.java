package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.android.core.util.a;

/* JADX INFO: renamed from: a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2629a1 implements a.InterfaceC0383a {
    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // io.sentry.android.core.util.a.InterfaceC0383a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }
}
