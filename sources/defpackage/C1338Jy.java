package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1338Jy implements InterfaceC5331mb0<C1260Iy> {
    public final InterfaceC1531Mk1<Context> a;
    public final InterfaceC1531Mk1<Pa2> b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1531Mk1<C4923kf> d;
    public final C0609Ap e;
    public final InterfaceC1531Mk1<ReporterApi> f;

    public C1338Jy(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk3, C0609Ap c0609Ap, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1454Lk1;
        this.d = interfaceC1531Mk3;
        this.e = c0609Ap;
        this.f = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C1260Iy(this.a.get(), this.b.get(), (C3296d7) this.c.get(), this.d.get(), (Sa2) this.e.get(), this.f.get());
    }
}
