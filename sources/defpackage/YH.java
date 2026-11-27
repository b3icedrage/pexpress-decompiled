package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YH implements InterfaceC2576Zk {

    @NotNull
    public final ConcurrentHashMap<C2498Yk<?>, Object> a = new ConcurrentHashMap<>();

    @Override // defpackage.InterfaceC2576Zk
    @NotNull
    public final <T> T a(@NotNull C2498Yk<T> key, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<C2498Yk<?>, Object> concurrentHashMap = this.a;
        T t = (T) concurrentHashMap.get(key);
        if (t != null) {
            return t;
        }
        T tInvoke = block.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent((C2498Yk<?>) key, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        Intrinsics.c(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // defpackage.InterfaceC2576Zk
    public final void b(@NotNull C2498Yk key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        g().put(key, value);
    }

    @Override // defpackage.InterfaceC2576Zk
    @NotNull
    public final List c() {
        return CollectionsKt.e0(g().keySet());
    }

    @Override // defpackage.InterfaceC2576Zk
    public final boolean d(@NotNull C2498Yk key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().containsKey(key);
    }

    @Override // defpackage.InterfaceC2576Zk
    @Nullable
    public final Object e(@NotNull C2498Yk key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().get(key);
    }

    @Override // defpackage.InterfaceC2576Zk
    @NotNull
    public final Object f(@NotNull C2498Yk key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objE = e(key);
        if (objE != null) {
            return objE;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    public final Map g() {
        return this.a;
    }
}
