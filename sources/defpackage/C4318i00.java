package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import androidx.annotation.NonNull;
import defpackage.AbstractC1470Lq;
import java.util.ArrayList;

/* JADX INFO: renamed from: i00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4318i00<S extends AbstractC1470Lq> extends V30 {
    public static final a u = new a();
    public final C5464nC p;
    public final GO1 q;
    public final FO1 r;
    public float s;
    public boolean t;

    /* JADX INFO: renamed from: i00$a */
    public class a extends G1 {
    }

    public C4318i00(@NonNull Context context, @NonNull AbstractC1470Lq abstractC1470Lq, @NonNull C5464nC c5464nC) {
        super(context, abstractC1470Lq);
        this.t = false;
        this.p = c5464nC;
        c5464nC.b = this;
        GO1 go1 = new GO1();
        this.q = go1;
        go1.b = 1.0f;
        go1.c = false;
        go1.a = Math.sqrt(50.0f);
        go1.c = false;
        FO1 fo1 = new FO1(this);
        fo1.s = Float.MAX_VALUE;
        fo1.t = false;
        this.r = fo1;
        fo1.r = go1;
        if (this.l != 1.0f) {
            this.l = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.p.a(canvas, getBounds(), d());
            C5464nC c5464nC = this.p;
            Paint paint = this.m;
            c5464nC.d(canvas, paint);
            this.p.c(canvas, paint, 0.0f, this.s, C8056za.b(this.e.c[0], this.n));
            canvas.restore();
        }
    }

    @Override // defpackage.V30
    public final boolean f(boolean z, boolean z2, boolean z3) {
        boolean zF = super.f(z, z2, z3);
        C0570Ac c0570Ac = this.g;
        ContentResolver contentResolver = this.d.getContentResolver();
        c0570Ac.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.t = true;
            return zF;
        }
        this.t = false;
        float f2 = 50.0f / f;
        GO1 go1 = this.q;
        go1.getClass();
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        go1.a = Math.sqrt(f2);
        go1.c = false;
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.c();
        this.s = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.t;
        FO1 fo1 = this.r;
        if (z) {
            fo1.c();
            this.s = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        fo1.b = this.s * 10000.0f;
        fo1.c = true;
        float f = i;
        if (fo1.f) {
            fo1.s = f;
            return true;
        }
        if (fo1.r == null) {
            fo1.r = new GO1(f);
        }
        GO1 go1 = fo1.r;
        double d = f;
        go1.i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f2 = fo1.g;
        if (d2 < f2) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(fo1.i * 0.75f);
        go1.d = dAbs;
        go1.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = fo1.f;
        if (!z2 && !z2) {
            fo1.f = true;
            if (!fo1.c) {
                fo1.e.getClass();
                fo1.b = fo1.d.s * 10000.0f;
            }
            float f3 = fo1.b;
            if (f3 > Float.MAX_VALUE || f3 < f2) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal<C6803tc> threadLocal = C6803tc.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new C6803tc());
            }
            C6803tc c6803tc = threadLocal.get();
            ArrayList<C6803tc.b> arrayList = c6803tc.b;
            if (arrayList.size() == 0) {
                if (c6803tc.d == null) {
                    c6803tc.d = new C6803tc.d(c6803tc.c);
                }
                C6803tc.d dVar = c6803tc.d;
                dVar.b.postFrameCallback(dVar.c);
            }
            if (!arrayList.contains(fo1)) {
                arrayList.add(fo1);
                return true;
            }
        }
        return true;
    }
}
