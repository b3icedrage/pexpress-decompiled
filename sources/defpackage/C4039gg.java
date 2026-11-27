package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4039gg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4039gg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((C6425rm1) obj).getClass();
                return Unit.a;
            case 1:
                Integer numValueOf = Integer.valueOf(R.string.unlock_loss_limit_title);
                Integer numValueOf2 = Integer.valueOf(R.string.unlock_loss_limit_text);
                ((C5399mu) obj).getClass();
                return new C3668eu(VE.c(new C5819ou(numValueOf, numValueOf2, null, "https://assets.pbotservices.com/images/risk-management/loss-limit.png", 877)), null, null);
            case 2:
                int i = AbstractC6558sR.x0;
                return Integer.valueOf(C0648Bc.c((AbstractC6558sR) obj, R.color.chartMarkerBetUpText));
            default:
                AbstractC7452wg1 abstractC7452wg1 = (AbstractC7452wg1) obj;
                InterfaceC1442Lg1 interfaceC1442Lg1 = abstractC7452wg1.b;
                Intrinsics.checkNotNullParameter(interfaceC1442Lg1, "<this>");
                return interfaceC1442Lg1.a(abstractC7452wg1);
        }
    }
}
