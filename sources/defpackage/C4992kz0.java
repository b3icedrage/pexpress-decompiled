package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsViewModel$onSelectButtonClicked$1", f = "IndicatorsDetailsViewModel.kt", l = {66, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
public final class C4992kz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public XE1 d;
    public int e;
    public final /* synthetic */ C4782jz0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4992kz0(C4782jz0 c4782jz0, JM<? super C4992kz0> jm) {
        super(2, jm);
        this.g = c4782jz0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4992kz0(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4992kz0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r1.a((defpackage.C1491Lx0) r6, true, r5) == r0) goto L15;
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
            int r1 = r5.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r6)
            goto L40
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            XE1 r1 = r5.d
            defpackage.C1795Pt1.b(r6)
            goto L32
        L1e:
            defpackage.C1795Pt1.b(r6)
            jz0 r6 = r5.g
            XE1 r1 = r6.j
            r5.d = r1
            r5.e = r3
            rf0<Lx0> r6 = r6.k
            java.lang.Object r6 = defpackage.C4466ii.o(r6, r5)
            if (r6 != r0) goto L32
            goto L3f
        L32:
            Lx0 r6 = (defpackage.C1491Lx0) r6
            r4 = 0
            r5.d = r4
            r5.e = r2
            java.lang.Object r6 = r1.a(r6, r3, r5)
            if (r6 != r0) goto L40
        L3f:
            return r0
        L40:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4992kz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
