package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class LO1<E> extends AtomicReferenceArray<E> implements InterfaceC4653jM1<E> {
    public static final Integer j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int d;
    public final AtomicLong e;
    public long g;
    public final AtomicLong h;
    public final int i;

    public LO1(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.d = length() - 1;
        this.e = new AtomicLong();
        this.h = new AtomicLong();
        this.i = Math.min(i / 4, j.intValue());
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
        return this.e.get() == this.h.get();
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.e;
        long j2 = atomicLong.get();
        int i = this.d;
        int i2 = ((int) j2) & i;
        if (j2 >= this.g) {
            long j3 = ((long) this.i) + j2;
            if (get(i & ((int) j3)) == null) {
                this.g = j3;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        atomicLong.lazySet(j2 + 1);
        return true;
    }

    @Override // defpackage.InterfaceC4863kM1
    public final E poll() {
        AtomicLong atomicLong = this.h;
        long j2 = atomicLong.get();
        int i = ((int) j2) & this.d;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j2 + 1);
        lazySet(i, null);
        return e;
    }
}
