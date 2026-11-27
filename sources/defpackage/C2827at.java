package defpackage;

import androidx.lifecycle.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2827at<T> {

    @NotNull
    public final b<T> a;

    @NotNull
    public final C7661xg0 b;

    @NotNull
    public final EM c;

    @NotNull
    public final I6 d;

    @Nullable
    public C2936bP1 e;

    @Nullable
    public C2936bP1 f;

    public C2827at(@NotNull b liveData, @NotNull C7661xg0 block, @NotNull EM scope, @NotNull I6 onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.a = liveData;
        this.b = block;
        this.c = scope;
        this.d = onDone;
    }
}
