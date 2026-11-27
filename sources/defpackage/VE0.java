package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VE0 {

    @NotNull
    public final EnumC2880b72 a;

    @NotNull
    public final YE0 b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final Set<H62> e;

    @Nullable
    public final AbstractC5706oM1 f;

    public /* synthetic */ VE0(EnumC2880b72 enumC2880b72, boolean z, boolean z2, Set set, int i) {
        this(enumC2880b72, YE0.d, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static VE0 a(VE0 ve0, YE0 ye0, boolean z, Set set, AbstractC5706oM1 abstractC5706oM1, int i) {
        EnumC2880b72 howThisTypeIsUsed = ve0.a;
        if ((i & 2) != 0) {
            ye0 = ve0.b;
        }
        YE0 flexibility = ye0;
        if ((i & 4) != 0) {
            z = ve0.c;
        }
        boolean z2 = z;
        boolean z3 = ve0.d;
        if ((i & 16) != 0) {
            set = ve0.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            abstractC5706oM1 = ve0.f;
        }
        ve0.getClass();
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new VE0(howThisTypeIsUsed, flexibility, z2, z3, set2, abstractC5706oM1);
    }

    @Nullable
    public final Set<H62> b() {
        return this.e;
    }

    @NotNull
    public final VE0 c(@NotNull YE0 flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return a(this, flexibility, false, null, null, 61);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof VE0)) {
            return false;
        }
        VE0 ve0 = (VE0) obj;
        return Intrinsics.a(ve0.f, this.f) && ve0.a == this.a && ve0.b == this.b && ve0.c == this.c && ve0.d == this.d;
    }

    public final int hashCode() {
        AbstractC5706oM1 abstractC5706oM1 = this.f;
        int iHashCode = abstractC5706oM1 != null ? abstractC5706oM1.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    @NotNull
    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VE0(@NotNull EnumC2880b72 howThisTypeIsUsed, @NotNull YE0 flexibility, boolean z, boolean z2, @Nullable Set<? extends H62> set, @Nullable AbstractC5706oM1 abstractC5706oM1) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.a = howThisTypeIsUsed;
        this.b = flexibility;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = abstractC5706oM1;
    }
}
