package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4202hS0<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C4202hS0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C4202hS0.class, "_state$volatile");

    @NotNull
    public static final GW1 g = new GW1("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    /* JADX INFO: renamed from: hS0$a */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public C4202hS0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@NotNull Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (!this.b && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                C4202hS0<E> c4202hS0C = this;
                while ((atomicLongFieldUpdater.get(c4202hS0C) & 1152921504606846976L) != 0) {
                    c4202hS0C = c4202hS0C.c();
                    AtomicReferenceArray atomicReferenceArray2 = c4202hS0C.d;
                    int i5 = c4202hS0C.c & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof a) && ((a) obj).a == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        c4202hS0C = null;
                    }
                    if (c4202hS0C == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C4202hS0<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C4202hS0<E> c4202hS0;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c4202hS0 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c4202hS0 = this;
            if (atomicLongFieldUpdater.compareAndSet(c4202hS0, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C4202hS0<E> c4202hS1 = (C4202hS0) atomicReferenceFieldUpdater.get(this);
            if (c4202hS1 != null) {
                return c4202hS1;
            }
            C4202hS0 c4202hS2 = new C4202hS0(c4202hS0.a * 2, c4202hS0.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c4202hS0.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object aVar = c4202hS0.d.get(i4);
                if (aVar == null) {
                    aVar = new a(i);
                }
                c4202hS2.d.set(c4202hS2.c & i, aVar);
                i++;
            }
            atomicLongFieldUpdater.set(c4202hS2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c4202hS2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    @Nullable
    public final Object d() {
        C4202hS0<E> c4202hS0C = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(c4202hS0C);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = c4202hS0C.c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = c4202hS0C.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = c4202hS0C.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof a)) {
                    long j2 = (i + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(c4202hS0C, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    c4202hS0C = this;
                    if (z) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                            long j3 = atomicLongFieldUpdater2.get(c4202hS0C);
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c4202hS0C = c4202hS0C.c();
                            } else {
                                C4202hS0<E> c4202hS0 = c4202hS0C;
                                c4202hS0C = c4202hS0;
                                if (atomicLongFieldUpdater2.compareAndSet(c4202hS0, j3, (j3 & (-1073741824)) | j2)) {
                                    c4202hS0C.d.set(c4202hS0C.c & i5, null);
                                    c4202hS0C = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c4202hS0C == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
