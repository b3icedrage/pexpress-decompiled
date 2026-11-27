package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2340Ws implements LeadingMarginSpan {
    public final C4685jX0 d;
    public final Rect e = X71.a;
    public final Paint g = X71.c;

    public C2340Ws(@NonNull C4685jX0 c4685jX0) {
        this.d = c4685jX0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        C4685jX0 c4685jX0 = this.d;
        int i8 = c4685jX0.b;
        if (i8 == 0) {
            i8 = (int) ((c4685jX0.a * 0.25f) + 0.5f);
        }
        Paint paint2 = this.g;
        paint2.set(paint);
        c4685jX0.getClass();
        int iC = G1.c(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iC);
        int i9 = i2 * i8;
        int i10 = i + i9;
        int i11 = i9 + i10;
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        Rect rect = this.e;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.d.a;
    }
}
