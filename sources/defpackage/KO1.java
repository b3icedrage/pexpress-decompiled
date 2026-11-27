package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class KO1 extends IO1 {
    public final IO1[] F;
    public int G;

    public KO1() {
        IO1[] io1ArrN = n();
        this.F = io1ArrN;
        for (IO1 io1 : io1ArrN) {
            io1.setCallback(this);
        }
        m(this.F);
    }

    @Override // defpackage.IO1, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        j(canvas);
    }

    @Override // defpackage.IO1
    public final int e() {
        return this.G;
    }

    @Override // defpackage.IO1
    public ValueAnimator f() {
        return null;
    }

    @Override // defpackage.IO1
    public final void g(int i) {
        this.G = i;
        for (int i2 = 0; i2 < l(); i2++) {
            k(i2).g(i);
        }
    }

    @Override // defpackage.IO1, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return C6621sj.k(this.F) || super.isRunning();
    }

    public void j(Canvas canvas) {
        IO1[] io1Arr = this.F;
        if (io1Arr != null) {
            for (IO1 io1 : io1Arr) {
                int iSave = canvas.save();
                io1.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final IO1 k(int i) {
        IO1[] io1Arr = this.F;
        if (io1Arr == null) {
            return null;
        }
        return io1Arr[i];
    }

    public final int l() {
        IO1[] io1Arr = this.F;
        if (io1Arr == null) {
            return 0;
        }
        return io1Arr.length;
    }

    public abstract IO1[] n();

    @Override // defpackage.IO1, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (IO1 io1 : this.F) {
            io1.setBounds(rect);
        }
    }

    @Override // defpackage.IO1, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (IO1 io1 : this.F) {
            io1.start();
        }
    }

    @Override // defpackage.IO1, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (IO1 io1 : this.F) {
            io1.stop();
        }
    }

    @Override // defpackage.IO1
    public final void d(Canvas canvas) {
    }

    public void m(IO1... io1Arr) {
    }
}
