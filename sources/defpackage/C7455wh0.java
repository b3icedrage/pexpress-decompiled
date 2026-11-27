package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7455wh0 extends M50 {

    @NotNull
    public final C1273Jc0 n;

    @NotNull
    public final TK1 o;

    @NotNull
    public final ReporterApi p;

    @NotNull
    public final VK1 q;

    @NotNull
    public final InterfaceC4358iA0 r;

    @NotNull
    public final InterfaceC7012ub2 s;

    @NotNull
    public final C6120qK1 t;

    @NotNull
    public final C1621Nn1 u;

    @NotNull
    public final GP1 v;

    @NotNull
    public final C1808Py w;

    /* JADX INFO: renamed from: wh0$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordViewModelBase$handlePasswordResetError$1", f = "ForgetPasswordViewModelBase.kt", l = {201}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, JM<? super a> jm) {
            super(2, jm);
            this.g = i;
            this.h = i2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C7455wh0.this.new a(this.g, this.h, jm);
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
                VK1 vk1 = C7455wh0.this.q;
                final int i2 = this.g;
                final int i3 = this.h;
                AbstractC1592Nf.w wVar = new AbstractC1592Nf.w(N9.a(new Function1() { // from class: yg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        M9.a AlertVerticalButtonsDialogParams = (M9.a) obj2;
                        Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                        AlertVerticalButtonsDialogParams.g(i2);
                        AlertVerticalButtonsDialogParams.f(i3);
                        AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                        TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 6);
                        return Unit.a;
                    }
                }));
                this.d = 1;
                if (vk1.a(wVar, null, null) == mn) {
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
    public C7455wh0(@NotNull C1273Jc0 emailValidationUseCase, @NotNull TK1 shouldCleanProvider, @NotNull ReporterApi reporter, @NotNull VK1 showAlertDialogUseCase, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull InterfaceC7012ub2 userRepository) {
        super(emailValidationUseCase);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(shouldCleanProvider, "shouldCleanProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.n = emailValidationUseCase;
        this.o = shouldCleanProvider;
        this.p = reporter;
        this.q = showAlertDialogUseCase;
        this.r = initializeExecutorUseCase;
        this.s = userRepository;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.t = c6120qK1G;
        this.u = C4466ii.e(c6120qK1G);
        this.v = C1589Ne.i("");
        this.w = new C1808Py();
    }

    @Override // defpackage.M50
    public final void n() {
        TK1 tk1 = this.o;
        if (tk1.c) {
            tk1.c = false;
            GP1 gp1 = this.g;
            gp1.getClass();
            gp1.m(null, "");
        }
    }

    public final void o(int i, int i2) {
        C5189lv.k(C8056za.j(this), null, new a(i, i2, null), 3);
    }

    public final void p() {
        C1273Jc0 c1273Jc0 = this.n;
        if (Intrinsics.a(c1273Jc0.a(), Jc2.a)) {
            Boolean bool = Boolean.TRUE;
            GP1 gp1 = this.k;
            gp1.getClass();
            gp1.m(null, bool);
            C5189lv.k(C8056za.j(this), null, new C7875yh0(this, null), 3);
            return;
        }
        this.e.setValue(c1273Jc0.a());
        ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
        Intrinsics.checkNotNullParameter("forgot_password", "flow");
        InterfaceC3220cl interfaceC3220clRemove = C3430dl.a.remove("forgot_password");
        if (interfaceC3220clRemove != null) {
            C6000pl.a(interfaceC3220clRemove, VE.c("email"));
        }
    }

    public boolean q() {
        return false;
    }
}
