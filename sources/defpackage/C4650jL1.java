package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.usecases.ShowErrorUseCaseBase$showError$2", f = "ShowErrorUseCaseBase.kt", l = {31, 33}, m = "invokeSuspend")
public final class C4650jL1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4860kL1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4650jL1(C4860kL1 c4860kL1, JM<? super C4650jL1> jm) {
        super(2, jm);
        this.g = c4860kL1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C4650jL1 c4650jL1 = new C4650jL1(this.g, jm);
        c4650jL1.e = obj;
        return c4650jL1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4650jL1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r6.a(null, r5) == r0) goto L17;
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
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r6)
            goto L4b
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.e
            KN r1 = (defpackage.KN) r1
            defpackage.C1795Pt1.b(r6)
            goto L35
        L20:
            defpackage.C1795Pt1.b(r6)
            java.lang.Object r6 = r5.e
            r1 = r6
            KN r1 = (defpackage.KN) r1
            r5.e = r1
            r5.d = r3
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = defpackage.IW.b(r3, r5)
            if (r6 != r0) goto L35
            goto L4a
        L35:
            boolean r6 = defpackage.LN.e(r1)
            if (r6 == 0) goto L4b
            kL1 r6 = r5.g
            qK1 r6 = r6.a
            r1 = 0
            r5.e = r1
            r5.d = r2
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4650jL1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
