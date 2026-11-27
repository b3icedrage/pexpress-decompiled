package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$handleError$1", f = "AuthorizationViewModelBase.kt", l = {426, 432, 435, 434}, m = "invokeSuspend")
public final class C8104zm extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C6120qK1 d;
    public int e;
    public final /* synthetic */ C1146Hm g;
    public final /* synthetic */ CommonError h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8104zm(C1146Hm c1146Hm, CommonError commonError, String str, JM<? super C8104zm> jm) {
        super(2, jm);
        this.g = c1146Hm;
        this.h = commonError;
        this.i = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C8104zm(this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C8104zm) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r6.C(r14, r8, r13.i, r13) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r1.a(r14, r13) == r0) goto L31;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            MN r0 = defpackage.MN.d
            int r1 = r13.e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            Hm r6 = r13.g
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L14
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
        L14:
            defpackage.C1795Pt1.b(r14)
            goto L79
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            qK1 r1 = r13.d
            defpackage.C1795Pt1.b(r14)
            r12 = r13
            goto L94
        L28:
            defpackage.C1795Pt1.b(r14)
            goto L3b
        L2c:
            defpackage.C1795Pt1.b(r14)
            iA0 r14 = r6.T
            r13.e = r5
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r0) goto L3b
        L39:
            r12 = r13
            goto L9f
        L3b:
            xq1 r14 = r6.x
            wq1 r14 = r14.a()
            xq1 r1 = r6.x
            boolean r5 = r1.b()
            java.lang.String r7 = "error"
            com.api.core.backend.domain.models.resultModels.CommonError r8 = r13.h
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            r6.v(r8, r14, r5)
            boolean r14 = r8 instanceof com.api.core.backend.domain.models.resultModels.CommonError.WrongCaptcha
            if (r14 == 0) goto L7b
            wq1 r14 = r1.a()
            wq1 r1 = defpackage.EnumC7489wq1.LOGIN
            r3 = 0
            if (r14 != r1) goto L64
            com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login r14 = new com.api.core.backend.domain.models.requestModels.CaptchaDestination$Login
            r14.<init>(r3)
            goto L69
        L64:
            com.api.core.backend.domain.models.requestModels.CaptchaDestination$Registration r14 = new com.api.core.backend.domain.models.requestModels.CaptchaDestination$Registration
            r14.<init>(r3)
        L69:
            com.api.feature.analytics.reporters.ReporterApi r1 = r6.I
            defpackage.C1493Ly.d(r1, r14, r8, r2)
            r13.e = r4
            java.lang.String r1 = r13.i
            java.lang.Object r14 = r6.C(r14, r8, r1, r13)
            if (r14 != r0) goto L79
            goto L39
        L79:
            r12 = r13
            goto La0
        L7b:
            qK1 r1 = r6.B
            KN r8 = defpackage.C8056za.j(r6)
            r13.d = r1
            r13.e = r3
            r11 = 0
            XV r7 = r6.N
            com.api.core.backend.domain.models.resultModels.CommonError r9 = r13.h
            java.lang.String r10 = r13.i
            r12 = r13
            java.lang.Object r14 = r7.b(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L94
            goto L9f
        L94:
            r3 = 0
            r12.d = r3
            r12.e = r2
            java.lang.Object r14 = r1.a(r14, r13)
            if (r14 != r0) goto La0
        L9f:
            return r0
        La0:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8104zm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
