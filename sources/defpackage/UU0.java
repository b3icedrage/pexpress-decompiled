package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.MACDDirectionCalculator$calculateDirectionResult$3", f = "MACDDirectionCalculator.kt", l = {54, 55}, m = "invokeSuspend")
public final class UU0 extends AW1 implements InterfaceC1138Hj0<InterfaceC6606sf0<? super H32.a>, Double, Double, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ double g;
    public /* synthetic */ double h;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r11.a(r1, r10) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r11.a(r1, r10) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return r0;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            MN r0 = defpackage.MN.d
            int r1 = r10.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L15:
            defpackage.C1795Pt1.b(r11)
            goto L4a
        L19:
            defpackage.C1795Pt1.b(r11)
            sf0 r11 = r10.e
            double r4 = r10.g
            double r6 = r10.h
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L37
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L37
            H32$a r1 = H32.a.PUT_DOWN
            r10.d = r3
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L4a
            goto L49
        L37:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L4a
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L4a
            H32$a r1 = H32.a.CALL_UP
            r10.d = r2
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UU0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(InterfaceC6606sf0<? super H32.a> interfaceC6606sf0, Double d, Double d2, JM<? super Unit> jm) {
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        UU0 uu0 = new UU0(4, jm);
        uu0.e = interfaceC6606sf0;
        uu0.g = dDoubleValue;
        uu0.h = dDoubleValue2;
        return uu0.invokeSuspend(Unit.a);
    }
}
