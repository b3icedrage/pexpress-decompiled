package defpackage;

import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YY0<K, V> {

    @NotNull
    public final ConcurrentHashMap<K, W11<V>> a = new ConcurrentHashMap<>();

    @NotNull
    public final W11 a(String str, @Nullable AbstractC4688jY0 abstractC4688jY0) {
        ConcurrentHashMap<K, W11<V>> concurrentHashMap = this.a;
        W11<V> w11 = concurrentHashMap.get(str);
        if (w11 == null) {
            w11 = new W11<>();
            if (Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                w11.k(abstractC4688jY0);
            } else {
                w11.i(abstractC4688jY0);
            }
            concurrentHashMap.put(str, w11);
        }
        return w11;
    }

    public final void b(K k, @Nullable V v) {
        ConcurrentHashMap<K, W11<V>> concurrentHashMap = this.a;
        W11<V> w11 = concurrentHashMap.get(k);
        if (w11 == null) {
            w11 = new W11<>();
            concurrentHashMap.put(k, w11);
        }
        if (Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            w11.k(v);
        } else {
            w11.i(v);
        }
    }
}
