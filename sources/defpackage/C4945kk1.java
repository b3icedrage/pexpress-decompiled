package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: kk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4945kk1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C4945kk1 k;
    public static final a l = new a();
    public final AbstractC1724Ow d;
    public int e;
    public List<C4267hk1> g;
    public int h;
    public byte i;
    public int j;

    /* JADX INFO: renamed from: kk1$a */
    public static class a extends Q0<C4945kk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C4945kk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: kk1$b */
    public static final class b extends AbstractC0673Bk0.a<C4945kk1, b> implements KZ0 {
        public int e;
        public List<C4267hk1> g = Collections.EMPTY_LIST;
        public int h = -1;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C4945kk1 c4945kk1L = l();
            if (c4945kk1L.d()) {
                return c4945kk1L;
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
            m((C4945kk1) abstractC0673Bk0);
            return this;
        }

        public final C4945kk1 l() {
            C4945kk1 c4945kk1 = new C4945kk1(this);
            int i = this.e;
            if ((i & 1) == 1) {
                this.g = Collections.unmodifiableList(this.g);
                this.e &= -2;
            }
            c4945kk1.g = this.g;
            int i2 = (i & 2) != 2 ? 0 : 1;
            c4945kk1.h = this.h;
            c4945kk1.e = i2;
            return c4945kk1;
        }

        public final void m(C4945kk1 c4945kk1) {
            if (c4945kk1 == C4945kk1.k) {
                return;
            }
            if (!c4945kk1.g.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = c4945kk1.g;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.g = new ArrayList(this.g);
                        this.e |= 1;
                    }
                    this.g.addAll(c4945kk1.g);
                }
            }
            if ((c4945kk1.e & 1) == 1) {
                int i = c4945kk1.h;
                this.e |= 2;
                this.h = i;
            }
            this.d = this.d.b(c4945kk1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C4945kk1 c4945kk1 = null;
            try {
                try {
                    C4945kk1.l.getClass();
                    m(new C4945kk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C4945kk1 c4945kk2 = (C4945kk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c4945kk1 = c4945kk2;
                        if (c4945kk1 != null) {
                            m(c4945kk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c4945kk1 != null) {
                    m(c4945kk1);
                }
                throw th;
            }
        }
    }

    static {
        C4945kk1 c4945kk1 = new C4945kk1();
        k = c4945kk1;
        c4945kk1.g = Collections.EMPTY_LIST;
        c4945kk1.h = -1;
    }

    public C4945kk1(b bVar) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = bVar.d;
    }

    public static b i(C4945kk1 c4945kk1) {
        b bVar = new b();
        bVar.m(c4945kk1);
        return bVar;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            iB += IE.d(1, this.g.get(i2));
        }
        if ((this.e & 1) == 1) {
            iB += IE.b(2, this.h);
        }
        int size = this.d.size() + iB;
        this.j = size;
        return size;
    }

    @Override // defpackage.HZ0
    public final HZ0.a b() {
        return i(this);
    }

    @Override // defpackage.KZ0
    public final boolean d() {
        byte b2 = this.i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!this.g.get(i).d()) {
                this.i = (byte) 0;
                return false;
            }
        }
        this.i = (byte) 1;
        return true;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        for (int i = 0; i < this.g.size(); i++) {
            ie.o(1, this.g.get(i));
        }
        if ((this.e & 1) == 1) {
            ie.m(2, this.h);
        }
        ie.r(this.d);
    }

    public final b j() {
        return i(this);
    }

    public C4945kk1() {
        this.i = (byte) -1;
        this.j = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C4945kk1(EE ee, C1578Na0 c1578Na0) {
        this.i = (byte) -1;
        this.j = -1;
        this.g = Collections.EMPTY_LIST;
        this.h = -1;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z2) {
                                this.g = new ArrayList();
                                z2 = true;
                            }
                            this.g.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                        } else if (iN != 16) {
                            if (!ee.q(iN, ieJ)) {
                            }
                        } else {
                            this.e |= 1;
                            this.h = ee.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.g = Collections.unmodifiableList(this.g);
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
        if (z2) {
            this.g = Collections.unmodifiableList(this.g);
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
