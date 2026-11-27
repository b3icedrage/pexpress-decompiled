package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;

/* JADX INFO: renamed from: Xj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2419Xj1 extends AbstractC0673Bk0.c<C2419Xj1> {
    public static final C2419Xj1 k;
    public static final a l = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public byte i;
    public int j;

    /* JADX INFO: renamed from: Xj1$a */
    public static class a extends Q0<C2419Xj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2419Xj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Xj1$b */
    public static final class b extends AbstractC0673Bk0.b<C2419Xj1, b> {
        public int h;
        public int i;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2419Xj1 c2419Xj1 = new C2419Xj1(this);
            int i = (this.h & 1) != 1 ? 0 : 1;
            c2419Xj1.h = this.i;
            c2419Xj1.g = i;
            if (c2419Xj1.d()) {
                return c2419Xj1;
            }
            throw new C82();
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final Object clone() {
            b bVar = new b();
            C2419Xj1 c2419Xj1 = new C2419Xj1(this);
            int i = (this.h & 1) != 1 ? 0 : 1;
            c2419Xj1.h = this.i;
            c2419Xj1.g = i;
            bVar.m(c2419Xj1);
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
            C2419Xj1 c2419Xj1 = new C2419Xj1(this);
            int i = (this.h & 1) != 1 ? 0 : 1;
            c2419Xj1.h = this.i;
            c2419Xj1.g = i;
            bVar.m(c2419Xj1);
            return bVar;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
            m((C2419Xj1) abstractC0673Bk0);
            return this;
        }

        public final void m(C2419Xj1 c2419Xj1) {
            if (c2419Xj1 == C2419Xj1.k) {
                return;
            }
            if ((c2419Xj1.g & 1) == 1) {
                int i = c2419Xj1.h;
                this.h = 1 | this.h;
                this.i = i;
            }
            l(c2419Xj1);
            this.d = this.d.b(c2419Xj1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2419Xj1 c2419Xj1 = null;
            try {
                try {
                    C2419Xj1.l.getClass();
                    m(new C2419Xj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2419Xj1 c2419Xj2 = (C2419Xj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2419Xj1 = c2419Xj2;
                        if (c2419Xj1 != null) {
                            m(c2419Xj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2419Xj1 != null) {
                    m(c2419Xj1);
                }
                throw th;
            }
        }
    }

    static {
        C2419Xj1 c2419Xj1 = new C2419Xj1(0);
        k = c2419Xj1;
        c2419Xj1.h = 0;
    }

    public C2419Xj1() {
        throw null;
    }

    public C2419Xj1(b bVar) {
        super(bVar);
        this.i = (byte) -1;
        this.j = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int size = this.e.size() + j() + ((this.g & 1) == 1 ? IE.b(1, this.h) : 0);
        this.j = size;
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
        byte b2 = this.i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (i()) {
            this.i = (byte) 1;
            return true;
        }
        this.i = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return k;
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
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public C2419Xj1(int i) {
        this.i = (byte) -1;
        this.j = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C2419Xj1(EE ee, C1578Na0 c1578Na0) {
        this.i = (byte) -1;
        this.j = -1;
        boolean z = false;
        this.h = 0;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            if (iN != 8) {
                                if (!n(ee, ieJ, c1578Na0, iN)) {
                                }
                            } else {
                                this.g |= 1;
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
                    this.e = bVar.g();
                }
                m();
                throw th;
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
