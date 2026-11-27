package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class HB0 implements InputFilter {
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // android.text.InputFilter
    @NotNull
    public final CharSequence filter(@NotNull CharSequence source, int i, int i2, @NotNull Spanned dest, int i3, int i4) {
        String string;
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (source != null) {
            int length = source.length();
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    charSequenceSubSequence = source.subSequence(0, source.length());
                    break;
                }
                if (source.charAt(i5) == '.') {
                    charSequenceSubSequence = source.subSequence(0, i5);
                    break;
                }
                i5++;
            }
            if (charSequenceSubSequence != null) {
                string = charSequenceSubSequence.toString();
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        for (int i6 = 0; i6 < string.length(); i6++) {
            if (!Character.isDigit(string.charAt(i6))) {
                return "";
            }
        }
        return string;
    }
}
