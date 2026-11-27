package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4024gc0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C4024gc0(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3814fc0((InterfaceC7012ub2) this.b.get());
            case 1:
                return new C4308hx0((ReporterApi) this.b.get());
            case 2:
                return new C1996Si1((InterfaceC0565Aa0) this.b.get());
            case 3:
                return new C2245Vn1((InterfaceC1442Lg1) this.b.get());
            case 4:
                InterfaceC1454Lk1 interfaceC1454Lk1B = C5208m0.b(this.b);
                final InterfaceC3560eO0 trader = interfaceC1454Lk1B instanceof InterfaceC3560eO0 ? (InterfaceC3560eO0) interfaceC1454Lk1B : new Y20(interfaceC1454Lk1B);
                Intrinsics.checkNotNullParameter(trader, "trader");
                return new InterfaceC7773yB1() { // from class: Gz1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        Intrinsics.checkNotNullParameter(out, "out");
                        out.put("selected_indicator", ((S02) trader.get()).C.d.getValue());
                    }
                };
            default:
                return new ET1((InterfaceC1442Lg1) this.b.get());
        }
    }

    public C4024gc0(C5207m c5207m, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 4;
        this.b = interfaceC1531Mk1;
    }
}
