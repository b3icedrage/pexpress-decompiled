package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import io.sentry.android.core.b0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NQ0 implements InterfaceC8013zL1 {
    public static final Method E;
    public static final Method F;
    public Rect B;
    public boolean C;
    public final C6601se D;
    public final Context d;
    public ListAdapter e;
    public Z30 g;
    public int j;
    public int k;
    public boolean m;
    public boolean n;
    public boolean o;
    public d r;
    public View s;
    public AdapterView.OnItemClickListener t;
    public AdapterView.OnItemSelectedListener u;
    public final Handler z;
    public final int h = -2;
    public int i = -2;
    public final int l = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
    public int p = 0;
    public final int q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final g v = new g();
    public final f w = new f();
    public final e x = new e();
    public final c y = new c();
    public final Rect A = new Rect();

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Z30 z30 = NQ0.this.g;
            if (z30 != null) {
                z30.setListSelectionHidden(true);
                z30.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            NQ0 nq0 = NQ0.this;
            if (nq0.D.isShowing()) {
                nq0.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            NQ0.this.dismiss();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C6601se c6601se;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            NQ0 nq0 = NQ0.this;
            if (action == 0 && (c6601se = nq0.D) != null && c6601se.isShowing() && x >= 0 && x < nq0.D.getWidth() && y >= 0 && y < nq0.D.getHeight()) {
                nq0.z.postDelayed(nq0.v, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            nq0.z.removeCallbacks(nq0.v);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NQ0 nq0 = NQ0.this;
            Z30 z30 = nq0.g;
            if (z30 != null) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (!z30.isAttachedToWindow() || nq0.g.getCount() <= nq0.g.getChildCount() || nq0.g.getChildCount() > nq0.q) {
                    return;
                }
                nq0.D.setInputMethodMode(2);
                nq0.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                E = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                F = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public NQ0(@NonNull Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.d = context;
        this.z = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.o, i, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C6601se c6601se = new C6601se(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3855fm1.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            C1909Rf1.c(c6601se, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c6601se.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : C7652xe.d(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.D = c6601se;
        c6601se.setInputMethodMode(1);
    }

    @Override // defpackage.InterfaceC8013zL1
    public final boolean a() {
        return this.D.isShowing();
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void b() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        Z30 z30;
        Z30 z31 = this.g;
        C6601se c6601se = this.D;
        Context context = this.d;
        if (z31 == null) {
            Z30 z30Q = q(context, !this.C);
            this.g = z30Q;
            z30Q.setAdapter(this.e);
            this.g.setOnItemClickListener(this.t);
            this.g.setFocusable(true);
            this.g.setFocusableInTouchMode(true);
            this.g.setOnItemSelectedListener(new MQ0(this));
            this.g.setOnScrollListener(this.x);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.u;
            if (onItemSelectedListener != null) {
                this.g.setOnItemSelectedListener(onItemSelectedListener);
            }
            c6601se.setContentView(this.g);
        }
        Drawable background = c6601se.getBackground();
        Rect rect = this.A;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.m) {
                this.k = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = a.a(c6601se, this.s, this.k, c6601se.getInputMethodMode() == 2);
        int i3 = this.h;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.i;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.g.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.g.getPaddingBottom() + this.g.getPaddingTop() + i : 0);
        }
        boolean z = this.D.getInputMethodMode() == 2;
        C1909Rf1.d(c6601se, this.l);
        if (c6601se.isShowing()) {
            View view = this.s;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (view.isAttachedToWindow()) {
                int width = this.i;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.s.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c6601se.setWidth(this.i == -1 ? -1 : 0);
                        c6601se.setHeight(0);
                    } else {
                        c6601se.setWidth(this.i == -1 ? -1 : 0);
                        c6601se.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c6601se.setOutsideTouchable(true);
                View view2 = this.s;
                int i5 = this.j;
                int i6 = this.k;
                if (width < 0) {
                    width = -1;
                }
                c6601se.update(view2, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.i;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.s.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c6601se.setWidth(width2);
        c6601se.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = E;
            if (method != null) {
                try {
                    method.invoke(c6601se, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            b.b(c6601se, true);
        }
        c6601se.setOutsideTouchable(true);
        c6601se.setTouchInterceptor(this.w);
        if (this.o) {
            C1909Rf1.c(c6601se, this.n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = F;
            if (method2 != null) {
                try {
                    method2.invoke(c6601se, this.B);
                } catch (Exception e2) {
                    b0.d("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            b.a(c6601se, this.B);
        }
        c6601se.showAsDropDown(this.s, this.j, this.k, this.p);
        this.g.setSelection(-1);
        if ((!this.C || this.g.isInTouchMode()) && (z30 = this.g) != null) {
            z30.setListSelectionHidden(true);
            z30.requestLayout();
        }
        if (this.C) {
            return;
        }
        this.z.post(this.y);
    }

    public final int c() {
        return this.j;
    }

    @Override // defpackage.InterfaceC8013zL1
    public final void dismiss() {
        C6601se c6601se = this.D;
        c6601se.dismiss();
        c6601se.setContentView(null);
        this.g = null;
        this.z.removeCallbacks(this.v);
    }

    public final void e(int i) {
        this.j = i;
    }

    public final Drawable g() {
        return this.D.getBackground();
    }

    public final void i(Drawable drawable) {
        this.D.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.InterfaceC8013zL1
    public final Z30 j() {
        return this.g;
    }

    public final void k(int i) {
        this.k = i;
        this.m = true;
    }

    public final int n() {
        if (this.m) {
            return this.k;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.r;
        if (dVar == null) {
            this.r = new d();
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        Z30 z30 = this.g;
        if (z30 != null) {
            z30.setAdapter(this.e);
        }
    }

    @NonNull
    public Z30 q(Context context, boolean z) {
        return new Z30(context, z);
    }

    public final void r(int i) {
        Drawable background = this.D.getBackground();
        if (background == null) {
            this.i = i;
            return;
        }
        Rect rect = this.A;
        background.getPadding(rect);
        this.i = rect.left + rect.right + i;
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                NQ0 nq0 = NQ0.this;
                if (nq0.D.getInputMethodMode() == 2 || nq0.D.getContentView() == null) {
                    return;
                }
                Handler handler = nq0.z;
                g gVar = nq0.v;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
