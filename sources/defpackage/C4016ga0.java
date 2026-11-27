package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ga0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4016ga0 implements InterfaceC1612Nk1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C4016ga0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C3980gO0<ScheduledExecutorService> c3980gO0 = ExecutorsRegistrar.a;
                return new ScheduledExecutorServiceC3796fX(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new GR("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.d.get());
            default:
                return null;
        }
    }
}
