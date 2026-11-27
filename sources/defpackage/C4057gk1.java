package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: gk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4057gk1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C4057gk1 i;
    public static final a j = new a();
    public final AbstractC1724Ow d;
    public InterfaceC3773fP0 e;
    public byte g;
    public int h;

    /* JADX INFO: renamed from: gk1$a */
    public static class a extends Q0<C4057gk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C4057gk1(ee);
        }
    }

    /* JADX INFO: renamed from: gk1$b */
    public static final class b extends AbstractC0673Bk0.a<C4057gk1, b> implements KZ0 {
        public int e;
        public InterfaceC3773fP0 g = C3144cP0.e;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C4057gk1 c4057gk1L = l();
            if (c4057gk1L.d()) {
                return c4057gk1L;
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
            m((C4057gk1) abstractC0673Bk0);
            return this;
        }

        public final C4057gk1 l() {
            C4057gk1 c4057gk1 = new C4057gk1(this);
            if ((this.e & 1) == 1) {
                this.g = this.g.t();
                this.e &= -2;
            }
            c4057gk1.e = this.g;
            return c4057gk1;
        }

        public final void m(C4057gk1 c4057gk1) {
            if (c4057gk1 == C4057gk1.i) {
                return;
            }
            if (!c4057gk1.e.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = c4057gk1.e;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.g = new C3144cP0(this.g);
                        this.e |= 1;
                    }
                    this.g.addAll(c4057gk1.e);
                }
            }
            this.d = this.d.b(c4057gk1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C4057gk1 c4057gk1 = null;
            try {
                try {
                    C4057gk1.j.getClass();
                    m(new C4057gk1(ee));
                } catch (C7144vC0 e) {
                    C4057gk1 c4057gk2 = (C4057gk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c4057gk1 = c4057gk2;
                        if (c4057gk1 != null) {
                            m(c4057gk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c4057gk1 != null) {
                    m(c4057gk1);
                }
                throw th;
            }
        }
    }

    static {
        C4057gk1 c4057gk1 = new C4057gk1();
        i = c4057gk1;
        c4057gk1.e = C3144cP0.e;
    }

    public C4057gk1(b bVar) {
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
        int size = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            AbstractC1724Ow abstractC1724OwS0 = this.e.S0(i3);
            size += abstractC1724OwS0.size() + IE.f(abstractC1724OwS0.size());
        }
        int size2 = this.d.size() + this.e.size() + size;
        this.h = size2;
        return size2;
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
            AbstractC1724Ow abstractC1724OwS0 = this.e.S0(i2);
            ie.x(1, 2);
            ie.v(abstractC1724OwS0.size());
            ie.r(abstractC1724OwS0);
        }
        ie.r(this.d);
    }

    public C4057gk1() {
        this.g = (byte) -1;
        this.h = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C4057gk1(EE ee) {
        this.g = (byte) -1;
        this.h = -1;
        this.e = C3144cP0.e;
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
                            TQ0 tq0E = ee.e();
                            if (!z2) {
                                this.e = new C3144cP0();
                                z2 = true;
                            }
                            this.e.c1(tq0E);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.e = this.e.t();
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
            this.e = this.e.t();
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
