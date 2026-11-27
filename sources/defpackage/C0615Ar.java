package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615Ar {
    public final int a;

    @NotNull
    public final String b;
    public final boolean c;

    public C0615Ar(@NotNull String backgroundUrl, int i, boolean z) {
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        this.a = i;
        this.b = backgroundUrl;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0615Ar)) {
            return false;
        }
        C0615Ar c0615Ar = (C0615Ar) obj;
        return this.a == c0615Ar.a && Intrinsics.a(this.b, c0615Ar.b) && this.c == c0615Ar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + C1039Gc0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BenefitsCardModel(text=");
        sb.append(this.a);
        sb.append(", backgroundUrl=");
        sb.append(this.b);
        sb.append(", wasShown=");
        return C2983be.b(sb, this.c, ")");
    }
}
