package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Sj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1999Sj1 extends AbstractC0673Bk0 implements KZ0 {
    public static final C1999Sj1 k;
    public static final a l = new a();
    public final AbstractC1724Ow d;
    public int e;
    public int g;
    public List<b> h;
    public byte i;
    public int j;

    /* JADX INFO: renamed from: Sj1$a */
    public static class a extends Q0<C1999Sj1> {
        @Override // defpackage.InterfaceC6176qc1
        public final Object a(EE ee, C1578Na0 c1578Na0) {
            return new C1999Sj1(ee, c1578Na0);
        }
    }

    /* JADX INFO: renamed from: Sj1$c */
    public static final class c extends AbstractC0673Bk0.a<C1999Sj1, c> implements KZ0 {
        public int e;
        public int g;
        public List<b> h = Collections.EMPTY_LIST;

        @Override // H0.a, HZ0.a
        public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
            n(ee, c1578Na0);
            return this;
        }

        @Override // HZ0.a
        public final HZ0 build() {
            C1999Sj1 c1999Sj1L = l();
            if (c1999Sj1L.d()) {
                return c1999Sj1L;
            }
            throw new C82();
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final Object clone() {
            c cVar = new c();
            cVar.m(l());
            return cVar;
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
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        @Override // defpackage.AbstractC0673Bk0.a
        public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
            m((C1999Sj1) abstractC0673Bk0);
            return this;
        }

        public final C1999Sj1 l() {
            C1999Sj1 c1999Sj1 = new C1999Sj1(this);
            int i = this.e;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c1999Sj1.g = this.g;
            if ((i & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
                this.e &= -3;
            }
            c1999Sj1.h = this.h;
            c1999Sj1.e = i2;
            return c1999Sj1;
        }

        public final void m(C1999Sj1 c1999Sj1) {
            if (c1999Sj1 == C1999Sj1.k) {
                return;
            }
            if ((c1999Sj1.e & 1) == 1) {
                int i = c1999Sj1.g;
                this.e = 1 | this.e;
                this.g = i;
            }
            if (!c1999Sj1.h.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = c1999Sj1.h;
                    this.e &= -3;
                } else {
                    if ((this.e & 2) != 2) {
                        this.h = new ArrayList(this.h);
                        this.e |= 2;
                    }
                    this.h.addAll(c1999Sj1.h);
                }
            }
            this.d = this.d.b(c1999Sj1.d);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0019  */
        public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
            C1999Sj1 c1999Sj1 = null;
            try {
                try {
                    m((C1999Sj1) C1999Sj1.l.a(ee, c1578Na0));
                } catch (C7144vC0 e) {
                    C1999Sj1 c1999Sj2 = (C1999Sj1) e.d;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c1999Sj1 = c1999Sj2;
                        if (c1999Sj1 != null) {
                            m(c1999Sj1);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c1999Sj1 != null) {
                    m(c1999Sj1);
                }
                throw th;
            }
        }
    }

    static {
        C1999Sj1 c1999Sj1 = new C1999Sj1();
        k = c1999Sj1;
        c1999Sj1.g = 0;
        c1999Sj1.h = Collections.EMPTY_LIST;
    }

    public C1999Sj1(c cVar) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = cVar.d;
    }

    @Override // defpackage.HZ0
    public final int a() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iB += IE.d(2, this.h.get(i2));
        }
        int size = this.d.size() + iB;
        this.j = size;
        return size;
    }

    @Override // defpackage.HZ0
    public final HZ0.a b() {
        c cVar = new c();
        cVar.m(this);
        return cVar;
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
        if ((this.e & 1) != 1) {
            this.i = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).d()) {
                this.i = (byte) 0;
                return false;
            }
        }
        this.i = (byte) 1;
        return true;
    }

    @Override // defpackage.HZ0
    public final HZ0.a g() {
        return new c();
    }

    @Override // defpackage.HZ0
    public final void h(IE ie) {
        a();
        if ((this.e & 1) == 1) {
            ie.m(1, this.g);
        }
        for (int i = 0; i < this.h.size(); i++) {
            ie.o(2, this.h.get(i));
        }
        ie.r(this.d);
    }

    /* JADX INFO: renamed from: Sj1$b */
    public static final class b extends AbstractC0673Bk0 implements KZ0 {
        public static final b k;
        public static final a l = new a();
        public final AbstractC1724Ow d;
        public int e;
        public int g;
        public c h;
        public byte i;
        public int j;

        /* JADX INFO: renamed from: Sj1$b$a */
        public static class a extends Q0<b> {
            @Override // defpackage.InterfaceC6176qc1
            public final Object a(EE ee, C1578Na0 c1578Na0) {
                return new b(ee, c1578Na0);
            }
        }

        /* JADX INFO: renamed from: Sj1$b$b, reason: collision with other inner class name */
        public static final class C0142b extends AbstractC0673Bk0.a<b, C0142b> implements KZ0 {
            public int e;
            public int g;
            public c h = c.t;

            @Override // H0.a, HZ0.a
            public final /* bridge */ /* synthetic */ HZ0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                m(ee, c1578Na0);
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
                C0142b c0142b = new C0142b();
                c0142b.n(l());
                return c0142b;
            }

            @Override // H0.a
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ H0.a U0(EE ee, C1578Na0 c1578Na0) throws Throwable {
                m(ee, c1578Na0);
                return this;
            }

            @Override // defpackage.AbstractC0673Bk0.a
            /* JADX INFO: renamed from: j */
            public final AbstractC0673Bk0.a clone() {
                C0142b c0142b = new C0142b();
                c0142b.n(l());
                return c0142b;
            }

            @Override // defpackage.AbstractC0673Bk0.a
            public final /* bridge */ /* synthetic */ AbstractC0673Bk0.a k(AbstractC0673Bk0 abstractC0673Bk0) {
                n((b) abstractC0673Bk0);
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

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void m(EE ee, C1578Na0 c1578Na0) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b.l.getClass();
                        n(new b(ee, c1578Na0));
                    } catch (C7144vC0 e) {
                        b bVar2 = (b) e.d;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                n(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        n(bVar);
                    }
                    throw th;
                }
            }

            public final void n(b bVar) {
                c cVar;
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
                    c cVar2 = bVar.h;
                    if ((this.e & 2) != 2 || (cVar = this.h) == c.t) {
                        this.h = cVar2;
                    } else {
                        c.C0143b c0143b = new c.C0143b();
                        c0143b.m(cVar);
                        c0143b.m(cVar2);
                        this.h = c0143b.l();
                    }
                    this.e |= 2;
                }
                this.d = this.d.b(bVar.d);
            }
        }

        static {
            b bVar = new b();
            k = bVar;
            bVar.g = 0;
            bVar.h = c.t;
        }

        public b(C0142b c0142b) {
            this.i = (byte) -1;
            this.j = -1;
            this.d = c0142b.d;
        }

        @Override // defpackage.HZ0
        public final int a() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? IE.b(1, this.g) : 0;
            if ((this.e & 2) == 2) {
                iB += IE.d(2, this.h);
            }
            int size = this.d.size() + iB;
            this.j = size;
            return size;
        }

        @Override // defpackage.HZ0
        public final HZ0.a b() {
            C0142b c0142b = new C0142b();
            c0142b.n(this);
            return c0142b;
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
            int i = this.e;
            if ((i & 1) != 1) {
                this.i = (byte) 0;
                return false;
            }
            if ((i & 2) != 2) {
                this.i = (byte) 0;
                return false;
            }
            if (this.h.d()) {
                this.i = (byte) 1;
                return true;
            }
            this.i = (byte) 0;
            return false;
        }

        @Override // defpackage.HZ0
        public final HZ0.a g() {
            return new C0142b();
        }

        @Override // defpackage.HZ0
        public final void h(IE ie) {
            a();
            if ((this.e & 1) == 1) {
                ie.m(1, this.g);
            }
            if ((this.e & 2) == 2) {
                ie.o(2, this.h);
            }
            ie.r(this.d);
        }

        /* JADX INFO: renamed from: Sj1$b$c */
        public static final class c extends AbstractC0673Bk0 implements KZ0 {
            public static final c t;
            public static final a u = new a();
            public final AbstractC1724Ow d;
            public int e;
            public EnumC0144c g;
            public long h;
            public float i;
            public double j;
            public int k;
            public int l;
            public int m;
            public C1999Sj1 n;
            public List<c> o;
            public int p;
            public int q;
            public byte r;
            public int s;

            /* JADX INFO: renamed from: Sj1$b$c$a */
            public static class a extends Q0<c> {
                @Override // defpackage.InterfaceC6176qc1
                public final Object a(EE ee, C1578Na0 c1578Na0) {
                    return new c(ee, c1578Na0);
                }
            }

            /* JADX INFO: renamed from: Sj1$b$c$b, reason: collision with other inner class name */
            public static final class C0143b extends AbstractC0673Bk0.a<c, C0143b> implements KZ0 {
                public int e;
                public long h;
                public float i;
                public double j;
                public int k;
                public int l;
                public int m;
                public int p;
                public int q;
                public EnumC0144c g = EnumC0144c.BYTE;
                public C1999Sj1 n = C1999Sj1.k;
                public List<c> o = Collections.EMPTY_LIST;

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
                    C0143b c0143b = new C0143b();
                    c0143b.m(l());
                    return c0143b;
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
                    C0143b c0143b = new C0143b();
                    c0143b.m(l());
                    return c0143b;
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
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.l = this.l;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.m = this.m;
                    if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        i2 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    cVar.n = this.n;
                    if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                        this.o = Collections.unmodifiableList(this.o);
                        this.e &= -257;
                    }
                    cVar.o = this.o;
                    if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        i2 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    cVar.p = this.p;
                    if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                        i2 |= UserVerificationMethods.USER_VERIFY_NONE;
                    }
                    cVar.q = this.q;
                    cVar.e = i2;
                    return cVar;
                }

                public final void m(c cVar) {
                    C1999Sj1 c1999Sj1;
                    if (cVar == c.t) {
                        return;
                    }
                    if ((cVar.e & 1) == 1) {
                        EnumC0144c enumC0144c = cVar.g;
                        enumC0144c.getClass();
                        this.e = 1 | this.e;
                        this.g = enumC0144c;
                    }
                    int i = cVar.e;
                    if ((i & 2) == 2) {
                        long j = cVar.h;
                        this.e |= 2;
                        this.h = j;
                    }
                    if ((i & 4) == 4) {
                        float f = cVar.i;
                        this.e = 4 | this.e;
                        this.i = f;
                    }
                    if ((i & 8) == 8) {
                        double d = cVar.j;
                        this.e |= 8;
                        this.j = d;
                    }
                    if ((i & 16) == 16) {
                        int i2 = cVar.k;
                        this.e = 16 | this.e;
                        this.k = i2;
                    }
                    if ((i & 32) == 32) {
                        int i3 = cVar.l;
                        this.e = 32 | this.e;
                        this.l = i3;
                    }
                    if ((i & 64) == 64) {
                        int i4 = cVar.m;
                        this.e = 64 | this.e;
                        this.m = i4;
                    }
                    if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                        C1999Sj1 c1999Sj2 = cVar.n;
                        if ((this.e & UserVerificationMethods.USER_VERIFY_PATTERN) != 128 || (c1999Sj1 = this.n) == C1999Sj1.k) {
                            this.n = c1999Sj2;
                        } else {
                            c cVar2 = new c();
                            cVar2.m(c1999Sj1);
                            cVar2.m(c1999Sj2);
                            this.n = cVar2.l();
                        }
                        this.e |= UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    if (!cVar.o.isEmpty()) {
                        if (this.o.isEmpty()) {
                            this.o = cVar.o;
                            this.e &= -257;
                        } else {
                            if ((this.e & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 256) {
                                this.o = new ArrayList(this.o);
                                this.e |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            this.o.addAll(cVar.o);
                        }
                    }
                    int i5 = cVar.e;
                    if ((i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                        int i6 = cVar.p;
                        this.e |= UserVerificationMethods.USER_VERIFY_NONE;
                        this.p = i6;
                    }
                    if ((i5 & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                        int i7 = cVar.q;
                        this.e |= UserVerificationMethods.USER_VERIFY_ALL;
                        this.q = i7;
                    }
                    this.d = this.d.b(cVar.d);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001b  */
                public final void n(EE ee, C1578Na0 c1578Na0) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c.u.getClass();
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

            /* JADX INFO: renamed from: Sj1$b$c$c, reason: collision with other inner class name */
            public enum EnumC0144c implements YB0.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);

                public final int d;

                EnumC0144c(int i) {
                    this.d = i;
                }

                public static EnumC0144c b(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // YB0.a
                public final int getNumber() {
                    return this.d;
                }
            }

            static {
                c cVar = new c();
                t = cVar;
                cVar.i();
            }

            public c(C0143b c0143b) {
                this.r = (byte) -1;
                this.s = -1;
                this.d = c0143b.d;
            }

            @Override // defpackage.HZ0
            public final int a() {
                int i = this.s;
                if (i != -1) {
                    return i;
                }
                int iA = (this.e & 1) == 1 ? IE.a(1, this.g.d) : 0;
                if ((this.e & 2) == 2) {
                    long j = this.h;
                    iA += IE.g((j >> 63) ^ (j << 1)) + IE.h(2);
                }
                if ((this.e & 4) == 4) {
                    iA += IE.h(3) + 4;
                }
                if ((this.e & 8) == 8) {
                    iA += IE.h(4) + 8;
                }
                if ((this.e & 16) == 16) {
                    iA += IE.b(5, this.k);
                }
                if ((this.e & 32) == 32) {
                    iA += IE.b(6, this.l);
                }
                if ((this.e & 64) == 64) {
                    iA += IE.b(7, this.m);
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    iA += IE.d(8, this.n);
                }
                for (int i2 = 0; i2 < this.o.size(); i2++) {
                    iA += IE.d(9, this.o.get(i2));
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    iA += IE.b(10, this.q);
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    iA += IE.b(11, this.p);
                }
                int size = this.d.size() + iA;
                this.s = size;
                return size;
            }

            @Override // defpackage.HZ0
            public final HZ0.a b() {
                C0143b c0143b = new C0143b();
                c0143b.m(this);
                return c0143b;
            }

            @Override // defpackage.KZ0
            public final boolean d() {
                byte b = this.r;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_PATTERN) == 128 && !this.n.d()) {
                    this.r = (byte) 0;
                    return false;
                }
                for (int i = 0; i < this.o.size(); i++) {
                    if (!this.o.get(i).d()) {
                        this.r = (byte) 0;
                        return false;
                    }
                }
                this.r = (byte) 1;
                return true;
            }

            @Override // defpackage.HZ0
            public final HZ0.a g() {
                return new C0143b();
            }

            @Override // defpackage.HZ0
            public final void h(IE ie) {
                a();
                if ((this.e & 1) == 1) {
                    ie.l(1, this.g.d);
                }
                if ((this.e & 2) == 2) {
                    long j = this.h;
                    ie.x(2, 0);
                    ie.w((j >> 63) ^ (j << 1));
                }
                if ((this.e & 4) == 4) {
                    float f = this.i;
                    ie.x(3, 5);
                    ie.t(Float.floatToRawIntBits(f));
                }
                if ((this.e & 8) == 8) {
                    double d = this.j;
                    ie.x(4, 1);
                    ie.u(Double.doubleToRawLongBits(d));
                }
                if ((this.e & 16) == 16) {
                    ie.m(5, this.k);
                }
                if ((this.e & 32) == 32) {
                    ie.m(6, this.l);
                }
                if ((this.e & 64) == 64) {
                    ie.m(7, this.m);
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    ie.o(8, this.n);
                }
                for (int i = 0; i < this.o.size(); i++) {
                    ie.o(9, this.o.get(i));
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_NONE) == 512) {
                    ie.m(10, this.q);
                }
                if ((this.e & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256) {
                    ie.m(11, this.p);
                }
                ie.r(this.d);
            }

            public final void i() {
                this.g = EnumC0144c.BYTE;
                this.h = 0L;
                this.i = 0.0f;
                this.j = 0.0d;
                this.k = 0;
                this.l = 0;
                this.m = 0;
                this.n = C1999Sj1.k;
                this.o = Collections.EMPTY_LIST;
                this.p = 0;
                this.q = 0;
            }

            public c() {
                this.r = (byte) -1;
                this.s = -1;
                this.d = AbstractC1724Ow.d;
            }

            public c(EE ee, C1578Na0 c1578Na0) {
                c cVar;
                this.r = (byte) -1;
                this.s = -1;
                i();
                AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
                IE ieJ = IE.j(bVar, 1);
                boolean z = false;
                char c = 0;
                while (!z) {
                    try {
                        try {
                            int iN = ee.n();
                            switch (iN) {
                                case 0:
                                    break;
                                case 8:
                                    int iK = ee.k();
                                    EnumC0144c enumC0144cB = EnumC0144c.b(iK);
                                    if (enumC0144cB == null) {
                                        ieJ.v(iN);
                                        ieJ.v(iK);
                                    } else {
                                        this.e |= 1;
                                        this.g = enumC0144cB;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.e |= 2;
                                    long jL = ee.l();
                                    this.h = (-(jL & 1)) ^ (jL >>> 1);
                                    continue;
                                case 29:
                                    this.e |= 4;
                                    this.i = Float.intBitsToFloat(ee.i());
                                    continue;
                                case 33:
                                    this.e |= 8;
                                    this.j = Double.longBitsToDouble(ee.j());
                                    continue;
                                case RequestError.NETWORK_FAILURE /* 40 */:
                                    this.e |= 16;
                                    this.k = ee.k();
                                    continue;
                                case 48:
                                    this.e |= 32;
                                    this.l = ee.k();
                                    continue;
                                case 56:
                                    this.e |= 64;
                                    this.m = ee.k();
                                    continue;
                                case 66:
                                    if ((this.e & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                                        C1999Sj1 c1999Sj1 = this.n;
                                        c1999Sj1.getClass();
                                        cVar = new c();
                                        cVar.m(c1999Sj1);
                                    } else {
                                        cVar = null;
                                    }
                                    C1999Sj1 c1999Sj2 = (C1999Sj1) ee.g(C1999Sj1.l, c1578Na0);
                                    this.n = c1999Sj2;
                                    if (cVar != null) {
                                        cVar.m(c1999Sj2);
                                        this.n = cVar.l();
                                    }
                                    this.e |= UserVerificationMethods.USER_VERIFY_PATTERN;
                                    continue;
                                case 74:
                                    if ((c & 256) != 256) {
                                        this.o = new ArrayList();
                                        c = 256;
                                    }
                                    this.o.add((c) ee.g(u, c1578Na0));
                                    continue;
                                case 80:
                                    this.e |= UserVerificationMethods.USER_VERIFY_NONE;
                                    this.q = ee.k();
                                    continue;
                                case 88:
                                    this.e |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                    this.p = ee.k();
                                    continue;
                                default:
                                    if (!ee.q(iN, ieJ)) {
                                        break;
                                    }
                                    break;
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
                        if ((c & 256) == 256) {
                            this.o = Collections.unmodifiableList(this.o);
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
                if ((c & 256) == 256) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                try {
                    ieJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.d = bVar.g();
                }
            }
        }

        public b() {
            this.i = (byte) -1;
            this.j = -1;
            this.d = AbstractC1724Ow.d;
        }

        public b(EE ee, C1578Na0 c1578Na0) {
            c.C0143b c0143b;
            this.i = (byte) -1;
            this.j = -1;
            boolean z = false;
            this.g = 0;
            this.h = c.t;
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
                            } else if (iN != 18) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                if ((this.e & 2) == 2) {
                                    c cVar = this.h;
                                    cVar.getClass();
                                    c0143b = new c.C0143b();
                                    c0143b.m(cVar);
                                } else {
                                    c0143b = null;
                                }
                                c cVar2 = (c) ee.g(c.u, c1578Na0);
                                this.h = cVar2;
                                if (c0143b != null) {
                                    c0143b.m(cVar2);
                                    this.h = c0143b.l();
                                }
                                this.e |= 2;
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

    public C1999Sj1() {
        this.i = (byte) -1;
        this.j = -1;
        this.d = AbstractC1724Ow.d;
    }

    public C1999Sj1(EE ee, C1578Na0 c1578Na0) {
        this.i = (byte) -1;
        this.j = -1;
        boolean z = false;
        this.g = 0;
        this.h = Collections.EMPTY_LIST;
        AbstractC1724Ow.b bVar = new AbstractC1724Ow.b();
        IE ieJ = IE.j(bVar, 1);
        char c2 = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = ee.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.e |= 1;
                                this.g = ee.k();
                            } else if (iN != 18) {
                                if (!ee.q(iN, ieJ)) {
                                }
                            } else {
                                if ((c2 & 2) != 2) {
                                    this.h = new ArrayList();
                                    c2 = 2;
                                }
                                this.h.add((b) ee.g(b.l, c1578Na0));
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
                if ((c2 & 2) == 2) {
                    this.h = Collections.unmodifiableList(this.h);
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
        if ((c2 & 2) == 2) {
            this.h = Collections.unmodifiableList(this.h);
        }
        try {
            ieJ.i();
        } catch (IOException unused2) {
        } finally {
            this.d = bVar.g();
        }
    }
}
