package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3558eN1<E> extends AbstractList<E> implements RandomAccess {
    public int d;
    public Object e;

    /* JADX INFO: renamed from: eN1$a */
    public static class a<T> implements Iterator<T> {
        public static final a d = new a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: eN1$b */
    public class b extends c<E> {
        public final int e;

        public b() {
            this.e = ((AbstractList) C3558eN1.this).modCount;
        }

        @Override // defpackage.C3558eN1.c
        public final void a() {
            C3558eN1 c3558eN1 = C3558eN1.this;
            int i = ((AbstractList) c3558eN1).modCount;
            int i2 = this.e;
            if (i == i2) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c3558eN1).modCount + "; expected: " + i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            C3558eN1.this.clear();
        }
    }

    /* JADX INFO: renamed from: eN1$c */
    public static abstract class c<T> implements Iterator<T> {
        public boolean d;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.d;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.d) {
                throw new NoSuchElementException();
            }
            this.d = true;
            a();
            return (T) C3558eN1.this.e;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = R51.PUSH_ADDITIONAL_DATA_KEY;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        int i = this.d;
        if (i == 0) {
            this.e = e;
        } else if (i == 1) {
            this.e = new Object[]{this.e, e};
        } else {
            Object[] objArr = (Object[]) this.e;
            int length = objArr.length;
            if (i >= length) {
                int iA = C5807oq.a(length, 3, 2, 1);
                int i2 = i + 1;
                if (iA < i2) {
                    iA = i2;
                }
                Object[] objArr2 = new Object[iA];
                this.e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.d] = e;
        }
        this.d++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.e = null;
        this.d = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.d)) {
            return i2 == 1 ? (E) this.e : (E) ((Object[]) this.e)[i];
        }
        StringBuilder sbC = C1332Jw.c(i, "Index: ", ", Size: ");
        sbC.append(this.d);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        int i = this.d;
        if (i == 0) {
            return a.d;
        }
        if (i == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.d)) {
            StringBuilder sbC = C1332Jw.c(i, "Index: ", ", Size: ");
            sbC.append(this.d);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i2 == 1) {
            e = (E) this.e;
            this.e = null;
        } else {
            Object[] objArr = (Object[]) this.e;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.e = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.d - 1] = null;
            }
            e = (E) obj;
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            StringBuilder sbC = C1332Jw.c(i, "Index: ", ", Size: ");
            sbC.append(this.d);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i2 == 1) {
            E e2 = (E) this.e;
            this.e = e;
            return e2;
        }
        Object[] objArr = (Object[]) this.e;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i = this.d;
        if (i >= 2) {
            Arrays.sort((Object[]) this.e, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i = this.d;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.e;
                return tArr2;
            }
            tArr[0] = this.e;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.e, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.e, 0, tArr, 0, i);
            }
        }
        int i2 = this.d;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.d)) {
            if (i2 == 0) {
                this.e = e;
            } else if (i2 == 1 && i == 0) {
                this.e = new Object[]{e, this.e};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.e;
                } else {
                    Object[] objArr2 = (Object[]) this.e;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.d - i);
                }
                objArr[i] = e;
                this.e = objArr;
            }
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbC = C1332Jw.c(i, "Index: ", ", Size: ");
        sbC.append(this.d);
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}
