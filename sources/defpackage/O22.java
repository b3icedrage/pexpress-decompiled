package defpackage;

import com.impl.core.backend.modelsRequest.CandlesHistorySubscribeRequest;
import com.impl.core.backend.modelsRequest.SubscribeForAssetRequestImpl;
import com.impl.core.backend.modelsRequest.UnSubscribeForAssetRequestImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.TradingDataSourceImpl$historyCandleToTimestamp$2", f = "TradingDataSourceImpl.kt", l = {149, 151, 152}, m = "invokeSuspend")
public final class O22 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ M22 e;
    public final /* synthetic */ CandlesHistorySubscribeRequest g;
    public final /* synthetic */ UnSubscribeForAssetRequestImpl h;
    public final /* synthetic */ SubscribeForAssetRequestImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O22(M22 m22, CandlesHistorySubscribeRequest candlesHistorySubscribeRequest, UnSubscribeForAssetRequestImpl unSubscribeForAssetRequestImpl, SubscribeForAssetRequestImpl subscribeForAssetRequestImpl, JM<? super O22> jm) {
        super(1, jm);
        this.e = m22;
        this.g = candlesHistorySubscribeRequest;
        this.h = unSubscribeForAssetRequestImpl;
        this.i = subscribeForAssetRequestImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new O22(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((O22) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (defpackage.Fg2.z(r8, "subfor", r7.i, r7, 12) == r0) goto L20;
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
            r2 = 12
            r3 = 3
            r4 = 2
            r5 = 1
            M22 r6 = r7.e
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.C1795Pt1.b(r8)
            goto L57
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            defpackage.C1795Pt1.b(r8)
            goto L48
        L23:
            defpackage.C1795Pt1.b(r8)
            goto L39
        L27:
            defpackage.C1795Pt1.b(r8)
            Vg2 r8 = r6.b
            r7.d = r5
            java.lang.String r1 = "changeSymbol"
            com.impl.core.backend.modelsRequest.CandlesHistorySubscribeRequest r5 = r7.g
            java.lang.Object r8 = defpackage.Fg2.z(r8, r1, r5, r7, r2)
            if (r8 != r0) goto L39
            goto L56
        L39:
            Vg2 r8 = r6.b
            r7.d = r4
            java.lang.String r1 = "unsubfor"
            com.impl.core.backend.modelsRequest.UnSubscribeForAssetRequestImpl r4 = r7.h
            java.lang.Object r8 = defpackage.Fg2.z(r8, r1, r4, r7, r2)
            if (r8 != r0) goto L48
            goto L56
        L48:
            Vg2 r8 = r6.b
            r7.d = r3
            java.lang.String r1 = "subfor"
            com.impl.core.backend.modelsRequest.SubscribeForAssetRequestImpl r3 = r7.i
            java.lang.Object r8 = defpackage.Fg2.z(r8, r1, r3, r7, r2)
            if (r8 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
