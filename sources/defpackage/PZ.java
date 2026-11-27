package defpackage;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PZ {

    @NotNull
    public static final Set<UK0.a> b = C5487nJ1.b(UK0.a.CLASS);

    @NotNull
    public static final Set<UK0.a> c;

    @NotNull
    public static final C7793yI0 d;

    @NotNull
    public static final C7793yI0 e;
    public C6163qZ a;

    static {
        UK0.a[] elements = {UK0.a.FILE_FACADE, UK0.a.MULTIFILE_CLASS_PART};
        Intrinsics.checkNotNullParameter(elements, "elements");
        c = C1526Mj.H(elements);
        new C7793yI0(1, 1, 2);
        d = new C7793yI0(1, 1, 11);
        e = new C7793yI0(1, 1, 13);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @Nullable
    public final C2626a00 a(@NotNull InterfaceC2392Xa1 descriptor, @NotNull InterfaceC2699aL0 kotlinClass) {
        String[] strArr;
        Pair<C8003zI0, C3218ck1> pairH;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        UK0 uk0A = kotlinClass.a();
        String[] strArr2 = uk0A.c;
        if (strArr2 == null) {
            strArr2 = uk0A.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains(uk0A.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = kotlinClass.a().e) != null) {
            try {
                try {
                    pairH = GI0.h(strArr2, strArr);
                } catch (C7144vC0 e2) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.d(), e2);
                }
            } catch (Throwable th) {
                c().c.getClass();
                if (kotlinClass.a().b.b(C5027l8.t(c().c))) {
                    throw th;
                }
                pairH = null;
            }
            if (pairH != null) {
                C8003zI0 c8003zI0 = pairH.d;
                C3218ck1 c3218ck1 = pairH.e;
                d(kotlinClass);
                e(kotlinClass);
                BI0 bi0 = new BI0(kotlinClass, c3218ck1, c8003zI0, b(kotlinClass));
                return new C2626a00(descriptor, c3218ck1, c8003zI0, kotlinClass.a().b, bi0, c(), "scope for " + bi0 + " in " + descriptor, OZ.d);
            }
        }
        return null;
    }

    public final LZ b(InterfaceC2699aL0 interfaceC2699aL0) {
        c().c.getClass();
        int i = interfaceC2699aL0.a().g;
        return ((i & 16) == 0 || (i & 32) != 0) ? LZ.d : LZ.e;
    }

    @NotNull
    public final C6163qZ c() {
        C6163qZ c6163qZ = this.a;
        if (c6163qZ != null) {
            return c6163qZ;
        }
        Intrinsics.l("components");
        throw null;
    }

    public final C7509wx0<C7793yI0> d(InterfaceC2699aL0 interfaceC2699aL0) {
        c().c.getClass();
        if (interfaceC2699aL0.a().b.b(C5027l8.t(c().c))) {
            return null;
        }
        C7793yI0 c7793yI0 = interfaceC2699aL0.a().b;
        C7793yI0 c7793yI1 = C7793yI0.g;
        C7793yI0 c7793yI0T = C5027l8.t(c().c);
        C7793yI0 c7793yI0T2 = C5027l8.t(c().c);
        C7793yI0 c7793yI2 = interfaceC2699aL0.a().b;
        c7793yI0T2.getClass();
        C7793yI0 c7793yI3 = c7793yI2.f ? c7793yI1 : C7793yI0.h;
        c7793yI3.getClass();
        int i = c7793yI0T2.b;
        int i2 = c7793yI3.b;
        if (i2 > i || (i2 >= i && c7793yI3.c > c7793yI0T2.c)) {
            c7793yI0T2 = c7793yI3;
        }
        return new C7509wx0<>(c7793yI0, c7793yI1, c7793yI0T, c7793yI0T2, interfaceC2699aL0.d(), interfaceC2699aL0.h());
    }

    public final boolean e(InterfaceC2699aL0 interfaceC2699aL0) {
        c().c.getClass();
        c().c.getClass();
        return (interfaceC2699aL0.a().g & 2) != 0 && interfaceC2699aL0.a().b.equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    @Nullable
    public final BC f(@NotNull InterfaceC2699aL0 kotlinClass) {
        Pair<C8003zI0, C2077Tj1> pairF;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        UK0 uk0A = kotlinClass.a();
        String[] strArr = uk0A.c;
        if (strArr == null) {
            strArr = uk0A.d;
        }
        if (strArr != null) {
            if (!b.contains(uk0A.a)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            String[] strArr2 = kotlinClass.a().e;
            try {
                if (strArr2 != null) {
                    try {
                        pairF = GI0.f(strArr, strArr2);
                        if (pairF != null) {
                            C8003zI0 c8003zI0 = pairF.d;
                            C2077Tj1 c2077Tj1 = pairF.e;
                            d(kotlinClass);
                            e(kotlinClass);
                            return new BC(c8003zI0, c2077Tj1, kotlinClass.a().b, new C3132cL0(kotlinClass, b(kotlinClass)));
                        }
                    } catch (C7144vC0 e2) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.d(), e2);
                    }
                }
            } catch (Throwable th) {
                c().c.getClass();
                if (kotlinClass.a().b.b(C5027l8.t(c().c))) {
                    throw th;
                }
                pairF = null;
            }
        }
        return null;
    }
}
