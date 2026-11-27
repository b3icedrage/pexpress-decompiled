package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3089c72 {
    public static final O70 a = R70.c(Q70.DONT_CARE, new String[0]);
    public static final O70 b = R70.c(Q70.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    @NotNull
    public static final a c = new a("NO_EXPECTED_TYPE");
    public static final a d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: c72$a */
    public static class a extends AbstractC4216hX {
        public final String e;

        public a(String str) {
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        public static /* synthetic */ void h1(int i) {
            String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i == 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // defpackage.AbstractC4216hX, defpackage.AbstractC4649jL0
        @NotNull
        public final AbstractC4649jL0 X0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
            if (abstractC6331rL0 != null) {
                return this;
            }
            h1(3);
            throw null;
        }

        @Override // defpackage.AbstractC5706oM1, defpackage.P92
        @NotNull
        public final /* bridge */ /* synthetic */ P92 Z0(boolean z) {
            Z0(z);
            throw null;
        }

        @Override // defpackage.AbstractC4216hX, defpackage.P92
        @NotNull
        /* JADX INFO: renamed from: a1 */
        public final P92 X0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
            if (abstractC6331rL0 != null) {
                return this;
            }
            h1(3);
            throw null;
        }

        @Override // defpackage.AbstractC5706oM1, defpackage.P92
        @NotNull
        public final /* bridge */ /* synthetic */ P92 b1(@NotNull C5655o62 c5655o62) {
            b1(c5655o62);
            throw null;
        }

        @Override // defpackage.AbstractC5706oM1
        @NotNull
        /* JADX INFO: renamed from: c1 */
        public final AbstractC5706oM1 Z0(boolean z) {
            throw new IllegalStateException(this.e);
        }

        @Override // defpackage.AbstractC5706oM1
        @NotNull
        /* JADX INFO: renamed from: d1 */
        public final AbstractC5706oM1 b1(@NotNull C5655o62 c5655o62) {
            if (c5655o62 != null) {
                throw new IllegalStateException(this.e);
            }
            h1(0);
            throw null;
        }

        @Override // defpackage.AbstractC4216hX
        @NotNull
        public final AbstractC5706oM1 e1() {
            throw new IllegalStateException(this.e);
        }

        @Override // defpackage.AbstractC4216hX
        @NotNull
        /* JADX INFO: renamed from: f1 */
        public final AbstractC5706oM1 X0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
            if (abstractC6331rL0 != null) {
                return this;
            }
            h1(3);
            throw null;
        }

        @Override // defpackage.AbstractC4216hX
        @NotNull
        public final AbstractC4216hX g1(@NotNull AbstractC5706oM1 abstractC5706oM1) {
            throw new IllegalStateException(this.e);
        }

        @Override // defpackage.AbstractC5706oM1
        @NotNull
        public final String toString() {
            String str = this.e;
            if (str != null) {
                return str;
            }
            h1(1);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case RequestError.NETWORK_FAILURE /* 40 */:
            default:
                objArr[0] = "type";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = R51.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(28);
            throw null;
        }
        if (abstractC4649jL0.W0()) {
            return true;
        }
        if (!C6621sj.j(abstractC4649jL0)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        return b(((AbstractC2299We0) abstractC4649jL0.Y0()).g);
    }

    public static boolean c(@Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull Function1<P92, Boolean> function1, C3768fN1<AbstractC4649jL0> c3768fN1) {
        if (abstractC4649jL0 == null) {
            return false;
        }
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (n(abstractC4649jL0)) {
            return function1.invoke(p92Y0).booleanValue();
        }
        if (c3768fN1 != null && c3768fN1.contains(abstractC4649jL0)) {
            return false;
        }
        if (function1.invoke(p92Y0).booleanValue()) {
            return true;
        }
        if (c3768fN1 == null) {
            c3768fN1 = new C3768fN1<>();
        }
        c3768fN1.add(abstractC4649jL0);
        AbstractC2299We0 abstractC2299We0 = p92Y0 instanceof AbstractC2299We0 ? (AbstractC2299We0) p92Y0 : null;
        if (abstractC2299We0 != null && (c(abstractC2299We0.e, function1, c3768fN1) || c(abstractC2299We0.g, function1, c3768fN1))) {
            return true;
        }
        if ((p92Y0 instanceof BW) && c(((BW) p92Y0).e, function1, c3768fN1)) {
            return true;
        }
        InterfaceC6494s62 interfaceC6494s62V0 = abstractC4649jL0.V0();
        if (interfaceC6494s62V0 instanceof C4622jC0) {
            Iterator<AbstractC4649jL0> it = ((C4622jC0) interfaceC6494s62V0).b.iterator();
            while (it.hasNext()) {
                if (c(it.next(), function1, c3768fN1)) {
                    return true;
                }
            }
            return false;
        }
        for (N62 n62 : abstractC4649jL0.T0()) {
            if (!n62.c() && c(n62.getType(), function1, c3768fN1)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static List<N62> d(@NotNull List<H62> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<H62> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new P62(it.next().y()));
        }
        List<N62> listE0 = CollectionsKt.e0(arrayList);
        if (listE0 != null) {
            return listE0;
        }
        a(17);
        throw null;
    }

    public static boolean e(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(27);
            throw null;
        }
        if (abstractC4649jL0.W0()) {
            return true;
        }
        if (C6621sj.j(abstractC4649jL0)) {
            Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
            if (e(((AbstractC2299We0) abstractC4649jL0.Y0()).g)) {
                return true;
            }
        }
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        if (abstractC4649jL0.Y0() instanceof BW) {
            return false;
        }
        if (!f(abstractC4649jL0)) {
            if (abstractC4649jL0 instanceof AbstractC5632o1) {
                throw null;
            }
            InterfaceC6494s62 interfaceC6494s62V0 = abstractC4649jL0.V0();
            if (!(interfaceC6494s62V0 instanceof C4622jC0)) {
                return false;
            }
            Iterator<AbstractC4649jL0> it = ((C4622jC0) interfaceC6494s62V0).b.iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
            return false;
        }
        if (abstractC4649jL0 == null) {
            a(29);
            throw null;
        }
        if (!(abstractC4649jL0.V0().c() instanceof FC)) {
            X62 x62D = X62.d(abstractC4649jL0);
            Collection<AbstractC4649jL0> collectionA = abstractC4649jL0.V0().a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            for (AbstractC4649jL0 abstractC4649jL1 : collectionA) {
                if (abstractC4649jL1 == null) {
                    a(21);
                    throw null;
                }
                AbstractC4649jL0 abstractC4649jL0J = x62D.j(abstractC4649jL1, EnumC3610ed2.INVARIANT);
                AbstractC4649jL0 abstractC4649jL0I = abstractC4649jL0J != null ? i(abstractC4649jL0J, abstractC4649jL0.W0()) : null;
                if (abstractC4649jL0I != null) {
                    arrayList.add(abstractC4649jL0I);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (e((AbstractC4649jL0) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return (abstractC4649jL0.V0().c() instanceof H62 ? (H62) abstractC4649jL0.V0().c() : null) != null || (abstractC4649jL0.V0() instanceof C41);
        }
        a(60);
        throw null;
    }

    @NotNull
    public static P92 g(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return h(abstractC4649jL0, true);
        }
        a(1);
        throw null;
    }

    @NotNull
    public static P92 h(@NotNull AbstractC4649jL0 abstractC4649jL0, boolean z) {
        if (abstractC4649jL0 == null) {
            a(3);
            throw null;
        }
        P92 p92Z0 = abstractC4649jL0.Y0().Z0(z);
        if (p92Z0 != null) {
            return p92Z0;
        }
        a(4);
        throw null;
    }

    @NotNull
    public static AbstractC4649jL0 i(@NotNull AbstractC4649jL0 abstractC4649jL0, boolean z) {
        if (abstractC4649jL0 != null) {
            return z ? h(abstractC4649jL0, true) : abstractC4649jL0;
        }
        a(8);
        throw null;
    }

    @NotNull
    public static AbstractC5706oM1 j(@NotNull AbstractC5706oM1 abstractC5706oM1, boolean z) {
        if (abstractC5706oM1 == null) {
            a(5);
            throw null;
        }
        if (!z) {
            if (abstractC5706oM1 != null) {
                return abstractC5706oM1;
            }
            a(7);
            throw null;
        }
        AbstractC5706oM1 abstractC5706oM1Z0 = abstractC5706oM1.Z0(true);
        if (abstractC5706oM1Z0 != null) {
            return abstractC5706oM1Z0;
        }
        a(6);
        throw null;
    }

    @NotNull
    public static C4662jP1 k(@NotNull H62 h62) {
        if (h62 != null) {
            return new C4662jP1(h62);
        }
        a(45);
        throw null;
    }

    @NotNull
    public static O62 l(@NotNull H62 h62, VE0 ve0) {
        if (h62 != null) {
            return ve0.a == EnumC2880b72.d ? new P62(C5208m0.q(h62)) : new C4662jP1(h62);
        }
        a(46);
        throw null;
    }

    @NotNull
    public static AbstractC5706oM1 m(@NotNull InterfaceC6494s62 interfaceC6494s62, @NotNull QY0 qy0, @NotNull Function1<AbstractC6331rL0, AbstractC5706oM1> function1) {
        if (interfaceC6494s62 == null) {
            a(12);
            throw null;
        }
        if (qy0 == null) {
            a(13);
            throw null;
        }
        List<N62> listD = d(interfaceC6494s62.b());
        C5655o62.e.getClass();
        return C5492nL0.e(C5655o62.g, interfaceC6494s62, listD, false, qy0, function1);
    }

    public static boolean n(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return abstractC4649jL0 == c || abstractC4649jL0 == d;
        }
        a(0);
        throw null;
    }
}
