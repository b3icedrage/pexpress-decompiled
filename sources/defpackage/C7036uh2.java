package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: uh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.providers.WebSocketUrlProvider$realServersList$2", f = "WebSocketUrlProvider.kt", l = {}, m = "invokeSuspend")
public final class C7036uh2 extends AW1 implements Function2<List<? extends C5686oG>, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;

    public C7036uh2() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7036uh2 c7036uh2 = new C7036uh2(2, jm);
        c7036uh2.d = obj;
        return c7036uh2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C5686oG> list, JM<? super Unit> jm) {
        return ((C7036uh2) create(list, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        List list = (List) this.d;
        if (list != null) {
            arrayList = new ArrayList(XE.m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5686oG) it.next()).a);
            }
        } else {
            arrayList = null;
        }
        String.valueOf(arrayList);
        return Unit.a;
    }
}
