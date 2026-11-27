package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: fk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3847fk1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C3847fk1 i;
    public static final a j = new a();
    public final AbstractC1724Ow d;
    public List<c> e;
    public byte g;
    public int h;

    /* JADX INFO: renamed from: fk1$a */
    public static class a extends Q0<C3847fk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C3847fk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: fk1$b */
    public static final class b extends AbstractC0673Bk0.a<C3847fk1, b> implements KZ0 {
        public int e;
        public List<c> g = Collections.EMPTY_LIST;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C3847fk1 c3847fk1L = l();
            if (c3847fk1L.d()) {
                return c3847fk1L;
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
            m((C3847fk1) abstractC0673Bk0);
            return this;
        }

        public final C3847fk1 l() {
            C3847fk1 c3847fk1 = new C3847fk1(this);
            if ((this.e & 1) == 1) {
                this.g = Collections.unmodifiableList(this.g);
                this.e &= -2;
            }
            c3847fk1.e = this.g;
            return c3847fk1;
        }

        public final void m(C3847fk1 c3847fk1) {
            if (c3847fk1 == C3847fk1.i) {
                return;
            }
            if (!c3847fk1.e.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = c3847fk1.e;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.g = new ArrayList(this.g);
                        this.e |= 1;
                    }
                    this.g.addAll(c3847fk1.e);
                }
            }
            this.d = this.d.b(c3847fk1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C3847fk1 c3847fk1 = null;
            try {
                try {
                    C3847fk1.j.getClass();
                    m(new C3847fk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C3847fk1 c3847fk2 = (C3847fk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c3847fk1 = c3847fk2;
                        if (c3847fk1 != null) {
                            m(c3847fk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3847fk1 != null) {
                    m(c3847fk1);
                }
                throw th;
            }
        }
    }

    static {
        C3847fk1 c3847fk1 = new C3847fk1();
        i = c3847fk1;
        c3847fk1.e = Collections.EMPTY_LIST;
    }

    public C3847fk1(b bVar) {
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

    /* JADX INFO: renamed from: fk1$c */
    public static final class c extends AbstractC0673Bk0 implements KZ0 {
        public static final c l;
        public static final a m = new a();
        public final AbstractC1724Ow d;
        public int e;
        public int g;
        public int h;
        public EnumC0352c i;
        public byte j;
        public int k;

        /* JADX INFO: renamed from: fk1$c$a */
        public static class a extends Q0<c> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new c(ee);
            }
        }

        /* JADX INFO: renamed from: fk1$c$b */
        public static final class b extends AbstractC0673Bk0.a<c, b> implements KZ0 {
            public int e;
            public int h;
            public int g = -1;
            public EnumC0352c i = EnumC0352c.PACKAGE;

            @Override // H0.a, HZ0.a
            public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                n(ee, c1578Na0);
                return this;
            }

            @Override // HZ0.a
            public final HZ0 build() {
                c cVarL = l();
                if (cVarL.d()) {
                    return cVarL;
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
                m((c) abstractC0673Bk0);
                return this;
            }

            public final c l() {
                c cVar = new c(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                cVar.g = this.g;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.h = this.h;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.i = this.i;
                cVar.e = i2;
                return cVar;
            }

            public final void m(c cVar) {
                if (cVar == c.l) {
                    return;
                }
                int i = cVar.e;
                if ((i & 1) == 1) {
                    int i2 = cVar.g;
                    this.e = 1 | this.e;
                    this.g = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = cVar.h;
                    this.e = 2 | this.e;
                    this.h = i3;
                }
                if ((i & 4) == 4) {
                    EnumC0352c enumC0352c = cVar.i;
                    enumC0352c.getClass();
                    this.e = 4 | this.e;
                    this.i = enumC0352c;
                }
                this.d = this.d.b(cVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c.m.getClass();
                        m(new c(ee));
                    } catch (C7144vC0 e) {
                        c cVar2 = (c) e.d;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            cVar = cVar2;
                            if (cVar != null) {
                                m(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cVar != null) {
                        m(cVar);
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: fk1$c$c, reason: collision with other inner class name */
        public enum EnumC0352c implements YB0.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);

            public final int d;

            EnumC0352c(int i2) {
                this.d = i2;
            }

            @Override // YB0.a
            public final int getNumber() {
                return this.d;
            }
        }

        static {
            c cVar = new c();
            l = cVar;
            cVar.g = -1;
            cVar.h = 0;
            cVar.i = EnumC0352c.PACKAGE;
        }

        public c(b bVar) {
            this.j = (byte) -1;
            this.k = -1;
            this.d = bVar.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.k;
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
            int size = this.d.size() + iB;
            this.k = size;
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
            byte b2 = this.j;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.e & 2) == 2) {
                this.j = (byte) 1;
                return true;
            }
            this.j = (byte) 0;
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
                ie.m(1, this.g);
            }
            if ((this.e & 2) == 2) {
                ie.m(2, this.h);
            }
            if ((this.e & 4) == 4) {
                ie.l(3, this.i.d);
            }
            ie.r(this.d);
        }

        public c() {
            this.j = (byte) -1;
            this.k = -1;
            this.d = AbstractC1724Ow.d;
        }

        public c(EE ee) {
            EnumC0352c enumC0352c;
            this.j = (byte) -1;
            this.k = -1;
            this.g = -1;
            boolean z = false;
            this.h = 0;
            EnumC0352c enumC0352c2 = EnumC0352c.PACKAGE;
            this.i = enumC0352c2;
            AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
            IE ieJ = IE.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.e |= 1;
                                this.g = ee.k();
                            } else if (iN == 16) {
                                this.e |= 2;
                                this.h = ee.k();
                            } else if (iN != 24) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                int iK = ee.k();
                                if (iK == 0) {
                                    enumC0352c = EnumC0352c.CLASS;
                                } else if (iK != 1) {
                                    enumC0352c = iK != 2 ? null : EnumC0352c.LOCAL;
                                } else {
                                    enumC0352c = enumC0352c2;
                                }
                                if (enumC0352c == null) {
                                    ieJ.v(iN);
                                    ieJ.v(iK);
                                } else {
                                    this.e |= 4;
                                    this.i = enumC0352c;
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
                    try {
                        ieJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.d = bVar.g();
                    }
                    throw th;
                }
            }
            try {
                ieJ.i();
            } catch (IOException unused2) {
            } finally {
                this.d = bVar.g();
            }
        }
    }

    public C3847fk1() {
        this.g = (byte) -1;
        this.h = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C3847fk1(EE ee, C1578Na0 c1578Na0) {
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
                            this.e.add((c) ee.g(c.m, c1578Na0));
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
