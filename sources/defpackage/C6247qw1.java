package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: qw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6247qw1 implements InterfaceC5331mb0<C4984kw1> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final C5609nu b;
    public final InterfaceC1531Mk1<ReporterApi> c;
    public final InterfaceC1531Mk1<InterfaceC3170cY> d;
    public final InterfaceC1531Mk1<MR1> e;

    public C6247qw1(InterfaceC1531Mk1 interfaceC1531Mk1, C5609nu c5609nu, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = c5609nu;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4984kw1(this.a.get(), (InterfaceC4976ku) this.b.get(), this.c.get(), this.d.get(), new C3281d30(), this.e.get());
    }
}
