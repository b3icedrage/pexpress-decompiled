package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RK0 {
    public static final C5638o21 e = C5638o21.m("<built-ins module>");
    public T01 a;
    public final I51<a> b;
    public final UY0<C5638o21, FC> c;
    public final C2720aS0 d;

    public static class a {
        public final EnumMap a;
        public final HashMap b;

        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap map, HashMap map2) {
            this.a = enumMap;
            this.b = map2;
        }
    }

    public RK0(@NotNull C2720aS0 c2720aS0) {
        this.d = c2720aS0;
        c2720aS0.a(new XI0(this, 2));
        this.b = new C2720aS0.h(c2720aS0, new PK0(this));
        this.c = c2720aS0.e(new QK0(this, 0));
    }

    public static boolean A(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull C1836Qh0 c1836Qh0) {
        if (abstractC4649jL0 == null) {
            a(98);
            throw null;
        }
        if (c1836Qh0 != null) {
            return I(abstractC4649jL0.V0(), c1836Qh0);
        }
        a(99);
        throw null;
    }

    public static boolean B(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull C1836Qh0 c1836Qh0) {
        if (c1836Qh0 != null) {
            return A(abstractC4649jL0, c1836Qh0) && !abstractC4649jL0.W0();
        }
        a(136);
        throw null;
    }

    public static boolean C(@NotNull InterfaceC2076Tj0 interfaceC2076Tj0) {
        if (interfaceC2076Tj0.U0().k().P(C4194hP1.a.m)) {
            return true;
        }
        if (!(interfaceC2076Tj0 instanceof InterfaceC0671Bj1)) {
            return false;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) interfaceC2076Tj0;
        boolean zP0 = interfaceC0671Bj1.p0();
        C0983Fj1 c0983Fj1F = interfaceC0671Bj1.f();
        InterfaceC1609Nj1 interfaceC1609Nj1G = interfaceC0671Bj1.g();
        if (c0983Fj1F == null || !C(c0983Fj1F)) {
            return false;
        }
        if (zP0) {
            return interfaceC1609Nj1G != null && C(interfaceC1609Nj1G);
        }
        return true;
    }

    public static boolean D(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull C1836Qh0 c1836Qh0) {
        if (abstractC4649jL0 == null) {
            a(106);
            throw null;
        }
        if (c1836Qh0 != null) {
            return !abstractC4649jL0.W0() && A(abstractC4649jL0, c1836Qh0);
        }
        a(107);
        throw null;
    }

    public static boolean E(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(137);
            throw null;
        }
        if (abstractC4649jL0 != null) {
            return A(abstractC4649jL0, C4194hP1.a.b) && !C3089c72.e(abstractC4649jL0);
        }
        a(139);
        throw null;
    }

    public static boolean F(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
            return (interfaceC5044lDC == null || r(interfaceC5044lDC) == null) ? false : true;
        }
        a(92);
        throw null;
    }

    public static boolean G(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(95);
            throw null;
        }
        if (abstractC4649jL0.W0()) {
            return false;
        }
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (!(interfaceC5044lDC instanceof FC)) {
            return false;
        }
        FC fc = (FC) interfaceC5044lDC;
        if (fc != null) {
            return t(fc) != null;
        }
        a(97);
        throw null;
    }

    public static boolean H(@Nullable AbstractC4649jL0 abstractC4649jL0) {
        return D(abstractC4649jL0, C4194hP1.a.f);
    }

    public static boolean I(@NotNull InterfaceC6494s62 interfaceC6494s62, @NotNull C1836Qh0 c1836Qh0) {
        if (interfaceC6494s62 == null) {
            a(102);
            throw null;
        }
        if (c1836Qh0 != null) {
            InterfaceC5044lD interfaceC5044lDC = interfaceC6494s62.c();
            return (interfaceC5044lDC instanceof FC) && b((FC) interfaceC5044lDC, c1836Qh0);
        }
        a(103);
        throw null;
    }

    public static boolean J(@NotNull InterfaceC5044lD interfaceC5044lD) {
        if (interfaceC5044lD == null) {
            a(10);
            throw null;
        }
        for (InterfaceC4675jU interfaceC4675jUE = interfaceC5044lD; interfaceC4675jUE != null; interfaceC4675jUE = interfaceC4675jUE.e()) {
            if (interfaceC4675jUE instanceof InterfaceC2392Xa1) {
                return ((InterfaceC2392Xa1) interfaceC4675jUE).c().h(C4194hP1.k);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i2 = 2;
                break;
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "getKCallable";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[1] = "getMutableSet";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[1] = "getBooleanType";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(@NotNull FC fc, @NotNull C1836Qh0 c1836Qh0) {
        if (fc == null) {
            a(104);
            throw null;
        }
        if (c1836Qh0 != null) {
            return fc.getName().equals(c1836Qh0.f()) && c1836Qh0.equals(C4432iZ.g(fc));
        }
        a(105);
        throw null;
    }

    @Nullable
    public static EnumC6405rh1 r(@NotNull InterfaceC5044lD interfaceC5044lD) {
        if (interfaceC5044lD == null) {
            a(78);
            throw null;
        }
        if (C4194hP1.a.b0.contains(interfaceC5044lD.getName())) {
            return (EnumC6405rh1) C4194hP1.a.d0.get(C4432iZ.g(interfaceC5044lD));
        }
        return null;
    }

    @Nullable
    public static EnumC6405rh1 t(@NotNull FC fc) {
        if (fc == null) {
            a(77);
            throw null;
        }
        if (C4194hP1.a.a0.contains(fc.getName())) {
            return (EnumC6405rh1) C4194hP1.a.c0.get(C4432iZ.g(fc));
        }
        return null;
    }

    public static boolean x(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return A(abstractC4649jL0, C4194hP1.a.a);
        }
        a(140);
        throw null;
    }

    public static boolean y(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return A(abstractC4649jL0, C4194hP1.a.g);
        }
        a(89);
        throw null;
    }

    public static boolean z(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU != null) {
            return C4432iZ.i(interfaceC4675jU, InterfaceC8132zv.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fO0, java.lang.Object] */
    public final void c(boolean z) {
        C5638o21 moduleName = e;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        C2720aS0 storageManager = this.d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "builtIns");
        T01 t01 = new T01(moduleName, storageManager, this, 48);
        this.a = t01;
        InterfaceC7502wv.a.getClass();
        C2749ab1 providerForModuleContent = ((InterfaceC7502wv) InterfaceC7502wv.a.b.getValue()).a(storageManager, this.a, l(), p(), d(), z);
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        t01.l = providerForModuleContent;
        T01 t02 = this.a;
        t02.U0(t02);
    }

    @NotNull
    public InterfaceC5240m8 d() {
        return InterfaceC5240m8.a.a;
    }

    @NotNull
    public final AbstractC5706oM1 e() {
        AbstractC5706oM1 abstractC5706oM1Y = j("Any").y();
        if (abstractC5706oM1Y != null) {
            return abstractC5706oM1Y;
        }
        a(51);
        throw null;
    }

    @NotNull
    public final AbstractC4649jL0 f(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        QC arrayClassId;
        FC fcA;
        AbstractC5706oM1 abstractC5706oM1Y = null;
        if (abstractC4649jL0 == null) {
            a(68);
            throw null;
        }
        if (y(abstractC4649jL0)) {
            if (abstractC4649jL0.T0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC4649jL0 type = abstractC4649jL0.T0().get(0).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        P92 p92H = C3089c72.h(abstractC4649jL0, false);
        AbstractC4649jL0 abstractC4649jL1 = (AbstractC4649jL0) this.b.invoke().b.get(p92H);
        if (abstractC4649jL1 != null) {
            return abstractC4649jL1;
        }
        int i = C4432iZ.a;
        InterfaceC5044lD interfaceC5044lDC = p92H.V0().c();
        S01 s01E = interfaceC5044lDC == null ? null : C4432iZ.e(interfaceC5044lDC);
        if (s01E != null) {
            InterfaceC5044lD interfaceC5044lDC2 = p92H.V0().c();
            if (interfaceC5044lDC2 != null) {
                Set<C5638o21> set = C7977z92.a;
                C5638o21 name = interfaceC5044lDC2.getName();
                Intrinsics.checkNotNullParameter(name, "name");
                if (C7977z92.d.contains(name) && (arrayClassId = C4900kZ.f(interfaceC5044lDC2)) != null) {
                    Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
                    QC qc = C7977z92.b.get(arrayClassId);
                    if (qc != null && (fcA = C7859yd0.a(s01E, qc)) != null) {
                        abstractC5706oM1Y = fcA.y();
                    }
                }
            }
            if (abstractC5706oM1Y != null) {
                return abstractC5706oM1Y;
            }
        }
        throw new IllegalStateException("not array: " + abstractC4649jL0);
    }

    @NotNull
    public final AbstractC5706oM1 g(@NotNull P92 p92) {
        EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
        if (p92 != null) {
            return h(enumC3610ed2, p92, InterfaceC2396Xc.a.a);
        }
        a(84);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 h(@NotNull EnumC3610ed2 enumC3610ed2, @NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        if (abstractC4649jL0 == null) {
            a(80);
            throw null;
        }
        AbstractC5706oM1 abstractC5706oM1B = C5492nL0.b(C1952Ru.p(interfaceC2396Xc), j("Array"), Collections.singletonList(new P62(abstractC4649jL0, enumC3610ed2)));
        if (abstractC5706oM1B != null) {
            return abstractC5706oM1B;
        }
        a(82);
        throw null;
    }

    @NotNull
    public final FC i(@NotNull C1758Ph0 c1758Ph0) {
        if (c1758Ph0 == null) {
            a(12);
            throw null;
        }
        T01 t01K = k();
        S41 s41 = S41.d;
        FC fcV = C0957Fb.v(t01K, c1758Ph0);
        if (fcV != null) {
            return fcV;
        }
        a(13);
        throw null;
    }

    @NotNull
    public final FC j(@NotNull String str) {
        if (str != null) {
            return (FC) ((C2720aS0.k) this.c).invoke(C5638o21.k(str));
        }
        a(14);
        throw null;
    }

    @NotNull
    public final T01 k() {
        this.a.getClass();
        T01 t01 = this.a;
        if (t01 != null) {
            return t01;
        }
        a(7);
        throw null;
    }

    @NotNull
    public Iterable<HC> l() {
        List listSingletonList = Collections.singletonList(new C6242qv(this.d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 m() {
        AbstractC5706oM1 abstractC5706oM1O = o();
        if (abstractC5706oM1O != null) {
            return abstractC5706oM1O;
        }
        a(53);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 n() {
        AbstractC5706oM1 abstractC5706oM1Y = j("Nothing").y();
        if (abstractC5706oM1Y != null) {
            return abstractC5706oM1Y;
        }
        a(49);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 o() {
        AbstractC5706oM1 abstractC5706oM1Z0 = e().Z0(true);
        if (abstractC5706oM1Z0 != null) {
            return abstractC5706oM1Z0;
        }
        a(52);
        throw null;
    }

    @NotNull
    public InterfaceC4033ge1 p() {
        return InterfaceC4033ge1.b.a;
    }

    @NotNull
    public final AbstractC5706oM1 q(@NotNull EnumC6405rh1 enumC6405rh1) {
        if (enumC6405rh1 == null) {
            a(74);
            throw null;
        }
        AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) this.b.invoke().a.get(enumC6405rh1);
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        a(75);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 s(@NotNull EnumC6405rh1 enumC6405rh1) {
        if (enumC6405rh1 == null) {
            a(54);
            throw null;
        }
        AbstractC5706oM1 abstractC5706oM1Y = j(enumC6405rh1.d.e()).y();
        if (abstractC5706oM1Y != null) {
            return abstractC5706oM1Y;
        }
        a(55);
        throw null;
    }

    @NotNull
    public final AbstractC5706oM1 u() {
        AbstractC5706oM1 abstractC5706oM1Y = j("String").y();
        if (abstractC5706oM1Y != null) {
            return abstractC5706oM1Y;
        }
        a(66);
        throw null;
    }

    @NotNull
    public final FC v(int i) {
        return i(C4194hP1.f.c(C5638o21.k(AbstractC3008bk0.d.c.b + i)));
    }

    @NotNull
    public final AbstractC5706oM1 w() {
        AbstractC5706oM1 abstractC5706oM1Y = j("Unit").y();
        if (abstractC5706oM1Y != null) {
            return abstractC5706oM1Y;
        }
        a(65);
        throw null;
    }
}
