package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5462nB0 extends AbstractC7066uq {

    @NotNull
    public final InterfaceC6396rf0<C5882pB0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5462nB0(@NotNull C3312dB0 callbacks, @NotNull InterfaceC4619jB0 instructionListSaveUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(instructionListSaveUseCase, "instructionListSaveUseCase");
        this.e = instructionListSaveUseCase.b();
    }
}
