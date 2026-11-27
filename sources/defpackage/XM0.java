package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppSecondStepUseCaseBase$checkForUpdates$2", f = "LaunchAppSecondStepUseCaseBase.kt", l = {47, 48, 51, 54, 57, 58, 61}, m = "invokeSuspend")
public final class XM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public Boolean d;
    public int e;
    public final /* synthetic */ C3348dN0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XM0(C3348dN0 c3348dN0, JM<? super XM0> jm) {
        super(2, jm);
        this.g = c3348dN0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new XM0(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((XM0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r1 r12
      0x0045: PHI (r1v3 java.lang.Boolean) = (r1v2 java.lang.Boolean), (r1v8 java.lang.Boolean) binds: [B:14:0x0041, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0041, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        if (r12 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010c, code lost:
    
        if (defpackage.C3348dN0.b(r2, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (defpackage.C3348dN0.b(r2, r11) == r0) goto L56;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XM0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
