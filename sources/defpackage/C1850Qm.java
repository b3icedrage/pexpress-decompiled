package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$showLoginError$1", f = "AuthorizationViewModelBase.kt", l = {251, 253}, m = "invokeSuspend")
public final class C1850Qm extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ CommonError e;
    public final /* synthetic */ C1146Hm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850Qm(CommonError commonError, C1146Hm c1146Hm, JM<? super C1850Qm> jm) {
        super(2, jm);
        this.e = commonError;
        this.g = c1146Hm;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1850Qm(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1850Qm) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r4.z(r1, r8, null, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r1.a(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r0;
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
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            defpackage.C1795Pt1.b(r8)
            goto L4b
        L19:
            defpackage.C1795Pt1.b(r8)
            com.api.core.backend.domain.models.resultModels.CommonError r8 = r7.e
            boolean r1 = r8 instanceof com.api.core.backend.domain.models.resultModels.CommonError.WrongCaptcha
            Hm r4 = r7.g
            if (r1 == 0) goto L40
            com.api.feature.analytics.reporters.ReporterApi r1 = r4.I
            com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login r2 = new com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login
            r5 = 0
            r2.<init>(r5)
            r6 = 12
            defpackage.C1493Ly.d(r1, r2, r8, r6)
            com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login r1 = new com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login
            r1.<init>(r5)
            r7.d = r3
            r2 = 0
            java.lang.Object r8 = r4.z(r1, r8, r2, r7)
            if (r8 != r0) goto L4b
            goto L4a
        L40:
            oL1 r1 = r4.U
            r7.d = r2
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1850Qm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
