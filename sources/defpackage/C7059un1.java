package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: un1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7059un1 extends C5800on1 {

    @NotNull
    public final InterfaceC7931yy O;

    @NotNull
    public final EB P;

    @NotNull
    public final GP1 Q;

    /* JADX INFO: renamed from: un1$a */
    @InterfaceC3368dU(c = "com.impl.feature.activation.register.ReRegistrationViewModelImpl", f = "ReRegistrationViewModelImpl.kt", l = {93, 114}, m = "registerUser")
    public static final class a extends LM {
        public C7059un1 d;
        public String e;
        public /* synthetic */ Object g;
        public int i;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C7059un1.this.u(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7059un1(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC4599j6 activationRegisterCallback, @NotNull G50 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase, @NotNull InterfaceC7699xq1 registerUseCase, @NotNull NB checkboxValidationUseCase, @NotNull C5232m6 activationShowErrorUseCase, @NotNull InterfaceC5599nq1 registrationDialogsManager, @NotNull InterfaceC7931yy captchaDialogUseCase, @NotNull InterfaceC1549Mq1 registrationCurrenciesUseCase, @NotNull EB isCaptchaRequiredUseCaseApi) {
        super(appData, reporter, activationRegisterCallback, emailValidationUseCase, passwordValidationUseCase, registerUseCase, checkboxValidationUseCase, activationShowErrorUseCase, registrationDialogsManager, registrationCurrenciesUseCase);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationRegisterCallback, "activationRegisterCallback");
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        Intrinsics.checkNotNullParameter(registerUseCase, "registerUseCase");
        Intrinsics.checkNotNullParameter(checkboxValidationUseCase, "checkboxValidationUseCase");
        Intrinsics.checkNotNullParameter(activationShowErrorUseCase, "activationShowErrorUseCase");
        Intrinsics.checkNotNullParameter(registrationDialogsManager, "registrationDialogsManager");
        Intrinsics.checkNotNullParameter(captchaDialogUseCase, "captchaDialogUseCase");
        Intrinsics.checkNotNullParameter(registrationCurrenciesUseCase, "registrationCurrenciesUseCase");
        Intrinsics.checkNotNullParameter(isCaptchaRequiredUseCaseApi, "isCaptchaRequiredUseCaseApi");
        this.O = captchaDialogUseCase;
        this.P = isCaptchaRequiredUseCaseApi;
        this.Q = C1589Ne.i("");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r10.w(r12, r9, r6) == r0) goto L36;
     */
    @Override // defpackage.C5800on1, defpackage.AbstractC1394Kq1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull defpackage.S80 r11, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7059un1.u(java.lang.String, java.lang.String, S80, JM):java.lang.Object");
    }
}
