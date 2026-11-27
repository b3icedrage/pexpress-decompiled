package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;

/* JADX INFO: renamed from: ue1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7023ue1 implements InterfaceC5331mb0<PlatformFragmentImpl> {
    public final OW a;
    public final InterfaceC1531Mk1<C2137Ud1> b;
    public final InterfaceC1531Mk1<Pa2> c;
    public final InterfaceC1531Mk1<InterfaceC2297Wd1> d;
    public final InterfaceC1531Mk1<C1280Je1> e;
    public final InterfaceC1531Mk1<Ch2> f;
    public final InterfaceC1531Mk1<C3408df1> g;
    public final InterfaceC1454Lk1 h;
    public final InterfaceC1531Mk1<ReporterApi> i;
    public final InterfaceC1531Mk1<C4923kf> j;
    public final InterfaceC1531Mk1<C4612j90> k;
    public final C5083lQ l;

    public C7023ue1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk7, InterfaceC1531Mk1 interfaceC1531Mk8, InterfaceC1531Mk1 interfaceC1531Mk9, C5083lQ c5083lQ) {
        this.a = ow;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.g = interfaceC1531Mk6;
        this.h = interfaceC1454Lk1;
        this.i = interfaceC1531Mk7;
        this.j = interfaceC1531Mk8;
        this.k = interfaceC1531Mk9;
        this.l = c5083lQ;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new PlatformFragmentImpl((Sd2) this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), (AbstractC4456if1) this.h.get(), this.i.get(), this.j.get(), this.k.get(), (InterfaceC3985gQ) this.l.get());
    }
}
