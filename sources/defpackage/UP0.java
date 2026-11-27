package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class UP0 extends AbstractC4754jq<WP0> implements XP0 {
    public UP0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AbstractC4754jq, defpackage.AbstractC7347wA
    public final void e() {
        super.e();
        VP0 vp0 = new VP0(this.x, this.w);
        vp0.h = new Path();
        vp0.m = Bitmap.Config.ARGB_8888;
        vp0.n = new Path();
        vp0.o = new Path();
        vp0.p = new float[4];
        vp0.q = new Path();
        vp0.r = new HashMap<>();
        vp0.s = new float[2];
        vp0.i = this;
        Paint paint = new Paint(1);
        vp0.j = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.u = vp0;
    }

    @Override // defpackage.XP0
    public WP0 getLineData() {
        return (WP0) this.e;
    }

    @Override // defpackage.AbstractC7347wA, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC8032zS abstractC8032zS = this.u;
        if (abstractC8032zS != null && (abstractC8032zS instanceof VP0)) {
            VP0 vp0 = (VP0) abstractC8032zS;
            Canvas canvas = vp0.l;
            if (canvas != null) {
                canvas.setBitmap(null);
                vp0.l = null;
            }
            WeakReference<Bitmap> weakReference = vp0.k;
            if (weakReference != null) {
                Bitmap bitmap = weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                vp0.k.clear();
                vp0.k = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
