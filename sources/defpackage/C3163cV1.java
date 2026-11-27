package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3163cV1 implements E10.c {
    public int a;
    public int b;

    public C3163cV1() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3163cV1)) {
            return false;
        }
        C3163cV1 c3163cV1 = (C3163cV1) obj;
        return this.a == c3163cV1.a && this.b == c3163cV1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "SummaryOutput(callUpAmount=" + this.a + ", putDownAmount=" + this.b + ")";
    }

    public C3163cV1(int i) {
        this.a = 0;
        this.b = 0;
    }
}
