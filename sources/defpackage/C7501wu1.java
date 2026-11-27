package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7501wu1 implements InputFilter {
    public final long a;

    public C7501wu1(int i, long j) {
        this.a = (i & 2) != 0 ? 999999999L : j;
    }

    @Override // android.text.InputFilter
    @NotNull
    public final CharSequence filter(@NotNull CharSequence source, int i, int i2, @NotNull Spanned dest, int i3, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        String string = source.subSequence(i, i2).toString();
        int length = string.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (string.charAt(i5) == '.') {
                string = string.substring(0, i5);
                Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                break;
            }
        }
        if (source.length() <= 0 && dest.length() <= 0) {
            return string;
        }
        String string2 = dest.toString();
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Long lC0 = StringsKt.c0(string2);
        long jLongValue = lC0 != null ? lC0.longValue() : 0L;
        if (d.o(dest.toString(), "0", false) || (jLongValue >= this.a && source.length() > 0)) {
            return "";
        }
        if (string.length() != 0) {
            for (int i6 = 0; i6 < string.length(); i6++) {
                if (string.charAt(i6) == '0') {
                }
            }
            if (dest.length() != 0) {
                for (int i7 = 0; i7 < dest.length(); i7++) {
                    if (dest.charAt(i7) == '0') {
                    }
                }
                return "";
            }
        }
        return string;
    }
}
