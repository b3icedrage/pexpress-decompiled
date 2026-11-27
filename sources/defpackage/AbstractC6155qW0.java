package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: qW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6155qW0<K, V> {
    public AbstractC6155qW0<K, V>.b a;
    public AbstractC6155qW0<K, V>.c b;
    public AbstractC6155qW0<K, V>.e c;

    /* JADX INFO: renamed from: qW0$a */
    public final class a<T> implements Iterator<T> {
        public final int d;
        public int e;
        public int g;
        public boolean h = false;

        public a(int i) {
            this.d = i;
            this.e = AbstractC6155qW0.this.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g < this.e;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC6155qW0.this.b(this.g, this.d);
            this.g++;
            this.h = true;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.h) {
                throw new IllegalStateException();
            }
            int i = this.g - 1;
            this.g = i;
            this.e--;
            this.h = false;
            AbstractC6155qW0.this.h(i);
        }
    }

    /* JADX INFO: renamed from: qW0$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iD = abstractC6155qW0.d();
            for (Map.Entry<K, V> entry : collection) {
                abstractC6155qW0.g(entry.getKey(), entry.getValue());
            }
            return iD != abstractC6155qW0.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC6155qW0.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
                int iE = abstractC6155qW0.e(key);
                if (iE >= 0) {
                    Object objB = abstractC6155qW0.b(iE, 1);
                    Object value = entry.getValue();
                    return objB == value || (objB != null && objB.equals(value));
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC6155qW0.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iHashCode = 0;
            for (int iD = abstractC6155qW0.d() - 1; iD >= 0; iD--) {
                Object objB = abstractC6155qW0.b(iD, 0);
                Object objB2 = abstractC6155qW0.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC6155qW0.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC6155qW0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: qW0$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC6155qW0.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC6155qW0.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapC = AbstractC6155qW0.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapC.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC6155qW0.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iHashCode = 0;
            for (int iD = abstractC6155qW0.d() - 1; iD >= 0; iD--) {
                Object objB = abstractC6155qW0.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC6155qW0.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iE = abstractC6155qW0.e(obj);
            if (iE < 0) {
                return false;
            }
            abstractC6155qW0.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapC = AbstractC6155qW0.this.c();
            int size = mapC.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapC.remove(it.next());
            }
            return size != mapC.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return AbstractC6155qW0.k(AbstractC6155qW0.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC6155qW0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC6155qW0.this.l(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iD = abstractC6155qW0.d();
            Object[] objArr = new Object[iD];
            for (int i = 0; i < iD; i++) {
                objArr[i] = abstractC6155qW0.b(i, 0);
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: qW0$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int d;
        public boolean g = false;
        public int e = -1;

        public d() {
            this.d = AbstractC6155qW0.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.e;
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            Object objB = abstractC6155qW0.b(i, 0);
            if (key != objB && (key == null || !key.equals(objB))) {
                return false;
            }
            Object value = entry.getValue();
            Object objB2 = abstractC6155qW0.b(this.e, 1);
            return value == objB2 || (value != null && value.equals(objB2));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractC6155qW0.this.b(this.e, 0);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC6155qW0.this.b(this.e, 1);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.e;
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            Object objB = abstractC6155qW0.b(i, 0);
            Object objB2 = abstractC6155qW0.b(this.e, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.e++;
            this.g = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.g) {
                throw new IllegalStateException();
            }
            AbstractC6155qW0.this.h(this.e);
            this.e--;
            this.d--;
            this.g = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.g) {
                return (V) AbstractC6155qW0.this.i(this.e, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public final <T> T[] l(T[] tArr, int i) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i2 = 0; i2 < iD; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: qW0$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            AbstractC6155qW0.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC6155qW0.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return AbstractC6155qW0.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iF = abstractC6155qW0.f(obj);
            if (iF < 0) {
                return false;
            }
            abstractC6155qW0.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iD = abstractC6155qW0.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (collection.contains(abstractC6155qW0.b(i, 1))) {
                    abstractC6155qW0.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iD = abstractC6155qW0.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (!collection.contains(abstractC6155qW0.b(i, 1))) {
                    abstractC6155qW0.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return AbstractC6155qW0.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            AbstractC6155qW0 abstractC6155qW0 = AbstractC6155qW0.this;
            int iD = abstractC6155qW0.d();
            Object[] objArr = new Object[iD];
            for (int i = 0; i < iD; i++) {
                objArr[i] = abstractC6155qW0.b(i, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC6155qW0.this.l(tArr, 1);
        }
    }
}
