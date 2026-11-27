package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MU0 extends AbstractC1236Iq implements Choreographer.FrameCallback {
    public float h;
    public boolean i;
    public long j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public C3788fU0 p;
    public boolean q;
    public boolean r;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(h());
        i(true);
    }

    public final float d() {
        C3788fU0 c3788fU0 = this.p;
        if (c3788fU0 == null) {
            return 0.0f;
        }
        float f = this.l;
        float f2 = c3788fU0.k;
        return (f - f2) / (c3788fU0.l - f2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.q) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C3788fU0 c3788fU0 = this.p;
        if (c3788fU0 == null || !this.q) {
            return;
        }
        long j2 = this.j;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / c3788fU0.m) / Math.abs(this.h));
        float f = this.k;
        if (h()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fG = g();
        float fE = e();
        PointF pointF = C7099v01.a;
        if (f2 >= fG && f2 <= fE) {
            z = true;
        }
        float f3 = this.k;
        float fB = C7099v01.b(f2, g(), e());
        this.k = fB;
        if (this.r) {
            fB = (float) Math.floor(fB);
        }
        this.l = fB;
        this.j = j;
        if (!this.r || this.k != f3) {
            b();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.m < getRepeatCount()) {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.m++;
                if (getRepeatMode() == 2) {
                    this.i = !this.i;
                    this.h = -this.h;
                } else {
                    float fE2 = h() ? e() : g();
                    this.k = fE2;
                    this.l = fE2;
                }
                this.j = j;
            } else {
                float fG2 = this.h < 0.0f ? g() : e();
                this.k = fG2;
                this.l = fG2;
                i(true);
                a(h());
            }
        }
        if (this.p != null) {
            float f4 = this.l;
            if (f4 < this.n || f4 > this.o) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.n), Float.valueOf(this.o), Float.valueOf(this.l)));
            }
        }
        C0564Aa.i();
    }

    public final float e() {
        C3788fU0 c3788fU0 = this.p;
        if (c3788fU0 == null) {
            return 0.0f;
        }
        float f = this.o;
        return f == 2.1474836E9f ? c3788fU0.l : f;
    }

    public final float g() {
        C3788fU0 c3788fU0 = this.p;
        if (c3788fU0 == null) {
            return 0.0f;
        }
        float f = this.n;
        return f == -2.1474836E9f ? c3788fU0.k : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fG;
        float fE;
        float fG2;
        if (this.p == null) {
            return 0.0f;
        }
        if (h()) {
            fG = e() - this.l;
            fE = e();
            fG2 = g();
        } else {
            fG = this.l - g();
            fE = e();
            fG2 = g();
        }
        return fG / (fE - fG2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C3788fU0 c3788fU0 = this.p;
        if (c3788fU0 == null) {
            return 0L;
        }
        return (long) c3788fU0.b();
    }

    public final boolean h() {
        return this.h < 0.0f;
    }

    public final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.q = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.q;
    }

    public final void j(float f) {
        if (this.k == f) {
            return;
        }
        float fB = C7099v01.b(f, g(), e());
        this.k = fB;
        if (this.r) {
            fB = (float) Math.floor(fB);
        }
        this.l = fB;
        this.j = 0L;
        b();
    }

    public final void k(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        C3788fU0 c3788fU0 = this.p;
        float f3 = c3788fU0 == null ? -3.4028235E38f : c3788fU0.k;
        float f4 = c3788fU0 == null ? Float.MAX_VALUE : c3788fU0.l;
        float fB = C7099v01.b(f, f3, f4);
        float fB2 = C7099v01.b(f2, f3, f4);
        if (fB == this.n && fB2 == this.o) {
            return;
        }
        this.n = fB;
        this.o = fB2;
        j((int) C7099v01.b(this.l, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.i) {
            return;
        }
        this.i = false;
        this.h = -this.h;
    }
}
