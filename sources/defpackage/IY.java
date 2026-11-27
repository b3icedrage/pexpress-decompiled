package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class IY {

    @NotNull
    public static final IY a = new IY();

    public static VN1 c(InterfaceC1335Jx interfaceC1335Jx) {
        while (interfaceC1335Jx instanceof InterfaceC1490Lx) {
            InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) interfaceC1335Jx;
            if (interfaceC1490Lx.h() != InterfaceC1490Lx.a.e) {
                break;
            }
            Collection<? extends InterfaceC1490Lx> collectionU = interfaceC1490Lx.u();
            Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
            interfaceC1335Jx = (InterfaceC1490Lx) CollectionsKt.V(collectionU);
            if (interfaceC1335Jx == null) {
                return null;
            }
        }
        return interfaceC1335Jx.i();
    }

    public final boolean a(@Nullable InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC4675jU interfaceC4675jU2, boolean z) {
        if ((interfaceC4675jU instanceof FC) && (interfaceC4675jU2 instanceof FC)) {
            return Intrinsics.a(((FC) interfaceC4675jU).p(), ((FC) interfaceC4675jU2).p());
        }
        if ((interfaceC4675jU instanceof H62) && (interfaceC4675jU2 instanceof H62)) {
            return b((H62) interfaceC4675jU, (H62) interfaceC4675jU2, z, FY.d);
        }
        if (!(interfaceC4675jU instanceof InterfaceC1335Jx) || !(interfaceC4675jU2 instanceof InterfaceC1335Jx)) {
            return ((interfaceC4675jU instanceof InterfaceC2392Xa1) && (interfaceC4675jU2 instanceof InterfaceC2392Xa1)) ? Intrinsics.a(((InterfaceC2392Xa1) interfaceC4675jU).c(), ((InterfaceC2392Xa1) interfaceC4675jU2).c()) : Intrinsics.a(interfaceC4675jU, interfaceC4675jU2);
        }
        InterfaceC1335Jx a2 = (InterfaceC1335Jx) interfaceC4675jU;
        InterfaceC1335Jx b = (InterfaceC1335Jx) interfaceC4675jU2;
        AbstractC6331rL0.a kotlinTypeRefiner = AbstractC6331rL0.a.e;
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!Intrinsics.a(a2, b)) {
            if (Intrinsics.a(a2.getName(), b.getName()) && ((!(a2 instanceof GY0) || !(b instanceof GY0) || ((GY0) a2).Q() == ((GY0) b).Q()) && ((!Intrinsics.a(a2.e(), b.e()) || (z && Intrinsics.a(c(a2), c(b)))) && !C4432iZ.o(a2) && !C4432iZ.o(b)))) {
                InterfaceC4675jU interfaceC4675jUE = a2.e();
                InterfaceC4675jU interfaceC4675jUE2 = b.e();
                if (((interfaceC4675jUE instanceof InterfaceC1490Lx) || (interfaceC4675jUE2 instanceof InterfaceC1490Lx)) ? false : a(interfaceC4675jUE, interfaceC4675jUE2, z)) {
                    GY gy = new GY(a2, b, z);
                    if (kotlinTypeRefiner == null) {
                        C1346Ka1.a(3);
                        throw null;
                    }
                    C1346Ka1 c1346Ka1 = new C1346Ka1(gy, kotlinTypeRefiner, AbstractC5912pL0.a.e);
                    Intrinsics.checkNotNullExpressionValue(c1346Ka1, "create(...)");
                    C1346Ka1.b.a aVarB = c1346Ka1.m(a2, b, null, true).b();
                    C1346Ka1.b.a aVar = C1346Ka1.b.a.d;
                    if (aVarB != aVar || c1346Ka1.m(b, a2, null, true).b() != aVar) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b(@NotNull H62 a2, @NotNull H62 b, boolean z, @NotNull Function2<? super InterfaceC4675jU, ? super InterfaceC4675jU, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.a(a2, b)) {
            return true;
        }
        if (Intrinsics.a(a2.e(), b.e())) {
            return false;
        }
        InterfaceC4675jU interfaceC4675jUE = a2.e();
        InterfaceC4675jU interfaceC4675jUE2 = b.e();
        return (((interfaceC4675jUE instanceof InterfaceC1490Lx) || (interfaceC4675jUE2 instanceof InterfaceC1490Lx)) ? equivalentCallables.invoke(interfaceC4675jUE, interfaceC4675jUE2).booleanValue() : a(interfaceC4675jUE, interfaceC4675jUE2, z)) && a2.l() == b.l();
    }
}
