package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class HE0 extends C0749Cj1 implements InterfaceC2678aE0 {
    public final boolean E;

    @Nullable
    public final Pair<InterfaceC1335Jx.a<?>, ?> F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HE0(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, boolean z, @NotNull C5638o21 c5638o21, @NotNull VN1 vn1, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC1490Lx.a aVar, boolean z2, @Nullable Pair<InterfaceC1335Jx.a<?>, ?> pair) {
        super(interfaceC4675jU, interfaceC0671Bj1, interfaceC2396Xc, c01, abstractC5533nZ, z, c5638o21, aVar, vn1, false, false, false, false, false);
        if (interfaceC4675jU == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (c01 == null) {
            G0(2);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(3);
            throw null;
        }
        if (c5638o21 == null) {
            G0(4);
            throw null;
        }
        if (vn1 == null) {
            G0(5);
            throw null;
        }
        if (aVar == null) {
            G0(6);
            throw null;
        }
        this.E = z2;
        this.F = pair;
    }

    public static /* synthetic */ void G0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @NotNull
    public static HE0 b1(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull C6970uO0 c6970uO0, @NotNull AbstractC5533nZ abstractC5533nZ, boolean z, @NotNull C5638o21 c5638o21, @NotNull OE0 oe0, boolean z2) {
        C01 c01 = C01.e;
        if (interfaceC4675jU == null) {
            G0(7);
            throw null;
        }
        if (c5638o21 == null) {
            G0(11);
            throw null;
        }
        if (oe0 != null) {
            return new HE0(interfaceC4675jU, c6970uO0, c01, abstractC5533nZ, z, c5638o21, oe0, null, InterfaceC1490Lx.a.d, z2, null);
        }
        G0(12);
        throw null;
    }

    @Override // defpackage.C0749Cj1, defpackage.InterfaceC2982bd2
    public final boolean F() {
        AbstractC4649jL0 type = getType();
        if (!this.E) {
            return false;
        }
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (((!RK0.G(type) && !C7977z92.a(type)) || C3089c72.e(type)) && !RK0.H(type)) {
            return false;
        }
        C2878b70 c2878b70 = C7965z62.a;
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(C3136cM1.a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        C1758Ph0 ENHANCED_NULLABILITY_ANNOTATION = C3333dI0.p;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !InterfaceC4366iD.a.t(type, ENHANCED_NULLABILITY_ANNOTATION) || RK0.H(type);
    }

    @Override // defpackage.AbstractC3191cd2, defpackage.InterfaceC1335Jx
    public final boolean L() {
        return false;
    }

    @Override // defpackage.InterfaceC2678aE0
    @NotNull
    public final InterfaceC2678aE0 R0(@Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull ArrayList arrayList, @NotNull AbstractC4649jL0 abstractC4649jL1, @Nullable Pair pair) {
        C0983Fj1 c0983Fj1;
        C1687Oj1 c1687Oj1;
        if (abstractC4649jL1 == null) {
            G0(20);
            throw null;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1U0 = U0() == this ? null : U0();
        HE0 he0 = new HE0(e(), k(), q(), d(), this.j, getName(), i(), interfaceC0671Bj1U0, h(), this.E, pair);
        C0983Fj1 c0983Fj2 = this.A;
        if (c0983Fj2 != null) {
            C0983Fj1 c0983Fj3 = new C0983Fj1(he0, c0983Fj2.k(), c0983Fj2.q(), c0983Fj2.d(), c0983Fj2.i, c0983Fj2.j, c0983Fj2.m, h(), interfaceC0671Bj1U0 == null ? null : interfaceC0671Bj1U0.f(), c0983Fj2.i());
            c0983Fj3.p = c0983Fj2.p;
            c0983Fj3.q = abstractC4649jL1;
            c0983Fj1 = c0983Fj3;
        } else {
            c0983Fj1 = null;
        }
        C1687Oj1 c1687Oj2 = this.B;
        if (c1687Oj2 != null) {
            c1687Oj1 = new C1687Oj1(he0, c1687Oj2.k(), c1687Oj2.q(), c1687Oj2.d(), c1687Oj2.i, c1687Oj2.j, c1687Oj2.m, h(), interfaceC0671Bj1U0 == null ? null : interfaceC0671Bj1U0.g(), c1687Oj2.i());
            c1687Oj1.p = c1687Oj1.p;
            Xc2 xc2 = c1687Oj2.j().get(0);
            if (xc2 == null) {
                C1687Oj1.G0(6);
                throw null;
            }
            c1687Oj1.q = xc2;
        } else {
            c1687Oj1 = null;
        }
        he0.Y0(c0983Fj1, c1687Oj1, this.C, this.D);
        Function0<InterfaceC5868p71<CK<?>>> function0 = this.l;
        if (function0 != null) {
            he0.U0(this.k, function0);
        }
        he0.D0(u());
        he0.a1(abstractC4649jL1, w(), this.x, abstractC4649jL0 != null ? JY.h(this, abstractC4649jL0, InterfaceC2396Xc.a.a) : null, C5653o60.d);
        return he0;
    }

    @Override // defpackage.C0749Cj1, defpackage.InterfaceC1335Jx
    @Nullable
    public final <V> V T(InterfaceC1335Jx.a<V> aVar) {
        Pair<InterfaceC1335Jx.a<?>, ?> pair = this.F;
        if (pair == null || !pair.d.equals(aVar)) {
            return null;
        }
        return (V) pair.e;
    }

    @Override // defpackage.C0749Cj1
    @NotNull
    public final C0749Cj1 X0(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC1490Lx.a aVar, @NotNull C5638o21 c5638o21) {
        VN1.a aVar2 = VN1.a;
        if (interfaceC4675jU == null) {
            G0(13);
            throw null;
        }
        if (c01 == null) {
            G0(14);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(15);
            throw null;
        }
        if (aVar == null) {
            G0(16);
            throw null;
        }
        if (c5638o21 == null) {
            G0(17);
            throw null;
        }
        return new HE0(interfaceC4675jU, k(), c01, abstractC5533nZ, this.j, c5638o21, aVar2, interfaceC0671Bj1, aVar, this.E, this.F);
    }

    @Override // defpackage.C0749Cj1
    public final void Z0(@NotNull AbstractC4649jL0 abstractC4649jL0) {
    }
}
