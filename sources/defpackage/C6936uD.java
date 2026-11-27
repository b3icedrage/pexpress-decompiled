package defpackage;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6936uD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6936uD(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.d) {
            case 0:
                C7567xD c7567xD = (C7567xD) this.e;
                c7567xD.getClass();
                c7567xD.d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((OQ) this.e).j(((Float) animatedValue).floatValue());
                break;
        }
    }
}
