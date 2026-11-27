package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FE {
    public final CE a;
    public int b;
    public int c;
    public int d = 0;

    public FE(CE ce) {
        VB0.a(ce, "input");
        this.a = ce;
        ce.d = this;
    }

    public static void y(int i) throws C6724tC0 {
        if ((i & 3) != 0) {
            throw new C6724tC0("Failed to parse the message.");
        }
    }

    public static void z(int i) throws C6724tC0 {
        if ((i & 7) != 0) {
            throw new C6724tC0("Failed to parse the message.");
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.v();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    public final <T> void b(T t, InterfaceC7989zD1<T> interfaceC7989zD1, C1423La0 c1423La0) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            interfaceC7989zD1.e(t, this, c1423La0);
            if (this.b != this.c) {
                throw new C6724tC0("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final <T> void c(T t, InterfaceC7989zD1<T> interfaceC7989zD1, C1423La0 c1423La0) throws C6724tC0 {
        CE ce = this.a;
        int iW = ce.w();
        if (ce.a >= ce.b) {
            throw new C6724tC0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iF = ce.f(iW);
        ce.a++;
        interfaceC7989zD1.e(t, this, c1423La0);
        ce.a(0);
        ce.a--;
        ce.e(iF);
    }

    public final void d(List<Boolean> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C0621At;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(ce.g()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Boolean.valueOf(ce.g()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        C0621At c0621At = (C0621At) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                c0621At.b(ce.g());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            c0621At.b(ce.g());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final AbstractC1565Mw e() throws C6724tC0.a {
        w(2);
        return this.a.h();
    }

    public final void f(List<AbstractC1565Mw> list) throws C6724tC0.a {
        int iV;
        if ((this.b & 7) != 2) {
            throw C6724tC0.b();
        }
        do {
            list.add(e());
            CE ce = this.a;
            if (ce.c()) {
                return;
            } else {
                iV = ce.v();
            }
        } while (iV == this.b);
        this.d = iV;
    }

    public final void g(List<Double> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof V20;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(ce.i()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iW = ce.w();
            z(iW);
            int iB = ce.b() + iW;
            do {
                list.add(Double.valueOf(ce.i()));
            } while (ce.b() < iB);
            return;
        }
        V20 v20 = (V20) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                v20.b(ce.i());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iW2 = ce.w();
        z(iW2);
        int iB2 = ce.b() + iW2;
        do {
            v20.b(ce.i());
        } while (ce.b() < iB2);
    }

    public final void h(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(ce.j()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Integer.valueOf(ce.j()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                c7982zB0.b(ce.j());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            c7982zB0.b(ce.j());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final Object i(EnumC6834tj2 enumC6834tj2, Class<?> cls, C1423La0 c1423La0) throws C6724tC0 {
        int iOrdinal = enumC6834tj2.ordinal();
        CE ce = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(ce.i());
            case 1:
                w(5);
                return Float.valueOf(ce.m());
            case 2:
                w(0);
                return Long.valueOf(ce.o());
            case 3:
                w(0);
                return Long.valueOf(ce.x());
            case 4:
                w(0);
                return Integer.valueOf(ce.n());
            case 5:
                w(1);
                return Long.valueOf(ce.l());
            case 6:
                w(5);
                return Integer.valueOf(ce.k());
            case 7:
                w(0);
                return Boolean.valueOf(ce.g());
            case 8:
                w(2);
                return ce.u();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                InterfaceC7989zD1 interfaceC7989zD1A = C0674Bk1.c.a(cls);
                Object objI = interfaceC7989zD1A.i();
                c(objI, interfaceC7989zD1A, c1423La0);
                interfaceC7989zD1A.b(objI);
                return objI;
            case 11:
                return e();
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                w(0);
                return Integer.valueOf(ce.w());
            case 13:
                w(0);
                return Integer.valueOf(ce.j());
            case 14:
                w(5);
                return Integer.valueOf(ce.p());
            case 15:
                w(1);
                return Long.valueOf(ce.q());
            case 16:
                w(0);
                return Integer.valueOf(ce.r());
            case 17:
                w(0);
                return Long.valueOf(ce.s());
        }
    }

    public final void j(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iW = ce.w();
                y(iW);
                int iB = ce.b() + iW;
                do {
                    list.add(Integer.valueOf(ce.k()));
                } while (ce.b() < iB);
                return;
            }
            if (i != 5) {
                throw C6724tC0.b();
            }
            do {
                list.add(Integer.valueOf(ce.k()));
                if (ce.c()) {
                    return;
                } else {
                    iV = ce.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iW2 = ce.w();
            y(iW2);
            int iB2 = ce.b() + iW2;
            do {
                c7982zB0.b(ce.k());
            } while (ce.b() < iB2);
            return;
        }
        if (i2 != 5) {
            throw C6724tC0.b();
        }
        do {
            c7982zB0.b(ce.k());
            if (ce.c()) {
                return;
            } else {
                iV2 = ce.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    public final void k(List<Long> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof AT0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(ce.l()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iW = ce.w();
            z(iW);
            int iB = ce.b() + iW;
            do {
                list.add(Long.valueOf(ce.l()));
            } while (ce.b() < iB);
            return;
        }
        AT0 at0 = (AT0) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                at0.b(ce.l());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iW2 = ce.w();
        z(iW2);
        int iB2 = ce.b() + iW2;
        do {
            at0.b(ce.l());
        } while (ce.b() < iB2);
    }

    public final void l(List<Float> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C3407df0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iW = ce.w();
                y(iW);
                int iB = ce.b() + iW;
                do {
                    list.add(Float.valueOf(ce.m()));
                } while (ce.b() < iB);
                return;
            }
            if (i != 5) {
                throw C6724tC0.b();
            }
            do {
                list.add(Float.valueOf(ce.m()));
                if (ce.c()) {
                    return;
                } else {
                    iV = ce.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        C3407df0 c3407df0 = (C3407df0) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iW2 = ce.w();
            y(iW2);
            int iB2 = ce.b() + iW2;
            do {
                c3407df0.b(ce.m());
            } while (ce.b() < iB2);
            return;
        }
        if (i2 != 5) {
            throw C6724tC0.b();
        }
        do {
            c3407df0.b(ce.m());
            if (ce.c()) {
                return;
            } else {
                iV2 = ce.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    public final void m(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(ce.n()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Integer.valueOf(ce.n()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                c7982zB0.b(ce.n());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            c7982zB0.b(ce.n());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void n(List<Long> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof AT0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(ce.o()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Long.valueOf(ce.o()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        AT0 at0 = (AT0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                at0.b(ce.o());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            at0.b(ce.o());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void o(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iW = ce.w();
                y(iW);
                int iB = ce.b() + iW;
                do {
                    list.add(Integer.valueOf(ce.p()));
                } while (ce.b() < iB);
                return;
            }
            if (i != 5) {
                throw C6724tC0.b();
            }
            do {
                list.add(Integer.valueOf(ce.p()));
                if (ce.c()) {
                    return;
                } else {
                    iV = ce.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iW2 = ce.w();
            y(iW2);
            int iB2 = ce.b() + iW2;
            do {
                c7982zB0.b(ce.p());
            } while (ce.b() < iB2);
            return;
        }
        if (i2 != 5) {
            throw C6724tC0.b();
        }
        do {
            c7982zB0.b(ce.p());
            if (ce.c()) {
                return;
            } else {
                iV2 = ce.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    public final void p(List<Long> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof AT0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(ce.q()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iW = ce.w();
            z(iW);
            int iB = ce.b() + iW;
            do {
                list.add(Long.valueOf(ce.q()));
            } while (ce.b() < iB);
            return;
        }
        AT0 at0 = (AT0) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                at0.b(ce.q());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iW2 = ce.w();
        z(iW2);
        int iB2 = ce.b() + iW2;
        do {
            at0.b(ce.q());
        } while (ce.b() < iB2);
    }

    public final void q(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(ce.r()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Integer.valueOf(ce.r()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                c7982zB0.b(ce.r());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            c7982zB0.b(ce.r());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void r(List<Long> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof AT0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(ce.s()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Long.valueOf(ce.s()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        AT0 at0 = (AT0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                at0.b(ce.s());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            at0.b(ce.s());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void s(List<String> list, boolean z) throws C6724tC0.a {
        String strT;
        int iV;
        int iV2;
        if ((this.b & 7) != 2) {
            throw C6724tC0.b();
        }
        boolean z2 = list instanceof InterfaceC3983gP0;
        CE ce = this.a;
        if (z2 && !z) {
            InterfaceC3983gP0 interfaceC3983gP0 = (InterfaceC3983gP0) list;
            do {
                e();
                interfaceC3983gP0.i0();
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        do {
            if (z) {
                w(2);
                strT = ce.u();
            } else {
                w(2);
                strT = ce.t();
            }
            list.add(strT);
            if (ce.c()) {
                return;
            } else {
                iV = ce.v();
            }
        } while (iV == this.b);
        this.d = iV;
    }

    public final void t(List<Integer> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof C7982zB0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(ce.w()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Integer.valueOf(ce.w()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                c7982zB0.b(ce.w());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            c7982zB0.b(ce.w());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void u(List<Long> list) throws C6724tC0 {
        int iV;
        int iV2;
        boolean z = list instanceof AT0;
        CE ce = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(ce.x()));
                    if (ce.c()) {
                        return;
                    } else {
                        iV = ce.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i != 2) {
                throw C6724tC0.b();
            }
            int iB = ce.b() + ce.w();
            do {
                list.add(Long.valueOf(ce.x()));
            } while (ce.b() < iB);
            v(iB);
            return;
        }
        AT0 at0 = (AT0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                at0.b(ce.x());
                if (ce.c()) {
                    return;
                } else {
                    iV2 = ce.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i2 != 2) {
            throw C6724tC0.b();
        }
        int iB2 = ce.b() + ce.w();
        do {
            at0.b(ce.x());
        } while (ce.b() < iB2);
        v(iB2);
    }

    public final void v(int i) throws C6724tC0 {
        if (this.a.b() != i) {
            throw C6724tC0.e();
        }
    }

    public final void w(int i) throws C6724tC0.a {
        if ((this.b & 7) != i) {
            throw C6724tC0.b();
        }
    }

    public final boolean x() {
        int i;
        CE ce = this.a;
        if (ce.c() || (i = this.b) == this.c) {
            return false;
        }
        return ce.y(i);
    }
}
