package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OU extends P80 {

    @InterfaceC2691aI1("Deeplink")
    public final boolean a;

    public OU(boolean z) {
        this.a = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OU) && this.a == ((OU) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "DeeplinkProperty(fromDeeplink=" + this.a + ")";
    }
}
