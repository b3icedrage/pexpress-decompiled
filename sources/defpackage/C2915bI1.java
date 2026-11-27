package defpackage;

/* JADX INFO: renamed from: bI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2915bI1<T> extends AbstractC1363Kg0<T> {
    public final C2158Uk1 e;
    public boolean g;
    public C7247vi h;
    public volatile boolean i;

    public C2915bI1(C2158Uk1 c2158Uk1) {
        this.e = c2158Uk1;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable th) {
        if (this.i) {
            EB1.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.i) {
                    this.i = true;
                    if (this.g) {
                        C7247vi c7247vi = this.h;
                        if (c7247vi == null) {
                            c7247vi = new C7247vi();
                            this.h = c7247vi;
                        }
                        ((Object[]) c7247vi.b)[0] = new EnumC7754y61.a(th);
                        return;
                    }
                    this.g = true;
                    z = false;
                }
                if (z) {
                    EB1.b(th);
                } else {
                    this.e.a(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(T t) {
        if (this.i) {
            return;
        }
        synchronized (this) {
            try {
                if (this.i) {
                    return;
                }
                if (!this.g) {
                    this.g = true;
                    this.e.d(t);
                    i();
                } else {
                    C7247vi c7247vi = this.h;
                    if (c7247vi == null) {
                        c7247vi = new C7247vi();
                        this.h = c7247vi;
                    }
                    c7247vi.a(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        boolean z = true;
        if (!this.i) {
            synchronized (this) {
                try {
                    if (!this.i) {
                        if (this.g) {
                            C7247vi c7247vi = this.h;
                            if (c7247vi == null) {
                                c7247vi = new C7247vi();
                                this.h = c7247vi;
                            }
                            c7247vi.a(new EnumC7754y61.b(interfaceC6779tU1));
                            return;
                        }
                        this.g = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            interfaceC6779tU1.cancel();
        } else {
            this.e.f(interfaceC6779tU1);
            i();
        }
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        this.e.b(interfaceC1518Mg0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        C7247vi c7247vi;
        Object obj;
        while (true) {
            synchronized (this) {
                try {
                    c7247vi = this.h;
                    if (c7247vi == null) {
                        this.g = false;
                        return;
                    }
                    this.h = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2158Uk1 c2158Uk1 = this.e;
            Object obj2 = c7247vi.b;
            while (true) {
                Object[] objArr = obj2;
                if (objArr == null) {
                    break;
                }
                for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                    if (obj == EnumC7754y61.d) {
                        c2158Uk1.onComplete();
                        break;
                    } else {
                        if (obj instanceof EnumC7754y61.a) {
                            c2158Uk1.a(((EnumC7754y61.a) obj).d);
                            break;
                        }
                        if (obj instanceof EnumC7754y61.b) {
                            c2158Uk1.f(((EnumC7754y61.b) obj).d);
                        } else {
                            c2158Uk1.d(obj);
                        }
                    }
                }
                obj2 = objArr[4];
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        if (this.i) {
            return;
        }
        synchronized (this) {
            try {
                if (this.i) {
                    return;
                }
                this.i = true;
                if (!this.g) {
                    this.g = true;
                    this.e.onComplete();
                    return;
                }
                C7247vi c7247vi = this.h;
                if (c7247vi == null) {
                    c7247vi = new C7247vi();
                    this.h = c7247vi;
                }
                c7247vi.a(EnumC7754y61.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
