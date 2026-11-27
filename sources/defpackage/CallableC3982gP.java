package defpackage;

import android.util.Log;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3982gP implements Callable<Boolean> {
    public final /* synthetic */ C4192hP d;

    public CallableC3982gP(C4192hP c4192hP) {
        this.d = c4192hP;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        YO yo = this.d.g;
        C4402iP c4402iP = yo.c;
        String str = c4402iP.a;
        C4448id0 c4448id0 = c4402iP.b;
        c4448id0.getClass();
        boolean z = true;
        if (new File(c4448id0.b, str).exists()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            String str2 = c4402iP.a;
            c4448id0.getClass();
            new File(c4448id0.b, str2).delete();
        } else {
            NavigableSet navigableSetC = yo.l.b.c();
            String str3 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
            if (str3 == null || !yo.j.c(str3)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
