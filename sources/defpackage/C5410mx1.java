package defpackage;

import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: mx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5410mx1 extends C2784ak0 implements Function0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5410mx1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                return Boolean.valueOf(((RobotInvestmentPart) this.e).isResumed());
            default:
                ((InterfaceC1547Mq) this.e).c();
                return Unit.a;
        }
    }
}
