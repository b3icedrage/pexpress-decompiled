package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BA implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public BA(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                AbstractC7949z22 assetsProvider = (AbstractC7949z22) this.b.get();
                S02 trader = (S02) this.c.get();
                Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
                Intrinsics.checkNotNullParameter(trader, "trader");
                return new AA(assetsProvider, trader);
            default:
                InterfaceC1454Lk1 interfaceC1454Lk1B = C5208m0.b(this.b);
                final InterfaceC3560eO0 trader2 = interfaceC1454Lk1B instanceof InterfaceC3560eO0 ? (InterfaceC3560eO0) interfaceC1454Lk1B : new Y20(interfaceC1454Lk1B);
                final C4923kf appData = (C4923kf) this.c.get();
                Intrinsics.checkNotNullParameter(trader2, "trader");
                Intrinsics.checkNotNullParameter(appData, "appData");
                return new InterfaceC7773yB1() { // from class: Cz1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        Intrinsics.checkNotNullParameter(out, "out");
                        int iIntValue = ((Number) ((S02) trader2.get()).A.d.getValue()).intValue();
                        if (iIntValue > 0) {
                            out.put("bet_amount", Integer.valueOf(iIntValue));
                        }
                        out.put("bet_bounds_loaded", Boolean.valueOf(!((Map) appData.J.getValue()).isEmpty()));
                    }
                };
        }
    }

    public BA(C5207m c5207m, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }
}
