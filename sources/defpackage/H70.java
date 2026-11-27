package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class H70 implements InterfaceC7284vs1, InterfaceC4762js1 {
    public final Object a;
    public final Object b;
    public volatile InterfaceC4762js1 c;
    public volatile InterfaceC4762js1 d;
    public int e = 3;
    public int f = 3;

    public H70(Object obj, InterfaceC7284vs1 interfaceC7284vs1) {
        this.a = obj;
        this.b = interfaceC7284vs1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final InterfaceC7284vs1 a() {
        InterfaceC7284vs1 interfaceC7284vs1A;
        synchronized (this.a) {
            try {
                ?? r1 = this.b;
                interfaceC7284vs1A = r1 != 0 ? r1.a() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC7284vs1A;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void b() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.b();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7284vs1, defpackage.InterfaceC4762js1
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.c() || this.d.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean d(InterfaceC4762js1 interfaceC4762js1) {
        if (interfaceC4762js1 instanceof H70) {
            H70 h70 = (H70) interfaceC4762js1;
            if (this.c.d(h70.c) && this.d.d(h70.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final void e(InterfaceC4762js1 interfaceC4762js1) {
        synchronized (this.a) {
            try {
                if (interfaceC4762js1.equals(this.d)) {
                    this.f = 5;
                    ?? r3 = this.b;
                    if (r3 != 0) {
                        r3.e(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final void f(InterfaceC4762js1 interfaceC4762js1) {
        synchronized (this.a) {
            try {
                if (interfaceC4762js1.equals(this.c)) {
                    this.e = 4;
                } else if (interfaceC4762js1.equals(this.d)) {
                    this.f = 4;
                }
                ?? r4 = this.b;
                if (r4 != 0) {
                    r4.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final boolean g(InterfaceC4762js1 interfaceC4762js1) {
        boolean z;
        synchronized (this.a) {
            ?? r1 = this.b;
            z = (r1 == 0 || r1.g(this)) && interfaceC4762js1.equals(this.c);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final boolean h(InterfaceC4762js1 interfaceC4762js1) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            ?? r1 = this.b;
            z = false;
            if (r1 == 0 || r1.h(this)) {
                if (this.e != 5) {
                    zEquals = interfaceC4762js1.equals(this.c);
                } else {
                    zEquals = interfaceC4762js1.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final boolean i(InterfaceC4762js1 interfaceC4762js1) {
        boolean z;
        synchronized (this.a) {
            ?? r0 = this.b;
            z = r0 == 0 || r0.i(this);
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void k() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
