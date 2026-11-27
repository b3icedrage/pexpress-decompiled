package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1394Kq1 extends AbstractC7959z50 {

    @NotNull
    public final InterfaceC1547Mq A;

    @NotNull
    public final C6120qK1 B;

    @NotNull
    public final GP1 C;

    @NotNull
    public final C1699On1 D;

    @NotNull
    public final GP1 E;

    @NotNull
    public final C1699On1 F;

    @NotNull
    public final C6120qK1 G;

    @NotNull
    public final C1621Nn1 H;

    @NotNull
    public final C1273Jc0 u;

    @NotNull
    public final C1273Jc0 v;

    @NotNull
    public final NB w;

    @NotNull
    public final InterfaceC7699xq1 x;

    @NotNull
    public final C4923kf y;

    @NotNull
    public final ReporterApi z;

    /* JADX INFO: renamed from: Kq1$a */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.register.RegisterViewModel$1", f = "RegisterViewModel.kt", l = {53}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Kq1$a$a, reason: collision with other inner class name */
        public static final class C0077a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ AbstractC1394Kq1 d;

            public C0077a(AbstractC1394Kq1 abstractC1394Kq1) {
                this.d = abstractC1394Kq1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objR = this.d.r((C4078gq1) obj, jm);
                return objR == MN.d ? objR : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC1394Kq1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            AbstractC1394Kq1 abstractC1394Kq1 = AbstractC1394Kq1.this;
            C6120qK1 c6120qK1 = abstractC1394Kq1.B;
            C0077a c0077a = new C0077a(abstractC1394Kq1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, c0077a, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Kq1$b */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.register.RegisterViewModel$onRegisterClick$1", f = "RegisterViewModel.kt", l = {118}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC1394Kq1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6120qK1 c6120qK1 = AbstractC1394Kq1.this.i;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
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

    /* JADX INFO: renamed from: Kq1$c */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.register.RegisterViewModel$onRegisterClick$2", f = "RegisterViewModel.kt", l = {136}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JM<? super c> jm) {
            super(2, jm);
            this.g = str;
            this.h = str2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC1394Kq1.this.new c(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            AbstractC1394Kq1 abstractC1394Kq1 = AbstractC1394Kq1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = abstractC1394Kq1.k;
                Boolean bool = Boolean.TRUE;
                gp1.getClass();
                gp1.m(null, bool);
                this.d = 1;
                if (abstractC1394Kq1.u(this.g, this.h, S80.EMAIL_AUTH, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            GP1 gp2 = abstractC1394Kq1.k;
            Boolean bool2 = Boolean.FALSE;
            gp2.getClass();
            gp2.m(null, bool2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1394Kq1(@NotNull C1273Jc0 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase, @NotNull NB checkboxValidationUseCase, @NotNull InterfaceC7699xq1 registerUseCase, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC1547Mq baseRegistrationCallback) {
        super(emailValidationUseCase, passwordValidationUseCase);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        Intrinsics.checkNotNullParameter(checkboxValidationUseCase, "checkboxValidationUseCase");
        Intrinsics.checkNotNullParameter(registerUseCase, "registerUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(baseRegistrationCallback, "baseRegistrationCallback");
        this.u = emailValidationUseCase;
        this.v = passwordValidationUseCase;
        this.w = checkboxValidationUseCase;
        this.x = registerUseCase;
        this.y = appData;
        this.z = reporter;
        this.A = baseRegistrationCallback;
        this.B = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        GP1 gp1I = C1589Ne.i(Jc2.a);
        this.C = gp1I;
        this.D = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(Boolean.FALSE);
        this.E = gp1I2;
        this.F = C4466ii.f(gp1I2);
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.G = c6120qK1G;
        this.H = C4466ii.e(c6120qK1G);
    }

    @NotNull
    public C1273Jc0 p() {
        return this.u;
    }

    @NotNull
    public ReporterApi q() {
        return this.z;
    }

    @Nullable
    public abstract Object r(@NotNull C4078gq1 c4078gq1, @NotNull JM<? super Unit> jm);

    public final void s(boolean z) {
        GP1 gp1 = this.E;
        if (((Boolean) gp1.getValue()).booleanValue() != z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            gp1.getClass();
            gp1.m(null, boolValueOf);
            this.C.setValue(this.w.b(z));
        }
    }

    public final void t() {
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
        CQ0 cq0B = VE.b();
        AbstractC0961Fc0 abstractC0961Fc0A = p().a();
        Jc2 jc2 = Jc2.a;
        if (!Intrinsics.a(abstractC0961Fc0A, jc2)) {
            cq0B.add("email");
        }
        C1273Jc0 c1273Jc0 = this.v;
        if (!Intrinsics.a(c1273Jc0.a(), jc2)) {
            cq0B.add("password");
        }
        C1699On1 c1699On1 = this.F;
        if (!((Boolean) c1699On1.d.getValue()).booleanValue()) {
            cq0B.add("licence");
        }
        CQ0 cq0A = VE.a(cq0B);
        if (cq0A.isEmpty()) {
            C5189lv.k(C3286d41.a, C6266r20.a, new c((String) this.h.d.getValue(), (String) this.r.d.getValue(), null), 2);
            return;
        }
        this.e.setValue(p().a());
        this.o.setValue(c1273Jc0.a());
        this.C.setValue(this.w.a((Boolean) c1699On1.d.getValue()));
        ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
        Intrinsics.checkNotNullParameter("register", "flow");
        InterfaceC3220cl interfaceC3220clRemove = C3430dl.a.remove("register");
        if (interfaceC3220clRemove != null) {
            C6000pl.a(interfaceC3220clRemove, cq0A);
        }
    }

    @Nullable
    public abstract Object u(@NotNull String str, @NotNull String str2, @NotNull S80 s80, @NotNull JM<? super Unit> jm);

    public final void v(@NotNull CommonError error, @Nullable EnumC7489wq1 enumC7489wq1, boolean z) {
        Intrinsics.checkNotNullParameter(error, "error");
        ReporterApi reporterApiQ = q();
        EnumC5028l80 enumC5028l80 = EnumC5028l80.q;
        String str = enumC7489wq1 != null ? enumC7489wq1.d : null;
        Boolean boolValueOf = Boolean.valueOf(z);
        String strA = C3430dl.a("register");
        Intrinsics.checkNotNullParameter("register", "flow");
        Integer num = C3430dl.e.get("register");
        Intrinsics.checkNotNullParameter(error, "error");
        Map<String, Object> http = error.getHttp();
        String strValueOf = String.valueOf(error.getCode());
        String text = error.getText();
        String platformCode = error.getPlatformCode();
        ReporterApi.a.b(reporterApiQ, enumC5028l80, new E70(strValueOf, text, platformCode.length() == 0 ? null : platformCode, null, null, str, boolValueOf, strA, num, C2017Sp1.a.b(error.getClass()).f(), http.get("status"), http.get("domain"), http.get("try"), 24), null, 12);
    }
}
