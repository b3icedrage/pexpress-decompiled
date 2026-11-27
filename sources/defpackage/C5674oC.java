package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5674oC<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    @NotNull
    public final transient E[] d;
    public transient int e = 0;
    public transient int g = 0;
    public transient boolean h = false;
    public final int i;

    /* JADX INFO: renamed from: oC$a */
    public class a implements Iterator<E> {
        public int d;
        public int e = -1;
        public boolean g;

        public a() {
            this.d = C5674oC.this.e;
            this.g = C5674oC.this.h;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g || this.d != C5674oC.this.g;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.g = false;
            int i = this.d;
            this.e = i;
            C5674oC c5674oC = C5674oC.this;
            int i2 = i + 1;
            this.d = i2 < c5674oC.i ? i2 : 0;
            return c5674oC.d[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i;
            int i2 = this.e;
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            C5674oC c5674oC = C5674oC.this;
            int i3 = c5674oC.e;
            if (i2 == i3) {
                c5674oC.remove();
                this.e = -1;
                return;
            }
            int i4 = i2 + 1;
            int i5 = c5674oC.i;
            if (i3 >= i2 || i4 >= (i = c5674oC.g)) {
                while (i4 != c5674oC.g) {
                    if (i4 >= i5) {
                        E[] eArr = c5674oC.d;
                        eArr[i4 - 1] = eArr[0];
                    } else {
                        E[] eArr2 = c5674oC.d;
                        int i6 = i4 - 1;
                        if (i6 < 0) {
                            i6 = i5 - 1;
                        }
                        eArr2[i6] = eArr2[i4];
                        i4++;
                        if (i4 >= i5) {
                        }
                    }
                    i4 = 0;
                }
            } else {
                E[] eArr3 = c5674oC.d;
                System.arraycopy(eArr3, i4, eArr3, i2, i - i4);
            }
            this.e = -1;
            int i7 = c5674oC.g - 1;
            if (i7 < 0) {
                i7 = i5 - 1;
            }
            c5674oC.g = i7;
            c5674oC.d[i7] = null;
            c5674oC.h = false;
            int i8 = this.d - 1;
            if (i8 < 0) {
                i8 = i5 - 1;
            }
            this.d = i8;
        }
    }

    public C5674oC(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i];
        this.d = eArr;
        this.i = eArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(@NotNull E e) {
        if (e == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.i;
        if (size == i) {
            remove();
        }
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        this.d[i2] = e;
        if (i3 >= i) {
            this.g = 0;
        }
        if (this.g == this.e) {
            this.h = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.h = false;
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.d, (Object) null);
    }

    @Override // java.util.Queue
    @Nullable
    public final E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public final boolean offer(@NotNull E e) {
        add(e);
        return true;
    }

    @Override // java.util.Queue
    @Nullable
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.e];
    }

    @Override // java.util.Queue
    @Nullable
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    @NotNull
    public final E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i = this.e;
        E[] eArr = this.d;
        E e = eArr[i];
        if (e != null) {
            int i2 = i + 1;
            this.e = i2;
            eArr[i] = null;
            if (i2 >= this.i) {
                this.e = 0;
            }
            this.h = false;
        }
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.g;
        int i2 = this.e;
        int i3 = this.i;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.h) {
            return i3;
        }
        return 0;
    }
}
