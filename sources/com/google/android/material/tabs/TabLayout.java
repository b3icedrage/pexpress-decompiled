package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.IBinder;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import defpackage.A30;
import defpackage.AbstractC6801tb1;
import defpackage.C0564Aa;
import defpackage.C1361Kf1;
import defpackage.C1516Mf1;
import defpackage.C1937Rp;
import defpackage.C2083Tl1;
import defpackage.C2762ae2;
import defpackage.C3798fX1;
import defpackage.C3855fm1;
import defpackage.C4806k50;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C6051q02;
import defpackage.C6333rM;
import defpackage.C6577sX0;
import defpackage.C6800tb0;
import defpackage.C6817tf1;
import defpackage.C7001uY1;
import defpackage.C7013uc;
import defpackage.C7080uu1;
import defpackage.C7103v11;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@C2762ae2.b
public class TabLayout extends HorizontalScrollView {
    public static final C1516Mf1 a0 = new C1516Mf1(16);
    public final int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public com.google.android.material.tabs.a L;
    public final TimeInterpolator M;
    public c N;
    public final ArrayList<c> O;
    public i P;
    public ValueAnimator Q;
    public C2762ae2 R;
    public g S;
    public b T;
    public boolean U;
    public int V;
    public final C1361Kf1 W;
    public int d;
    public final ArrayList<f> e;
    public f g;

    @NonNull
    public final e h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public ColorStateList p;
    public ColorStateList q;
    public ColorStateList r;

    @NonNull
    public Drawable s;
    public int t;
    public final float u;
    public final float v;
    public final int w;
    public int x;
    public final int y;
    public final int z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements C2762ae2.e {
        public b() {
        }

        @Override // defpackage.C2762ae2.e
        public final void a(@NonNull C2762ae2 c2762ae2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.R == c2762ae2) {
                tabLayout.h();
            }
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<f> {
    }

    public class e extends LinearLayout {
        public static final /* synthetic */ int g = 0;
        public ValueAnimator d;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View d;
            public final /* synthetic */ View e;

            public a(View view, View view2) {
                this.d = view;
                this.e = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                e.this.c(this.d, this.e, valueAnimator.getAnimatedFraction());
            }
        }

        public e(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.V == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = tabLayout.L;
                Drawable drawable = tabLayout.s;
                aVar.getClass();
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.d = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.s.getBounds();
            tabLayout.s.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.s;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.s.getBounds().bottom);
            } else {
                tabLayout.L.b(tabLayout, view, view2, f, tabLayout.s);
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            postInvalidateOnAnimation();
        }

        public final void d(int i, boolean z, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.d == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.d = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.d.removeAllUpdateListeners();
                this.d.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.d = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.M);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.s.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.s.getIntrinsicHeight();
            }
            int i = tabLayout.E;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.s.getBounds().width() > 0) {
                Rect bounds = tabLayout.s.getBounds();
                tabLayout.s.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.s.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.d;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), false, -1);
                return;
            }
            if (tabLayout.d == -1) {
                tabLayout.d = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.d);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) Fe2.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.C = 0;
                    tabLayout.k(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public static class f {
        public String a;
        public CharSequence b;
        public int c = -1;
        public View d;
        public TabLayout e;

        @NonNull
        public h f;
    }

    public static class g implements C2762ae2.f {

        @NonNull
        public final WeakReference<TabLayout> a;
        public int b;

        public g(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // defpackage.C2762ae2.f
        public final void a(int i) {
            this.b = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.V = this.b;
            }
        }
    }

    public final class h extends LinearLayout {
        public static final /* synthetic */ int p = 0;
        public f d;
        public TextView e;
        public ImageView g;
        public View h;
        public C1937Rp i;
        public View j;
        public TextView k;
        public ImageView l;
        public Drawable m;
        public int n;

        public h(Context context) {
            super(context);
            this.n = 2;
            e(context);
            int i = TabLayout.this.i;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            setPaddingRelative(i, TabLayout.this.j, TabLayout.this.k, TabLayout.this.l);
            setGravity(17);
            setOrientation(!TabLayout.this.G ? 1 : 0);
            setClickable(true);
            Cd2.f.d(this, C6817tf1.b(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE));
        }

        private C1937Rp getBadge() {
            return this.i;
        }

        @NonNull
        private C1937Rp getOrCreateBadge() {
            if (this.i == null) {
                this.i = new C1937Rp(getContext(), null);
            }
            b();
            C1937Rp c1937Rp = this.i;
            if (c1937Rp != null) {
                return c1937Rp;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.i != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.h;
                if (view != null) {
                    C1937Rp c1937Rp = this.i;
                    if (c1937Rp != null) {
                        WeakReference<FrameLayout> weakReference = c1937Rp.q;
                        if ((weakReference != null ? weakReference.get() : null) != null) {
                            WeakReference<FrameLayout> weakReference2 = c1937Rp.q;
                            (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                        } else {
                            view.getOverlay().remove(c1937Rp);
                        }
                    }
                    this.h = null;
                }
            }
        }

        public final void b() {
            if (this.i != null) {
                if (this.j != null) {
                    a();
                    return;
                }
                TextView textView = this.e;
                if (textView == null || this.d == null) {
                    a();
                    return;
                }
                if (this.h == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.e;
                if (this.i == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                C1937Rp c1937Rp = this.i;
                Rect rect = new Rect();
                textView2.getDrawingRect(rect);
                c1937Rp.setBounds(rect);
                c1937Rp.g(textView2, null);
                WeakReference<FrameLayout> weakReference = c1937Rp.q;
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    WeakReference<FrameLayout> weakReference2 = c1937Rp.q;
                    (weakReference2 != null ? weakReference2.get() : null).setForeground(c1937Rp);
                } else {
                    textView2.getOverlay().add(c1937Rp);
                }
                this.h = textView2;
            }
        }

        public final void c(@NonNull View view) {
            C1937Rp c1937Rp = this.i;
            if (c1937Rp == null || view != this.h) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            c1937Rp.setBounds(rect);
            c1937Rp.g(view, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0020  */
        public final void d() {
            boolean z;
            f();
            f fVar = this.d;
            if (fVar == null) {
                z = false;
            } else {
                TabLayout tabLayout = fVar.e;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != fVar.c) {
                    z = false;
                } else {
                    z = true;
                }
            }
            setSelected(z);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.m;
            if ((drawable == null || !drawable.isStateful()) ? false : this.m.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.w;
            if (i != 0) {
                Drawable drawableD = C7652xe.d(context, i);
                this.m = drawableD;
                if (drawableD != null && drawableD.isStateful()) {
                    this.m.setState(getDrawableState());
                }
            } else {
                this.m = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (tabLayout.r != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = C7080uu1.a(tabLayout.r);
                boolean z = tabLayout.K;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z ? null : gradientDrawable2);
            }
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i;
            ViewParent parent;
            f fVar = this.d;
            View view = fVar != null ? fVar.d : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.j;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.j);
                    }
                    addView(view);
                }
                this.j = view;
                TextView textView = this.e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.g.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.k = textView2;
                if (textView2 != null) {
                    this.n = textView2.getMaxLines();
                }
                this.l = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.j;
                if (view3 != null) {
                    removeView(view3);
                    this.j = null;
                }
                this.k = null;
                this.l = null;
            }
            if (this.j == null) {
                if (this.g == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.pexpress.tool.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.g = imageView2;
                    addView(imageView2, 0);
                }
                if (this.e == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.pexpress.tool.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.e = textView3;
                    addView(textView3);
                    this.n = this.e.getMaxLines();
                }
                TextView textView4 = this.e;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.m);
                if (!isSelected() || (i = tabLayout.o) == -1) {
                    this.e.setTextAppearance(tabLayout.n);
                } else {
                    this.e.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.p;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
                g(this.e, this.g, true);
                b();
                ImageView imageView3 = this.g;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView5 = this.e;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView5));
                }
            } else {
                TextView textView6 = this.k;
                if (textView6 != null || this.l != null) {
                    g(textView6, this.l, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.b)) {
                return;
            }
            setContentDescription(fVar.b);
        }

        public final void g(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            f fVar = this.d;
            CharSequence charSequence = fVar != null ? fVar.a : null;
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z2 = false;
                } else {
                    this.d.getClass();
                    z2 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (z2 && imageView.getVisibility() == 0) ? (int) Fe2.b(getContext(), 8) : 0;
                if (TabLayout.this.G) {
                    if (iB != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar2 = this.d;
            CharSequence charSequence2 = fVar2 != null ? fVar2.b : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            C6051q02.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.e, this.g, this.j};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.e, this.g, this.j};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.d;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C1937Rp c1937Rp = this.i;
            if (c1937Rp != null && c1937Rp.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.i.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo(C5426n2.f.a(isSelected(), 0, 1, this.d.c, 1).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C5426n2.a.e.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.pexpress.tool.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.e != null) {
                float f = tabLayout.u;
                int i3 = this.n;
                ImageView imageView = this.g;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.e.getTextSize();
                int lineCount = this.e.getLineCount();
                int maxLines = this.e.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.F == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.e.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.e.setTextSize(0, f);
                    this.e.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.d == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            f fVar = this.d;
            TabLayout tabLayout = fVar.e;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.i(fVar, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.j;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.d) {
                this.d = fVar;
                d();
            }
        }
    }

    public static class i implements d {
        public final C2762ae2 a;

        public i(C2762ae2 c2762ae2) {
            this.a = c2762ae2;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(@NonNull f fVar) {
            this.a.setCurrentItem(fVar.c);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(f fVar) {
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.tabStyle, com.pexpress.tool.R.style.Widget_Design_TabLayout), attributeSet, com.pexpress.tool.R.attr.tabStyle);
        this.d = -1;
        this.e = new ArrayList<>();
        this.o = -1;
        this.t = 0;
        this.x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.I = -1;
        this.O = new ArrayList<>();
        this.W = new C1361Kf1(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.h = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = C7001uY1.d(context2, attributeSet, C2083Tl1.M, com.pexpress.tool.R.attr.tabStyle, com.pexpress.tool.R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            NX0 nx0 = new NX0();
            nx0.l(ColorStateList.valueOf(colorDrawable.getColor()));
            nx0.j(context2);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            nx0.k(Cd2.d.i(this));
            setBackground(nx0);
        }
        setSelectedTabIndicator(MX0.d(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        eVar.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.i = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.j = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.k = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.l = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (C6577sX0.b(context2, com.pexpress.tool.R.attr.isMaterial3Theme, false)) {
            this.m = com.pexpress.tool.R.attr.textAppearanceTitleSmall;
        } else {
            this.m = com.pexpress.tool.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, com.pexpress.tool.R.style.TextAppearance_Design_Tab);
        this.n = resourceId;
        int[] iArr = C3855fm1.x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.u = dimensionPixelSize2;
            this.p = MX0.b(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.o = typedArrayD.getResourceId(22, resourceId);
            }
            int i2 = this.o;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i2 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListB = MX0.b(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListB != null) {
                        this.p = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListB.getColorForState(new int[]{R.attr.state_selected}, colorStateListB.getDefaultColor()), this.p.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.p = MX0.b(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.p = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.p.getDefaultColor()});
            }
            this.q = MX0.b(context2, typedArrayD, 3);
            Fe2.d(typedArrayD.getInt(4, -1), null);
            this.r = MX0.b(context2, typedArrayD, 21);
            this.D = typedArrayD.getInt(6, 300);
            this.M = C7103v11.d(context2, com.pexpress.tool.R.attr.motionEasingEmphasizedInterpolator, C7013uc.b);
            this.y = typedArrayD.getDimensionPixelSize(14, -1);
            this.z = typedArrayD.getDimensionPixelSize(13, -1);
            this.w = typedArrayD.getResourceId(0, 0);
            this.B = typedArrayD.getDimensionPixelSize(1, 0);
            this.F = typedArrayD.getInt(15, 1);
            this.C = typedArrayD.getInt(2, 0);
            this.G = typedArrayD.getBoolean(12, false);
            this.K = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.v = resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.design_tab_text_size_2line);
            this.A = resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.y;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.F;
        if (i3 == 0 || i3 == 2) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.h.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        e eVar = this.h;
        int childCount = eVar.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = eVar.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof h) {
                        ((h) childAt).f();
                    }
                }
                i3++;
            }
        }
    }

    public final void a(@NonNull f fVar, int i2, boolean z) {
        if (fVar.e != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        fVar.c = i2;
        ArrayList<f> arrayList = this.e;
        arrayList.add(i2, fVar);
        int size = arrayList.size();
        int i3 = -1;
        for (int i4 = i2 + 1; i4 < size; i4++) {
            if (arrayList.get(i4).c == this.d) {
                i3 = i4;
            }
            arrayList.get(i4).c = i4;
        }
        this.d = i3;
        h hVar = fVar.f;
        hVar.setSelected(false);
        hVar.setActivated(false);
        int i5 = fVar.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.h.addView(hVar, i5, layoutParams);
        if (z) {
            TabLayout tabLayout = fVar.e;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.i(fVar, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof C3798fX1)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        C3798fX1 c3798fX1 = (C3798fX1) view;
        f fVarG = g();
        c3798fX1.getClass();
        if (!TextUtils.isEmpty(c3798fX1.getContentDescription())) {
            fVarG.b = c3798fX1.getContentDescription();
            h hVar = fVarG.f;
            if (hVar != null) {
                hVar.d();
            }
        }
        ArrayList<f> arrayList = this.e;
        a(fVarG, arrayList.size(), arrayList.isEmpty());
    }

    public final void c(int i2) {
        if (i2 == -1) {
            return;
        }
        IBinder windowToken = getWindowToken();
        e eVar = this.h;
        if (windowToken != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (isLaidOut()) {
                int childCount = eVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        int scrollX = getScrollX();
                        int iE = e(i2);
                        if (scrollX != iE) {
                            f();
                            this.Q.setIntValues(scrollX, iE);
                            this.Q.start();
                        }
                        ValueAnimator valueAnimator = eVar.d;
                        if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.d != i2) {
                            eVar.d.cancel();
                        }
                        eVar.d(i2, true, this.D);
                        return;
                    }
                    if (eVar.getChildAt(i3).getWidth() <= 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        float f2 = i2 + 0.0f;
        int iRound = Math.round(f2);
        if (iRound < 0 || iRound >= eVar.getChildCount()) {
            return;
        }
        TabLayout.this.d = Math.round(f2);
        ValueAnimator valueAnimator2 = eVar.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            eVar.d.cancel();
        }
        eVar.c(eVar.getChildAt(i2), eVar.getChildAt(i2 + 1), 0.0f);
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null && valueAnimator3.isRunning()) {
            this.Q.cancel();
        }
        int iE2 = e(i2);
        int scrollX2 = getScrollX();
        if ((i2 >= getSelectedTabPosition() || iE2 < scrollX2) && (i2 <= getSelectedTabPosition() || iE2 > scrollX2)) {
            getSelectedTabPosition();
        }
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        if (getLayoutDirection() == 1 && ((i2 >= getSelectedTabPosition() || iE2 > scrollX2) && (i2 <= getSelectedTabPosition() || iE2 < scrollX2))) {
            getSelectedTabPosition();
        }
        if (i2 < 0) {
            iE2 = 0;
        }
        scrollTo(iE2, 0);
        setSelectedTabView(iRound);
    }

    public final void d() {
        int i2 = this.F;
        int iMax = (i2 == 0 || i2 == 2) ? Math.max(0, this.B - this.i) : 0;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        e eVar = this.h;
        eVar.setPaddingRelative(iMax, 0, 0, 0);
        int i3 = this.F;
        if (i3 == 0) {
            int i4 = this.C;
            if (i4 == 0) {
                b0.e("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i4 == 1) {
                eVar.setGravity(1);
            } else if (i4 == 2) {
            }
            eVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.C == 2) {
                b0.e("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            eVar.setGravity(1);
        }
        k(true);
    }

    public final int e(int i2) {
        e eVar;
        View childAt;
        int i3 = this.F;
        if ((i3 != 0 && i3 != 2) || (childAt = (eVar = this.h).getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < eVar.getChildCount() ? eVar.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * 0.0f);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void f() {
        if (this.Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Q = valueAnimator;
            valueAnimator.setInterpolator(this.M);
            this.Q.setDuration(this.D);
            this.Q.addUpdateListener(new a());
        }
    }

    @NonNull
    public final f g() {
        f fVar = (f) a0.a();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.e = this;
        C1361Kf1 c1361Kf1 = this.W;
        h hVar = c1361Kf1 != null ? (h) c1361Kf1.a() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.b)) {
            hVar.setContentDescription(fVar.a);
        } else {
            hVar.setContentDescription(fVar.b);
        }
        fVar.f = hVar;
        return fVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.g;
        if (fVar != null) {
            return fVar.c;
        }
        return -1;
    }

    public int getTabCount() {
        return this.e.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    public ColorStateList getTabIconTint() {
        return this.q;
    }

    public int getTabIndicatorAnimationMode() {
        return this.J;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    public int getTabMaxWidth() {
        return this.x;
    }

    public int getTabMode() {
        return this.F;
    }

    public ColorStateList getTabRippleColor() {
        return this.r;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.s;
    }

    public ColorStateList getTabTextColors() {
        return this.p;
    }

    public final void h() {
        e eVar = this.h;
        int childCount = eVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.W.b(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.e.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.e = null;
            next.f = null;
            next.a = null;
            next.b = null;
            next.c = -1;
            next.d = null;
            a0.b(next);
        }
        this.g = null;
    }

    public final void i(f fVar, boolean z) {
        f fVar2 = this.g;
        ArrayList<c> arrayList = this.O;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a(fVar);
                }
                c(fVar.c);
                return;
            }
            return;
        }
        int i2 = fVar != null ? fVar.c : -1;
        if (z) {
            if ((fVar2 == null || fVar2.c == -1) && i2 != -1) {
                float f2 = i2 + 0.0f;
                int iRound = Math.round(f2);
                if (iRound >= 0) {
                    e eVar = this.h;
                    if (iRound < eVar.getChildCount()) {
                        TabLayout.this.d = Math.round(f2);
                        ValueAnimator valueAnimator = eVar.d;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            eVar.d.cancel();
                        }
                        eVar.c(eVar.getChildAt(i2), eVar.getChildAt(i2 + 1), 0.0f);
                        ValueAnimator valueAnimator2 = this.Q;
                        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                            this.Q.cancel();
                        }
                        int iE = e(i2);
                        int scrollX = getScrollX();
                        if ((i2 >= getSelectedTabPosition() || iE < scrollX) && (i2 <= getSelectedTabPosition() || iE > scrollX)) {
                            getSelectedTabPosition();
                        }
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (getLayoutDirection() == 1 && ((i2 >= getSelectedTabPosition() || iE > scrollX) && (i2 <= getSelectedTabPosition() || iE < scrollX))) {
                            getSelectedTabPosition();
                        }
                        if (i2 < 0) {
                            iE = 0;
                        }
                        scrollTo(iE, 0);
                        setSelectedTabView(iRound);
                    }
                }
            } else {
                c(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.g = fVar;
        if (fVar2 != null && fVar2.e != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c(fVar2);
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).b(fVar);
            }
        }
    }

    public final void j(C2762ae2 c2762ae2, boolean z) {
        if (this.R != null) {
            if (this.S != null) {
                throw null;
            }
            if (this.T != null) {
                this.R.getClass();
                throw null;
            }
        }
        i iVar = this.P;
        ArrayList<c> arrayList = this.O;
        if (iVar != null) {
            arrayList.remove(iVar);
            this.P = null;
        }
        if (c2762ae2 == null) {
            this.R = null;
            h();
            this.U = z;
        } else {
            this.R = c2762ae2;
            if (this.S == null) {
                this.S = new g(this);
            }
            this.S.b = 0;
            throw null;
        }
    }

    public final void k(boolean z) {
        int i2 = 0;
        while (true) {
            e eVar = this.h;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.y(this);
        if (this.R == null) {
            ViewParent parent = getParent();
            if (parent instanceof C2762ae2) {
                j((C2762ae2) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i2 = 0;
        while (true) {
            e eVar = this.h;
            if (i2 >= eVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).m) != null) {
                drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                hVar.m.draw(canvas);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(C5426n2.e.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iRound = Math.round(Fe2.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int iB = this.z;
            if (iB <= 0) {
                iB = (int) (size - Fe2.b(getContext(), 56));
            }
            this.x = iB;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.F;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0564Aa.w(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        int i2 = 0;
        while (true) {
            e eVar = this.h;
            if (i2 >= eVar.getChildCount()) {
                d();
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                h hVar = (h) childAt;
                hVar.setOrientation(!TabLayout.this.G ? 1 : 0);
                TextView textView = hVar.k;
                if (textView == null && hVar.l == null) {
                    hVar.g(hVar.e, hVar.g, true);
                } else {
                    hVar.g(textView, hVar.l, false);
                }
            }
            i2++;
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.s = drawableMutate;
        int i2 = this.t;
        if (i2 != 0) {
            A30.a.g(drawableMutate, i2);
        } else {
            A30.a.h(drawableMutate, null);
        }
        int intrinsicHeight = this.I;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.s.getIntrinsicHeight();
        }
        this.h.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.t = i2;
        Drawable drawable = this.s;
        if (i2 != 0) {
            A30.a.g(drawable, i2);
        } else {
            A30.a.h(drawable, null);
        }
        k(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.E != i2) {
            this.E = i2;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            this.h.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.I = i2;
        this.h.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.C != i2) {
            this.C = i2;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            ArrayList<f> arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = arrayList.get(i2).f;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(C6333rM.getColorStateList(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.J = i2;
        if (i2 == 0) {
            this.L = new com.google.android.material.tabs.a();
            return;
        }
        if (i2 == 1) {
            this.L = new C4806k50();
        } else {
            if (i2 == 2) {
                this.L = new C6800tb0();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.H = z;
        int i2 = e.g;
        e eVar = this.h;
        eVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.F) {
            this.F = i2;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        int i2 = 0;
        while (true) {
            e eVar = this.h;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                Context context = getContext();
                int i3 = h.p;
                ((h) childAt).e(context);
            }
            i2++;
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(C6333rM.getColorStateList(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            ArrayList<f> arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = arrayList.get(i2).f;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC6801tb1 abstractC6801tb1) {
        h();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.K == z) {
            return;
        }
        this.K = z;
        int i2 = 0;
        while (true) {
            e eVar = this.h;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                Context context = getContext();
                int i3 = h.p;
                ((h) childAt).e(context);
            }
            i2++;
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(C2762ae2 c2762ae2) {
        j(c2762ae2, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.N;
        ArrayList<c> arrayList = this.O;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.N = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(C7652xe.d(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
