package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5448n71 {

    @NotNull
    public final EnumC5238m71 a;
    public final boolean b;

    public C5448n71(@NotNull EnumC5238m71 qualifier, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.a = qualifier;
        this.b = z;
    }

    public static C5448n71 a(C5448n71 c5448n71, EnumC5238m71 qualifier, boolean z, int i) {
        if ((i & 1) != 0) {
            qualifier = c5448n71.a;
        }
        if ((i & 2) != 0) {
            z = c5448n71.b;
        }
        c5448n71.getClass();
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new C5448n71(qualifier, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5448n71)) {
            return false;
        }
        C5448n71 c5448n71 = (C5448n71) obj;
        return this.a == c5448n71.a && this.b == c5448n71.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return C4564j.f(sb, this.b, ')');
    }
}
