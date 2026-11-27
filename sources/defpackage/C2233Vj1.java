package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Vj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2233Vj1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C2233Vj1 i;
    public static final a j = new a();
    public final AbstractC1724Ow d;
    public List<C2315Wj1> e;
    public byte g;
    public int h;

    /* JADX INFO: renamed from: Vj1$a */
    public static class a extends Q0<C2233Vj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2233Vj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Vj1$b */
    public static final class b extends AbstractC0673Bk0.a<C2233Vj1, b> implements KZ0 {
        public int e;
        public List<C2315Wj1> g = Collections.EMPTY_LIST;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2233Vj1 c2233Vj1L = l();
            if (c2233Vj1L.d()) {
                return c2233Vj1L;
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
            m((C2233Vj1) abstractC0673Bk0);
            return this;
        }

        public final C2233Vj1 l() {
            C2233Vj1 c2233Vj1 = new C2233Vj1(this);
            if ((this.e & 1) == 1) {
                this.g = Collections.unmodifiableList(this.g);
                this.e &= -2;
            }
            c2233Vj1.e = this.g;
            return c2233Vj1;
        }

        public final void m(C2233Vj1 c2233Vj1) {
            if (c2233Vj1 == C2233Vj1.i) {
                return;
            }
            if (!c2233Vj1.e.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = c2233Vj1.e;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.g = new ArrayList(this.g);
                        this.e |= 1;
                    }
                    this.g.addAll(c2233Vj1.e);
                }
            }
            this.d = this.d.b(c2233Vj1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2233Vj1 c2233Vj1 = null;
            try {
                try {
                    C2233Vj1.j.getClass();
                    m(new C2233Vj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2233Vj1 c2233Vj2 = (C2233Vj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2233Vj1 = c2233Vj2;
                        if (c2233Vj1 != null) {
                            m(c2233Vj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2233Vj1 != null) {
                    m(c2233Vj1);
                }
                throw th;
            }
        }
    }

    static {
        C2233Vj1 c2233Vj1 = new C2233Vj1();
        i = c2233Vj1;
        c2233Vj1.e = Collections.EMPTY_LIST;
    }

    public C2233Vj1(b bVar) {
        this.g = (byte) -1;
        this.h = -1;
        this.d = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i2 = this.h;
        if (i2 != -1) {
            return i2;
        }
        int iD = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iD += IE.d(1, this.e.get(i3));
        }
        int size = this.d.size() + iD;
        this.h = size;
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
        byte b2 = this.g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!this.e.get(i2).d()) {
                this.g = (byte) 0;
                return false;
            }
        }
        this.g = (byte) 1;
        return true;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ie.o(1, this.e.get(i2));
        }
        ie.r(this.d);
    }

    public C2233Vj1() {
        this.g = (byte) -1;
        this.h = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C2233Vj1(EE ee, C1578Na0 c1578Na0) {
        this.g = (byte) -1;
        this.h = -1;
        this.e = Collections.EMPTY_LIST;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!ee.q(iN, ieJ)) {
                            }
                        } else {
                            if (!z2) {
                                this.e = new ArrayList();
                                z2 = true;
                            }
                            this.e.add((C2315Wj1) ee.g(C2315Wj1.n, c1578Na0));
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
                if (z2) {
                    this.e = Collections.unmodifiableList(this.e);
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
        if (z2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
