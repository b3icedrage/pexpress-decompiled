package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UH<V> {

    @NotNull
    public final Function1<Class<?>, V> a;

    @NotNull
    public final ConcurrentHashMap<Class<?>, V> b;

    /* JADX WARN: Multi-variable type inference failed */
    public UH(@NotNull Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = compute;
        this.b = new ConcurrentHashMap<>();
    }

    public final V a(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.b;
        V v = (V) concurrentHashMap.get(key);
        if (v != null) {
            return v;
        }
        V vInvoke = this.a.invoke(key);
        V v2 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}
