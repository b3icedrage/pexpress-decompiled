package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$loadLoginUrlSilent$1", f = "SocialLoginWithWebView.kt", l = {210, 211}, m = "invokeSuspend")
public final class C6548sN1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC5709oN1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6548sN1(AbstractC5709oN1 abstractC5709oN1, JM<? super C6548sN1> jm) {
        super(2, jm);
        this.e = abstractC5709oN1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6548sN1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6548sN1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (defpackage.C5189lv.p(defpackage.QV0.a, new defpackage.C6758tN1(r2, (java.lang.String) r6, null), r5) == r0) goto L15;
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
            oN1 r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L44
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L2f
        L1e:
            defpackage.C1795Pt1.b(r6)
            r5.d = r4
            r6 = r2
            vN1 r6 = (defpackage.C7178vN1) r6
            Pa2 r6 = r6.j
            java.lang.Object r6 = r6.h(r5)
            if (r6 != r0) goto L2f
            goto L43
        L2f:
            java.lang.String r6 = (java.lang.String) r6
            r5.d = r3
            RV r1 = defpackage.C6266r20.a
            zn0 r1 = defpackage.QV0.a
            tN1 r3 = new tN1
            r4 = 0
            r3.<init>(r2, r6, r4)
            java.lang.Object r6 = defpackage.C5189lv.p(r1, r3, r5)
            if (r6 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6548sN1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
