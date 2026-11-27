package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class XY1 implements InterfaceC7284vs1, InterfaceC4762js1 {
    public final Object a;
    public final Object b;
    public volatile DM1 c;
    public volatile InterfaceC4762js1 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public XY1(Object obj, InterfaceC7284vs1 interfaceC7284vs1) {
        this.b = obj;
        this.a = interfaceC7284vs1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final InterfaceC7284vs1 a() {
        InterfaceC7284vs1 interfaceC7284vs1A;
        synchronized (this.b) {
            try {
                ?? r1 = this.a;
                interfaceC7284vs1A = r1 != 0 ? r1.a() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC7284vs1A;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void b() {
        synchronized (this.b) {
            try {
                if (!C4790k10.c(this.f)) {
                    this.f = 2;
                    this.d.b();
                }
                if (!C4790k10.c(this.e)) {
                    this.e = 2;
                    this.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7284vs1, defpackage.InterfaceC4762js1
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.c() || this.c.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean d(InterfaceC4762js1 interfaceC4762js1) {
        if (!(interfaceC4762js1 instanceof XY1)) {
            return false;
        }
        XY1 xy1 = (XY1) interfaceC4762js1;
        if (this.c == null) {
            if (xy1.c != null) {
                return false;
            }
        } else if (!this.c.d(xy1.c)) {
            return false;
        }
        if (this.d == null) {
            return xy1.d == null;
        }
        return this.d.d(xy1.d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final void e(InterfaceC4762js1 interfaceC4762js1) {
        synchronized (this.b) {
            try {
                if (!interfaceC4762js1.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                ?? r3 = this.a;
                if (r3 != 0) {
                    r3.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final void f(InterfaceC4762js1 interfaceC4762js1) {
        synchronized (this.b) {
            try {
                if (interfaceC4762js1.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                ?? r3 = this.a;
                if (r3 != 0) {
                    r3.f(this);
                }
                if (!C4790k10.c(this.f)) {
                    this.d.clear();
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
        synchronized (this.b) {
            try {
                ?? r1 = this.a;
                z = (r1 == 0 || r1.g(this)) && interfaceC4762js1.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final boolean h(InterfaceC4762js1 interfaceC4762js1) {
        boolean z;
        synchronized (this.b) {
            try {
                ?? r1 = this.a;
                z = (r1 == 0 || r1.h(this)) && interfaceC4762js1.equals(this.c) && !c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC7284vs1
    public final boolean i(InterfaceC4762js1 interfaceC4762js1) {
        boolean z;
        synchronized (this.b) {
            try {
                ?? r1 = this.a;
                z = (r1 == 0 || r1.i(this)) && (interfaceC4762js1.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.k();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }
}
