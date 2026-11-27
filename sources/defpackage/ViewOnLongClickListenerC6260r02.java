package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC6260r02 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC6260r02 o;
    public static ViewOnLongClickListenerC6260r02 p;
    public final View d;
    public final CharSequence e;
    public final int g;
    public final X6 h = new X6(this, 1);
    public final JW i = new JW(this, 1);
    public int j;
    public int k;
    public C6470s02 l;
    public boolean m;
    public boolean n;

    public ViewOnLongClickListenerC6260r02(View view, CharSequence charSequence) {
        this.d = view;
        this.e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = Ed2.a;
        this.g = Build.VERSION.SDK_INT >= 28 ? Ed2.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.n = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r02) {
        ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r03 = o;
        if (viewOnLongClickListenerC6260r03 != null) {
            viewOnLongClickListenerC6260r03.d.removeCallbacks(viewOnLongClickListenerC6260r03.h);
        }
        o = viewOnLongClickListenerC6260r02;
        if (viewOnLongClickListenerC6260r02 != null) {
            viewOnLongClickListenerC6260r02.d.postDelayed(viewOnLongClickListenerC6260r02.h, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r02 = p;
        View view = this.d;
        if (viewOnLongClickListenerC6260r02 == this) {
            p = null;
            C6470s02 c6470s02 = this.l;
            if (c6470s02 != null) {
                View view2 = c6470s02.b;
                if (view2.getParent() != null) {
                    ((WindowManager) c6470s02.a.getSystemService("window")).removeView(view2);
                }
                this.l = null;
                this.n = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                b0.c("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (o == this) {
            b(null);
        }
        view.removeCallbacks(this.i);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        View view = this.d;
        if (view.isAttachedToWindow()) {
            b(null);
            ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r02 = p;
            if (viewOnLongClickListenerC6260r02 != null) {
                viewOnLongClickListenerC6260r02.a();
            }
            p = this;
            this.m = z;
            C6470s02 c6470s02 = new C6470s02(view.getContext());
            this.l = c6470s02;
            int width = this.j;
            int i4 = this.k;
            boolean z2 = this.m;
            View view2 = c6470s02.b;
            ViewParent parent = view2.getParent();
            Context context = c6470s02.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c6470s02.c.setText(this.e);
            WindowManager.LayoutParams layoutParams = c6470s02.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                b0.c("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                Rect rect = c6470s02.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c6470s02.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c6470s02.f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[i3];
                int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.m) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            JW jw = this.i;
            view.removeCallbacks(jw);
            view.postDelayed(jw, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.l == null || !this.m) {
            View view2 = this.d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.n = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.l == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.n) {
                        this.j = x;
                        this.k = y;
                        this.n = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.j);
                        int i = this.g;
                        if (iAbs > i || Math.abs(y - this.k) > i) {
                            this.j = x;
                            this.k = y;
                            this.n = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.j = view.getWidth() / 2;
        this.k = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
