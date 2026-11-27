package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3326dG {

    @NotNull
    public String a;

    @NotNull
    public String b;

    @Nullable
    public String c;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3326dG)) {
            return false;
        }
        C3326dG c3326dG = (C3326dG) obj;
        return Intrinsics.a(this.a, c3326dG.a) && Intrinsics.a(this.b, c3326dG.b) && Intrinsics.a(this.c, c3326dG.c);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonLoginRequest(login=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append(", token=");
        return C5807oq.b(sb, this.c, ")");
    }
}
