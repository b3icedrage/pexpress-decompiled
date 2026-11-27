package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Uj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2155Uj1 extends AbstractC0673Bk0.c<C2155Uj1> {
    public static final C2155Uj1 m;
    public static final a n = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public List<C5155lk1> i;
    public List<Integer> j;
    public byte k;
    public int l;

    /* JADX INFO: renamed from: Uj1$a */
    public static class a extends Q0<C2155Uj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2155Uj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Uj1$b */
    public static final class b extends AbstractC0673Bk0.b<C2155Uj1, b> {
        public int h;
        public int i = 6;
        public List<C5155lk1> j;
        public List<Integer> k;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.j = list;
            this.k = list;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2155Uj1 c2155Uj1M = m();
            if (c2155Uj1M.d()) {
                return c2155Uj1M;
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
            n((C2155Uj1) abstractC0673Bk0);
            return this;
        }

        public final C2155Uj1 m() {
            C2155Uj1 c2155Uj1 = new C2155Uj1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c2155Uj1.h = this.i;
            if ((i & 2) == 2) {
                this.j = Collections.unmodifiableList(this.j);
                this.h &= -3;
            }
            c2155Uj1.i = this.j;
            if ((this.h & 4) == 4) {
                this.k = Collections.unmodifiableList(this.k);
                this.h &= -5;
            }
            c2155Uj1.j = this.k;
            c2155Uj1.g = i2;
            return c2155Uj1;
        }

        public final void n(C2155Uj1 c2155Uj1) {
            if (c2155Uj1 == C2155Uj1.m) {
                return;
            }
            if ((c2155Uj1.g & 1) == 1) {
                int i = c2155Uj1.h;
                this.h = 1 | this.h;
                this.i = i;
            }
            if (!c2155Uj1.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = c2155Uj1.i;
                    this.h &= -3;
                } else {
                    if ((this.h & 2) != 2) {
                        this.j = new ArrayList(this.j);
                        this.h |= 2;
                    }
                    this.j.addAll(c2155Uj1.i);
                }
            }
            if (!c2155Uj1.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = c2155Uj1.j;
                    this.h &= -5;
                } else {
                    if ((this.h & 4) != 4) {
                        this.k = new ArrayList(this.k);
                        this.h |= 4;
                    }
                    this.k.addAll(c2155Uj1.j);
                }
            }
            l(c2155Uj1);
            this.d = this.d.b(c2155Uj1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2155Uj1 c2155Uj1 = null;
            try {
                try {
                    C2155Uj1.n.getClass();
                    n(new C2155Uj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2155Uj1 c2155Uj2 = (C2155Uj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2155Uj1 = c2155Uj2;
                        if (c2155Uj1 != null) {
                            n(c2155Uj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2155Uj1 != null) {
                    n(c2155Uj1);
                }
                throw th;
            }
        }
    }

    static {
        C2155Uj1 c2155Uj1 = new C2155Uj1(0);
        m = c2155Uj1;
        c2155Uj1.h = 6;
        List list = Collections.EMPTY_LIST;
        c2155Uj1.i = list;
        c2155Uj1.j = list;
    }

    public C2155Uj1() {
        throw null;
    }

    public C2155Uj1(b bVar) {
        super(bVar);
        this.k = (byte) -1;
        this.l = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 1) == 1 ? IE.b(1, this.h) : 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iB += IE.d(2, this.i.get(i2));
        }
        int iC = 0;
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            iC += IE.c(this.j.get(i3).intValue());
        }
        int size = this.e.size() + j() + (this.j.size() * 2) + iB + iC;
        this.l = size;
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
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (!this.i.get(i).d()) {
                this.k = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.k = (byte) 1;
            return true;
        }
        this.k = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return m;
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
        for (int i = 0; i < this.i.size(); i++) {
            ie.o(2, this.i.get(i));
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ie.m(31, this.j.get(i2).intValue());
        }
        aVar.a(19000, ie);
        ie.r(this.e);
    }

    public C2155Uj1(int i) {
        this.k = (byte) -1;
        this.l = -1;
        this.e = AbstractC1724Ow.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C2155Uj1(EE ee, C1578Na0 c1578Na0) {
        this.k = (byte) -1;
        this.l = -1;
        this.h = 6;
        List list = Collections.EMPTY_LIST;
        this.i = list;
        this.j = list;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.g |= 1;
                            this.h = ee.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.i = new ArrayList();
                                i |= 2;
                            }
                            this.i.add((C5155lk1) ee.g(C5155lk1.q, c1578Na0));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.j = new ArrayList();
                                i |= 4;
                            }
                            this.j.add(Integer.valueOf(ee.k()));
                        } else if (iN != 250) {
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                            }
                        } else {
                            int iD = ee.d(ee.k());
                            if ((i & 4) != 4 && ee.b() > 0) {
                                this.j = new ArrayList();
                                i |= 4;
                            }
                            while (ee.b() > 0) {
                                this.j.add(Integer.valueOf(ee.k()));
                            }
                            ee.c(iD);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 4) == 4) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
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
        if ((i & 2) == 2) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 4) == 4) {
            this.j = Collections.unmodifiableList(this.j);
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
