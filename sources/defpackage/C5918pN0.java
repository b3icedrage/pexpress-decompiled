package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$makeExperimentsRequestsAndCacheThem$2", f = "LaunchAppThirdStepUseCaseBase.kt", l = {458}, m = "invokeSuspend")
public final class C5918pN0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;

    /* JADX INFO: renamed from: pN0$a */
    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$makeExperimentsRequestsAndCacheThem$2$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ C3977gN0 e;

        /* JADX INFO: renamed from: pN0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$makeExperimentsRequestsAndCacheThem$2$1$1$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {463, 465}, m = "invokeSuspend")
        public static final class C0472a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ InterfaceC7071ur1 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0472a(boolean z, InterfaceC7071ur1 interfaceC7071ur1, JM<? super C0472a> jm) {
                super(2, jm);
                this.e = z;
                this.g = interfaceC7071ur1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0472a(this.e, this.g, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0472a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
            
                if (r1.a(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
            
                if (r1.b() == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
            
                return r0;
             */
            @Override // defpackage.AbstractC7487wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    MN r0 = defpackage.MN.d
                    int r1 = r4.d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r3) goto L15
                    if (r1 != r2) goto Ld
                    goto L15
                Ld:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L15:
                    defpackage.C1795Pt1.b(r5)
                    goto L34
                L19:
                    defpackage.C1795Pt1.b(r5)
                    boolean r5 = r4.e
                    ur1 r1 = r4.g
                    if (r5 == 0) goto L2b
                    r4.d = r3
                    java.lang.Object r5 = r1.a(r4)
                    if (r5 != r0) goto L34
                    goto L33
                L2b:
                    r4.d = r2
                    kotlin.Unit r5 = r1.b()
                    if (r5 != r0) goto L34
                L33:
                    return r0
                L34:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C5918pN0.a.C0472a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3977gN0 c3977gN0, JM<? super a> jm) {
            super(2, jm);
            this.e = c3977gN0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.e, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            KN kn = (KN) this.d;
            C3977gN0 c3977gN0 = this.e;
            boolean zN = c3977gN0.o.n();
            Iterator<T> it = c3977gN0.h.iterator();
            while (it.hasNext()) {
                C5189lv.k(kn, null, new C0472a(zN, (InterfaceC7071ur1) it.next(), null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5918pN0(C3977gN0 c3977gN0, JM<? super C5918pN0> jm) {
        super(2, jm);
        this.e = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5918pN0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5918pN0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            a aVar = new a(this.e, null);
            this.d = 1;
            if (C5189lv.p(executorC7200vV, aVar, this) == mn) {
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
