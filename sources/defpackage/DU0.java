package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DU0 extends Drawable implements Drawable.Callback, Animatable {
    public final Matrix A;
    public Bitmap B;
    public Canvas C;
    public Rect D;
    public RectF E;
    public KL0 F;
    public Rect G;
    public Rect H;
    public RectF I;
    public RectF J;
    public Matrix K;
    public Matrix L;
    public boolean M;
    public C3788fU0 d;
    public final MU0 e;
    public boolean g;
    public boolean h;
    public boolean i;
    public c j;
    public final ArrayList<b> k;
    public C4553iw0 l;
    public String m;
    public C1989Sg0 n;
    public Map<String, Typeface> o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public LH t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public EnumC1319Jr1 y;
    public boolean z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DU0 du0 = DU0.this;
            LH lh = du0.t;
            if (lh != null) {
                lh.t(du0.e.d());
            }
        }
    }

    public interface b {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final /* synthetic */ c[] h;

        static {
            c cVar = new c("NONE", 0);
            d = cVar;
            c cVar2 = new c("PLAY", 1);
            e = cVar2;
            c cVar3 = new c("RESUME", 2);
            g = cVar3;
            h = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) h.clone();
        }
    }

    public DU0() {
        MU0 mu0 = new MU0();
        mu0.h = 1.0f;
        mu0.i = false;
        mu0.j = 0L;
        mu0.k = 0.0f;
        mu0.l = 0.0f;
        mu0.m = 0;
        mu0.n = -2.1474836E9f;
        mu0.o = 2.1474836E9f;
        mu0.q = false;
        mu0.r = false;
        this.e = mu0;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = c.d;
        this.k = new ArrayList<>();
        a aVar = new a();
        this.r = false;
        this.s = true;
        this.u = 255;
        this.y = EnumC1319Jr1.d;
        this.z = false;
        this.A = new Matrix();
        this.M = false;
        mu0.addUpdateListener(aVar);
    }

    public static void h(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void b(final C5279mK0 c5279mK0, final ColorFilter colorFilter, final NU0 nu0) {
        LH lh = this.t;
        if (lh == null) {
            this.k.add(new b() { // from class: tU0
                @Override // DU0.b
                public final void run() {
                    this.a.b(c5279mK0, colorFilter, nu0);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c5279mK0 == C5279mK0.c) {
            lh.c(colorFilter, nu0);
        } else {
            InterfaceC5489nK0 interfaceC5489nK0 = c5279mK0.b;
            if (interfaceC5489nK0 != null) {
                interfaceC5489nK0.c(colorFilter, nu0);
            } else {
                ArrayList arrayList = new ArrayList();
                this.t.e(c5279mK0, 0, arrayList, new C5279mK0(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C5279mK0) arrayList.get(i)).b.c(colorFilter, nu0);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == IU0.z) {
                u(this.e.d());
            }
        }
    }

    public final boolean d() {
        return this.g || this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.i) {
            try {
                if (this.z) {
                    m(canvas, this.t);
                } else {
                    i(canvas);
                }
            } catch (Throwable unused) {
                CS0.a.getClass();
            }
        } else if (this.z) {
            m(canvas, this.t);
        } else {
            i(canvas);
        }
        this.M = false;
        C0564Aa.i();
    }

    public final void e() {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            return;
        }
        AbstractC7580xH0.a aVar = C2708aO0.a;
        Rect rect = c3788fU0.j;
        List list = Collections.EMPTY_LIST;
        LH lh = new LH(this, new ZN0(list, c3788fU0, "__container", -1L, ZN0.a.d, -1L, null, list, new C3603ec(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, ZN0.b.d, null, false, null, null), c3788fU0.i, c3788fU0);
        this.t = lh;
        if (this.w) {
            lh.s(true);
        }
        this.t.H = this.s;
    }

    public final void f() {
        MU0 mu0 = this.e;
        if (mu0.q) {
            mu0.cancel();
            if (!isVisible()) {
                this.j = c.d;
            }
        }
        this.d = null;
        this.t = null;
        this.l = null;
        mu0.p = null;
        mu0.n = -2.1474836E9f;
        mu0.o = 2.1474836E9f;
        invalidateSelf();
    }

    public final void g() {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            return;
        }
        EnumC1319Jr1 enumC1319Jr1 = this.y;
        int i = Build.VERSION.SDK_INT;
        boolean z = c3788fU0.n;
        int i2 = c3788fU0.o;
        int iOrdinal = enumC1319Jr1.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.z = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            return -1;
        }
        return c3788fU0.j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            return -1;
        }
        return c3788fU0.j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void i(Canvas canvas) {
        LH lh = this.t;
        C3788fU0 c3788fU0 = this.d;
        if (lh == null || c3788fU0 == null) {
            return;
        }
        Matrix matrix = this.A;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / c3788fU0.j.width(), bounds.height() / c3788fU0.j.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        lh.h(canvas, matrix, this.u);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.M) {
            return;
        }
        this.M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        MU0 mu0 = this.e;
        if (mu0 == null) {
            return false;
        }
        return mu0.q;
    }

    public final C1989Sg0 j() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            C1989Sg0 c1989Sg0 = new C1989Sg0(getCallback());
            this.n = c1989Sg0;
            String str = this.p;
            if (str != null) {
                c1989Sg0.e = str;
            }
        }
        return this.n;
    }

    public final void k() {
        this.k.clear();
        MU0 mu0 = this.e;
        mu0.i(true);
        Iterator it = mu0.g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(mu0);
        }
        if (isVisible()) {
            return;
        }
        this.j = c.d;
    }

    public final void l() {
        if (this.t == null) {
            this.k.add(new b() { // from class: xU0
                @Override // DU0.b
                public final void run() {
                    this.a.l();
                }
            });
            return;
        }
        g();
        boolean zD = d();
        c cVar = c.d;
        MU0 mu0 = this.e;
        if (zD || mu0.getRepeatCount() == 0) {
            if (isVisible()) {
                mu0.q = true;
                boolean zH = mu0.h();
                for (Animator.AnimatorListener animatorListener : mu0.e) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(mu0, zH);
                    } else {
                        animatorListener.onAnimationStart(mu0);
                    }
                }
                mu0.j((int) (mu0.h() ? mu0.e() : mu0.g()));
                mu0.j = 0L;
                mu0.m = 0;
                if (mu0.q) {
                    mu0.i(false);
                    Choreographer.getInstance().postFrameCallback(mu0);
                }
                this.j = cVar;
            } else {
                this.j = c.e;
            }
        }
        if (d()) {
            return;
        }
        o((int) (mu0.h < 0.0f ? mu0.g() : mu0.e()));
        mu0.i(true);
        mu0.a(mu0.h());
        if (isVisible()) {
            return;
        }
        this.j = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void m(Canvas canvas, LH lh) {
        boolean z;
        if (this.d == null || lh == null) {
            return;
        }
        if (this.C == null) {
            this.C = new Canvas();
            this.J = new RectF();
            this.K = new Matrix();
            this.L = new Matrix();
            this.D = new Rect();
            this.E = new RectF();
            this.F = new KL0();
            this.G = new Rect();
            this.H = new Rect();
            this.I = new RectF();
        }
        canvas.getMatrix(this.K);
        canvas.getClipBounds(this.D);
        Rect rect = this.D;
        this.E.set(rect.left, rect.top, rect.right, rect.bottom);
        this.K.mapRect(this.E);
        h(this.D, this.E);
        if (this.s) {
            this.J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            lh.f(this.J, null, false);
        }
        this.K.mapRect(this.J);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.J;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF2 = this.J;
            Rect rect2 = this.D;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.J.width());
        int iCeil2 = (int) Math.ceil(this.J.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        Bitmap bitmap = this.B;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.B.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.B = bitmapCreateBitmap;
            this.C.setBitmap(bitmapCreateBitmap);
            this.M = true;
        } else if (this.B.getWidth() > iCeil || this.B.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.B, 0, 0, iCeil, iCeil2);
            this.B = bitmapCreateBitmap2;
            this.C.setBitmap(bitmapCreateBitmap2);
            this.M = true;
        }
        if (this.M) {
            Matrix matrix = this.A;
            matrix.set(this.K);
            matrix.preScale(fWidth, fHeight);
            RectF rectF3 = this.J;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.B.eraseColor(0);
            lh.h(this.C, matrix, this.u);
            this.K.invert(this.L);
            this.L.mapRect(this.I, this.J);
            h(this.H, this.I);
        }
        this.G.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.B, this.G, this.H, this.F);
    }

    public final void n() {
        if (this.t == null) {
            this.k.add(new b() { // from class: uU0
                @Override // DU0.b
                public final void run() {
                    this.a.n();
                }
            });
            return;
        }
        g();
        boolean zD = d();
        c cVar = c.d;
        MU0 mu0 = this.e;
        if (zD || mu0.getRepeatCount() == 0) {
            if (isVisible()) {
                mu0.q = true;
                mu0.i(false);
                Choreographer.getInstance().postFrameCallback(mu0);
                mu0.j = 0L;
                if (mu0.h() && mu0.l == mu0.g()) {
                    mu0.j(mu0.e());
                } else if (!mu0.h() && mu0.l == mu0.e()) {
                    mu0.j(mu0.g());
                }
                Iterator it = mu0.g.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(mu0);
                }
                this.j = cVar;
            } else {
                this.j = c.g;
            }
        }
        if (d()) {
            return;
        }
        o((int) (mu0.h < 0.0f ? mu0.g() : mu0.e()));
        mu0.i(true);
        mu0.a(mu0.h());
        if (isVisible()) {
            return;
        }
        this.j = cVar;
    }

    public final void o(final int i) {
        if (this.d == null) {
            this.k.add(new b() { // from class: AU0
                @Override // DU0.b
                public final void run() {
                    this.a.o(i);
                }
            });
        } else {
            this.e.j(i);
        }
    }

    public final void p(final int i) {
        if (this.d == null) {
            this.k.add(new b() { // from class: BU0
                @Override // DU0.b
                public final void run() {
                    this.a.p(i);
                }
            });
            return;
        }
        MU0 mu0 = this.e;
        mu0.k(mu0.n, i + 0.99f);
    }

    public final void q(final String str) {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            this.k.add(new b() { // from class: vU0
                @Override // DU0.b
                public final void run() {
                    this.a.q(str);
                }
            });
            return;
        }
        VW0 vw0C = c3788fU0.c(str);
        if (vw0C == null) {
            throw new IllegalArgumentException(C1039Gc0.d("Cannot find marker with name ", str, "."));
        }
        p((int) (vw0C.b + vw0C.c));
    }

    public final void r(final String str) {
        C3788fU0 c3788fU0 = this.d;
        ArrayList<b> arrayList = this.k;
        if (c3788fU0 == null) {
            arrayList.add(new b() { // from class: qU0
                @Override // DU0.b
                public final void run() {
                    this.a.r(str);
                }
            });
            return;
        }
        VW0 vw0C = c3788fU0.c(str);
        if (vw0C == null) {
            throw new IllegalArgumentException(C1039Gc0.d("Cannot find marker with name ", str, "."));
        }
        int i = (int) vw0C.b;
        int i2 = ((int) vw0C.c) + i;
        if (this.d == null) {
            arrayList.add(new C6568sU0(this, i, i2));
        } else {
            this.e.k(i, i2 + 0.99f);
        }
    }

    public final void s(final int i) {
        if (this.d == null) {
            this.k.add(new b() { // from class: CU0
                @Override // DU0.b
                public final void run() {
                    this.a.s(i);
                }
            });
        } else {
            MU0 mu0 = this.e;
            mu0.k(i, (int) mu0.o);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.u = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        CS0.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        c cVar = c.g;
        if (z) {
            c cVar2 = this.j;
            if (cVar2 == c.e) {
                l();
                return visible;
            }
            if (cVar2 == cVar) {
                n();
                return visible;
            }
        } else {
            if (this.e.q) {
                k();
                this.j = cVar;
                return visible;
            }
            if (zIsVisible) {
                this.j = c.d;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.k.clear();
        MU0 mu0 = this.e;
        mu0.i(true);
        mu0.a(mu0.h());
        if (isVisible()) {
            return;
        }
        this.j = c.d;
    }

    public final void t(final String str) {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            this.k.add(new b() { // from class: wU0
                @Override // DU0.b
                public final void run() {
                    this.a.t(str);
                }
            });
            return;
        }
        VW0 vw0C = c3788fU0.c(str);
        if (vw0C == null) {
            throw new IllegalArgumentException(C1039Gc0.d("Cannot find marker with name ", str, "."));
        }
        s((int) vw0C.b);
    }

    public final void u(final float f) {
        C3788fU0 c3788fU0 = this.d;
        if (c3788fU0 == null) {
            this.k.add(new b() { // from class: zU0
                @Override // DU0.b
                public final void run() {
                    this.a.u(f);
                }
            });
            return;
        }
        this.e.j(C7099v01.d(c3788fU0.k, c3788fU0.l, f));
        C0564Aa.i();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
