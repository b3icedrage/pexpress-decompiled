package defpackage;

import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.impl.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeatImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class C3 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 1:
                return (ChangeLanguageFragmentRepeatImpl) this.e;
            case 2:
                return (RobotCommonFragment) this.e;
            default:
                return (Wd2) ((B3) this.e).invoke();
        }
    }
}
