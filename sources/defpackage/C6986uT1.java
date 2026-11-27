package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6986uT1 implements InterfaceC6776tT1 {

    @NotNull
    public final InterfaceC3951gE1 a;

    @NotNull
    public final C5253mB1 b;

    @NotNull
    public final DT1 c;

    /* JADX INFO: renamed from: uT1$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.callbacks.StubOnboardingCallbacksBase$onFinishOnboarding$1", f = "StubOnboardingCallbacksBase.kt", l = {20}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: uT1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.stub.callbacks.StubOnboardingCallbacksBase$onFinishOnboarding$1$1", f = "StubOnboardingCallbacksBase.kt", l = {}, m = "invokeSuspend")
        public static final class C0504a extends AW1 implements Function1<JM<? super Boolean>, Object> {
            public C0504a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0504a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Boolean> jm) {
                ((C0504a) create(jm)).invokeSuspend(Unit.a);
                return Boolean.TRUE;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.TRUE;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6986uT1.this.new a(jm);
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
                DT1 dt1 = C6986uT1.this.c;
                C0504a c0504a = new C0504a(1, null);
                this.d = 1;
                if (dt1.m(c0504a, this) == mn) {
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

    public C6986uT1(@NotNull InterfaceC3951gE1 screensApi, @NotNull C5253mB1 router, @NotNull DT1 stubOnboardingPassedUseCase) {
        Intrinsics.checkNotNullParameter(screensApi, "screensApi");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(stubOnboardingPassedUseCase, "stubOnboardingPassedUseCase");
        this.a = screensApi;
        this.b = router;
        this.c = stubOnboardingPassedUseCase;
    }

    @Override // defpackage.InterfaceC6776tT1
    public final void a() {
        this.b.e(this.a.z());
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }
}
