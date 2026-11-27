package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: eA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$onStartTrading$4", f = "RobotTrading.kt", l = {280, 281, 282, 297}, m = "invokeSuspend")
public final class C3519eA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4617jA1 g;

    /* JADX INFO: renamed from: eA1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$onStartTrading$4$5", f = "RobotTrading.kt", l = {286, 291, 291, 287}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public long d;
        public long e;
        public AbstractC7770yA1 g;
        public EnumC4164hF1 h;
        public Double i;
        public Double j;
        public int k;
        public final /* synthetic */ C4617jA1 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4617jA1 c4617jA1, JM<? super a> jm) {
            super(2, jm);
            this.l = c4617jA1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.l, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
        
            if (r0.g(r9, r6, r3, r12, r2, r16) == r8) goto L27;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3519eA1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3519eA1(C4617jA1 c4617jA1, JM<? super C3519eA1> jm) {
        super(2, jm);
        this.g = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C3519eA1 c3519eA1 = new C3519eA1(this.g, jm);
        c3519eA1.e = obj;
        return c3519eA1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3519eA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[PHI: r10
      0x0085: PHI (r10v5 java.lang.Object) = (r10v4 java.lang.Object), (r10v0 java.lang.Object) binds: [B:30:0x0082, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (defpackage.C4617jA1.c(r7, true, r9) == r0) goto L42;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3519eA1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
