package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl;
import com.impl.feature.webpageinapp.screens.termsandconditions.BotTermsAndConditionsFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6819tg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6819tg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function0) this.e).invoke();
                return Unit.a;
            case 1:
                return ((BotTermsAndConditionsFragmentImpl) this.e).q;
            case 2:
                ReporterApi.a.b(((C2360Wy1) this.e).g, EnumC5028l80.U0, new C4310hy("robot_screen", "profit_limit_popup", "stop_robot_popup"), null, 12);
                return Unit.a;
            case 3:
                ReporterApi.a.b(((C4617jA1) this.e).h, EnumC5028l80.U0, new C4310hy("robot_screen", "active_robot_overlay", "stop_robot_popup"), null, 12);
                return Unit.a;
            case 4:
                return ((M22) this.e).c.F();
            case 5:
                Q2 q2 = ((C3296d7) this.e).b;
                if (q2 != null) {
                    q2.invoke();
                    return Unit.a;
                }
                Intrinsics.l("defaultOnBackPressed");
                throw null;
            default:
                return ((WithdrawFragmentImpl) this.e).w;
        }
    }
}
