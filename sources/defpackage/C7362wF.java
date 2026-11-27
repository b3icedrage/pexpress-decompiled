package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7362wF {
    public final boolean a;

    public C7362wF(boolean z) {
        this.a = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7362wF) && this.a == ((C7362wF) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "CommonAvailableAccountEvent(isAvailable=" + this.a + ")";
    }
}
