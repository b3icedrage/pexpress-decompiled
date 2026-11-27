package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: y12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$recordUpstreamEnd$1", f = "Trader.kt", l = {}, m = "invokeSuspend")
public final class C7735y12 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Throwable, JM<? super Unit>, Object> {
    public /* synthetic */ Throwable d;
    public final /* synthetic */ C3034bs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7735y12(C3034bs c3034bs, JM<? super C7735y12> jm) {
        super(3, jm);
        this.e = c3034bs;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Ia2 ia2;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        Throwable th = this.d;
        if (th == null) {
            ia2 = Ia2.d;
        } else {
            ia2 = th instanceof CancellationException ? null : Ia2.e;
        }
        this.e.b = ia2;
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Throwable th, JM<? super Unit> jm) {
        C7735y12 c7735y12 = new C7735y12(this.e, jm);
        c7735y12.d = th;
        return c7735y12.invokeSuspend(Unit.a);
    }
}
