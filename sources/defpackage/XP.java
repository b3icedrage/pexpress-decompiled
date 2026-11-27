package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.CryptoDemoTradesUpdater$closedDemoDeals$1", f = "CryptoDemoTradesUpdater.kt", l = {70, 70}, m = "invokeSuspend")
public final class XP extends AW1 implements Function2<InterfaceC6606sf0<? super List<? extends DF>>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3775fQ g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XP(C3775fQ c3775fQ, JM<? super XP> jm) {
        super(2, jm);
        this.g = c3775fQ;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        XP xp = new XP(this.g, jm);
        xp.e = obj;
        return xp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super List<? extends DF>> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((XP) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (defpackage.C4466ii.n(r4, (defpackage.InterfaceC6396rf0) r5, r1) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            MN r0 = defpackage.MN.d
            int r1 = r4.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r5)
            goto L45
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.e
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r5)
            goto L37
        L20:
            defpackage.C1795Pt1.b(r5)
            java.lang.Object r5 = r4.e
            r1 = r5
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            fQ r5 = r4.g
            L32 r5 = r5.c
            r4.e = r1
            r4.d = r3
            java.lang.Object r5 = r5.h(r4)
            if (r5 != r0) goto L37
            goto L44
        L37:
            rf0 r5 = (defpackage.InterfaceC6396rf0) r5
            r3 = 0
            r4.e = r3
            r4.d = r2
            java.lang.Object r5 = defpackage.C4466ii.n(r4, r5, r1)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XP.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
