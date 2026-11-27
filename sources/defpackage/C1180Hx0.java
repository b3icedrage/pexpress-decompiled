package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.annotation.NonNull;
import defpackage.AbstractC1470Lq;

/* JADX INFO: renamed from: Hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1180Hx0<S extends AbstractC1470Lq> extends V30 {
    public C5464nC p;
    public C6303rC q;

    public C1180Hx0() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.p.a(canvas, getBounds(), d());
        C5464nC c5464nC = this.p;
        Paint paint = this.m;
        c5464nC.d(canvas, paint);
        int i = 0;
        while (true) {
            C6303rC c6303rC = this.q;
            int[] iArr = c6303rC.c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            C5464nC c5464nC2 = this.p;
            float[] fArr = c6303rC.b;
            int i2 = i * 2;
            c5464nC2.c(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // defpackage.V30
    public final boolean f(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        boolean zF = super.f(z, z2, z3);
        if (!isRunning() && (objectAnimator = this.q.d) != null) {
            objectAnimator.cancel();
        }
        C0570Ac c0570Ac = this.g;
        ContentResolver contentResolver = this.d.getContentResolver();
        c0570Ac.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.q.a();
        }
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p.e();
    }
}
