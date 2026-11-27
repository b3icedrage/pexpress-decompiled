package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFc1aSDK;
import com.base.feature.platform.screens.verification.AccountVerificationFragmentBase;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ O4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                Object obj2 = ((AccountVerificationFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C7806yM1) obj2).m.a();
                return Unit.a;
            case 1:
                int i = ApplicationC0963Fd.F;
                Context context = ((ApplicationC0963Fd) obj).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                if (C7279vr.d == null) {
                    C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
                }
                C3362dS c3362dS = C7279vr.d;
                Intrinsics.checkNotNull(c3362dS);
                return c3362dS.f.get();
            case 2:
                ((C2084Tm) obj).t();
                return Unit.a;
            case 3:
                CQ0 cq0B = VE.b();
                cq0B.add(new C5819ou(Integer.valueOf(R.string.strategy_text), Integer.valueOf(R.string.strategy_description_text), null, null, 1005));
                cq0B.add(new C5819ou(Integer.valueOf(R.string.bot_settings_limit_profit), Integer.valueOf(R.string.trading_options_profitlimit_description_text), null, null, 1005));
                if (((C5399mu) obj).d.n()) {
                    cq0B.add(new C5819ou(Integer.valueOf(R.string.bot_settings_limit_loss_title), Integer.valueOf(R.string.bot_settings_limit_loss_text), null, null, 1005));
                }
                return new C3668eu(VE.a(cq0B), null, null);
            case 4:
                int i2 = AbstractC6558sR.x0;
                return Pd2.a((AbstractC6558sR) obj, R.drawable.bg_marker_bet_up);
            case 5:
                C7455wh0 c7455wh0 = (C7455wh0) obj;
                C5189lv.k(C8056za.j(c7455wh0), null, new C7665xh0.a(c7455wh0, null), 3);
                return Unit.a;
            case 6:
                C3348dN0 c3348dN0 = (C3348dN0) obj;
                KN kn = c3348dN0.i;
                if (kn != null) {
                    C5189lv.k(kn, C6266r20.c, new C2705aN0(c3348dN0, null), 2);
                    return Unit.a;
                }
                Intrinsics.l("scope");
                throw null;
            case 7:
                return ((ReRegistrationFragmentImpl) obj).u;
            case 8:
                Object obj3 = ((SupportIssueCategoriesPartBase) obj).i;
                Intrinsics.checkNotNull(obj3);
                return new C6307rD0(new SupportIssueCategoriesPartBase.a(1, obj3, XV1.class, "onPopularQuestionClick", "onPopularQuestionClick(Ljava/lang/String;)V", 0));
            case 9:
                return ((C2750ab2) obj).g.F();
            default:
                return ((AFc1aSDK) obj).t_();
        }
    }
}
