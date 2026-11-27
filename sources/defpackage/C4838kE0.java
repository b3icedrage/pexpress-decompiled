package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4838kE0 {

    @NotNull
    public final C5448n71 a;

    @NotNull
    public final Collection<EnumC1976Sc> b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4838kE0(@NotNull C5448n71 nullabilityQualifier, @NotNull Collection<? extends EnumC1976Sc> qualifierApplicabilityTypes, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.a = nullabilityQualifier;
        this.b = qualifierApplicabilityTypes;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4838kE0)) {
            return false;
        }
        C4838kE0 c4838kE0 = (C4838kE0) obj;
        return Intrinsics.a(this.a, c4838kE0.a) && Intrinsics.a(this.b, c4838kE0.b) && this.c == c4838kE0.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return C4564j.f(sb, this.c, ')');
    }

    public C4838kE0(C5448n71 c5448n71, Collection collection) {
        this(c5448n71, collection, c5448n71.a == EnumC5238m71.g);
    }
}
