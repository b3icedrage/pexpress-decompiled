package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$onFinishLaunching$2", f = "LaunchAppThirdStepUseCaseBase.kt", l = {185}, m = "invokeSuspend")
public final class C7388wN0 extends AW1 implements Function2<KN, JM<? super C3977gN0.c>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3977gN0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: wN0$a */
    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$onFinishLaunching$2$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {178}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C3977gN0 e;

        /* JADX INFO: renamed from: wN0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$onFinishLaunching$2$1$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {178}, m = "invokeSuspend")
        public static final class C0526a extends AW1 implements Function1<JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ C3977gN0 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0526a(C3977gN0 c3977gN0, JM<? super C0526a> jm) {
                super(1, jm);
                this.e = c3977gN0;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0526a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Unit> jm) {
                return ((C0526a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                Object obj2 = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    this.d = 1;
                    AtomicInteger atomicInteger = C3977gN0.G;
                    Object objD = LN.d(new C5918pN0(this.e, null), this);
                    if (objD != obj2) {
                        objD = Unit.a;
                    }
                    if (objD == obj2) {
                        return obj2;
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
        public a(C3977gN0 c3977gN0, JM<? super a> jm) {
            super(2, jm);
            this.e = c3977gN0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C3977gN0 c3977gN0 = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0526a c0526a = new C0526a(c3977gN0, null);
                this.d = 1;
                if (c3977gN0.y.a("experiments", c0526a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Boolean bool = Boolean.TRUE;
            GP1 gp1 = c3977gN0.w;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: wN0$b */
    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$onFinishLaunching$2$2", f = "LaunchAppThirdStepUseCaseBase.kt", l = {182}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C3977gN0 e;

        /* JADX INFO: renamed from: wN0$b$a */
        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$onFinishLaunching$2$2$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {182}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ C3977gN0 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3977gN0 c3977gN0, JM<? super a> jm) {
                super(1, jm);
                this.e = c3977gN0;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Unit> jm) {
                return ((a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C3977gN0 c3977gN0 = this.e;
                    this.d = 1;
                    Object objA = c3977gN0.f.a(this);
                    if (objA != mn) {
                        objA = Unit.a;
                    }
                    if (objA == mn) {
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
        public b(C3977gN0 c3977gN0, JM<? super b> jm) {
            super(2, jm);
            this.e = c3977gN0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C3977gN0 c3977gN0 = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(c3977gN0, null);
                this.d = 1;
                if (c3977gN0.y.a("marketing_app_open", aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Boolean bool = Boolean.TRUE;
            GP1 gp1 = c3977gN0.x;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388wN0(C3977gN0 c3977gN0, long j, int i, JM<? super C7388wN0> jm) {
        super(2, jm);
        this.g = c3977gN0;
        this.h = j;
        this.i = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7388wN0 c7388wN0 = new C7388wN0(this.g, this.h, this.i, jm);
        c7388wN0.e = obj;
        return c7388wN0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C3977gN0.c> jm) {
        return ((C7388wN0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        KN kn;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            KN kn2 = (KN) this.e;
            C3977gN0 c3977gN0 = this.g;
            C5189lv.k(kn2, null, new a(c3977gN0, null), 3);
            C5189lv.k(kn2, null, new b(c3977gN0, null), 3);
            this.e = kn2;
            this.d = 1;
            Enum enumG = C3977gN0.g(c3977gN0, this.h, this.i, this);
            if (enumG == mn) {
                return mn;
            }
            kn = kn2;
            obj = enumG;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kn = (KN) this.e;
            C1795Pt1.b(obj);
        }
        C3977gN0.c cVar = (C3977gN0.c) obj;
        if (cVar == C3977gN0.c.d) {
            ED.e(kn.getE());
        }
        return cVar;
    }
}
