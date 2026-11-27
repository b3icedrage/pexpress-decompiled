package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class IP1 {
    public final ArrayList<b> a = new ArrayList<>();
    public ValueAnimator b = null;
    public final a c = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            IP1 ip1 = IP1.this;
            if (ip1.b == animator) {
                ip1.b = null;
            }
        }
    }

    public static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.c);
        this.a.add(bVar);
    }
}
