package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesViewModelBase$onInstructionClick$1", f = "RobotStrategiesViewModelBase.kt", l = {60, 68}, m = "invokeSuspend")
public final class C8146zz1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7936yz1 e;

    /* JADX INFO: renamed from: zz1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesViewModelBase$onInstructionClick$1$1", f = "RobotStrategiesViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ C7936yz1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7936yz1 c7936yz1, JM<? super a> jm) {
            super(2, jm);
            this.d = c7936yz1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            this.d.e.b();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8146zz1(C7936yz1 c7936yz1, JM<? super C8146zz1> jm) {
        super(1, jm);
        this.e = c7936yz1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C8146zz1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C8146zz1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (defpackage.C5189lv.p(r8, r1, r7) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            MN r0 = defpackage.MN.d
            int r1 = r7.d
            r2 = 2
            r3 = 1
            yz1 r4 = r7.e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r8)
            goto L5a
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.C1795Pt1.b(r8)
            goto L37
        L1e:
            defpackage.C1795Pt1.b(r8)
            com.api.feature.analytics.reporters.ReporterApi r8 = r4.d
            l80 r1 = defpackage.EnumC5028l80.G
            Md1 r5 = new Md1
            L80 r6 = defpackage.L80.MAX_PROFIT
            java.lang.String r6 = "Risk Management"
            r5.<init>(r6)
            r7.d = r3
            kotlin.Unit r8 = r8.k(r1, r5)
            if (r8 != r0) goto L37
            goto L59
        L37:
            jB0 r8 = r4.g
            mv1 r1 = defpackage.EnumC5404mv1.d
            nv1 r3 = r4.f
            eu r1 = r3.a(r1)
            r3 = 2131952472(0x7f130358, float:1.9541388E38)
            r8.a(r1, r3)
            RV r8 = defpackage.C6266r20.a
            zn0 r8 = defpackage.QV0.a
            zz1$a r1 = new zz1$a
            r3 = 0
            r1.<init>(r4, r3)
            r7.d = r2
            java.lang.Object r8 = defpackage.C5189lv.p(r8, r1, r7)
            if (r8 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8146zz1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
