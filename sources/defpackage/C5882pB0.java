package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5882pB0 {
    public final int a;

    @NotNull
    public final ArrayList b;

    public C5882pB0(int i, @NotNull ArrayList instructions) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.a = i;
        this.b = instructions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5882pB0)) {
            return false;
        }
        C5882pB0 c5882pB0 = (C5882pB0) obj;
        return this.a == c5882pB0.a && this.b.equals(c5882pB0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "Instructions(titleRes=" + this.a + ", instructions=" + this.b + ")";
    }
}
