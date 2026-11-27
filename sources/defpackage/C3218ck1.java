package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ck1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3218ck1 extends AbstractC0673Bk0.c<C3218ck1> {
    public static final C3218ck1 o;
    public static final a p = new a();
    public final AbstractC1724Ow e;
    public int g;
    public List<C2575Zj1> h;
    public List<C3637ek1> i;
    public List<C4476ik1> j;
    public C4945kk1 k;
    public C5578nk1 l;
    public byte m;
    public int n;

    /* JADX INFO: renamed from: ck1$a */
    public static class a extends Q0<C3218ck1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C3218ck1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: ck1$b */
    public static final class b extends AbstractC0673Bk0.b<C3218ck1, b> {
        public int h;
        public List<C2575Zj1> i;
        public List<C3637ek1> j;
        public List<C4476ik1> k;
        public C4945kk1 l;
        public C5578nk1 m;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.i = list;
            this.j = list;
            this.k = list;
            this.l = C4945kk1.k;
            this.m = C5578nk1.i;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C3218ck1 c3218ck1M = m();
            if (c3218ck1M.d()) {
                return c3218ck1M;
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
            n((C3218ck1) abstractC0673Bk0);
            return this;
        }

        public final C3218ck1 m() {
            C3218ck1 c3218ck1 = new C3218ck1(this);
            int i = this.h;
            if ((i & 1) == 1) {
                this.i = Collections.unmodifiableList(this.i);
                this.h &= -2;
            }
            c3218ck1.h = this.i;
            if ((this.h & 2) == 2) {
                this.j = Collections.unmodifiableList(this.j);
                this.h &= -3;
            }
            c3218ck1.i = this.j;
            if ((this.h & 4) == 4) {
                this.k = Collections.unmodifiableList(this.k);
                this.h &= -5;
            }
            c3218ck1.j = this.k;
            int i2 = (i & 8) != 8 ? 0 : 1;
            c3218ck1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            c3218ck1.l = this.m;
            c3218ck1.g = i2;
            return c3218ck1;
        }

        public final void n(C3218ck1 c3218ck1) {
            C5578nk1 c5578nk1;
            C4945kk1 c4945kk1;
            if (c3218ck1 == C3218ck1.o) {
                return;
            }
            if (!c3218ck1.h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = c3218ck1.h;
                    this.h &= -2;
                } else {
                    if ((this.h & 1) != 1) {
                        this.i = new ArrayList(this.i);
                        this.h |= 1;
                    }
                    this.i.addAll(c3218ck1.h);
                }
            }
            if (!c3218ck1.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = c3218ck1.i;
                    this.h &= -3;
                } else {
                    if ((this.h & 2) != 2) {
                        this.j = new ArrayList(this.j);
                        this.h |= 2;
                    }
                    this.j.addAll(c3218ck1.i);
                }
            }
            if (!c3218ck1.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = c3218ck1.j;
                    this.h &= -5;
                } else {
                    if ((this.h & 4) != 4) {
                        this.k = new ArrayList(this.k);
                        this.h |= 4;
                    }
                    this.k.addAll(c3218ck1.j);
                }
            }
            if ((c3218ck1.g & 1) == 1) {
                C4945kk1 c4945kk2 = c3218ck1.k;
                if ((this.h & 8) != 8 || (c4945kk1 = this.l) == C4945kk1.k) {
                    this.l = c4945kk2;
                } else {
                    C4945kk1.b bVarI = C4945kk1.i(c4945kk1);
                    bVarI.m(c4945kk2);
                    this.l = bVarI.l();
                }
                this.h |= 8;
            }
            if ((c3218ck1.g & 2) == 2) {
                C5578nk1 c5578nk2 = c3218ck1.l;
                if ((this.h & 16) != 16 || (c5578nk1 = this.m) == C5578nk1.i) {
                    this.m = c5578nk2;
                } else {
                    C5578nk1.b bVar = new C5578nk1.b();
                    bVar.m(c5578nk1);
                    bVar.m(c5578nk2);
                    this.m = bVar.l();
                }
                this.h |= 16;
            }
            l(c3218ck1);
            this.d = this.d.b(c3218ck1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C3218ck1 c3218ck1 = null;
            try {
                try {
                    C3218ck1.p.getClass();
                    n(new C3218ck1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C3218ck1 c3218ck2 = (C3218ck1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c3218ck1 = c3218ck2;
                        if (c3218ck1 != null) {
                            n(c3218ck1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3218ck1 != null) {
                    n(c3218ck1);
                }
                throw th;
            }
        }
    }

    static {
        C3218ck1 c3218ck1 = new C3218ck1(0);
        o = c3218ck1;
        List list = Collections.EMPTY_LIST;
        c3218ck1.h = list;
        c3218ck1.i = list;
        c3218ck1.j = list;
        c3218ck1.k = C4945kk1.k;
        c3218ck1.l = C5578nk1.i;
    }

    public C3218ck1() {
        throw null;
    }

    public C3218ck1(b bVar) {
        super(bVar);
        this.m = (byte) -1;
        this.n = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iD += IE.d(3, this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iD += IE.d(4, this.i.get(i3));
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            iD += IE.d(5, this.j.get(i4));
        }
        if ((this.g & 1) == 1) {
            iD += IE.d(30, this.k);
        }
        if ((this.g & 2) == 2) {
            iD += IE.d(32, this.l);
        }
        int size = this.e.size() + j() + iD;
        this.n = size;
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
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).d()) {
                this.m = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!this.i.get(i2).d()) {
                this.m = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            if (!this.j.get(i3).d()) {
                this.m = (byte) 0;
                return false;
            }
        }
        if ((this.g & 1) == 1 && !this.k.d()) {
            this.m = (byte) 0;
            return false;
        }
        if (i()) {
            this.m = (byte) 1;
            return true;
        }
        this.m = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return o;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        AbstractC0673Bk0.c.a aVar = new AbstractC0673Bk0.c.a(this);
        for (int i = 0; i < this.h.size(); i++) {
            ie.o(3, this.h.get(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ie.o(4, this.i.get(i2));
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            ie.o(5, this.j.get(i3));
        }
        if ((this.g & 1) == 1) {
            ie.o(30, this.k);
        }
        if ((this.g & 2) == 2) {
            ie.o(32, this.l);
        }
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public C3218ck1(int i) {
        this.m = (byte) -1;
        this.n = -1;
        this.e = AbstractC1724Ow.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C3218ck1(EE ee, C1578Na0 c1578Na0) {
        this.m = (byte) -1;
        this.n = -1;
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
        this.j = list;
        this.k = C4945kk1.k;
        this.l = C5578nk1.i;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.h = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.h.add((C2575Zj1) ee.g(C2575Zj1.z, c1578Na0));
                        } else if (iN == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.i = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.i.add((C3637ek1) ee.g(C3637ek1.z, c1578Na0));
                        } else if (iN != 42) {
                            C5578nk1.b bVar2 = null;
                            C4945kk1.b bVarI = null;
                            if (iN == 242) {
                                if ((this.g & 1) == 1) {
                                    C4945kk1 c4945kk1 = this.k;
                                    c4945kk1.getClass();
                                    bVarI = C4945kk1.i(c4945kk1);
                                }
                                C4945kk1 c4945kk2 = (C4945kk1) ee.g(C4945kk1.l, c1578Na0);
                                this.k = c4945kk2;
                                if (bVarI != null) {
                                    bVarI.m(c4945kk2);
                                    this.k = bVarI.l();
                                }
                                this.g |= 1;
                            } else if (iN != 258) {
                                if (!n(ee, ieJ, c1578Na0, iN)) {
                                }
                            } else {
                                if ((this.g & 2) == 2) {
                                    C5578nk1 c5578nk1 = this.l;
                                    c5578nk1.getClass();
                                    bVar2 = new C5578nk1.b();
                                    bVar2.m(c5578nk1);
                                }
                                C5578nk1 c5578nk2 = (C5578nk1) ee.g(C5578nk1.j, c1578Na0);
                                this.l = c5578nk2;
                                if (bVar2 != null) {
                                    bVar2.m(c5578nk2);
                                    this.l = bVar2.l();
                                }
                                this.g |= 2;
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.j = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.j.add((C4476ik1) ee.g(C4476ik1.t, c1578Na0));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
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
