package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2084Tm extends C1146Hm {

    @NotNull
    public final InterfaceC1549Mq1 f0;

    @NotNull
    public final InterfaceC7931yy g0;

    @NotNull
    public final EB h0;

    /* JADX INFO: renamed from: Tm$a */
    @InterfaceC3368dU(c = "com.impl.feature.registration.screens.authorization.AuthorizationViewModelImpl$onCurrencyChecked$1", f = "AuthorizationViewModelImpl.kt", l = {152}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C2098Tq1 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2098Tq1 c2098Tq1, JM<? super a> jm) {
            super(2, jm);
            this.g = c2098Tq1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2084Tm.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1549Mq1 interfaceC1549Mq1 = C2084Tm.this.f0;
                this.d = 1;
                if (interfaceC1549Mq1.b(this.g, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Tm$b */
    @InterfaceC3368dU(c = "com.impl.feature.registration.screens.authorization.AuthorizationViewModelImpl$onInit$1", f = "AuthorizationViewModelImpl.kt", l = {144}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2084Tm.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            MN mn = MN.d;
            int i = this.d;
            C2084Tm c2084Tm = C2084Tm.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1549Mq1 interfaceC1549Mq1 = c2084Tm.f0;
                this.d = 1;
                obj = interfaceC1549Mq1.a(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            List list = (List) obj;
            c2084Tm.Y.setValue(list);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C2098Tq1) next).c);
            C2098Tq1 c2098Tq1 = (C2098Tq1) next;
            if (c2098Tq1 != null) {
                c2084Tm.c(c2098Tq1);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Tm$c */
    @InterfaceC3368dU(c = "com.impl.feature.registration.screens.authorization.AuthorizationViewModelImpl$showCaptcha$1", f = "AuthorizationViewModelImpl.kt", l = {105}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ CaptchaDestination g;
        public final /* synthetic */ C2084Tm h;
        public final /* synthetic */ CQ0 i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ Function0<Unit> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, CaptchaDestination captchaDestination, C2084Tm c2084Tm, CQ0 cq0, boolean z, Function0 function0, JM jm) {
            super(2, jm);
            this.e = str;
            this.g = captchaDestination;
            this.h = c2084Tm;
            this.i = cq0;
            this.j = z;
            this.k = function0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, this.h, this.i, this.j, this.k, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                final C2084Tm c2084Tm = this.h;
                EB eb = c2084Tm.h0;
                Map mapB = this.j ? OW0.b(new Pair("captcha.after_rejection", Boolean.TRUE)) : PW0.c();
                final Function0<Unit> function0 = this.k;
                Function1 function1 = new Function1() { // from class: Um
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        String captcha = (String) obj2;
                        C2084Tm c2084Tm2 = c2084Tm;
                        c2084Tm2.getClass();
                        Intrinsics.checkNotNullParameter(captcha, "captcha");
                        c2084Tm2.e0.setValue(captcha);
                        function0.invoke();
                        return Unit.a;
                    }
                };
                this.d = 1;
                if (C1730Oy.b(this.e, this.g, eb, c2084Tm.g0, this.i, mapB, function1, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2084Tm(@NotNull C1273Jc0 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase, @NotNull NB checkboxValidationUseCase, @NotNull InterfaceC7699xq1 registerUseCase, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC1547Mq baseRegistrationCallback, @NotNull TK1 shouldCleanProvider, @NotNull RU1 successRegisterUseCase, @NotNull InterfaceC1691Ol authorizationCallbacks, @NotNull EC1 savedEmailProvider, @NotNull XV showErrorUseCase, @NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull OU1 successLoginUseCase, @NotNull WS0 loginUseCase, @NotNull InterfaceC4374iF1 selectedAccountProvider, @NotNull InterfaceC5599nq1 registerDialogsManager, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull InterfaceC1549Mq1 registrationCurrenciesUseCase, @NotNull InterfaceC7931yy captchaDialogUseCase, @NotNull InterfaceC5703oL1 showLoginErrorDialogUserCase, @NotNull EB isCaptchaRequiredUseCaseApi, @NotNull C4612j90 events) {
        super(emailValidationUseCase, passwordValidationUseCase, checkboxValidationUseCase, registerUseCase, appData, reporter, baseRegistrationCallback, shouldCleanProvider, successRegisterUseCase, authorizationCallbacks, savedEmailProvider, showErrorUseCase, getCodeIfNeededFromDuoAuthUseCase, successLoginUseCase, loginUseCase, selectedAccountProvider, registerDialogsManager, initializeExecutorUseCase, showLoginErrorDialogUserCase, events);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        Intrinsics.checkNotNullParameter(checkboxValidationUseCase, "checkboxValidationUseCase");
        Intrinsics.checkNotNullParameter(registerUseCase, "registerUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(baseRegistrationCallback, "baseRegistrationCallback");
        Intrinsics.checkNotNullParameter(shouldCleanProvider, "shouldCleanProvider");
        Intrinsics.checkNotNullParameter(successRegisterUseCase, "successRegisterUseCase");
        Intrinsics.checkNotNullParameter(authorizationCallbacks, "authorizationCallbacks");
        Intrinsics.checkNotNullParameter(savedEmailProvider, "savedEmailProvider");
        Intrinsics.checkNotNullParameter(showErrorUseCase, "showErrorUseCase");
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(successLoginUseCase, "successLoginUseCase");
        Intrinsics.checkNotNullParameter(loginUseCase, "loginUseCase");
        Intrinsics.checkNotNullParameter(selectedAccountProvider, "selectedAccountProvider");
        Intrinsics.checkNotNullParameter(registerDialogsManager, "registerDialogsManager");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(registrationCurrenciesUseCase, "registrationCurrenciesUseCase");
        Intrinsics.checkNotNullParameter(captchaDialogUseCase, "captchaDialogUseCase");
        Intrinsics.checkNotNullParameter(showLoginErrorDialogUserCase, "showLoginErrorDialogUserCase");
        Intrinsics.checkNotNullParameter(isCaptchaRequiredUseCaseApi, "isCaptchaRequiredUseCaseApi");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f0 = registrationCurrenciesUseCase;
        this.g0 = captchaDialogUseCase;
        this.h0 = isCaptchaRequiredUseCaseApi;
    }

    public static /* synthetic */ void G(C2084Tm c2084Tm, CaptchaDestination captchaDestination, Function0 function0, int i) {
        c2084Tm.F(captchaDestination, (i & 2) == 0, captchaDestination instanceof CaptchaDestination.Login ? "login" : "register", function0);
    }

    @Override // defpackage.C1146Hm
    @Nullable
    public final Object C(@NotNull CaptchaDestination captchaDestination, @NotNull CommonError commonError, @NotNull String str, @NotNull C8104zm c8104zm) {
        F(captchaDestination, true, "register", new O4(this, 2));
        return Unit.a;
    }

    public final void F(@NotNull CaptchaDestination captchaDestination, boolean z, @NotNull String flow, @NotNull Function0<Unit> authAction) {
        Intrinsics.checkNotNullParameter(captchaDestination, "captchaDestination");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(authAction, "authAction");
        CQ0 cq0Y = y();
        if (!cq0Y.isEmpty()) {
            x();
        }
        C5189lv.k(C8056za.j(this), null, new c(flow, captchaDestination, this, cq0Y, z, authAction, null), 3);
    }

    @Override // defpackage.C1146Hm, defpackage.InterfaceC1472Lq1
    public final void c(@NotNull C2098Tq1 registrationCurrency) {
        Intrinsics.checkNotNullParameter(registrationCurrency, "registrationCurrency");
        C5189lv.k(C8056za.j(this), null, new a(registrationCurrency, null), 3);
    }

    @Override // defpackage.C1146Hm, defpackage.C7576xG
    public final void j() {
        super.j();
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
    }

    @Override // defpackage.C1146Hm
    @Nullable
    public final Object z(@NotNull CaptchaDestination captchaDestination, @NotNull CommonError commonError, @Nullable String str, @NotNull AW1 aw1) {
        if (captchaDestination instanceof CaptchaDestination.Login) {
            G(this, new CaptchaDestination.Login(0), new C3410dg(this, 1), 4);
        } else if (captchaDestination instanceof CaptchaDestination.Registration) {
            G(this, new CaptchaDestination.Registration(0), new N4(this, 3), 4);
        } else if (!(captchaDestination instanceof CaptchaDestination.RemindPass) && !(captchaDestination instanceof CaptchaDestination.SmsSend)) {
            throw new C6489s51();
        }
        return Unit.a;
    }
}
