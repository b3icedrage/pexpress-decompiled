package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5641o30 {

    @NotNull
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    public C5641o30(@NotNull String token, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.a = token;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
