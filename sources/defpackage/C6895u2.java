package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6895u2 {

    @NotNull
    public final C6685t2 a;

    @NotNull
    public final C6685t2 b;

    public C6895u2(@NotNull C6685t2 firstStep, @NotNull C6685t2 secondStep) {
        Intrinsics.checkNotNullParameter(firstStep, "firstStep");
        Intrinsics.checkNotNullParameter(secondStep, "secondStep");
        this.a = firstStep;
        this.b = secondStep;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6895u2)) {
            return false;
        }
        C6895u2 c6895u2 = (C6895u2) obj;
        return Intrinsics.a(this.a, c6895u2.a) && Intrinsics.a(this.b, c6895u2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AccountActivationSteps(firstStep=" + this.a + ", secondStep=" + this.b + ")";
    }
}
