package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5718oQ1 {

    @NotNull
    public final EnumC7637xa0 a;
    public final boolean b;

    public C5718oQ1(EnumC7637xa0 type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5718oQ1)) {
            return false;
        }
        C5718oQ1 c5718oQ1 = (C5718oQ1) obj;
        return this.a.equals(c5718oQ1.a) && this.b == c5718oQ1.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StepRequestData(type=");
        sb.append(this.a);
        sb.append(", groupForNextStep=null, isOn=");
        return C2983be.b(sb, this.b, ")");
    }
}
