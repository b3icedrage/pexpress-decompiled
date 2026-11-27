package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: jk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4735jk1 extends AbstractC0673Bk0.c<C4735jk1> {
    public static final C4735jk1 q;
    public static final a r = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public c k;
    public List<C4267hk1> l;
    public List<Integer> m;
    public int n;
    public byte o;
    public int p;

    /* JADX INFO: renamed from: jk1$a */
    public static class a extends Q0<C4735jk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C4735jk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: jk1$b */
    public static final class b extends AbstractC0673Bk0.b<C4735jk1, b> {
        public int h;
        public int i;
        public int j;
        public boolean k;
        public c l = c.INV;
        public List<C4267hk1> m;
        public List<Integer> n;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.m = list;
            this.n = list;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C4735jk1 c4735jk1M = m();
            if (c4735jk1M.d()) {
                return c4735jk1M;
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
            n((C4735jk1) abstractC0673Bk0);
            return this;
        }

        public final C4735jk1 m() {
            C4735jk1 c4735jk1 = new C4735jk1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c4735jk1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c4735jk1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c4735jk1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c4735jk1.k = this.l;
            if ((i & 16) == 16) {
                this.m = Collections.unmodifiableList(this.m);
                this.h &= -17;
            }
            c4735jk1.l = this.m;
            if ((this.h & 32) == 32) {
                this.n = Collections.unmodifiableList(this.n);
                this.h &= -33;
            }
            c4735jk1.m = this.n;
            c4735jk1.g = i2;
            return c4735jk1;
        }

        public final void n(C4735jk1 c4735jk1) {
            if (c4735jk1 == C4735jk1.q) {
                return;
            }
            int i = c4735jk1.g;
            if ((i & 1) == 1) {
                int i2 = c4735jk1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c4735jk1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if ((i & 4) == 4) {
                boolean z = c4735jk1.j;
                this.h = 4 | this.h;
                this.k = z;
            }
            if ((i & 8) == 8) {
                c cVar = c4735jk1.k;
                cVar.getClass();
                this.h = 8 | this.h;
                this.l = cVar;
            }
            if (!c4735jk1.l.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = c4735jk1.l;
                    this.h &= -17;
                } else {
                    if ((this.h & 16) != 16) {
                        this.m = new ArrayList(this.m);
                        this.h |= 16;
                    }
                    this.m.addAll(c4735jk1.l);
                }
            }
            if (!c4735jk1.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = c4735jk1.m;
                    this.h &= -33;
                } else {
                    if ((this.h & 32) != 32) {
                        this.n = new ArrayList(this.n);
                        this.h |= 32;
                    }
                    this.n.addAll(c4735jk1.m);
                }
            }
            l(c4735jk1);
            this.d = this.d.b(c4735jk1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C4735jk1 c4735jk1 = null;
            try {
                try {
                    C4735jk1.r.getClass();
                    n(new C4735jk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C4735jk1 c4735jk2 = (C4735jk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c4735jk1 = c4735jk2;
                        if (c4735jk1 != null) {
                            n(c4735jk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c4735jk1 != null) {
                    n(c4735jk1);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: jk1$c */
    public enum c implements YB0.a {
        IN(0),
        OUT(1),
        INV(2);

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
        C4735jk1 c4735jk1 = new C4735jk1(0);
        q = c4735jk1;
        c4735jk1.h = 0;
        c4735jk1.i = 0;
        c4735jk1.j = false;
        c4735jk1.k = c.INV;
        List list = Collections.EMPTY_LIST;
        c4735jk1.l = list;
        c4735jk1.m = list;
    }

    public C4735jk1() {
        throw null;
    }

    public C4735jk1(b bVar) {
        super(bVar);
        this.n = -1;
        this.o = (byte) -1;
        this.p = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 1) == 1 ? IE.b(1, this.h) : 0;
        if ((this.g & 2) == 2) {
            iB += IE.b(2, this.i);
        }
        if ((this.g & 4) == 4) {
            iB += IE.h(3) + 1;
        }
        if ((this.g & 8) == 8) {
            iB += IE.a(4, this.k.d);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            iB += IE.d(5, this.l.get(i2));
        }
        int iC = 0;
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            iC += IE.c(this.m.get(i3).intValue());
        }
        int iC2 = iB + iC;
        if (!this.m.isEmpty()) {
            iC2 = iC2 + 1 + IE.c(iC);
        }
        this.n = iC;
        int size = this.e.size() + j() + iC2;
        this.p = size;
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
        byte b2 = this.o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.g;
        if ((i & 1) != 1) {
            this.o = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.o = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (!this.l.get(i2).d()) {
                this.o = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.o = (byte) 1;
            return true;
        }
        this.o = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return q;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) throws IOException {
        a();
        AbstractC0673Bk0.c.a aVar = new AbstractC0673Bk0.c.a(this);
        if ((this.g & 1) == 1) {
            ie.m(1, this.h);
        }
        if ((this.g & 2) == 2) {
            ie.m(2, this.i);
        }
        if ((this.g & 4) == 4) {
            boolean z = this.j;
            ie.x(3, 0);
            ie.q(z ? 1 : 0);
        }
        if ((this.g & 8) == 8) {
            ie.l(4, this.k.d);
        }
        for (int i = 0; i < this.l.size(); i++) {
            ie.o(5, this.l.get(i));
        }
        if (this.m.size() > 0) {
            ie.v(50);
            ie.v(this.n);
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            ie.n(this.m.get(i2).intValue());
        }
        aVar.a(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, ie);
        ie.r(this.e);
    }

    public C4735jk1(int i) {
        this.n = -1;
        this.o = (byte) -1;
        this.p = -1;
        this.e = AbstractC1724Ow.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C4735jk1(EE ee, C1578Na0 c1578Na0) {
        c cVar;
        this.n = -1;
        this.o = (byte) -1;
        this.p = -1;
        this.h = 0;
        this.i = 0;
        this.j = false;
        c cVar2 = c.INV;
        this.k = cVar2;
        List list = Collections.EMPTY_LIST;
        this.l = list;
        this.m = list;
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
                        } else if (iN == 16) {
                            this.g |= 2;
                            this.i = ee.k();
                        } else if (iN == 24) {
                            this.g |= 4;
                            this.j = ee.l() != 0;
                        } else if (iN == 32) {
                            int iK = ee.k();
                            if (iK == 0) {
                                cVar = c.IN;
                            } else if (iK != 1) {
                                cVar = iK != 2 ? null : cVar2;
                            } else {
                                cVar = c.OUT;
                            }
                            if (cVar == null) {
                                ieJ.v(iN);
                                ieJ.v(iK);
                            } else {
                                this.g |= 8;
                                this.k = cVar;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.l = new ArrayList();
                                i |= 16;
                            }
                            this.l.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.m = new ArrayList();
                                i |= 32;
                            }
                            this.m.add(Integer.valueOf(ee.k()));
                        } else if (iN != 50) {
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                            }
                        } else {
                            int iD = ee.d(ee.k());
                            if ((i & 32) != 32 && ee.b() > 0) {
                                this.m = new ArrayList();
                                i |= 32;
                            }
                            while (ee.b() > 0) {
                                this.m.add(Integer.valueOf(ee.k()));
                            }
                            ee.c(iD);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if ((i & 32) == 32) {
                        this.m = Collections.unmodifiableList(this.m);
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
        if ((i & 16) == 16) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 32) == 32) {
            this.m = Collections.unmodifiableList(this.m);
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
