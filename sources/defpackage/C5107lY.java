package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.DepositValuesUpdater$updateMinimumValue$2", f = "DepositValuesUpdater.kt", l = {57, 67}, m = "invokeSuspend")
public final class C5107lY extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ C5530nY e;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5107lY(C5530nY c5530nY, long j, JM<? super C5107lY> jm) {
        super(2, jm);
        this.e = c5530nY;
        this.g = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5107lY(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Boolean> jm) {
        return ((C5107lY) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r4.c.b(r8) == r0) goto L27;
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
            nY r4 = r7.e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r8)
            goto L7c
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.C1795Pt1.b(r8)
            goto L2e
        L1e:
            defpackage.C1795Pt1.b(r8)
            cc0 r8 = r4.b
            r7.d = r3
            long r5 = r7.g
            java.lang.Object r8 = r8.a(r5, r7)
            if (r8 != r0) goto L2e
            goto L7b
        L2e:
            com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit r8 = (com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit) r8
            if (r8 != 0) goto L35
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L35:
            kf r1 = r4.a
            GP1 r1 = r1.k
            java.lang.Object r1 = r1.getValue()
            uG r1 = (defpackage.C6945uG) r1
            if (r1 == 0) goto L44
            java.lang.String r1 = r1.e
            goto L45
        L44:
            r1 = 0
        L45:
            java.util.Map r3 = r8.a()
            java.util.Collection r3 = r3.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r3 = kotlin.collections.CollectionsKt.G(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r1 == 0) goto L6d
            if (r3 == 0) goto L6d
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r1, r3)
            java.util.Map r8 = defpackage.OW0.b(r8)
            java.lang.String r1 = "deposits"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit r1 = new com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit
            r1.<init>(r8)
            r8 = r1
        L6d:
            java.util.Map r8 = r8.a()
            r7.d = r2
            V11 r1 = r4.c
            kotlin.Unit r8 = r1.b(r8)
            if (r8 != r0) goto L7c
        L7b:
            return r0
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5107lY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
