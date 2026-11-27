package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Om1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1696Om1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C1696Om1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0992Fm1((InterfaceC5889pD1) ((InterfaceC1454Lk1) this.b).get(), (EK1) ((InterfaceC1454Lk1) this.c).get(), (R42) ((InterfaceC1454Lk1) this.d).get(), (C3903g11) ((InterfaceC1454Lk1) this.e).get());
            default:
                return new C5316mW1((C4923kf) this.b.get(), (ReporterApi) this.c.get(), (InterfaceC0565Aa0) this.d.get(), (InterfaceC4234hc0) this.e.get());
        }
    }
}
