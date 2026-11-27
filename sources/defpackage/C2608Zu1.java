package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Zu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2608Zu1 implements InterfaceC5331mb0<C2530Yu1> {
    public final InterfaceC1531Mk1<ReporterApi> a;
    public final InterfaceC1531Mk1<C5253mB1> b;
    public final OW c;
    public final InterfaceC1531Mk1<InterfaceC5213m10> d;

    public C2608Zu1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = ow;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2530Yu1(this.a.get(), this.b.get(), (InterfaceC3951gE1) this.c.get(), this.d.get());
    }
}
