package defpackage;

import androidx.work.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6209qk2 {

    @NotNull
    public final String a;

    @NotNull
    public final b b;

    public C6209qk2(@NotNull String workSpecId, @NotNull b progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.a = workSpecId;
        this.b = progress;
    }
}
