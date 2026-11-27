package defpackage;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7944z11 implements Animator.AnimatorListener {
    public final /* synthetic */ B11 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ OQ g;

    public C7944z11(B11 b11, long j, OQ oq) {
        this.d = b11;
        this.e = j;
        this.g = oq;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.d.b = false;
        OQ oq = this.g;
        float visibleXRange = oq.getVisibleXRange();
        float f = this.e * 2;
        if (visibleXRange == f) {
            return;
        }
        oq.l(f, f);
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
