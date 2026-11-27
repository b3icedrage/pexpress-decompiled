package defpackage;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Qe2 extends Pe2 {
    @Override // defpackage.C3057c
    public final float i(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.C3057c
    public final void p(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.Pe2, defpackage.C3057c
    public final void q(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.Oe2
    public final void s(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.Oe2
    public final void t(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.Oe2
    public final void u(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
