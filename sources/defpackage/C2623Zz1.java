package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Zz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$onInsufficientFunds$3$1", f = "RobotTrading.kt", l = {473, 474, 477}, m = "invokeSuspend")
public final class C2623Zz1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public String d;
    public int e;
    public final /* synthetic */ C4617jA1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2623Zz1(C4617jA1 c4617jA1, JM<? super C2623Zz1> jm) {
        super(2, jm);
        this.g = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2623Zz1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2623Zz1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r5.h(r8, r7) == r0) goto L20;
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
            int r1 = r7.e
            jA1 r2 = r7.g
            r3 = 3
            r4 = 1
            ub2 r5 = r2.v
            r6 = 2
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r6) goto L1f
            if (r1 != r3) goto L17
            defpackage.C1795Pt1.b(r8)
            goto L5e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.String r1 = r7.d
            defpackage.C1795Pt1.b(r8)
            goto L4d
        L25:
            defpackage.C1795Pt1.b(r8)
            goto L39
        L29:
            defpackage.C1795Pt1.b(r8)
            kf r8 = r2.a
            GP1 r8 = r8.f
            r7.e = r4
            java.lang.Object r8 = defpackage.C7236vf0.a(r8, r7)
            if (r8 != r0) goto L39
            goto L5d
        L39:
            rG r8 = (defpackage.C6315rG) r8
            java.lang.String r1 = r8.a
            tG r8 = new tG
            r8.<init>(r1, r6)
            r7.d = r1
            r7.e = r6
            java.lang.Object r8 = r5.x(r8, r7)
            if (r8 != r0) goto L4d
            goto L5d
        L4d:
            XF r8 = new XF
            r8.<init>(r1)
            r1 = 0
            r7.d = r1
            r7.e = r3
            java.lang.Object r8 = r5.h(r8, r7)
            if (r8 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2623Zz1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
