package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"LdJ1;", "E", "", "LN0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "e", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C3337dJ1<E> extends N0<E> implements Set<E>, Serializable {

    @NotNull
    private static final a e = new a(null);

    @NotNull
    public static final C3337dJ1 g;

    @NotNull
    public final C5315mW0<E, ?> d;

    /* JADX INFO: renamed from: dJ1$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C5315mW0.INSTANCE.getClass();
        g = new C3337dJ1(C5315mW0.s);
    }

    public C3337dJ1(@NotNull C5315mW0<E, ?> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        return this.d.b(e2) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.d();
        return super.addAll(elements);
    }

    @Override // defpackage.N0
    public final int b() {
        return this.d.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<E> iterator() {
        C5315mW0<E, ?> map = this.d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new C5315mW0.e(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5315mW0<E, ?> c5315mW0 = this.d;
        c5315mW0.d();
        int i = c5315mW0.i(obj);
        if (i < 0) {
            return false;
        }
        c5315mW0.m(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.d();
        return super.retainAll(elements);
    }

    public C3337dJ1() {
        this(new C5315mW0());
    }
}
