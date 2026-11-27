package defpackage;

import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ud0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7018ud0 {

    @NotNull
    public final String a;

    @Nullable
    public final Pattern b;

    public C7018ud0(@NotNull String str) {
        Pattern patternCompile;
        this.a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            QF1.e().p().getLogger().a(NG1.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C7018ud0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C7018ud0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
