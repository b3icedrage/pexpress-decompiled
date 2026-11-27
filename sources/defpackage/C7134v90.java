package defpackage;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: v90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedProperty$2$1", f = "EventsProviderImpl.kt", l = {62, 62}, m = "invokeSuspend")
public final class C7134v90 extends AW1 implements InterfaceC1060Gj0<InterfaceC3881fv, C7713xv0, JM<? super C4672jT>, Object> {
    public int d;
    public /* synthetic */ InterfaceC3881fv e;
    public final /* synthetic */ A90 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7134v90(A90 a90, JM<? super C7134v90> jm) {
        super(3, jm);
        this.g = a90;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        InterfaceC3881fv interfaceC3881fv;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            interfaceC3881fv = this.e;
            UC1 uc1 = this.g.e;
            this.e = interfaceC3881fv;
            this.d = 1;
            obj = uc1.g(this);
            if (obj != mn) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        interfaceC3881fv = this.e;
        C1795Pt1.b(obj);
        this.e = null;
        this.d = 2;
        Object objA = interfaceC3881fv.a((Map) obj, this);
        return objA == mn ? mn : objA;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC3881fv interfaceC3881fv, C7713xv0 c7713xv0, JM<? super C4672jT> jm) {
        C7134v90 c7134v90 = new C7134v90(this.g, jm);
        c7134v90.e = interfaceC3881fv;
        return c7134v90.invokeSuspend(Unit.a);
    }
}
