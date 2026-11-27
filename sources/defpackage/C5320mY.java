package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: mY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.DepositValuesUpdater$updateRecommendedValue$2", f = "DepositValuesUpdater.kt", l = {51, 52}, m = "invokeSuspend")
public final class C5320mY extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ C5530nY e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5320mY(C5530nY c5530nY, JM<? super C5320mY> jm) {
        super(2, jm);
        this.e = c5530nY;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5320mY(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Boolean> jm) {
        return ((C5320mY) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r1.e(r6) == r0) goto L19;
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
            nY r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L42
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L2c
        L1e:
            defpackage.C1795Pt1.b(r6)
            cc0 r6 = r2.b
            r5.d = r4
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L2c
            goto L41
        L2c:
            com.api.core.backend.domain.models.responseModels.CommonRecommendedDeposit r6 = (com.api.core.backend.domain.models.responseModels.CommonRecommendedDeposit) r6
            if (r6 != 0) goto L33
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L33:
            V11 r1 = r2.c
            java.util.Map r6 = r6.a()
            r5.d = r3
            kotlin.Unit r6 = r1.e(r6)
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5320mY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
