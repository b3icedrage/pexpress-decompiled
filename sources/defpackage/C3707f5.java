package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3707f5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1454Lk1 e;

    public /* synthetic */ C3707f5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.e = interfaceC1454Lk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3497e5((C4923kf) this.b.get(), (K4) ((M4) this.e).get(), (InterfaceC5862p6) this.c.get(), (ReporterApi) this.d.get());
            case 1:
                return new C3889fx1((NQ) this.b.get(), (C3051bx1) this.c.get(), (InterfaceC2194Uw1) ((C3292d6) this.e).get(), (ReporterApi) this.d.get());
            default:
                return new P52((InterfaceC7541x52) this.b.get(), (B52) this.e.get(), (ReporterApi) this.c.get(), (L52) this.d.get());
        }
    }

    public C3707f5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C3292d6 c3292d6, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = c3292d6;
        this.d = interfaceC1531Mk3;
    }
}
