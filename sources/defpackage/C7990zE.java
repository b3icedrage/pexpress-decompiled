package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: zE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7990zE extends MetricAffectingSpan {
    public final C4685jX0 d;

    public C7990zE(@NonNull C4685jX0 c4685jX0) {
        this.d = c4685jX0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C4685jX0 c4685jX0 = this.d;
        c4685jX0.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c4685jX0.getClass();
        textPaint.bgColor = G1.c(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.d.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
