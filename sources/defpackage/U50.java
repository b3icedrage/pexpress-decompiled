package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class U50 extends ReplacementSpan {

    @NonNull
    public final T50 e;
    public final Paint.FontMetricsInt d = new Paint.FontMetricsInt();
    public float g = 1.0f;

    public U50(@NonNull T50 t50) {
        U0.f(t50, "metadata cannot be null");
        this.e = t50;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        T50 t50 = this.e;
        C3060c01 c3060c01B = t50.b();
        int iA = c3060c01B.a(14);
        this.g = fAbs / (iA != 0 ? c3060c01B.b.getShort(iA + c3060c01B.a) : (short) 0);
        C3060c01 c3060c01B2 = t50.b();
        int iA2 = c3060c01B2.a(14);
        if (iA2 != 0) {
            c3060c01B2.b.getShort(iA2 + c3060c01B2.a);
        }
        C3060c01 c3060c01B3 = t50.b();
        int iA3 = c3060c01B3.a(12);
        short s = (short) ((iA3 != 0 ? c3060c01B3.b.getShort(iA3 + c3060c01B3.a) : (short) 0) * this.g);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
