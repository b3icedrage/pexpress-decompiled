package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$onInstructionClick$1", f = "RobotDoubleStrategiesViewModelBase.kt", l = {102, 102}, m = "invokeSuspend")
public final class C5617nw1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public C6120qK1 d;
    public int e;
    public final /* synthetic */ C4984kw1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5617nw1(C4984kw1 c4984kw1, JM<? super C5617nw1> jm) {
        super(1, jm);
        this.g = c4984kw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5617nw1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C5617nw1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.a(r7, r6) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            MN r0 = defpackage.MN.d
            int r1 = r6.e
            r2 = 0
            kw1 r3 = r6.g
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            defpackage.C1795Pt1.b(r7)
            goto L3e
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            qK1 r1 = r6.d
            defpackage.C1795Pt1.b(r7)
            goto L33
        L21:
            defpackage.C1795Pt1.b(r7)
            qK1 r1 = r3.n
            r6.d = r1
            r6.e = r5
            ku r7 = r3.e
            java.lang.Object r7 = r7.d(r6)
            if (r7 != r0) goto L33
            goto L3d
        L33:
            r6.d = r2
            r6.e = r4
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L3e
        L3d:
            return r0
        L3e:
            com.api.feature.analytics.reporters.ReporterApi r7 = r3.f
            l80 r0 = defpackage.EnumC5028l80.z0
            s10 r1 = new s10
            L80 r3 = defpackage.L80.MAX_PROFIT
            java.lang.String r3 = "Strategies"
            r1.<init>(r3)
            r3 = 12
            com.api.feature.analytics.reporters.ReporterApi.a.b(r7, r0, r1, r2, r3)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5617nw1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
