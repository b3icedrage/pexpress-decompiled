package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl$subscribeForBalancesChanges$2", f = "UserDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C4232hb2 extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public C4232hb2() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C4232hb2 c4232hb2 = new C4232hb2(2, jm);
        c4232hb2.d = obj;
        return c4232hb2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
        return ((C4232hb2) create(bool, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(Intrinsics.a((Boolean) this.d, Boolean.TRUE));
    }
}
