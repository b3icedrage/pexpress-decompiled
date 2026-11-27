package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1643Nv {
    public final int a;

    public C1643Nv(int i) {
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1643Nv) && this.a == ((C1643Nv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return SK.b(new StringBuilder("ButtonStateStep(buttonTextRes="), this.a, ")");
    }
}
