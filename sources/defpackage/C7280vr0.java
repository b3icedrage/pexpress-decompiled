package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: vr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {104, 105}, m = "invokeSuspend")
public final class C7280vr0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ AbstractC1121Hd1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6860tr0 h;
    public final /* synthetic */ C1782Pp0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7280vr0(C6860tr0 c6860tr0, C1782Pp0 c1782Pp0, JM<? super C7280vr0> jm) {
        super(3, jm);
        this.h = c6860tr0;
        this.i = c1782Pp0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (r1.d(r10, (defpackage.C2250Vp0) r11) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, tr0$b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, tr0$c] */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7280vr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C7280vr0 c7280vr0 = new C7280vr0(this.h, this.i, jm);
        c7280vr0.e = abstractC1121Hd1;
        c7280vr0.g = obj;
        return c7280vr0.invokeSuspend(Unit.a);
    }
}
