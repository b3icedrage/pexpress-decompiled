package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import androidx.emoji2.text.g;

/* JADX INFO: renamed from: r72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6288r72 extends U50 {
    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        c.a().getClass();
        T50 t50 = this.e;
        g gVar = t50.b;
        Typeface typeface = gVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(gVar.b, t50.a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
