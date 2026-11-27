package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RM0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ LaunchAppFragmentImpl d;

    public RM0(LaunchAppFragmentImpl launchAppFragmentImpl) {
        this.d = launchAppFragmentImpl;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        LaunchAppFragmentImpl launchAppFragmentImpl = this.d;
        TextView textViewS = launchAppFragmentImpl.o.S();
        if (textViewS != null) {
            textViewS.setText(iIntValue + "%");
        }
        launchAppFragmentImpl.r = iIntValue;
    }
}
