package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GV<T> implements O71<T> {

    @NotNull
    public static final AtomicLongFieldUpdater<GV<?>> i;
    public final int d;
    public final int e;

    @NotNull
    public final AtomicReferenceArray<T> g;

    @NotNull
    public final int[] h;
    private volatile long top;

    public /* synthetic */ class a extends C3068c21 {
        public static final a l = new a(GV.class, "top", "getTop()J");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return Long.valueOf(((GV) obj).top);
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((GV) obj).top = ((Number) obj2).longValue();
        }
    }

    static {
        AtomicLongFieldUpdater<GV<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(GV.class, a.l.getName());
        Intrinsics.checkNotNullExpressionValue(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        i = atomicLongFieldUpdaterNewUpdater;
    }

    public GV(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(EK.e(i2, "capacity should be positive but it is ").toString());
        }
        if (i2 > 536870911) {
            throw new IllegalArgumentException(EK.e(i2, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i2 * 4) - 1) * 2;
        this.d = iHighestOneBit;
        this.e = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i3 = iHighestOneBit + 1;
        this.g = new AtomicReferenceArray<>(i3);
        this.h = new int[i3];
    }

    @Override // defpackage.O71
    @NotNull
    public final T S() {
        T tG;
        T tP = p();
        return (tP == null || (tG = g(tP)) == null) ? l() : tG;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            T tP = p();
            if (tP == null) {
                return;
            } else {
                k(tP);
            }
        }
    }

    @NotNull
    public T g(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    @Override // defpackage.O71
    public final void g1(@NotNull T instance) {
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        q(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.e) + 1;
        for (int i2 = 0; i2 < 8; i2++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.g;
            do {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                    if (iIdentityHashCode <= 0) {
                        throw new IllegalArgumentException("index should be positive");
                    }
                    do {
                        j = this.top;
                        j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.h[iIdentityHashCode] = (int) (4294967295L & j);
                    } while (!i.compareAndSet(this, j, j2));
                    return;
                }
            } while (atomicReferenceArray.get(iIdentityHashCode) == null);
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.d;
            }
        }
        k(instance);
    }

    public void k(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @NotNull
    public abstract T l();

    public final T p() {
        long j;
        int i2;
        GV<T> gv;
        long j2;
        do {
            j = this.top;
            if (j != 0) {
                j2 = ((j >> 32) & 4294967295L) + 1;
                i2 = (int) (4294967295L & j);
                if (i2 != 0) {
                    gv = this;
                }
            }
            i2 = 0;
            gv = this;
            break;
        } while (!i.compareAndSet(gv, j, (j2 << 32) | ((long) this.h[i2])));
        if (i2 == 0) {
            return null;
        }
        return gv.g.getAndSet(i2, null);
    }

    public void q(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }
}
