package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.appsflyer.share.attribution.RequestError;

/* JADX INFO: renamed from: bW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2956bW0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C3165cW0 d;

    /* JADX INFO: renamed from: bW0$a */
    @InterfaceC3368dU(c = "com.base.core.backend.updaters.MakeDepositUpdater$start$2", f = "MakeDepositUpdater.kt", l = {36, RequestError.NETWORK_FAILURE}, m = "emit")
    public static final class a extends LM {
        public C2956bW0 d;
        public ResultOk e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C2956bW0<T> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C2956bW0<? super T> c2956bW0, JM<? super a> jm) {
            super(jm);
            this.h = c2956bW0;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.a(null, this);
        }
    }

    public C2956bW0(C3165cW0 c3165cW0) {
        this.d = c3165cW0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (defpackage.C3165cW0.d(r8, r7, r0) == r1) goto L30;
     */
    @Override // defpackage.InterfaceC6606sf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.api.core.backend.domain.models.resultModels.ResultOk<com.api.core.backend.domain.models.responseModels.CommonMakeDeposit> r7, defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C2956bW0.a
            if (r0 == 0) goto L13
            r0 = r8
            bW0$a r0 = (defpackage.C2956bW0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            bW0$a r0 = new bW0$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L8a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.api.core.backend.domain.models.resultModels.ResultOk r7 = r0.e
            bW0 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L69
        L3a:
            defpackage.C1795Pt1.b(r8)
            java.lang.Object r8 = r7.a()
            com.api.core.backend.domain.models.responseModels.CommonMakeDeposit r8 = (com.api.core.backend.domain.models.responseModels.CommonMakeDeposit) r8
            java.lang.String r8 = r8.getStatus()
            r2 = 0
            java.lang.String r5 = "success"
            boolean r8 = kotlin.text.d.o(r8, r5, r2)
            if (r8 != 0) goto L53
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L53:
            cW0 r8 = r6.d
            GX r8 = r8.e
            rf0 r8 = r8.l()
            r0.d = r6
            r0.e = r7
            r0.i = r3
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L68
            goto L89
        L68:
            r2 = r6
        L69:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L74
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L74:
            cW0 r8 = r2.d
            java.lang.Object r7 = r7.a()
            com.api.core.backend.domain.models.responseModels.CommonMakeDeposit r7 = (com.api.core.backend.domain.models.responseModels.CommonMakeDeposit) r7
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.i = r4
            java.lang.Object r7 = defpackage.C3165cW0.d(r8, r7, r0)
            if (r7 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2956bW0.a(com.api.core.backend.domain.models.resultModels.ResultOk, JM):java.lang.Object");
    }
}
