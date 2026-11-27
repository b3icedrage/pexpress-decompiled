package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class UE1 extends C7576xG {

    @NotNull
    public final LE1 d;

    @NotNull
    public final CE1 e;

    public UE1(@NotNull LE1 callback, @NotNull CE1 selectAccountScreenPassedUseCase) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(selectAccountScreenPassedUseCase, "selectAccountScreenPassedUseCase");
        this.d = callback;
        this.e = selectAccountScreenPassedUseCase;
    }
}
