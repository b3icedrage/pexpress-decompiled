package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: p12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$notifyAmplitudeAboutProfit$3", f = "Trader.kt", l = {651, 652, 653}, m = "invokeSuspend")
public final class C5845p12 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ S02<H32> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5845p12(S02<H32> s02, JM<? super C5845p12> jm) {
        super(2, jm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5845p12(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5845p12) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r6.i(r8, r7) == r0) goto L20;
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
            S02<H32> r2 = r7.e
            r3 = 3
            r4 = 2
            r5 = 1
            com.api.feature.analytics.reporters.ReporterApi r6 = r2.g
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.C1795Pt1.b(r8)
            goto L4f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            defpackage.C1795Pt1.b(r8)
            goto L44
        L23:
            defpackage.C1795Pt1.b(r8)
            goto L39
        L27:
            defpackage.C1795Pt1.b(r8)
            j90 r8 = r2.s
            qK1 r8 = r8.G
            kotlin.Unit r1 = kotlin.Unit.a
            r7.d = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L39
            goto L4e
        L39:
            H91 r8 = defpackage.H91.WIN_DEMO
            r7.d = r4
            kotlin.Unit r8 = r6.a(r8, r7)
            if (r8 != r0) goto L44
            goto L4e
        L44:
            H91 r8 = defpackage.H91.WIN_DEMO_TIME
            r7.d = r3
            kotlin.Unit r8 = r6.i(r8, r7)
            if (r8 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5845p12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
