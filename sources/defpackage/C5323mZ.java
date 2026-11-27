package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5323mZ {

    @NotNull
    public static final d a;

    @NotNull
    public static final e b;

    @NotNull
    public static final f c;

    @NotNull
    public static final g d;

    @NotNull
    public static final h e;

    @NotNull
    public static final i f;

    @NotNull
    public static final j g;

    @NotNull
    public static final k h;

    @NotNull
    public static final l i;
    public static final Map<AbstractC5533nZ, Integer> j;
    public static final h k;
    public static final a l;
    public static final b m;

    @Deprecated
    public static final c n;

    @NotNull
    public static final V01 o;

    @NotNull
    public static final HashMap p;

    /* JADX INFO: renamed from: mZ$a */
    public static class a implements InterfaceC1232Io1 {
        @Override // defpackage.InterfaceC1232Io1
        @NotNull
        public final AbstractC4649jL0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: mZ$b */
    public static class b implements InterfaceC1232Io1 {
        @Override // defpackage.InterfaceC1232Io1
        @NotNull
        public final AbstractC4649jL0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: mZ$c */
    public static class c implements InterfaceC1232Io1 {
        @Override // defpackage.InterfaceC1232Io1
        @NotNull
        public final AbstractC4649jL0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: mZ$d */
    public static class d extends QW {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r4v0, types: [jU, pU] */
        /* JADX WARN: Type inference failed for: r4v6, types: [jU] */
        /* JADX WARN: Type inference failed for: r4v7, types: [jU] */
        /* JADX WARN: Type inference failed for: r4v9, types: [jU] */
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (C4432iZ.s(interfaceC5938pU) && C4432iZ.f(interfaceC4675jU) != WN1.a) {
                return C5323mZ.d(interfaceC5938pU, interfaceC4675jU);
            }
            if (interfaceC5938pU instanceof InterfaceC3550eL) {
                ((InterfaceC3550eL) interfaceC5938pU).e();
            }
            while (interfaceC5938pU != 0) {
                interfaceC5938pU = interfaceC5938pU.e();
                if (((interfaceC5938pU instanceof FC) && !C4432iZ.l(interfaceC5938pU)) || (interfaceC5938pU instanceof InterfaceC2392Xa1)) {
                    break;
                }
            }
            if (interfaceC5938pU == 0) {
                return false;
            }
            while (interfaceC4675jU != null) {
                if (interfaceC5938pU == interfaceC4675jU) {
                    return true;
                }
                if (interfaceC4675jU instanceof InterfaceC2392Xa1) {
                    return (interfaceC5938pU instanceof InterfaceC2392Xa1) && ((InterfaceC2392Xa1) interfaceC5938pU).c().equals(((InterfaceC2392Xa1) interfaceC4675jU).c()) && C4432iZ.d(interfaceC4675jU).equals(C4432iZ.d(interfaceC5938pU));
                }
                interfaceC4675jU = interfaceC4675jU.e();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: mZ$e */
    public static class e extends QW {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            InterfaceC4675jU interfaceC4675jUI;
            if (interfaceC4675jU == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (!C5323mZ.a.c(bVar, interfaceC5938pU, interfaceC4675jU)) {
                return false;
            }
            if (bVar == C5323mZ.m) {
                return true;
            }
            if (bVar == C5323mZ.l || (interfaceC4675jUI = C4432iZ.i(interfaceC5938pU, FC.class, true)) == null || !(bVar instanceof AY1)) {
                return false;
            }
            return ((AY1) bVar).x().U0().equals(interfaceC4675jUI.U0());
        }
    }

    /* JADX INFO: renamed from: mZ$f */
    public static class f extends QW {
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
        
            if (defpackage.Z40.a(r0) == false) goto L49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC5533nZ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(@org.jetbrains.annotations.Nullable defpackage.C5323mZ.b r7, @org.jetbrains.annotations.NotNull defpackage.InterfaceC5938pU r8, @org.jetbrains.annotations.NotNull defpackage.InterfaceC4675jU r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L99
                java.lang.Class<FC> r2 = defpackage.FC.class
                jU r3 = defpackage.C4432iZ.i(r8, r2, r1)
                FC r3 = (defpackage.FC) r3
                r4 = 0
                jU r9 = defpackage.C4432iZ.i(r9, r2, r4)
                FC r9 = (defpackage.FC) r9
                if (r9 != 0) goto L16
                goto L4a
            L16:
                if (r3 == 0) goto L35
                boolean r5 = defpackage.C4432iZ.l(r3)
                if (r5 == 0) goto L35
                jU r3 = defpackage.C4432iZ.i(r3, r2, r1)
                FC r3 = (defpackage.FC) r3
                if (r3 == 0) goto L35
                oM1 r5 = r9.y()
                FC r3 = r3.U0()
                boolean r3 = defpackage.C4432iZ.r(r5, r3)
                if (r3 == 0) goto L35
                goto L8b
            L35:
                boolean r3 = r8 instanceof defpackage.InterfaceC1490Lx
                if (r3 == 0) goto L41
                r3 = r8
                Lx r3 = (defpackage.InterfaceC1490Lx) r3
                Lx r3 = defpackage.C4432iZ.t(r3)
                goto L42
            L41:
                r3 = r8
            L42:
                jU r2 = defpackage.C4432iZ.i(r3, r2, r1)
                FC r2 = (defpackage.FC) r2
                if (r2 != 0) goto L4b
            L4a:
                return r4
            L4b:
                oM1 r4 = r9.y()
                FC r2 = r2.U0()
                boolean r2 = defpackage.C4432iZ.r(r4, r2)
                if (r2 == 0) goto L90
                mZ$c r2 = defpackage.C5323mZ.n
                if (r7 != r2) goto L5e
                goto L90
            L5e:
                boolean r2 = r3 instanceof defpackage.InterfaceC1490Lx
                if (r2 != 0) goto L63
                goto L8b
            L63:
                boolean r2 = r3 instanceof defpackage.InterfaceC3550eL
                if (r2 == 0) goto L68
                goto L8b
            L68:
                mZ$b r2 = defpackage.C5323mZ.m
                if (r7 != r2) goto L6d
                goto L8b
            L6d:
                mZ$a r2 = defpackage.C5323mZ.l
                if (r7 == r2) goto L90
                if (r7 != 0) goto L74
                goto L90
            L74:
                boolean r2 = r7 instanceof defpackage.InterfaceC3373dV1
                if (r2 == 0) goto L8c
                r0 = r7
                dV1 r0 = (defpackage.InterfaceC3373dV1) r0
                jL0 r0 = r0.b()
                boolean r2 = defpackage.C4432iZ.r(r0, r9)
                if (r2 != 0) goto L8b
                boolean r0 = defpackage.Z40.a(r0)
                if (r0 == 0) goto L90
            L8b:
                return r1
            L8c:
                r7.getType()
                throw r0
            L90:
                jU r9 = r9.e()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L99:
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 1
                r9 = 0
                r0 = 2
                java.lang.String r1 = "from"
                r7[r9] = r1
                java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r7[r8] = r9
                java.lang.String r8 = "isVisible"
                r7[r0] = r8
                java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r7 = java.lang.String.format(r8, r7)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5323mZ.f.c(mZ$b, pU, jU):boolean");
        }
    }

    /* JADX INFO: renamed from: mZ$g */
    public static class g extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!C4432iZ.d(interfaceC4675jU).M(C4432iZ.d(interfaceC5938pU))) {
                return false;
            }
            C5323mZ.o.a(interfaceC5938pU, interfaceC4675jU);
            return true;
        }
    }

    /* JADX INFO: renamed from: mZ$h */
    public static class h extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: mZ$i */
    public static class i extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: mZ$j */
    public static class j extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: mZ$k */
    public static class k extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: mZ$l */
    public static class l extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        d dVar = new d(Xe2.e.c);
        a = dVar;
        e eVar = new e(Xe2.f.c);
        b = eVar;
        f fVar = new f(Xe2.g.c);
        c = fVar;
        g gVar = new g(Xe2.b.c);
        d = gVar;
        h hVar = new h(Xe2.h.c);
        e = hVar;
        i iVar = new i(Xe2.d.c);
        f = iVar;
        j jVar = new j(Xe2.a.c);
        g = jVar;
        k kVar = new k(Xe2.c.c);
        h = kVar;
        l lVar = new l(Xe2.i.c);
        i = lVar;
        AbstractC5533nZ[] elements = {dVar, eVar, gVar, iVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collections.unmodifiableSet(C1526Mj.H(elements));
        HashMap map = new HashMap(6);
        map.put(eVar, 0);
        map.put(dVar, 0);
        map.put(gVar, 1);
        map.put(fVar, 1);
        map.put(hVar, 2);
        j = Collections.unmodifiableMap(map);
        k = hVar;
        l = new a();
        m = new b();
        n = new c();
        try {
            Iterator it = Arrays.asList(new V01[0]).iterator();
            o = it.hasNext() ? (V01) it.next() : V01.a.a;
            p = new HashMap();
            f(dVar);
            f(eVar);
            f(fVar);
            f(gVar);
            f(hVar);
            f(iVar);
            f(jVar);
            f(kVar);
            f(lVar);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    @Nullable
    public static Integer b(@NotNull AbstractC5533nZ visibility, @NotNull AbstractC5533nZ visibility2) {
        if (visibility == null) {
            a(12);
            throw null;
        }
        if (visibility2 == null) {
            a(13);
            throw null;
        }
        Intrinsics.checkNotNullParameter(visibility2, "visibility");
        Integer numA = visibility.a().a(visibility2.a());
        if (numA != null) {
            return numA;
        }
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Integer numA2 = visibility2.a().a(visibility.a());
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    @Nullable
    public static InterfaceC5938pU c(@Nullable b bVar, @NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull InterfaceC4675jU interfaceC4675jU) {
        InterfaceC5938pU interfaceC5938pUC;
        if (interfaceC1490Lx == null) {
            a(8);
            throw null;
        }
        if (interfaceC4675jU == null) {
            a(9);
            throw null;
        }
        for (InterfaceC5938pU interfaceC5938pU = (InterfaceC5938pU) interfaceC1490Lx.U0(); interfaceC5938pU != null && interfaceC5938pU.d() != f; interfaceC5938pU = (InterfaceC5938pU) C4432iZ.i(interfaceC5938pU, InterfaceC5938pU.class, true)) {
            if (!interfaceC5938pU.d().c(bVar, interfaceC5938pU, interfaceC4675jU)) {
                return interfaceC5938pU;
            }
        }
        if (!(interfaceC1490Lx instanceof InterfaceC3085c62) || (interfaceC5938pUC = c(bVar, ((InterfaceC3085c62) interfaceC1490Lx).u0(), interfaceC4675jU)) == null) {
            return null;
        }
        return interfaceC5938pUC;
    }

    public static boolean d(@NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(7);
            throw null;
        }
        WN1 wn1F = C4432iZ.f(interfaceC4675jU);
        if (wn1F != WN1.a) {
            return wn1F.equals(C4432iZ.f(interfaceC5938pU));
        }
        return false;
    }

    public static boolean e(@NotNull AbstractC5533nZ abstractC5533nZ) {
        if (abstractC5533nZ != null) {
            return abstractC5533nZ == a || abstractC5533nZ == b;
        }
        a(14);
        throw null;
    }

    public static void f(QW qw) {
        p.put(qw.a, qw);
    }

    @NotNull
    public static AbstractC5533nZ g(@NotNull AbstractC2766af2 abstractC2766af2) {
        if (abstractC2766af2 == null) {
            a(15);
            throw null;
        }
        AbstractC5533nZ abstractC5533nZ = (AbstractC5533nZ) p.get(abstractC2766af2);
        if (abstractC5533nZ != null) {
            return abstractC5533nZ;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC2766af2);
    }
}
