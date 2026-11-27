package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5464nC extends Y30<C6513sC> {
    public int c;
    public float d;
    public float e;
    public float f;

    public C5464nC(@NonNull C6513sC c6513sC) {
        this.a = c6513sC;
        this.c = 1;
    }

    public final void b(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    public final void c(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        b(canvas, paint, this.d, this.e, f4);
        b(canvas, paint, this.d, this.e, f4 + f5);
    }

    public final void d(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iB = C8056za.b(this.a.d, this.b.n);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iB);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    public final int e() {
        C6513sC c6513sC = this.a;
        return (c6513sC.h * 2) + c6513sC.g;
    }
}
