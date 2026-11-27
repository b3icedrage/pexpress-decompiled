package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.NetworkRetry$tryAgain$1", f = "NetworkRetry.kt", l = {73, 77}, m = "invokeSuspend")
public final class C3076c41 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2643a41 e;
    public final /* synthetic */ E31 g;
    public final /* synthetic */ C2643a41.a h;
    public final /* synthetic */ F31 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3076c41(C2643a41 c2643a41, E31 e31, C2643a41.a aVar, F31 f31, JM jm) {
        super(2, jm);
        this.e = c2643a41;
        this.g = e31;
        this.h = aVar;
        this.i = f31;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C2643a41.a aVar = this.h;
        F31 f31 = this.i;
        return new C3076c41(this.e, this.g, aVar, f31, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3076c41) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r6.invoke(r5) == r0) goto L29;
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
            int r1 = r5.d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L5d
        L11:
            r6 = move-exception
            goto L6c
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L2f
        L1f:
            defpackage.C1795Pt1.b(r6)
            a41 r6 = r5.e     // Catch: java.lang.Throwable -> L11
            E31 r1 = r5.g     // Catch: java.lang.Throwable -> L11
            r5.d = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = defpackage.C2643a41.a(r6, r1, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L2f
            goto L5c
        L2f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L3f
            a41$a r6 = r5.h     // Catch: java.lang.Throwable -> L11
            uv1 r6 = r6.a     // Catch: java.lang.Throwable -> L11
            r6.invoke()     // Catch: java.lang.Throwable -> L11
            goto L5d
        L3f:
            a41 r6 = r5.e     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference<a41$a> r6 = r6.a     // Catch: java.lang.Throwable -> L11
            a41$a r1 = r5.h     // Catch: java.lang.Throwable -> L11
        L45:
            boolean r3 = r6.compareAndSet(r4, r1)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L4c
            goto L52
        L4c:
            java.lang.Object r3 = r6.get()     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L45
        L52:
            F31 r6 = r5.i     // Catch: java.lang.Throwable -> L11
            r5.d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            a41 r6 = r5.e
            a41$a r6 = r6.c
            a41$a r0 = r5.h
            if (r6 != r0) goto L69
            a41 r6 = r5.e
            r6.c = r4
        L69:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6c:
            a41 r0 = r5.e
            a41$a r0 = r0.c
            a41$a r1 = r5.h
            if (r0 != r1) goto L78
            a41 r0 = r5.e
            r0.c = r4
        L78:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3076c41.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
