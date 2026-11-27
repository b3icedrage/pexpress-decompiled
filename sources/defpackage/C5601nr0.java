package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5601nr0 {

    @NotNull
    public final A62 a;

    @NotNull
    public final Object b;

    public C5601nr0(@NotNull A62 expectedType, @NotNull Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = expectedType;
        this.b = response;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5601nr0)) {
            return false;
        }
        C5601nr0 c5601nr0 = (C5601nr0) obj;
        return Intrinsics.a(this.a, c5601nr0.a) && Intrinsics.a(this.b, c5601nr0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }
}
