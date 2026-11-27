package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6685t2 {

    @NotNull
    public final EnumC5298mQ1 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public C6685t2(@NotNull EnumC5298mQ1 stepCount, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(stepCount, "stepCount");
        this.a = stepCount;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6685t2)) {
            return false;
        }
        C6685t2 c6685t2 = (C6685t2) obj;
        return this.a == c6685t2.a && this.b == c6685t2.b && this.c == c6685t2.c && this.d == c6685t2.d && this.e == c6685t2.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + C2983be.a(EF0.a(this.c, EF0.a(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountActivationStepModel(stepCount=");
        sb.append(this.a);
        sb.append(", descriptionItemTextResId=");
        sb.append(this.b);
        sb.append(", iconResId=");
        sb.append(this.c);
        sb.append(", iconIsEnabled=");
        sb.append(this.d);
        sb.append(", textIsEnabled=");
        return C2983be.b(sb, this.e, ")");
    }
}
