package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2905bF0 {

    @NotNull
    public static final C2905bF0 e = new C2905bF0(null, false);

    @Nullable
    public final EnumC5238m71 a;

    @Nullable
    public final S11 b;
    public final boolean c;
    public final boolean d;

    public C2905bF0(@Nullable EnumC5238m71 enumC5238m71, @Nullable S11 s11, boolean z, boolean z2) {
        this.a = enumC5238m71;
        this.b = s11;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2905bF0)) {
            return false;
        }
        C2905bF0 c2905bF0 = (C2905bF0) obj;
        return this.a == c2905bF0.a && this.b == c2905bF0.b && this.c == c2905bF0.c && this.d == c2905bF0.d;
    }

    public final int hashCode() {
        EnumC5238m71 enumC5238m71 = this.a;
        int iHashCode = (enumC5238m71 == null ? 0 : enumC5238m71.hashCode()) * 31;
        S11 s11 = this.b;
        return Boolean.hashCode(this.d) + C2983be.a((iHashCode + (s11 != null ? s11.hashCode() : 0)) * 31, this.c, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        return C4564j.f(sb, this.d, ')');
    }

    public /* synthetic */ C2905bF0(EnumC5238m71 enumC5238m71, boolean z) {
        this(enumC5238m71, null, z, false);
    }
}
