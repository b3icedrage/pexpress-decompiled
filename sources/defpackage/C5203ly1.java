package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ly1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onAmountFocusExit$1", f = "RobotOptionsViewModelBase.kt", l = {136, 137, 138}, m = "invokeSuspend")
public final class C5203ly1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5623ny1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5203ly1(C5623ny1 c5623ny1, JM<? super C5203ly1> jm) {
        super(1, jm);
        this.e = c5623ny1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5203ly1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C5203ly1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7.f(r1, r5) == r0) goto L22;
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
            int r1 = r6.d
            r2 = 3
            r3 = 2
            r4 = 1
            ny1 r5 = r6.e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            defpackage.C1795Pt1.b(r7)
            goto L59
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            defpackage.C1795Pt1.b(r7)
            goto L3e
        L21:
            defpackage.C1795Pt1.b(r7)
            goto L33
        L25:
            defpackage.C1795Pt1.b(r7)
            U9 r7 = r5.j
            r6.d = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L33
            goto L58
        L33:
            rf0<java.lang.Long> r7 = r5.s
            r6.d = r3
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r6)
            if (r7 != r0) goto L3e
            goto L58
        L3e:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L59
            long r3 = r7.longValue()
            double r3 = (double) r3
            com.api.feature.analytics.reporters.ReporterApi r7 = r5.i
            l80 r1 = defpackage.EnumC5028l80.H
            T9 r5 = new T9
            r5.<init>(r3)
            r6.d = r2
            kotlin.Unit r7 = r7.f(r1, r5)
            if (r7 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5203ly1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
