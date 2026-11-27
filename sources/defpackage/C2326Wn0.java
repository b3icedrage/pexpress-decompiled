package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2326Wn0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C2326Wn0(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a = name;
        this.b = value;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2326Wn0)) {
            return false;
        }
        C2326Wn0 c2326Wn0 = (C2326Wn0) obj;
        return d.i(c2326Wn0.a, this.a) && d.i(c2326Wn0.b, this.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return C5807oq.b(sb, this.b, ", escapeValue=false)");
    }
}
