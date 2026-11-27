package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class BC1 implements InterfaceC5331mb0<C7986zC1> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<C4612j90> b;
    public final InterfaceC1531Mk1<ReporterApi> c;
    public final InterfaceC1531Mk1<InterfaceC7012ub2> d;

    public BC1(InterfaceC1531Mk1<C4923kf> interfaceC1531Mk1, InterfaceC1531Mk1<C4612j90> interfaceC1531Mk2, InterfaceC1531Mk1<ReporterApi> interfaceC1531Mk3, InterfaceC1531Mk1<InterfaceC7012ub2> interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7986zC1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
