package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: su1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6660su1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C6660su1.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C6660su1.class, "_availableForWrite$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C6660su1.class, "_pendingToFlush");

    @NotNull
    public volatile /* synthetic */ int _availableForWrite$internal;
    public final int a;

    @NotNull
    public volatile /* synthetic */ int _availableForRead$internal = 0;

    @NotNull
    volatile /* synthetic */ int _pendingToFlush = 0;

    public C6660su1(int i) {
        this.a = i;
        this._availableForWrite$internal = i;
    }

    public final void a(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.a) {
                throw new IllegalArgumentException("Completed read overflow: " + i2 + " + " + i + " = " + i3 + " > " + this.a);
            }
        } while (!c.compareAndSet(this, i2, i3));
    }

    public final boolean b() {
        int andSet = d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return b.addAndGet(this, andSet) > 0;
    }

    public final boolean c() {
        return this._availableForWrite$internal == 0;
    }

    public final void d() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.a;
    }

    public final boolean e() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.a) {
                return false;
            }
        } while (!c.compareAndSet(this, i, 0));
        return true;
    }

    public final int f(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForRead$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!b.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    public final int g(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForWrite$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!c.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    @NotNull
    public final String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.a + ']';
    }
}
