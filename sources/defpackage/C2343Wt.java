package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2343Wt {
    public boolean a;
    public boolean b;

    public C2343Wt() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2343Wt)) {
            return false;
        }
        C2343Wt c2343Wt = (C2343Wt) obj;
        return this.a == c2343Wt.a && this.b == c2343Wt.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "BottomNavigationState(isRotated=" + this.a + ", isVisible=" + this.b + ")";
    }

    public C2343Wt(int i) {
        this.a = false;
        this.b = false;
    }
}
