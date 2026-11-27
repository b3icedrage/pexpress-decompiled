package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1932Rn0 {

    @NotNull
    public static final C1802Pw d;

    @NotNull
    public static final C1802Pw e;

    @NotNull
    public static final C1802Pw f;

    @NotNull
    public static final C1802Pw g;

    @NotNull
    public static final C1802Pw h;

    @NotNull
    public static final C1802Pw i;

    @NotNull
    public final C1802Pw a;

    @NotNull
    public final C1802Pw b;
    public final int c;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        d = C1802Pw.a.c(":");
        e = C1802Pw.a.c(":status");
        f = C1802Pw.a.c(":method");
        g = C1802Pw.a.c(":path");
        h = C1802Pw.a.c(":scheme");
        i = C1802Pw.a.c(":authority");
    }

    public C1932Rn0(@NotNull C1802Pw name, @NotNull C1802Pw value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a = name;
        this.b = value;
        this.c = value.f() + name.f() + 32;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1932Rn0)) {
            return false;
        }
        C1932Rn0 c1932Rn0 = (C1932Rn0) obj;
        return Intrinsics.a(this.a, c1932Rn0.a) && Intrinsics.a(this.b, c1932Rn0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.a.q() + ": " + this.b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1932Rn0(@NotNull String name, @NotNull String value) {
        this(C1802Pw.a.c(name), C1802Pw.a.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C1802Pw c1802Pw = C1802Pw.h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1932Rn0(@NotNull C1802Pw name, @NotNull String value) {
        this(name, C1802Pw.a.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C1802Pw c1802Pw = C1802Pw.h;
    }
}
