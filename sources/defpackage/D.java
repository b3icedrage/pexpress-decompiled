package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D<K, V> implements Iterable<V>, InterfaceC6745tJ0 {

    public static abstract class a<K, V, T extends V> {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    @NotNull
    public abstract AbstractC7882yj<V> b();

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
