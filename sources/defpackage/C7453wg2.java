package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketListener$startLastMessageJob$1", f = "WebSocketListener.kt", l = {306, 339}, m = "invokeSuspend")
public final class C7453wg2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7242vg2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7453wg2(C7242vg2 c7242vg2, JM<? super C7453wg2> jm) {
        super(2, jm);
        this.e = c7242vg2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7453wg2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7453wg2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        if (r2.t(new defpackage.C5980pg(2), r17) == r1) goto L35;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7453wg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
