package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: dk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3428dk1 extends AbstractC0673Bk0.c<C3428dk1> {
    public static final C3428dk1 n;
    public static final a o = new a();
    public final AbstractC1724Ow e;
    public int g;
    public C4057gk1 h;
    public C3847fk1 i;
    public C3218ck1 j;
    public List<C2077Tj1> k;
    public byte l;
    public int m;

    /* JADX INFO: renamed from: dk1$a */
    public static class a extends Q0<C3428dk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C3428dk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: dk1$b */
    public static final class b extends AbstractC0673Bk0.b<C3428dk1, b> {
        public int h;
        public C4057gk1 i = C4057gk1.i;
        public C3847fk1 j = C3847fk1.i;
        public C3218ck1 k = C3218ck1.o;
        public List<C2077Tj1> l = Collections.EMPTY_LIST;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C3428dk1 c3428dk1M = m();
            if (c3428dk1M.d()) {
                return c3428dk1M;
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
            n((C3428dk1) abstractC0673Bk0);
            return this;
        }

        public final C3428dk1 m() {
            C3428dk1 c3428dk1 = new C3428dk1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c3428dk1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c3428dk1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c3428dk1.j = this.k;
            if ((i & 8) == 8) {
                this.l = Collections.unmodifiableList(this.l);
                this.h &= -9;
            }
            c3428dk1.k = this.l;
            c3428dk1.g = i2;
            return c3428dk1;
        }

        public final void n(C3428dk1 c3428dk1) {
            C3218ck1 c3218ck1;
            C3847fk1 c3847fk1;
            C4057gk1 c4057gk1;
            if (c3428dk1 == C3428dk1.n) {
                return;
            }
            if ((c3428dk1.g & 1) == 1) {
                C4057gk1 c4057gk2 = c3428dk1.h;
                if ((this.h & 1) != 1 || (c4057gk1 = this.i) == C4057gk1.i) {
                    this.i = c4057gk2;
                } else {
                    C4057gk1.b bVar = new C4057gk1.b();
                    bVar.m(c4057gk1);
                    bVar.m(c4057gk2);
                    this.i = bVar.l();
                }
                this.h |= 1;
            }
            if ((c3428dk1.g & 2) == 2) {
                C3847fk1 c3847fk2 = c3428dk1.i;
                if ((this.h & 2) != 2 || (c3847fk1 = this.j) == C3847fk1.i) {
                    this.j = c3847fk2;
                } else {
                    C3847fk1.b bVar2 = new C3847fk1.b();
                    bVar2.m(c3847fk1);
                    bVar2.m(c3847fk2);
                    this.j = bVar2.l();
                }
                this.h |= 2;
            }
            if ((c3428dk1.g & 4) == 4) {
                C3218ck1 c3218ck2 = c3428dk1.j;
                if ((this.h & 4) != 4 || (c3218ck1 = this.k) == C3218ck1.o) {
                    this.k = c3218ck2;
                } else {
                    C3218ck1.b bVar3 = new C3218ck1.b();
                    bVar3.n(c3218ck1);
                    bVar3.n(c3218ck2);
                    this.k = bVar3.m();
                }
                this.h |= 4;
            }
            if (!c3428dk1.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = c3428dk1.k;
                    this.h &= -9;
                } else {
                    if ((this.h & 8) != 8) {
                        this.l = new ArrayList(this.l);
                        this.h |= 8;
                    }
                    this.l.addAll(c3428dk1.k);
                }
            }
            l(c3428dk1);
            this.d = this.d.b(c3428dk1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C3428dk1 c3428dk1 = null;
            try {
                try {
                    C3428dk1.o.getClass();
                    n(new C3428dk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C3428dk1 c3428dk2 = (C3428dk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c3428dk1 = c3428dk2;
                        if (c3428dk1 != null) {
                            n(c3428dk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3428dk1 != null) {
                    n(c3428dk1);
                }
                throw th;
            }
        }
    }

    static {
        C3428dk1 c3428dk1 = new C3428dk1(0);
        n = c3428dk1;
        c3428dk1.h = C4057gk1.i;
        c3428dk1.i = C3847fk1.i;
        c3428dk1.j = C3218ck1.o;
        c3428dk1.k = Collections.EMPTY_LIST;
    }

    public C3428dk1() {
        throw null;
    }

    public C3428dk1(b bVar) {
        super(bVar);
        this.l = (byte) -1;
        this.m = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int iD = (this.g & 1) == 1 ? IE.d(1, this.h) : 0;
        if ((this.g & 2) == 2) {
            iD += IE.d(2, this.i);
        }
        if ((this.g & 4) == 4) {
            iD += IE.d(3, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            iD += IE.d(4, this.k.get(i2));
        }
        int size = this.e.size() + j() + iD;
        this.m = size;
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
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.g & 2) == 2 && !this.i.d()) {
            this.l = (byte) 0;
            return false;
        }
        if ((this.g & 4) == 4 && !this.j.d()) {
            this.l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!this.k.get(i).d()) {
                this.l = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.l = (byte) 1;
            return true;
        }
        this.l = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return n;
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
            ie.o(1, this.h);
        }
        if ((this.g & 2) == 2) {
            ie.o(2, this.i);
        }
        if ((this.g & 4) == 4) {
            ie.o(3, this.j);
        }
        for (int i = 0; i < this.k.size(); i++) {
            ie.o(4, this.k.get(i));
        }
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public C3428dk1(int i) {
        this.l = (byte) -1;
        this.m = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C3428dk1(EE ee, C1578Na0 c1578Na0) {
        this.l = (byte) -1;
        this.m = -1;
        this.h = C4057gk1.i;
        this.i = C3847fk1.i;
        this.j = C3218ck1.o;
        this.k = Collections.EMPTY_LIST;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        C3218ck1.b bVar2 = null;
                        C4057gk1.b bVar3 = null;
                        C3847fk1.b bVar4 = null;
                        if (iN == 10) {
                            if ((this.g & 1) == 1) {
                                C4057gk1 c4057gk1 = this.h;
                                c4057gk1.getClass();
                                bVar3 = new C4057gk1.b();
                                bVar3.m(c4057gk1);
                            }
                            C4057gk1 c4057gk2 = (C4057gk1) ee.g(C4057gk1.j, c1578Na0);
                            this.h = c4057gk2;
                            if (bVar3 != null) {
                                bVar3.m(c4057gk2);
                                this.h = bVar3.l();
                            }
                            this.g |= 1;
                        } else if (iN == 18) {
                            if ((this.g & 2) == 2) {
                                C3847fk1 c3847fk1 = this.i;
                                c3847fk1.getClass();
                                bVar4 = new C3847fk1.b();
                                bVar4.m(c3847fk1);
                            }
                            C3847fk1 c3847fk2 = (C3847fk1) ee.g(C3847fk1.j, c1578Na0);
                            this.i = c3847fk2;
                            if (bVar4 != null) {
                                bVar4.m(c3847fk2);
                                this.i = bVar4.l();
                            }
                            this.g |= 2;
                        } else if (iN == 26) {
                            if ((this.g & 4) == 4) {
                                C3218ck1 c3218ck1 = this.j;
                                c3218ck1.getClass();
                                bVar2 = new C3218ck1.b();
                                bVar2.n(c3218ck1);
                            }
                            C3218ck1 c3218ck2 = (C3218ck1) ee.g(C3218ck1.p, c1578Na0);
                            this.j = c3218ck2;
                            if (bVar2 != null) {
                                bVar2.n(c3218ck2);
                                this.j = bVar2.m();
                            }
                            this.g |= 4;
                        } else if (iN != 34) {
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                            }
                        } else {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.k = new ArrayList();
                                c = '\b';
                            }
                            this.k.add((C2077Tj1) ee.g(C2077Tj1.O, c1578Na0));
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
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.k = Collections.unmodifiableList(this.k);
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
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.k = Collections.unmodifiableList(this.k);
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
