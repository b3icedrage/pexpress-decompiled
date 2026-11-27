package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class EK0 implements InterfaceC5331mb0<DK0> {
    public final C6 a;
    public final InterfaceC1531Mk1<ZT1> b;
    public final InterfaceC1531Mk1<InterfaceC0565Aa0> c;
    public final C7987zD d;
    public final InterfaceC1531Mk1<ReporterApi> e;
    public final C1550Mr f;

    public EK0(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C7987zD c7987zD, InterfaceC1531Mk1 interfaceC1531Mk3, C1550Mr c1550Mr) {
        this.a = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c7987zD;
        this.e = interfaceC1531Mk3;
        this.f = c1550Mr;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new DK0((Context) this.a.get(), this.b.get(), new GK0(), this.c.get(), (InterfaceC0799Da0) this.d.get(), this.e.get(), (AbstractC4425iW1) this.f.get());
    }
}
