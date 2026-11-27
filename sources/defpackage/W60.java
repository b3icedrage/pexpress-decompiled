package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class W60<Z> implements InterfaceC3667et1<Z> {
    public final boolean d;
    public final boolean e;
    public final InterfaceC3667et1<Z> g;
    public final Q60 h;
    public final V60 i;
    public int j;
    public boolean k;

    public W60(InterfaceC3667et1 interfaceC3667et1, boolean z, boolean z2, V60 v60, Q60 q60) {
        UE.e(interfaceC3667et1, "Argument must not be null");
        this.g = interfaceC3667et1;
        this.d = z;
        this.e = z2;
        this.i = v60;
        UE.e(q60, "Argument must not be null");
        this.h = q60;
    }

    public final synchronized void a() {
        if (this.k) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.j++;
    }

    @Override // defpackage.InterfaceC3667et1
    public final synchronized void b() {
        if (this.j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.k) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.k = true;
        if (this.e) {
            this.g.b();
        }
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return this.g.c();
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<Z> d() {
        return this.g.d();
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i = this.j;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.j = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.h.d(this.i, this);
        }
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Z get() {
        return this.g.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.d + ", listener=" + this.h + ", key=" + this.i + ", acquired=" + this.j + ", isRecycled=" + this.k + ", resource=" + this.g + '}';
    }
}
