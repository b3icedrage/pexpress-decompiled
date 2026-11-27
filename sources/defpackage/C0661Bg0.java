package defpackage;

/* JADX INFO: renamed from: Bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0661Bg0<T> extends AbstractC4317i0<T, T> {
    public final C7087ux g;
    public final C3636ek0.c h;
    public final C3636ek0.b i;
    public final C3636ek0.b j;

    /* JADX INFO: renamed from: Bg0$a */
    public static final class a<T> extends AbstractC3659er<T, T> {
        public final C7087ux i;
        public final C3636ek0.c j;
        public final C3636ek0.b k;
        public final C3636ek0.b l;

        public a(InterfaceC2913bI interfaceC2913bI, C7087ux c7087ux, C3636ek0.c cVar, C3636ek0.b bVar, C3636ek0.b bVar2) {
            super(interfaceC2913bI);
            this.i = c7087ux;
            this.j = cVar;
            this.k = bVar;
            this.l = bVar2;
        }

        @Override // defpackage.AbstractC3659er, defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            if (this.h) {
                EB1.b(th);
                return;
            }
            this.h = true;
            try {
                this.j.getClass();
                interfaceC1518Mg0.a(th);
            } catch (Throwable th2) {
                C4994l.j(th2);
                interfaceC1518Mg0.a(new HH(th, th2));
            }
            try {
                this.l.getClass();
            } catch (Throwable th3) {
                C4994l.j(th3);
                EB1.b(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.InterfaceC2913bI
        public final boolean c(T t) {
            if (this.h) {
                return false;
            }
            try {
                this.i.a(t);
                return this.d.c((Object) t);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.h) {
                return;
            }
            InterfaceC2913bI<? super R> interfaceC2913bI = this.d;
            try {
                this.i.a(t);
                interfaceC2913bI.d((Object) t);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // defpackage.AbstractC3659er, defpackage.InterfaceC6359rU1
        public final void onComplete() {
            if (this.h) {
                return;
            }
            try {
                this.k.getClass();
                this.h = true;
                this.d.onComplete();
                try {
                    this.l.getClass();
                } catch (Throwable th) {
                    C4994l.j(th);
                    EB1.b(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final T poll() throws Exception {
            C3636ek0.c cVar = this.j;
            try {
                T tPoll = this.g.poll();
                C3636ek0.b bVar = this.l;
                if (tPoll == null) {
                    return tPoll;
                }
                try {
                    this.i.a(tPoll);
                    bVar.getClass();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        C4994l.j(th);
                        try {
                            cVar.getClass();
                            C90.a aVar = C90.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            throw new HH(th, th2);
                        }
                    } catch (Throwable th3) {
                        bVar.getClass();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                C4994l.j(th4);
                try {
                    cVar.getClass();
                    C90.a aVar2 = C90.a;
                    if (th4 instanceof Exception) {
                        throw th4;
                    }
                    throw th4;
                } catch (Throwable th5) {
                    throw new HH(th4, th5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Bg0$b */
    public static final class b<T> extends AbstractC3869fr<T, T> {
        public final C7087ux i;
        public final C3636ek0.c j;
        public final C3636ek0.b k;
        public final C3636ek0.b l;

        public b(InterfaceC1518Mg0 interfaceC1518Mg0, C7087ux c7087ux, C3636ek0.c cVar, C3636ek0.b bVar, C3636ek0.b bVar2) {
            super(interfaceC1518Mg0);
            this.i = c7087ux;
            this.j = cVar;
            this.k = bVar;
            this.l = bVar2;
        }

        @Override // defpackage.AbstractC3869fr, defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            if (this.h) {
                EB1.b(th);
                return;
            }
            this.h = true;
            try {
                this.j.getClass();
                interfaceC1518Mg0.a(th);
            } catch (Throwable th2) {
                C4994l.j(th2);
                interfaceC1518Mg0.a(new HH(th, th2));
            }
            try {
                this.l.getClass();
            } catch (Throwable th3) {
                C4994l.j(th3);
                EB1.b(th3);
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.h) {
                return;
            }
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            try {
                this.i.a(t);
                interfaceC1518Mg0.d(t);
            } catch (Throwable th) {
                C4994l.j(th);
                this.e.cancel();
                a(th);
            }
        }

        @Override // defpackage.AbstractC3869fr, defpackage.InterfaceC6359rU1
        public final void onComplete() {
            if (this.h) {
                return;
            }
            try {
                this.k.getClass();
                this.h = true;
                this.d.onComplete();
                try {
                    this.l.getClass();
                } catch (Throwable th) {
                    C4994l.j(th);
                    EB1.b(th);
                }
            } catch (Throwable th2) {
                C4994l.j(th2);
                this.e.cancel();
                a(th2);
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final T poll() throws Exception {
            C3636ek0.c cVar = this.j;
            try {
                T tPoll = this.g.poll();
                C3636ek0.b bVar = this.l;
                if (tPoll == null) {
                    return tPoll;
                }
                try {
                    this.i.a(tPoll);
                    bVar.getClass();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        C4994l.j(th);
                        try {
                            cVar.getClass();
                            C90.a aVar = C90.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            throw new HH(th, th2);
                        }
                    } catch (Throwable th3) {
                        bVar.getClass();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                C4994l.j(th4);
                try {
                    cVar.getClass();
                    C90.a aVar2 = C90.a;
                    if (th4 instanceof Exception) {
                        throw th4;
                    }
                    throw th4;
                } catch (Throwable th5) {
                    throw new HH(th4, th5);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661Bg0(C0739Cg0 c0739Cg0, C7087ux c7087ux) {
        super(c0739Cg0);
        C3636ek0.c cVar = C3636ek0.d;
        C3636ek0.b bVar = C3636ek0.c;
        this.g = c7087ux;
        this.h = cVar;
        this.i = bVar;
        this.j = bVar;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        boolean z = interfaceC1518Mg0 instanceof InterfaceC2913bI;
        AbstractC7871yg0<T> abstractC7871yg0 = this.e;
        if (z) {
            abstractC7871yg0.g(new a((InterfaceC2913bI) interfaceC1518Mg0, this.g, this.h, this.i, this.j));
        } else {
            abstractC7871yg0.g(new b(interfaceC1518Mg0, this.g, this.h, this.i, this.j));
        }
    }
}
