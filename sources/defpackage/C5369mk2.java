package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5369mk2 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public C5369mk2(@NotNull String name, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = name;
        this.b = workSpecId;
    }
}
