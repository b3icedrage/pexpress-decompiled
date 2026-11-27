package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class Z82 implements Spannable {
    public boolean d = false;

    @NonNull
    public Spannable e;

    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof C2563Zf1;
        }
    }

    public static class b extends a {
        @Override // Z82.a
        public final boolean a(CharSequence charSequence) {
            return C6174qc.b(charSequence) || (charSequence instanceof C2563Zf1);
        }
    }

    public Z82(@NonNull Spannable spannable) {
        this.e = spannable;
    }

    public final void a() {
        Spannable spannable = this.e;
        if (!this.d) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.e = new SpannableString(spannable);
            }
        }
        this.d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream chars() {
        return this.e.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream codePoints() {
        return this.e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.e.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.e.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.e.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.e.toString();
    }

    public Z82(@NonNull CharSequence charSequence) {
        this.e = new SpannableString(charSequence);
    }
}
