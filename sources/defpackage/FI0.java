package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FI0 {
    public static final AbstractC0673Bk0.e<C2155Uj1, b> a;
    public static final AbstractC0673Bk0.e<C2575Zj1, b> b;
    public static final AbstractC0673Bk0.e<C2575Zj1, Integer> c;
    public static final AbstractC0673Bk0.e<C3637ek1, c> d;
    public static final AbstractC0673Bk0.e<C3637ek1, Integer> e;
    public static final AbstractC0673Bk0.e<C4267hk1, List<C1999Sj1>> f;
    public static final AbstractC0673Bk0.e<C4267hk1, Boolean> g;
    public static final AbstractC0673Bk0.e<C4735jk1, List<C1999Sj1>> h;
    public static final AbstractC0673Bk0.e<C2077Tj1, Integer> i;
    public static final AbstractC0673Bk0.e<C2077Tj1, List<C3637ek1>> j;
    public static final AbstractC0673Bk0.e<C2077Tj1, Integer> k;
    public static final AbstractC0673Bk0.e<C2077Tj1, Integer> l;
    public static final AbstractC0673Bk0.e<C3218ck1, Integer> m;
    public static final AbstractC0673Bk0.e<C3218ck1, List<C3637ek1>> n;

    static {
        C2155Uj1 c2155Uj1 = C2155Uj1.m;
        b bVar = b.k;
        EnumC7254vj2.c cVar = EnumC7254vj2.j;
        a = AbstractC0673Bk0.f(c2155Uj1, bVar, bVar, 100, cVar, b.class);
        C2575Zj1 c2575Zj1 = C2575Zj1.y;
        b = AbstractC0673Bk0.f(c2575Zj1, bVar, bVar, 100, cVar, b.class);
        EnumC7254vj2 enumC7254vj2 = EnumC7254vj2.g;
        c = AbstractC0673Bk0.f(c2575Zj1, 0, null, 101, enumC7254vj2, Integer.class);
        C3637ek1 c3637ek1 = C3637ek1.y;
        c cVar2 = c.n;
        d = AbstractC0673Bk0.f(c3637ek1, cVar2, cVar2, 100, cVar, c.class);
        e = AbstractC0673Bk0.f(c3637ek1, 0, null, 101, enumC7254vj2, Integer.class);
        C4267hk1 c4267hk1 = C4267hk1.x;
        C1999Sj1 c1999Sj1 = C1999Sj1.k;
        f = AbstractC0673Bk0.c(c4267hk1, c1999Sj1, 100, cVar, C1999Sj1.class);
        g = AbstractC0673Bk0.f(c4267hk1, Boolean.FALSE, null, 101, EnumC7254vj2.h, Boolean.class);
        h = AbstractC0673Bk0.c(C4735jk1.q, c1999Sj1, 100, cVar, C1999Sj1.class);
        C2077Tj1 c2077Tj1 = C2077Tj1.N;
        i = AbstractC0673Bk0.f(c2077Tj1, 0, null, 101, enumC7254vj2, Integer.class);
        j = AbstractC0673Bk0.c(c2077Tj1, c3637ek1, 102, cVar, C3637ek1.class);
        k = AbstractC0673Bk0.f(c2077Tj1, 0, null, 103, enumC7254vj2, Integer.class);
        l = AbstractC0673Bk0.f(c2077Tj1, 0, null, 104, enumC7254vj2, Integer.class);
        C3218ck1 c3218ck1 = C3218ck1.o;
        m = AbstractC0673Bk0.f(c3218ck1, 0, null, 101, enumC7254vj2, Integer.class);
        n = AbstractC0673Bk0.c(c3218ck1, c3637ek1, 102, cVar, C3637ek1.class);
    }

    public static final class a extends AbstractC0673Bk0 implements KZ0 {
        public static final a k;
        public static final C0031a l = new C0031a();
        public final AbstractC1724Ow d;
        public int e;
        public int g;
        public int h;
        public byte i;
        public int j;

        /* JADX INFO: renamed from: FI0$a$a, reason: collision with other inner class name */
        public static class C0031a extends Q0<a> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new a(ee);
            }
        }

        public static final class b extends AbstractC0673Bk0.a<a, b> implements KZ0 {
            public int e;
            public int g;
            public int h;

            @Override // H0.a, HZ0.a
            public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                n(ee, c1578Na0);
                return this;
            }

            @Override // HZ0.a
            public final HZ0 build() {
                a aVarL = l();
                if (aVarL.d()) {
                    return aVarL;
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
                m((a) abstractC0673Bk0);
                return this;
            }

            public final a l() {
                a aVar = new a(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                aVar.g = this.g;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                aVar.h = this.h;
                aVar.e = i2;
                return aVar;
            }

            public final void m(a aVar) {
                if (aVar == a.k) {
                    return;
                }
                int i = aVar.e;
                if ((i & 1) == 1) {
                    int i2 = aVar.g;
                    this.e = 1 | this.e;
                    this.g = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = aVar.h;
                    this.e = 2 | this.e;
                    this.h = i3;
                }
                this.d = this.d.b(aVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                a aVar = null;
                try {
                    try {
                        a.l.getClass();
                        m(new a(ee));
                    } catch (C7144vC0 e) {
                        a aVar2 = (a) e.d;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            aVar = aVar2;
                            if (aVar != null) {
                                m(aVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (aVar != null) {
                        m(aVar);
                    }
                    throw th;
                }
            }
        }

        static {
            a aVar = new a();
            k = aVar;
            aVar.g = 0;
            aVar.h = 0;
        }

        public a(b bVar) {
            this.i = (byte) -1;
            this.j = -1;
            this.d = bVar.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
            if ((this.e & 2) == 2) {
                iB += IE.b(2, this.h);
            }
            int size = this.d.size() + iB;
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
            if ((this.e & 1) == 1) {
                ie.m(1, this.g);
            }
            if ((this.e & 2) == 2) {
                ie.m(2, this.h);
            }
            ie.r(this.d);
        }

        public a() {
            this.i = (byte) -1;
            this.j = -1;
            this.d = AbstractC1724Ow.d;
        }

        public a(EE ee) {
            this.i = (byte) -1;
            this.j = -1;
            boolean z = false;
            this.g = 0;
            this.h = 0;
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
                            } else if (iN != 16) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                this.e |= 2;
                                this.h = ee.k();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
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
            try {
                ieJ.i();
            } catch (IOException unused2) {
            } finally {
                this.d = bVar.g();
            }
        }
    }

    public static final class b extends AbstractC0673Bk0 implements KZ0 {
        public static final b k;
        public static final a l = new a();
        public final AbstractC1724Ow d;
        public int e;
        public int g;
        public int h;
        public byte i;
        public int j;

        public static class a extends Q0<b> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new b(ee);
            }
        }

        /* JADX INFO: renamed from: FI0$b$b, reason: collision with other inner class name */
        public static final class C0032b extends AbstractC0673Bk0.a<b, C0032b> implements KZ0 {
            public int e;
            public int g;
            public int h;

            @Override // H0.a, HZ0.a
            public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                n(ee, c1578Na0);
                return this;
            }

            @Override // HZ0.a
            public final HZ0 build() {
                b bVarL = l();
                if (bVarL.d()) {
                    return bVarL;
                }
                throw new C82();
            }

            @Override // defpackage.AbstractC0673Bk0.a
            public final Object clone() {
                C0032b c0032b = new C0032b();
                c0032b.m(l());
                return c0032b;
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
                C0032b c0032b = new C0032b();
                c0032b.m(l());
                return c0032b;
            }

            @Override // defpackage.AbstractC0673Bk0.a
            public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
                m((b) abstractC0673Bk0);
                return this;
            }

            public final b l() {
                b bVar = new b(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.g = this.g;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.h = this.h;
                bVar.e = i2;
                return bVar;
            }

            public final void m(b bVar) {
                if (bVar == b.k) {
                    return;
                }
                int i = bVar.e;
                if ((i & 1) == 1) {
                    int i2 = bVar.g;
                    this.e = 1 | this.e;
                    this.g = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = bVar.h;
                    this.e = 2 | this.e;
                    this.h = i3;
                }
                this.d = this.d.b(bVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b.l.getClass();
                        m(new b(ee));
                    } catch (C7144vC0 e) {
                        b bVar2 = (b) e.d;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                m(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        m(bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            b bVar = new b();
            k = bVar;
            bVar.g = 0;
            bVar.h = 0;
        }

        public b(C0032b c0032b) {
            this.i = (byte) -1;
            this.j = -1;
            this.d = c0032b.d;
        }

        public static C0032b i(b bVar) {
            C0032b c0032b = new C0032b();
            c0032b.m(bVar);
            return c0032b;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
            if ((this.e & 2) == 2) {
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
            byte b = this.i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // defpackage.HZ0
        public final HZ0.a g() {
            return new C0032b();
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
            ie.r(this.d);
        }

        public b() {
            this.i = (byte) -1;
            this.j = -1;
            this.d = AbstractC1724Ow.d;
        }

        public b(EE ee) {
            this.i = (byte) -1;
            this.j = -1;
            boolean z = false;
            this.g = 0;
            this.h = 0;
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
                            } else if (iN != 16) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                this.e |= 2;
                                this.h = ee.k();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
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
            try {
                ieJ.i();
            } catch (IOException unused2) {
            } finally {
                this.d = bVar.g();
            }
        }
    }

    public static final class c extends AbstractC0673Bk0 implements KZ0 {
        public static final c n;
        public static final a o = new a();
        public final AbstractC1724Ow d;
        public int e;
        public a g;
        public b h;
        public b i;
        public b j;
        public b k;
        public byte l;
        public int m;

        public static class a extends Q0<c> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new c(ee, c1578Na0);
            }
        }

        public static final class b extends AbstractC0673Bk0.a<c, b> implements KZ0 {
            public int e;
            public a g = a.k;
            public b h;
            public b i;
            public b j;
            public b k;

            public b() {
                b bVar = b.k;
                this.h = bVar;
                this.i = bVar;
                this.j = bVar;
                this.k = bVar;
            }

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
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                cVar.j = this.j;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                cVar.k = this.k;
                cVar.e = i2;
                return cVar;
            }

            public final void m(c cVar) {
                b bVar;
                b bVar2;
                b bVar3;
                b bVar4;
                a aVar;
                if (cVar == c.n) {
                    return;
                }
                if ((cVar.e & 1) == 1) {
                    a aVar2 = cVar.g;
                    if ((this.e & 1) != 1 || (aVar = this.g) == a.k) {
                        this.g = aVar2;
                    } else {
                        a.b bVar5 = new a.b();
                        bVar5.m(aVar);
                        bVar5.m(aVar2);
                        this.g = bVar5.l();
                    }
                    this.e |= 1;
                }
                if ((cVar.e & 2) == 2) {
                    b bVar6 = cVar.h;
                    if ((this.e & 2) != 2 || (bVar4 = this.h) == b.k) {
                        this.h = bVar6;
                    } else {
                        b.C0032b c0032bI = b.i(bVar4);
                        c0032bI.m(bVar6);
                        this.h = c0032bI.l();
                    }
                    this.e |= 2;
                }
                if ((cVar.e & 4) == 4) {
                    b bVar7 = cVar.i;
                    if ((this.e & 4) != 4 || (bVar3 = this.i) == b.k) {
                        this.i = bVar7;
                    } else {
                        b.C0032b c0032bI2 = b.i(bVar3);
                        c0032bI2.m(bVar7);
                        this.i = c0032bI2.l();
                    }
                    this.e |= 4;
                }
                if ((cVar.e & 8) == 8) {
                    b bVar8 = cVar.j;
                    if ((this.e & 8) != 8 || (bVar2 = this.j) == b.k) {
                        this.j = bVar8;
                    } else {
                        b.C0032b c0032bI3 = b.i(bVar2);
                        c0032bI3.m(bVar8);
                        this.j = c0032bI3.l();
                    }
                    this.e |= 8;
                }
                if ((cVar.e & 16) == 16) {
                    b bVar9 = cVar.k;
                    if ((this.e & 16) != 16 || (bVar = this.k) == b.k) {
                        this.k = bVar9;
                    } else {
                        b.C0032b c0032bI4 = b.i(bVar);
                        c0032bI4.m(bVar9);
                        this.k = c0032bI4.l();
                    }
                    this.e |= 16;
                }
                this.d = this.d.b(cVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c.o.getClass();
                        m(new c(ee, c1578Na0));
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

        static {
            c cVar = new c();
            n = cVar;
            cVar.g = a.k;
            b bVar = b.k;
            cVar.h = bVar;
            cVar.i = bVar;
            cVar.j = bVar;
            cVar.k = bVar;
        }

        public c(b bVar) {
            this.l = (byte) -1;
            this.m = -1;
            this.d = bVar.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.m;
            if (i != -1) {
                return i;
            }
            int iD = (this.e & 1) == 1 ? IE.d(1, this.g) : 0;
            if ((this.e & 2) == 2) {
                iD += IE.d(2, this.h);
            }
            if ((this.e & 4) == 4) {
                iD += IE.d(3, this.i);
            }
            if ((this.e & 8) == 8) {
                iD += IE.d(4, this.j);
            }
            if ((this.e & 16) == 16) {
                iD += IE.d(5, this.k);
            }
            int size = this.d.size() + iD;
            this.m = size;
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
            byte b2 = this.l;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.l = (byte) 1;
            return true;
        }

        @Override // defpackage.HZ0
        public final HZ0.a g() {
            return new b();
        }

        @Override // defpackage.HZ0
        public final void h(IE ie) {
            a();
            if ((this.e & 1) == 1) {
                ie.o(1, this.g);
            }
            if ((this.e & 2) == 2) {
                ie.o(2, this.h);
            }
            if ((this.e & 4) == 4) {
                ie.o(3, this.i);
            }
            if ((this.e & 8) == 8) {
                ie.o(4, this.j);
            }
            if ((this.e & 16) == 16) {
                ie.o(5, this.k);
            }
            ie.r(this.d);
        }

        public c() {
            this.l = (byte) -1;
            this.m = -1;
            this.d = AbstractC1724Ow.d;
        }

        public c(EE ee, C1578Na0 c1578Na0) {
            this.l = (byte) -1;
            this.m = -1;
            this.g = a.k;
            b bVar = b.k;
            this.h = bVar;
            this.i = bVar;
            this.j = bVar;
            this.k = bVar;
            AbstractC1724Ow.b bVar2 = new AbstractC1724Ow.b();
            IE ieJ = IE.j(bVar2, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            b.C0032b c0032bI = null;
                            a.b bVar3 = null;
                            b.C0032b c0032bI2 = null;
                            b.C0032b c0032bI3 = null;
                            b.C0032b c0032bI4 = null;
                            if (iN == 10) {
                                if ((this.e & 1) == 1) {
                                    a aVar = this.g;
                                    aVar.getClass();
                                    bVar3 = new a.b();
                                    bVar3.m(aVar);
                                }
                                a aVar2 = (a) ee.g(a.l, c1578Na0);
                                this.g = aVar2;
                                if (bVar3 != null) {
                                    bVar3.m(aVar2);
                                    this.g = bVar3.l();
                                }
                                this.e |= 1;
                            } else if (iN == 18) {
                                if ((this.e & 2) == 2) {
                                    b bVar4 = this.h;
                                    bVar4.getClass();
                                    c0032bI2 = b.i(bVar4);
                                }
                                b bVar5 = (b) ee.g(b.l, c1578Na0);
                                this.h = bVar5;
                                if (c0032bI2 != null) {
                                    c0032bI2.m(bVar5);
                                    this.h = c0032bI2.l();
                                }
                                this.e |= 2;
                            } else if (iN == 26) {
                                if ((this.e & 4) == 4) {
                                    b bVar6 = this.i;
                                    bVar6.getClass();
                                    c0032bI3 = b.i(bVar6);
                                }
                                b bVar7 = (b) ee.g(b.l, c1578Na0);
                                this.i = bVar7;
                                if (c0032bI3 != null) {
                                    c0032bI3.m(bVar7);
                                    this.i = c0032bI3.l();
                                }
                                this.e |= 4;
                            } else if (iN == 34) {
                                if ((this.e & 8) == 8) {
                                    b bVar8 = this.j;
                                    bVar8.getClass();
                                    c0032bI4 = b.i(bVar8);
                                }
                                b bVar9 = (b) ee.g(b.l, c1578Na0);
                                this.j = bVar9;
                                if (c0032bI4 != null) {
                                    c0032bI4.m(bVar9);
                                    this.j = c0032bI4.l();
                                }
                                this.e |= 8;
                            } else if (iN != 42) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                if ((this.e & 16) == 16) {
                                    b bVar10 = this.k;
                                    bVar10.getClass();
                                    c0032bI = b.i(bVar10);
                                }
                                b bVar11 = (b) ee.g(b.l, c1578Na0);
                                this.k = bVar11;
                                if (c0032bI != null) {
                                    c0032bI.m(bVar11);
                                    this.k = c0032bI.l();
                                }
                                this.e |= 16;
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
                        this.d = bVar2.g();
                    }
                    throw th;
                }
            }
            try {
                ieJ.i();
            } catch (IOException unused2) {
            } finally {
                this.d = bVar2.g();
            }
        }
    }

    public static final class d extends AbstractC0673Bk0 implements KZ0 {
        public static final d k;
        public static final a l = new a();
        public final AbstractC1724Ow d;
        public List<c> e;
        public List<Integer> g;
        public int h;
        public byte i;
        public int j;

        public static class a extends Q0<d> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new d(ee, c1578Na0);
            }
        }

        public static final class b extends AbstractC0673Bk0.a<d, b> implements KZ0 {
            public int e;
            public List<c> g;
            public List<Integer> h;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.g = list;
                this.h = list;
            }

            @Override // H0.a, HZ0.a
            public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                n(ee, c1578Na0);
                return this;
            }

            @Override // HZ0.a
            public final HZ0 build() {
                d dVarL = l();
                if (dVarL.d()) {
                    return dVarL;
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
                m((d) abstractC0673Bk0);
                return this;
            }

            public final d l() {
                d dVar = new d(this);
                if ((this.e & 1) == 1) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -2;
                }
                dVar.e = this.g;
                if ((this.e & 2) == 2) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.e &= -3;
                }
                dVar.g = this.h;
                return dVar;
            }

            public final void m(d dVar) {
                if (dVar == d.k) {
                    return;
                }
                if (!dVar.e.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = dVar.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.g = new ArrayList(this.g);
                            this.e |= 1;
                        }
                        this.g.addAll(dVar.e);
                    }
                }
                if (!dVar.g.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = dVar.g;
                        this.e &= -3;
                    } else {
                        if ((this.e & 2) != 2) {
                            this.h = new ArrayList(this.h);
                            this.e |= 2;
                        }
                        this.h.addAll(dVar.g);
                    }
                }
                this.d = this.d.b(dVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                d dVar = null;
                try {
                    try {
                        d.l.getClass();
                        m(new d(ee, c1578Na0));
                    } catch (C7144vC0 e) {
                        d dVar2 = (d) e.d;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            dVar = dVar2;
                            if (dVar != null) {
                                m(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dVar != null) {
                        m(dVar);
                    }
                    throw th;
                }
            }
        }

        static {
            d dVar = new d();
            k = dVar;
            List list = Collections.EMPTY_LIST;
            dVar.e = list;
            dVar.g = list;
        }

        public d(b bVar) {
            this.h = -1;
            this.i = (byte) -1;
            this.j = -1;
            this.d = bVar.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iD = 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iD += IE.d(1, this.e.get(i2));
            }
            int iC = 0;
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                iC += IE.c(this.g.get(i3).intValue());
            }
            int iC2 = iD + iC;
            if (!this.g.isEmpty()) {
                iC2 = iC2 + 1 + IE.c(iC);
            }
            this.h = iC;
            int size = this.d.size() + iC2;
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
            for (int i = 0; i < this.e.size(); i++) {
                ie.o(1, this.e.get(i));
            }
            if (this.g.size() > 0) {
                ie.v(42);
                ie.v(this.h);
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                ie.n(this.g.get(i2).intValue());
            }
            ie.r(this.d);
        }

        public static final class c extends AbstractC0673Bk0 implements KZ0 {
            public static final c q;
            public static final a r = new a();
            public final AbstractC1724Ow d;
            public int e;
            public int g;
            public int h;
            public Object i;
            public EnumC0033c j;
            public List<Integer> k;
            public int l;
            public List<Integer> m;
            public int n;
            public byte o;
            public int p;

            public static class a extends Q0<c> {
                @Override // defpackage.InterfaceC6176qc1
                public final Object a(EE ee, C1578Na0 c1578Na0) {
                    return new c(ee);
                }
            }

            public static final class b extends AbstractC0673Bk0.a<c, b> implements KZ0 {
                public int e;
                public int h;
                public List<Integer> k;
                public List<Integer> l;
                public int g = 1;
                public Object i = "";
                public EnumC0033c j = EnumC0033c.NONE;

                public b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.k = list;
                    this.l = list;
                }

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
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.j = this.j;
                    if ((i & 16) == 16) {
                        this.k = Collections.unmodifiableList(this.k);
                        this.e &= -17;
                    }
                    cVar.k = this.k;
                    if ((this.e & 32) == 32) {
                        this.l = Collections.unmodifiableList(this.l);
                        this.e &= -33;
                    }
                    cVar.m = this.l;
                    cVar.e = i2;
                    return cVar;
                }

                public final void m(c cVar) {
                    if (cVar == c.q) {
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
                        this.e |= 4;
                        this.i = cVar.i;
                    }
                    if ((i & 8) == 8) {
                        EnumC0033c enumC0033c = cVar.j;
                        enumC0033c.getClass();
                        this.e = 8 | this.e;
                        this.j = enumC0033c;
                    }
                    if (!cVar.k.isEmpty()) {
                        if (this.k.isEmpty()) {
                            this.k = cVar.k;
                            this.e &= -17;
                        } else {
                            if ((this.e & 16) != 16) {
                                this.k = new ArrayList(this.k);
                                this.e |= 16;
                            }
                            this.k.addAll(cVar.k);
                        }
                    }
                    if (!cVar.m.isEmpty()) {
                        if (this.l.isEmpty()) {
                            this.l = cVar.m;
                            this.e &= -33;
                        } else {
                            if ((this.e & 32) != 32) {
                                this.l = new ArrayList(this.l);
                                this.e |= 32;
                            }
                            this.l.addAll(cVar.m);
                        }
                    }
                    this.d = this.d.b(cVar.d);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001b  */
                public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c.r.getClass();
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

            /* JADX INFO: renamed from: FI0$d$c$c, reason: collision with other inner class name */
            public enum EnumC0033c implements YB0.a {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                public final int d;

                EnumC0033c(int i2) {
                    this.d = i2;
                }

                @Override // YB0.a
                public final int getNumber() {
                    return this.d;
                }
            }

            static {
                c cVar = new c();
                q = cVar;
                cVar.g = 1;
                cVar.h = 0;
                cVar.i = "";
                cVar.j = EnumC0033c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                cVar.k = list;
                cVar.m = list;
            }

            public c(b bVar) {
                this.l = -1;
                this.n = -1;
                this.o = (byte) -1;
                this.p = -1;
                this.d = bVar.d;
            }

            @Override // defpackage.HZ0
            public final int a() {
                AbstractC1724Ow tq0;
                int i = this.p;
                if (i != -1) {
                    return i;
                }
                int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
                if ((this.e & 2) == 2) {
                    iB += IE.b(2, this.h);
                }
                if ((this.e & 8) == 8) {
                    iB += IE.a(3, this.j.d);
                }
                int iC = 0;
                for (int i2 = 0; i2 < this.k.size(); i2++) {
                    iC += IE.c(this.k.get(i2).intValue());
                }
                int iC2 = iB + iC;
                if (!this.k.isEmpty()) {
                    iC2 = iC2 + 1 + IE.c(iC);
                }
                this.l = iC;
                int iC3 = 0;
                for (int i3 = 0; i3 < this.m.size(); i3++) {
                    iC3 += IE.c(this.m.get(i3).intValue());
                }
                int size = iC2 + iC3;
                if (!this.m.isEmpty()) {
                    size = size + 1 + IE.c(iC3);
                }
                this.n = iC3;
                if ((this.e & 4) == 4) {
                    Object obj = this.i;
                    if (obj instanceof String) {
                        try {
                            tq0 = new TQ0(((String) obj).getBytes("UTF-8"));
                            this.i = tq0;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        tq0 = (AbstractC1724Ow) obj;
                    }
                    size += tq0.size() + IE.f(tq0.size()) + IE.h(6);
                }
                int size2 = this.d.size() + size;
                this.p = size2;
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
                byte b2 = this.o;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.o = (byte) 1;
                return true;
            }

            @Override // defpackage.HZ0
            public final HZ0.a g() {
                return new b();
            }

            @Override // defpackage.HZ0
            public final void h(IE ie) {
                AbstractC1724Ow tq0;
                a();
                if ((this.e & 1) == 1) {
                    ie.m(1, this.g);
                }
                if ((this.e & 2) == 2) {
                    ie.m(2, this.h);
                }
                if ((this.e & 8) == 8) {
                    ie.l(3, this.j.d);
                }
                if (this.k.size() > 0) {
                    ie.v(34);
                    ie.v(this.l);
                }
                for (int i = 0; i < this.k.size(); i++) {
                    ie.n(this.k.get(i).intValue());
                }
                if (this.m.size() > 0) {
                    ie.v(42);
                    ie.v(this.n);
                }
                for (int i2 = 0; i2 < this.m.size(); i2++) {
                    ie.n(this.m.get(i2).intValue());
                }
                if ((this.e & 4) == 4) {
                    Object obj = this.i;
                    if (obj instanceof String) {
                        try {
                            tq0 = new TQ0(((String) obj).getBytes("UTF-8"));
                            this.i = tq0;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        tq0 = (AbstractC1724Ow) obj;
                    }
                    ie.x(6, 2);
                    ie.v(tq0.size());
                    ie.r(tq0);
                }
                ie.r(this.d);
            }

            public c() {
                this.l = -1;
                this.n = -1;
                this.o = (byte) -1;
                this.p = -1;
                this.d = AbstractC1724Ow.d;
            }

            public c(EE ee) {
                EnumC0033c enumC0033c;
                this.l = -1;
                this.n = -1;
                this.o = (byte) -1;
                this.p = -1;
                this.g = 1;
                boolean z = false;
                this.h = 0;
                this.i = "";
                EnumC0033c enumC0033c2 = EnumC0033c.NONE;
                this.j = enumC0033c2;
                List<Integer> list = Collections.EMPTY_LIST;
                this.k = list;
                this.m = list;
                AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
                IE ieJ = IE.j(bVar, 1);
                int i = 0;
                while (!z) {
                    try {
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
                                    } else if (iN == 24) {
                                        int iK = ee.k();
                                        if (iK == 0) {
                                            enumC0033c = enumC0033c2;
                                        } else if (iK != 1) {
                                            enumC0033c = iK != 2 ? null : EnumC0033c.DESC_TO_CLASS_ID;
                                        } else {
                                            enumC0033c = EnumC0033c.INTERNAL_TO_CLASS_ID;
                                        }
                                        if (enumC0033c == null) {
                                            ieJ.v(iN);
                                            ieJ.v(iK);
                                        } else {
                                            this.e |= 8;
                                            this.j = enumC0033c;
                                        }
                                    } else if (iN == 32) {
                                        if ((i & 16) != 16) {
                                            this.k = new ArrayList();
                                            i |= 16;
                                        }
                                        this.k.add(Integer.valueOf(ee.k()));
                                    } else if (iN == 34) {
                                        int iD = ee.d(ee.k());
                                        if ((i & 16) != 16 && ee.b() > 0) {
                                            this.k = new ArrayList();
                                            i |= 16;
                                        }
                                        while (ee.b() > 0) {
                                            this.k.add(Integer.valueOf(ee.k()));
                                        }
                                        ee.c(iD);
                                    } else if (iN == 40) {
                                        if ((i & 32) != 32) {
                                            this.m = new ArrayList();
                                            i |= 32;
                                        }
                                        this.m.add(Integer.valueOf(ee.k()));
                                    } else if (iN == 42) {
                                        int iD2 = ee.d(ee.k());
                                        if ((i & 32) != 32 && ee.b() > 0) {
                                            this.m = new ArrayList();
                                            i |= 32;
                                        }
                                        while (ee.b() > 0) {
                                            this.m.add(Integer.valueOf(ee.k()));
                                        }
                                        ee.c(iD2);
                                    } else if (iN != 50) {
                                        if (!ee.q(iN, ieJ)) {
                                        }
                                    } else {
                                        TQ0 tq0E = ee.e();
                                        this.e |= 4;
                                        this.i = tq0E;
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
                        if ((i & 16) == 16) {
                            this.k = Collections.unmodifiableList(this.k);
                        }
                        if ((i & 32) == 32) {
                            this.m = Collections.unmodifiableList(this.m);
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
                if ((i & 16) == 16) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                try {
                    ieJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.d = bVar.g();
                }
            }
        }

        public d() {
            this.h = -1;
            this.i = (byte) -1;
            this.j = -1;
            this.d = AbstractC1724Ow.d;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public d(EE ee, C1578Na0 c1578Na0) {
            this.h = -1;
            this.i = (byte) -1;
            this.j = -1;
            List list = Collections.EMPTY_LIST;
            this.e = list;
            this.g = list;
            AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
            IE ieJ = IE.j(bVar, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if ((i & 1) != 1) {
                                    this.e = new ArrayList();
                                    i |= 1;
                                }
                                this.e.add((c) ee.g(c.r, c1578Na0));
                            } else if (iN == 40) {
                                if ((i & 2) != 2) {
                                    this.g = new ArrayList();
                                    i |= 2;
                                }
                                this.g.add(Integer.valueOf(ee.k()));
                            } else if (iN != 42) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                int iD = ee.d(ee.k());
                                if ((i & 2) != 2 && ee.b() > 0) {
                                    this.g = new ArrayList();
                                    i |= 2;
                                }
                                while (ee.b() > 0) {
                                    this.g.add(Integer.valueOf(ee.k()));
                                }
                                ee.c(iD);
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
                    if ((i & 1) == 1) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i & 2) == 2) {
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
            }
            if ((i & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((i & 2) == 2) {
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
}
