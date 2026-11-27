package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsViewModelBase$onSelectButtonClicked$1", f = "StrategyInstructionsViewModelBase.kt", l = {34, 35, 39}, m = "invokeSuspend")
public final class C8031zR1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C3496e42 d;
    public int e;
    public final /* synthetic */ BR1 g;

    /* JADX INFO: renamed from: zR1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsViewModelBase$onSelectButtonClicked$1$1", f = "StrategyInstructionsViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super EnumC2644a42>, Object> {
        public final /* synthetic */ C3496e42 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3496e42 c3496e42, JM<? super a> jm) {
            super(1, jm);
            this.d = c3496e42;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super EnumC2644a42> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.d.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8031zR1(BR1 br1, JM<? super C8031zR1> jm) {
        super(2, jm);
        this.g = br1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C8031zR1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C8031zR1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (((defpackage.NR1) r9).l(r3, r8) == r0) goto L20;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.e
            r2 = 3
            r3 = 2
            r4 = 1
            BR1 r5 = r8.g
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            defpackage.C1795Pt1.b(r9)
            goto L67
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            e42 r1 = r8.d
            defpackage.C1795Pt1.b(r9)
            goto L52
        L23:
            defpackage.C1795Pt1.b(r9)
            goto L35
        L27:
            defpackage.C1795Pt1.b(r9)
            rf0<e42> r9 = r5.h
            r8.e = r4
            java.lang.Object r9 = defpackage.C4466ii.o(r9, r8)
            if (r9 != r0) goto L35
            goto L66
        L35:
            r1 = r9
            e42 r1 = (defpackage.C3496e42) r1
            com.api.feature.analytics.reporters.ReporterApi r9 = r5.f
            l80 r4 = defpackage.EnumC5028l80.L
            DR1 r6 = new DR1
            a42 r7 = r1.a
            java.lang.String r7 = r7.name()
            r6.<init>(r7)
            r8.d = r1
            r8.e = r3
            kotlin.Unit r9 = r9.f(r4, r6)
            if (r9 != r0) goto L52
            goto L66
        L52:
            MR1 r9 = r5.g
            zR1$a r3 = new zR1$a
            r4 = 0
            r3.<init>(r1, r4)
            r8.d = r4
            r8.e = r2
            NR1 r9 = (defpackage.NR1) r9
            java.lang.Object r9 = r9.l(r3, r8)
            if (r9 != r0) goto L67
        L66:
            return r0
        L67:
            wR1 r9 = r5.e
            r9.f()
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8031zR1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
