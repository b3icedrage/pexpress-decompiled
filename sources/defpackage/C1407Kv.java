package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1407Kv implements LeadingMarginSpan {
    public static final boolean j;
    public final C4685jX0 d;
    public final Paint e = X71.c;
    public final RectF g = X71.b;
    public final Rect h = X71.a;
    public final int i;

    static {
        int i = Build.VERSION.SDK_INT;
        j = 24 == i || 25 == i;
    }

    public C1407Kv(@NonNull C4685jX0 c4685jX0, int i) {
        this.d = c4685jX0;
        this.i = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Rect rect = this.h;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.e;
            paint2.set(paint);
            C4685jX0 c4685jX0 = this.d;
            c4685jX0.getClass();
            int i8 = c4685jX0.a;
            paint2.setColor(paint2.getColor());
            int i9 = c4685jX0.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int iSave = canvas.save();
            try {
                int iMin2 = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = (i8 - iMin2) / 2;
                boolean z2 = j;
                int i11 = this.i;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (i8 * i11)) : (i8 * i11) - i;
                    int i12 = (i10 * i2) + i;
                    int i13 = (i2 * iMin2) + i12;
                    int i14 = i2 * width;
                    iMin = Math.min(i12, i13) + i14;
                    iMax = Math.max(i12, i13) + i14;
                } else {
                    if (i2 <= 0) {
                        i -= i8;
                    }
                    iMin = i + i10;
                    iMax = iMin + iMin2;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i15 = iMin2 + iDescent;
                if (i11 == 0 || i11 == 1) {
                    RectF rectF = this.g;
                    rectF.set(iMin, iDescent, iMax, i15);
                    paint2.setStyle(i11 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i15);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.d.a;
    }
}
