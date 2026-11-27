package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: fa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3806fa0 implements InterfaceC1612Nk1 {
    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        C3980gO0<ScheduledExecutorService> c3980gO0 = ExecutorsRegistrar.a;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new ScheduledExecutorServiceC3796fX(Executors.newFixedThreadPool(4, new GR("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
