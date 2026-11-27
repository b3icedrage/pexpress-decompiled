package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$rotateEndpoint$1", f = "WebSocketRequestExecutorBase.kt", l = {167, 168}, m = "invokeSuspend")
public final class Mg2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Fg2<Object> e;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mg2(Fg2<Object> fg2, String str, boolean z, JM<? super Mg2> jm) {
        super(2, jm);
        this.e = fg2;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Mg2(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Mg2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r9 == r0) goto L20;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L11
            goto L3f
        L11:
            r9 = move-exception
            goto La5
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L11
            goto L30
        L20:
            defpackage.C1795Pt1.b(r9)
            Fg2<java.lang.Object> r9 = r8.e     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r8.g     // Catch: java.lang.Throwable -> L11
            r8.d = r4     // Catch: java.lang.Throwable -> L11
            java.lang.Object r9 = r9.l(r1, r8)     // Catch: java.lang.Throwable -> L11
            if (r9 != r0) goto L30
            goto L3e
        L30:
            Fg2<java.lang.Object> r9 = r8.e     // Catch: java.lang.Throwable -> L11
            boolean r1 = r8.h     // Catch: java.lang.Throwable -> L11
            r8.d = r3     // Catch: java.lang.Throwable -> L11
            int r3 = defpackage.Fg2.w     // Catch: java.lang.Throwable -> L11
            java.lang.Object r9 = r9.w(r1, r8)     // Catch: java.lang.Throwable -> L11
            if (r9 != r0) goto L3f
        L3e:
            return r0
        L3f:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L11
            boolean r0 = defpackage.C5777oh2.a(r9)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L4b
            Fg2<java.lang.Object> r0 = r8.e     // Catch: java.lang.Throwable -> L11
            r0.i = r9     // Catch: java.lang.Throwable -> L11
        L4b:
            Qg r0 = defpackage.U0.N     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L9b
            java.lang.String r1 = "endpoint_rotated"
            java.lang.String r3 = "is_real"
            Fg2<java.lang.Object> r4 = r8.e     // Catch: java.lang.Throwable -> L11
            boolean r4 = r4.n()     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L11
            kotlin.Pair r5 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "from"
            java.lang.String r4 = r8.g     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = defpackage.U0.j(r4)     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L6e
            java.lang.String r4 = r8.g     // Catch: java.lang.Throwable -> L11
        L6e:
            kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "to"
            java.lang.String r4 = defpackage.U0.j(r9)     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L7c
            r4 = r9
        L7c:
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11
            r7.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "resolved"
            boolean r9 = defpackage.C5777oh2.a(r9)     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L11
            kotlin.Pair r4 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11
            r4.<init>(r3, r9)     // Catch: java.lang.Throwable -> L11
            kotlin.Pair[] r9 = new kotlin.Pair[]{r5, r6, r7, r4}     // Catch: java.lang.Throwable -> L11
            java.util.Map r9 = defpackage.PW0.e(r9)     // Catch: java.lang.Throwable -> L11
            r0.invoke(r1, r9)     // Catch: java.lang.Throwable -> L11
        L9b:
            Fg2<java.lang.Object> r9 = r8.e
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.u
            r9.set(r2)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        La5:
            Fg2<java.lang.Object> r0 = r8.e
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.u
            r0.set(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Mg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
