package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ka1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1346Ka1 {
    public static final List<InterfaceC2391Xa0> d = CollectionsKt.e0(ServiceLoader.load(InterfaceC2391Xa0.class, InterfaceC2391Xa0.class.getClassLoader()));
    public static final C1346Ka1 e;
    public static final a f;
    public final AbstractC6331rL0.a a;
    public final AbstractC5912pL0.a b;
    public final InterfaceC4859kL0.a c;

    /* JADX INFO: renamed from: Ka1$a */
    public static class a implements InterfaceC4859kL0.a {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = R51.PUSH_ADDITIONAL_DATA_KEY;
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // defpackage.InterfaceC4859kL0.a
        public final boolean a(@NotNull InterfaceC6494s62 interfaceC6494s62, @NotNull InterfaceC6494s62 interfaceC6494s63) {
            if (interfaceC6494s62 == null) {
                b(0);
                throw null;
            }
            if (interfaceC6494s63 != null) {
                return interfaceC6494s62.equals(interfaceC6494s63);
            }
            b(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: Ka1$b */
    public static class b {
        public static final b c = new b(a.d, "SUCCESS");
        public final a a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: Ka1$b$a */
        public static final class a {
            public static final a d;
            public static final a e;
            public static final a g;
            public static final /* synthetic */ a[] h;

            static {
                a aVar = new a("OVERRIDABLE", 0);
                d = aVar;
                a aVar2 = new a("INCOMPATIBLE", 1);
                e = aVar2;
                a aVar3 = new a("CONFLICT", 2);
                g = aVar3;
                h = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) h.clone();
            }
        }

        public b(@NotNull a aVar, @NotNull String str) {
            this.a = aVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i == 1 || i == 2) {
                objArr[0] = "debugMessage";
            } else if (i == 3) {
                objArr[0] = "success";
            } else if (i != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i == 1) {
                objArr[2] = "incompatible";
            } else if (i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        @NotNull
        public static b c(@NotNull String str) {
            return new b(a.e, str);
        }

        @NotNull
        public final a b() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }

        public final String toString() {
            return this.a + ": " + this.b;
        }
    }

    static {
        a aVar = new a();
        f = aVar;
        e = new C1346Ka1(aVar, AbstractC6331rL0.a.e, AbstractC5912pL0.a.e);
    }

    public C1346Ka1(@NotNull InterfaceC4859kL0.a aVar, @NotNull AbstractC6331rL0.a aVar2, @NotNull AbstractC5912pL0.a aVar3) {
        if (aVar == null) {
            a(5);
            throw null;
        }
        if (aVar2 == null) {
            a(6);
            throw null;
        }
        if (aVar3 == null) {
            a(7);
            throw null;
        }
        this.c = aVar;
        this.a = aVar2;
        this.b = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 16:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[0] = "firstParameters";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 67:
            case 71:
                objArr[0] = R51.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 16:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull AbstractC4649jL0 abstractC4649jL1, @NotNull C6075q62 c6075q62) {
        if (abstractC4649jL0 == null) {
            a(44);
            throw null;
        }
        if (abstractC4649jL1 == null) {
            a(45);
            throw null;
        }
        if (C3686f.n(abstractC4649jL0) && C3686f.n(abstractC4649jL1)) {
            return true;
        }
        return C7311w1.e(c6075q62, abstractC4649jL0.Y0(), abstractC4649jL1.Y0());
    }

    public static void c(@NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull LinkedHashSet linkedHashSet) {
        if (interfaceC1490Lx == null) {
            a(17);
            throw null;
        }
        InterfaceC1490Lx.a aVarH = interfaceC1490Lx.h();
        aVarH.getClass();
        if (aVarH != InterfaceC1490Lx.a.e) {
            linkedHashSet.add(interfaceC1490Lx);
            return;
        }
        if (interfaceC1490Lx.u().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1490Lx);
        }
        Iterator<? extends InterfaceC1490Lx> it = interfaceC1490Lx.u().iterator();
        while (it.hasNext()) {
            c(it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC1335Jx interfaceC1335Jx) {
        InterfaceC1076Go1 interfaceC1076Go1R0 = interfaceC1335Jx.r0();
        ArrayList arrayList = new ArrayList();
        if (interfaceC1076Go1R0 != null) {
            arrayList.add(interfaceC1076Go1R0.getType());
        }
        Iterator<Xc2> it = interfaceC1335Jx.j().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static void e(@NotNull Collection collection, @NotNull FC fc, @NotNull G1 g1) {
        C01 c01;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (fc == null) {
            a(84);
            throw null;
        }
        ArrayList arrayListC = CollectionsKt.C(collection, new C1501Ma1(fc, 0));
        boolean zIsEmpty = arrayListC.isEmpty();
        if (!zIsEmpty) {
            collection = arrayListC;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                if (fc.Q() && fc.q() != C01.i && fc.q() != C01.g) {
                    z = true;
                }
                if (z2 && !z3) {
                    c01 = C01.h;
                    break;
                }
                if (!z2 && z3) {
                    C01 c01Q = z ? fc.q() : C01.i;
                    if (c01Q != null) {
                        c01 = c01Q;
                        break;
                    } else {
                        a(90);
                        throw null;
                    }
                }
                HashSet<InterfaceC1490Lx> hashSet = new HashSet();
                for (InterfaceC1490Lx interfaceC1490Lx : collection) {
                    if (interfaceC1490Lx == null) {
                        a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c(interfaceC1490Lx, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                    S01 s01J = C4900kZ.j((InterfaceC4675jU) hashSet.iterator().next());
                    Intrinsics.checkNotNullParameter(s01J, "<this>");
                }
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                linkedHashSet2.add(obj);
                                break;
                            }
                            InterfaceC1335Jx interfaceC1335Jx = (InterfaceC1335Jx) obj;
                            InterfaceC1335Jx interfaceC1335Jx2 = (InterfaceC1335Jx) it2.next();
                            if (!q(interfaceC1335Jx, interfaceC1335Jx2)) {
                                if (q(interfaceC1335Jx2, interfaceC1335Jx)) {
                                    break;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                C01 c01Q2 = fc.q();
                if (c01Q2 == null) {
                    a(92);
                    throw null;
                }
                C01 c02 = C01.i;
                for (InterfaceC1490Lx interfaceC1490Lx2 : hashSet) {
                    C01 c01Q3 = (z && interfaceC1490Lx2.q() == C01.i) ? c01Q2 : interfaceC1490Lx2.q();
                    if (c01Q3.compareTo(c02) < 0) {
                        c02 = c01Q3;
                    }
                }
                if (c02 != null) {
                    c01 = c02;
                    break;
                } else {
                    a(93);
                    throw null;
                }
            }
            InterfaceC1490Lx interfaceC1490Lx3 = (InterfaceC1490Lx) it.next();
            int iOrdinal = interfaceC1490Lx3.q().ordinal();
            if (iOrdinal == 0) {
                c01 = C01.e;
                break;
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC1490Lx3);
            }
            if (iOrdinal == 2) {
                z2 = true;
            } else if (iOrdinal == 3) {
                z3 = true;
            }
        }
        InterfaceC1490Lx interfaceC1490LxC = ((InterfaceC1490Lx) s(collection, new C1017Fv(3))).C(fc, c01, zIsEmpty ? C5323mZ.h : C5323mZ.g);
        g1.u(interfaceC1490LxC, collection);
        g1.a(interfaceC1490LxC);
    }

    @NotNull
    public static ArrayList g(@NotNull Object obj, @NotNull LinkedList linkedList, @NotNull Function1 function1, @NotNull Function1 function2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC1335Jx interfaceC1335Jx = (InterfaceC1335Jx) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1335Jx interfaceC1335Jx2 = (InterfaceC1335Jx) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                b.a aVarJ = j(interfaceC1335Jx, interfaceC1335Jx2);
                if (aVarJ == b.a.d) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarJ == b.a.g) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static b i(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2) {
        boolean z;
        b bVarC;
        if (interfaceC1335Jx == null) {
            a(38);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = interfaceC1335Jx instanceof InterfaceC2076Tj0;
        if ((z2 && !(interfaceC1335Jx2 instanceof InterfaceC2076Tj0)) || (((z = interfaceC1335Jx instanceof InterfaceC0671Bj1)) && !(interfaceC1335Jx2 instanceof InterfaceC0671Bj1))) {
            return b.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1335Jx);
        }
        if (!interfaceC1335Jx.getName().equals(interfaceC1335Jx2.getName())) {
            return b.c("Name mismatch");
        }
        if ((interfaceC1335Jx.r0() == null) != (interfaceC1335Jx2.r0() == null)) {
            bVarC = b.c("Receiver presence mismatch");
        } else {
            bVarC = interfaceC1335Jx.j().size() != interfaceC1335Jx2.j().size() ? b.c("Value parameter number mismatch") : null;
        }
        if (bVarC != null) {
            return bVarC;
        }
        return null;
    }

    @Nullable
    public static b.a j(InterfaceC1335Jx interfaceC1335Jx, InterfaceC1335Jx interfaceC1335Jx2) {
        C1346Ka1 c1346Ka1 = e;
        b.a aVarB = c1346Ka1.l(interfaceC1335Jx2, interfaceC1335Jx, null).b();
        b.a aVarB2 = c1346Ka1.m(interfaceC1335Jx, interfaceC1335Jx2, null, false).b();
        b.a aVar = b.a.d;
        if (aVarB == aVar && aVarB2 == aVar) {
            return aVar;
        }
        b.a aVar2 = b.a.g;
        return (aVarB == aVar2 || aVarB2 == aVar2) ? aVar2 : b.a.e;
    }

    public static boolean k(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2) {
        if (interfaceC1335Jx == null) {
            a(65);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(66);
            throw null;
        }
        AbstractC4649jL0 abstractC4649jL0N = interfaceC1335Jx.n();
        AbstractC4649jL0 abstractC4649jL0N2 = interfaceC1335Jx2.n();
        if (!p(interfaceC1335Jx, interfaceC1335Jx2)) {
            return false;
        }
        C6075q62 c6075q62F = e.f(interfaceC1335Jx.w(), interfaceC1335Jx2.w());
        if (interfaceC1335Jx instanceof InterfaceC2076Tj0) {
            return o(interfaceC1335Jx, abstractC4649jL0N, interfaceC1335Jx2, abstractC4649jL0N2, c6075q62F);
        }
        if (!(interfaceC1335Jx instanceof InterfaceC0671Bj1)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC1335Jx.getClass());
        }
        InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) interfaceC1335Jx;
        InterfaceC0671Bj1 interfaceC0671Bj2 = (InterfaceC0671Bj1) interfaceC1335Jx2;
        InterfaceC1609Nj1 interfaceC1609Nj1G = interfaceC0671Bj1.g();
        InterfaceC1609Nj1 interfaceC1609Nj1G2 = interfaceC0671Bj2.g();
        if (!((interfaceC1609Nj1G == null || interfaceC1609Nj1G2 == null) ? true : p(interfaceC1609Nj1G, interfaceC1609Nj1G2))) {
            return false;
        }
        if (interfaceC0671Bj1.p0() && interfaceC0671Bj2.p0()) {
            return C7311w1.e(c6075q62F, abstractC4649jL0N.Y0(), abstractC4649jL0N2.Y0());
        }
        return (interfaceC0671Bj1.p0() || !interfaceC0671Bj2.p0()) && o(interfaceC1335Jx, abstractC4649jL0N, interfaceC1335Jx2, abstractC4649jL0N2, c6075q62F);
    }

    public static boolean o(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull InterfaceC1335Jx interfaceC1335Jx2, @NotNull AbstractC4649jL0 abstractC4649jL1, @NotNull C6075q62 state) {
        if (interfaceC1335Jx == null) {
            a(71);
            throw null;
        }
        if (abstractC4649jL0 == null) {
            a(72);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(73);
            throw null;
        }
        if (abstractC4649jL1 == null) {
            a(74);
            throw null;
        }
        C7311w1 c7311w1 = C7311w1.a;
        P92 subType = abstractC4649jL0.Y0();
        P92 superType = abstractC4649jL1.Y0();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return C7311w1.i(c7311w1, state, subType, superType);
    }

    public static boolean p(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2) {
        if (interfaceC1335Jx == null) {
            a(67);
            throw null;
        }
        if (interfaceC1335Jx2 != null) {
            Integer numB = C5323mZ.b(interfaceC1335Jx.d(), interfaceC1335Jx2.d());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2) {
        if (interfaceC1335Jx == null) {
            a(13);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = interfaceC1335Jx.equals(interfaceC1335Jx2);
        IY iy = IY.a;
        if (!zEquals && iy.a(interfaceC1335Jx.U0(), interfaceC1335Jx2.U0(), false)) {
            return true;
        }
        InterfaceC1335Jx interfaceC1335JxU0 = interfaceC1335Jx2.U0();
        int i = C4432iZ.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C4432iZ.b(interfaceC1335Jx.U0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (iy.a(interfaceC1335JxU0, (InterfaceC1335Jx) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(@NotNull InterfaceC1490Lx interfaceC1490Lx, @Nullable C4012gZ.a aVar) {
        AbstractC5533nZ abstractC5533nZ;
        AbstractC5533nZ abstractC5533nZD;
        AbstractC5533nZ abstractC5533nZ2;
        if (interfaceC1490Lx == null) {
            a(105);
            throw null;
        }
        for (InterfaceC1490Lx interfaceC1490Lx2 : interfaceC1490Lx.u()) {
            if (interfaceC1490Lx2.d() == C5323mZ.g) {
                r(interfaceC1490Lx2, aVar);
            }
        }
        if (interfaceC1490Lx.d() != C5323mZ.g) {
            return;
        }
        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC1490Lx.u();
        if (collectionU == null) {
            a(107);
            throw null;
        }
        if (!collectionU.isEmpty()) {
            Iterator<? extends InterfaceC1490Lx> it = collectionU.iterator();
            loop3: while (true) {
                abstractC5533nZ = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    AbstractC5533nZ abstractC5533nZD2 = it.next().d();
                    if (abstractC5533nZ != null) {
                        Integer numB = C5323mZ.b(abstractC5533nZD2, abstractC5533nZ);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    abstractC5533nZ = abstractC5533nZD2;
                }
            }
            if (abstractC5533nZ == null) {
                abstractC5533nZD = null;
                break;
            }
            Iterator<? extends InterfaceC1490Lx> it2 = collectionU.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abstractC5533nZD = abstractC5533nZ;
                    break;
                }
                Integer numB2 = C5323mZ.b(abstractC5533nZ, it2.next().d());
                if (numB2 == null || numB2.intValue() < 0) {
                    abstractC5533nZD = null;
                    break;
                }
            }
        } else {
            abstractC5533nZD = C5323mZ.k;
        }
        if (abstractC5533nZD == null) {
            abstractC5533nZD = null;
            break;
        }
        if (interfaceC1490Lx.h() == InterfaceC1490Lx.a.e) {
            for (InterfaceC1490Lx interfaceC1490Lx3 : collectionU) {
                if (interfaceC1490Lx3.q() != C01.i && !interfaceC1490Lx3.d().equals(abstractC5533nZD)) {
                    abstractC5533nZD = null;
                    break;
                }
            }
        } else {
            abstractC5533nZD = abstractC5533nZD.d();
        }
        if (abstractC5533nZD == null) {
            if (aVar != null) {
                aVar.invoke(interfaceC1490Lx);
            }
            abstractC5533nZ2 = C5323mZ.e;
        } else {
            abstractC5533nZ2 = abstractC5533nZD;
        }
        if (interfaceC1490Lx instanceof C0749Cj1) {
            C0749Cj1 c0749Cj1 = (C0749Cj1) interfaceC1490Lx;
            if (abstractC5533nZ2 == null) {
                C0749Cj1.G0(20);
                throw null;
            }
            c0749Cj1.n = abstractC5533nZ2;
            Iterator it3 = ((InterfaceC0671Bj1) interfaceC1490Lx).B().iterator();
            while (it3.hasNext()) {
                r((InterfaceC7043uj1) it3.next(), abstractC5533nZD == null ? null : aVar);
            }
            return;
        }
        if (interfaceC1490Lx instanceof AbstractC2314Wj0) {
            AbstractC2314Wj0 abstractC2314Wj0 = (AbstractC2314Wj0) interfaceC1490Lx;
            if (abstractC5533nZ2 != null) {
                abstractC2314Wj0.p = abstractC5533nZ2;
                return;
            } else {
                AbstractC2314Wj0.G0(10);
                throw null;
            }
        }
        AbstractC7253vj1 abstractC7253vj1 = (AbstractC7253vj1) interfaceC1490Lx;
        abstractC7253vj1.o = abstractC5533nZ2;
        if (abstractC5533nZ2 != abstractC7253vj1.I0().d()) {
            abstractC7253vj1.i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <H> H s(@NotNull Collection<H> collection, @NotNull Function1<H, InterfaceC1335Jx> transform) {
        H h;
        if (collection.size() == 1) {
            H h2 = (H) CollectionsKt.E(collection);
            if (h2 != null) {
                return h2;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList2 = new ArrayList(XE.m(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(transform.invoke(it.next()));
        }
        H h3 = (H) CollectionsKt.E(collection);
        InterfaceC1335Jx interfaceC1335Jx = (InterfaceC1335Jx) transform.invoke(h3);
        for (H h4 : collection) {
            InterfaceC1335Jx interfaceC1335Jx2 = (InterfaceC1335Jx) transform.invoke(h4);
            if (interfaceC1335Jx2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(h4);
                    break;
                }
            } while (k(interfaceC1335Jx2, (InterfaceC1335Jx) it2.next()));
            if (k(interfaceC1335Jx2, interfaceC1335Jx) && !k(interfaceC1335Jx, interfaceC1335Jx2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 != null) {
                return h3;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) CollectionsKt.E(arrayList);
            if (h5 != null) {
                return h5;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                h = null;
                break;
            }
            h = (H) it3.next();
        } while (C6621sj.j(((InterfaceC1335Jx) transform.invoke(h)).n()));
        if (h != null) {
            return h;
        }
        H h6 = (H) CollectionsKt.E(arrayList);
        if (h6 != null) {
            return h6;
        }
        a(82);
        throw null;
    }

    @NotNull
    public final C6075q62 f(@NotNull List<H62> list, @NotNull List<H62> list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC4859kL0.a aVar = this.c;
        if (zIsEmpty) {
            AbstractC6331rL0.a kotlinTypeRefiner = this.a;
            AbstractC5912pL0.a kotlinTypePreparator = this.b;
            C1660Oa1 typeSystemContext = new C1660Oa1(null, aVar, kotlinTypeRefiner, kotlinTypePreparator);
            Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
            Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return new C6075q62(true, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).p(), list2.get(i).p());
        }
        AbstractC6331rL0.a kotlinTypeRefiner2 = this.a;
        AbstractC5912pL0.a kotlinTypePreparator2 = this.b;
        C1660Oa1 typeSystemContext2 = new C1660Oa1(map, aVar, kotlinTypeRefiner2, kotlinTypePreparator2);
        Intrinsics.checkNotNullParameter(typeSystemContext2, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator2, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "kotlinTypeRefiner");
        return new C6075q62(true, true, typeSystemContext2, kotlinTypePreparator2, kotlinTypeRefiner2);
    }

    public final void h(@NotNull C5638o21 c5638o21, @NotNull Collection collection, @NotNull Collection collection2, @NotNull FC fc, @NotNull G1 g1) {
        Integer numB;
        if (c5638o21 == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (fc == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC1490Lx fromCurrent = (InterfaceC1490Lx) it.next();
            if (fromCurrent == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            C3768fN1 c3768fN1 = new C3768fN1();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC1490Lx fromSuper = (InterfaceC1490Lx) it2.next();
                b.a aVarB = l(fromSuper, fromCurrent, fc).b();
                boolean z = !C5323mZ.e(fromSuper.d()) && C5323mZ.c(C5323mZ.m, fromSuper, fromCurrent) == null;
                int iOrdinal = aVarB.ordinal();
                if (iOrdinal == 0) {
                    if (z) {
                        c3768fN1.add(fromSuper);
                    }
                    arrayList.add(fromSuper);
                } else if (iOrdinal == 2) {
                    if (z) {
                        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                        g1.e(fromSuper, fromCurrent);
                    }
                    arrayList.add(fromSuper);
                }
            }
            g1.u(fromCurrent, c3768fN1);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            C1424La1 predicate = new C1424La1(((InterfaceC1490Lx) linkedHashSet.iterator().next()).e(), 0);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) predicate.invoke(it3.next())).booleanValue()) {
                        LinkedList<InterfaceC1490Lx> descriptors = new LinkedList(linkedHashSet);
                        while (!descriptors.isEmpty()) {
                            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
                            descriptors.isEmpty();
                            InterfaceC1490Lx interfaceC1490Lx = null;
                            for (InterfaceC1490Lx interfaceC1490Lx2 : descriptors) {
                                if (interfaceC1490Lx == null || ((numB = C5323mZ.b(interfaceC1490Lx.d(), interfaceC1490Lx2.d())) != null && numB.intValue() < 0)) {
                                    interfaceC1490Lx = interfaceC1490Lx2;
                                }
                            }
                            Intrinsics.checkNotNull(interfaceC1490Lx);
                            if (interfaceC1490Lx == null) {
                                a(102);
                                throw null;
                            }
                            e(g(interfaceC1490Lx, descriptors, new C4690jZ(2), new C1579Na1(g1, interfaceC1490Lx)), fc, g1);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((InterfaceC1490Lx) it4.next()), fc, g1);
        }
    }

    @NotNull
    public final b l(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2, @Nullable FC fc) {
        if (interfaceC1335Jx == null) {
            a(19);
            throw null;
        }
        if (interfaceC1335Jx2 != null) {
            return m(interfaceC1335Jx, interfaceC1335Jx2, fc, false);
        }
        a(20);
        throw null;
    }

    @NotNull
    public final b m(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2, @Nullable FC fc, boolean z) {
        if (interfaceC1335Jx == null) {
            a(22);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(23);
            throw null;
        }
        b bVarN = n(interfaceC1335Jx, interfaceC1335Jx2, z);
        boolean z2 = bVarN.b() == b.a.d;
        List<InterfaceC2391Xa0> list = d;
        Iterator<InterfaceC2391Xa0> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC2391Xa0.a aVar = InterfaceC2391Xa0.a.d;
            if (!zHasNext) {
                if (!z2) {
                    return bVarN;
                }
                for (InterfaceC2391Xa0 interfaceC2391Xa0 : list) {
                    if (interfaceC2391Xa0.a() == aVar) {
                        int iOrdinal = interfaceC2391Xa0.b(interfaceC1335Jx, interfaceC1335Jx2, fc).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + interfaceC2391Xa0.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return b.c("External condition");
                        }
                    }
                }
                b bVar = b.c;
                if (bVar != null) {
                    return bVar;
                }
                b.a(0);
                throw null;
            }
            InterfaceC2391Xa0 next = it.next();
            if (next.a() != aVar && (!z2 || next.a() != InterfaceC2391Xa0.a.e)) {
                int iOrdinal2 = next.b(interfaceC1335Jx, interfaceC1335Jx2, fc).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = true;
                } else if (iOrdinal2 == 1) {
                    return b.c("External condition");
                }
            }
        }
    }

    @NotNull
    public final b n(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull InterfaceC1335Jx interfaceC1335Jx2, boolean z) {
        if (interfaceC1335Jx == null) {
            a(28);
            throw null;
        }
        if (interfaceC1335Jx2 == null) {
            a(29);
            throw null;
        }
        b bVarI = i(interfaceC1335Jx, interfaceC1335Jx2);
        if (bVarI != null) {
            return bVarI;
        }
        ArrayList arrayListD = d(interfaceC1335Jx);
        ArrayList arrayListD2 = d(interfaceC1335Jx2);
        List<H62> listW = interfaceC1335Jx.w();
        List<H62> listW2 = interfaceC1335Jx2.w();
        int size = listW.size();
        int size2 = listW2.size();
        b.a aVar = b.a.g;
        if (size != size2) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!InterfaceC4859kL0.a.c((AbstractC4649jL0) arrayListD.get(i), (AbstractC4649jL0) arrayListD2.get(i))) {
                    return b.c("Type parameter number mismatch");
                }
            }
            return new b(aVar, "Type parameter number mismatch");
        }
        C6075q62 state = f(listW, listW2);
        for (int i2 = 0; i2 < listW.size(); i2++) {
            H62 h62 = listW.get(i2);
            H62 h63 = listW2.get(i2);
            if (h62 == null) {
                a(47);
                throw null;
            }
            if (h63 == null) {
                a(48);
                throw null;
            }
            List<AbstractC4649jL0> upperBounds = h62.getUpperBounds();
            ArrayList arrayList = new ArrayList(h63.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC4649jL0 abstractC4649jL0 : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(abstractC4649jL0, (AbstractC4649jL0) listIterator.next(), state));
                    listIterator.remove();
                }
            }
            return b.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((AbstractC4649jL0) arrayListD.get(i3), (AbstractC4649jL0) arrayListD2.get(i3), state)) {
                return b.c("Value parameter type mismatch");
            }
        }
        if ((interfaceC1335Jx instanceof InterfaceC2076Tj0) && (interfaceC1335Jx2 instanceof InterfaceC2076Tj0) && ((InterfaceC2076Tj0) interfaceC1335Jx).z() != ((InterfaceC2076Tj0) interfaceC1335Jx2).z()) {
            return new b(aVar, "Incompatible suspendability");
        }
        if (z) {
            AbstractC4649jL0 abstractC4649jL0N = interfaceC1335Jx.n();
            AbstractC4649jL0 abstractC4649jL0N2 = interfaceC1335Jx2.n();
            if (abstractC4649jL0N != null && abstractC4649jL0N2 != null && (!C3686f.n(abstractC4649jL0N2) || !C3686f.n(abstractC4649jL0N))) {
                C7311w1 c7311w1 = C7311w1.a;
                P92 subType = abstractC4649jL0N2.Y0();
                P92 superType = abstractC4649jL0N.Y0();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(subType, "subType");
                Intrinsics.checkNotNullParameter(superType, "superType");
                if (!C7311w1.i(c7311w1, state, subType, superType)) {
                    return new b(aVar, "Return type mismatch");
                }
            }
        }
        b bVar = b.c;
        if (bVar != null) {
            return bVar;
        }
        b.a(0);
        throw null;
    }
}
