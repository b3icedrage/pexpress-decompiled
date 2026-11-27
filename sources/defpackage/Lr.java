package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Lr extends AbstractC7066uq {

    @NotNull
    public final InterfaceC6396rf0<C1631Nr> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lr(@NotNull InterfaceC3371dV callbacks, @NotNull InterfaceC8023zP createConfirmationParamsUseCaseApi) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(createConfirmationParamsUseCaseApi, "createConfirmationParamsUseCaseApi");
        this.e = createConfirmationParamsUseCaseApi.a();
    }
}
