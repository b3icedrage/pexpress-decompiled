package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: mP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5294mP0 extends AbstractC6646sq {
    public Paint c;
    public Paint d;
    public C4871kP0 e;
    public ArrayList f;
    public Paint.FontMetrics g;
    public Path h;

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    public final void b(Canvas canvas, float f, float f2, C5081lP0 c5081lP0, C4871kP0 c4871kP0) {
        int i = c5081lP0.f;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        C4871kP0.b bVar = C4871kP0.b.e;
        C4871kP0.b bVar2 = c5081lP0.b;
        if (bVar2 == bVar) {
            bVar2 = c4871kP0.k;
        }
        Paint paint = this.d;
        paint.setColor(c5081lP0.f);
        float f3 = c5081lP0.c;
        if (Float.isNaN(f3)) {
            f3 = c4871kP0.l;
        }
        float fC = AbstractC8067zc2.c(f3);
        float f4 = fC / 2.0f;
        int iOrdinal = bVar2.ordinal();
        if (iOrdinal == 2) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f + f4, f2, f4, paint);
        } else if (iOrdinal == 3) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, f2 - f4, f + fC, f2 + f4, paint);
        } else if (iOrdinal == 4) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f + f4, f2, f4, paint);
        } else if (iOrdinal == 5) {
            float f5 = c5081lP0.d;
            if (Float.isNaN(f5)) {
                f5 = c4871kP0.m;
            }
            float fC2 = AbstractC8067zc2.c(f5);
            DashPathEffect dashPathEffect = c5081lP0.e;
            if (dashPathEffect == null) {
                c4871kP0.getClass();
                dashPathEffect = null;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(fC2);
            paint.setPathEffect(dashPathEffect);
            Path path = this.h;
            path.reset();
            path.moveTo(f, f2);
            path.lineTo(f + fC, f2);
            canvas.drawPath(path, paint);
        }
        canvas.restoreToCount(iSave);
    }
}
