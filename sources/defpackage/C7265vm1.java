package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7265vm1 extends P80 {

    @InterfaceC2691aI1("rate")
    @Nullable
    public final Integer a;

    public C7265vm1(@Nullable Integer num) {
        this.a = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7265vm1) && Intrinsics.a(this.a, ((C7265vm1) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RateProperty(starCount=" + this.a + ")";
    }
}
