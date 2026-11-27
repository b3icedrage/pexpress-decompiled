package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b'\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lp0;", "E", "LY;", "", "<init>", "()V", "d", "b", "c", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractC5838p0<E> extends Y<E> implements List<E> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i > i2) {
                    throw new IllegalArgumentException(C4564j.c(i, i2, "startIndex: ", " > endIndex: "));
                }
                return;
            }
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
        }

        public static void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C4564j.c(i, i2, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(C4564j.c(i, i2, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i2, int i3) {
            if (i >= 0 && i2 <= i3) {
                if (i > i2) {
                    throw new IllegalArgumentException(C4564j.c(i, i2, "fromIndex: ", " > toIndex: "));
                }
                return;
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }

        public static int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    /* JADX INFO: renamed from: p0$b */
    public class b implements Iterator<E>, InterfaceC6745tJ0 {
        public int d;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < AbstractC5838p0.this.b();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.d;
            this.d = i + 1;
            return AbstractC5838p0.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: p0$c */
    public class c extends AbstractC5838p0<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            Companion companion = AbstractC5838p0.INSTANCE;
            int iB = AbstractC5838p0.this.b();
            companion.getClass();
            Companion.c(i, iB);
            this.d = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.d - 1;
            this.d = i;
            return AbstractC5838p0.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: p0$d */
    public static final class d<E> extends AbstractC5838p0<E> implements RandomAccess {

        @NotNull
        public final AbstractC5838p0<E> e;
        public final int g;
        public final int h;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull AbstractC5838p0<? extends E> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.e = list;
            this.g = i;
            Companion companion = AbstractC5838p0.INSTANCE;
            int iB = list.b();
            companion.getClass();
            Companion.d(i, i2, iB);
            this.h = i2 - i;
        }

        @Override // defpackage.Y
        public final int b() {
            return this.h;
        }

        @Override // java.util.List
        public final E get(int i) {
            Companion companion = AbstractC5838p0.INSTANCE;
            int i2 = this.h;
            companion.getClass();
            Companion.b(i, i2);
            return this.e.get(this.g + i);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.a(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
