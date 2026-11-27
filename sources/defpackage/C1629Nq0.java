package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1629Nq0 {

    @NotNull
    public static final C1629Nq0 b;

    @NotNull
    public static final C1629Nq0 c;

    @NotNull
    public static final C1629Nq0 d;

    @NotNull
    public static final List<C1629Nq0> e;

    @NotNull
    public final String a;

    static {
        C1629Nq0 c1629Nq0 = new C1629Nq0("GET");
        b = c1629Nq0;
        C1629Nq0 c1629Nq1 = new C1629Nq0("POST");
        c = c1629Nq1;
        C1629Nq0 c1629Nq2 = new C1629Nq0("PUT");
        C1629Nq0 c1629Nq3 = new C1629Nq0("PATCH");
        C1629Nq0 c1629Nq4 = new C1629Nq0("DELETE");
        C1629Nq0 c1629Nq5 = new C1629Nq0("HEAD");
        d = c1629Nq5;
        e = WE.f(c1629Nq0, c1629Nq1, c1629Nq2, c1629Nq3, c1629Nq4, c1629Nq5, new C1629Nq0("OPTIONS"));
    }

    public C1629Nq0(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a = value;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1629Nq0) && Intrinsics.a(this.a, ((C1629Nq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("HttpMethod(value="), this.a, ')');
    }
}
