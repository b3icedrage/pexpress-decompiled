package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4530io0 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final C4685jX0 d;
    public final Rect e = X71.a;
    public final Paint g = X71.c;
    public final int h;

    public C4530io0(@NonNull C4685jX0 c4685jX0, int i) {
        this.d = c4685jX0;
        this.h = i;
    }

    public final void a(TextPaint textPaint) {
        this.d.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = C4685jX0.g;
        int i = this.h;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.h;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.g;
            paint2.set(paint);
            C4685jX0 c4685jX0 = this.d;
            c4685jX0.getClass();
            paint2.setColor(G1.c(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i9 = c4685jX0.e;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.e;
                rect.set(i, i10, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
