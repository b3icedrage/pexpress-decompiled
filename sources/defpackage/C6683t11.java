package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.ArrayList;

/* JADX INFO: renamed from: t11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6683t11 {
    public final C2703aM1<String, C6893u11> a = new C2703aM1<>();
    public final C2703aM1<String, PropertyValuesHolder[]> b = new C2703aM1<>();

    public static C6683t11 a(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static C6683t11 b(@NonNull Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            b0.f("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @NonNull
    public static C6683t11 c(@NonNull ArrayList arrayList) {
        C6683t11 c6683t11 = new C6683t11();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c6683t11.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C7013uc.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C7013uc.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C7013uc.d;
            }
            C6893u11 c6893u11 = new C6893u11();
            c6893u11.d = 0;
            c6893u11.e = 1;
            c6893u11.a = startDelay;
            c6893u11.b = duration;
            c6893u11.c = interpolator;
            c6893u11.d = objectAnimator.getRepeatCount();
            c6893u11.e = objectAnimator.getRepeatMode();
            c6683t11.a.put(propertyName, c6893u11);
        }
        return c6683t11;
    }

    public final C6893u11 d(String str) {
        C2703aM1<String, C6893u11> c2703aM1 = this.a;
        if (c2703aM1.getOrDefault(str, null) != null) {
            return c2703aM1.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6683t11) {
            return this.a.equals(((C6683t11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "\n" + C6683t11.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
