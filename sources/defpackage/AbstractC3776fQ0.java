package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: fQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3776fQ0 extends AbstractC3986gQ0 {
    public final void g(Canvas canvas, Path path, Drawable drawable) {
        DisplayMetrics displayMetrics = AbstractC8067zc2.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        RectF rectF = ((C4454ie2) this.b).b;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
