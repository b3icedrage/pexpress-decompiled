package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3111cE0 extends AC implements InterfaceC2678aE0 {
    public Boolean J;
    public Boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111cE0(@NotNull FC fc, @Nullable C3111cE0 c3111cE0, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        super(fc, c3111cE0, interfaceC2396Xc, z, aVar, vn1);
        if (fc == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (aVar == null) {
            G0(2);
            throw null;
        }
        if (vn1 == null) {
            G0(3);
            throw null;
        }
        this.J = null;
        this.K = null;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "newOwner";
                break;
            case 11:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static C3111cE0 i1(@NotNull FC fc, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull OE0 oe0) {
        if (fc == null) {
            G0(4);
            throw null;
        }
        if (oe0 != null) {
            return new C3111cE0(fc, null, interfaceC2396Xc, z, InterfaceC1490Lx.a.d, oe0);
        }
        G0(6);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1335Jx
    public final boolean L() {
        return this.K.booleanValue();
    }

    @Override // defpackage.InterfaceC2678aE0
    @NotNull
    public final InterfaceC2678aE0 R0(@Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull ArrayList arrayList, @NotNull AbstractC4649jL0 abstractC4649jL1, @Nullable Pair pair) {
        if (abstractC4649jL1 == null) {
            G0(17);
            throw null;
        }
        C3111cE0 c3111cE0J1 = j1(e(), null, h(), k(), i());
        c3111cE0J1.Y0(abstractC4649jL0 != null ? JY.h(c3111cE0J1, abstractC4649jL0, InterfaceC2396Xc.a.a) : null, this.n, C5653o60.d, w(), C1874Qu.g(arrayList, j(), c3111cE0J1), abstractC4649jL1, q(), d());
        if (pair != null) {
            c3111cE0J1.a1((InterfaceC1335Jx.a) pair.d, pair.e);
        }
        return c3111cE0J1;
    }

    @Override // defpackage.AC, defpackage.AbstractC2314Wj0
    @NotNull
    public final /* bridge */ /* synthetic */ AbstractC2314Wj0 V0(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 vn1) {
        return j1(interfaceC4675jU, interfaceC2076Tj0, aVar, interfaceC2396Xc, vn1);
    }

    @Override // defpackage.AbstractC2314Wj0
    public final void b1(boolean z) {
        this.J = Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC2314Wj0
    public final void c1(boolean z) {
        this.K = Boolean.valueOf(z);
    }

    @Override // defpackage.AC
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final /* bridge */ /* synthetic */ AC V0(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 vn1) {
        return j1(interfaceC4675jU, interfaceC2076Tj0, aVar, interfaceC2396Xc, vn1);
    }

    @NotNull
    public final C3111cE0 j1(@NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull VN1 vn1) {
        if (interfaceC4675jU == null) {
            G0(7);
            throw null;
        }
        if (aVar == null) {
            G0(8);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(9);
            throw null;
        }
        if (vn1 == null) {
            G0(10);
            throw null;
        }
        if (aVar != InterfaceC1490Lx.a.d && aVar != InterfaceC1490Lx.a.h) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC4675jU + "\nkind: " + aVar);
        }
        C3111cE0 c3111cE0 = new C3111cE0((FC) interfaceC4675jU, (C3111cE0) interfaceC2076Tj0, interfaceC2396Xc, this.I, aVar, vn1);
        Boolean bool = this.J;
        bool.getClass();
        c3111cE0.J = bool;
        Boolean bool2 = this.K;
        bool2.getClass();
        c3111cE0.K = bool2;
        return c3111cE0;
    }
}
