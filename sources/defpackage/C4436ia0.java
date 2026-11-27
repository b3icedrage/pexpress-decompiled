package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ia0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4436ia0 implements InterfaceC1612Nk1 {
    @Override // defpackage.InterfaceC1612Nk1
    public final Object get() {
        C3980gO0<ScheduledExecutorService> c3980gO0 = ExecutorsRegistrar.a;
        return Executors.newSingleThreadScheduledExecutor(new GR("Firebase Scheduler", 0, null));
    }
}
