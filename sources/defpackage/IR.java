package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class IR extends MetricAffectingSpan {
    public final Typeface d;

    public IR(Typeface typeface) {
        this.d = typeface;
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        Typeface typeface2 = this.d;
        int i = style & (~typeface2.getStyle());
        if ((i & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface2);
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
