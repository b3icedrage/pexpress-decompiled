package defpackage;

import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Sy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2043Sy0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C2043Sy0(int i, OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = i;
        this.b = ow;
        this.c = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment((Sd2) ((OW) this.b).get(), (AbstractC5603ns) this.c.get(), (InterfaceC3902g10) ((InterfaceC1454Lk1) this.d).get());
            case 1:
                return new RobotRiskManagementPart((Sd2) ((OW) this.b).get(), new C3481e1(), (InterfaceC1292Ji1) this.c.get(), (InterfaceC1918Ri1) this.d.get());
            default:
                C7039ui1 impl = (C7039ui1) ((InterfaceC1454Lk1) this.d).get();
                C4923kf appData = (C4923kf) this.c.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.b.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "profile_updater", new C1523Mi(appData, 7), telemetry);
        }
    }

    public C2043Sy0(C7279vr c7279vr, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 2;
        this.d = interfaceC1454Lk1;
        this.c = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
    }
}
