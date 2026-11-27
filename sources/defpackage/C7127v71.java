package defpackage;

import com.base.feature.robot.robot.strategies.RobotStrategiesPart;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: v71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7127v71 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7127v71(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return "Unexpected end of input: yet to parse " + ((C7758y71) this.e).b();
            default:
                return (RobotStrategiesPart) this.e;
        }
    }
}
