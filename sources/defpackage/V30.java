package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class V30 extends Drawable implements InterfaceC1817Qb {
    public static final a o = new a(Float.class, "growFraction");
    public final Context d;
    public final AbstractC1470Lq e;
    public ObjectAnimator h;
    public ObjectAnimator i;
    public ArrayList j;
    public boolean k;
    public float l;
    public int n;
    public final Paint m = new Paint();
    public C0570Ac g = new C0570Ac();

    public class a extends Property<V30, Float> {
        @Override // android.util.Property
        public final Float get(V30 v30) {
            return Float.valueOf(v30.d());
        }

        @Override // android.util.Property
        public final void set(V30 v30, Float f) {
            V30 v31 = v30;
            float fFloatValue = f.floatValue();
            if (v31.l != fFloatValue) {
                v31.l = fFloatValue;
                v31.invalidateSelf();
            }
        }
    }

    public V30(@NonNull Context context, @NonNull AbstractC1470Lq abstractC1470Lq) {
        this.d = context;
        this.e = abstractC1470Lq;
        setAlpha(255);
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void a() {
        this.j.clear();
        this.j = null;
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void c(@NonNull InterfaceC1817Qb.a aVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (this.j.contains(aVar)) {
            return;
        }
        this.j.add(aVar);
    }

    public final float d() {
        AbstractC1470Lq abstractC1470Lq = this.e;
        if (abstractC1470Lq.e == 0 && abstractC1470Lq.f == 0) {
            return 1.0f;
        }
        return this.l;
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        C0570Ac c0570Ac = this.g;
        ContentResolver contentResolver = this.d.getContentResolver();
        c0570Ac.getClass();
        return f(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean f(boolean z, boolean z2, boolean z3) {
        int i = 0;
        ObjectAnimator objectAnimator = this.h;
        a aVar = o;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.h.setInterpolator(C7013uc.b);
            ObjectAnimator objectAnimator2 = this.h;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.h = objectAnimator2;
            objectAnimator2.addListener(new T30(this));
        }
        if (this.i == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.i = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.i.setInterpolator(C7013uc.b);
            ObjectAnimator objectAnimator3 = this.i;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.i = objectAnimator3;
            objectAnimator3.addListener(new U30(this, i));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.h : this.i;
            ObjectAnimator objectAnimator5 = z ? this.i : this.h;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.k;
                    this.k = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.k = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.k;
                    this.k = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.k = z5;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                AbstractC1470Lq abstractC1470Lq = this.e;
                if (!z ? abstractC1470Lq.f != 0 : abstractC1470Lq.e != 0) {
                    boolean z7 = this.k;
                    this.k = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.k = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final boolean g(@NonNull InterfaceC1817Qb.a aVar) {
        ArrayList arrayList = this.j;
        if (arrayList == null || !arrayList.contains(aVar)) {
            return false;
        }
        this.j.remove(aVar);
        if (!this.j.isEmpty()) {
            return true;
        }
        this.j = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.i;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return e(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
