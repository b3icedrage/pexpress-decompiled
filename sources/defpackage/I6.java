package defpackage;

import android.graphics.Matrix;
import androidx.lifecycle.b;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import io.sentry.android.replay.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class I6 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I6(Object obj, int i) {
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
                ((b) this.e).m = null;
                return Unit.a;
            case 2:
                return (Wd2) ((H6) this.e).invoke();
            case 3:
                return (Wd2) ((H6) this.e).invoke();
            case 4:
                return (StrategyInstructionsBottomSheetDialogFragment) this.e;
            case 5:
                return (SupportPopularQuestionsPartBase) this.e;
            case 6:
                return (Wd2) ((H6) this.e).invoke();
            default:
                Matrix matrix = new Matrix();
                u uVar = ((io.sentry.android.replay.screenshot.b) this.e).d;
                matrix.preScale(uVar.c, uVar.d);
                return matrix;
        }
    }
}
