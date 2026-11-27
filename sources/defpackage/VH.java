package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VH<T> implements InterfaceC2551Zb1<T> {

    @NotNull
    public final ML0 a;

    @NotNull
    public final ConcurrentHashMap<Class<?>, C2473Yb1<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public VH(@NotNull Function2<? super RI0<Object>, ? super List<? extends SJ0>, ? extends RJ0<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = (ML0) compute;
        this.b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ML0, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC2551Zb1
    @NotNull
    public final Object a(@NotNull RI0 key, @NotNull ArrayList types) {
        Object objA;
        C2473Yb1<T> c2473Yb1PutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, C2473Yb1<T>> concurrentHashMap = this.b;
        Class<?> clsG = C7279vr.g(key);
        C2473Yb1<T> c2473Yb1 = concurrentHashMap.get(clsG);
        if (c2473Yb1 == null && (c2473Yb1PutIfAbsent = concurrentHashMap.putIfAbsent(clsG, (c2473Yb1 = new C2473Yb1<>()))) != null) {
            c2473Yb1 = c2473Yb1PutIfAbsent;
        }
        C2473Yb1<T> c2473Yb2 = c2473Yb1;
        ArrayList arrayList = new ArrayList(XE.m(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2696aK0((SJ0) it.next()));
        }
        ConcurrentHashMap<List<C2696aK0>, C1717Ot1<RJ0<T>>> concurrentHashMap2 = c2473Yb2.a;
        C1717Ot1<RJ0<T>> c1717Ot1 = concurrentHashMap2.get(arrayList);
        if (c1717Ot1 == null) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = (RJ0) this.a.invoke(key, types);
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            C1717Ot1<RJ0<T>> c1717Ot2 = new C1717Ot1<>(objA);
            C1717Ot1<RJ0<T>> c1717Ot1PutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, c1717Ot2);
            c1717Ot1 = c1717Ot1PutIfAbsent == null ? c1717Ot2 : c1717Ot1PutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(c1717Ot1, "getOrPut(...)");
        return c1717Ot1.d;
    }
}
