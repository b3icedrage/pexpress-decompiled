package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ek1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3637ek1 extends AbstractC0673Bk0.c<C3637ek1> {
    public static final C3637ek1 y;
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
    public C5155lk1 s;
    public int t;
    public int u;
    public List<Integer> v;
    public byte w;
    public int x;

    /* JADX INFO: renamed from: ek1$a */
    public static class a extends Q0<C3637ek1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C3637ek1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: ek1$b */
    public static final class b extends AbstractC0673Bk0.b<C3637ek1, b> {
        public int h;
        public int i = 518;
        public int j = 2054;
        public int k;
        public C4267hk1 l;
        public int m;
        public List<C4735jk1> n;
        public C4267hk1 o;
        public int p;
        public List<C4267hk1> q;
        public List<Integer> r;
        public C5155lk1 s;
        public int t;
        public int u;
        public List<Integer> v;

        public b() {
            C4267hk1 c4267hk1 = C4267hk1.x;
            this.l = c4267hk1;
            List list = Collections.EMPTY_LIST;
            this.n = list;
            this.o = c4267hk1;
            this.q = list;
            this.r = list;
            this.s = C5155lk1.p;
            this.v = list;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C3637ek1 c3637ek1M = m();
            if (c3637ek1M.d()) {
                return c3637ek1M;
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
            n((C3637ek1) abstractC0673Bk0);
            return this;
        }

        public final C3637ek1 m() {
            C3637ek1 c3637ek1 = new C3637ek1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c3637ek1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c3637ek1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c3637ek1.j = this.k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c3637ek1.k = this.l;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c3637ek1.l = this.m;
            if ((i & 32) == 32) {
                this.n = Collections.unmodifiableList(this.n);
                this.h &= -33;
            }
            c3637ek1.m = this.n;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c3637ek1.n = this.o;
            if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                i2 |= 64;
            }
            c3637ek1.o = this.p;
            if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                this.q = Collections.unmodifiableList(this.q);
                this.h &= -257;
            }
            c3637ek1.p = this.q;
            if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.r = Collections.unmodifiableList(this.r);
                this.h &= -513;
            }
            c3637ek1.q = this.r;
            if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                i2 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            c3637ek1.s = this.s;
            if ((i & 2048) == 2048) {
                i2 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            c3637ek1.t = this.t;
            if ((i & 4096) == 4096) {
                i2 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            c3637ek1.u = this.u;
            if ((this.h & 8192) == 8192) {
                this.v = Collections.unmodifiableList(this.v);
                this.h &= -8193;
            }
            c3637ek1.v = this.v;
            c3637ek1.g = i2;
            return c3637ek1;
        }

        public final void n(C3637ek1 c3637ek1) {
            C5155lk1 c5155lk1;
            C4267hk1 c4267hk1;
            C4267hk1 c4267hk2;
            if (c3637ek1 == C3637ek1.y) {
                return;
            }
            int i = c3637ek1.g;
            if ((i & 1) == 1) {
                int i2 = c3637ek1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c3637ek1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if ((i & 4) == 4) {
                int i4 = c3637ek1.j;
                this.h = 4 | this.h;
                this.k = i4;
            }
            if ((i & 8) == 8) {
                C4267hk1 c4267hk3 = c3637ek1.k;
                if ((this.h & 8) != 8 || (c4267hk2 = this.l) == C4267hk1.x) {
                    this.l = c4267hk3;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk2);
                    cVarQ.n(c4267hk3);
                    this.l = cVarQ.m();
                }
                this.h |= 8;
            }
            if ((c3637ek1.g & 16) == 16) {
                int i5 = c3637ek1.l;
                this.h = 16 | this.h;
                this.m = i5;
            }
            if (!c3637ek1.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = c3637ek1.m;
                    this.h &= -33;
                } else {
                    if ((this.h & 32) != 32) {
                        this.n = new ArrayList(this.n);
                        this.h |= 32;
                    }
                    this.n.addAll(c3637ek1.m);
                }
            }
            if ((c3637ek1.g & 32) == 32) {
                C4267hk1 c4267hk4 = c3637ek1.n;
                if ((this.h & 64) != 64 || (c4267hk1 = this.o) == C4267hk1.x) {
                    this.o = c4267hk4;
                } else {
                    C4267hk1.c cVarQ2 = C4267hk1.q(c4267hk1);
                    cVarQ2.n(c4267hk4);
                    this.o = cVarQ2.m();
                }
                this.h |= 64;
            }
            if ((c3637ek1.g & 64) == 64) {
                int i6 = c3637ek1.o;
                this.h |= UserVerificationMethods.USER_VERIFY_PATTERN;
                this.p = i6;
            }
            if (!c3637ek1.p.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = c3637ek1.p;
                    this.h &= -257;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                        this.q = new ArrayList(this.q);
                        this.h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    this.q.addAll(c3637ek1.p);
                }
            }
            if (!c3637ek1.q.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = c3637ek1.q;
                    this.h &= -513;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.r = new ArrayList(this.r);
                        this.h |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.r.addAll(c3637ek1.q);
                }
            }
            if ((c3637ek1.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                C5155lk1 c5155lk2 = c3637ek1.s;
                if ((this.h & UserVerificationMethods.USER_VERIFY_ALL) != 1024 || (c5155lk1 = this.s) == C5155lk1.p) {
                    this.s = c5155lk2;
                } else {
                    C5155lk1.b bVar = new C5155lk1.b();
                    bVar.n(c5155lk1);
                    bVar.n(c5155lk2);
                    this.s = bVar.m();
                }
                this.h |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            int i7 = c3637ek1.g;
            if ((i7 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                int i8 = c3637ek1.t;
                this.h |= 2048;
                this.t = i8;
            }
            if ((i7 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                int i9 = c3637ek1.u;
                this.h |= 4096;
                this.u = i9;
            }
            if (!c3637ek1.v.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = c3637ek1.v;
                    this.h &= -8193;
                } else {
                    if ((this.h & 8192) != 8192) {
                        this.v = new ArrayList(this.v);
                        this.h |= 8192;
                    }
                    this.v.addAll(c3637ek1.v);
                }
            }
            l(c3637ek1);
            this.d = this.d.b(c3637ek1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C3637ek1 c3637ek1 = null;
            try {
                try {
                    C3637ek1.z.getClass();
                    n(new C3637ek1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C3637ek1 c3637ek2 = (C3637ek1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c3637ek1 = c3637ek2;
                        if (c3637ek1 != null) {
                            n(c3637ek1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3637ek1 != null) {
                    n(c3637ek1);
                }
                throw th;
            }
        }
    }

    static {
        C3637ek1 c3637ek1 = new C3637ek1(0);
        y = c3637ek1;
        c3637ek1.p();
    }

    public C3637ek1() {
        throw null;
    }

    public C3637ek1(b bVar) {
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
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            iB += IE.d(6, this.s);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            iB += IE.b(7, this.t);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            iB += IE.b(8, this.u);
        }
        if ((this.g & 16) == 16) {
            iB += IE.b(9, this.l);
        }
        if ((this.g & 64) == 64) {
            iB += IE.b(10, this.o);
        }
        if ((this.g & 1) == 1) {
            iB += IE.b(11, this.h);
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            iB += IE.d(12, this.p.get(i3));
        }
        int iC = 0;
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            iC += IE.c(this.q.get(i4).intValue());
        }
        int iC2 = iB + iC;
        if (!this.q.isEmpty()) {
            iC2 = iC2 + 1 + IE.c(iC);
        }
        this.r = iC;
        int iC3 = 0;
        for (int i5 = 0; i5 < this.v.size(); i5++) {
            iC3 += IE.c(this.v.get(i5).intValue());
        }
        int size = this.e.size() + j() + (this.v.size() * 2) + iC2 + iC3;
        this.x = size;
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
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 && !this.s.d()) {
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
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            ie.o(6, this.s);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            ie.m(7, this.t);
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            ie.m(8, this.u);
        }
        if ((this.g & 16) == 16) {
            ie.m(9, this.l);
        }
        if ((this.g & 64) == 64) {
            ie.m(10, this.o);
        }
        if ((this.g & 1) == 1) {
            ie.m(11, this.h);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            ie.o(12, this.p.get(i2));
        }
        if (this.q.size() > 0) {
            ie.v(106);
            ie.v(this.r);
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            ie.n(this.q.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            ie.m(31, this.v.get(i4).intValue());
        }
        aVar.a(19000, ie);
        ie.r(this.e);
    }

    public final void p() {
        this.h = 518;
        this.i = 2054;
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
        this.s = C5155lk1.p;
        this.t = 0;
        this.u = 0;
        this.v = list;
    }

    public C3637ek1(int i) {
        this.r = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.e = AbstractC1724Ow.d;
    }

    public C3637ek1(EE ee, C1578Na0 c1578Na0) {
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
                    try {
                        int iN = ee.n();
                        C4267hk1.c cVarQ = null;
                        C5155lk1.b bVar2 = null;
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
                                if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                    C5155lk1 c5155lk1 = this.s;
                                    c5155lk1.getClass();
                                    bVar2 = new C5155lk1.b();
                                    bVar2.n(c5155lk1);
                                }
                                C5155lk1 c5155lk2 = (C5155lk1) ee.g(C5155lk1.q, c1578Na0);
                                this.s = c5155lk2;
                                if (bVar2 != null) {
                                    bVar2.n(c5155lk2);
                                    this.s = bVar2.m();
                                }
                                this.g |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                continue;
                            case 56:
                                this.g |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                this.t = ee.k();
                                continue;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                this.g |= UserVerificationMethods.USER_VERIFY_NONE;
                                this.u = ee.k();
                                continue;
                            case 72:
                                this.g |= 16;
                                this.l = ee.k();
                                continue;
                            case 80:
                                this.g |= 64;
                                this.o = ee.k();
                                continue;
                            case 88:
                                this.g |= 1;
                                this.h = ee.k();
                                continue;
                            case 98:
                                int i3 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                i = i;
                                if (i3 != 256) {
                                    this.p = new ArrayList();
                                    i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                }
                                this.p.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                                continue;
                            case 104:
                                int i4 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                i = i;
                                if (i4 != 512) {
                                    this.q = new ArrayList();
                                    i = (i == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_NONE;
                                }
                                this.q.add(Integer.valueOf(ee.k()));
                                continue;
                            case 106:
                                int iD = ee.d(ee.k());
                                int i5 = (i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE;
                                i = i;
                                if (i5 != 512) {
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
                            case 248:
                                int i6 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i6 != 8192) {
                                    this.v = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8192;
                                }
                                this.v.add(Integer.valueOf(ee.k()));
                                continue;
                            case 250:
                                int iD2 = ee.d(ee.k());
                                int i7 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i7 != 8192) {
                                    i = i;
                                    if (ee.b() > 0) {
                                        this.v = new ArrayList();
                                        i = (i == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (ee.b() > 0) {
                                    this.v.add(Integer.valueOf(ee.k()));
                                }
                                ee.c(iD2);
                                continue;
                            default:
                                if (!n(ee, ieJ, c1578Na0, iN)) {
                                    break;
                                }
                                break;
                        }
                        z2 = true;
                    } catch (IOException e) {
                        C7144vC0 c7144vC0 = new C7144vC0(e.getMessage());
                        c7144vC0.d = this;
                        throw c7144vC0;
                    }
                } catch (C7144vC0 e2) {
                    e2.d = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (((i == true ? 1 : 0) & 8192) == 8192) {
                    this.v = Collections.unmodifiableList(this.v);
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
        if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if (((i == true ? 1 : 0) & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if (((i == true ? 1 : 0) & 8192) == 8192) {
            this.v = Collections.unmodifiableList(this.v);
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
