package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Tj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2077Tj1 extends AbstractC0673Bk0.c<C2077Tj1> {
    public static final C2077Tj1 N;
    public static final a O = new a();
    public int A;
    public C4267hk1 B;
    public int C;
    public List<Integer> D;
    public int E;
    public List<C4267hk1> F;
    public List<Integer> G;
    public int H;
    public C4945kk1 I;
    public List<Integer> J;
    public C5578nk1 K;
    public byte L;
    public int M;
    public final AbstractC1724Ow e;
    public int g;
    public int h;
    public int i;
    public int j;
    public List<C4735jk1> k;
    public List<C4267hk1> l;
    public List<Integer> m;
    public int n;
    public List<Integer> o;
    public int p;
    public List<C4267hk1> q;
    public List<Integer> r;
    public int s;
    public List<C2155Uj1> t;
    public List<C2575Zj1> u;
    public List<C3637ek1> v;
    public List<C4476ik1> w;
    public List<C2419Xj1> x;
    public List<Integer> y;
    public int z;

    /* JADX INFO: renamed from: Tj1$a */
    public static class a extends Q0<C2077Tj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C2077Tj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Tj1$b */
    public static final class b extends AbstractC0673Bk0.b<C2077Tj1, b> {
        public List<Integer> A;
        public List<C4267hk1> B;
        public List<Integer> C;
        public C4945kk1 D;
        public List<Integer> E;
        public C5578nk1 F;
        public int h;
        public int i = 6;
        public int j;
        public int k;
        public List<C4735jk1> l;
        public List<C4267hk1> m;
        public List<Integer> n;
        public List<Integer> o;
        public List<C4267hk1> p;
        public List<Integer> q;
        public List<C2155Uj1> r;
        public List<C2575Zj1> s;
        public List<C3637ek1> t;
        public List<C4476ik1> u;
        public List<C2419Xj1> v;
        public List<Integer> w;
        public int x;
        public C4267hk1 y;
        public int z;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.l = list;
            this.m = list;
            this.n = list;
            this.o = list;
            this.p = list;
            this.q = list;
            this.r = list;
            this.s = list;
            this.t = list;
            this.u = list;
            this.v = list;
            this.w = list;
            this.y = C4267hk1.x;
            this.A = list;
            this.B = list;
            this.C = list;
            this.D = C4945kk1.k;
            this.E = list;
            this.F = C5578nk1.i;
        }

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            o(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C2077Tj1 c2077Tj1M = m();
            if (c2077Tj1M.d()) {
                return c2077Tj1M;
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
            n((C2077Tj1) abstractC0673Bk0);
            return this;
        }

        public final C2077Tj1 m() {
            C2077Tj1 c2077Tj1 = new C2077Tj1(this);
            int i = this.h;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c2077Tj1.h = this.i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c2077Tj1.i = this.j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c2077Tj1.j = this.k;
            if ((i & 8) == 8) {
                this.l = Collections.unmodifiableList(this.l);
                this.h &= -9;
            }
            c2077Tj1.k = this.l;
            if ((this.h & 16) == 16) {
                this.m = Collections.unmodifiableList(this.m);
                this.h &= -17;
            }
            c2077Tj1.l = this.m;
            if ((this.h & 32) == 32) {
                this.n = Collections.unmodifiableList(this.n);
                this.h &= -33;
            }
            c2077Tj1.m = this.n;
            if ((this.h & 64) == 64) {
                this.o = Collections.unmodifiableList(this.o);
                this.h &= -65;
            }
            c2077Tj1.o = this.o;
            if ((this.h & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                this.p = Collections.unmodifiableList(this.p);
                this.h &= -129;
            }
            c2077Tj1.q = this.p;
            if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                this.q = Collections.unmodifiableList(this.q);
                this.h &= -257;
            }
            c2077Tj1.r = this.q;
            if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                this.r = Collections.unmodifiableList(this.r);
                this.h &= -513;
            }
            c2077Tj1.t = this.r;
            if ((this.h & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                this.s = Collections.unmodifiableList(this.s);
                this.h &= -1025;
            }
            c2077Tj1.u = this.s;
            if ((this.h & 2048) == 2048) {
                this.t = Collections.unmodifiableList(this.t);
                this.h &= -2049;
            }
            c2077Tj1.v = this.t;
            if ((this.h & 4096) == 4096) {
                this.u = Collections.unmodifiableList(this.u);
                this.h &= -4097;
            }
            c2077Tj1.w = this.u;
            if ((this.h & 8192) == 8192) {
                this.v = Collections.unmodifiableList(this.v);
                this.h &= -8193;
            }
            c2077Tj1.x = this.v;
            if ((this.h & 16384) == 16384) {
                this.w = Collections.unmodifiableList(this.w);
                this.h &= -16385;
            }
            c2077Tj1.y = this.w;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            c2077Tj1.A = this.x;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            c2077Tj1.B = this.y;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            c2077Tj1.C = this.z;
            if ((this.h & 262144) == 262144) {
                this.A = Collections.unmodifiableList(this.A);
                this.h &= -262145;
            }
            c2077Tj1.D = this.A;
            if ((this.h & 524288) == 524288) {
                this.B = Collections.unmodifiableList(this.B);
                this.h &= -524289;
            }
            c2077Tj1.F = this.B;
            if ((this.h & 1048576) == 1048576) {
                this.C = Collections.unmodifiableList(this.C);
                this.h &= -1048577;
            }
            c2077Tj1.G = this.C;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            c2077Tj1.I = this.D;
            if ((this.h & 4194304) == 4194304) {
                this.E = Collections.unmodifiableList(this.E);
                this.h &= -4194305;
            }
            c2077Tj1.J = this.E;
            if ((i & 8388608) == 8388608) {
                i2 |= UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            c2077Tj1.K = this.F;
            c2077Tj1.g = i2;
            return c2077Tj1;
        }

        public final void n(C2077Tj1 c2077Tj1) {
            C5578nk1 c5578nk1;
            C4945kk1 c4945kk1;
            C4267hk1 c4267hk1;
            if (c2077Tj1 == C2077Tj1.N) {
                return;
            }
            int i = c2077Tj1.g;
            if ((i & 1) == 1) {
                int i2 = c2077Tj1.h;
                this.h = 1 | this.h;
                this.i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = c2077Tj1.i;
                this.h = 2 | this.h;
                this.j = i3;
            }
            if ((i & 4) == 4) {
                int i4 = c2077Tj1.j;
                this.h = 4 | this.h;
                this.k = i4;
            }
            if (!c2077Tj1.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = c2077Tj1.k;
                    this.h &= -9;
                } else {
                    if ((this.h & 8) != 8) {
                        this.l = new ArrayList(this.l);
                        this.h |= 8;
                    }
                    this.l.addAll(c2077Tj1.k);
                }
            }
            if (!c2077Tj1.l.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = c2077Tj1.l;
                    this.h &= -17;
                } else {
                    if ((this.h & 16) != 16) {
                        this.m = new ArrayList(this.m);
                        this.h |= 16;
                    }
                    this.m.addAll(c2077Tj1.l);
                }
            }
            if (!c2077Tj1.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = c2077Tj1.m;
                    this.h &= -33;
                } else {
                    if ((this.h & 32) != 32) {
                        this.n = new ArrayList(this.n);
                        this.h |= 32;
                    }
                    this.n.addAll(c2077Tj1.m);
                }
            }
            if (!c2077Tj1.o.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = c2077Tj1.o;
                    this.h &= -65;
                } else {
                    if ((this.h & 64) != 64) {
                        this.o = new ArrayList(this.o);
                        this.h |= 64;
                    }
                    this.o.addAll(c2077Tj1.o);
                }
            }
            if (!c2077Tj1.q.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = c2077Tj1.q;
                    this.h &= -129;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                        this.p = new ArrayList(this.p);
                        this.h |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    this.p.addAll(c2077Tj1.q);
                }
            }
            if (!c2077Tj1.r.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = c2077Tj1.r;
                    this.h &= -257;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                        this.q = new ArrayList(this.q);
                        this.h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    this.q.addAll(c2077Tj1.r);
                }
            }
            if (!c2077Tj1.t.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = c2077Tj1.t;
                    this.h &= -513;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                        this.r = new ArrayList(this.r);
                        this.h |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    this.r.addAll(c2077Tj1.t);
                }
            }
            if (!c2077Tj1.u.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = c2077Tj1.u;
                    this.h &= -1025;
                } else {
                    if ((this.h & UserVerificationMethods.USER_VERIFY_ALL) != 1024) {
                        this.s = new ArrayList(this.s);
                        this.h |= UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    this.s.addAll(c2077Tj1.u);
                }
            }
            if (!c2077Tj1.v.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = c2077Tj1.v;
                    this.h &= -2049;
                } else {
                    if ((this.h & 2048) != 2048) {
                        this.t = new ArrayList(this.t);
                        this.h |= 2048;
                    }
                    this.t.addAll(c2077Tj1.v);
                }
            }
            if (!c2077Tj1.w.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = c2077Tj1.w;
                    this.h &= -4097;
                } else {
                    if ((this.h & 4096) != 4096) {
                        this.u = new ArrayList(this.u);
                        this.h |= 4096;
                    }
                    this.u.addAll(c2077Tj1.w);
                }
            }
            if (!c2077Tj1.x.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = c2077Tj1.x;
                    this.h &= -8193;
                } else {
                    if ((this.h & 8192) != 8192) {
                        this.v = new ArrayList(this.v);
                        this.h |= 8192;
                    }
                    this.v.addAll(c2077Tj1.x);
                }
            }
            if (!c2077Tj1.y.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = c2077Tj1.y;
                    this.h &= -16385;
                } else {
                    if ((this.h & 16384) != 16384) {
                        this.w = new ArrayList(this.w);
                        this.h |= 16384;
                    }
                    this.w.addAll(c2077Tj1.y);
                }
            }
            int i5 = c2077Tj1.g;
            if ((i5 & 8) == 8) {
                int i6 = c2077Tj1.A;
                this.h |= 32768;
                this.x = i6;
            }
            if ((i5 & 16) == 16) {
                C4267hk1 c4267hk2 = c2077Tj1.B;
                if ((this.h & 65536) != 65536 || (c4267hk1 = this.y) == C4267hk1.x) {
                    this.y = c4267hk2;
                } else {
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk1);
                    cVarQ.n(c4267hk2);
                    this.y = cVarQ.m();
                }
                this.h |= 65536;
            }
            if ((c2077Tj1.g & 32) == 32) {
                int i7 = c2077Tj1.C;
                this.h |= 131072;
                this.z = i7;
            }
            if (!c2077Tj1.D.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = c2077Tj1.D;
                    this.h &= -262145;
                } else {
                    if ((this.h & 262144) != 262144) {
                        this.A = new ArrayList(this.A);
                        this.h |= 262144;
                    }
                    this.A.addAll(c2077Tj1.D);
                }
            }
            if (!c2077Tj1.F.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = c2077Tj1.F;
                    this.h &= -524289;
                } else {
                    if ((this.h & 524288) != 524288) {
                        this.B = new ArrayList(this.B);
                        this.h |= 524288;
                    }
                    this.B.addAll(c2077Tj1.F);
                }
            }
            if (!c2077Tj1.G.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = c2077Tj1.G;
                    this.h &= -1048577;
                } else {
                    if ((this.h & 1048576) != 1048576) {
                        this.C = new ArrayList(this.C);
                        this.h |= 1048576;
                    }
                    this.C.addAll(c2077Tj1.G);
                }
            }
            if ((c2077Tj1.g & 64) == 64) {
                C4945kk1 c4945kk2 = c2077Tj1.I;
                if ((this.h & 2097152) != 2097152 || (c4945kk1 = this.D) == C4945kk1.k) {
                    this.D = c4945kk2;
                } else {
                    C4945kk1.b bVarI = C4945kk1.i(c4945kk1);
                    bVarI.m(c4945kk2);
                    this.D = bVarI.l();
                }
                this.h |= 2097152;
            }
            if (!c2077Tj1.J.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = c2077Tj1.J;
                    this.h &= -4194305;
                } else {
                    if ((this.h & 4194304) != 4194304) {
                        this.E = new ArrayList(this.E);
                        this.h |= 4194304;
                    }
                    this.E.addAll(c2077Tj1.J);
                }
            }
            if ((c2077Tj1.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                C5578nk1 c5578nk2 = c2077Tj1.K;
                if ((this.h & 8388608) != 8388608 || (c5578nk1 = this.F) == C5578nk1.i) {
                    this.F = c5578nk2;
                } else {
                    C5578nk1.b bVar = new C5578nk1.b();
                    bVar.m(c5578nk1);
                    bVar.m(c5578nk2);
                    this.F = bVar.l();
                }
                this.h |= 8388608;
            }
            l(c2077Tj1);
            this.d = this.d.b(c2077Tj1.e);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void o(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C2077Tj1 c2077Tj1 = null;
            try {
                try {
                    C2077Tj1.O.getClass();
                    n(new C2077Tj1(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C2077Tj1 c2077Tj2 = (C2077Tj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c2077Tj1 = c2077Tj2;
                        if (c2077Tj1 != null) {
                            n(c2077Tj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c2077Tj1 != null) {
                    n(c2077Tj1);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Tj1$c */
    public enum c implements YB0.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(5),
        COMPANION_OBJECT(6);

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
        C2077Tj1 c2077Tj1 = new C2077Tj1(0);
        N = c2077Tj1;
        c2077Tj1.p();
    }

    public C2077Tj1() {
        throw null;
    }

    public C2077Tj1(b bVar) {
        super(bVar);
        this.n = -1;
        this.p = -1;
        this.s = -1;
        this.z = -1;
        this.E = -1;
        this.H = -1;
        this.L = (byte) -1;
        this.M = -1;
        this.e = bVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int iB = (this.g & 1) == 1 ? IE.b(1, this.h) : 0;
        int iC = 0;
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            iC += IE.c(this.m.get(i2).intValue());
        }
        int iD = iB + iC;
        if (!this.m.isEmpty()) {
            iD = iD + 1 + IE.c(iC);
        }
        this.n = iC;
        if ((this.g & 2) == 2) {
            iD += IE.b(3, this.i);
        }
        if ((this.g & 4) == 4) {
            iD += IE.b(4, this.j);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            iD += IE.d(5, this.k.get(i3));
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            iD += IE.d(6, this.l.get(i4));
        }
        int iC2 = 0;
        for (int i5 = 0; i5 < this.o.size(); i5++) {
            iC2 += IE.c(this.o.get(i5).intValue());
        }
        int iD2 = iD + iC2;
        if (!this.o.isEmpty()) {
            iD2 = iD2 + 1 + IE.c(iC2);
        }
        this.p = iC2;
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            iD2 += IE.d(8, this.t.get(i6));
        }
        for (int i7 = 0; i7 < this.u.size(); i7++) {
            iD2 += IE.d(9, this.u.get(i7));
        }
        for (int i8 = 0; i8 < this.v.size(); i8++) {
            iD2 += IE.d(10, this.v.get(i8));
        }
        for (int i9 = 0; i9 < this.w.size(); i9++) {
            iD2 += IE.d(11, this.w.get(i9));
        }
        for (int i10 = 0; i10 < this.x.size(); i10++) {
            iD2 += IE.d(13, this.x.get(i10));
        }
        int iC3 = 0;
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            iC3 += IE.c(this.y.get(i11).intValue());
        }
        int iD3 = iD2 + iC3;
        if (!this.y.isEmpty()) {
            iD3 = iD3 + 2 + IE.c(iC3);
        }
        this.z = iC3;
        if ((this.g & 8) == 8) {
            iD3 += IE.b(17, this.A);
        }
        if ((this.g & 16) == 16) {
            iD3 += IE.d(18, this.B);
        }
        if ((this.g & 32) == 32) {
            iD3 += IE.b(19, this.C);
        }
        for (int i12 = 0; i12 < this.q.size(); i12++) {
            iD3 += IE.d(20, this.q.get(i12));
        }
        int iC4 = 0;
        for (int i13 = 0; i13 < this.r.size(); i13++) {
            iC4 += IE.c(this.r.get(i13).intValue());
        }
        int iC5 = iD3 + iC4;
        if (!this.r.isEmpty()) {
            iC5 = iC5 + 2 + IE.c(iC4);
        }
        this.s = iC4;
        int iC6 = 0;
        for (int i14 = 0; i14 < this.D.size(); i14++) {
            iC6 += IE.c(this.D.get(i14).intValue());
        }
        int iD4 = iC5 + iC6;
        if (!this.D.isEmpty()) {
            iD4 = iD4 + 2 + IE.c(iC6);
        }
        this.E = iC6;
        for (int i15 = 0; i15 < this.F.size(); i15++) {
            iD4 += IE.d(23, this.F.get(i15));
        }
        int iC7 = 0;
        for (int i16 = 0; i16 < this.G.size(); i16++) {
            iC7 += IE.c(this.G.get(i16).intValue());
        }
        int iD5 = iD4 + iC7;
        if (!this.G.isEmpty()) {
            iD5 = iD5 + 2 + IE.c(iC7);
        }
        this.H = iC7;
        if ((this.g & 64) == 64) {
            iD5 += IE.d(30, this.I);
        }
        int iC8 = 0;
        for (int i17 = 0; i17 < this.J.size(); i17++) {
            iC8 += IE.c(this.J.get(i17).intValue());
        }
        int size = (this.J.size() * 2) + iD5 + iC8;
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            size += IE.d(32, this.K);
        }
        int size2 = this.e.size() + j() + size;
        this.M = size2;
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
        byte b2 = this.L;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.g & 2) != 2) {
            this.L = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!this.k.get(i).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (!this.l.get(i2).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            if (!this.q.get(i3).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            if (!this.t.get(i4).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            if (!this.u.get(i5).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.v.size(); i6++) {
            if (!this.v.get(i6).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.w.size(); i7++) {
            if (!this.w.get(i7).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.x.size(); i8++) {
            if (!this.x.get(i8).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if ((this.g & 16) == 16 && !this.B.d()) {
            this.L = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.F.size(); i9++) {
            if (!this.F.get(i9).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if ((this.g & 64) == 64 && !this.I.d()) {
            this.L = (byte) 0;
            return false;
        }
        if (i()) {
            this.L = (byte) 1;
            return true;
        }
        this.L = (byte) 0;
        return false;
    }

    @Override // defpackage.KZ0
    public final HZ0 e() {
        return N;
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
        if (this.m.size() > 0) {
            ie.v(18);
            ie.v(this.n);
        }
        for (int i = 0; i < this.m.size(); i++) {
            ie.n(this.m.get(i).intValue());
        }
        if ((this.g & 2) == 2) {
            ie.m(3, this.i);
        }
        if ((this.g & 4) == 4) {
            ie.m(4, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            ie.o(5, this.k.get(i2));
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            ie.o(6, this.l.get(i3));
        }
        if (this.o.size() > 0) {
            ie.v(58);
            ie.v(this.p);
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            ie.n(this.o.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.t.size(); i5++) {
            ie.o(8, this.t.get(i5));
        }
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            ie.o(9, this.u.get(i6));
        }
        for (int i7 = 0; i7 < this.v.size(); i7++) {
            ie.o(10, this.v.get(i7));
        }
        for (int i8 = 0; i8 < this.w.size(); i8++) {
            ie.o(11, this.w.get(i8));
        }
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            ie.o(13, this.x.get(i9));
        }
        if (this.y.size() > 0) {
            ie.v(130);
            ie.v(this.z);
        }
        for (int i10 = 0; i10 < this.y.size(); i10++) {
            ie.n(this.y.get(i10).intValue());
        }
        if ((this.g & 8) == 8) {
            ie.m(17, this.A);
        }
        if ((this.g & 16) == 16) {
            ie.o(18, this.B);
        }
        if ((this.g & 32) == 32) {
            ie.m(19, this.C);
        }
        for (int i11 = 0; i11 < this.q.size(); i11++) {
            ie.o(20, this.q.get(i11));
        }
        if (this.r.size() > 0) {
            ie.v(170);
            ie.v(this.s);
        }
        for (int i12 = 0; i12 < this.r.size(); i12++) {
            ie.n(this.r.get(i12).intValue());
        }
        if (this.D.size() > 0) {
            ie.v(178);
            ie.v(this.E);
        }
        for (int i13 = 0; i13 < this.D.size(); i13++) {
            ie.n(this.D.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.F.size(); i14++) {
            ie.o(23, this.F.get(i14));
        }
        if (this.G.size() > 0) {
            ie.v(194);
            ie.v(this.H);
        }
        for (int i15 = 0; i15 < this.G.size(); i15++) {
            ie.n(this.G.get(i15).intValue());
        }
        if ((this.g & 64) == 64) {
            ie.o(30, this.I);
        }
        for (int i16 = 0; i16 < this.J.size(); i16++) {
            ie.m(31, this.J.get(i16).intValue());
        }
        if ((this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            ie.o(32, this.K);
        }
        aVar.a(19000, ie);
        ie.r(this.e);
    }

    public final void p() {
        this.h = 6;
        this.i = 0;
        this.j = 0;
        List list = Collections.EMPTY_LIST;
        this.k = list;
        this.l = list;
        this.m = list;
        this.o = list;
        this.q = list;
        this.r = list;
        this.t = list;
        this.u = list;
        this.v = list;
        this.w = list;
        this.x = list;
        this.y = list;
        this.A = 0;
        this.B = C4267hk1.x;
        this.C = 0;
        this.D = list;
        this.F = list;
        this.G = list;
        this.I = C4945kk1.k;
        this.J = list;
        this.K = C5578nk1.i;
    }

    public C2077Tj1(int i) {
        this.n = -1;
        this.p = -1;
        this.s = -1;
        this.z = -1;
        this.E = -1;
        this.H = -1;
        this.L = (byte) -1;
        this.M = -1;
        this.e = AbstractC1724Ow.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C2077Tj1(EE ee, C1578Na0 c1578Na0) throws Throwable {
        this.n = -1;
        this.p = -1;
        this.s = -1;
        this.z = -1;
        this.E = -1;
        this.H = -1;
        this.L = (byte) -1;
        this.M = -1;
        p();
        AbstractC1724Ow.b bVarJ = AbstractC1724Ow.j();
        boolean z = true;
        IE ieJ = IE.j(bVarJ, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (!z2) {
                try {
                    try {
                        int iN = ee.n();
                        switch (iN) {
                            case 0:
                                z2 = z3;
                                z = z3;
                                break;
                            case 8:
                                this.g |= 1;
                                this.h = ee.f();
                                z = z3;
                                break;
                            case 16:
                                if ((i & 32) != 32) {
                                    this.m = new ArrayList();
                                    i |= 32;
                                }
                                this.m.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                int iD = ee.d(ee.k());
                                if ((i & 32) != 32 && ee.b() > 0) {
                                    this.m = new ArrayList();
                                    i |= 32;
                                }
                                while (ee.b() > 0) {
                                    this.m.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD);
                                z = z3;
                                break;
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                this.g |= 2;
                                this.i = ee.f();
                                z = z3;
                                break;
                            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                this.g |= 4;
                                this.j = ee.f();
                                z = z3;
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.k = new ArrayList();
                                    i |= 8;
                                }
                                this.k.add((C4735jk1) ee.g(C4735jk1.r, c1578Na0));
                                z = z3;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                if ((i & 16) != 16) {
                                    this.l = new ArrayList();
                                    i |= 16;
                                }
                                this.l.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                                z = z3;
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.o = new ArrayList();
                                    i |= 64;
                                }
                                this.o.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 58:
                                int iD2 = ee.d(ee.k());
                                if ((i & 64) != 64 && ee.b() > 0) {
                                    this.o = new ArrayList();
                                    i |= 64;
                                }
                                while (ee.b() > 0) {
                                    this.o.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD2);
                                z = z3;
                                break;
                            case 66:
                                if ((i & UserVerificationMethods.USER_VERIFY_NONE) != 512) {
                                    this.t = new ArrayList();
                                    i |= UserVerificationMethods.USER_VERIFY_NONE;
                                }
                                this.t.add((C2155Uj1) ee.g(C2155Uj1.n, c1578Na0));
                                z = z3;
                                break;
                            case 74:
                                if ((i & UserVerificationMethods.USER_VERIFY_ALL) != 1024) {
                                    this.u = new ArrayList();
                                    i |= UserVerificationMethods.USER_VERIFY_ALL;
                                }
                                this.u.add((C2575Zj1) ee.g(C2575Zj1.z, c1578Na0));
                                z = z3;
                                break;
                            case 82:
                                if ((i & 2048) != 2048) {
                                    this.v = new ArrayList();
                                    i |= 2048;
                                }
                                this.v.add((C3637ek1) ee.g(C3637ek1.z, c1578Na0));
                                z = z3;
                                break;
                            case 90:
                                if ((i & 4096) != 4096) {
                                    this.w = new ArrayList();
                                    i |= 4096;
                                }
                                this.w.add((C4476ik1) ee.g(C4476ik1.t, c1578Na0));
                                z = z3;
                                break;
                            case 106:
                                if ((i & 8192) != 8192) {
                                    this.x = new ArrayList();
                                    i |= 8192;
                                }
                                this.x.add((C2419Xj1) ee.g(C2419Xj1.l, c1578Na0));
                                z = z3;
                                break;
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                if ((i & 16384) != 16384) {
                                    this.y = new ArrayList();
                                    i |= 16384;
                                }
                                this.y.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 130:
                                int iD3 = ee.d(ee.k());
                                if ((i & 16384) != 16384 && ee.b() > 0) {
                                    this.y = new ArrayList();
                                    i |= 16384;
                                }
                                while (ee.b() > 0) {
                                    this.y.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD3);
                                z = z3;
                                break;
                            case 136:
                                this.g |= 8;
                                this.A = ee.f();
                                z = z3;
                                break;
                            case 146:
                                C4267hk1.c cVarR = (this.g & 16) == 16 ? this.B.b() : null;
                                C4267hk1 c4267hk1 = (C4267hk1) ee.g(C4267hk1.y, c1578Na0);
                                this.B = c4267hk1;
                                if (cVarR != 0) {
                                    cVarR.n(c4267hk1);
                                    this.B = cVarR.m();
                                }
                                this.g |= 16;
                                z = z3;
                                break;
                            case 152:
                                this.g |= 32;
                                this.C = ee.f();
                                z = z3;
                                break;
                            case 162:
                                if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) != 128) {
                                    this.q = new ArrayList();
                                    i |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                }
                                this.q.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                                z = z3;
                                break;
                            case 168:
                                if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                                    this.r = new ArrayList();
                                    i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                }
                                this.r.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 170:
                                int iD4 = ee.d(ee.k());
                                if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256 && ee.b() > 0) {
                                    this.r = new ArrayList();
                                    i |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                }
                                while (ee.b() > 0) {
                                    this.r.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD4);
                                z = z3;
                                break;
                            case 176:
                                if ((i & 262144) != 262144) {
                                    this.D = new ArrayList();
                                    i |= 262144;
                                }
                                this.D.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 178:
                                int iD5 = ee.d(ee.k());
                                if ((i & 262144) != 262144 && ee.b() > 0) {
                                    this.D = new ArrayList();
                                    i |= 262144;
                                }
                                while (ee.b() > 0) {
                                    this.D.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD5);
                                z = z3;
                                break;
                            case 186:
                                if ((i & 524288) != 524288) {
                                    this.F = new ArrayList();
                                    i |= 524288;
                                }
                                this.F.add((C4267hk1) ee.g(C4267hk1.y, c1578Na0));
                                z = z3;
                                break;
                            case 192:
                                if ((i & 1048576) != 1048576) {
                                    this.G = new ArrayList();
                                    i |= 1048576;
                                }
                                this.G.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 194:
                                int iD6 = ee.d(ee.k());
                                if ((i & 1048576) != 1048576 && ee.b() > 0) {
                                    this.G = new ArrayList();
                                    i |= 1048576;
                                }
                                while (ee.b() > 0) {
                                    this.G.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD6);
                                z = z3;
                                break;
                            case 242:
                                C4945kk1.b bVarJ2 = (this.g & 64) == 64 ? this.I.j() : null;
                                C4945kk1 c4945kk1 = (C4945kk1) ee.g(C4945kk1.l, c1578Na0);
                                this.I = c4945kk1;
                                if (bVarJ2 != 0) {
                                    bVarJ2.m(c4945kk1);
                                    this.I = bVarJ2.l();
                                }
                                this.g |= 64;
                                z = z3;
                                break;
                            case 248:
                                if ((i & 4194304) != 4194304) {
                                    this.J = new ArrayList();
                                    i |= 4194304;
                                }
                                this.J.add(Integer.valueOf(ee.f()));
                                z = z3;
                                break;
                            case 250:
                                int iD7 = ee.d(ee.k());
                                if ((i & 4194304) != 4194304 && ee.b() > 0) {
                                    this.J = new ArrayList();
                                    i |= 4194304;
                                }
                                while (ee.b() > 0) {
                                    this.J.add(Integer.valueOf(ee.f()));
                                }
                                ee.c(iD7);
                                z = z3;
                                break;
                            case 258:
                                try {
                                    C5578nk1.b bVarI = (this.g & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 ? this.K.i() : null;
                                    C5578nk1 c5578nk1 = (C5578nk1) ee.g(C5578nk1.j, c1578Na0);
                                    this.K = c5578nk1;
                                    if (bVarI != 0) {
                                        bVarI.m(c5578nk1);
                                        this.K = bVarI.l();
                                    }
                                    this.g |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                    z = z3;
                                } catch (C7144vC0 e) {
                                    e = e;
                                    e.d = this;
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    C7144vC0 c7144vC0 = new C7144vC0(e.getMessage());
                                    c7144vC0.d = this;
                                    throw c7144vC0;
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i & 32) == 32) {
                                        this.m = Collections.unmodifiableList(this.m);
                                    }
                                    if ((i & 8) == 8) {
                                        this.k = Collections.unmodifiableList(this.k);
                                    }
                                    if ((i & 16) == 16) {
                                        this.l = Collections.unmodifiableList(this.l);
                                    }
                                    if ((i & 64) == 64) {
                                        this.o = Collections.unmodifiableList(this.o);
                                    }
                                    if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                                        this.t = Collections.unmodifiableList(this.t);
                                    }
                                    if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                                        this.u = Collections.unmodifiableList(this.u);
                                    }
                                    if ((i & 2048) == 2048) {
                                        this.v = Collections.unmodifiableList(this.v);
                                    }
                                    if ((i & 4096) == 4096) {
                                        this.w = Collections.unmodifiableList(this.w);
                                    }
                                    if ((i & 8192) == 8192) {
                                        this.x = Collections.unmodifiableList(this.x);
                                    }
                                    if ((i & 16384) == 16384) {
                                        this.y = Collections.unmodifiableList(this.y);
                                    }
                                    if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                        this.q = Collections.unmodifiableList(this.q);
                                    }
                                    if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                                        this.r = Collections.unmodifiableList(this.r);
                                    }
                                    if ((i & 262144) == 262144) {
                                        this.D = Collections.unmodifiableList(this.D);
                                    }
                                    if ((i & 524288) == 524288) {
                                        this.F = Collections.unmodifiableList(this.F);
                                    }
                                    if ((i & 1048576) == 1048576) {
                                        this.G = Collections.unmodifiableList(this.G);
                                    }
                                    if ((i & 4194304) == 4194304) {
                                        this.J = Collections.unmodifiableList(this.J);
                                    }
                                    try {
                                        ieJ.i();
                                        break;
                                    } catch (IOException unused) {
                                    } finally {
                                        this.e = bVarJ.g();
                                    }
                                    m();
                                    throw th;
                                }
                                break;
                            default:
                                if (!n(ee, ieJ, c1578Na0, iN)) {
                                    z2 = z3;
                                }
                                z = z3;
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (C7144vC0 e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            } else {
                if ((i & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i & 8) == 8) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 16) == 16) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i & 64) == 64) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i & 2048) == 2048) {
                    this.v = Collections.unmodifiableList(this.v);
                }
                if ((i & 4096) == 4096) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if ((i & 8192) == 8192) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if ((i & 16384) == 16384) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if ((i & 262144) == 262144) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i & 524288) == 524288) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if ((i & 1048576) == 1048576) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if ((i & 4194304) == 4194304) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                try {
                    ieJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.e = bVarJ.g();
                }
                m();
                return;
            }
        }
    }
}
