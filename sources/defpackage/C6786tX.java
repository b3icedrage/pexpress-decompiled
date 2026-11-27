package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6786tX {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C6786tX(@NotNull String workSpecId, @NotNull String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.a = workSpecId;
        this.b = prerequisiteId;
    }
}
