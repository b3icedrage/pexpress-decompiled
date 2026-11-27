package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DQ1 extends AbstractC7066uq {

    @NotNull
    public final C4617jA1 e;

    @NotNull
    public final AbstractC6925u91 f;

    @NotNull
    public final InterfaceC6396rf0<EQ1> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DQ1(@NotNull InterfaceC3371dV callbacks, @NotNull MP createStopConfirmationParamsUseCaseApi, @NotNull C4617jA1 robotTrading, @NotNull AbstractC6925u91 oneClickStopRobotUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(createStopConfirmationParamsUseCaseApi, "createStopConfirmationParamsUseCaseApi");
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(oneClickStopRobotUseCase, "oneClickStopRobotUseCase");
        this.e = robotTrading;
        this.f = oneClickStopRobotUseCase;
        this.g = createStopConfirmationParamsUseCaseApi.a();
    }
}
