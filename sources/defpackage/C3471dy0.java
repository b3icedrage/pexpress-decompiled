package defpackage;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3471dy0 {

    @NotNull
    public final EnumC7224vc0 a;

    @NotNull
    public final Number b;
    public final int c;
    public final int d;

    public C3471dy0(@NotNull EnumC7224vc0 id, @NotNull Number current, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(current, "current");
        this.a = id;
        this.b = current;
        this.c = i;
        this.d = i2;
    }

    @NotNull
    public final IntRange a(boolean z) {
        return new IntRange(z ? 0 : this.c, z ? Api.BaseClientBuilder.API_PRIORITY_OTHER : this.d, 1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3471dy0)) {
            return false;
        }
        C3471dy0 c3471dy0 = (C3471dy0) obj;
        return this.a == c3471dy0.a && this.b.equals(c3471dy0.b) && this.c == c3471dy0.c && this.d == c3471dy0.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + EF0.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorFieldsWithConstraints(id=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", min=");
        sb.append(this.c);
        sb.append(", max=");
        return SK.b(sb, this.d, ")");
    }
}
