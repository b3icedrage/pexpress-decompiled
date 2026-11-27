package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: oc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5756oc1 {
    public final ArrayList a;
    public int b = 0;

    public C5756oc1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final C6699t51 a() throws C2900bD1 {
        C6699t51 c6699t51;
        C3271d02 c3271d02C = c();
        int iOrdinal = c3271d02C.a.ordinal();
        C6699t51.a aVar = C6699t51.a.d;
        if (iOrdinal != 0) {
            C3271d02.a aVar2 = C3271d02.a.h;
            C3271d02.a aVar3 = C3271d02.a.i;
            if (iOrdinal == 1) {
                b();
                C6699t51 c6699t52 = new C6699t51(C6699t51.a.e, a());
                C3271d02 c3271d02C2 = c();
                if (c3271d02C2 != null && c3271d02C2.a == aVar3) {
                    b();
                    c6699t52.c = a();
                }
                C3271d02 c3271d02C3 = c();
                if (c3271d02C3 == null) {
                    throw new IllegalArgumentException("All tokens consumed but was expecting \"}\"");
                }
                if (c3271d02C3.a != aVar2) {
                    throw new C2900bD1("Expecting }");
                }
                b();
                c6699t51 = c6699t52;
            } else if (iOrdinal != 2) {
                c6699t51 = null;
            } else {
                b();
                C6699t51 c6699t51A = a();
                C3271d02 c3271d02C4 = c();
                if (c3271d02C4 != null && c3271d02C4.a == aVar3) {
                    b();
                    C6699t51 c6699t53 = new C6699t51(aVar, ":-");
                    c6699t51A.getClass();
                    C6699t51 c6699t54 = c6699t51A;
                    while (true) {
                        C6699t51 c6699t55 = c6699t54.d;
                        if (c6699t55 == null) {
                            break;
                        }
                        c6699t54 = c6699t55;
                    }
                    c6699t54.d = c6699t53;
                    C6699t51 c6699t51A2 = a();
                    if (c6699t51A2 != null) {
                        C6699t51 c6699t56 = c6699t51A;
                        while (true) {
                            C6699t51 c6699t57 = c6699t56.d;
                            if (c6699t57 == null) {
                                break;
                            }
                            c6699t56 = c6699t57;
                        }
                        c6699t56.d = c6699t51A2;
                    }
                }
                C3271d02 c3271d02C5 = c();
                if (c3271d02C5 == null) {
                    throw new IllegalArgumentException("All tokens consumed but was expecting \"}\"");
                }
                if (c3271d02C5.a != aVar2) {
                    throw new C2900bD1("Expecting }");
                }
                b();
                c6699t51 = new C6699t51(aVar, C3766fN.b);
                if (c6699t51A != null) {
                    C6699t51 c6699t58 = c6699t51;
                    while (true) {
                        C6699t51 c6699t59 = c6699t58.d;
                        if (c6699t59 == null) {
                            break;
                        }
                        c6699t58 = c6699t59;
                    }
                    c6699t58.d = c6699t51A;
                }
                C6699t51 c6699t510 = new C6699t51(aVar, C3766fN.c);
                C6699t51 c6699t511 = c6699t51;
                while (true) {
                    C6699t51 c6699t512 = c6699t511.d;
                    if (c6699t512 == null) {
                        break;
                    }
                    c6699t511 = c6699t512;
                }
                c6699t511.d = c6699t510;
            }
        } else {
            b();
            c6699t51 = new C6699t51(aVar, c3271d02C.b);
        }
        if (c6699t51 == null) {
            return null;
        }
        C6699t51 c6699t51A3 = c() != null ? a() : null;
        if (c6699t51A3 == null) {
            return c6699t51;
        }
        C6699t51 c6699t513 = c6699t51;
        while (true) {
            C6699t51 c6699t514 = c6699t513.d;
            if (c6699t514 == null) {
                c6699t513.d = c6699t51A3;
                return c6699t51;
            }
            c6699t513 = c6699t514;
        }
    }

    public final void b() {
        this.b++;
    }

    public final C3271d02 c() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            return (C3271d02) arrayList.get(this.b);
        }
        return null;
    }
}
