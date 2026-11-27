package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.BX;
import defpackage.C0648Bc;
import defpackage.C1089Gt;
import defpackage.C1503Mb0;
import defpackage.C5557nf0;
import defpackage.C5977pf0;
import defpackage.C6665sw0;
import defpackage.C6683t11;
import defpackage.C7013uc;
import defpackage.C7080uu1;
import defpackage.C7103v11;
import defpackage.IP1;
import defpackage.InterfaceC5280mK1;
import defpackage.NX0;
import defpackage.RJ1;
import defpackage.RX0;
import defpackage.U0;
import defpackage.ViewTreeObserverOnPreDrawListenerC5767of0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final C1503Mb0 C = C7013uc.c;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] L = {android.R.attr.state_enabled};
    public static final int[] M = new int[0];
    public ViewTreeObserverOnPreDrawListenerC5767of0 B;
    public RJ1 a;
    public NX0 b;
    public Drawable c;
    public C1089Gt d;
    public LayerDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public Animator l;
    public C6683t11 m;
    public C6683t11 n;
    public float o;
    public int q;
    public ArrayList<Animator.AnimatorListener> s;
    public ArrayList<Animator.AnimatorListener> t;
    public ArrayList<f> u;
    public final FloatingActionButton v;
    public final FloatingActionButton.b w;
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    public class a extends RX0 {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            b.this.p = f;
            float[] fArr = this.a;
            matrix.getValues(fArr);
            float[] fArr2 = this.b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = BX.a(f2, f3, f, f3);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    public class C0311b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ Matrix l;

        public C0311b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.d = f;
            this.e = f2;
            this.g = f3;
            this.h = f4;
            this.i = f5;
            this.j = f6;
            this.k = f7;
            this.l = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b bVar = b.this;
            bVar.v.setAlpha(C7013uc.b(this.d, this.e, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = bVar.v;
            float f = this.g;
            float f2 = this.h;
            floatingActionButton.setScaleX(C7013uc.a(f, f2, fFloatValue));
            bVar.v.setScaleY(C7013uc.a(this.i, f2, fFloatValue));
            float f3 = this.j;
            float f4 = this.k;
            bVar.p = C7013uc.a(f3, f4, fFloatValue);
            float fA = C7013uc.a(f3, f4, fFloatValue);
            Matrix matrix = this.l;
            bVar.a(fA, matrix);
            bVar.v.setImageMatrix(matrix);
        }
    }

    public class c extends h {
        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return 0.0f;
        }
    }

    public class d extends h {
        public final /* synthetic */ C5977pf0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5977pf0 c5977pf0) {
            super(c5977pf0);
            this.i = c5977pf0;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            C5977pf0 c5977pf0 = this.i;
            return c5977pf0.h + c5977pf0.i;
        }
    }

    public class e extends h {
        public final /* synthetic */ C5977pf0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C5977pf0 c5977pf0) {
            super(c5977pf0);
            this.i = c5977pf0;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            C5977pf0 c5977pf0 = this.i;
            return c5977pf0.h + c5977pf0.j;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public class g extends h {
        public final /* synthetic */ C5977pf0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C5977pf0 c5977pf0) {
            super(c5977pf0);
            this.i = c5977pf0;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return this.i.h;
        }
    }

    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean d;
        public float e;
        public float g;
        public final /* synthetic */ C5977pf0 h;

        public h(C5977pf0 c5977pf0) {
            this.h = c5977pf0;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = (int) this.g;
            NX0 nx0 = this.h.b;
            if (nx0 != null) {
                nx0.k(f);
            }
            this.d = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z = this.d;
            C5977pf0 c5977pf0 = this.h;
            if (!z) {
                NX0 nx0 = c5977pf0.b;
                this.e = nx0 == null ? 0.0f : nx0.d.m;
                this.g = a();
                this.d = true;
            }
            float f = this.e;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.g - f)) + f);
            NX0 nx1 = c5977pf0.b;
            if (nx1 != null) {
                nx1.k(animatedFraction);
            }
        }
    }

    public b(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.v = floatingActionButton;
        this.w = bVar;
        IP1 ip1 = new IP1();
        C5977pf0 c5977pf0 = (C5977pf0) this;
        ip1.a(H, d(new e(c5977pf0)));
        ip1.a(I, d(new d(c5977pf0)));
        ip1.a(J, d(new d(c5977pf0)));
        ip1.a(K, d(new d(c5977pf0)));
        ip1.a(L, d(new g(c5977pf0)));
        ip1.a(M, d(new c(c5977pf0)));
        this.o = floatingActionButton.getRotation();
    }

    @NonNull
    public static ValueAnimator d(@NonNull h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f2, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        RectF rectF = this.y;
        RectF rectF2 = this.z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.q;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.q / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    @NonNull
    public final AnimatorSet b(@NonNull C6683t11 c6683t11, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c6683t11.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c6683t11.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            C5557nf0 c5557nf0 = new C5557nf0();
            c5557nf0.a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(c5557nf0);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c6683t11.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            C5557nf0 c5557nf1 = new C5557nf0();
            c5557nf1.a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(c5557nf1);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f4, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C6665sw0(), new a(), new Matrix(matrix));
        c6683t11.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0648Bc.i(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.v;
        valueAnimatorOfFloat.addUpdateListener(new C0311b(floatingActionButton.getAlpha(), f2, floatingActionButton.getScaleX(), f3, floatingActionButton.getScaleY(), this.p, f4, new Matrix(this.A)));
        arrayList.add(valueAnimatorOfFloat);
        C0648Bc.i(animatorSet, arrayList);
        animatorSet.setDuration(C7103v11.c(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C7103v11.d(floatingActionButton.getContext(), i2, C7013uc.b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(@NonNull Rect rect) {
        int sizeDimension = this.f ? (this.k - this.v.getSizeDimension()) / 2 : 0;
        float fE = this.g ? e() + this.j : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fE));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f2, float f3, float f4) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            A30.a.h(drawable, C7080uu1.c(colorStateList));
        }
    }

    public final void n(@NonNull RJ1 rj1) {
        this.a = rj1;
        NX0 nx0 = this.b;
        if (nx0 != null) {
            nx0.setShapeAppearanceModel(rj1);
        }
        Object obj = this.c;
        if (obj instanceof InterfaceC5280mK1) {
            ((InterfaceC5280mK1) obj).setShapeAppearanceModel(rj1);
        }
        C1089Gt c1089Gt = this.d;
        if (c1089Gt != null) {
            c1089Gt.o = rj1;
            c1089Gt.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.x;
        f(rect);
        U0.f(this.e, "Didn't initialize content background");
        boolean zO = o();
        FloatingActionButton.b bVar = this.w;
        if (zO) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.p.set(i, i2, i3, i4);
        int i5 = floatingActionButton.m;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
