package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0738Cg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0738Cg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((H2) obj).invoke();
                return Unit.a;
            case 1:
                Integer numValueOf = Integer.valueOf(R.string.unlock_profit_limit_title);
                Integer numValueOf2 = Integer.valueOf(R.string.unlock_profit_limit_text);
                ((C5399mu) obj).getClass();
                return new C3668eu(VE.c(new C5819ou(numValueOf, numValueOf2, null, "https://assets.pbotservices.com/images/risk-management/profit-limit.png", 877)), null, null);
            case 2:
                int i = AbstractC6558sR.x0;
                return Integer.valueOf(C0648Bc.c((AbstractC6558sR) obj, R.color.chartMarkerBetDownText));
            case 3:
                Object obj2 = ((DuoAuthFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                K40 k40 = (K40) obj2;
                k40.e.a();
                C5189lv.k(C8056za.j(k40), null, new J40(k40, null), 3);
                return Unit.a;
            case 4:
                C3977gN0 c3977gN0 = (C3977gN0) obj;
                KN kn = c3977gN0.u;
                if (kn != null) {
                    C5189lv.k(kn, C6266r20.c, new IN0(c3977gN0, null), 2);
                    return Unit.a;
                }
                Intrinsics.l("scope");
                throw null;
            case 5:
                int i2 = ActivityC6781tV0.Q;
                C3086c7 c3086c7 = ((ActivityC6781tV0) obj).H;
                Intrinsics.checkNotNull(c3086c7);
                View childAt = c3086c7.e.getChildAt(0);
                Intrinsics.c(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) childAt;
            case 6:
                AbstractC8082zg1 abstractC8082zg1 = (AbstractC8082zg1) obj;
                InterfaceC1442Lg1 interfaceC1442Lg1 = abstractC8082zg1.b;
                Object objK = abstractC8082zg1.k();
                Intrinsics.checkNotNullParameter(interfaceC1442Lg1, "<this>");
                return interfaceC1442Lg1.d(abstractC8082zg1, objK);
            default:
                return ((RobotAccountSelectionPart) obj).m;
        }
    }
}
