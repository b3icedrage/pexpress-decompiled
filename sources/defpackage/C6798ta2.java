package defpackage;

import defpackage.InterfaceC4302hv0;
import defpackage.NG1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.f;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ta2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6798ta2 implements JW1.a, MD1, a.InterfaceC0395a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6798ta2(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // JW1.a
    public Object c() {
        return ((C7639xa2) this.d).c.f1((C1778Po) this.e);
    }

    @Override // io.sentry.instrumentation.file.a.InterfaceC0395a
    public Object call() throws IOException {
        int i = ((f) this.d).d.read();
        ((AtomicInteger) this.e).set(i);
        return Integer.valueOf(i != -1 ? 1 : 0);
    }

    @Override // defpackage.MD1
    public void e(final InterfaceC1015Fu0 interfaceC1015Fu0) {
        final ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.d;
        activityLifecycleIntegration.getClass();
        final InterfaceC4302hv0 interfaceC4302hv0 = (InterfaceC4302hv0) this.e;
        interfaceC1015Fu0.G(new KD1.c() { // from class: io.sentry.android.core.h
            @Override // KD1.c
            public final void a(InterfaceC4302hv0 interfaceC4302hv1) {
                InterfaceC4302hv0 interfaceC4302hv2 = interfaceC4302hv0;
                ActivityLifecycleIntegration activityLifecycleIntegration2 = activityLifecycleIntegration;
                if (interfaceC4302hv1 == null) {
                    activityLifecycleIntegration2.getClass();
                    interfaceC1015Fu0.B(interfaceC4302hv2);
                } else {
                    SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration2.h;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC4302hv2.getName());
                    }
                }
            }
        });
    }
}
