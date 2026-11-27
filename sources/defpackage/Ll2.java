package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Ll2 extends AbstractC2588Zo {
    public final Kl2 i;
    public final Path j;
    public final RectF k;
    public float[] l;
    public final Path m;
    public final float[] n;
    public final RectF o;

    public Ll2(C4454ie2 c4454ie2, Kl2 kl2, B42 b42) {
        super(c4454ie2, b42, kl2);
        this.j = new Path();
        this.k = new RectF();
        this.l = new float[2];
        new Path();
        new RectF();
        this.m = new Path();
        this.n = new float[2];
        this.o = new RectF();
        this.i = kl2;
        if (c4454ie2 != null) {
            this.f.setColor(-16777216);
            this.f.setTextSize(AbstractC8067zc2.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public float[] d() {
        int length = this.l.length;
        Kl2 kl2 = this.i;
        int i = kl2.l;
        if (length != i * 2) {
            this.l = new float[i * 2];
        }
        float[] fArr = this.l;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = kl2.k[i2 / 2];
        }
        this.d.f(fArr);
        return fArr;
    }

    public void e(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Kl2 kl2 = this.i;
        if (kl2.a && kl2.q) {
            float[] fArrD = d();
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(kl2.d);
            paint.setColor(kl2.e);
            float f4 = kl2.b;
            float fA = (AbstractC8067zc2.a(paint, "A") / 2.5f) + kl2.c;
            Kl2.a aVar = kl2.F;
            Kl2.b bVar = kl2.E;
            Kl2.a aVar2 = Kl2.a.d;
            Kl2.b bVar2 = Kl2.b.d;
            C4454ie2 c4454ie2 = (C4454ie2) this.b;
            if (aVar == aVar2) {
                if (bVar == bVar2) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = c4454ie2.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = c4454ie2.b.left;
                    f3 = f2 + f4;
                }
            } else if (bVar == bVar2) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = c4454ie2.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = c4454ie2.b.right;
                f3 = f - f4;
            }
            Kl2 kl3 = this.i;
            int i = kl3.B ? kl3.l : kl3.l - 1;
            for (int i2 = !kl3.A ? 1 : 0; i2 < i; i2++) {
                canvas.drawText(kl3.b(i2), f3, fArrD[(i2 * 2) + 1] + fA, this.f);
            }
        }
    }

    public void f(Canvas canvas) {
        Kl2 kl2 = this.i;
        if (kl2.a && kl2.p) {
            Paint paint = this.g;
            paint.setColor(kl2.i);
            paint.setStrokeWidth(kl2.j);
            Kl2.a aVar = kl2.F;
            Kl2.a aVar2 = Kl2.a.d;
            C4454ie2 c4454ie2 = (C4454ie2) this.b;
            if (aVar == aVar2) {
                RectF rectF = c4454ie2.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = c4454ie2.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void g(Canvas canvas) {
        Kl2 kl2 = this.i;
        if (kl2.a && kl2.o) {
            int iSave = canvas.save();
            RectF rectF = this.k;
            rectF.set(((C4454ie2) this.b).b);
            rectF.inset(0.0f, -this.c.h);
            canvas.clipRect(rectF);
            float[] fArrD = d();
            Paint paint = this.e;
            paint.setColor(kl2.g);
            paint.setStrokeWidth(kl2.h);
            paint.setPathEffect(null);
            Path path = this.j;
            path.reset();
            for (int i = 0; i < fArrD.length; i += 2) {
                C4454ie2 c4454ie2 = (C4454ie2) this.b;
                int i2 = i + 1;
                path.moveTo(c4454ie2.b.left, fArrD[i2]);
                path.lineTo(c4454ie2.b.right, fArrD[i2]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void h(Canvas canvas) {
        ArrayList arrayList = this.i.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.n;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.m;
        path.reset();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((QP0) arrayList.get(i)).a) {
                int iSave = canvas.save();
                RectF rectF = this.o;
                C4454ie2 c4454ie2 = (C4454ie2) this.b;
                rectF.set(c4454ie2.b);
                rectF.inset(0.0f, -0.0f);
                canvas.clipRect(rectF);
                Paint paint = this.h;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(0);
                paint.setStrokeWidth(0.0f);
                paint.setPathEffect(null);
                fArr[1] = 0.0f;
                this.d.f(fArr);
                path.moveTo(c4454ie2.b.left, fArr[1]);
                path.lineTo(c4454ie2.b.right, fArr[1]);
                canvas.drawPath(path, paint);
                path.reset();
                canvas.restoreToCount(iSave);
            }
        }
    }
}
