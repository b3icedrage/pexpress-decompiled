package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Iv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252Iv0 {

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    public C1252Iv0() {
        this(null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252Iv0)) {
            return false;
        }
        C1252Iv0 c1252Iv0 = (C1252Iv0) obj;
        return Intrinsics.a(this.a, c1252Iv0.a) && Intrinsics.a(this.b, c1252Iv0.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Identity(userId=");
        sb.append(this.a);
        sb.append(", deviceId=");
        return C1039Gc0.e(sb, this.b, ')');
    }

    public C1252Iv0(@Nullable String str, @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }
}
