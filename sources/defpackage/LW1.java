package defpackage;

import io.sentry.util.C4527a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class LW1<E> implements Queue<E>, Collection<Object>, Serializable {
    public final Queue d;
    public final C4527a e = new C4527a();

    public LW1(C5674oC c5674oC) {
        this.d = c5674oC;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zAdd = this.d.add(obj);
            c0404aA.close();
            return zAdd;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zAddAll = this.d.addAll(collection);
            c0404aA.close();
            return zAddAll;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            this.d.clear();
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zContains = this.d.contains(obj);
            c0404aA.close();
            return zContains;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zContainsAll = this.d.containsAll(collection);
            c0404aA.close();
            return zContainsAll;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final E element() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            E e = (E) this.d.element();
            c0404aA.close();
            return e;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zEquals = this.d.equals(obj);
            c0404aA.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            int iHashCode = this.d.hashCode();
            c0404aA.close();
            return iHashCode;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zIsEmpty = this.d.isEmpty();
            c0404aA.close();
            return zIsEmpty;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.d.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zOffer = this.d.offer(e);
            c0404aA.close();
            return zOffer;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            E e = (E) this.d.peek();
            c0404aA.close();
            return e;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final E poll() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            E e = (E) this.d.poll();
            c0404aA.close();
            return e;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final E remove() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            E e = (E) this.d.remove();
            c0404aA.close();
            return e;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zRemoveAll = this.d.removeAll(collection);
            c0404aA.close();
            return zRemoveAll;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zRetainAll = this.d.retainAll(collection);
            c0404aA.close();
            return zRetainAll;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            int size = this.d.size();
            c0404aA.close();
            return size;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            Object[] array = this.d.toArray();
            c0404aA.close();
            return array;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            String string = this.d.toString();
            c0404aA.close();
            return string;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            boolean zRemove = this.d.remove(obj);
            c0404aA.close();
            return zRemove;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C4527a.C0404a c0404aA = this.e.a();
        try {
            T[] tArr2 = (T[]) this.d.toArray(tArr);
            c0404aA.close();
            return tArr2;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
