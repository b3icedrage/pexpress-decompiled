package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LL0<K, V> extends LinkedHashMap<K, V> {

    @NotNull
    public final C7341w81.c d;

    @NotNull
    public final C7341w81.d e;
    public final int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LL0(@NotNull C7341w81.c supplier, @NotNull C7341w81.d close, int i) {
        super(10, 0.75f, true);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        this.d = supplier;
        this.e = close;
        this.g = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (this.g == 0) {
            return (V) this.d.invoke(obj);
        }
        synchronized (this) {
            V v = (V) super.get(obj);
            if (v != null) {
                return v;
            }
            V v2 = (V) this.d.invoke(obj);
            put(obj, v2);
            return v2;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(@NotNull Map.Entry<? extends K, ? extends V> eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        boolean z = super.size() > this.g;
        if (z) {
            this.e.invoke(eldest.getValue());
        }
        return z;
    }
}
