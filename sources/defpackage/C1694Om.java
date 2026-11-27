package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$repeatRegister$1", f = "AuthorizationViewModelBase.kt", l = {279, 280}, m = "invokeSuspend")
public final class C1694Om extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1146Hm e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694Om(C1146Hm c1146Hm, String str, JM<? super C1694Om> jm) {
        super(2, jm);
        this.e = c1146Hm;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1694Om(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1694Om) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r6 == r0) goto L15;
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
            r2 = 2
            Hm r3 = r5.e
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L32
        L1e:
            defpackage.C1795Pt1.b(r6)
            iA0 r6 = r3.T
            r5.d = r4
            Yf r1 = new Yf
            r4 = 3
            r1.<init>(r4)
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto L32
            goto L3c
        L32:
            xq1 r6 = r3.x
            r5.d = r2
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            com.api.core.backend.domain.models.resultModels.CommonResult r6 = (com.api.core.backend.domain.models.resultModels.CommonResult) r6
            r3.getClass()
            boolean r0 = r6 instanceof com.api.core.backend.domain.models.resultModels.ResultError
            if (r0 == 0) goto L5c
            com.api.core.backend.domain.models.resultModels.ResultError r6 = (com.api.core.backend.domain.models.resultModels.ResultError) r6
            com.api.core.backend.domain.models.resultModels.CommonError r6 = r6.getError()
            KN r0 = defpackage.C8056za.j(r3)
            zm r1 = new zm
            java.lang.String r2 = r5.g
            r4 = 0
            r1.<init>(r3, r6, r2, r4)
            r6 = 3
            defpackage.C5189lv.k(r0, r4, r1, r6)
        L5c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1694Om.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
