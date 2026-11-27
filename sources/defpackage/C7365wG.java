package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7365wG {

    @NotNull
    public final List<String> a;

    public C7365wG(@NotNull List<String> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = result;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7365wG) && Intrinsics.a(this.a, ((C7365wG) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonVPN(result=" + this.a + ")";
    }
}
