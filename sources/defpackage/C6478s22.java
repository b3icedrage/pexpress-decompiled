package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: s22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$onAssetClick$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {80, 87}, m = "invokeSuspend")
public final class C6478s22 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3279d22 g;
    public final /* synthetic */ AbstractC6898u22 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6478s22(C3279d22 c3279d22, AbstractC6898u22 abstractC6898u22, JM<? super C6478s22> jm) {
        super(2, jm);
        this.g = c3279d22;
        this.h = abstractC6898u22;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C6478s22 c6478s22 = new C6478s22(this.g, this.h, jm);
        c6478s22.e = obj;
        return c6478s22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6478s22) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r8.f(r1, r2) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r8 == r0) goto L18;
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
            d22 r4 = r7.g
            u22 r5 = r7.h
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r7.e
            KN r0 = (defpackage.KN) r0
            defpackage.C1795Pt1.b(r8)
            goto L5b
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            defpackage.C1795Pt1.b(r8)
            goto L43
        L24:
            defpackage.C1795Pt1.b(r8)
            java.lang.Object r8 = r7.e
            KN r8 = (defpackage.KN) r8
            boolean r1 = r4.u
            if (r1 != 0) goto L4e
            com.api.feature.analytics.reporters.ReporterApi r8 = r5.h
            l80 r1 = defpackage.EnumC5028l80.J
            j22 r2 = new j22
            java.lang.String r6 = r4.c
            r2.<init>(r6)
            r7.d = r3
            kotlin.Unit r8 = r8.f(r1, r2)
            if (r8 != r0) goto L43
            goto L5a
        L43:
            z22 r8 = r5.e
            r8.k(r4)
            h22 r8 = r5.f
            r8.i(r4)
            goto L87
        L4e:
            rf0<java.lang.Boolean> r1 = r5.l
            r7.e = r8
            r7.d = r2
            java.lang.Object r8 = defpackage.C4466ii.o(r1, r7)
            if (r8 != r0) goto L5b
        L5a:
            return r0
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L66
            java.lang.String r8 = "indicator_unsupported"
            goto L68
        L66:
            java.lang.String r8 = "not_best_in_auto_mode"
        L68:
            Ot1$a r0 = defpackage.C1717Ot1.e     // Catch: java.lang.Throwable -> L81
            f42 r0 = r5.k     // Catch: java.lang.Throwable -> L81
            LJ1 r1 = defpackage.LJ1.Asset     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "asset_title"
            java.lang.String r3 = r4.c     // Catch: java.lang.Throwable -> L81
            kotlin.Pair r4 = new kotlin.Pair     // Catch: java.lang.Throwable -> L81
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L81
            java.util.Map r2 = defpackage.OW0.b(r4)     // Catch: java.lang.Throwable -> L81
            r0.D(r1, r8, r2)     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r8 = move-exception
            Ot1$a r0 = defpackage.C1717Ot1.e
            defpackage.C1795Pt1.a(r8)
        L87:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6478s22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
