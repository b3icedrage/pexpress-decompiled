package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: tu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6870tu1 extends AbstractC4179hK1 {
    @Override // defpackage.AbstractC4179hK1
    public final void j(Canvas canvas, Paint paint) {
        if (this.t != null) {
            paint.setStyle(Paint.Style.STROKE);
            int iMin = Math.min(this.t.width(), this.t.height()) / 2;
            paint.setStrokeWidth(iMin / 12);
            canvas.drawCircle(this.t.centerX(), this.t.centerY(), iMin, paint);
        }
    }
}
