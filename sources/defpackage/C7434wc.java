package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7434wc implements Animator.AnimatorListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ Integer e;

    public C7434wc(View view, Integer num) {
        this.d = view;
        this.e = num;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        View view = this.d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = this.e;
        layoutParams.height = num != null ? num.intValue() : -2;
        view.requestLayout();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }
}
