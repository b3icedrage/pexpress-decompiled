package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7138vA0 {
    public static final /* synthetic */ int a = 0;

    static {
        C1758Ph0 topLevelFqName = new C1758Ph0("kotlin.jvm.JvmInline");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 packageFqName = topLevelFqName.e();
        C5638o21 topLevelName = SI0.a(packageFqName, "parent(...)", topLevelFqName, "shortName(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        C1758Ph0 relativeClassName = C1758Ph0.j(topLevelName);
        Intrinsics.checkNotNullExpressionValue(relativeClassName, "topLevel(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.d();
    }

    public static final boolean a(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        Rc2<AbstractC5706oM1> rc2F0;
        Intrinsics.checkNotNullParameter(interfaceC1490Lx, "<this>");
        if (!(interfaceC1490Lx instanceof InterfaceC0905Ej1)) {
            return false;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1I0 = ((InterfaceC0905Ej1) interfaceC1490Lx).I0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1I0, "getCorrespondingProperty(...)");
        Intrinsics.checkNotNullParameter(interfaceC0671Bj1I0, "<this>");
        if (interfaceC0671Bj1I0.r0() != null) {
            return false;
        }
        InterfaceC4675jU interfaceC4675jUE = interfaceC0671Bj1I0.e();
        FC fc = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
        if (fc == null || (rc2F0 = fc.F0()) == null) {
            return false;
        }
        C5638o21 name = interfaceC0671Bj1I0.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return rc2F0.a(name);
    }

    public static final boolean b(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        return (interfaceC4675jU instanceof FC) && (((FC) interfaceC4675jU).F0() instanceof C6928uA0);
    }

    public static final boolean c(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC != null) {
            return b(interfaceC5044lDC);
        }
        return false;
    }

    public static final boolean d(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        return (interfaceC4675jU instanceof FC) && (((FC) interfaceC4675jU).F0() instanceof H11);
    }

    public static final boolean e(@NotNull InterfaceC2982bd2 interfaceC2982bd2) {
        Intrinsics.checkNotNullParameter(interfaceC2982bd2, "<this>");
        if (interfaceC2982bd2.r0() != null) {
            return false;
        }
        InterfaceC4675jU interfaceC4675jUE = interfaceC2982bd2.e();
        C5638o21 c5638o21 = null;
        FC fc = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
        if (fc != null) {
            int i = C4900kZ.a;
            Rc2<AbstractC5706oM1> rc2F0 = fc.F0();
            C6928uA0 c6928uA0 = rc2F0 instanceof C6928uA0 ? (C6928uA0) rc2F0 : null;
            if (c6928uA0 != null) {
                c5638o21 = c6928uA0.a;
            }
        }
        return Intrinsics.a(c5638o21, interfaceC2982bd2.getName());
    }

    public static final boolean f(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        return b(interfaceC4675jU) || d(interfaceC4675jU);
    }

    public static final boolean g(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC != null) {
            return f(interfaceC5044lDC);
        }
        return false;
    }

    public static final boolean h(@NotNull AbstractC4649jL0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        InterfaceC5044lD interfaceC5044lDC = receiver.V0().c();
        if (interfaceC5044lDC == null || !d(interfaceC5044lDC)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return !C3089c72.e(receiver);
    }

    @Nullable
    public static final AbstractC5706oM1 i(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
        if (fc != null) {
            int i = C4900kZ.a;
            Rc2<AbstractC5706oM1> rc2F0 = fc.F0();
            C6928uA0 c6928uA0 = rc2F0 instanceof C6928uA0 ? (C6928uA0) rc2F0 : null;
            if (c6928uA0 != null) {
                return (AbstractC5706oM1) c6928uA0.b;
            }
        }
        return null;
    }
}
