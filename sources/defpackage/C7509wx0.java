package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7509wx0<T> {
    public final C7793yI0 a;
    public final C7793yI0 b;
    public final C7793yI0 c;
    public final C7793yI0 d;

    @NotNull
    public final String e;

    @NotNull
    public final QC f;

    public C7509wx0(C7793yI0 c7793yI0, C7793yI0 c7793yI1, C7793yI0 c7793yI2, C7793yI0 c7793yI3, @NotNull String filePath, @NotNull QC classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.a = c7793yI0;
        this.b = c7793yI1;
        this.c = c7793yI2;
        this.d = c7793yI3;
        this.e = filePath;
        this.f = classId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7509wx0)) {
            return false;
        }
        C7509wx0 c7509wx0 = (C7509wx0) obj;
        return this.a.equals(c7509wx0.a) && Intrinsics.a(this.b, c7509wx0.b) && Intrinsics.a(this.c, c7509wx0.c) && this.d.equals(c7509wx0.d) && Intrinsics.a(this.e, c7509wx0.e) && Intrinsics.a(this.f, c7509wx0.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C7793yI0 c7793yI0 = this.b;
        int iHashCode2 = (iHashCode + (c7793yI0 == null ? 0 : c7793yI0.hashCode())) * 31;
        C7793yI0 c7793yI1 = this.c;
        return this.f.hashCode() + C1039Gc0.b((this.d.hashCode() + ((iHashCode2 + (c7793yI1 != null ? c7793yI1.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    @NotNull
    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
