package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.internal.AFd1jSDK;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.base.feature.robot.instruction.screens.InstructionFragment;
import com.pexpress.tool.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5560ng implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5560ng(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Th2) this.e).invoke();
                return Unit.a;
            case 1:
                C2316Wk c2316Wk = ((AbstractC1104Gy) this.e).o;
                if (c2316Wk != null) {
                    c2316Wk.b.b("captcha.backgrounded", "true");
                    C1730Oy.a("captcha.backgrounded", EnumC0936Eu.d, OW0.b(new Pair("flow", c2316Wk.a)));
                }
                return Unit.a;
            case 2:
                C0718Bz0 c0718Bz0 = (C0718Bz0) this.e;
                C1491Lx0 c1491Lx0 = c0718Bz0.p;
                if (c1491Lx0 != null) {
                    ReporterApi.a.b(c0718Bz0.j, EnumC5028l80.y0, new C1510Md1(c1491Lx0.e), null, 12);
                }
                InterfaceC1962Rx0 interfaceC1962Rx0 = c0718Bz0.h;
                interfaceC1962Rx0.b();
                interfaceC1962Rx0.g();
                return Unit.a;
            case 3:
                return ((InstructionFragment) this.e).k;
            case 4:
                C2533Yv1 c2533Yv1 = ((C5835oz0) this.e).a;
                return WE.f(c2533Yv1.C, c2533Yv1.A, c2533Yv1.y);
            case 5:
                ActivityC6781tV0 activityC6781tV0 = (ActivityC6781tV0) this.e;
                C3086c7 c3086c7 = activityC6781tV0.H;
                Intrinsics.checkNotNull(c3086c7);
                c3086c7.h.setBackground(C6333rM.getDrawable(activityC6781tV0, R.color.background));
                return Unit.a;
            case 6:
                ((WebViewFileChooserUseCaseBase) this.e).e(true);
                return Unit.a;
            default:
                return AFd1jSDK.d((AFd1jSDK) this.e);
        }
    }
}
