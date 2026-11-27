package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7963z60 {
    public final boolean a;
    public final boolean b;

    public C7963z60() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7963z60)) {
            return false;
        }
        C7963z60 c7963z60 = (C7963z60) obj;
        return this.a == c7963z60.a && this.b == c7963z60.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "EnabledSwitcher(isEnabled=" + this.a + ", isCheck=" + this.b + ")";
    }

    public /* synthetic */ C7963z60(int i) {
        this(true, false);
    }

    public C7963z60(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
