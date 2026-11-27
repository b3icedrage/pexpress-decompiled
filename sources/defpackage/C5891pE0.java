package defpackage;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5891pE0 {

    @NotNull
    public static final a a;

    @NotNull
    public static final b b;

    @NotNull
    public static final c c;

    @NotNull
    public static final HashMap d;

    /* JADX INFO: renamed from: pE0$a */
    public static class a extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable C5323mZ.b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return C5891pE0.c(interfaceC5938pU, interfaceC4675jU);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: pE0$b */
    public static class b extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable C5323mZ.b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return C5891pE0.b(bVar, interfaceC5938pU, interfaceC4675jU);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: pE0$c */
    public static class c extends QW {
        @Override // defpackage.AbstractC5533nZ
        public final boolean c(@Nullable C5323mZ.b bVar, @NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
            if (interfaceC4675jU != null) {
                return C5891pE0.b(bVar, interfaceC5938pU, interfaceC4675jU);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        a aVar = new a(C4373iF0.c);
        a = aVar;
        b bVar = new b(C4841kF0.c);
        b = bVar;
        c cVar = new c(C4631jF0.c);
        c = cVar;
        HashMap map = new HashMap();
        d = map;
        map.put(aVar.a, aVar);
        map.put(bVar.a, bVar);
        map.put(cVar.a, cVar);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(C5323mZ.b bVar, InterfaceC5938pU interfaceC5938pU, InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(1);
            throw null;
        }
        int i = C4432iZ.a;
        if (c(interfaceC5938pU instanceof InterfaceC1490Lx ? C4432iZ.t((InterfaceC1490Lx) interfaceC5938pU) : interfaceC5938pU, interfaceC4675jU)) {
            return true;
        }
        return C5323mZ.c.c(bVar, interfaceC5938pU, interfaceC4675jU);
    }

    public static boolean c(@NotNull InterfaceC5938pU interfaceC5938pU, @NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC5938pU == null) {
            a(2);
            throw null;
        }
        if (interfaceC4675jU == null) {
            a(3);
            throw null;
        }
        InterfaceC2392Xa1 interfaceC2392Xa1 = (InterfaceC2392Xa1) C4432iZ.i(interfaceC5938pU, InterfaceC2392Xa1.class, false);
        InterfaceC2392Xa1 interfaceC2392Xa2 = (InterfaceC2392Xa1) C4432iZ.i(interfaceC4675jU, InterfaceC2392Xa1.class, false);
        return (interfaceC2392Xa2 == null || interfaceC2392Xa1 == null || !interfaceC2392Xa1.c().equals(interfaceC2392Xa2.c())) ? false : true;
    }
}
