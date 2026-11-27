package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppFirstStepUseCaseBase$firstInitAndLaunchFlow$2", f = "LaunchAppFirstStepUseCaseBase.kt", l = {56, 57, 58}, m = "invokeSuspend")
public final class GM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ IM0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GM0(IM0 im0, JM<? super GM0> jm) {
        super(2, jm);
        this.e = im0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new GM0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((GM0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (defpackage.IM0.a(r5, r9) == r0) goto L20;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            MN r0 = defpackage.MN.d
            int r1 = r9.d
            r2 = 3
            r3 = 2
            r4 = 1
            IM0 r5 = r9.e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            defpackage.C1795Pt1.b(r10)
            goto L66
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            defpackage.C1795Pt1.b(r10)
            goto L5d
        L21:
            defpackage.C1795Pt1.b(r10)
            goto L4a
        L25:
            defpackage.C1795Pt1.b(r10)
            com.api.feature.analytics.reporters.ReporterApi r10 = r5.a
            l80 r1 = defpackage.EnumC5028l80.l
            ma r6 = defpackage.EnumC5326ma.g
            java.util.List r6 = defpackage.VE.c(r6)
            r7 = 8
            r8 = 0
            com.api.feature.analytics.reporters.ReporterApi.a.b(r10, r1, r8, r6, r7)
            qK1 r10 = r5.f
            java.lang.Integer r1 = new java.lang.Integer
            r6 = 33
            r1.<init>(r6)
            r9.d = r4
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L4a
            goto L65
        L4a:
            qK1 r10 = r5.e
            java.lang.Integer r1 = new java.lang.Integer
            r4 = 2131952141(0x7f13020d, float:1.9540716E38)
            r1.<init>(r4)
            r9.d = r3
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L5d
            goto L65
        L5d:
            r9.d = r2
            java.lang.Object r10 = defpackage.IM0.a(r5, r9)
            if (r10 != r0) goto L66
        L65:
            return r0
        L66:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GM0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
