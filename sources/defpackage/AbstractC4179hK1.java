package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: hK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4179hK1 extends IO1 {
    public final Paint F;
    public int G;
    public int H;

    public AbstractC4179hK1() {
        g(-1);
        Paint paint = new Paint();
        this.F = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.G);
    }

    @Override // defpackage.IO1
    public final void d(Canvas canvas) {
        Paint paint = this.F;
        paint.setColor(this.G);
        j(canvas, paint);
    }

    @Override // defpackage.IO1
    public final int e() {
        return this.H;
    }

    @Override // defpackage.IO1
    public final void g(int i) {
        this.H = i;
        k();
    }

    public abstract void j(Canvas canvas, Paint paint);

    public final void k() {
        int i = this.s;
        int i2 = this.H;
        this.G = ((((i2 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i2 << 8) >>> 8);
    }

    @Override // defpackage.IO1, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.s = i;
        k();
    }

    @Override // defpackage.IO1, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.F.setColorFilter(colorFilter);
    }
}
