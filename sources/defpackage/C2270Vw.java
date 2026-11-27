package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.CCIDirectionCalculator$calculateDirectionResult$3", f = "CCIDirectionCalculator.kt", l = {59, 60}, m = "invokeSuspend")
public final class C2270Vw extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super H32.a>, Double, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ double g;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r9.a(r1, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9.a(r1, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return r0;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            defpackage.C1795Pt1.b(r9)
            goto L44
        L19:
            defpackage.C1795Pt1.b(r9)
            sf0 r9 = r8.e
            double r4 = r8.g
            r1 = 100
            double r6 = (double) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L32
            H32$a r1 = H32.a.PUT_DOWN
            r8.d = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L44
            goto L43
        L32:
            r1 = -100
            double r6 = (double) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L44
            H32$a r1 = H32.a.CALL_UP
            r8.d = r2
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2270Vw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<? super H32.a> interfaceC6606sf0, Double d, JM<? super Unit> jm) {
        double dDoubleValue = d.doubleValue();
        C2270Vw c2270Vw = new C2270Vw(3, jm);
        c2270Vw.e = interfaceC6606sf0;
        c2270Vw.g = dDoubleValue;
        return c2270Vw.invokeSuspend(Unit.a);
    }
}
