package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4900kZ {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: kZ$a */
    public /* synthetic */ class a extends C2574Zj0 implements Function1<Xc2, Boolean> {
        public static final a m = new a(1);

        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Xc2 xc2) {
            Xc2 p0 = xc2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(p0.z0());
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.b(Xc2.class);
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "declaresDefaultValue()Z";
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(C5638o21.k(AppMeasurementSdk.ConditionalUserProperty.VALUE), "identifier(...)");
    }

    public static final boolean a(@NotNull Xc2 xc2) {
        Intrinsics.checkNotNullParameter(xc2, "<this>");
        Boolean boolD = C2943bS.d(VE.c(xc2), U0.i, a.m);
        Intrinsics.checkNotNullExpressionValue(boolD, "ifAny(...)");
        return boolD.booleanValue();
    }

    public static InterfaceC1490Lx b(InterfaceC1490Lx interfaceC1490Lx, Function1 predicate) {
        Intrinsics.checkNotNullParameter(interfaceC1490Lx, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (InterfaceC1490Lx) C2943bS.b(VE.c(interfaceC1490Lx), new ED(), new C5110lZ(new C3027bp1(), predicate));
    }

    @Nullable
    public static final C1758Ph0 c(@NotNull InterfaceC5095lU interfaceC5095lU) {
        Intrinsics.checkNotNullParameter(interfaceC5095lU, "<this>");
        C1836Qh0 c1836Qh0H = h(interfaceC5095lU);
        if (!c1836Qh0H.d()) {
            c1836Qh0H = null;
        }
        if (c1836Qh0H != null) {
            return c1836Qh0H.g();
        }
        return null;
    }

    @Nullable
    public static final FC d(@NotNull InterfaceC1583Nc interfaceC1583Nc) {
        Intrinsics.checkNotNullParameter(interfaceC1583Nc, "<this>");
        InterfaceC5044lD interfaceC5044lDC = interfaceC1583Nc.getType().V0().c();
        if (interfaceC5044lDC instanceof FC) {
            return (FC) interfaceC5044lDC;
        }
        return null;
    }

    @NotNull
    public static final RK0 e(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        return j(interfaceC4675jU).t();
    }

    @Nullable
    public static final QC f(@Nullable InterfaceC5044lD interfaceC5044lD) {
        InterfaceC4675jU interfaceC4675jUE;
        QC qcF;
        if (interfaceC5044lD == null || (interfaceC4675jUE = interfaceC5044lD.e()) == null) {
            return null;
        }
        if (interfaceC4675jUE instanceof InterfaceC2392Xa1) {
            C1758Ph0 c1758Ph0C = ((InterfaceC2392Xa1) interfaceC4675jUE).c();
            C5638o21 name = interfaceC5044lD.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new QC(c1758Ph0C, name);
        }
        if (!(interfaceC4675jUE instanceof InterfaceC5257mD) || (qcF = f((InterfaceC5044lD) interfaceC4675jUE)) == null) {
            return null;
        }
        C5638o21 name2 = interfaceC5044lD.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return qcF.d(name2);
    }

    @NotNull
    public static final C1758Ph0 g(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        if (interfaceC4675jU == null) {
            C4432iZ.a(3);
            throw null;
        }
        C1758Ph0 c1758Ph0H = C4432iZ.h(interfaceC4675jU);
        if (c1758Ph0H == null) {
            c1758Ph0H = C4432iZ.g(interfaceC4675jU.e()).b(interfaceC4675jU.getName()).g();
        }
        if (c1758Ph0H != null) {
            Intrinsics.checkNotNullExpressionValue(c1758Ph0H, "getFqNameSafe(...)");
            return c1758Ph0H;
        }
        C4432iZ.a(4);
        throw null;
    }

    @NotNull
    public static final C1836Qh0 h(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        C1836Qh0 c1836Qh0G = C4432iZ.g(interfaceC4675jU);
        Intrinsics.checkNotNullExpressionValue(c1836Qh0G, "getFqName(...)");
        return c1836Qh0G;
    }

    @NotNull
    public static final AbstractC6331rL0.a i(@NotNull S01 s01) {
        Intrinsics.checkNotNullParameter(s01, "<this>");
        return AbstractC6331rL0.a.e;
    }

    @NotNull
    public static final S01 j(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        S01 s01D = C4432iZ.d(interfaceC4675jU);
        Intrinsics.checkNotNullExpressionValue(s01D, "getContainingModule(...)");
        return s01D;
    }

    @NotNull
    public static final InterfaceC1490Lx k(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        Intrinsics.checkNotNullParameter(interfaceC1490Lx, "<this>");
        if (!(interfaceC1490Lx instanceof InterfaceC7043uj1)) {
            return interfaceC1490Lx;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1I0 = ((InterfaceC7043uj1) interfaceC1490Lx).I0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1I0, "getCorrespondingProperty(...)");
        return interfaceC0671Bj1I0;
    }

    @NotNull
    public static final C2139Ue0 l(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        Intrinsics.checkNotNullParameter(interfaceC1490Lx, "<this>");
        InterfaceC1490Lx[] elements = {interfaceC1490Lx};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence sequenceI = C1526Mj.i(elements);
        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC1490Lx.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        C2139Ue0 elements2 = JH1.k(CollectionsKt.y(collectionU), new QB(3));
        Intrinsics.checkNotNullParameter(sequenceI, "<this>");
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Sequence[] elements3 = {sequenceI, elements2};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        return FH1.c(C1526Mj.i(elements3));
    }
}
