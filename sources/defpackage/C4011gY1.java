package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: gY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4011gY1 extends E42 {

    /* JADX INFO: renamed from: gY1$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView d;

        public a(TextView textView) {
            this.d = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.d;
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
        }
    }

    @Override // defpackage.E42
    public final void e(@NonNull Q42 q42) {
        View view = q42.b;
        if (view instanceof TextView) {
            q42.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.E42
    public final void i(@NonNull Q42 q42) {
        View view = q42.b;
        if (view instanceof TextView) {
            q42.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.E42
    public final Animator m(@NonNull ViewGroup viewGroup, Q42 q42, Q42 q43) {
        if (q42 == null || q43 == null || !(q42.b instanceof TextView)) {
            return null;
        }
        View view = q43.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = q42.a;
        HashMap map2 = q43.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
