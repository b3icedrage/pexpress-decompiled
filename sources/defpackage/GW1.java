package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GW1 {

    @NotNull
    public final String a;

    public GW1(@NotNull String str) {
        this.a = str;
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("<"), this.a, '>');
    }
}
