package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: qB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6091qB implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C6091qB(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5881pB((ReporterApi) this.b.get(), (AbstractC2903bE1) this.c.get());
            case 1:
                return new NX((C4923kf) this.b.get(), (AbstractC3104cC) this.c.get());
            default:
                return new C3640el0((C4923kf) this.c.get(), (InterfaceC7012ub2) this.b.get());
        }
    }
}
