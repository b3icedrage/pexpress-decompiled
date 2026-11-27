package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.C1581Nb0;
import defpackage.C2018Sq;
import defpackage.C2083Tl1;
import defpackage.C2174Uq;
import defpackage.C2252Vq;
import defpackage.C2334Wq;
import defpackage.C4664jQ0;
import defpackage.C5345me2;
import defpackage.C7001uY1;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.RJ1;
import defpackage.RunnableC2438Xq;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;

    @NonNull
    public final ViewGroup g;
    public final Context h;

    @NonNull
    public final f i;

    @NonNull
    public final SnackbarContentLayout j;
    public int k;
    public d l;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public final AccessibilityManager u;
    public static final C1581Nb0 w = C7013uc.b;
    public static final LinearInterpolator x = C7013uc.a;
    public static final C4664jQ0 y = C7013uc.d;
    public static final int[] A = {R.attr.snackbarStyle};
    public static final String B = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    public static final Handler z = new Handler(Looper.getMainLooper(), new a());
    public final b m = new b();

    @NonNull
    public final c v = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        @NonNull
        public final e j;

        public Behavior() {
            e eVar = new e();
            this.g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.e = 0;
            this.j = eVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            e eVar = this.j;
            eVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g.b().e(eVar.a);
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g.b().d(eVar.a);
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.j.getClass();
            return view instanceof f;
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            int height = 0;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.u;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    f fVar = baseTransientBottomBar.i;
                    if (fVar.getVisibility() == 0) {
                        if (fVar.getAnimationMode() == 1) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.d);
                            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                            valueAnimatorOfFloat.setDuration(baseTransientBottomBar.b);
                            valueAnimatorOfFloat.addListener(new C2018Sq(baseTransientBottomBar, i2));
                            valueAnimatorOfFloat.start();
                            return true;
                        }
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height2 = fVar.getHeight();
                        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height2);
                        valueAnimator.setInterpolator(baseTransientBottomBar.e);
                        valueAnimator.setDuration(baseTransientBottomBar.c);
                        valueAnimator.addListener(new C2174Uq(baseTransientBottomBar, i2));
                        valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                        valueAnimator.start();
                        return true;
                    }
                }
                baseTransientBottomBar.d();
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            f fVar2 = baseTransientBottomBar2.i;
            if (fVar2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = fVar2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.f) {
                    CoordinatorLayout.f fVar3 = (CoordinatorLayout.f) layoutParams2;
                    Behavior behavior = new Behavior();
                    e eVar = behavior.j;
                    eVar.getClass();
                    eVar.a = baseTransientBottomBar2.v;
                    behavior.b = new com.google.android.material.snackbar.e(baseTransientBottomBar2);
                    fVar3.b(behavior);
                    if (baseTransientBottomBar2.c() == null) {
                        fVar3.g = 80;
                    }
                }
                fVar2.o = true;
                ViewGroup viewGroup = baseTransientBottomBar2.g;
                viewGroup.addView(fVar2);
                fVar2.o = false;
                if (baseTransientBottomBar2.c() != null) {
                    int[] iArr = new int[2];
                    baseTransientBottomBar2.c().getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    height = (viewGroup.getHeight() + iArr2[1]) - i3;
                }
                baseTransientBottomBar2.q = height;
                baseTransientBottomBar2.g();
                fVar2.setVisibility(4);
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (fVar2.isLaidOut()) {
                baseTransientBottomBar2.f();
                return true;
            }
            baseTransientBottomBar2.t = true;
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i != null) {
                WindowManager windowManager = (WindowManager) baseTransientBottomBar.h.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                f fVar = baseTransientBottomBar.i;
                fVar.getLocationOnScreen(iArr);
                int height = (iHeight - (fVar.getHeight() + iArr[1])) + ((int) fVar.getTranslationY());
                int i = baseTransientBottomBar.r;
                if (height >= i) {
                    baseTransientBottomBar.s = i;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    b0.e(BaseTransientBottomBar.B, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i2 = baseTransientBottomBar.r;
                baseTransientBottomBar.s = i2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
                fVar.requestLayout();
            }
        }
    }

    public class c implements g.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void a(int i) {
            Handler handler = BaseTransientBottomBar.z;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void b() {
            Handler handler = BaseTransientBottomBar.z;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public static class d implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        @NonNull
        public final WeakReference<BaseTransientBottomBar> d;

        @NonNull
        public final WeakReference<View> e;

        public d(@NonNull Snackbar snackbar, @NonNull View view) {
            this.d = new WeakReference<>(snackbar);
            this.e = new WeakReference<>(view);
        }

        public final void a() {
            WeakReference<View> weakReference = this.e;
            if (weakReference.get() != null) {
                weakReference.get().removeOnAttachStateChangeListener(this);
                View view = weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.d.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference<BaseTransientBottomBar> weakReference = this.d;
            if (weakReference.get() == null) {
                a();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = weakReference.get();
            C1581Nb0 c1581Nb0 = BaseTransientBottomBar.w;
            baseTransientBottomBar.getClass();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.d.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.d.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static class e {
        public c a;
    }

    public static class f extends FrameLayout {
        public static final a p = new a();
        public BaseTransientBottomBar<?> d;
        public final RJ1 e;
        public int g;
        public final float h;
        public final float i;
        public final int j;
        public final int k;
        public ColorStateList l;
        public PorterDuff.Mode m;
        public Rect n;
        public boolean o;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public f(@NonNull Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(OX0.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C2083Tl1.K);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Cd2.d.s(this, dimensionPixelSize);
            }
            this.g = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.e = RJ1.b(context2, attributeSet, 0, 0).a();
            }
            this.h = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(MX0.b(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(Fe2.d(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.i = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(p);
            setFocusable(true);
            if (getBackground() == null) {
                int iO = C8056za.o(getBackgroundOverlayColorAlpha(), C8056za.h(this, R.attr.colorSurface), C8056za.h(this, R.attr.colorOnSurface));
                RJ1 rj1 = this.e;
                if (rj1 != null) {
                    C1581Nb0 c1581Nb0 = BaseTransientBottomBar.w;
                    NX0 nx0 = new NX0(rj1);
                    nx0.l(ColorStateList.valueOf(iO));
                    drawable = nx0;
                } else {
                    Resources resources = getResources();
                    C1581Nb0 c1581Nb1 = BaseTransientBottomBar.w;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iO);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.l;
                if (colorStateList != null) {
                    A30.a.h(drawable, colorStateList);
                }
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                setBackground(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.d = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.i;
        }

        public int getAnimationMode() {
            return this.g;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.h;
        }

        public int getMaxInlineActionWidth() {
            return this.k;
        }

        public int getMaxWidth() {
            return this.j;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.i.getRootWindowInsets()) != null) {
                baseTransientBottomBar.r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                baseTransientBottomBar.g();
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null) {
                g gVarB = g.b();
                c cVar = baseTransientBottomBar.v;
                synchronized (gVarB.a) {
                    z = true;
                    if (!gVarB.c(cVar)) {
                        g.c cVar2 = gVarB.d;
                        if (!(cVar2 != null && cVar2.a.get() == cVar)) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    BaseTransientBottomBar.z.post(new RunnableC2438Xq(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.d;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.t) {
                return;
            }
            baseTransientBottomBar.f();
            baseTransientBottomBar.t = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.j;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.g = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.l != null) {
                drawable = drawable.mutate();
                A30.a.h(drawable, this.l);
                A30.a.i(drawable, this.m);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.l = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                A30.a.h(drawableMutate, colorStateList);
                A30.a.i(drawableMutate, this.m);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.m = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                A30.a.i(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.o || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.n = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null) {
                C1581Nb0 c1581Nb0 = BaseTransientBottomBar.w;
                baseTransientBottomBar.g();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : p);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout2;
        this.h = context;
        C7001uY1.c(context, C7001uY1.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        f fVar = (f) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = fVar;
        fVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = fVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.e.setTextColor(C8056za.o(actionTextColorAlpha, C8056za.h(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.e.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(fVar.getMaxInlineActionWidth());
        fVar.addView(snackbarContentLayout);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        fVar.setAccessibilityLiveRegion(1);
        fVar.setImportantForAccessibility(1);
        fVar.setFitsSystemWindows(true);
        Cd2.d.u(fVar, new C2252Vq(this));
        Cd2.l(fVar, new C2334Wq(this));
        this.u = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = C7103v11.c(context, R.attr.motionDurationLong2, 250);
        this.a = C7103v11.c(context, R.attr.motionDurationLong2, 150);
        this.b = C7103v11.c(context, R.attr.motionDurationMedium1, 75);
        this.d = C7103v11.d(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.f = C7103v11.d(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.e = C7103v11.d(context, R.attr.motionEasingEmphasizedInterpolator, w);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        g gVarB = g.b();
        c cVar = this.v;
        synchronized (gVarB.a) {
            try {
                if (gVarB.c(cVar)) {
                    gVarB.a(gVarB.c, i);
                } else {
                    g.c cVar2 = gVarB.d;
                    if (cVar2 != null && cVar2.a.get() == cVar) {
                        gVarB.a(gVarB.d, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final View c() {
        d dVar = this.l;
        if (dVar == null) {
            return null;
        }
        return dVar.e.get();
    }

    public final void d() {
        g gVarB = g.b();
        c cVar = this.v;
        synchronized (gVarB.a) {
            try {
                if (gVarB.c(cVar)) {
                    gVarB.c = null;
                    g.c cVar2 = gVarB.d;
                    if (cVar2 != null && cVar2 != null) {
                        gVarB.c = cVar2;
                        gVarB.d = null;
                        g.b bVar = cVar2.a.get();
                        if (bVar != null) {
                            bVar.b();
                        } else {
                            gVarB.c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void e() {
        g gVarB = g.b();
        c cVar = this.v;
        synchronized (gVarB.a) {
            try {
                if (gVarB.c(cVar)) {
                    gVarB.f(gVarB.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        f fVar = this.i;
        if (z2) {
            fVar.post(new com.google.android.material.snackbar.f(this));
            return;
        }
        if (fVar.getParent() != null) {
            fVar.setVisibility(0);
        }
        e();
    }

    public final void g() {
        f fVar = this.i;
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = B;
        if (!z2) {
            b0.e(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (fVar.n == null) {
            b0.e(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (fVar.getParent() == null) {
            return;
        }
        int i = c() != null ? this.q : this.n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = fVar.n;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.o;
        int i4 = rect.right + this.p;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            fVar.requestLayout();
        }
        if ((z3 || this.s != this.r) && Build.VERSION.SDK_INT >= 29 && this.r > 0) {
            ViewGroup.LayoutParams layoutParams2 = fVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).a instanceof SwipeDismissBehavior)) {
                b bVar = this.m;
                fVar.removeCallbacks(bVar);
                fVar.post(bVar);
            }
        }
    }
}
