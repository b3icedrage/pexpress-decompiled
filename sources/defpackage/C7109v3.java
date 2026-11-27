package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7109v3 extends AbstractC6479s3 {

    @NotNull
    public final M2 d;

    @NotNull
    public final VK1 e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final C4923kf g;

    /* JADX INFO: renamed from: v3$a */
    @InterfaceC3368dU(c = "com.base.feature.account.screens.logout.AccountLogoutViewModelBase$onLogoutClick$1", f = "AccountLogoutViewModelBase.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C7109v3.this.new a(jm);
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
                C7109v3 c7109v3 = C7109v3.this;
                ReporterApi.a.b(c7109v3.f, EnumC5028l80.D0, new C6985uT0(Intrinsics.a((Boolean) c7109v3.g.d.getValue(), Boolean.TRUE) ? "Our" : "Wrong"), null, 12);
                C6689t3 action = new C6689t3(0, c7109v3, C7109v3.class, "logout", "logout()V", 0);
                A0 cancelAction = new A0(c7109v3, 1);
                Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
                Intrinsics.checkNotNullParameter(action, "action");
                AbstractC1592Nf.n nVar = new AbstractC1592Nf.n(C7343w9.a(new C4717jg(0, cancelAction, action)));
                this.d = 1;
                if (c7109v3.e.a(nVar, null, null) == mn) {
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

    public C7109v3(@NotNull M2 accountCallbacks, @NotNull VK1 showAlertDialogUseCase, @NotNull ReporterApi reporterApi, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(accountCallbacks, "accountCallbacks");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(reporterApi, "reporterApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.d = accountCallbacks;
        this.e = showAlertDialogUseCase;
        this.f = reporterApi;
        this.g = appDataRepository;
    }

    @Override // defpackage.AbstractC6479s3
    public final void l() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }
}
