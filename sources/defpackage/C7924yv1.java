package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$startTradingAction$1", f = "RobotCommonActionViewModelBase.kt", l = {185, 190, 191}, m = "invokeSuspend")
public final class C7924yv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7293vv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7924yv1(C7293vv1 c7293vv1, JM<? super C7924yv1> jm) {
        super(2, jm);
        this.e = c7293vv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7924yv1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7924yv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r8 == r0) goto L26;
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
            vv1 r6 = r7.e
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            defpackage.C1795Pt1.b(r8)
            goto L81
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            defpackage.C1795Pt1.b(r8)
            goto L6e
        L22:
            defpackage.C1795Pt1.b(r8)
            goto L44
        L26:
            defpackage.C1795Pt1.b(r8)
            jA1 r8 = r6.d
            kf r1 = r6.e
            GP1 r1 = r1.e
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r7.d = r5
            S02<?> r8 = r8.d
            java.lang.Object r8 = r8.u(r1, r7)
            if (r8 != r0) goto L44
            goto L80
        L44:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5f
            int r8 = defpackage.C7293vv1.w
            r6.getClass()
            xv1 r8 = new xv1
            r8.<init>(r6, r2)
            defpackage.C6561sS.g(r6, r8)
            r6.o(r5)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L5f:
            O3 r8 = r6.k
            rf0 r8 = r8.k()
            r7.d = r4
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r7)
            if (r8 != r0) goto L6e
            goto L80
        L6e:
            hF1 r1 = defpackage.EnumC4164hF1.h
            if (r8 != r1) goto L98
            s91 r8 = r6.l
            rf0 r8 = r8.l()
            r7.d = r3
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r7)
            if (r8 != r0) goto L81
        L80:
            return r0
        L81:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L98
            rF r8 = r6.j
            r8.b()
            l80 r8 = defpackage.EnumC5028l80.f0
            r0 = 14
            com.api.feature.analytics.reporters.ReporterApi r1 = r6.f
            com.api.feature.analytics.reporters.ReporterApi.a.b(r1, r8, r2, r2, r0)
            goto La5
        L98:
            int r8 = defpackage.C7293vv1.w
            r6.getClass()
            xv1 r8 = new xv1
            r8.<init>(r6, r2)
            defpackage.C6561sS.g(r6, r8)
        La5:
            int r8 = defpackage.C7293vv1.w
            r6.o(r5)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7924yv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
