package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.SuspendDataStore$saveByKey$2", f = "SuspendDataStore.kt", l = {}, m = "invokeSuspend")
public final class C7205vW1 extends AW1 implements Function2<Y11, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7205vW1(String str, String str2, JM<? super C7205vW1> jm) {
        super(2, jm);
        this.e = str;
        this.g = str2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7205vW1 c7205vW1 = new C7205vW1(this.e, this.g, jm);
        c7205vW1.d = obj;
        return c7205vW1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Y11 y11, JM<? super Unit> jm) {
        return ((C7205vW1) create(y11, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        Y11 y11 = (Y11) this.d;
        AbstractC0662Bg1.a<String> key = C1052Gg1.d(this.e);
        y11.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        y11.d(key, this.g);
        return Unit.a;
    }
}
