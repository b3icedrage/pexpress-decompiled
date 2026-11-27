package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Yj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2497Yj1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C2497Yj1 p;
    public static final a q = new a();
    public final AbstractC1724Ow d;
    public int e;
    public int g;
    public int h;
    public c i;
    public C4267hk1 j;
    public int k;
    public List<C2497Yj1> l;
    public List<C2497Yj1> m;
    public byte n;
    public int o;

    /* JADX INFO: renamed from: Yj1$a */
    public static class a extends Q0<C2497Yj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2497Yj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Yj1$b */
    public static final class b extends AbstractC0673Bk0.a<C2497Yj1, b> implements KZ0 {
        public int e;
        public int g;
        public int h;
        public c i = c.TRUE;
        public C4267hk1 j = C4267hk1.x;
        public int k;
        public List<C2497Yj1> l;
        public List<C2497Yj1> m;

        public b() {
            List<C2497Yj1> list = Collections.EMPTY_LIST;
            this.l = list;
            this.m = list;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2497Yj1 c2497Yj1L = l();
            if (c2497Yj1L.d()) {
                return c2497Yj1L;
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
            m((C2497Yj1) abstractC0673Bk0);
            return this;
        }

        public final C2497Yj1 l() {
            C2497Yj1 c2497Yj1 = new C2497Yj1(this);
            int i = this.e;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c2497Yj1.g = this.g;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c2497Yj1.h = this.h;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c2497Yj1.i = this.i;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c2497Yj1.j = this.j;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c2497Yj1.k = this.k;
            if ((i & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
                this.e &= -33;
            }
            c2497Yj1.l = this.l;
            if ((this.e & 64) == 64) {
                this.m = Collections.unmodifiableList(this.m);
                this.e &= -65;
            }
            c2497Yj1.m = this.m;
            c2497Yj1.e = i2;
            return c2497Yj1;
        }

        public final void m(C2497Yj1 c2497Yj1) {
            C4267hk1 c4267hk1;
            if (c2497Yj1 == C2497Yj1.p) {
                return;
            }
            int i = c2497Yj1.e;
            if ((i & 1) == 1) {
                int i2 = c2497Yj1.g;
                this.e = 1 | this.e;
                this.g = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c2497Yj1.h;
                this.e = 2 | this.e;
                this.h = i3;
            }
            if ((i & 4) == 4) {
                c cVar = c2497Yj1.i;
                cVar.getClass();
                this.e = 4 | this.e;
                this.i = cVar;
            }
            if ((c2497Yj1.e & 8) == 8) {
                C4267hk1 c4267hk2 = c2497Yj1.j;
                if ((this.e & 8) != 8 || (c4267hk1 = this.j) == C4267hk1.x) {
                    this.j = c4267hk2;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk1);
                    cVarQ.n(c4267hk2);
                    this.j = cVarQ.m();
                }
                this.e |= 8;
            }
            if ((c2497Yj1.e & 16) == 16) {
                int i4 = c2497Yj1.k;
                this.e = 16 | this.e;
                this.k = i4;
            }
            if (!c2497Yj1.l.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = c2497Yj1.l;
                    this.e &= -33;
                } else {
                    if ((this.e & 32) != 32) {
                        this.l = new ArrayList(this.l);
                        this.e |= 32;
                    }
                    this.l.addAll(c2497Yj1.l);
                }
            }
            if (!c2497Yj1.m.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = c2497Yj1.m;
                    this.e &= -65;
                } else {
                    if ((this.e & 64) != 64) {
                        this.m = new ArrayList(this.m);
                        this.e |= 64;
                    }
                    this.m.addAll(c2497Yj1.m);
                }
            }
            this.d = this.d.b(c2497Yj1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2497Yj1 c2497Yj1 = null;
            try {
                try {
                    C2497Yj1.q.getClass();
                    m(new C2497Yj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2497Yj1 c2497Yj2 = (C2497Yj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2497Yj1 = c2497Yj2;
                        if (c2497Yj1 != null) {
                            m(c2497Yj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2497Yj1 != null) {
                    m(c2497Yj1);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Yj1$c */
    public enum c implements YB0.a {
        TRUE(0),
        FALSE(1),
        NULL(2);

        public final int d;

        c(int i2) {
            this.d = i2;
        }

        @Override // YB0.a
        public final int getNumber() {
            return this.d;
        }
    }

    static {
        C2497Yj1 c2497Yj1 = new C2497Yj1();
        p = c2497Yj1;
        c2497Yj1.g = 0;
        c2497Yj1.h = 0;
        c2497Yj1.i = c.TRUE;
        c2497Yj1.j = C4267hk1.x;
        c2497Yj1.k = 0;
        List<C2497Yj1> list = Collections.EMPTY_LIST;
        c2497Yj1.l = list;
        c2497Yj1.m = list;
    }

    public C2497Yj1(b bVar) {
        this.n = (byte) -1;
        this.o = -1;
        this.d = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.o;
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
            iB += IE.d(4, this.j);
        }
        if ((this.e & 16) == 16) {
            iB += IE.b(5, this.k);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            iB += IE.d(6, this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            iB += IE.d(7, this.m.get(i3));
        }
        int size = this.d.size() + iB;
        this.o = size;
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
        byte b2 = this.n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.e & 8) == 8 && !this.j.d()) {
            this.n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.l.size(); i++) {
            if (!this.l.get(i).d()) {
                this.n = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            if (!this.m.get(i2).d()) {
                this.n = (byte) 0;
                return false;
            }
        }
        this.n = (byte) 1;
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
            ie.o(4, this.j);
        }
        if ((this.e & 16) == 16) {
            ie.m(5, this.k);
        }
        for (int i = 0; i < this.l.size(); i++) {
            ie.o(6, this.l.get(i));
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            ie.o(7, this.m.get(i2));
        }
        ie.r(this.d);
    }

    public C2497Yj1() {
        this.n = (byte) -1;
        this.o = -1;
        this.d = AbstractC1724Ow.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C2497Yj1(EE ee, C1578Na0 c1578Na0) {
        c cVar;
        this.n = (byte) -1;
        this.o = -1;
        boolean z = false;
        this.g = 0;
        this.h = 0;
        c cVar2 = c.TRUE;
        this.i = cVar2;
        this.j = C4267hk1.x;
        this.k = 0;
        List<C2497Yj1> list = Collections.EMPTY_LIST;
        this.l = list;
        this.m = list;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.e |= 1;
                            this.g = ee.k();
                        } else if (iN != 16) {
                            Object objQ = null;
                            if (iN == 24) {
                                int iK = ee.k();
                                if (iK != 0) {
                                    if (iK == 1) {
                                        objQ = c.FALSE;
                                    } else if (iK == 2) {
                                        objQ = c.NULL;
                                    }
                                    cVar = objQ;
                                } else {
                                    cVar = cVar2;
                                }
                                if (cVar == 0) {
                                    ieJ.v(iN);
                                    ieJ.v(iK);
                                } else {
                                    this.e |= 4;
                                    this.i = cVar;
                                }
                            } else if (iN == 34) {
                                if ((this.e & 8) == 8) {
                                    C4267hk1 c4267hk1 = this.j;
                                    c4267hk1.getClass();
                                    objQ = C4267hk1.q(c4267hk1);
                                }
                                C4267hk1.c cVar3 = objQ;
                                C4267hk1 c4267hk2 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                                this.j = c4267hk2;
                                if (cVar3 != 0) {
                                    cVar3.n(c4267hk2);
                                    this.j = cVar3.m();
                                }
                                this.e |= 8;
                            } else if (iN != 40) {
                                a aVar = q;
                                if (iN == 50) {
                                    if ((i & 32) != 32) {
                                        this.l = new ArrayList();
                                        i |= 32;
                                    }
                                    this.l.add((C2497Yj1) ee.g(aVar, c1578Na0));
                                } else if (iN != 58) {
                                    if (!ee.q(iN, ieJ)) {
                                    }
                                } else {
                                    if ((i & 64) != 64) {
                                        this.m = new ArrayList();
                                        i |= 64;
                                    }
                                    this.m.add((C2497Yj1) ee.g(aVar, c1578Na0));
                                }
                            } else {
                                this.e |= 16;
                                this.k = ee.k();
                            }
                        } else {
                            this.e |= 2;
                            this.h = ee.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if ((i & 64) == 64) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    try {
                        ieJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.d = bVar.g();
                    }
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
        if ((i & 32) == 32) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 64) == 64) {
            this.m = Collections.unmodifiableList(this.m);
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
