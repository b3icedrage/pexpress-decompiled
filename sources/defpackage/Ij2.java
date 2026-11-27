package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class Ij2 implements InterfaceC5331mb0<Hj2> {
    public final InterfaceC1531Mk1<PackageManager> a;
    public final C6 b;
    public final InterfaceC1531Mk1<C4923kf> c;
    public final OW d;
    public final InterfaceC1531Mk1<C5253mB1> e;
    public final InterfaceC1531Mk1<ReporterApi> f;
    public final InterfaceC1531Mk1<AbstractC5045lD0> g;

    public Ij2(InterfaceC1531Mk1 interfaceC1531Mk1, C6 c6, InterfaceC1531Mk1 interfaceC1531Mk2, OW ow, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = interfaceC1531Mk1;
        this.b = c6;
        this.c = interfaceC1531Mk2;
        this.d = ow;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new Hj2(this.a.get(), (Context) this.b.get(), this.c.get(), (InterfaceC3951gE1) this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
