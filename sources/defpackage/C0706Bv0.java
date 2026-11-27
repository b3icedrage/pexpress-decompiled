package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0706Bv0 implements InterfaceC0784Cv0 {

    @NotNull
    public final C6458rx0 a;

    public C0706Bv0(@NotNull C6458rx0 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
    }

    @Override // defpackage.InterfaceC0784Cv0
    @Nullable
    public final Object a(@NotNull JM<? super C0612Aq> jm) {
        List<Object> listA = this.a.a();
        Intrinsics.c(listA, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<com.amplitude.core.events.BaseEvent>>");
        if (listA.isEmpty() || ((List) listA.get(0)).isEmpty()) {
            return null;
        }
        List list = (List) listA.get(0);
        C0612Aq c0612Aq = (C0612Aq) list.get(0);
        LinkedHashMap linkedHashMap = c0612Aq.P;
        Intrinsics.checkNotNull(linkedHashMap);
        Object obj = linkedHashMap.get("$set");
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        LinkedHashMap linkedHashMapC = C4019gb.c(F62.c(obj));
        List events = list.subList(1, list.size());
        Intrinsics.checkNotNullParameter(events, "events");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            LinkedHashMap linkedHashMap3 = ((C0612Aq) it.next()).P;
            Intrinsics.checkNotNull(linkedHashMap3);
            Object obj2 = linkedHashMap3.get("$set");
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            linkedHashMap2.putAll(C4019gb.c(F62.c(obj2)));
        }
        linkedHashMapC.putAll(linkedHashMap2);
        LinkedHashMap linkedHashMap4 = c0612Aq.P;
        Intrinsics.checkNotNull(linkedHashMap4);
        linkedHashMap4.put("$set", linkedHashMapC);
        return c0612Aq;
    }

    @Override // defpackage.InterfaceC0784Cv0
    @Nullable
    public final Object b(@NotNull JM<? super Unit> jm) {
        C6458rx0 c6458rx0 = this.a;
        synchronized (c6458rx0.b) {
            c6458rx0.a.clear();
        }
        return Unit.a;
    }
}
