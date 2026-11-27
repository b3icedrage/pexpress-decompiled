package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: bj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3006bj2 {

    @NonNull
    public static final C3006bj2 b;
    public final k a;

    /* JADX INFO: renamed from: bj2$a */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {
        public static final Field a;
        public static final Field b;
        public static final Field c;
        public static final boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                b0.f("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: bj2$d */
    public static class d extends c {
        public d() {
        }

        @Override // defpackage.C3006bj2.e
        public void c(int i, @NonNull LA0 la0) {
            this.c.setInsets(m.a(i), la0.d());
        }

        public d(@NonNull C3006bj2 c3006bj2) {
            super(c3006bj2);
        }
    }

    /* JADX INFO: renamed from: bj2$e */
    public static class e {
        public final C3006bj2 a;
        public LA0[] b;

        public e() {
            this(new C3006bj2());
        }

        public final void a() {
            LA0[] la0Arr = this.b;
            if (la0Arr != null) {
                LA0 la0F = la0Arr[0];
                LA0 la0F2 = la0Arr[1];
                C3006bj2 c3006bj2 = this.a;
                if (la0F2 == null) {
                    la0F2 = c3006bj2.a.f(2);
                }
                if (la0F == null) {
                    la0F = c3006bj2.a.f(1);
                }
                g(LA0.a(la0F, la0F2));
                LA0 la0 = this.b[l.a(16)];
                if (la0 != null) {
                    f(la0);
                }
                LA0 la1 = this.b[l.a(32)];
                if (la1 != null) {
                    d(la1);
                }
                LA0 la2 = this.b[l.a(64)];
                if (la2 != null) {
                    h(la2);
                }
            }
        }

        @NonNull
        public C3006bj2 b() {
            throw null;
        }

        public void c(int i, @NonNull LA0 la0) {
            if (this.b == null) {
                this.b = new LA0[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[l.a(i2)] = la0;
                }
            }
        }

        public void e(@NonNull LA0 la0) {
            throw null;
        }

        public void g(@NonNull LA0 la0) {
            throw null;
        }

        public e(@NonNull C3006bj2 c3006bj2) {
            this.a = c3006bj2;
        }

        public void d(@NonNull LA0 la0) {
        }

        public void f(@NonNull LA0 la0) {
        }

        public void h(@NonNull LA0 la0) {
        }
    }

    /* JADX INFO: renamed from: bj2$f */
    public static class f extends k {
        public static boolean h = false;
        public static Method i;
        public static Class<?> j;
        public static Field k;
        public static Field l;

        @NonNull
        public final WindowInsets c;
        public LA0[] d;
        public LA0 e;
        public C3006bj2 f;
        public LA0 g;

        public f(@NonNull C3006bj2 c3006bj2, @NonNull WindowInsets windowInsets) {
            super(c3006bj2);
            this.e = null;
            this.c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private LA0 r(int i2, boolean z) {
            LA0 la0A = LA0.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    la0A = LA0.a(la0A, s(i3, z));
                }
            }
            return la0A;
        }

        private LA0 t() {
            C3006bj2 c3006bj2 = this.f;
            return c3006bj2 != null ? c3006bj2.a.h() : LA0.e;
        }

        private LA0 u(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                v();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        b0.f("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(objInvoke));
                    if (rect != null) {
                        return LA0.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    b0.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                b0.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @Override // defpackage.C3006bj2.k
        public void d(@NonNull View view) {
            LA0 la0U = u(view);
            if (la0U == null) {
                la0U = LA0.e;
            }
            w(la0U);
        }

        @Override // defpackage.C3006bj2.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((f) obj).g);
            }
            return false;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public LA0 f(int i2) {
            return r(i2, false);
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public final LA0 j() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = LA0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public C3006bj2 l(int i2, int i3, int i4, int i5) {
            e cVar;
            C3006bj2 c3006bj2G = C3006bj2.g(null, this.c);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                cVar = new d(c3006bj2G);
            } else {
                cVar = i6 >= 29 ? new c(c3006bj2G) : new b(c3006bj2G);
            }
            cVar.g(C3006bj2.e(j(), i2, i3, i4, i5));
            cVar.e(C3006bj2.e(h(), i2, i3, i4, i5));
            return cVar.b();
        }

        @Override // defpackage.C3006bj2.k
        public boolean n() {
            return this.c.isRound();
        }

        @Override // defpackage.C3006bj2.k
        public void o(LA0[] la0Arr) {
            this.d = la0Arr;
        }

        @Override // defpackage.C3006bj2.k
        public void p(C3006bj2 c3006bj2) {
            this.f = c3006bj2;
        }

        @NonNull
        public LA0 s(int i2, boolean z) {
            LA0 la0H;
            int i3;
            if (i2 == 1) {
                return z ? LA0.b(0, Math.max(t().b, j().b), 0, 0) : LA0.b(0, j().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    LA0 la0T = t();
                    LA0 la0H2 = h();
                    return LA0.b(Math.max(la0T.a, la0H2.a), 0, Math.max(la0T.c, la0H2.c), Math.max(la0T.d, la0H2.d));
                }
                LA0 la0J = j();
                C3006bj2 c3006bj2 = this.f;
                la0H = c3006bj2 != null ? c3006bj2.a.h() : null;
                int iMin = la0J.d;
                if (la0H != null) {
                    iMin = Math.min(iMin, la0H.d);
                }
                return LA0.b(la0J.a, 0, la0J.c, iMin);
            }
            LA0 la0 = LA0.e;
            if (i2 == 8) {
                LA0[] la0Arr = this.d;
                la0H = la0Arr != null ? la0Arr[l.a(8)] : null;
                if (la0H != null) {
                    return la0H;
                }
                LA0 la0J2 = j();
                LA0 la0T2 = t();
                int i4 = la0J2.d;
                if (i4 > la0T2.d) {
                    return LA0.b(0, 0, 0, i4);
                }
                LA0 la1 = this.g;
                return (la1 == null || la1.equals(la0) || (i3 = this.g.d) <= la0T2.d) ? la0 : LA0.b(0, 0, 0, i3);
            }
            if (i2 == 16) {
                return i();
            }
            if (i2 == 32) {
                return g();
            }
            if (i2 == 64) {
                return k();
            }
            if (i2 != 128) {
                return la0;
            }
            C3006bj2 c3006bj3 = this.f;
            C6686t20 c6686t20E = c3006bj3 != null ? c3006bj3.a.e() : e();
            if (c6686t20E == null) {
                return la0;
            }
            int i5 = Build.VERSION.SDK_INT;
            return LA0.b(i5 >= 28 ? C6686t20.a.d(c6686t20E.a) : 0, i5 >= 28 ? C6686t20.a.f(c6686t20E.a) : 0, i5 >= 28 ? C6686t20.a.e(c6686t20E.a) : 0, i5 >= 28 ? C6686t20.a.c(c6686t20E.a) : 0);
        }

        public void w(@NonNull LA0 la0) {
            this.g = la0;
        }
    }

    /* JADX INFO: renamed from: bj2$g */
    public static class g extends f {
        public LA0 m;

        public g(@NonNull C3006bj2 c3006bj2, @NonNull WindowInsets windowInsets) {
            super(c3006bj2, windowInsets);
            this.m = null;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public C3006bj2 b() {
            return C3006bj2.g(null, this.c.consumeStableInsets());
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public C3006bj2 c() {
            return C3006bj2.g(null, this.c.consumeSystemWindowInsets());
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public final LA0 h() {
            if (this.m == null) {
                WindowInsets windowInsets = this.c;
                this.m = LA0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // defpackage.C3006bj2.k
        public boolean m() {
            return this.c.isConsumed();
        }

        @Override // defpackage.C3006bj2.k
        public void q(LA0 la0) {
            this.m = la0;
        }
    }

    /* JADX INFO: renamed from: bj2$h */
    public static class h extends g {
        public h(@NonNull C3006bj2 c3006bj2, @NonNull WindowInsets windowInsets) {
            super(c3006bj2, windowInsets);
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public C3006bj2 a() {
            return C3006bj2.g(null, this.c.consumeDisplayCutout());
        }

        @Override // defpackage.C3006bj2.k
        public C6686t20 e() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C6686t20(displayCutout);
        }

        @Override // defpackage.C3006bj2.f, defpackage.C3006bj2.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.c, hVar.c) && Objects.equals(this.g, hVar.g);
        }

        @Override // defpackage.C3006bj2.k
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* JADX INFO: renamed from: bj2$l */
    public static final class l {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(EK.e(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* JADX INFO: renamed from: bj2$m */
    public static final class m {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = j.q;
        } else {
            b = k.b;
        }
    }

    public C3006bj2(@NonNull WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new j(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new i(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new h(this, windowInsets);
        } else {
            this.a = new g(this, windowInsets);
        }
    }

    public static LA0 e(@NonNull LA0 la0, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, la0.a - i2);
        int iMax2 = Math.max(0, la0.b - i3);
        int iMax3 = Math.max(0, la0.c - i4);
        int iMax4 = Math.max(0, la0.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? la0 : LA0.b(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    public static C3006bj2 g(View view, @NonNull WindowInsets windowInsets) {
        windowInsets.getClass();
        C3006bj2 c3006bj2 = new C3006bj2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            C3006bj2 c3006bj2A = Cd2.e.a(view);
            k kVar = c3006bj2.a;
            kVar.p(c3006bj2A);
            kVar.d(view.getRootView());
        }
        return c3006bj2;
    }

    @Deprecated
    public final int a() {
        return this.a.j().d;
    }

    @Deprecated
    public final int b() {
        return this.a.j().a;
    }

    @Deprecated
    public final int c() {
        return this.a.j().c;
    }

    @Deprecated
    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3006bj2)) {
            return false;
        }
        return Objects.equals(this.a, ((C3006bj2) obj).a);
    }

    public final WindowInsets f() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* JADX INFO: renamed from: bj2$b */
    public static class b extends e {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor<WindowInsets> g = null;
        public static boolean h = false;
        public WindowInsets c;
        public LA0 d;

        public b() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // defpackage.C3006bj2.e
        @NonNull
        public C3006bj2 b() {
            a();
            C3006bj2 c3006bj2G = C3006bj2.g(null, this.c);
            LA0[] la0Arr = this.b;
            k kVar = c3006bj2G.a;
            kVar.o(la0Arr);
            kVar.q(this.d);
            return c3006bj2G;
        }

        @Override // defpackage.C3006bj2.e
        public void e(LA0 la0) {
            this.d = la0;
        }

        @Override // defpackage.C3006bj2.e
        public void g(@NonNull LA0 la0) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(la0.a, la0.b, la0.c, la0.d);
            }
        }

        public b(@NonNull C3006bj2 c3006bj2) {
            super(c3006bj2);
            this.c = c3006bj2.f();
        }
    }

    /* JADX INFO: renamed from: bj2$c */
    public static class c extends e {
        public final WindowInsets.Builder c;

        public c() {
            this.c = C7602xO1.a();
        }

        @Override // defpackage.C3006bj2.e
        @NonNull
        public C3006bj2 b() {
            a();
            C3006bj2 c3006bj2G = C3006bj2.g(null, this.c.build());
            c3006bj2G.a.o(this.b);
            return c3006bj2G;
        }

        @Override // defpackage.C3006bj2.e
        public void d(@NonNull LA0 la0) {
            this.c.setMandatorySystemGestureInsets(la0.d());
        }

        @Override // defpackage.C3006bj2.e
        public void e(@NonNull LA0 la0) {
            this.c.setStableInsets(la0.d());
        }

        @Override // defpackage.C3006bj2.e
        public void f(@NonNull LA0 la0) {
            this.c.setSystemGestureInsets(la0.d());
        }

        @Override // defpackage.C3006bj2.e
        public void g(@NonNull LA0 la0) {
            this.c.setSystemWindowInsets(la0.d());
        }

        @Override // defpackage.C3006bj2.e
        public void h(@NonNull LA0 la0) {
            this.c.setTappableElementInsets(la0.d());
        }

        public c(@NonNull C3006bj2 c3006bj2) {
            WindowInsets.Builder builderA;
            super(c3006bj2);
            WindowInsets windowInsetsF = c3006bj2.f();
            if (windowInsetsF != null) {
                builderA = Q30.b(windowInsetsF);
            } else {
                builderA = C7602xO1.a();
            }
            this.c = builderA;
        }
    }

    public C3006bj2() {
        this.a = new k(this);
    }

    /* JADX INFO: renamed from: bj2$i */
    public static class i extends h {
        public LA0 n;
        public LA0 o;
        public LA0 p;

        public i(@NonNull C3006bj2 c3006bj2, @NonNull WindowInsets windowInsets) {
            super(c3006bj2, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public LA0 g() {
            if (this.o == null) {
                this.o = LA0.c(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public LA0 i() {
            if (this.n == null) {
                this.n = LA0.c(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // defpackage.C3006bj2.k
        @NonNull
        public LA0 k() {
            if (this.p == null) {
                this.p = LA0.c(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // defpackage.C3006bj2.f, defpackage.C3006bj2.k
        @NonNull
        public C3006bj2 l(int i, int i2, int i3, int i4) {
            return C3006bj2.g(null, this.c.inset(i, i2, i3, i4));
        }

        @Override // defpackage.C3006bj2.g, defpackage.C3006bj2.k
        public void q(LA0 la0) {
        }
    }

    /* JADX INFO: renamed from: bj2$j */
    public static class j extends i {

        @NonNull
        public static final C3006bj2 q = C3006bj2.g(null, WindowInsets.CONSUMED);

        public j(@NonNull C3006bj2 c3006bj2, @NonNull WindowInsets windowInsets) {
            super(c3006bj2, windowInsets);
        }

        @Override // defpackage.C3006bj2.f, defpackage.C3006bj2.k
        @NonNull
        public LA0 f(int i) {
            return LA0.c(this.c.getInsets(m.a(i)));
        }

        @Override // defpackage.C3006bj2.f, defpackage.C3006bj2.k
        public final void d(@NonNull View view) {
        }
    }

    /* JADX INFO: renamed from: bj2$k */
    public static class k {

        @NonNull
        public static final C3006bj2 b;
        public final C3006bj2 a;

        static {
            e cVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                cVar = new d();
            } else {
                cVar = i >= 29 ? new c() : new b();
            }
            b = cVar.b().a.a().a.b().a.c();
        }

        public k(@NonNull C3006bj2 c3006bj2) {
            this.a = c3006bj2;
        }

        @NonNull
        public C3006bj2 a() {
            return this.a;
        }

        @NonNull
        public C3006bj2 b() {
            return this.a;
        }

        @NonNull
        public C3006bj2 c() {
            return this.a;
        }

        public C6686t20 e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && Objects.equals(j(), kVar.j()) && Objects.equals(h(), kVar.h()) && Objects.equals(e(), kVar.e());
        }

        @NonNull
        public LA0 f(int i) {
            return LA0.e;
        }

        @NonNull
        public LA0 g() {
            return j();
        }

        @NonNull
        public LA0 h() {
            return LA0.e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        @NonNull
        public LA0 i() {
            return j();
        }

        @NonNull
        public LA0 j() {
            return LA0.e;
        }

        @NonNull
        public LA0 k() {
            return j();
        }

        @NonNull
        public C3006bj2 l(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(@NonNull View view) {
        }

        public void o(LA0[] la0Arr) {
        }

        public void p(C3006bj2 c3006bj2) {
        }

        public void q(LA0 la0) {
        }
    }
}
