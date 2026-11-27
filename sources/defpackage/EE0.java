package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EE0 {

    @NotNull
    public static final EE0 d = new EE0(EnumC2599Zr1.STRICT, 6);

    @NotNull
    public final EnumC2599Zr1 a;

    @Nullable
    public final C6751tL0 b;

    @NotNull
    public final EnumC2599Zr1 c;

    public EE0(@NotNull EnumC2599Zr1 reportLevelBefore, @Nullable C6751tL0 c6751tL0, @NotNull EnumC2599Zr1 reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.a = reportLevelBefore;
        this.b = c6751tL0;
        this.c = reportLevelAfter;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EE0)) {
            return false;
        }
        EE0 ee0 = (EE0) obj;
        return this.a == ee0.a && Intrinsics.a(this.b, ee0.b) && this.c == ee0.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C6751tL0 c6751tL0 = this.b;
        return this.c.hashCode() + ((iHashCode + (c6751tL0 == null ? 0 : c6751tL0.h)) * 31);
    }

    @NotNull
    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public EE0(EnumC2599Zr1 enumC2599Zr1, int i) {
        this(enumC2599Zr1, (i & 2) != 0 ? new C6751tL0(1, 0, 0) : null, enumC2599Zr1);
    }
}
