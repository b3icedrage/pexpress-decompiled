package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: uN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$onSocialLoginClick$2", f = "SocialLoginWithWebView.kt", l = {69, 72, 75, 80}, m = "invokeSuspend")
public final class C6968uN1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC5709oN1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6968uN1(AbstractC5709oN1 abstractC5709oN1, JM jm) {
        super(2, jm);
        EnumC5076lN1 enumC5076lN1 = EnumC5076lN1.d;
        this.e = abstractC5709oN1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        EnumC5076lN1 enumC5076lN1 = EnumC5076lN1.d;
        return new C6968uN1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6968uN1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r8.a(r1, null, null) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r8.a(r1, null, null) == r0) goto L34;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            MN r0 = defpackage.MN.d
            int r1 = r7.d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            oN1 r6 = r7.e
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.C1795Pt1.b(r8)
            goto L89
        L22:
            defpackage.C1795Pt1.b(r8)
            goto L61
        L26:
            defpackage.C1795Pt1.b(r8)
            goto L38
        L2a:
            defpackage.C1795Pt1.b(r8)
            Hh r8 = r6.c
            r7.d = r5
            java.lang.Object r8 = r8.d(r7)
            if (r8 != r0) goto L38
            goto L88
        L38:
            com.api.core.backend.domain.models.resultModels.CommonResult r8 = (com.api.core.backend.domain.models.resultModels.CommonResult) r8
            java.lang.Object r8 = com.api.core.backend.domain.models.resultModels.CommonResultKt.b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r8, r1)
            if (r1 == 0) goto L64
            r7.d = r4
            lN1 r8 = defpackage.EnumC5076lN1.d
            r6.h = r8
            kN1 r1 = r6.F()
            r1.e()
            java.lang.Object r8 = r6.D(r8, r7)
            if (r8 != r0) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r8 = kotlin.Unit.a
        L5e:
            if (r8 != r0) goto L61
            goto L88
        L61:
            kotlin.Unit r8 = kotlin.Unit.a
            goto L89
        L64:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r8, r1)
            r4 = 0
            if (r1 == 0) goto L7a
            VK1 r8 = r6.b
            Nf$a r1 = defpackage.AbstractC1592Nf.C1593a.b
            r7.d = r3
            java.lang.Boolean r8 = r8.a(r1, r4, r4)
            if (r8 != r0) goto L89
            goto L88
        L7a:
            if (r8 != 0) goto L8c
            VK1 r8 = r6.b
            Nf$f r1 = defpackage.AbstractC1592Nf.f.b
            r7.d = r2
            java.lang.Boolean r8 = r8.a(r1, r4, r4)
            if (r8 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L8c:
            s51 r8 = new s51
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6968uN1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
