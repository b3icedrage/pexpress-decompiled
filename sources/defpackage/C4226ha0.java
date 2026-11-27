package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ha0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4226ha0 implements InterfaceC1612Nk1 {
    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        C3980gO0<ScheduledExecutorService> c3980gO0 = ExecutorsRegistrar.a;
        return new ScheduledExecutorServiceC3796fX(Executors.newCachedThreadPool(new GR("Firebase Blocking", 11, null)), ExecutorsRegistrar.d.get());
    }
}
