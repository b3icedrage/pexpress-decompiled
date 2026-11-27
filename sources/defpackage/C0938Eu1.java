package defpackage;

import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Eu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0938Eu1 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0938Eu1(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (RobotAccountSelectionPart) this.e;
            case 1:
                return (Wd2) ((T4) this.e).invoke();
            default:
                return (Wd2) ((T4) this.e).invoke();
        }
    }
}
