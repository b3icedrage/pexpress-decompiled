package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1706Oq implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;

    public C1706Oq(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.f = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1628Nq((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.f).get(), (ReporterApi) this.c.get(), (Context) this.d.get(), (Pa2) this.e.get());
            default:
                return new C3408df1((VK1) ((XK1) this.e).get(), (C6201qi2) this.b.get(), (Pa2) this.c.get(), (C4923kf) this.d.get(), (InterfaceC3985gQ) ((C5083lQ) this.f).get());
        }
    }

    public C1706Oq(XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C5083lQ c5083lQ) {
        this.e = xk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.f = c5083lQ;
    }
}
