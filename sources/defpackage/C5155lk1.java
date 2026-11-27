package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;

/* JADX INFO: renamed from: lk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5155lk1 extends AbstractC0673Bk0.c<C5155lk1> {
    public static final C5155lk1 p;
    public static final a q = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public int i;
    public C4267hk1 j;
    public int k;
    public C4267hk1 l;
    public int m;
    public byte n;
    public int o;

    /* JADX INFO: renamed from: lk1$a */
    public static class a extends Q0<C5155lk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C5155lk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: lk1$b */
    public static final class b extends AbstractC0673Bk0.b<C5155lk1, b> {
        public int h;
        public int i;
        public int j;
        public C4267hk1 k;
        public int l;
        public C4267hk1 m;
        public int n;

        public b() {
            C4267hk1 c4267hk1 = C4267hk1.x;
            this.k = c4267hk1;
            this.m = c4267hk1;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C5155lk1 c5155lk1M = m();
            if (c5155lk1M.d()) {
                return c5155lk1M;
            }
            throw new C82();
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final Object clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // H0.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ H0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        /* JADX INFO: renamed from: j */
        public final AbstractC0673Bk0.a clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
            n((C5155lk1) abstractC0673Bk0);
            return this;
        }

        public final C5155lk1 m() {
            C5155lk1 c5155lk1 = new C5155lk1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c5155lk1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c5155lk1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c5155lk1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c5155lk1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c5155lk1.l = this.m;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c5155lk1.m = this.n;
            c5155lk1.g = i2;
            return c5155lk1;
        }

        public final void n(C5155lk1 c5155lk1) {
            C4267hk1 c4267hk1;
            C4267hk1 c4267hk2;
            if (c5155lk1 == C5155lk1.p) {
                return;
            }
            int i = c5155lk1.g;
            if ((i & 1) == 1) {
                int i2 = c5155lk1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c5155lk1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if ((i & 4) == 4) {
                C4267hk1 c4267hk3 = c5155lk1.j;
                if ((this.h & 4) != 4 || (c4267hk2 = this.k) == C4267hk1.x) {
                    this.k = c4267hk3;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk2);
                    cVarQ.n(c4267hk3);
                    this.k = cVarQ.m();
                }
                this.h |= 4;
            }
            int i4 = c5155lk1.g;
            if ((i4 & 8) == 8) {
                int i5 = c5155lk1.k;
                this.h = 8 | this.h;
                this.l = i5;
            }
            if ((i4 & 16) == 16) {
                C4267hk1 c4267hk4 = c5155lk1.l;
                if ((this.h & 16) != 16 || (c4267hk1 = this.m) == C4267hk1.x) {
                    this.m = c4267hk4;
                } else {
                    C4267hk1.c cVarQ2 = C4267hk1.q(c4267hk1);
                    cVarQ2.n(c4267hk4);
                    this.m = cVarQ2.m();
                }
                this.h |= 16;
            }
            if ((c5155lk1.g & 32) == 32) {
                int i6 = c5155lk1.m;
                this.h = 32 | this.h;
                this.n = i6;
            }
            l(c5155lk1);
            this.d = this.d.b(c5155lk1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C5155lk1 c5155lk1 = null;
            try {
                try {
                    C5155lk1.q.getClass();
                    n(new C5155lk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C5155lk1 c5155lk2 = (C5155lk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c5155lk1 = c5155lk2;
                        if (c5155lk1 != null) {
                            n(c5155lk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c5155lk1 != null) {
                    n(c5155lk1);
                }
                throw th;
            }
        }
    }

    static {
        C5155lk1 c5155lk1 = new C5155lk1(0);
        p = c5155lk1;
        c5155lk1.h = 0;
        c5155lk1.i = 0;
        C4267hk1 c4267hk1 = C4267hk1.x;
        c5155lk1.j = c4267hk1;
        c5155lk1.k = 0;
        c5155lk1.l = c4267hk1;
        c5155lk1.m = 0;
    }

    public C5155lk1() {
        throw null;
    }

    public C5155lk1(b bVar) {
        super(bVar);
        this.n = (byte) -1;
        this.o = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 1) == 1 ? IE.b(1, this.h) : 0;
        if ((this.g & 2) == 2) {
            iB += IE.b(2, this.i);
        }
        if ((this.g & 4) == 4) {
            iB += IE.d(3, this.j);
        }
        if ((this.g & 16) == 16) {
            iB += IE.d(4, this.l);
        }
        if ((this.g & 8) == 8) {
            iB += IE.b(5, this.k);
        }
        if ((this.g & 32) == 32) {
            iB += IE.b(6, this.m);
        }
        int size = this.e.size() + j() + iB;
        this.o = size;
        return size;
    }

    @Override // defpackage.HZ0
    public final HZ0.a b() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    @Override // defpackage.KZ0
    public final boolean d() {
        byte b2 = this.n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.g;
        if ((i & 2) != 2) {
            this.n = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.j.d()) {
            this.n = (byte) 0;
            return false;
        }
        if ((this.g & 16) == 16 && !this.l.d()) {
            this.n = (byte) 0;
            return false;
        }
        if (i()) {
            this.n = (byte) 1;
            return true;
        }
        this.n = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return p;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        AbstractC0673Bk0.c.a aVar = new AbstractC0673Bk0.c.a(this);
        if ((this.g & 1) == 1) {
            ie.m(1, this.h);
        }
        if ((this.g & 2) == 2) {
            ie.m(2, this.i);
        }
        if ((this.g & 4) == 4) {
            ie.o(3, this.j);
        }
        if ((this.g & 16) == 16) {
            ie.o(4, this.l);
        }
        if ((this.g & 8) == 8) {
            ie.m(5, this.k);
        }
        if ((this.g & 32) == 32) {
            ie.m(6, this.m);
        }
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public C5155lk1(int i) {
        this.n = (byte) -1;
        this.o = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C5155lk1(EE ee, C1578Na0 c1578Na0) {
        this.n = (byte) -1;
        this.o = -1;
        boolean z = false;
        this.h = 0;
        this.i = 0;
        C4267hk1 c4267hk1 = C4267hk1.x;
        this.j = c4267hk1;
        this.k = 0;
        this.l = c4267hk1;
        this.m = 0;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.g |= 1;
                            this.h = ee.k();
                        } else if (iN != 16) {
                            C4267hk1.c cVarQ = null;
                            if (iN == 26) {
                                if ((this.g & 4) == 4) {
                                    C4267hk1 c4267hk2 = this.j;
                                    c4267hk2.getClass();
                                    cVarQ = C4267hk1.q(c4267hk2);
                                }
                                C4267hk1 c4267hk3 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                                this.j = c4267hk3;
                                if (cVarQ != null) {
                                    cVarQ.n(c4267hk3);
                                    this.j = cVarQ.m();
                                }
                                this.g |= 4;
                            } else if (iN == 34) {
                                if ((this.g & 16) == 16) {
                                    C4267hk1 c4267hk4 = this.l;
                                    c4267hk4.getClass();
                                    cVarQ = C4267hk1.q(c4267hk4);
                                }
                                C4267hk1 c4267hk5 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                                this.l = c4267hk5;
                                if (cVarQ != null) {
                                    cVarQ.n(c4267hk5);
                                    this.l = cVarQ.m();
                                }
                                this.g |= 16;
                            } else if (iN == 40) {
                                this.g |= 8;
                                this.k = ee.k();
                            } else if (iN != 48) {
                                if (!n(ee, ieJ, c1578Na0, iN)) {
                                }
                            } else {
                                this.g |= 32;
                                this.m = ee.k();
                            }
                        } else {
                            this.g |= 2;
                            this.i = ee.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        ieJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.e = bVar.g();
                    }
                    m();
                    throw th;
                }
            } catch (C7144vC0 e) {
                e.d = this;
                throw e;
            } catch (IOException e2) {
                C7144vC0 c7144vC0 = new C7144vC0(e2.getMessage());
                c7144vC0.d = this;
                throw c7144vC0;
            }
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.e = bVar.g();
        }
        m();
    }
}
