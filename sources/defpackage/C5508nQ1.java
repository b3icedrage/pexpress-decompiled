package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5508nQ1 {
    public final int a;

    public C5508nQ1(int i) {
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5508nQ1) && this.a == ((C5508nQ1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return SK.b(new StringBuilder("StepProgress(tintRes="), this.a, ")");
    }
}
