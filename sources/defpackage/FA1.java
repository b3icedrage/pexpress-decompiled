package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter$notifyAmplitudeAboutStartTrading$3", f = "RobotTradingReporter.kt", l = {161, 162}, m = "invokeSuspend")
public final class FA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC7770yA1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FA1(AbstractC7770yA1 abstractC7770yA1, JM<? super FA1> jm) {
        super(2, jm);
        this.e = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new FA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((FA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r6.i(r1, r5) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            yA1 r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L3b
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L2e
        L1e:
            defpackage.C1795Pt1.b(r6)
            com.api.feature.analytics.reporters.ReporterApi r6 = r2.b
            H91 r1 = defpackage.H91.TRY_DEMO
            r5.d = r4
            kotlin.Unit r6 = r6.a(r1, r5)
            if (r6 != r0) goto L2e
            goto L3a
        L2e:
            com.api.feature.analytics.reporters.ReporterApi r6 = r2.b
            H91 r1 = defpackage.H91.TRY_DEMO_TIME
            r5.d = r3
            kotlin.Unit r6 = r6.i(r1, r5)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FA1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
