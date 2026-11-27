package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7644xc {

    /* JADX INFO: renamed from: xc$a */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View d;

        public a(View view) {
            this.d = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation, boolean z) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.d.setVisibility(0);
        }
    }

    public static void a(View animateVisibility, boolean z) {
        Resources resources = animateVisibility.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        long jG = g(resources);
        Intrinsics.checkNotNullParameter(animateVisibility, "$this$animateVisibility");
        if (z) {
            e(animateVisibility, jG);
        } else {
            c(4, jG, animateVisibility);
        }
    }

    public static final void b(@NotNull View collapse, boolean z, @Nullable Integer num, long j) {
        Intrinsics.checkNotNullParameter(collapse, "$this$animateVisibleRoll");
        Class cls = Integer.TYPE;
        if (!z) {
            Intrinsics.checkNotNullParameter(collapse, "$this$collapse");
            if (collapse.getVisibility() == 8) {
                return;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) ObjectAnimator.ofInt(collapse, new C5802oo0(cls, "height"), collapse.getMeasuredHeight(), 0).setDuration(b.l(j));
            ObjectAnimator objectAnimator2 = (ObjectAnimator) ObjectAnimator.ofFloat(collapse, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(b.l(j));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimator2, objectAnimator);
            animatorSet.start();
            return;
        }
        Intrinsics.checkNotNullParameter(collapse, "$this$expand");
        Object parent = collapse.getParent();
        Intrinsics.c(parent, "null cannot be cast to non-null type android.view.View");
        collapse.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iIntValue = num != null ? num.intValue() : collapse.getMeasuredHeight();
        if (collapse.getVisibility() == 0 && collapse.getAlpha() == 1.0f && iIntValue == collapse.getLayoutParams().height) {
            return;
        }
        collapse.getLayoutParams().height = 1;
        collapse.setAlpha(0.0f);
        collapse.setVisibility(0);
        ObjectAnimator objectAnimator3 = (ObjectAnimator) ObjectAnimator.ofInt(collapse, new C6012po0(cls, "height"), 1, iIntValue).setDuration(b.l(j));
        Intrinsics.checkNotNull(objectAnimator3);
        objectAnimator3.addListener(new C7434wc(collapse, num));
        ObjectAnimator objectAnimator4 = (ObjectAnimator) ObjectAnimator.ofFloat(collapse, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(b.l(j));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(objectAnimator3, objectAnimator4);
        animatorSet2.start();
    }

    @NotNull
    public static final ViewPropertyAnimator c(int i, long j, @NotNull View fadeHide) {
        Intrinsics.checkNotNullParameter(fadeHide, "$this$fadeHide");
        ViewPropertyAnimator viewPropertyAnimatorAlpha = fadeHide.animate().alpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha, "alpha(...)");
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = j(viewPropertyAnimatorAlpha, j).withEndAction(new RunnableC7223vc(fadeHide, i, 0));
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    public static /* synthetic */ void d(int i, long j, View view) {
        if ((i & 2) != 0) {
            Resources resources = view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            j = g(resources);
        }
        c(8, j, view);
    }

    public static final void e(@NotNull View fadeShow, long j) {
        Intrinsics.checkNotNullParameter(fadeShow, "$this$fadeShow");
        if (fadeShow.getVisibility() != 0) {
            fadeShow.setAlpha(0.0f);
            fadeShow.setVisibility(0);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = fadeShow.animate().alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha, "alpha(...)");
        j(viewPropertyAnimatorAlpha, j).setListener(new a(fadeShow)).start();
    }

    public static /* synthetic */ void f(View view) {
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        e(view, g(resources));
    }

    public static final long g(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        b.a aVar = b.e;
        return c.g(resources.getInteger(R.integer.config_longAnimTime), R40.MILLISECONDS);
    }

    public static final double h(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Double percentage = Double.valueOf(number.doubleValue());
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        double dDoubleValue = percentage.doubleValue();
        if (0.0d > dDoubleValue || dDoubleValue > 100.0d) {
            throw new IllegalArgumentException("value should be in range from 0 to 100");
        }
        return dDoubleValue;
    }

    public static final long i(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        b.a aVar = b.e;
        return c.g(resources.getInteger(R.integer.config_shortAnimTime), R40.MILLISECONDS);
    }

    @NotNull
    public static final ViewPropertyAnimator j(@NotNull ViewPropertyAnimator setDuration, long j) {
        Intrinsics.checkNotNullParameter(setDuration, "$this$setDuration");
        ViewPropertyAnimator duration = setDuration.setDuration(b.l(j));
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    @Nullable
    public static final Object k(@NotNull ImageView imageView, @NotNull PE1.a frame) {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        Object drawable = imageView.getDrawable();
        InterfaceC1817Qb interfaceC1817Qb = drawable instanceof InterfaceC1817Qb ? (InterfaceC1817Qb) drawable : null;
        if (interfaceC1817Qb == null) {
            Unit unit = Unit.a;
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                c6251qy.resumeWith(unit);
            } catch (IllegalStateException unused) {
            }
        } else {
            interfaceC1817Qb.c(new C8064zc(interfaceC1817Qb, c6251qy));
            c6251qy.u(new C7854yc(interfaceC1817Qb, 0));
            interfaceC1817Qb.start();
        }
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }
}
