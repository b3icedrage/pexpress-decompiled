package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", f = "ContentNegotiation.kt", l = {264, 267}, m = "invokeSuspend")
public final class C3344dM extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<C5601nr0, C2250Vp0>, C5601nr0, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2701aM h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344dM(C2701aM c2701aM, JM<? super C3344dM> jm) {
        super(3, jm);
        this.h = c2701aM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r3.d(r12, r5) == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3344dM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<C5601nr0, C2250Vp0> abstractC1121Hd1, C5601nr0 c5601nr0, JM<? super Unit> jm) {
        C3344dM c3344dM = new C3344dM(this.h, jm);
        c3344dM.e = abstractC1121Hd1;
        c3344dM.g = c5601nr0;
        return c3344dM.invokeSuspend(Unit.a);
    }
}
