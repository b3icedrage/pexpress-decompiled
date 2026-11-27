package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Yz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2544Yz0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C2544Yz0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
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
                return new C2466Xz0((JA) this.b.get(), (InterfaceC4255hh1) this.c.get(), (S7) this.d.get(), (InterfaceC7524x11) this.e.get());
            default:
                return new NE1((ReporterApi) this.b.get(), (C5253mB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.d).get(), (InterfaceC4374iF1) ((InterfaceC1454Lk1) this.e).get());
        }
    }
}
