package defpackage;

import io.sentry.android.core.b0;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: fP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3772fP implements Callable<Boolean> {
    public final /* synthetic */ C4192hP d;

    public CallableC3772fP(C4192hP c4192hP) {
        this.d = c4192hP;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        try {
            C4402iP c4402iP = this.d.e;
            String str = c4402iP.a;
            C4448id0 c4448id0 = c4402iP.b;
            c4448id0.getClass();
            boolean zDelete = new File(c4448id0.b, str).delete();
            if (!zDelete) {
                b0.f("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
            return Boolean.valueOf(zDelete);
        } catch (Exception e) {
            b0.d("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
            return Boolean.FALSE;
        }
    }
}
