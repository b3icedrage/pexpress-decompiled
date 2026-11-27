package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: li2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5148li2 extends P80 {

    @InterfaceC2691aI1("type")
    @NotNull
    public final String a;

    public C5148li2(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5148li2) && Intrinsics.a(this.a, ((C5148li2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("WebViewProperty(type="), this.a, ")");
    }
}
