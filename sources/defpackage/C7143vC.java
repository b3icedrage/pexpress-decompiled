package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: vC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7143vC {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static AnimatorSet a(@NonNull InterfaceC7564xC interfaceC7564xC, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC7564xC, InterfaceC7564xC.b.a, InterfaceC7564xC.a.b, new InterfaceC7564xC.d(f, f2, f3));
        InterfaceC7564xC.d revealInfo = interfaceC7564xC.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC7564xC, (int) f, (int) f2, revealInfo.c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
