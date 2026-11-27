package defpackage;

import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0906Ek implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C0906Ek(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0828Dk((EK1) ((InterfaceC1454Lk1) this.b).get());
            case 1:
                return new F91((Set) ((C4176hJ1) this.b).get());
            case 2:
                return new RobotIndicatorPart((Sd2) ((OW) this.b).get());
            case 3:
                Map statesMap = ((IW0) this.b).a;
                Intrinsics.checkNotNullParameter(statesMap, "statesMap");
                return new BI1(statesMap);
            default:
                return new M52((InterfaceC1442Lg1) this.b.get());
        }
    }

    public C0906Ek(C3476e c3476e, IW0 iw0) {
        this.a = 3;
        this.b = iw0;
    }
}
