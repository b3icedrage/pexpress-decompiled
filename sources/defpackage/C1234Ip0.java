package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Ip0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", l = {142, 145}, m = "invokeSuspend")
public final class C1234Ip0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<C5601nr0, C2250Vp0>, C5601nr0, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public /* synthetic */ C5601nr0 g;
    public final /* synthetic */ C1390Kp0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234Ip0(C1390Kp0 c1390Kp0, JM<? super C1234Ip0> jm) {
        super(3, jm);
        this.h = c1390Kp0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r5 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Hd1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            MN r0 = defpackage.MN.d
            int r1 = r4.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L14:
            java.lang.Object r0 = r4.e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.C1795Pt1.b(r5)
            goto L58
        L1c:
            java.lang.Object r1 = r4.e
            Hd1 r1 = (defpackage.AbstractC1121Hd1) r1
            defpackage.C1795Pt1.b(r5)     // Catch: java.lang.Throwable -> L24
            goto L3b
        L24:
            r5 = move-exception
            goto L3e
        L26:
            defpackage.C1795Pt1.b(r5)
            java.lang.Object r5 = r4.e
            r1 = r5
            Hd1 r1 = (defpackage.AbstractC1121Hd1) r1
            nr0 r5 = r4.g
            r4.e = r1     // Catch: java.lang.Throwable -> L24
            r4.d = r3     // Catch: java.lang.Throwable -> L24
            java.lang.Object r5 = r1.d(r4, r5)     // Catch: java.lang.Throwable -> L24
            if (r5 != r0) goto L3b
            goto L56
        L3b:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L3e:
            java.lang.Throwable r5 = defpackage.QO.r(r5)
            TContext r1 = r1.d
            Vp0 r1 = (defpackage.C2250Vp0) r1
            Zq0 r1 = r1.c()
            r4.e = r5
            r4.d = r2
            Kp0 r2 = r4.h
            kotlin.Unit r1 = defpackage.C1390Kp0.a(r2, r5, r1, r4)
            if (r1 != r0) goto L57
        L56:
            return r0
        L57:
            r0 = r5
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1234Ip0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<C5601nr0, C2250Vp0> abstractC1121Hd1, C5601nr0 c5601nr0, JM<? super Unit> jm) {
        C1234Ip0 c1234Ip0 = new C1234Ip0(this.h, jm);
        c1234Ip0.e = abstractC1121Hd1;
        c1234Ip0.g = c5601nr0;
        return c1234Ip0.invokeSuspend(Unit.a);
    }
}
