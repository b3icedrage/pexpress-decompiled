package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2895bC extends C1640Nu {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicIntegerFieldUpdater j;

    @NotNull
    public static final a k;

    @NotNull
    public static final C2895bC l;

    @Nullable
    public final O71<C2895bC> g;

    @Nullable
    public C2895bC h;

    @NotNull
    private volatile /* synthetic */ Object nextRef;

    @NotNull
    private volatile /* synthetic */ int refCount;

    static {
        a aVar = new a();
        k = aVar;
        l = new C2895bC(WY0.a, null, aVar);
        i = AtomicReferenceFieldUpdater.newUpdater(C2895bC.class, Object.class, "nextRef");
        j = AtomicIntegerFieldUpdater.newUpdater(C2895bC.class, "refCount");
    }

    public C2895bC() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895bC(ByteBuffer memory, C2895bC c2895bC, O71 o71) {
        super(memory);
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.g = o71;
        if (c2895bC == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.h = c2895bC;
    }

    @Nullable
    public final C2895bC f() {
        return (C2895bC) i.getAndSet(this, null);
    }

    @Nullable
    public final C2895bC g() {
        return (C2895bC) this.nextRef;
    }

    public final int h() {
        return this.refCount;
    }

    public final void i(@NotNull O71<C2895bC> pool) {
        int i2;
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Intrinsics.checkNotNullParameter(pool, "pool");
        do {
            i2 = this.refCount;
            if (i2 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i3 = i2 - 1;
            atomicIntegerFieldUpdater = j;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
        if (i3 == 0) {
            C2895bC c2895bC = this.h;
            if (c2895bC == null) {
                O71<C2895bC> o71 = this.g;
                if (o71 != null) {
                    pool = o71;
                }
                pool.g1(this);
                return;
            }
            if (!atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            f();
            this.h = null;
            c2895bC.i(pool);
        }
    }

    public final void j() {
        if (this.h != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        d(0);
        int i2 = this.f;
        int i3 = this.d;
        this.b = i3;
        this.c = i3;
        this.e = i2 - i3;
        this.nextRef = null;
    }

    public final void k(@Nullable C2895bC c2895bC) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (c2895bC == null) {
            f();
            return;
        }
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c2895bC)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void l() {
        int i2;
        do {
            i2 = this.refCount;
            if (i2 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i2 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!j.compareAndSet(this, i2, 1));
    }

    /* JADX INFO: renamed from: bC$a */
    public static final class a implements O71<C2895bC> {
        @Override // defpackage.O71
        public final C2895bC S() {
            return C2895bC.l;
        }

        @Override // defpackage.O71
        public final void g1(C2895bC c2895bC) {
            C2895bC instance = c2895bC;
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (instance != C2895bC.l) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
