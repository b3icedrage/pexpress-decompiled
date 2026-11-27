package defpackage;

import android.content.Context;
import com.base.feature.analytics.reporters.ReporterBase;

/* JADX INFO: renamed from: hs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4294hs1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1531Mk1 g;
    public final InterfaceC1531Mk1 h;
    public final InterfaceC5331mb0 i;

    public C4294hs1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, C0843Dp c0843Dp, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.i = c0843Dp;
        this.g = interfaceC1531Mk6;
        this.h = interfaceC1531Mk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ReporterBase((InterfaceC6168qa1) this.b.get(), (InterfaceC5482nI) this.c.get(), (InterfaceC1446Li) this.d.get(), (AbstractC3947gD0) this.e.get(), (ZT1) this.f.get(), (C4923kf) this.g.get(), (InterfaceC2570Zi) this.h.get(), (Context) ((C6) this.i).get());
            default:
                return new Dh2((C4923kf) this.b.get(), (OL0) this.c.get(), (RL0) this.d.get(), (AbstractC3104cC) this.e.get(), (Nh2) this.f.get(), (Kh2) ((C0843Dp) this.i).get(), (Eh2) this.g.get(), (InterfaceC6830ti2) this.h.get());
        }
    }

    public C4294hs1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7, C6 c6) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.g = interfaceC1531Mk6;
        this.h = interfaceC1531Mk7;
        this.i = c6;
    }
}
