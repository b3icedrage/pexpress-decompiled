package defpackage;

import android.graphics.Matrix;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import com.impl.feature.platform.screens.deposit.DepositFragmentImpl;
import io.sentry.android.replay.screenshot.e;
import io.sentry.android.replay.u;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class JX extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JX(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (DepositFragmentImpl) this.e;
            case 1:
                return (Wd2) ((C1591Ne1) this.e).invoke();
            case 2:
                return (Wd2) ((C1591Ne1) this.e).invoke();
            case 3:
                return (StubResultsFragment) this.e;
            case 4:
                return (Wd2) ((C1591Ne1) this.e).invoke();
            default:
                Matrix matrix = new Matrix();
                u uVar = ((e) this.e).c;
                matrix.preScale(uVar.c, uVar.d);
                return matrix;
        }
    }
}
