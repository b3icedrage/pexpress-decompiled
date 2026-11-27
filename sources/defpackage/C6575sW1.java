package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: renamed from: sW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.SuspendDataStore$clearData$2", f = "SuspendDataStore.kt", l = {}, m = "invokeSuspend")
public final class C6575sW1 extends AW1 implements Function2<Y11, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6575sW1(String str, JM<? super C6575sW1> jm) {
        super(2, jm);
        this.e = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C6575sW1 c6575sW1 = new C6575sW1(this.e, jm);
        c6575sW1.d = obj;
        return c6575sW1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Y11 y11, JM<? super Unit> jm) {
        return ((C6575sW1) create(y11, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        Y11 y11 = (Y11) this.d;
        Map<AbstractC0662Bg1.a<?>, Object> mapA = y11.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AbstractC0662Bg1.a<?>, Object> entry : mapA.entrySet()) {
            if (d.o(entry.getKey().a, this.e, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (AbstractC0662Bg1.a key : linkedHashMap.keySet()) {
            Intrinsics.checkNotNullParameter(key, "key");
            y11.c();
            y11.a.remove(key);
        }
        return Unit.a;
    }
}
