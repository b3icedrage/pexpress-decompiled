package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5254mC extends AbstractC4179hK1 {
    @Override // defpackage.AbstractC4179hK1
    public final void j(Canvas canvas, Paint paint) {
        Rect rect = this.t;
        if (rect != null) {
            canvas.drawCircle(this.t.centerX(), this.t.centerY(), Math.min(rect.width(), this.t.height()) / 2, paint);
        }
    }
}
