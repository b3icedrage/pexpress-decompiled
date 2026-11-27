package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import com.pexpress.tool.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4802k40 extends K60 {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final B9 i;
    public final ViewOnFocusChangeListenerC4334i40 j;
    public final C8100zl k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v1, types: [i40] */
    public C4802k40(@NonNull a aVar) {
        super(aVar);
        int i = 1;
        this.i = new B9(this, i);
        this.j = new View.OnFocusChangeListener() { // from class: i40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C4802k40 c4802k40 = this.a;
                c4802k40.l = z;
                c4802k40.q();
                if (z) {
                    return;
                }
                c4802k40.t(false);
                c4802k40.m = false;
            }
        };
        this.k = new C8100zl(this, i);
        this.o = Long.MAX_VALUE;
        this.f = C7103v11.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = C7103v11.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = C7103v11.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, C7013uc.a);
    }

    @Override // defpackage.K60
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && C1952Ru.l(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: j40
            @Override // java.lang.Runnable
            public final void run() {
                C4802k40 c4802k40 = this.d;
                boolean zIsPopupShowing = c4802k40.h.isPopupShowing();
                c4802k40.t(zIsPopupShowing);
                c4802k40.m = zIsPopupShowing;
            }
        });
    }

    @Override // defpackage.K60
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.K60
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.K60
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.K60
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.K60
    public final C8100zl h() {
        return this.k;
    }

    @Override // defpackage.K60
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.K60
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.K60
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.K60
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: g40
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C4802k40 c4802k40 = this.d;
                c4802k40.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4802k40.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c4802k40.m = false;
                    }
                    c4802k40.u();
                    c4802k40.m = true;
                    c4802k40.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: h40
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4802k40 c4802k40 = this.a;
                c4802k40.m = true;
                c4802k40.o = System.currentTimeMillis();
                c4802k40.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!C1952Ru.l(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.K60
    public final void n(@NonNull C5426n2 c5426n2) {
        if (!C1952Ru.l(this.h)) {
            c5426n2.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c5426n2.a.isShowingHintText() : c5426n2.e(4)) {
            c5426n2.k(null);
        }
    }

    @Override // defpackage.K60
    @SuppressLint({"WrongConstant"})
    public final void o(@NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || C1952Ru.l(this.h)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // defpackage.K60
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4802k40 c4802k40 = this.d;
                c4802k40.getClass();
                c4802k40.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4802k40 c4802k40 = this.d;
                c4802k40.getClass();
                c4802k40.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C2516Yq(this, 1));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.K60
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
