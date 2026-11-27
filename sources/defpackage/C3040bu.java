package defpackage;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3040bu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior d;

    public C3040bu(BottomSheetBehavior bottomSheetBehavior) {
        this.d = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        NX0 nx0 = this.d.i;
        if (nx0 != null) {
            nx0.m(fFloatValue);
        }
    }
}
