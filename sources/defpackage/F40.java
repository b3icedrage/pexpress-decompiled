package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class F40 extends D40 {

    @NotNull
    public final InterfaceC7012ub2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F40(@NotNull C4966kq1 registerAndLoginParams, @NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull InterfaceC7012ub2 userRepository, @NotNull C4923kf appDataRepository) {
        super(registerAndLoginParams, getCodeIfNeededFromDuoAuthUseCase, userRepository, appDataRepository);
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.e = userRepository;
    }
}
