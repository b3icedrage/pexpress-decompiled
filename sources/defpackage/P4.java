package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFc1aSDK;
import com.base.feature.platform.screens.verification.AccountVerificationFragmentBase;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import com.impl.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeatImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ P4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((I4) ((AccountVerificationFragmentBase) obj).q).j;
            case 1:
                int i = ApplicationC0963Fd.F;
                Context context = ((ApplicationC0963Fd) obj).getApplicationContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                if (C7279vr.d == null) {
                    C7279vr.d = new C3362dS(new C7700xr(context), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
                }
                C3362dS c3362dS = C7279vr.d;
                Intrinsics.checkNotNull(c3362dS);
                return new C3152cS(c3362dS.a, new C6621sj());
            case 2:
                ((Function0) obj).invoke();
                return Unit.a;
            case 3:
                return new C3668eu(CollectionsKt.Q(((C5399mu) obj).f, VE.c(new C5819ou(Integer.valueOf(R.string.technical_indicator_title), Integer.valueOf(R.string.technical_indicator_text), null, null, 1005))), null, null);
            case 4:
                return ((ChangeLanguageFragmentRepeatImpl) obj).r;
            case 5:
                int i2 = AbstractC6558sR.x0;
                return Pd2.a((AbstractC6558sR) obj, R.drawable.bg_marker_bet_down);
            case 6:
                ((C0664Bh0) obj).p();
                return Unit.a;
            case 7:
                C3348dN0 c3348dN0 = (C3348dN0) obj;
                KN kn = c3348dN0.i;
                if (kn == null) {
                    Intrinsics.l("scope");
                    throw null;
                }
                RV rv = C6266r20.a;
                C5189lv.k(kn, QV0.a, new YM0(c3348dN0, null), 2);
                return Unit.a;
            case 8:
                return C5491nL.c("https://", ((C7654xe1) obj).a.a());
            case 9:
                return ((RobotIndicatorPart) obj).l;
            case 10:
                return ((C2750ab2) obj).h.F();
            default:
                return ((AFc1aSDK) obj).AFLogger();
        }
    }
}
