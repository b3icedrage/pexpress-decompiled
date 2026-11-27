package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class Il2 extends AbstractC2588Zo {
    public final Hl2 i;
    public final Path j;
    public float[] k;
    public final RectF l;
    public final float[] m;
    public final RectF n;
    public final float[] o;
    public final Path p;

    public Il2(C4454ie2 c4454ie2, Hl2 hl2, B42 b42) {
        super(c4454ie2, b42, hl2);
        this.j = new Path();
        this.k = new float[2];
        this.l = new RectF();
        this.m = new float[2];
        this.n = new RectF();
        this.o = new float[4];
        this.p = new Path();
        this.i = hl2;
        this.f.setColor(-16777216);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setTextSize(AbstractC8067zc2.c(10.0f));
    }

    @Override // defpackage.AbstractC2588Zo
    public void b(float f, float f2) {
        C4454ie2 c4454ie2 = (C4454ie2) this.b;
        if (c4454ie2.b.width() > 10.0f && !c4454ie2.b()) {
            RectF rectF = c4454ie2.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            B42 b42 = this.d;
            C3581eV0 c3581eV0B = b42.b(f3, f4);
            RectF rectF2 = c4454ie2.b;
            C3581eV0 c3581eV0B2 = b42.b(rectF2.right, rectF2.top);
            float f5 = (float) c3581eV0B.e;
            float f6 = (float) c3581eV0B2.e;
            C3581eV0.c(c3581eV0B);
            C3581eV0.c(c3581eV0B2);
            f = f5;
            f2 = f6;
        }
        c(f, f2);
    }

    @Override // defpackage.AbstractC2588Zo
    public final void c(float f, float f2) {
        super.c(f, f2);
        Hl2 hl2 = this.i;
        String strC = hl2.c();
        Paint paint = this.f;
        paint.setTypeface(null);
        paint.setTextSize(hl2.d);
        C3391db0 c3391db0B = AbstractC8067zc2.b(paint, strC);
        float f3 = c3391db0B.e;
        float fA = AbstractC8067zc2.a(paint, "Q");
        double d = 0.0f;
        float fAbs = Math.abs(((float) Math.sin(d)) * fA) + Math.abs(((float) Math.cos(d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(d)) * fA) + Math.abs(((float) Math.sin(d)) * f3);
        C3391db0 c3391db0 = (C3391db0) C3391db0.h.b();
        c3391db0.e = fAbs;
        c3391db0.g = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(c3391db0.e);
        hl2.A = Math.round(c3391db0.g);
        C3391db0.h.c(c3391db0);
        C3391db0.h.c(c3391db0B);
    }

    public void d(Canvas canvas, float f, C3791fV0 c3791fV0) {
        Hl2 hl2 = this.i;
        hl2.getClass();
        int i = hl2.l * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2] = hl2.k[i2 / 2];
        }
        this.d.f(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (((C4454ie2) this.b).h(f2)) {
                String strA = hl2.d().a(hl2.k[i3 / 2]);
                Paint paint = this.f;
                Paint.FontMetrics fontMetrics = AbstractC8067zc2.j;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                int length = strA.length();
                Rect rect = AbstractC8067zc2.i;
                paint.getTextBounds(strA, 0, length, rect);
                float fWidth = 0.0f - rect.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (c3791fV0.e != 0.0f || c3791fV0.g != 0.0f) {
                    fWidth -= rect.width() * c3791fV0.e;
                    f3 -= fontMetrics2 * c3791fV0.g;
                }
                canvas.drawText(strA, fWidth + f2, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
        }
    }

    public final void e(Canvas canvas) {
        Hl2 hl2 = this.i;
        if (hl2.o && hl2.a) {
            int iSave = canvas.save();
            RectF rectF = this.l;
            rectF.set(((C4454ie2) this.b).b);
            rectF.inset(-this.c.h, 0.0f);
            canvas.clipRect(rectF);
            if (this.k.length != this.c.l * 2) {
                this.k = new float[hl2.l * 2];
            }
            float[] fArr = this.k;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = hl2.k;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.d.f(fArr);
            Paint paint = this.e;
            paint.setColor(hl2.g);
            paint.setStrokeWidth(hl2.h);
            paint.setPathEffect(null);
            Path path = this.j;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                float f = fArr[i3];
                float f2 = fArr[i3 + 1];
                C4454ie2 c4454ie2 = (C4454ie2) this.b;
                path.moveTo(f, c4454ie2.b.bottom);
                path.lineTo(f, c4454ie2.b.top);
                canvas.drawPath(path, this.e);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }
}
