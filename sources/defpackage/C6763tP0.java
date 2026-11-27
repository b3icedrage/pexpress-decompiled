package defpackage;

import android.content.Context;
import defpackage.InterfaceC4302hv0;
import io.sentry.android.core.ActivityLifecycleIntegration;

/* JADX INFO: renamed from: tP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6763tP0 implements InterfaceC5056lH, MD1 {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6763tP0(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return new C8111zo((String) this.d, ((C6973uP0.a) this.e).a((Context) c1480Lt1.a(Context.class)));
    }

    @Override // defpackage.MD1
    public void e(final InterfaceC1015Fu0 interfaceC1015Fu0) {
        ((ActivityLifecycleIntegration) this.d).getClass();
        final InterfaceC4302hv0 interfaceC4302hv0 = (InterfaceC4302hv0) this.e;
        interfaceC1015Fu0.G(new KD1.c() { // from class: io.sentry.android.core.f
            @Override // KD1.c
            public final void a(InterfaceC4302hv0 interfaceC4302hv1) {
                if (interfaceC4302hv1 == interfaceC4302hv0) {
                    interfaceC1015Fu0.u();
                }
            }
        });
    }
}
