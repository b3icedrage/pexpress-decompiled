package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class S21 extends FrameLayout implements k.a {
    public static final int[] I = {R.attr.state_checked};
    public static final c J = new c();
    public static final d K = new d();
    public c A;
    public float B;
    public boolean C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public C1937Rp H;
    public boolean d;
    public ColorStateList e;
    public Drawable g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
    public boolean n;
    public final FrameLayout o;
    public final View p;
    public final ImageView q;
    public final ViewGroup r;
    public final TextView s;
    public final TextView t;
    public int u;
    public h v;
    public ColorStateList w;
    public Drawable x;
    public Drawable y;
    public ValueAnimator z;

    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ C1871Qt d;

        public a(C1871Qt c1871Qt) {
            this.d = c1871Qt;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C1937Rp c1937Rp;
            C1871Qt c1871Qt = this.d;
            ImageView imageView = c1871Qt.q;
            if (imageView.getVisibility() != 0 || (c1937Rp = c1871Qt.H) == null) {
                return;
            }
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            c1937Rp.setBounds(rect);
            c1937Rp.g(imageView, null);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int d;

        public b(int i) {
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            S21.this.h(this.d);
        }
    }

    public static class c {
        public float a(float f, float f2) {
            return 1.0f;
        }
    }

    public static class d extends c {
        @Override // S21.c
        public final float a(float f, float f2) {
            return C7013uc.a(0.4f, 1.0f, f);
        }
    }

    public S21(@NonNull Context context) {
        super(context);
        this.d = false;
        this.u = -1;
        this.A = J;
        this.B = 0.0f;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.o = (FrameLayout) findViewById(com.pexpress.tool.R.id.navigation_bar_item_icon_container);
        this.p = findViewById(com.pexpress.tool.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.pexpress.tool.R.id.navigation_bar_item_icon_view);
        this.q = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.pexpress.tool.R.id.navigation_bar_item_labels_group);
        this.r = viewGroup;
        TextView textView = (TextView) findViewById(com.pexpress.tool.R.id.navigation_bar_item_small_label_view);
        this.s = textView;
        TextView textView2 = (TextView) findViewById(com.pexpress.tool.R.id.navigation_bar_item_large_label_view);
        this.t = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.h = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.i = viewGroup.getPaddingBottom();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a((C1871Qt) this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static void e(TextView textView, int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C2083Tl1.N);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void f(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void g(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.o;
        return frameLayout != null ? frameLayout : this.q;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof S21) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        C1937Rp c1937Rp = this.H;
        int minimumHeight = c1937Rp != null ? c1937Rp.getMinimumHeight() / 2 : 0;
        return this.q.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        C1937Rp c1937Rp = this.H;
        int minimumWidth = c1937Rp == null ? 0 : c1937Rp.getMinimumWidth() - this.H.i.b.v.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.q.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f, float f2) {
        this.j = f - f2;
        this.k = (f2 * 1.0f) / f;
        this.l = (f * 1.0f) / f2;
    }

    public final void b() {
        Drawable rippleDrawable = this.g;
        ColorStateList colorStateList = this.e;
        FrameLayout frameLayout = this.o;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.C && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(C7080uu1.c(this.e), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(C7080uu1.a(this.e), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            frameLayout.setBackground(rippleDrawable2);
        }
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void c(float f, float f2) {
        View view = this.p;
        if (view != null) {
            c cVar = this.A;
            cVar.getClass();
            view.setScaleX(C7013uc.a(0.4f, 1.0f, f));
            view.setScaleY(cVar.a(f, f2));
            view.setAlpha(C7013uc.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.B = f;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(@NonNull h hVar) {
        this.v = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        C6051q02.a(this, !TextUtils.isEmpty(hVar.r) ? hVar.r : hVar.e);
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.o;
        if (frameLayout != null && this.C) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.p;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C1937Rp getBadge() {
        return this.H;
    }

    public int getItemBackgroundResId() {
        return com.pexpress.tool.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.v;
    }

    public int getItemDefaultMarginResId() {
        return com.pexpress.tool.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void h(int i) {
        View view = this.p;
        if (view == null) {
            return;
        }
        int iMin = Math.min(this.D, i - (this.G * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.F && this.m == 2) ? iMin : this.E;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.v;
        if (hVar != null && hVar.isCheckable() && this.v.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1937Rp c1937Rp = this.H;
        if (c1937Rp != null && c1937Rp.isVisible()) {
            h hVar = this.v;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.v.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.H.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo(C5426n2.f.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C5426n2.a.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.pexpress.tool.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.p;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.C = z;
        b();
        View view = this.p;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.E = i;
        h(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.G = i;
        h(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.F = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.D = i;
        h(getWidth());
    }

    public void setBadge(@NonNull C1937Rp c1937Rp) {
        C1937Rp c1937Rp2 = this.H;
        if (c1937Rp2 == c1937Rp) {
            return;
        }
        boolean z = c1937Rp2 != null;
        ImageView imageView = this.q;
        if (z && imageView != null) {
            b0.e("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.H != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C1937Rp c1937Rp3 = this.H;
                if (c1937Rp3 != null) {
                    WeakReference<FrameLayout> weakReference = c1937Rp3.q;
                    if ((weakReference != null ? weakReference.get() : null) != null) {
                        WeakReference<FrameLayout> weakReference2 = c1937Rp3.q;
                        (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c1937Rp3);
                    }
                }
                this.H = null;
            }
        }
        this.H = c1937Rp;
        if (imageView == null || c1937Rp == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C1937Rp c1937Rp4 = this.H;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c1937Rp4.setBounds(rect);
        c1937Rp4.g(imageView, null);
        WeakReference<FrameLayout> weakReference3 = c1937Rp4.q;
        if ((weakReference3 != null ? weakReference3.get() : null) == null) {
            imageView.getOverlay().add(c1937Rp4);
        } else {
            WeakReference<FrameLayout> weakReference4 = c1937Rp4.q;
            (weakReference4 != null ? weakReference4.get() : null).setForeground(c1937Rp4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z) {
        TextView textView = this.t;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.s;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.C && this.d) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.z;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.z = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.B, f);
                this.z = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new T21(this, f));
                this.z.setInterpolator(C7103v11.d(getContext(), com.pexpress.tool.R.attr.motionEasingEmphasizedInterpolator, C7013uc.b));
                this.z.setDuration(C7103v11.c(getContext(), com.pexpress.tool.R.attr.motionDurationLong2, getResources().getInteger(com.pexpress.tool.R.integer.material_motion_duration_long_1)));
                this.z.start();
            } else {
                c(f, f);
            }
        } else {
            c(f, f);
        }
        int i = this.m;
        ViewGroup viewGroup = this.r;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    g(getIconOrContainer(), this.h, 49);
                    i(viewGroup, this.i);
                    textView.setVisibility(0);
                } else {
                    g(getIconOrContainer(), this.h, 17);
                    i(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                i(viewGroup, this.i);
                if (z) {
                    g(getIconOrContainer(), (int) (this.h + this.j), 49);
                    f(textView, 1.0f, 1.0f, 0);
                    float f2 = this.k;
                    f(textView2, f2, f2, 4);
                } else {
                    g(getIconOrContainer(), this.h, 49);
                    float f3 = this.l;
                    f(textView, f3, f3, 4);
                    f(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                g(getIconOrContainer(), this.h, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.n) {
            if (z) {
                g(getIconOrContainer(), this.h, 49);
                i(viewGroup, this.i);
                textView.setVisibility(0);
            } else {
                g(getIconOrContainer(), this.h, 17);
                i(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            i(viewGroup, this.i);
            if (z) {
                g(getIconOrContainer(), (int) (this.h + this.j), 49);
                f(textView, 1.0f, 1.0f, 0);
                float f4 = this.k;
                f(textView2, f4, f4, 4);
            } else {
                g(getIconOrContainer(), this.h, 49);
                float f5 = this.l;
                f(textView, f5, f5, 4);
                f(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.s.setEnabled(z);
        this.t.setEnabled(z);
        this.q.setEnabled(z);
        if (!z) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.f.d(this, null);
        } else {
            PointerIcon pointerIconB = C6817tf1.b(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            Cd2.f.d(this, pointerIconB);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.x) {
            return;
        }
        this.x = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.y = drawable;
            ColorStateList colorStateList = this.w;
            if (colorStateList != null) {
                A30.a.h(drawable, colorStateList);
            }
        }
        this.q.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.q;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.w = colorStateList;
        if (this.v == null || (drawable = this.y) == null) {
            return;
        }
        A30.a.h(drawable, colorStateList);
        this.y.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C6333rM.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.i != i) {
            this.i = i;
            h hVar = this.v;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.h != i) {
            this.h = i;
            h hVar = this.v;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.u = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.e = colorStateList;
        b();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.m != i) {
            this.m = i;
            if (this.F && i == 2) {
                this.A = K;
            } else {
                this.A = J;
            }
            h(getWidth());
            h hVar = this.v;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.n != z) {
            this.n = z;
            h hVar = this.v;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextView textView = this.t;
        e(textView, i);
        a(this.s.getTextSize(), textView.getTextSize());
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.s;
        e(textView, i);
        a(textView.getTextSize(), this.t.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.s.setTextColor(colorStateList);
            this.t.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
        this.t.setText(charSequence);
        h hVar = this.v;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.v;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.v.r;
        }
        C6051q02.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.g = drawable;
        b();
    }
}
