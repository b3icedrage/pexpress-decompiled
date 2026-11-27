package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.action_button.ActivationActionButtonViewModelBase$onButtonClick$1", f = "ActivationActionButtonViewModelBase.kt", l = {33, 36}, m = "invokeSuspend")
public final class H5 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ I5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5(I5 i5, JM<? super H5> jm) {
        super(2, jm);
        this.e = i5;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new H5(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((H5) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r6.a(r5) == r0) goto L18;
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
            I5 r4 = r5.e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L30
        L1e:
            defpackage.C1795Pt1.b(r6)
            p6 r6 = r4.f
            On1 r6 = r6.a()
            r5.d = r3
            java.lang.Object r6 = defpackage.C4466ii.o(r6, r5)
            if (r6 != r0) goto L30
            goto L44
        L30:
            boolean r6 = r6 instanceof defpackage.AbstractC5652o6.c
            if (r6 == 0) goto L3a
            y5 r6 = r4.e
            r6.a()
            goto L45
        L3a:
            U5 r6 = r4.d
            r5.d = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
