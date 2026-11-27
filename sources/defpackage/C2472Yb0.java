package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2472Yb0 implements InterfaceC2394Xb0 {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final DT1 d;

    /* JADX INFO: renamed from: Yb0$a */
    @InterfaceC3368dU(c = "com.base.app.navigation.callbacks.launch_app.FeatureLaunchAppCallbackImpl$navigateToStub$1", f = "FeatureLaunchAppCallbackImpl.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public AbstractC5463nB1 d;
        public int e;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2472Yb0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            AbstractC5463nB1 abstractC5463nB1;
            MN mn = MN.d;
            int i = this.e;
            C2472Yb0 c2472Yb0 = C2472Yb0.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC5463nB1 abstractC5463nB2 = c2472Yb0.a;
                InterfaceC6396rf0<Boolean> interfaceC6396rf0L = c2472Yb0.d.l();
                this.d = abstractC5463nB2;
                this.e = 1;
                Object objO = C4466ii.o(interfaceC6396rf0L, this);
                if (objO == mn) {
                    return mn;
                }
                abstractC5463nB1 = abstractC5463nB2;
                obj = objO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC5463nB1 = this.d;
                C1795Pt1.b(obj);
            }
            abstractC5463nB1.e(!((Boolean) obj).booleanValue() ? c2472Yb0.b.c() : c2472Yb0.b.z());
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Yb0$b */
    @InterfaceC3368dU(c = "com.base.app.navigation.callbacks.launch_app.FeatureLaunchAppCallbackImpl$onLaunchRegister$1", f = "FeatureLaunchAppCallbackImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2472Yb0.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C2472Yb0 c2472Yb0 = C2472Yb0.this;
            c2472Yb0.a.e(c2472Yb0.b.g());
            return Unit.a;
        }
    }

    public C2472Yb0(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull ReporterApi reporter, @NotNull DT1 stubOnboardingPassedUseCase) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(stubOnboardingPassedUseCase, "stubOnboardingPassedUseCase");
        this.a = router;
        this.b = screensProvider;
        this.c = reporter;
        this.d = stubOnboardingPassedUseCase;
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void a() {
        this.a.e(this.b.d());
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void b() {
        this.a.e(this.b.a());
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void c() {
        this.a.e(this.b.k());
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void d() {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.o;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.c, enumC5028l80, new C1510Md1("Loading"), null, 12);
        C5189lv.k(C3286d41.a, null, new b(null), 3);
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void e() {
        this.a.c(this.b.r(), true);
    }

    @Override // defpackage.InterfaceC2394Xb0
    public final void f() {
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }
}
