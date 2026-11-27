package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialViewModelBase$exitTutorial$1", f = "TutorialViewModelBase.kt", l = {60, 61}, m = "invokeSuspend")
public final class N52 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ P52 e;

    @InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialViewModelBase$exitTutorial$1$1", f = "TutorialViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            ((a) create(jm)).invokeSuspend(Unit.a);
            return Boolean.TRUE;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N52(P52 p52, JM<? super N52> jm) {
        super(2, jm);
        this.e = p52;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new N52(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((N52) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.a(r6) == r0) goto L15;
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
            P52 r2 = r6.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r7)
            goto L3d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            defpackage.C1795Pt1.b(r7)
            goto L32
        L1e:
            defpackage.C1795Pt1.b(r7)
            L52 r7 = r2.f
            N52$a r1 = new N52$a
            r5 = 0
            r1.<init>(r4, r5)
            r6.d = r4
            java.lang.Object r7 = r7.m(r1, r6)
            if (r7 != r0) goto L32
            goto L3c
        L32:
            x52 r7 = r2.d
            r6.d = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N52.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
