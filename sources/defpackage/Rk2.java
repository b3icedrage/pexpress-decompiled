package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Rk2 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public Rk2(@NotNull String tag, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = tag;
        this.b = workSpecId;
    }
}
