package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: sY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6581sY1 implements LeadingMarginSpan {
    public final C4685jX0 d;
    public final Rect e = X71.a;
    public final Paint g = X71.c;

    public C6581sY1(@NonNull C4685jX0 c4685jX0) {
        this.d = c4685jX0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = ((i5 - i3) / 2) + i3;
        Paint paint2 = this.g;
        paint2.set(paint);
        C4685jX0 c4685jX0 = this.d;
        c4685jX0.getClass();
        paint2.setColor(G1.c(paint2.getColor(), 25));
        paint2.setStyle(Paint.Style.FILL);
        int i9 = c4685jX0.f;
        if (i9 >= 0) {
            paint2.setStrokeWidth(i9);
        }
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i10 = i8 - strokeWidth;
        int i11 = i8 + strokeWidth;
        Rect rect = this.e;
        rect.set(i, i10, width, i11);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
