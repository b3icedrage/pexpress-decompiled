package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", f = "ContentNegotiation.kt", l = {253, 254}, m = "invokeSuspend")
public final class C3134cM extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public final /* synthetic */ C2701aM g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3134cM(C2701aM c2701aM, JM<? super C3134cM> jm) {
        super(3, jm);
        this.g = c2701aM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1.d(r5, r6) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r6)
            goto L49
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            Hd1 r1 = r5.e
            defpackage.C1795Pt1.b(r6)
            goto L38
        L1e:
            defpackage.C1795Pt1.b(r6)
            Hd1 r1 = r5.e
            TContext r6 = r1.d
            br0 r6 = (defpackage.C3032br0) r6
            java.lang.Object r4 = r1.b()
            r5.e = r1
            r5.d = r3
            aM r3 = r5.g
            java.lang.Object r6 = r3.a(r6, r4, r5)
            if (r6 != r0) goto L38
            goto L48
        L38:
            if (r6 != 0) goto L3d
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L3d:
            r3 = 0
            r5.e = r3
            r5.d = r2
            java.lang.Object r6 = r1.d(r5, r6)
            if (r6 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3134cM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C3134cM c3134cM = new C3134cM(this.g, jm);
        c3134cM.e = abstractC1121Hd1;
        return c3134cM.invokeSuspend(Unit.a);
    }
}
