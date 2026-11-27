package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.tool.AppImpl$wireSentryUserContext$5", f = "AppImpl.kt", l = {}, m = "invokeSuspend")
public final class C7243vh extends AW1 implements Function2<String, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;

    public C7243vh() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7243vh c7243vh = new C7243vh(2, jm);
        c7243vh.d = obj;
        return c7243vh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, JM<? super Unit> jm) {
        return ((C7243vh) create(str, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        QF1.m("language", (String) this.d);
        return Unit.a;
    }
}
