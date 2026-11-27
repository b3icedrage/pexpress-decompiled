package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class MO1<T> implements InterfaceC4653jM1<T> {
    public static final int m = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object n = new Object();
    public final AtomicLong d;
    public final int e;
    public long g;
    public final int h;
    public AtomicReferenceArray<Object> i;
    public final int j;
    public AtomicReferenceArray<Object> k;
    public final AtomicLong l;

    public MO1(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.d = atomicLong;
        this.l = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.i = atomicReferenceArray;
        this.h = i2;
        this.e = Math.min(iNumberOfLeadingZeros / 4, m);
        this.k = atomicReferenceArray;
        this.j = i2;
        this.g = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // defpackage.InterfaceC4863kM1
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean isEmpty() {
        return this.d.get() == this.l.get();
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.i;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        int i = this.h;
        int i2 = ((int) j) & i;
        if (j < this.g) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.e) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.g = j2 - 1;
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.i = atomicReferenceArray2;
        this.g = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, n);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // defpackage.InterfaceC4863kM1
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.k;
        AtomicLong atomicLong = this.l;
        long j = atomicLong.get();
        int i = this.j;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == n;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.k = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return t2;
    }
}
