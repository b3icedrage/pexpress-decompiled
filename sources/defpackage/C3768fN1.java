package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3768fN1<T> extends N0<T> {
    public static final /* synthetic */ int g = 0;

    @Nullable
    public Object d;
    public int e;

    /* JADX INFO: renamed from: fN1$a */
    public static final class a<T> implements Iterator<T>, InterfaceC6745tJ0 {

        @NotNull
        public final C6411rj d;

        public a(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.d = C6621sj.l(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: fN1$b */
    public static final class b<T> implements Iterator<T>, InterfaceC6745tJ0 {
        public final T d;
        public boolean e = true;

        public b(T t) {
            this.d = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.e) {
                throw new NoSuchElementException();
            }
            this.e = false;
            return this.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        Object obj;
        int i = this.e;
        if (i == 0) {
            this.d = t;
        } else if (i == 1) {
            if (Intrinsics.a(this.d, t)) {
                return false;
            }
            this.d = new Object[]{this.d, t};
        } else if (i < 5) {
            Object obj2 = this.d;
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (C1526Mj.m(objArr, t)) {
                return false;
            }
            int i2 = this.e;
            if (i2 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullParameter(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(OW0.a(elements.length));
                C1526Mj.D(elements, linkedHashSet);
                linkedHashSet.add(t);
                obj = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i2 + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.d = obj;
        } else {
            Object obj3 = this.d;
            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!F62.d(obj3).add(t)) {
                return false;
            }
        }
        this.e++;
        return true;
    }

    @Override // defpackage.N0
    public final int b() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d = null;
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (b() == 0) {
            return false;
        }
        if (b() == 1) {
            return Intrinsics.a(this.d, obj);
        }
        if (b() < 5) {
            Object obj2 = this.d;
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C1526Mj.m((Object[]) obj2, obj);
        }
        Object obj3 = this.d;
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<T> iterator() {
        int i = this.e;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new b(this.d);
        }
        if (i < 5) {
            Object obj = this.d;
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.d;
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return F62.d(obj2).iterator();
    }
}
