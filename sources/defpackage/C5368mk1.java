package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: mk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5368mk1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C5368mk1 o;
    public static final a p = new a();
    public final AbstractC1724Ow d;
    public int e;
    public int g;
    public int h;
    public c i;
    public int j;
    public int k;
    public d l;
    public byte m;
    public int n;

    /* JADX INFO: renamed from: mk1$a */
    public static class a extends Q0<C5368mk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C5368mk1(ee);
        }
    }

    /* JADX INFO: renamed from: mk1$b */
    public static final class b extends AbstractC0673Bk0.a<C5368mk1, b> implements KZ0 {
        public int e;
        public int g;
        public int h;
        public int j;
        public int k;
        public c i = c.ERROR;
        public d l = d.LANGUAGE_VERSION;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C5368mk1 c5368mk1L = l();
            if (c5368mk1L.d()) {
                return c5368mk1L;
            }
            throw new C82();
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // H0.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ H0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        /* JADX INFO: renamed from: j */
        public final AbstractC0673Bk0.a clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
            m((C5368mk1) abstractC0673Bk0);
            return this;
        }

        public final C5368mk1 l() {
            C5368mk1 c5368mk1 = new C5368mk1(this);
            int i = this.e;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c5368mk1.g = this.g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c5368mk1.h = this.h;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c5368mk1.i = this.i;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c5368mk1.j = this.j;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c5368mk1.k = this.k;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c5368mk1.l = this.l;
            c5368mk1.e = i2;
            return c5368mk1;
        }

        public final void m(C5368mk1 c5368mk1) {
            if (c5368mk1 == C5368mk1.o) {
                return;
            }
            int i = c5368mk1.e;
            if ((i & 1) == 1) {
                int i2 = c5368mk1.g;
                this.e = 1 | this.e;
                this.g = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c5368mk1.h;
                this.e = 2 | this.e;
                this.h = i3;
            }
            if ((i & 4) == 4) {
                c cVar = c5368mk1.i;
                cVar.getClass();
                this.e = 4 | this.e;
                this.i = cVar;
            }
            int i4 = c5368mk1.e;
            if ((i4 & 8) == 8) {
                int i5 = c5368mk1.j;
                this.e = 8 | this.e;
                this.j = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = c5368mk1.k;
                this.e = 16 | this.e;
                this.k = i6;
            }
            if ((i4 & 32) == 32) {
                d dVar = c5368mk1.l;
                dVar.getClass();
                this.e = 32 | this.e;
                this.l = dVar;
            }
            this.d = this.d.b(c5368mk1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C5368mk1 c5368mk1 = null;
            try {
                try {
                    C5368mk1.p.getClass();
                    m(new C5368mk1(ee));
                } catch (C7144vC0 e) {
                    C5368mk1 c5368mk2 = (C5368mk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c5368mk1 = c5368mk2;
                        if (c5368mk1 != null) {
                            m(c5368mk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c5368mk1 != null) {
                    m(c5368mk1);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: mk1$c */
    public enum c implements YB0.a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);

        public final int d;

        c(int i2) {
            this.d = i2;
        }

        @Override // YB0.a
        public final int getNumber() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: mk1$d */
    public enum d implements YB0.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);

        public final int d;

        d(int i2) {
            this.d = i2;
        }

        @Override // YB0.a
        public final int getNumber() {
            return this.d;
        }
    }

    static {
        C5368mk1 c5368mk1 = new C5368mk1();
        o = c5368mk1;
        c5368mk1.g = 0;
        c5368mk1.h = 0;
        c5368mk1.i = c.ERROR;
        c5368mk1.j = 0;
        c5368mk1.k = 0;
        c5368mk1.l = d.LANGUAGE_VERSION;
    }

    public C5368mk1(b bVar) {
        this.m = (byte) -1;
        this.n = -1;
        this.d = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
        if ((this.e & 2) == 2) {
            iB += IE.b(2, this.h);
        }
        if ((this.e & 4) == 4) {
            iB += IE.a(3, this.i.d);
        }
        if ((this.e & 8) == 8) {
            iB += IE.b(4, this.j);
        }
        if ((this.e & 16) == 16) {
            iB += IE.b(5, this.k);
        }
        if ((this.e & 32) == 32) {
            iB += IE.a(6, this.l.d);
        }
        int size = this.d.size() + iB;
        this.n = size;
        return size;
    }

    @Override // defpackage.HZ0
    public final HZ0.a b() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // defpackage.KZ0
    public final boolean d() {
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.m = (byte) 1;
        return true;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        if ((this.e & 1) == 1) {
            ie.m(1, this.g);
        }
        if ((this.e & 2) == 2) {
            ie.m(2, this.h);
        }
        if ((this.e & 4) == 4) {
            ie.l(3, this.i.d);
        }
        if ((this.e & 8) == 8) {
            ie.m(4, this.j);
        }
        if ((this.e & 16) == 16) {
            ie.m(5, this.k);
        }
        if ((this.e & 32) == 32) {
            ie.l(6, this.l.d);
        }
        ie.r(this.d);
    }

    public C5368mk1() {
        this.m = (byte) -1;
        this.n = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C5368mk1(EE ee) {
        this.m = (byte) -1;
        this.n = -1;
        boolean z = false;
        this.g = 0;
        this.h = 0;
        c cVar = c.ERROR;
        this.i = cVar;
        this.j = 0;
        this.k = 0;
        d dVar = d.LANGUAGE_VERSION;
        this.l = dVar;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.e |= 1;
                                this.g = ee.k();
                            } else if (iN != 16) {
                                d dVar2 = null;
                                c cVar2 = null;
                                if (iN == 24) {
                                    int iK = ee.k();
                                    if (iK == 0) {
                                        cVar2 = c.WARNING;
                                    } else if (iK == 1) {
                                        cVar2 = cVar;
                                    } else if (iK == 2) {
                                        cVar2 = c.HIDDEN;
                                    }
                                    if (cVar2 == null) {
                                        ieJ.v(iN);
                                        ieJ.v(iK);
                                    } else {
                                        this.e |= 4;
                                        this.i = cVar2;
                                    }
                                } else if (iN == 32) {
                                    this.e |= 8;
                                    this.j = ee.k();
                                } else if (iN == 40) {
                                    this.e |= 16;
                                    this.k = ee.k();
                                } else if (iN != 48) {
                                    if (!ee.q(iN, ieJ)) {
                                    }
                                } else {
                                    int iK2 = ee.k();
                                    if (iK2 == 0) {
                                        dVar2 = dVar;
                                    } else if (iK2 == 1) {
                                        dVar2 = d.COMPILER_VERSION;
                                    } else if (iK2 == 2) {
                                        dVar2 = d.API_VERSION;
                                    }
                                    if (dVar2 == null) {
                                        ieJ.v(iN);
                                        ieJ.v(iK2);
                                    } else {
                                        this.e |= 32;
                                        this.l = dVar2;
                                    }
                                }
                            } else {
                                this.e |= 2;
                                this.h = ee.k();
                            }
                        }
                        z = true;
                    } catch (C7144vC0 e) {
                        e.d = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    C7144vC0 c7144vC0 = new C7144vC0(e2.getMessage());
                    c7144vC0.d = this;
                    throw c7144vC0;
                }
            } catch (Throwable th) {
                try {
                    ieJ.i();
                } catch (IOException unused) {
                } finally {
                    this.d = bVar.g();
                }
                throw th;
            }
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
