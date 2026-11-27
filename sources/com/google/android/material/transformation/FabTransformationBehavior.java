package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pexpress.tool.R;
import defpackage.C0648Bc;
import defpackage.C1874Qu;
import defpackage.C2703aM1;
import defpackage.C4051gj;
import defpackage.C5207m;
import defpackage.C5345me2;
import defpackage.C6683t11;
import defpackage.C6893u11;
import defpackage.C6906u42;
import defpackage.C6933uC;
import defpackage.C7013uc;
import defpackage.C7116v42;
import defpackage.C7143vC;
import defpackage.C7741y30;
import defpackage.Cd2;
import defpackage.InterfaceC7564xC;
import defpackage.YB;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean d;
        public final /* synthetic */ View e;
        public final /* synthetic */ View g;

        public a(boolean z, View view, View view2) {
            this.d = z;
            this.e = view;
            this.g = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.d) {
                return;
            }
            this.e.setVisibility(4);
            View view = this.g;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.d) {
                this.e.setVisibility(0);
                View view = this.g;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {
        public C6683t11 a;
        public C5207m b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    @NonNull
    public static Pair u(float f, float f2, boolean z, @NonNull b bVar) {
        C6893u11 c6893u11D;
        C6893u11 c6893u11D2;
        if (f == 0.0f || f2 == 0.0f) {
            c6893u11D = bVar.a.d("translationXLinear");
            c6893u11D2 = bVar.a.d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            c6893u11D = bVar.a.d("translationXCurveDownwards");
            c6893u11D2 = bVar.a.d("translationYCurveDownwards");
        } else {
            c6893u11D = bVar.a.d("translationXCurveUpwards");
            c6893u11D2 = bVar.a.d("translationYCurveUpwards");
        }
        return new Pair(c6893u11D, c6893u11D2);
    }

    public static float x(@NonNull b bVar, @NonNull C6893u11 c6893u11, float f) {
        long j = c6893u11.a;
        C6893u11 c6893u11D = bVar.a.d("expansion");
        return C7013uc.a(f, 0.0f, c6893u11.b().getInterpolation((((c6893u11D.a + c6893u11D.b) + 17) - j) / c6893u11.b));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(@NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0372  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public final AnimatorSet t(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        AnimatorSet animatorSetA;
        InterfaceC7564xC interfaceC7564xC;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        b bVarZ = z(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        float fI = Cd2.d.i(view2) - Cd2.d.i(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        bVarZ.a.d("elevation").a(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat);
        RectF rectF = this.d;
        float fV = v(view, view2, bVarZ.b);
        float fW = w(view, view2, bVarZ.b);
        Pair pairU = u(fV, fW, z, bVarZ);
        C6893u11 c6893u11 = (C6893u11) pairU.first;
        C6893u11 c6893u12 = (C6893u11) pairU.second;
        RectF rectF2 = this.e;
        Rect rect = this.c;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-fV);
                view2.setTranslationY(-fW);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fX = x(bVarZ, c6893u11, -fV);
            float fX2 = x(bVarZ, c6893u12, -fW);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            y(view2, rectF2);
            rectF2.offset(fX, fX2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fV);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fW);
        }
        c6893u11.a(objectAnimatorOfFloat2);
        c6893u12.a(objectAnimatorOfFloat3);
        arrayList2.add(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fV2 = v(view, view2, bVarZ.b);
        float fW2 = w(view, view2, bVarZ.b);
        Pair pairU2 = u(fV2, fW2, z, bVarZ);
        C6893u11 c6893u13 = (C6893u11) pairU2.first;
        C6893u11 c6893u14 = (C6893u11) pairU2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fV2 = this.g;
        }
        float f2 = fW2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fV2);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            f2 = this.h;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2);
        c6893u13.a(objectAnimatorOfFloat7);
        c6893u14.a(objectAnimatorOfFloat8);
        arrayList2.add(objectAnimatorOfFloat7);
        arrayList2.add(objectAnimatorOfFloat8);
        boolean z3 = view2 instanceof InterfaceC7564xC;
        if (z3 && (view instanceof ImageView)) {
            InterfaceC7564xC interfaceC7564xC2 = (InterfaceC7564xC) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList3;
            } else {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, C7741y30.a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, C7741y30.a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                bVarZ.a.d("iconFade").a(objectAnimatorOfInt2);
                arrayList2.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.b bVar = new com.google.android.material.transformation.b(interfaceC7564xC2, drawable);
                arrayList = arrayList3;
                arrayList.add(bVar);
            }
        } else {
            arrayList = arrayList3;
        }
        if (z3) {
            InterfaceC7564xC interfaceC7564xC3 = (InterfaceC7564xC) view2;
            C5207m c5207m = bVarZ.b;
            y(view, rectF);
            rectF.offset(this.g, this.h);
            y(view2, rectF2);
            rectF2.offset(-v(view, view2, c5207m), f);
            float fCenterX = rectF.centerX() - rectF2.left;
            C5207m c5207m2 = bVarZ.b;
            y(view, rectF);
            rectF.offset(this.g, this.h);
            y(view2, rectF2);
            rectF2.offset(0.0f, -w(view, view2, c5207m2));
            float fCenterY = rectF.centerY() - rectF2.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (floatingActionButton.isLaidOut()) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.k(rect);
            }
            float fWidth2 = rect.width() / 2.0f;
            C6893u11 c6893u11D = bVarZ.a.d("expansion");
            if (z) {
                if (!z2) {
                    interfaceC7564xC3.setRevealInfo(new InterfaceC7564xC.d(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = interfaceC7564xC3.getRevealInfo().c;
                }
                float fL = C1874Qu.l(fCenterX, fCenterY, 0.0f, 0.0f);
                float fL2 = C1874Qu.l(fCenterX, fCenterY, fWidth, 0.0f);
                float fL3 = C1874Qu.l(fCenterX, fCenterY, fWidth, fHeight);
                float fL4 = C1874Qu.l(fCenterX, fCenterY, 0.0f, fHeight);
                if (fL > fL2 && fL > fL3 && fL > fL4) {
                    fL3 = fL;
                } else if (fL2 > fL3 && fL2 > fL4) {
                    fL3 = fL2;
                } else if (fL3 <= fL4) {
                    fL3 = fL4;
                }
                animatorSetA = C7143vC.a(interfaceC7564xC3, fCenterX, fCenterY, fL3);
                animatorSetA.addListener(new c(interfaceC7564xC3));
                long j = c6893u11D.a;
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList2.add(animatorCreateCircularReveal);
                }
                interfaceC7564xC = interfaceC7564xC3;
            } else {
                float f3 = interfaceC7564xC3.getRevealInfo().c;
                animatorSetA = C7143vC.a(interfaceC7564xC3, fCenterX, fCenterY, fWidth2);
                long j2 = c6893u11D.a;
                int i4 = (int) fCenterX;
                int i5 = (int) fCenterY;
                InterfaceC7564xC interfaceC7564xC4 = interfaceC7564xC3;
                long jMax = 0;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f3, f3);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                C2703aM1<String, C6893u11> c2703aM1 = bVarZ.a.a;
                int i6 = 0;
                for (int i7 = c2703aM1.g; i6 < i7; i7 = i7) {
                    C6893u11 c6893u11M = c2703aM1.m(i6);
                    jMax = Math.max(jMax, c6893u11M.a + c6893u11M.b);
                    i6++;
                    interfaceC7564xC4 = interfaceC7564xC4;
                }
                interfaceC7564xC = interfaceC7564xC4;
                long j3 = c6893u11D.a + c6893u11D.b;
                if (j3 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j3);
                    animatorCreateCircularReveal3.setDuration(jMax - j3);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
            }
            c6893u11D.a(animatorSetA);
            arrayList2.add(animatorSetA);
            arrayList.add(new C6933uC(interfaceC7564xC));
        }
        if (z3) {
            InterfaceC7564xC interfaceC7564xC5 = (InterfaceC7564xC) view2;
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            ColorStateList colorStateListG = Cd2.d.g(view);
            int colorForState = colorStateListG != null ? colorStateListG.getColorForState(view.getDrawableState(), colorStateListG.getDefaultColor()) : 0;
            int i8 = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    interfaceC7564xC5.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC7564xC5, InterfaceC7564xC.c.a, i8);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC7564xC5, InterfaceC7564xC.c.a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(C4051gj.a);
            bVarZ.a.d("color").a(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        }
        if (view2 instanceof ViewGroup) {
            boolean z4 = view2 instanceof InterfaceC7564xC;
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof C7116v42) || (view2 instanceof C6906u42)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i = 0;
            } else {
                if (z) {
                    if (!z2) {
                        YB.a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, YB.a, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, YB.a, 0.0f);
                }
                bVarZ.a.d("contentFade").a(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
        } else {
            i = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C0648Bc.i(animatorSet, arrayList2);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList.size();
        for (int i9 = i; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i9));
        }
        return animatorSet;
    }

    public final float v(@NonNull View view, @NonNull View view2, @NonNull C5207m c5207m) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        y(view2, rectF2);
        c5207m.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(@NonNull View view, @NonNull View view2, @NonNull C5207m c5207m) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        y(view2, rectF2);
        c5207m.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
