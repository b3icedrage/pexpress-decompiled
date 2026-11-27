package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5945pW0<V> extends L0<V> {

    @NotNull
    public final C5315mW0<?, V> d;

    public C5945pW0(@NotNull C5315mW0<?, V> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends V> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.L0
    public final int b() {
        return this.d.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        C5315mW0<?, V> map = this.d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new C5315mW0.f(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C5315mW0<?, V> c5315mW0 = this.d;
        c5315mW0.d();
        int iJ = c5315mW0.j(obj);
        if (iJ < 0) {
            return false;
        }
        c5315mW0.m(iJ);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.d();
        return super.retainAll(elements);
    }
}
