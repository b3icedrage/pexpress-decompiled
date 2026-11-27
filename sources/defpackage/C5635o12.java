package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$notifyAmplitudeAboutProfit$2", f = "Trader.kt", l = {645, 646}, m = "invokeSuspend")
public final class C5635o12 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ S02<H32> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5635o12(S02<H32> s02, JM<? super C5635o12> jm) {
        super(2, jm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5635o12(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5635o12) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r2.i(r6, r5) == r0) goto L15;
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
            S02<H32> r2 = r5.e
            com.api.feature.analytics.reporters.ReporterApi r2 = r2.g
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            defpackage.C1795Pt1.b(r6)
            goto L39
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            defpackage.C1795Pt1.b(r6)
            goto L2e
        L20:
            defpackage.C1795Pt1.b(r6)
            H91 r6 = defpackage.H91.WIN_REAL
            r5.d = r4
            kotlin.Unit r6 = r2.a(r6, r5)
            if (r6 != r0) goto L2e
            goto L38
        L2e:
            H91 r6 = defpackage.H91.WIN_REAL_TIME
            r5.d = r3
            kotlin.Unit r6 = r2.i(r6, r5)
            if (r6 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5635o12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
