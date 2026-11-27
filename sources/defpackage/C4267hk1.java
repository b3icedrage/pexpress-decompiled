package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: hk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4267hk1 extends AbstractC0673Bk0.c<C4267hk1> {
    public static final C4267hk1 x;
    public static final a y = new a();
    public final AbstractC1724Ow e;
    public int g;
    public List<b> h;
    public boolean i;
    public int j;
    public C4267hk1 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public C4267hk1 q;
    public int r;
    public C4267hk1 s;
    public int t;
    public int u;
    public byte v;
    public int w;

    /* JADX INFO: renamed from: hk1$a */
    public static class a extends Q0<C4267hk1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C4267hk1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: hk1$c */
    public static final class c extends AbstractC0673Bk0.b<C4267hk1, c> {
        public int h;
        public List<b> i = Collections.EMPTY_LIST;
        public boolean j;
        public int k;
        public C4267hk1 l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public C4267hk1 r;
        public int s;
        public C4267hk1 t;
        public int u;
        public int v;

        public c() {
            C4267hk1 c4267hk1 = C4267hk1.x;
            this.l = c4267hk1;
            this.r = c4267hk1;
            this.t = c4267hk1;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C4267hk1 c4267hk1M = m();
            if (c4267hk1M.d()) {
                return c4267hk1M;
            }
            throw new C82();
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final Object clone() {
            c cVar = new c();
            cVar.n(m());
            return cVar;
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
            c cVar = new c();
            cVar.n(m());
            return cVar;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
            n((C4267hk1) abstractC0673Bk0);
            return this;
        }

        public final C4267hk1 m() {
            C4267hk1 c4267hk1 = new C4267hk1(this);
            int i = this.h;
            if ((i & 1) == 1) {
                this.i = Collections.unmodifiableList(this.i);
                this.h &= -2;
            }
            c4267hk1.h = this.i;
            int i2 = (i & 2) != 2 ? 0 : 1;
            c4267hk1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c4267hk1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c4267hk1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c4267hk1.l = this.m;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c4267hk1.m = this.n;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c4267hk1.n = this.o;
            if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i2 |= 64;
            }
            c4267hk1.o = this.p;
            if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                i2 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            c4267hk1.p = this.q;
            if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                i2 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            c4267hk1.q = this.r;
            if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                i2 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            c4267hk1.r = this.s;
            if ((i & 2048) == 2048) {
                i2 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            c4267hk1.s = this.t;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            c4267hk1.t = this.u;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            c4267hk1.u = this.v;
            c4267hk1.g = i2;
            return c4267hk1;
        }

        public final c n(C4267hk1 c4267hk1) {
            C4267hk1 c4267hk2;
            C4267hk1 c4267hk3;
            C4267hk1 c4267hk4;
            C4267hk1 c4267hk5 = C4267hk1.x;
            if (c4267hk1 == c4267hk5) {
                return this;
            }
            if (!c4267hk1.h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = c4267hk1.h;
                    this.h &= -2;
                } else {
                    if ((this.h & 1) != 1) {
                        this.i = new ArrayList(this.i);
                        this.h |= 1;
                    }
                    this.i.addAll(c4267hk1.h);
                }
            }
            int i = c4267hk1.g;
            if ((i & 1) == 1) {
                boolean z = c4267hk1.i;
                this.h |= 2;
                this.j = z;
            }
            if ((i & 2) == 2) {
                int i2 = c4267hk1.j;
                this.h |= 4;
                this.k = i2;
            }
            if ((i & 4) == 4) {
                C4267hk1 c4267hk6 = c4267hk1.k;
                if ((this.h & 8) != 8 || (c4267hk4 = this.l) == c4267hk5) {
                    this.l = c4267hk6;
                } else {
                    c cVarQ = C4267hk1.q(c4267hk4);
                    cVarQ.n(c4267hk6);
                    this.l = cVarQ.m();
                }
                this.h |= 8;
            }
            int i3 = c4267hk1.g;
            if ((i3 & 8) == 8) {
                int i4 = c4267hk1.l;
                this.h |= 16;
                this.m = i4;
            }
            if ((i3 & 16) == 16) {
                int i5 = c4267hk1.m;
                this.h |= 32;
                this.n = i5;
            }
            if ((i3 & 32) == 32) {
                int i6 = c4267hk1.n;
                this.h |= 64;
                this.o = i6;
            }
            if ((i3 & 64) == 64) {
                int i7 = c4267hk1.o;
                this.h |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.p = i7;
            }
            if ((i3 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                int i8 = c4267hk1.p;
                this.h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                this.q = i8;
            }
            if ((i3 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                C4267hk1 c4267hk7 = c4267hk1.q;
                if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) != 512 || (c4267hk3 = this.r) == c4267hk5) {
                    this.r = c4267hk7;
                } else {
                    c cVarQ2 = C4267hk1.q(c4267hk3);
                    cVarQ2.n(c4267hk7);
                    this.r = cVarQ2.m();
                }
                this.h |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            int i9 = c4267hk1.g;
            if ((i9 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                int i10 = c4267hk1.r;
                this.h |= UserVerificationMethods.USER_VERIFY_ALL;
                this.s = i10;
            }
            if ((i9 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                C4267hk1 c4267hk8 = c4267hk1.s;
                if ((this.h & 2048) != 2048 || (c4267hk2 = this.t) == c4267hk5) {
                    this.t = c4267hk8;
                } else {
                    c cVarQ3 = C4267hk1.q(c4267hk2);
                    cVarQ3.n(c4267hk8);
                    this.t = cVarQ3.m();
                }
                this.h |= 2048;
            }
            int i11 = c4267hk1.g;
            if ((i11 & 2048) == 2048) {
                int i12 = c4267hk1.t;
                this.h |= 4096;
                this.u = i12;
            }
            if ((i11 & 4096) == 4096) {
                int i13 = c4267hk1.u;
                this.h |= 8192;
                this.v = i13;
            }
            l(c4267hk1);
            this.d = this.d.b(c4267hk1.e);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C4267hk1 c4267hk1 = null;
            try {
                try {
                    C4267hk1.y.getClass();
                    n(new C4267hk1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C4267hk1 c4267hk2 = (C4267hk1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c4267hk1 = c4267hk2;
                        if (c4267hk1 != null) {
                            n(c4267hk1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c4267hk1 != null) {
                    n(c4267hk1);
                }
                throw th;
            }
        }
    }

    static {
        C4267hk1 c4267hk1 = new C4267hk1(0);
        x = c4267hk1;
        c4267hk1.p();
    }

    public C4267hk1() {
        throw null;
    }

    public C4267hk1(c cVar) {
        super(cVar);
        this.v = (byte) -1;
        this.w = -1;
        this.e = cVar.d;
    }

    public static c q(C4267hk1 c4267hk1) {
        c cVar = new c();
        cVar.n(c4267hk1);
        return cVar;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 4096) == 4096 ? IE.b(1, this.u) : 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iB += IE.d(2, this.h.get(i2));
        }
        if ((this.g & 1) == 1) {
            iB += IE.h(3) + 1;
        }
        if ((this.g & 2) == 2) {
            iB += IE.b(4, this.j);
        }
        if ((this.g & 4) == 4) {
            iB += IE.d(5, this.k);
        }
        if ((this.g & 16) == 16) {
            iB += IE.b(6, this.m);
        }
        if ((this.g & 32) == 32) {
            iB += IE.b(7, this.n);
        }
        if ((this.g & 8) == 8) {
            iB += IE.b(8, this.l);
        }
        if ((this.g & 64) == 64) {
            iB += IE.b(9, this.o);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            iB += IE.d(10, this.q);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            iB += IE.b(11, this.r);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            iB += IE.b(12, this.p);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            iB += IE.d(13, this.s);
        }
        if ((this.g & 2048) == 2048) {
            iB += IE.b(14, this.t);
        }
        int size = this.e.size() + j() + iB;
        this.w = size;
        return size;
    }

    @Override // defpackage.KZ0
    public final boolean d() {
        byte b2 = this.v;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).d()) {
                this.v = (byte) 0;
                return false;
            }
        }
        if ((this.g & 4) == 4 && !this.k.d()) {
            this.v = (byte) 0;
            return false;
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256 && !this.q.d()) {
            this.v = (byte) 0;
            return false;
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_ALL) == 1024 && !this.s.d()) {
            this.v = (byte) 0;
            return false;
        }
        if (i()) {
            this.v = (byte) 1;
            return true;
        }
        this.v = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return x;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new c();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) throws IOException {
        a();
        AbstractC0673Bk0.c.a aVar = new AbstractC0673Bk0.c.a(this);
        if ((this.g & 4096) == 4096) {
            ie.m(1, this.u);
        }
        for (int i = 0; i < this.h.size(); i++) {
            ie.o(2, this.h.get(i));
        }
        if ((this.g & 1) == 1) {
            boolean z = this.i;
            ie.x(3, 0);
            ie.q(z ? 1 : 0);
        }
        if ((this.g & 2) == 2) {
            ie.m(4, this.j);
        }
        if ((this.g & 4) == 4) {
            ie.o(5, this.k);
        }
        if ((this.g & 16) == 16) {
            ie.m(6, this.m);
        }
        if ((this.g & 32) == 32) {
            ie.m(7, this.n);
        }
        if ((this.g & 8) == 8) {
            ie.m(8, this.l);
        }
        if ((this.g & 64) == 64) {
            ie.m(9, this.o);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            ie.o(10, this.q);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            ie.m(11, this.r);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            ie.m(12, this.p);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            ie.o(13, this.s);
        }
        if ((this.g & 2048) == 2048) {
            ie.m(14, this.t);
        }
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public final void p() {
        this.h = Collections.EMPTY_LIST;
        this.i = false;
        this.j = 0;
        C4267hk1 c4267hk1 = x;
        this.k = c4267hk1;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = c4267hk1;
        this.r = 0;
        this.s = c4267hk1;
        this.t = 0;
        this.u = 0;
    }

    @Override // defpackage.HZ0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final c b() {
        return q(this);
    }

    /* JADX INFO: renamed from: hk1$b */
    public static final class b extends AbstractC0673Bk0 implements KZ0 {
        public static final b l;
        public static final a m = new a();
        public final AbstractC1724Ow d;
        public int e;
        public c g;
        public C4267hk1 h;
        public int i;
        public byte j;
        public int k;

        /* JADX INFO: renamed from: hk1$b$a */
        public static class a extends Q0<b> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new b(ee, c1578Na0);
            }
        }

        /* JADX INFO: renamed from: hk1$b$b, reason: collision with other inner class name */
        public static final class C0367b extends AbstractC0673Bk0.a<b, C0367b> implements KZ0 {
            public int e;
            public c g = c.INV;
            public C4267hk1 h = C4267hk1.x;
            public int i;

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
                C0367b c0367b = new C0367b();
                c0367b.m(l());
                return c0367b;
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
                C0367b c0367b = new C0367b();
                c0367b.m(l());
                return c0367b;
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
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.i = this.i;
                bVar.e = i2;
                return bVar;
            }

            public final void m(b bVar) {
                C4267hk1 c4267hk1;
                if (bVar == b.l) {
                    return;
                }
                if ((bVar.e & 1) == 1) {
                    c cVar = bVar.g;
                    cVar.getClass();
                    this.e = 1 | this.e;
                    this.g = cVar;
                }
                if ((bVar.e & 2) == 2) {
                    C4267hk1 c4267hk2 = bVar.h;
                    if ((this.e & 2) != 2 || (c4267hk1 = this.h) == C4267hk1.x) {
                        this.h = c4267hk2;
                    } else {
                        c cVarQ = C4267hk1.q(c4267hk1);
                        cVarQ.n(c4267hk2);
                        this.h = cVarQ.m();
                    }
                    this.e |= 2;
                }
                if ((bVar.e & 4) == 4) {
                    int i = bVar.i;
                    this.e = 4 | this.e;
                    this.i = i;
                }
                this.d = this.d.b(bVar.d);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b.m.getClass();
                        m(new b(ee, c1578Na0));
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

        /* JADX INFO: renamed from: hk1$b$c */
        public enum c implements YB0.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);

            public final int d;

            c(int i) {
                this.d = i;
            }

            @Override // YB0.a
            public final int getNumber() {
                return this.d;
            }
        }

        static {
            b bVar = new b();
            l = bVar;
            bVar.g = c.INV;
            bVar.h = C4267hk1.x;
            bVar.i = 0;
        }

        public b(C0367b c0367b) {
            this.j = (byte) -1;
            this.k = -1;
            this.d = c0367b.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.k;
            if (i != -1) {
                return i;
            }
            int iA = (this.e & 1) == 1 ? IE.a(1, this.g.d) : 0;
            if ((this.e & 2) == 2) {
                iA += IE.d(2, this.h);
            }
            if ((this.e & 4) == 4) {
                iA += IE.b(3, this.i);
            }
            int size = this.d.size() + iA;
            this.k = size;
            return size;
        }

        @Override // defpackage.HZ0
        public final HZ0.a b() {
            C0367b c0367b = new C0367b();
            c0367b.m(this);
            return c0367b;
        }

        @Override // defpackage.KZ0
        public final boolean d() {
            byte b = this.j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.e & 2) != 2 || this.h.d()) {
                this.j = (byte) 1;
                return true;
            }
            this.j = (byte) 0;
            return false;
        }

        @Override // defpackage.HZ0
        public final HZ0.a g() {
            return new C0367b();
        }

        @Override // defpackage.HZ0
        public final void h(IE ie) {
            a();
            if ((this.e & 1) == 1) {
                ie.l(1, this.g.d);
            }
            if ((this.e & 2) == 2) {
                ie.o(2, this.h);
            }
            if ((this.e & 4) == 4) {
                ie.m(3, this.i);
            }
            ie.r(this.d);
        }

        public b() {
            this.j = (byte) -1;
            this.k = -1;
            this.d = AbstractC1724Ow.d;
        }

        public b(EE ee, C1578Na0 c1578Na0) {
            this.j = (byte) -1;
            this.k = -1;
            c cVar = c.INV;
            this.g = cVar;
            this.h = C4267hk1.x;
            boolean z = false;
            this.i = 0;
            AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
            IE ieJ = IE.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int iN = ee.n();
                            if (iN != 0) {
                                c cVarQ = null;
                                c cVar2 = null;
                                if (iN == 8) {
                                    int iK = ee.k();
                                    if (iK == 0) {
                                        cVar2 = c.IN;
                                    } else if (iK == 1) {
                                        cVar2 = c.OUT;
                                    } else if (iK == 2) {
                                        cVar2 = cVar;
                                    } else if (iK == 3) {
                                        cVar2 = c.STAR;
                                    }
                                    if (cVar2 == null) {
                                        ieJ.v(iN);
                                        ieJ.v(iK);
                                    } else {
                                        this.e |= 1;
                                        this.g = cVar2;
                                    }
                                } else if (iN == 18) {
                                    if ((this.e & 2) == 2) {
                                        C4267hk1 c4267hk1 = this.h;
                                        c4267hk1.getClass();
                                        cVarQ = C4267hk1.q(c4267hk1);
                                    }
                                    C4267hk1 c4267hk2 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                                    this.h = c4267hk2;
                                    if (cVarQ != null) {
                                        cVarQ.n(c4267hk2);
                                        this.h = cVarQ.m();
                                    }
                                    this.e |= 2;
                                } else if (iN != 24) {
                                    if (!ee.q(iN, ieJ)) {
                                    }
                                } else {
                                    this.e |= 4;
                                    this.i = ee.k();
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

    public C4267hk1(int i) {
        this.v = (byte) -1;
        this.w = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C4267hk1(EE ee, C1578Na0 c1578Na0) {
        this.v = (byte) -1;
        this.w = -1;
        p();
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    a aVar = y;
                    c cVarQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.g |= 4096;
                            this.u = ee.k();
                            continue;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            if (!z2) {
                                this.h = new ArrayList();
                                z2 = true;
                            }
                            this.h.add((b) ee.g(b.m, c1578Na0));
                            continue;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            this.g |= 1;
                            this.i = ee.l() != 0;
                            continue;
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                            this.g |= 2;
                            this.j = ee.k();
                            continue;
                        case 42:
                            if ((this.g & 4) == 4) {
                                C4267hk1 c4267hk1 = this.k;
                                c4267hk1.getClass();
                                cVarQ = q(c4267hk1);
                            }
                            C4267hk1 c4267hk2 = (C4267hk1) ee.g(aVar, c1578Na0);
                            this.k = c4267hk2;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk2);
                                this.k = cVarQ.m();
                            }
                            this.g |= 4;
                            continue;
                        case 48:
                            this.g |= 16;
                            this.m = ee.k();
                            continue;
                        case 56:
                            this.g |= 32;
                            this.n = ee.k();
                            continue;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            this.g |= 8;
                            this.l = ee.k();
                            continue;
                        case 72:
                            this.g |= 64;
                            this.o = ee.k();
                            continue;
                        case 82:
                            if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                                C4267hk1 c4267hk3 = this.q;
                                c4267hk3.getClass();
                                cVarQ = q(c4267hk3);
                            }
                            C4267hk1 c4267hk4 = (C4267hk1) ee.g(aVar, c1578Na0);
                            this.q = c4267hk4;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk4);
                                this.q = cVarQ.m();
                            }
                            this.g |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            continue;
                        case 88:
                            this.g |= UserVerificationMethods.USER_VERIFY_NONE;
                            this.r = ee.k();
                            continue;
                        case 96:
                            this.g |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            this.p = ee.k();
                            continue;
                        case 106:
                            if ((this.g & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                                C4267hk1 c4267hk5 = this.s;
                                c4267hk5.getClass();
                                cVarQ = q(c4267hk5);
                            }
                            C4267hk1 c4267hk6 = (C4267hk1) ee.g(aVar, c1578Na0);
                            this.s = c4267hk6;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk6);
                                this.s = cVarQ.m();
                            }
                            this.g |= UserVerificationMethods.USER_VERIFY_ALL;
                            continue;
                        case 112:
                            this.g |= 2048;
                            this.t = ee.k();
                            continue;
                        default:
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.h = Collections.unmodifiableList(this.h);
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
        if (z2) {
            this.h = Collections.unmodifiableList(this.h);
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
