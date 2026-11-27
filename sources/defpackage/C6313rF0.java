package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6313rF0 extends RuntimeException {

    @NotNull
    public final Map<String, String> d;

    public C6313rF0(@NotNull Map<String, String> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.d = errors;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getLocalizedMessage() {
        StringBuilder sb = new StringBuilder(this.d.toString());
        int length = sb.length();
        StringBuilder sbSubSequence = sb;
        if (length > 2) {
            sbSubSequence = sb.subSequence(1, sb.length() - 2);
        }
        return sbSubSequence.toString();
    }
}
