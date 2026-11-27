package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: xD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7567xD extends K60 {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;

    @NonNull
    public final TimeInterpolator h;
    public EditText i;
    public final ViewOnClickListenerC6903u4 j;
    public final ViewOnFocusChangeListenerC6726tD k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v1, types: [tD] */
    public C7567xD(@NonNull a aVar) {
        super(aVar);
        this.j = new ViewOnClickListenerC6903u4(this, 2);
        this.k = new View.OnFocusChangeListener() { // from class: tD
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C7567xD c7567xD = this.a;
                c7567xD.t(c7567xD.u());
            }
        };
        this.e = C7103v11.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = C7103v11.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = C7103v11.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, C7013uc.a);
        this.h = C7103v11.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7013uc.d);
    }

    @Override // defpackage.K60
    public final void a() {
        if (this.b.t != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.K60
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.K60
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.K60
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.K60
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.K60
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.K60
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.K60
    public final void p(boolean z) {
        if (this.b.t == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.K60
    public final void r() {
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wD
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7567xD c7567xD = this.d;
                c7567xD.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c7567xD.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        valueAnimatorOfFloat2.setDuration(i2);
        valueAnimatorOfFloat2.addUpdateListener(new C6936uD(this, i));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new C1478Lt(this, 1));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new C6936uD(this, i));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C2018Sq(this, 2));
    }

    @Override // defpackage.K60
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC7146vD(this, 0));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
