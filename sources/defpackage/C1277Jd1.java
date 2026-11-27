package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277Jd1 {

    @NotNull
    public final String a;

    public C1277Jd1(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("Phase('"), this.a, "')");
    }
}
