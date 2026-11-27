package defpackage;

import android.text.TextPaint;

/* JADX INFO: renamed from: kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4888kV {
    public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    public final TextPaint a;

    public C4888kV() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
