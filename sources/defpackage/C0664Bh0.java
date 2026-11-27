package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0664Bh0 extends C7455wh0 {

    @NotNull
    public final InterfaceC7931yy x;

    @NotNull
    public final EB y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664Bh0(@NotNull C1273Jc0 emailValidationUseCase, @NotNull TK1 shouldCleanProvider, @NotNull ReporterApi reporter, @NotNull VK1 showAlertDialogUseCase, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull InterfaceC7012ub2 userRepository, @NotNull InterfaceC7931yy captchaDialogUseCase, @NotNull EB isCaptchaRequiredUseCaseApi) {
        super(emailValidationUseCase, shouldCleanProvider, reporter, showAlertDialogUseCase, initializeExecutorUseCase, userRepository);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(shouldCleanProvider, "shouldCleanProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(captchaDialogUseCase, "captchaDialogUseCase");
        Intrinsics.checkNotNullParameter(isCaptchaRequiredUseCaseApi, "isCaptchaRequiredUseCaseApi");
        this.x = captchaDialogUseCase;
        this.y = isCaptchaRequiredUseCaseApi;
    }

    @Override // defpackage.C7455wh0
    public final boolean q() {
        r(new CaptchaDestination.RemindPass(0), true, new P4(this, 6));
        return true;
    }

    public final void r(@NotNull CaptchaDestination.RemindPass captchaDestination, boolean z, @NotNull Function0 authAction) {
        Intrinsics.checkNotNullParameter(captchaDestination, "captchaDestination");
        Intrinsics.checkNotNullParameter(authAction, "authAction");
        if (!z) {
            this.w.a = false;
        }
        C5189lv.k(C8056za.j(this), null, new C0586Ah0(captchaDestination, this, z, authAction, null), 3);
    }
}
