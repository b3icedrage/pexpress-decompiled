package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W extends B1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(@NotNull C2720aS0 c2720aS0) {
        super(c2720aS0);
        if (c2720aS0 != null) {
        } else {
            o(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void o(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC4834kD
    public final boolean g(@NotNull InterfaceC5044lD second) {
        boolean z;
        if (second instanceof FC) {
            FC first = c();
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (!Intrinsics.a(first.getName(), second.getName())) {
                z = false;
                break;
            }
            InterfaceC4675jU interfaceC4675jUE = first.e();
            InterfaceC4675jU interfaceC4675jUE2 = second.e();
            while (true) {
                if (interfaceC4675jUE != null && interfaceC4675jUE2 != null) {
                    if (!(interfaceC4675jUE instanceof S01)) {
                        if (!(interfaceC4675jUE2 instanceof S01)) {
                            if (interfaceC4675jUE instanceof InterfaceC2392Xa1) {
                                if (!(interfaceC4675jUE2 instanceof InterfaceC2392Xa1) || !Intrinsics.a(((InterfaceC2392Xa1) interfaceC4675jUE).c(), ((InterfaceC2392Xa1) interfaceC4675jUE2).c())) {
                                    break;
                                }
                            } else if (!(interfaceC4675jUE2 instanceof InterfaceC2392Xa1) && Intrinsics.a(interfaceC4675jUE.getName(), interfaceC4675jUE2.getName())) {
                                interfaceC4675jUE = interfaceC4675jUE.e();
                                interfaceC4675jUE2 = interfaceC4675jUE2.e();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = interfaceC4675jUE2 instanceof S01;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.B1
    @Nullable
    public final AbstractC4649jL0 i() {
        FC fcC = c();
        if (fcC == null) {
            RK0.a(108);
            throw null;
        }
        C5638o21 c5638o21 = RK0.e;
        if (RK0.b(fcC, C4194hP1.a.a) || RK0.b(fcC, C4194hP1.a.b)) {
            return null;
        }
        return t().e();
    }

    @Override // defpackage.B1
    @NotNull
    public final Collection<AbstractC4649jL0> j(boolean z) {
        InterfaceC4675jU interfaceC4675jUE = c().e();
        if (!(interfaceC4675jUE instanceof FC)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(3);
            throw null;
        }
        C3558eN1 c3558eN1 = new C3558eN1();
        FC fc = (FC) interfaceC4675jUE;
        c3558eN1.add(fc.y());
        FC fcA0 = fc.a0();
        if (z && fcA0 != null) {
            c3558eN1.add(fcA0.y());
        }
        return c3558eN1;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract FC c();

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        RK0 rk0E = C4900kZ.e(c());
        if (rk0E != null) {
            return rk0E;
        }
        o(1);
        throw null;
    }
}
