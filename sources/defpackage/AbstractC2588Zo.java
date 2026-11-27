package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2588Zo extends AbstractC6646sq {
    public final AbstractC2510Yo c;
    public final B42 d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;

    public AbstractC2588Zo(C4454ie2 c4454ie2, B42 b42, AbstractC2510Yo abstractC2510Yo) {
        super(c4454ie2, 2);
        this.d = b42;
        this.c = abstractC2510Yo;
        if (c4454ie2 != null) {
            this.f = new Paint(1);
            Paint paint = new Paint();
            this.e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.h = paint3;
            paint3.setStyle(style);
        }
    }

    public void b(float f, float f2) {
        C4454ie2 c4454ie2 = (C4454ie2) this.b;
        if (c4454ie2 != null && c4454ie2.b.width() > 10.0f && !c4454ie2.c()) {
            RectF rectF = c4454ie2.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            B42 b42 = this.d;
            C3581eV0 c3581eV0B = b42.b(f3, f4);
            RectF rectF2 = c4454ie2.b;
            C3581eV0 c3581eV0B2 = b42.b(rectF2.left, rectF2.bottom);
            float f5 = (float) c3581eV0B2.g;
            float f6 = (float) c3581eV0B.g;
            C3581eV0.c(c3581eV0B);
            C3581eV0.c(c3581eV0B2);
            f = f5;
            f2 = f6;
        }
        c(f, f2);
    }

    public void c(float f, float f2) {
        double dFloor;
        int i;
        AbstractC2510Yo abstractC2510Yo = this.c;
        int i2 = abstractC2510Yo.n;
        double dAbs = Math.abs(f2 - f);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            abstractC2510Yo.k = new float[0];
            abstractC2510Yo.l = 0;
            return;
        }
        double d = AbstractC8067zc2.d(dAbs / ((double) i2));
        double d2 = AbstractC8067zc2.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d2)) > 5) {
            d = Math.floor(d2 * 10.0d);
        }
        double dCeil = d == 0.0d ? 0.0d : Math.ceil(((double) f) / d) * d;
        if (d == 0.0d) {
            dFloor = 0.0d;
        } else {
            dFloor = Math.floor(((double) f2) / d) * d;
            if (dFloor != Double.POSITIVE_INFINITY) {
                double d3 = dFloor + 0.0d;
                dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1L : -1L));
            }
        }
        if (d != 0.0d) {
            i = 0;
            for (double d4 = dCeil; d4 <= dFloor; d4 += d) {
                i++;
            }
        } else {
            i = 0;
        }
        abstractC2510Yo.l = i;
        if (abstractC2510Yo.k.length < i) {
            abstractC2510Yo.k = new float[i];
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (dCeil == 0.0d) {
                dCeil = 0.0d;
            }
            abstractC2510Yo.k[i3] = (float) dCeil;
            dCeil += d;
        }
        if (d < 1.0d) {
            abstractC2510Yo.m = (int) Math.ceil(-Math.log10(d));
        } else {
            abstractC2510Yo.m = 0;
        }
    }
}
