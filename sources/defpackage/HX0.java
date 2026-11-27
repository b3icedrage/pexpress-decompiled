package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class HX0 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;

    @NonNull
    public final MaterialCardView a;

    @NonNull
    public final NX0 c;

    @NonNull
    public final NX0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public RJ1 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public NX0 q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;

    @NonNull
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public HX0(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        NX0 nx0 = new NX0(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = nx0;
        nx0.j(materialCardView.getContext());
        nx0.n();
        RJ1.a aVarE = nx0.d.a.e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C2083Tl1.g, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            aVarE.e = new A(dimension);
            aVarE.f = new A(dimension);
            aVarE.g = new A(dimension);
            aVarE.h = new A(dimension);
        }
        this.d = new NX0();
        h(aVarE.a());
        this.u = C7103v11.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, C7013uc.a);
        this.v = C7103v11.c(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = C7103v11.c(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(C6561sS c6561sS, float f) {
        if (c6561sS instanceof C3522eB1) {
            return (float) ((1.0d - y) * ((double) f));
        }
        if (c6561sS instanceof TR) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        C6561sS c6561sS = this.m.a;
        NX0 nx0 = this.c;
        return Math.max(Math.max(b(c6561sS, nx0.h()), b(this.m.b, nx0.d.a.f.a(nx0.g()))), Math.max(b(this.m.c, nx0.d.a.g.a(nx0.g())), b(this.m.d, nx0.d.a.h.a(nx0.g()))));
    }

    @NonNull
    public final LayerDrawable c() {
        if (this.o == null) {
            int[] iArr = C7080uu1.a;
            this.q = new NX0(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    @NonNull
    public final GX0 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new GX0(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i7 = (i5 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.e) - this.f) - iCeil : this.e;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.p.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: FX0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    HX0 hx0 = this.d;
                    hx0.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    hx0.j.setAlpha((int) (255.0f * fFloatValue));
                    hx0.x = fFloatValue;
                }
            });
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            A30.a.h(drawableMutate, this.l);
            f(this.a.n, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(@NonNull RJ1 rj1) {
        this.m = rj1;
        NX0 nx0 = this.c;
        nx0.setShapeAppearanceModel(rj1);
        nx0.z = !nx0.d.a.d(nx0.g());
        NX0 nx1 = this.d;
        if (nx1 != null) {
            nx1.setShapeAppearanceModel(rj1);
        }
        NX0 nx2 = this.q;
        if (nx2 != null) {
            nx2.setShapeAppearanceModel(rj1);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        NX0 nx0 = this.c;
        return nx0.d.a.d(nx0.g()) && materialCardView.getUseCompatPadding();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final void j() {
        boolean z2;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getPreventCornerOverlap()) {
            NX0 nx0 = this.c;
            if (nx0.d.a.d(nx0.g())) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        float cardViewRadius = 0.0f;
        float fA = (z2 || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.g.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.k.s(materialCardView.i);
    }

    public final void k() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
