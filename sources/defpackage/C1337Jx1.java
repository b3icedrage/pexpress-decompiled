package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Jx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onShowClick$1", f = "RobotInvestmentViewModelBase.kt", l = {217, 218, 225}, m = "invokeSuspend")
public final class C1337Jx1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1259Ix1 e;

    /* JADX INFO: renamed from: Jx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onShowClick$1$1", f = "RobotInvestmentViewModelBase.kt", l = {219}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C1259Ix1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1259Ix1 c1259Ix1, JM<? super a> jm) {
            super(2, jm);
            this.e = c1259Ix1;
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
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC4099gx1 interfaceC4099gx1 = this.e.e;
                this.d = 1;
                if (interfaceC4099gx1.b(this) == mn) {
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

    /* JADX INFO: renamed from: Jx1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onShowClick$1$2", f = "RobotInvestmentViewModelBase.kt", l = {222}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C1259Ix1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1259Ix1 c1259Ix1, JM<? super b> jm) {
            super(2, jm);
            this.e = c1259Ix1;
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
            if (i == 0) {
                C1795Pt1.b(obj);
                ReporterApi reporterApi = this.e.i;
                EnumC5028l80 enumC5028l80 = EnumC5028l80.X;
                this.d = 1;
                if (reporterApi.k(enumC5028l80, null) == mn) {
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

    /* JADX INFO: renamed from: Jx1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onShowClick$1$3$1", f = "RobotInvestmentViewModelBase.kt", l = {230}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C1259Ix1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1259Ix1 c1259Ix1, JM<? super c> jm) {
            super(2, jm);
            this.e = c1259Ix1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, jm);
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
                InterfaceC4099gx1 interfaceC4099gx1 = this.e.e;
                this.d = 1;
                if (interfaceC4099gx1.c(this) == mn) {
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

    /* JADX INFO: renamed from: Jx1$d */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onShowClick$1$userEmail$1", f = "RobotInvestmentViewModelBase.kt", l = {226}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super String>, Object> {
        public int d;
        public final /* synthetic */ C1259Ix1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1259Ix1 c1259Ix1, JM<? super d> jm) {
            super(1, jm);
            this.e = c1259Ix1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new d(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = this.e.g.k;
                this.d = 1;
                obj = C7236vf0.a(gp1, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return ((C6945uG) obj).b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337Jx1(C1259Ix1 c1259Ix1, JM<? super C1337Jx1> jm) {
        super(1, jm);
        this.e = c1259Ix1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1337Jx1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C1337Jx1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (defpackage.C5189lv.p(r8, r1, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r8 == r0) goto L23;
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
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            Ix1 r6 = r7.e
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            defpackage.C1795Pt1.b(r8)
            goto L6d
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            defpackage.C1795Pt1.b(r8)
            goto L52
        L22:
            defpackage.C1795Pt1.b(r8)
            goto L38
        L26:
            defpackage.C1795Pt1.b(r8)
            r7.d = r5
            lD0 r8 = r6.p
            rf0 r8 = r8.l()
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r7)
            if (r8 != r0) goto L38
            goto L6c
        L38:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5d
            RV r8 = defpackage.C6266r20.a
            zn0 r8 = defpackage.QV0.a
            Jx1$a r1 = new Jx1$a
            r1.<init>(r6, r2)
            r7.d = r4
            java.lang.Object r8 = defpackage.C5189lv.p(r8, r1, r7)
            if (r8 != r0) goto L52
            goto L6c
        L52:
            EM r8 = defpackage.C3784fT.a
            Jx1$b r0 = new Jx1$b
            r0.<init>(r6, r2)
            defpackage.C5189lv.k(r8, r2, r0, r3)
            goto L7f
        L5d:
            Jx1$d r8 = new Jx1$d
            r8.<init>(r6, r2)
            r7.d = r3
            java.lang.String r1 = "user_email_for_deposit"
            java.lang.Object r8 = defpackage.C7236vf0.c(r1, r8, r7)
            if (r8 != r0) goto L6d
        L6c:
            return r0
        L6d:
            java.lang.String r8 = (java.lang.String) r8
            g10 r0 = r6.d
            ZK1 r1 = new ZK1
            C4 r2 = new C4
            r3 = 5
            r2.<init>(r6, r3)
            r1.<init>(r8, r2)
            r0.b(r1)
        L7f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1337Jx1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
