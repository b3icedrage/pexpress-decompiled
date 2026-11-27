package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Wj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2315Wj1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C2315Wj1 m;
    public static final a n = new a();
    public final AbstractC1724Ow d;
    public int e;
    public c g;
    public List<C2497Yj1> h;
    public C2497Yj1 i;
    public d j;
    public byte k;
    public int l;

    /* JADX INFO: renamed from: Wj1$a */
    public static class a extends Q0<C2315Wj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2315Wj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Wj1$b */
    public static final class b extends AbstractC0673Bk0.a<C2315Wj1, b> implements KZ0 {
        public int e;
        public c g = c.RETURNS_CONSTANT;
        public List<C2497Yj1> h = Collections.EMPTY_LIST;
        public C2497Yj1 i = C2497Yj1.p;
        public d j = d.AT_MOST_ONCE;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2315Wj1 c2315Wj1L = l();
            if (c2315Wj1L.d()) {
                return c2315Wj1L;
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
            m((C2315Wj1) abstractC0673Bk0);
            return this;
        }

        public final C2315Wj1 l() {
            C2315Wj1 c2315Wj1 = new C2315Wj1(this);
            int i = this.e;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c2315Wj1.g = this.g;
            if ((i & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
                this.e &= -3;
            }
            c2315Wj1.h = this.h;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c2315Wj1.i = this.i;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c2315Wj1.j = this.j;
            c2315Wj1.e = i2;
            return c2315Wj1;
        }

        public final void m(C2315Wj1 c2315Wj1) {
            C2497Yj1 c2497Yj1;
            if (c2315Wj1 == C2315Wj1.m) {
                return;
            }
            if ((c2315Wj1.e & 1) == 1) {
                c cVar = c2315Wj1.g;
                cVar.getClass();
                this.e |= 1;
                this.g = cVar;
            }
            if (!c2315Wj1.h.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = c2315Wj1.h;
                    this.e &= -3;
                } else {
                    if ((this.e & 2) != 2) {
                        this.h = new ArrayList(this.h);
                        this.e |= 2;
                    }
                    this.h.addAll(c2315Wj1.h);
                }
            }
            if ((c2315Wj1.e & 2) == 2) {
                C2497Yj1 c2497Yj2 = c2315Wj1.i;
                if ((this.e & 4) != 4 || (c2497Yj1 = this.i) == C2497Yj1.p) {
                    this.i = c2497Yj2;
                } else {
                    C2497Yj1.b bVar = new C2497Yj1.b();
                    bVar.m(c2497Yj1);
                    bVar.m(c2497Yj2);
                    this.i = bVar.l();
                }
                this.e |= 4;
            }
            if ((c2315Wj1.e & 4) == 4) {
                d dVar = c2315Wj1.j;
                dVar.getClass();
                this.e |= 8;
                this.j = dVar;
            }
            this.d = this.d.b(c2315Wj1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2315Wj1 c2315Wj1 = null;
            try {
                try {
                    C2315Wj1.n.getClass();
                    m(new C2315Wj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2315Wj1 c2315Wj2 = (C2315Wj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2315Wj1 = c2315Wj2;
                        if (c2315Wj1 != null) {
                            m(c2315Wj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2315Wj1 != null) {
                    m(c2315Wj1);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Wj1$c */
    public enum c implements YB0.a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);

        public final int d;

        c(int i2) {
            this.d = i2;
        }

        @Override // YB0.a
        public final int getNumber() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: Wj1$d */
    public enum d implements YB0.a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);

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
        C2315Wj1 c2315Wj1 = new C2315Wj1();
        m = c2315Wj1;
        c2315Wj1.g = c.RETURNS_CONSTANT;
        c2315Wj1.h = Collections.EMPTY_LIST;
        c2315Wj1.i = C2497Yj1.p;
        c2315Wj1.j = d.AT_MOST_ONCE;
    }

    public C2315Wj1(b bVar) {
        this.k = (byte) -1;
        this.l = -1;
        this.d = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int iA = (this.e & 1) == 1 ? IE.a(1, this.g.d) : 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iA += IE.d(2, this.h.get(i2));
        }
        if ((this.e & 2) == 2) {
            iA += IE.d(3, this.i);
        }
        if ((this.e & 4) == 4) {
            iA += IE.a(4, this.j.d);
        }
        int size = this.d.size() + iA;
        this.l = size;
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
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).d()) {
                this.k = (byte) 0;
                return false;
            }
        }
        if ((this.e & 2) != 2 || this.i.d()) {
            this.k = (byte) 1;
            return true;
        }
        this.k = (byte) 0;
        return false;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        if ((this.e & 1) == 1) {
            ie.l(1, this.g.d);
        }
        for (int i = 0; i < this.h.size(); i++) {
            ie.o(2, this.h.get(i));
        }
        if ((this.e & 2) == 2) {
            ie.o(3, this.i);
        }
        if ((this.e & 4) == 4) {
            ie.l(4, this.j.d);
        }
        ie.r(this.d);
    }

    public C2315Wj1() {
        this.k = (byte) -1;
        this.l = -1;
        this.d = AbstractC1724Ow.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C2315Wj1(EE ee, C1578Na0 c1578Na0) {
        this.k = (byte) -1;
        this.l = -1;
        c cVar = c.RETURNS_CONSTANT;
        this.g = cVar;
        this.h = Collections.EMPTY_LIST;
        this.i = C2497Yj1.p;
        d dVar = d.AT_MOST_ONCE;
        this.j = dVar;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        char c2 = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        d dVar2 = null;
                        c cVar2 = null;
                        C2497Yj1.b bVar2 = null;
                        if (iN == 8) {
                            int iK = ee.k();
                            if (iK == 0) {
                                cVar2 = cVar;
                            } else if (iK == 1) {
                                cVar2 = c.CALLS;
                            } else if (iK == 2) {
                                cVar2 = c.RETURNS_NOT_NULL;
                            }
                            if (cVar2 == null) {
                                ieJ.v(iN);
                                ieJ.v(iK);
                            } else {
                                this.e |= 1;
                                this.g = cVar2;
                            }
                        } else if (iN == 18) {
                            int i = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i != 2) {
                                this.h = new ArrayList();
                                c2 = 2;
                            }
                            this.h.add((C2497Yj1) ee.g(C2497Yj1.q, c1578Na0));
                        } else if (iN == 26) {
                            if ((this.e & 2) == 2) {
                                C2497Yj1 c2497Yj1 = this.i;
                                c2497Yj1.getClass();
                                bVar2 = new C2497Yj1.b();
                                bVar2.m(c2497Yj1);
                            }
                            C2497Yj1 c2497Yj2 = (C2497Yj1) ee.g(C2497Yj1.q, c1578Na0);
                            this.i = c2497Yj2;
                            if (bVar2 != null) {
                                bVar2.m(c2497Yj2);
                                this.i = bVar2.l();
                            }
                            this.e |= 2;
                        } else if (iN != 32) {
                            if (!ee.q(iN, ieJ)) {
                            }
                        } else {
                            int iK2 = ee.k();
                            if (iK2 == 0) {
                                dVar2 = dVar;
                            } else if (iK2 == 1) {
                                dVar2 = d.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                dVar2 = d.AT_LEAST_ONCE;
                            }
                            if (dVar2 == null) {
                                ieJ.v(iN);
                                ieJ.v(iK2);
                            } else {
                                this.e |= 4;
                                this.j = dVar2;
                            }
                        }
                    }
                    z = true;
                } catch (C7144vC0 e) {
                    e.d = this;
                    throw e;
                } catch (IOException e2) {
                    C7144vC0 c7144vC0 = new C7144vC0(e2.getMessage());
                    c7144vC0.d = this;
                    throw c7144vC0;
                }
            } catch (Throwable th) {
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                try {
                    ieJ.i();
                } catch (IOException unused) {
                } finally {
                    this.d = bVar.g();
                }
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.h = Collections.unmodifiableList(this.h);
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
