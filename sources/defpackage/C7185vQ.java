package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7185vQ implements InputFilter {
    @Override // android.text.InputFilter
    @Nullable
    public final CharSequence filter(@NotNull CharSequence source, int i, int i2, @NotNull Spanned dest, int i3, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        while (i < i2) {
            boolean z = false;
            if (source.charAt(i) == '.') {
                Intrinsics.checkNotNullParameter(dest, "<this>");
                int i5 = 0;
                while (true) {
                    if (i5 >= dest.length()) {
                        z = true;
                        break;
                    }
                    if (dest.charAt(i5) == '.') {
                        break;
                    }
                    i5++;
                }
            }
            if (!Character.isDigit(source.charAt(i)) && !z) {
                return "";
            }
            i++;
        }
        return null;
    }
}
