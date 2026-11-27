package defpackage;

import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: p90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedEvent$2$1", f = "EventsProviderImpl.kt", l = {49, 49}, m = "invokeSuspend")
public final class C5875p90 extends AW1 implements InterfaceC1060Gj0<InterfaceC3881fv, C2658a80, JM<? super C4672jT>, Object> {
    public int d;
    public /* synthetic */ InterfaceC3881fv e;
    public /* synthetic */ C2658a80 g;
    public final /* synthetic */ A90 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5875p90(A90 a90, JM<? super C5875p90> jm) {
        super(3, jm);
        this.h = a90;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C2658a80 c2658a80;
        InterfaceC3881fv interfaceC3881fv;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC3881fv interfaceC3881fv2 = this.e;
            c2658a80 = this.g;
            UC1 uc1 = this.h.e;
            this.e = interfaceC3881fv2;
            this.g = c2658a80;
            this.d = 1;
            Serializable serializableG = uc1.g(this);
            if (serializableG != mn) {
                interfaceC3881fv = interfaceC3881fv2;
                obj = serializableG;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        c2658a80 = this.g;
        interfaceC3881fv = this.e;
        C1795Pt1.b(obj);
        this.e = null;
        this.g = null;
        this.d = 2;
        Object objB = interfaceC3881fv.b(c2658a80, (Map) obj, this);
        return objB == mn ? mn : objB;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC3881fv interfaceC3881fv, C2658a80 c2658a80, JM<? super C4672jT> jm) {
        C5875p90 c5875p90 = new C5875p90(this.h, jm);
        c5875p90.e = interfaceC3881fv;
        c5875p90.g = c2658a80;
        return c5875p90.invokeSuspend(Unit.a);
    }
}
