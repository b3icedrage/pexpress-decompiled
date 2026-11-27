package defpackage;

import com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ K6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ActivationTopStepsFragment((Sd2) ((OW) this.b).get());
            case 1:
                return new RR((C1994Si) ((C2072Ti) this.b).get());
            case 2:
                ((C6621sj) this.b).getClass();
                return new C3556eN();
            case 3:
                InterfaceC1454Lk1 interfaceC1454Lk1B = C5208m0.b((InterfaceC1454Lk1) this.b);
                final InterfaceC3560eO0 trader = interfaceC1454Lk1B instanceof InterfaceC3560eO0 ? (InterfaceC3560eO0) interfaceC1454Lk1B : new Y20(interfaceC1454Lk1B);
                Intrinsics.checkNotNullParameter(trader, "trader");
                return new InterfaceC7773yB1() { // from class: Bz1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        Intrinsics.checkNotNullParameter(out, "out");
                        C3279d22 c3279d22 = (C3279d22) CollectionsKt.firstOrNull(((S02) trader.get()).I.d.b());
                        if (c3279d22 != null) {
                            out.put("selected_asset", c3279d22.c);
                            String strC = c3279d22.c();
                            if (strC == null) {
                                strC = c3279d22.b();
                            }
                            out.put("win_rate", strC);
                        }
                    }
                };
            default:
                return new C5523nV1((InterfaceC7007ua1) ((C7904yp) this.b).get());
        }
    }

    public K6(C5207m c5207m, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = 3;
        this.b = interfaceC1454Lk1;
    }
}
