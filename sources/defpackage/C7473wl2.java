package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: wl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$runningHistory$1", f = "WsApiUtils.kt", l = {}, m = "invokeSuspend")
public final class C7473wl2 extends AW1 implements InterfaceC1060Gj0<C0919Eo0<Object>, Object, JM<? super C0919Eo0<Object>>, Object> {
    public /* synthetic */ C0919Eo0 d;
    public /* synthetic */ Object e;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C0919Eo0 c0919Eo0 = this.d;
        return new C0919Eo0(c0919Eo0 != null ? c0919Eo0.b : null, this.e);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(C0919Eo0<Object> c0919Eo0, Object obj, JM<? super C0919Eo0<Object>> jm) {
        C7473wl2 c7473wl2 = new C7473wl2(3, jm);
        c7473wl2.d = c0919Eo0;
        c7473wl2.e = obj;
        return c7473wl2.invokeSuspend(Unit.a);
    }
}
