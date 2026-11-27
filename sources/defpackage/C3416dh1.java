package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: dh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3416dh1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC5331mb0 g;

    public /* synthetic */ C3416dh1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.g = interfaceC5331mb0;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2997bh1((Context) this.b.get(), (PR) ((K6) this.g).get(), (Ch2) this.c.get(), (AbstractC7420wY) this.d.get(), (AbstractC6789tY) this.e.get(), (Pa2) this.f.get());
            default:
                return new C4557ix1((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.g).get(), (ReporterApi) this.c.get(), (YX) this.d.get(), (InterfaceC5213m10) this.e.get(), (C4612j90) this.f.get());
        }
    }
}
