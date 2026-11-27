package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ik1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4476ik1 extends AbstractC0673Bk0.c<C4476ik1> {
    public static final C4476ik1 s;
    public static final a t = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public int i;
    public List<C4735jk1> j;
    public C4267hk1 k;
    public int l;
    public C4267hk1 m;
    public int n;
    public List<C1999Sj1> o;
    public List<Integer> p;
    public byte q;
    public int r;

    /* JADX INFO: renamed from: ik1$a */
    public static class a extends Q0<C4476ik1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C4476ik1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: ik1$b */
    public static final class b extends AbstractC0673Bk0.b<C4476ik1, b> {
        public int h;
        public int i = 6;
        public int j;
        public List<C4735jk1> k;
        public C4267hk1 l;
        public int m;
        public C4267hk1 n;
        public int o;
        public List<C1999Sj1> p;
        public List<Integer> q;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.k = list;
            C4267hk1 c4267hk1 = C4267hk1.x;
            this.l = c4267hk1;
            this.n = c4267hk1;
            this.p = list;
            this.q = list;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C4476ik1 c4476ik1M = m();
            if (c4476ik1M.d()) {
                return c4476ik1M;
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
            n((C4476ik1) abstractC0673Bk0);
            return this;
        }

        public final C4476ik1 m() {
            C4476ik1 c4476ik1 = new C4476ik1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c4476ik1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c4476ik1.i = this.j;
            if ((i & 4) == 4) {
                this.k = Collections.unmodifiableList(this.k);
                this.h &= -5;
            }
            c4476ik1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c4476ik1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c4476ik1.l = this.m;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c4476ik1.m = this.n;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c4476ik1.n = this.o;
            if ((this.h & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                this.p = Collections.unmodifiableList(this.p);
                this.h &= -129;
            }
            c4476ik1.o = this.p;
            if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                this.q = Collections.unmodifiableList(this.q);
                this.h &= -257;
            }
            c4476ik1.p = this.q;
            c4476ik1.g = i2;
            return c4476ik1;
        }

        public final void n(C4476ik1 c4476ik1) {
            C4267hk1 c4267hk1;
            C4267hk1 c4267hk2;
            if (c4476ik1 == C4476ik1.s) {
                return;
            }
            int i = c4476ik1.g;
            if ((i & 1) == 1) {
                int i2 = c4476ik1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c4476ik1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if (!c4476ik1.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = c4476ik1.j;
                    this.h &= -5;
                } else {
                    if ((this.h & 4) != 4) {
                        this.k = new ArrayList(this.k);
                        this.h |= 4;
                    }
                    this.k.addAll(c4476ik1.j);
                }
            }
            if ((c4476ik1.g & 4) == 4) {
                C4267hk1 c4267hk3 = c4476ik1.k;
                if ((this.h & 8) != 8 || (c4267hk2 = this.l) == C4267hk1.x) {
                    this.l = c4267hk3;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk2);
                    cVarQ.n(c4267hk3);
                    this.l = cVarQ.m();
                }
                this.h |= 8;
            }
            int i4 = c4476ik1.g;
            if ((i4 & 8) == 8) {
                int i5 = c4476ik1.l;
                this.h |= 16;
                this.m = i5;
            }
            if ((i4 & 16) == 16) {
                C4267hk1 c4267hk4 = c4476ik1.m;
                if ((this.h & 32) != 32 || (c4267hk1 = this.n) == C4267hk1.x) {
                    this.n = c4267hk4;
                } else {
                    C4267hk1.c cVarQ2 = C4267hk1.q(c4267hk1);
                    cVarQ2.n(c4267hk4);
                    this.n = cVarQ2.m();
                }
                this.h |= 32;
            }
            if ((c4476ik1.g & 32) == 32) {
                int i6 = c4476ik1.n;
                this.h |= 64;
                this.o = i6;
            }
            if (!c4476ik1.o.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = c4476ik1.o;
                    this.h &= -129;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                        this.p = new ArrayList(this.p);
                        this.h |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    this.p.addAll(c4476ik1.o);
                }
            }
            if (!c4476ik1.p.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = c4476ik1.p;
                    this.h &= -257;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                        this.q = new ArrayList(this.q);
                        this.h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    this.q.addAll(c4476ik1.p);
                }
            }
            l(c4476ik1);
            this.d = this.d.b(c4476ik1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C4476ik1 c4476ik1 = null;
            try {
                try {
                    C4476ik1.t.getClass();
                    n(new C4476ik1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C4476ik1 c4476ik2 = (C4476ik1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c4476ik1 = c4476ik2;
                        if (c4476ik1 != null) {
                            n(c4476ik1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c4476ik1 != null) {
                    n(c4476ik1);
                }
                throw th;
            }
        }
    }

    static {
        C4476ik1 c4476ik1 = new C4476ik1(0);
        s = c4476ik1;
        c4476ik1.h = 6;
        c4476ik1.i = 0;
        List list = Collections.EMPTY_LIST;
        c4476ik1.j = list;
        C4267hk1 c4267hk1 = C4267hk1.x;
        c4476ik1.k = c4267hk1;
        c4476ik1.l = 0;
        c4476ik1.m = c4267hk1;
        c4476ik1.n = 0;
        c4476ik1.o = list;
        c4476ik1.p = list;
    }

    public C4476ik1() {
        throw null;
    }

    public C4476ik1(b bVar) {
        super(bVar);
        this.q = (byte) -1;
        this.r = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 1) == 1 ? IE.b(1, this.h) : 0;
        if ((this.g & 2) == 2) {
            iB += IE.b(2, this.i);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            iB += IE.d(3, this.j.get(i2));
        }
        if ((this.g & 4) == 4) {
            iB += IE.d(4, this.k);
        }
        if ((this.g & 8) == 8) {
            iB += IE.b(5, this.l);
        }
        if ((this.g & 16) == 16) {
            iB += IE.d(6, this.m);
        }
        if ((this.g & 32) == 32) {
            iB += IE.b(7, this.n);
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            iB += IE.d(8, this.o.get(i3));
        }
        int iC = 0;
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            iC += IE.c(this.p.get(i4).intValue());
        }
        int size = this.e.size() + j() + (this.p.size() * 2) + iB + iC;
        this.r = size;
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
        byte b2 = this.q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.g & 2) != 2) {
            this.q = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.j.size(); i++) {
            if (!this.j.get(i).d()) {
                this.q = (byte) 0;
                return false;
            }
        }
        if ((this.g & 4) == 4 && !this.k.d()) {
            this.q = (byte) 0;
            return false;
        }
        if ((this.g & 16) == 16 && !this.m.d()) {
            this.q = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            if (!this.o.get(i2).d()) {
                this.q = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.q = (byte) 1;
            return true;
        }
        this.q = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return s;
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
        if ((this.g & 2) == 2) {
            ie.m(2, this.i);
        }
        for (int i = 0; i < this.j.size(); i++) {
            ie.o(3, this.j.get(i));
        }
        if ((this.g & 4) == 4) {
            ie.o(4, this.k);
        }
        if ((this.g & 8) == 8) {
            ie.m(5, this.l);
        }
        if ((this.g & 16) == 16) {
            ie.o(6, this.m);
        }
        if ((this.g & 32) == 32) {
            ie.m(7, this.n);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            ie.o(8, this.o.get(i2));
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            ie.m(31, this.p.get(i3).intValue());
        }
        aVar.a(HttpPlatformResponse.MAX_MESSAGE_LENGTH, ie);
        ie.r(this.e);
    }

    public C4476ik1(int i) {
        this.q = (byte) -1;
        this.r = -1;
        this.e = AbstractC1724Ow.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C4476ik1(EE ee, C1578Na0 c1578Na0) {
        this.q = (byte) -1;
        this.r = -1;
        this.h = 6;
        boolean z = false;
        this.i = 0;
        List list = Collections.EMPTY_LIST;
        this.j = list;
        C4267hk1 c4267hk1 = C4267hk1.x;
        this.k = c4267hk1;
        this.l = 0;
        this.m = c4267hk1;
        this.n = 0;
        this.o = list;
        this.p = list;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = ee.n();
                    C4267hk1.c cVarQ = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.g |= 1;
                            this.h = ee.k();
                            continue;
                        case 16:
                            this.g |= 2;
                            this.i = ee.k();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.j = new ArrayList();
                                i |= 4;
                            }
                            this.j.add((C4735jk1) ee.g(C4735jk1.r, c1578Na0));
                            continue;
                        case 34:
                            if ((this.g & 4) == 4) {
                                C4267hk1 c4267hk2 = this.k;
                                c4267hk2.getClass();
                                cVarQ = C4267hk1.q(c4267hk2);
                            }
                            C4267hk1 c4267hk3 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                            this.k = c4267hk3;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk3);
                                this.k = cVarQ.m();
                            }
                            this.g |= 4;
                            continue;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            this.g |= 8;
                            this.l = ee.k();
                            continue;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            if ((this.g & 16) == 16) {
                                C4267hk1 c4267hk4 = this.m;
                                c4267hk4.getClass();
                                cVarQ = C4267hk1.q(c4267hk4);
                            }
                            C4267hk1 c4267hk5 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                            this.m = c4267hk5;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk5);
                                this.m = cVarQ.m();
                            }
                            this.g |= 16;
                            continue;
                        case 56:
                            this.g |= 32;
                            this.n = ee.k();
                            continue;
                        case 66:
                            if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                                this.o = new ArrayList();
                                i |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            }
                            this.o.add((C1999Sj1) ee.g(C1999Sj1.l, c1578Na0));
                            continue;
                        case 248:
                            if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                                this.p = new ArrayList();
                                i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            this.p.add(Integer.valueOf(ee.k()));
                            continue;
                        case 250:
                            int iD = ee.d(ee.k());
                            if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256 && ee.b() > 0) {
                                this.p = new ArrayList();
                                i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            while (ee.b() > 0) {
                                this.p.add(Integer.valueOf(ee.k()));
                            }
                            ee.c(iD);
                            continue;
                        default:
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                        this.p = Collections.unmodifiableList(this.p);
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
        if ((i & 4) == 4) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            this.o = Collections.unmodifiableList(this.o);
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            this.p = Collections.unmodifiableList(this.p);
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
