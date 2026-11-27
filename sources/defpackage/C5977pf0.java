package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.b;
import com.pexpress.tool.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: pf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5977pf0 extends b {
    public StateListAnimator N;

    /* JADX INFO: renamed from: pf0$a */
    public static class a extends NX0 {
        @Override // defpackage.NX0, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final float e() {
        return this.v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void f(@NonNull Rect rect) {
        if (FloatingActionButton.this.o) {
            super.f(rect);
            return;
        }
        if (this.f) {
            FloatingActionButton floatingActionButton = this.v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.k;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        RJ1 rj1 = this.a;
        rj1.getClass();
        a aVar = new a(rj1);
        this.b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        NX0 nx0 = this.b;
        FloatingActionButton floatingActionButton = this.v;
        nx0.j(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            RJ1 rj2 = this.a;
            rj2.getClass();
            C1089Gt c1089Gt = new C1089Gt(rj2);
            int color = C6333rM.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = C6333rM.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = C6333rM.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = C6333rM.getColor(context, R.color.design_fab_stroke_end_outer_color);
            c1089Gt.i = color;
            c1089Gt.j = color2;
            c1089Gt.k = color3;
            c1089Gt.l = color4;
            float f = i;
            if (c1089Gt.h != f) {
                c1089Gt.h = f;
                c1089Gt.b.setStrokeWidth(f * 1.3333f);
                c1089Gt.n = true;
                c1089Gt.invalidateSelf();
            }
            if (colorStateList != null) {
                c1089Gt.m = colorStateList.getColorForState(c1089Gt.getState(), c1089Gt.m);
            }
            c1089Gt.p = colorStateList;
            c1089Gt.n = true;
            c1089Gt.invalidateSelf();
            this.d = c1089Gt;
            C1089Gt c1089Gt2 = this.d;
            c1089Gt2.getClass();
            NX0 nx1 = this.b;
            nx1.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{c1089Gt2, nx1});
        } else {
            this.d = null;
            layerDrawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C7080uu1.c(colorStateList2), layerDrawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void i() {
        q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.floatingactionbutton.b
    public final void k(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.v;
        if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.H, r(f, f3));
            stateListAnimator.addState(b.I, r(f, f2));
            stateListAnimator.addState(b.J, r(f, f2));
            stateListAnimator.addState(b.K, r(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.C);
            stateListAnimator.addState(b.L, animatorSet);
            stateListAnimator.addState(b.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C7080uu1.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final boolean o() {
        if (FloatingActionButton.this.o) {
            return true;
        }
        return this.f && this.v.getSizeDimension() < this.k;
    }

    @NonNull
    public final AnimatorSet r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void j(int[] iArr) {
    }
}
