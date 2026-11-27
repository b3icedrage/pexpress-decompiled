package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Zj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2575Zj1 extends AbstractC0673Bk0.c<C2575Zj1> {
    public static final C2575Zj1 y;
    public static final a z = new a();
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public int i;
    public int j;
    public C4267hk1 k;
    public int l;
    public List<C4735jk1> m;
    public C4267hk1 n;
    public int o;
    public List<C4267hk1> p;
    public List<Integer> q;
    public int r;
    public List<C5155lk1> s;
    public C4945kk1 t;
    public List<Integer> u;
    public C2233Vj1 v;
    public byte w;
    public int x;

    /* JADX INFO: renamed from: Zj1$a */
    public static class a extends Q0<C2575Zj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2575Zj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Zj1$b */
    public static final class b extends AbstractC0673Bk0.b<C2575Zj1, b> {
        public int h;
        public int i = 6;
        public int j = 6;
        public int k;
        public C4267hk1 l;
        public int m;
        public List<C4735jk1> n;
        public C4267hk1 o;
        public int p;
        public List<C4267hk1> q;
        public List<Integer> r;
        public List<C5155lk1> s;
        public C4945kk1 t;
        public List<Integer> u;
        public C2233Vj1 v;

        public b() {
            C4267hk1 c4267hk1 = C4267hk1.x;
            this.l = c4267hk1;
            List list = Collections.EMPTY_LIST;
            this.n = list;
            this.o = c4267hk1;
            this.q = list;
            this.r = list;
            this.s = list;
            this.t = C4945kk1.k;
            this.u = list;
            this.v = C2233Vj1.i;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2575Zj1 c2575Zj1M = m();
            if (c2575Zj1M.d()) {
                return c2575Zj1M;
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
            n((C2575Zj1) abstractC0673Bk0);
            return this;
        }

        public final C2575Zj1 m() {
            C2575Zj1 c2575Zj1 = new C2575Zj1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c2575Zj1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c2575Zj1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c2575Zj1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c2575Zj1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c2575Zj1.l = this.m;
            if ((i & 32) == 32) {
                this.n = Collections.unmodifiableList(this.n);
                this.h &= -33;
            }
            c2575Zj1.m = this.n;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c2575Zj1.n = this.o;
            if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i2 |= 64;
            }
            c2575Zj1.o = this.p;
            if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                this.q = Collections.unmodifiableList(this.q);
                this.h &= -257;
            }
            c2575Zj1.p = this.q;
            if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.r = Collections.unmodifiableList(this.r);
                this.h &= -513;
            }
            c2575Zj1.q = this.r;
            if ((this.h & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                this.s = Collections.unmodifiableList(this.s);
                this.h &= -1025;
            }
            c2575Zj1.s = this.s;
            if ((i & 2048) == 2048) {
                i2 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            c2575Zj1.t = this.t;
            if ((this.h & 4096) == 4096) {
                this.u = Collections.unmodifiableList(this.u);
                this.h &= -4097;
            }
            c2575Zj1.u = this.u;
            if ((i & 8192) == 8192) {
                i2 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            c2575Zj1.v = this.v;
            c2575Zj1.g = i2;
            return c2575Zj1;
        }

        public final void n(C2575Zj1 c2575Zj1) {
            C2233Vj1 c2233Vj1;
            C4945kk1 c4945kk1;
            C4267hk1 c4267hk1;
            C4267hk1 c4267hk2;
            if (c2575Zj1 == C2575Zj1.y) {
                return;
            }
            int i = c2575Zj1.g;
            if ((i & 1) == 1) {
                int i2 = c2575Zj1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c2575Zj1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if ((i & 4) == 4) {
                int i4 = c2575Zj1.j;
                this.h = 4 | this.h;
                this.k = i4;
            }
            if ((i & 8) == 8) {
                C4267hk1 c4267hk3 = c2575Zj1.k;
                if ((this.h & 8) != 8 || (c4267hk2 = this.l) == C4267hk1.x) {
                    this.l = c4267hk3;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk2);
                    cVarQ.n(c4267hk3);
                    this.l = cVarQ.m();
                }
                this.h |= 8;
            }
            if ((c2575Zj1.g & 16) == 16) {
                int i5 = c2575Zj1.l;
                this.h = 16 | this.h;
                this.m = i5;
            }
            if (!c2575Zj1.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = c2575Zj1.m;
                    this.h &= -33;
                } else {
                    if ((this.h & 32) != 32) {
                        this.n = new ArrayList(this.n);
                        this.h |= 32;
                    }
                    this.n.addAll(c2575Zj1.m);
                }
            }
            if ((c2575Zj1.g & 32) == 32) {
                C4267hk1 c4267hk4 = c2575Zj1.n;
                if ((this.h & 64) != 64 || (c4267hk1 = this.o) == C4267hk1.x) {
                    this.o = c4267hk4;
                } else {
                    C4267hk1.c cVarQ2 = C4267hk1.q(c4267hk1);
                    cVarQ2.n(c4267hk4);
                    this.o = cVarQ2.m();
                }
                this.h |= 64;
            }
            if ((c2575Zj1.g & 64) == 64) {
                int i6 = c2575Zj1.o;
                this.h |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.p = i6;
            }
            if (!c2575Zj1.p.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = c2575Zj1.p;
                    this.h &= -257;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                        this.q = new ArrayList(this.q);
                        this.h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    this.q.addAll(c2575Zj1.p);
                }
            }
            if (!c2575Zj1.q.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = c2575Zj1.q;
                    this.h &= -513;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.r = new ArrayList(this.r);
                        this.h |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.r.addAll(c2575Zj1.q);
                }
            }
            if (!c2575Zj1.s.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = c2575Zj1.s;
                    this.h &= -1025;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_ALL) != 1024) {
                        this.s = new ArrayList(this.s);
                        this.h |= UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    this.s.addAll(c2575Zj1.s);
                }
            }
            if ((c2575Zj1.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                C4945kk1 c4945kk2 = c2575Zj1.t;
                if ((this.h & 2048) != 2048 || (c4945kk1 = this.t) == C4945kk1.k) {
                    this.t = c4945kk2;
                } else {
                    C4945kk1.b bVarI = C4945kk1.i(c4945kk1);
                    bVarI.m(c4945kk2);
                    this.t = bVarI.l();
                }
                this.h |= 2048;
            }
            if (!c2575Zj1.u.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = c2575Zj1.u;
                    this.h &= -4097;
                } else {
                    if ((this.h & 4096) != 4096) {
                        this.u = new ArrayList(this.u);
                        this.h |= 4096;
                    }
                    this.u.addAll(c2575Zj1.u);
                }
            }
            if ((c2575Zj1.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                C2233Vj1 c2233Vj2 = c2575Zj1.v;
                if ((this.h & 8192) != 8192 || (c2233Vj1 = this.v) == C2233Vj1.i) {
                    this.v = c2233Vj2;
                } else {
                    C2233Vj1.b bVar = new C2233Vj1.b();
                    bVar.m(c2233Vj1);
                    bVar.m(c2233Vj2);
                    this.v = bVar.l();
                }
                this.h |= 8192;
            }
            l(c2575Zj1);
            this.d = this.d.b(c2575Zj1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2575Zj1 c2575Zj1 = null;
            try {
                try {
                    C2575Zj1.z.getClass();
                    n(new C2575Zj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2575Zj1 c2575Zj2 = (C2575Zj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2575Zj1 = c2575Zj2;
                        if (c2575Zj1 != null) {
                            n(c2575Zj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2575Zj1 != null) {
                    n(c2575Zj1);
                }
                throw th;
            }
        }
    }

    static {
        C2575Zj1 c2575Zj1 = new C2575Zj1(0);
        y = c2575Zj1;
        c2575Zj1.p();
    }

    public C2575Zj1() {
        throw null;
    }

    public C2575Zj1(b bVar) {
        super(bVar);
        this.r = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 2) == 2 ? IE.b(1, this.i) : 0;
        if ((this.g & 4) == 4) {
            iB += IE.b(2, this.j);
        }
        if ((this.g & 8) == 8) {
            iB += IE.d(3, this.k);
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            iB += IE.d(4, this.m.get(i2));
        }
        if ((this.g & 32) == 32) {
            iB += IE.d(5, this.n);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            iB += IE.d(6, this.s.get(i3));
        }
        if ((this.g & 16) == 16) {
            iB += IE.b(7, this.l);
        }
        if ((this.g & 64) == 64) {
            iB += IE.b(8, this.o);
        }
        if ((this.g & 1) == 1) {
            iB += IE.b(9, this.h);
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            iB += IE.d(10, this.p.get(i4));
        }
        int iC = 0;
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            iC += IE.c(this.q.get(i5).intValue());
        }
        int iD = iB + iC;
        if (!this.q.isEmpty()) {
            iD = iD + 1 + IE.c(iC);
        }
        this.r = iC;
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            iD += IE.d(30, this.t);
        }
        int iC2 = 0;
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            iC2 += IE.c(this.u.get(i6).intValue());
        }
        int size = (this.u.size() * 2) + iD + iC2;
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            size += IE.d(32, this.v);
        }
        int size2 = this.e.size() + j() + size;
        this.x = size2;
        return size2;
    }

    @Override // defpackage.HZ0
    public final HZ0.a b() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    @Override // defpackage.KZ0
    public final boolean d() {
        byte b2 = this.w;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.g;
        if ((i & 4) != 4) {
            this.w = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.k.d()) {
            this.w = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            if (!this.m.get(i2).d()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if ((this.g & 32) == 32 && !this.n.d()) {
            this.w = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            if (!this.p.get(i3).d()) {
                this.w = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            if (!this.s.get(i4).d()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 && !this.t.d()) {
            this.w = (byte) 0;
            return false;
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256 && !this.v.d()) {
            this.w = (byte) 0;
            return false;
        }
        if (i()) {
            this.w = (byte) 1;
            return true;
        }
        this.w = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return y;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new b();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        AbstractC0673Bk0.c.a aVar = new AbstractC0673Bk0.c.a(this);
        if ((this.g & 2) == 2) {
            ie.m(1, this.i);
        }
        if ((this.g & 4) == 4) {
            ie.m(2, this.j);
        }
        if ((this.g & 8) == 8) {
            ie.o(3, this.k);
        }
        for (int i = 0; i < this.m.size(); i++) {
            ie.o(4, this.m.get(i));
        }
        if ((this.g & 32) == 32) {
            ie.o(5, this.n);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            ie.o(6, this.s.get(i2));
        }
        if ((this.g & 16) == 16) {
            ie.m(7, this.l);
        }
        if ((this.g & 64) == 64) {
            ie.m(8, this.o);
        }
        if ((this.g & 1) == 1) {
            ie.m(9, this.h);
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            ie.o(10, this.p.get(i3));
        }
        if (this.q.size() > 0) {
            ie.v(90);
            ie.v(this.r);
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            ie.n(this.q.get(i4).intValue());
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            ie.o(30, this.t);
        }
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            ie.m(31, this.u.get(i5).intValue());
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            ie.o(32, this.v);
        }
        aVar.a(19000, ie);
        ie.r(this.e);
    }

    public final void p() {
        this.h = 6;
        this.i = 6;
        this.j = 0;
        C4267hk1 c4267hk1 = C4267hk1.x;
        this.k = c4267hk1;
        this.l = 0;
        List list = Collections.EMPTY_LIST;
        this.m = list;
        this.n = c4267hk1;
        this.o = 0;
        this.p = list;
        this.q = list;
        this.s = list;
        this.t = C4945kk1.k;
        this.u = list;
        this.v = C2233Vj1.i;
    }

    public C2575Zj1(int i) {
        this.r = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C2575Zj1(EE ee, C1578Na0 c1578Na0) {
        this.r = -1;
        this.w = (byte) -1;
        this.x = -1;
        p();
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        boolean z2 = false;
        int i = 0;
        while (!z2) {
            try {
                try {
                    int iN = ee.n();
                    C4267hk1.c cVarQ = null;
                    C2233Vj1.b bVar2 = null;
                    C4945kk1.b bVarI = null;
                    C4267hk1.c cVarQ2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.g |= 2;
                            this.i = ee.k();
                            continue;
                        case 16:
                            this.g |= 4;
                            this.j = ee.k();
                            continue;
                        case 26:
                            if ((this.g & 8) == 8) {
                                C4267hk1 c4267hk1 = this.k;
                                c4267hk1.getClass();
                                cVarQ = C4267hk1.q(c4267hk1);
                            }
                            C4267hk1 c4267hk2 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                            this.k = c4267hk2;
                            if (cVarQ != null) {
                                cVarQ.n(c4267hk2);
                                this.k = cVarQ.m();
                            }
                            this.g |= 8;
                            continue;
                        case 34:
                            int i2 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i2 != 32) {
                                this.m = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.m.add((C4735jk1) ee.g(C4735jk1.r, c1578Na0));
                            continue;
                        case 42:
                            if ((this.g & 32) == 32) {
                                C4267hk1 c4267hk3 = this.n;
                                c4267hk3.getClass();
                                cVarQ2 = C4267hk1.q(c4267hk3);
                            }
                            C4267hk1 c4267hk4 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                            this.n = c4267hk4;
                            if (cVarQ2 != null) {
                                cVarQ2.n(c4267hk4);
                                this.n = cVarQ2.m();
                            }
                            this.g |= 32;
                            continue;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            int i3 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL;
                            i = i;
                            if (i3 != 1024) {
                                this.s = new ArrayList();
                                i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_ALL;
                            }
                            this.s.add((C5155lk1) ee.g(C5155lk1.q, c1578Na0));
                            continue;
                        case 56:
                            this.g |= 16;
                            this.l = ee.k();
                            continue;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            this.g |= 64;
                            this.o = ee.k();
                            continue;
                        case 72:
                            this.g |= 1;
                            this.h = ee.k();
                            continue;
                        case 82:
                            int i4 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            i = i;
                            if (i4 != 256) {
                                this.p = new ArrayList();
                                i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            this.p.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                            continue;
                        case 88:
                            int i5 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                            i = i;
                            if (i5 != 512) {
                                this.q = new ArrayList();
                                i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_NONE;
                            }
                            this.q.add(Integer.valueOf(ee.k()));
                            continue;
                        case 90:
                            int iD = ee.d(ee.k());
                            int i6 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                            i = i;
                            if (i6 != 512) {
                                i = i;
                                if (ee.b() > 0) {
                                    this.q = new ArrayList();
                                    i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_NONE;
                                }
                            }
                            while (ee.b() > 0) {
                                this.q.add(Integer.valueOf(ee.k()));
                            }
                            ee.c(iD);
                            continue;
                        case 242:
                            if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                C4945kk1 c4945kk1 = this.t;
                                c4945kk1.getClass();
                                bVarI = C4945kk1.i(c4945kk1);
                            }
                            C4945kk1 c4945kk2 = (C4945kk1) ee.g(C4945kk1.l, c1578Na0);
                            this.t = c4945kk2;
                            if (bVarI != null) {
                                bVarI.m(c4945kk2);
                                this.t = bVarI.l();
                            }
                            this.g |= UserVerificationMethods.USER_VERIFY_PATTERN;
                            continue;
                        case 248:
                            int i7 = (i == true ? 1 : 0) & 4096;
                            i = i;
                            if (i7 != 4096) {
                                this.u = new ArrayList();
                                i = (i == true ? 1 : 0) | 4096;
                            }
                            this.u.add(Integer.valueOf(ee.k()));
                            continue;
                        case 250:
                            int iD2 = ee.d(ee.k());
                            int i8 = (i == true ? 1 : 0) & 4096;
                            i = i;
                            if (i8 != 4096) {
                                i = i;
                                if (ee.b() > 0) {
                                    this.u = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4096;
                                }
                            }
                            while (ee.b() > 0) {
                                this.u.add(Integer.valueOf(ee.k()));
                            }
                            ee.c(iD2);
                            continue;
                        case 258:
                            if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                                C2233Vj1 c2233Vj1 = this.v;
                                c2233Vj1.getClass();
                                bVar2 = new C2233Vj1.b();
                                bVar2.m(c2233Vj1);
                            }
                            C2233Vj1 c2233Vj2 = (C2233Vj1) ee.g(C2233Vj1.j, c1578Na0);
                            this.v = c2233Vj2;
                            if (bVar2 != null) {
                                bVar2.m(c2233Vj2);
                                this.v = bVar2.l();
                            }
                            this.g |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            continue;
                        default:
                            if (!n(ee, ieJ, c1578Na0, iN)) {
                                break;
                            }
                            break;
                    }
                    z2 = true;
                } catch (C7144vC0 e) {
                    e.d = this;
                    throw e;
                } catch (IOException e2) {
                    C7144vC0 c7144vC0 = new C7144vC0(e2.getMessage());
                    c7144vC0.d = this;
                    throw c7144vC0;
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (((i == true ? 1 : 0) & 4096) == 4096) {
                    this.u = Collections.unmodifiableList(this.u);
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
        if (((i == true ? 1 : 0) & 32) == 32) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if (((i == true ? 1 : 0) & 4096) == 4096) {
            this.u = Collections.unmodifiableList(this.u);
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
