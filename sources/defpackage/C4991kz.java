package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4991kz {

    @NotNull
    public final String a;
    public final int b;

    public C4991kz(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.b = lowerCase.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        String str;
        C4991kz c4991kz = obj instanceof C4991kz ? (C4991kz) obj : null;
        return (c4991kz == null || (str = c4991kz.a) == null || !str.equalsIgnoreCase(this.a)) ? false : true;
    }

    public final int hashCode() {
        return this.b;
    }

    @NotNull
    public final String toString() {
        return this.a;
    }
}
