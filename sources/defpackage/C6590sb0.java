package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6590sb0 extends Ze2 {

    /* JADX INFO: renamed from: sb0$a */
    public static class a extends AnimatorListenerAdapter {
        public final View d;
        public boolean e = false;

        public a(View view) {
            this.d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Pe2 pe2 = He2.a;
            View view = this.d;
            pe2.p(view, 1.0f);
            if (this.e) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            View view = this.d;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.e = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C6590sb0(int i) {
        this.B = i;
    }

    public final ObjectAnimator O(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        He2.a.p(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, He2.b, f2);
        objectAnimatorOfFloat.addListener(new a(view));
        a(new C6380rb0(view));
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.E42
    public final void i(@NonNull Q42 q42) {
        Ze2.M(q42);
        q42.a.put("android:fade:transitionAlpha", Float.valueOf(He2.a.i(q42.b)));
    }
}
