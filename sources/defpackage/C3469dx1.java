package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Set;

/* JADX INFO: renamed from: dx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3469dx1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC5331mb0 e;
    public final InterfaceC1531Mk1 f;

    public /* synthetic */ C3469dx1(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.d = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = interfaceC5331mb0;
        this.f = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3051bx1((Context) ((C6) this.d).get(), (C4923kf) this.b.get(), (AbstractC2199Uy0) this.c.get(), new Nm2(), (Set) ((C4176hJ1) this.e).get(), (C6348rR) ((M4) this.f).get(), new C6256qz1(), new C3990gR1());
            default:
                return new C5955pZ1((InterfaceC4902kZ1) this.d.get(), (AbstractC7004uZ1) this.b.get(), (ReporterApi) this.c.get(), new C3069c22(), (AbstractC1787Pr) ((C1763Pj) this.e).get(), (AbstractC4892kW0) this.f.get());
        }
    }
}
