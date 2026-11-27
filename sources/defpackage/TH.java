package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TH<T> implements InterfaceC3124cI1<T> {

    @NotNull
    public final ML0 a;

    @NotNull
    public final ConcurrentHashMap<Class<?>, C4555ix<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public TH(@NotNull Function1<? super RI0<?>, ? extends RJ0<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = (ML0) compute;
        this.b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.InterfaceC3124cI1
    @Nullable
    public final RJ0<T> a(@NotNull RI0<Object> key) {
        C4555ix<T> c4555ixPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, C4555ix<T>> concurrentHashMap = this.b;
        Class<?> clsG = C7279vr.g(key);
        C4555ix<T> c4555ix = concurrentHashMap.get(clsG);
        if (c4555ix == null && (c4555ixPutIfAbsent = concurrentHashMap.putIfAbsent(clsG, (c4555ix = new C4555ix<>((RJ0) this.a.invoke(key))))) != null) {
            c4555ix = c4555ixPutIfAbsent;
        }
        return c4555ix.a;
    }
}
