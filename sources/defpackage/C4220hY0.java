package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4220hY0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4220hY0() {
        String str = null;
        this(str, 15, str, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4220hY0)) {
            return false;
        }
        C4220hY0 c4220hY0 = (C4220hY0) obj;
        return Intrinsics.a(this.a, c4220hY0.a) && Intrinsics.a(this.b, c4220hY0.b) && this.c == c4220hY0.c && this.d == c4220hY0.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        boolean z = this.c;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int i = (iB + r3) * 31;
        boolean z2 = this.d;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Media(name=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", isExpired=");
        sb.append(this.c);
        sb.append(", hasMediaService=");
        return C4564j.f(sb, this.d, ')');
    }

    public /* synthetic */ C4220hY0(String str, int i, String str2, boolean z) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, false);
    }

    public C4220hY0(@NotNull String name, @NotNull String path, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.a = name;
        this.b = path;
        this.c = z;
        this.d = z2;
    }
}
