package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YK1 extends W00 {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YK1)) {
            return false;
        }
        ((YK1) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        return "ShowAutoSelectionSelectedAlertEvent(activeBtnCallback=null, passiveBtnCallback=null)";
    }
}
