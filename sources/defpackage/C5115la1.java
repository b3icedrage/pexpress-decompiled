package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: la1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5115la1 implements LeadingMarginSpan {
    public final C4685jX0 d;
    public final String e;
    public final Paint g = X71.c;
    public int h;

    public C5115la1(@NonNull C4685jX0 c4685jX0, @NonNull String str) {
        this.d = c4685jX0;
        this.e = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.g;
            paint2.set(paint);
            C4685jX0 c4685jX0 = this.d;
            c4685jX0.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = c4685jX0.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.e;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = c4685jX0.a;
            if (iMeasureText > i10) {
                this.h = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.h = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.h, this.d.a);
    }
}
