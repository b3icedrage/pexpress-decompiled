package defpackage;

import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import com.base.feature.robot.robot.common_action.RobotCommonActionPart;
import com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2405Xf implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2405Xf(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C7946z2) this.e).invoke();
                return Unit.a;
            case 1:
                ((C6693t4) this.e).invoke();
                return Unit.a;
            case 2:
                IM0 im0 = (IM0) this.e;
                KN kn = im0.h;
                if (kn != null) {
                    C5189lv.k(kn, C6266r20.c, new FM0(im0, null), 2);
                    return Unit.a;
                }
                Intrinsics.l("scope");
                throw null;
            case 3:
                InterfaceC6168qa1.a aVar = ((C6797ta1) this.e).c;
                if (aVar != null) {
                    return aVar.a;
                }
                return null;
            case 4:
                PlatformFragmentBase platformFragmentBase = (PlatformFragmentBase) this.e;
                C5189lv.k(C7652xe.f(platformFragmentBase), null, new C4921ke1(platformFragmentBase, null), 3);
                return Unit.a;
            case 5:
                return ((RobotCommonActionPart) this.e).l;
            case 6:
                C4617jA1 c4617jA1 = (C4617jA1) this.e;
                KN knInvoke = c4617jA1.A.invoke();
                if (knInvoke != null) {
                    C5189lv.k(knInvoke, null, new C2545Yz1(c4617jA1, null), 3);
                }
                return Unit.a;
            case 7:
                return ((StrategySelectionBottomSheetDialogFragment) this.e).k;
            default:
                return ((StubGameFragment) this.e).l;
        }
    }
}
