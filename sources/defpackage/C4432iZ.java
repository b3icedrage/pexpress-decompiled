package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4432iZ {
    public static final /* synthetic */ int a = 0;

    static {
        new C1758Ph0("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull LinkedHashSet linkedHashSet) {
        if (interfaceC1335Jx == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC1335Jx)) {
            return;
        }
        Iterator<? extends InterfaceC1335Jx> it = interfaceC1335Jx.U0().u().iterator();
        while (it.hasNext()) {
            InterfaceC1335Jx interfaceC1335JxA = it.next().U0();
            b(interfaceC1335JxA, linkedHashSet);
            linkedHashSet.add(interfaceC1335JxA);
        }
    }

    @NotNull
    public static FC c(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(45);
            throw null;
        }
        InterfaceC6494s62 interfaceC6494s62V0 = abstractC4649jL0.V0();
        if (interfaceC6494s62V0 == null) {
            a(46);
            throw null;
        }
        FC fc = (FC) interfaceC6494s62V0.c();
        if (fc != null) {
            return fc;
        }
        a(47);
        throw null;
    }

    @NotNull
    public static S01 d(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(21);
            throw null;
        }
        S01 s01E = e(interfaceC4675jU);
        if (s01E != null) {
            return s01E;
        }
        a(22);
        throw null;
    }

    @Nullable
    public static S01 e(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(23);
            throw null;
        }
        while (interfaceC4675jU != null) {
            if (interfaceC4675jU instanceof S01) {
                return (S01) interfaceC4675jU;
            }
            if (interfaceC4675jU instanceof InterfaceC5752ob1) {
                return ((InterfaceC5752ob1) interfaceC4675jU).B0();
            }
            interfaceC4675jU = interfaceC4675jU.e();
        }
        return null;
    }

    @NotNull
    public static WN1 f(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(82);
            throw null;
        }
        if (interfaceC4675jU instanceof InterfaceC1609Nj1) {
            interfaceC4675jU = ((InterfaceC1609Nj1) interfaceC4675jU).I0();
        }
        boolean z = interfaceC4675jU instanceof InterfaceC5728oU;
        WN1.a aVar = WN1.a;
        if (z) {
            ((InterfaceC5728oU) interfaceC4675jU).i().a();
        }
        return aVar;
    }

    @NotNull
    public static C1836Qh0 g(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU != null) {
            C1758Ph0 c1758Ph0H = h(interfaceC4675jU);
            return c1758Ph0H != null ? c1758Ph0H.i() : g(interfaceC4675jU.e()).b(interfaceC4675jU.getName());
        }
        a(2);
        throw null;
    }

    @Nullable
    public static C1758Ph0 h(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(5);
            throw null;
        }
        if ((interfaceC4675jU instanceof S01) || R70.f(interfaceC4675jU)) {
            return C1758Ph0.c;
        }
        if (interfaceC4675jU instanceof InterfaceC5752ob1) {
            return ((InterfaceC5752ob1) interfaceC4675jU).c();
        }
        if (interfaceC4675jU instanceof InterfaceC2392Xa1) {
            return ((InterfaceC2392Xa1) interfaceC4675jU).c();
        }
        return null;
    }

    @Nullable
    public static <D extends InterfaceC4675jU> D i(@Nullable InterfaceC4675jU interfaceC4675jU, @NotNull Class<D> cls, boolean z) {
        if (interfaceC4675jU == null) {
            return null;
        }
        if (z) {
            interfaceC4675jU = (D) interfaceC4675jU.e();
        }
        while (interfaceC4675jU != null) {
            if (cls.isInstance(interfaceC4675jU)) {
                return (D) interfaceC4675jU;
            }
            interfaceC4675jU = (D) interfaceC4675jU.e();
        }
        return null;
    }

    @Nullable
    public static FC j(@NotNull FC fc) {
        if (fc == null) {
            a(44);
            throw null;
        }
        Iterator<AbstractC4649jL0> it = fc.p().a().iterator();
        while (it.hasNext()) {
            FC fcC = c(it.next());
            if (fcC.h() != SC.e) {
                return fcC;
            }
        }
        return null;
    }

    public static boolean k(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU != null) {
            return n(interfaceC4675jU, SC.d) && interfaceC4675jU.getName().equals(C6761tO1.a);
        }
        a(34);
        throw null;
    }

    public static boolean l(@Nullable InterfaceC4675jU interfaceC4675jU) {
        return n(interfaceC4675jU, SC.j) && ((FC) interfaceC4675jU).E();
    }

    public static boolean m(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU != null) {
            return n(interfaceC4675jU, SC.h);
        }
        a(36);
        throw null;
    }

    public static boolean n(@Nullable InterfaceC4675jU interfaceC4675jU, @NotNull SC sc) {
        return (interfaceC4675jU instanceof FC) && ((FC) interfaceC4675jU).h() == sc;
    }

    public static boolean o(@NotNull InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU == null) {
            a(1);
            throw null;
        }
        while (interfaceC4675jU != null) {
            if (k(interfaceC4675jU) || ((interfaceC4675jU instanceof InterfaceC5938pU) && ((InterfaceC5938pU) interfaceC4675jU).d() == C5323mZ.f)) {
                return true;
            }
            interfaceC4675jU = interfaceC4675jU.e();
        }
        return false;
    }

    public static boolean p(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull FC fc) {
        if (abstractC4649jL0 == null) {
            a(30);
            throw null;
        }
        if (fc == null) {
            a(31);
            throw null;
        }
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC == null) {
            return false;
        }
        InterfaceC4675jU interfaceC4675jUA = interfaceC5044lDC.U0();
        return (interfaceC4675jUA instanceof InterfaceC5044lD) && fc.p().equals(((InterfaceC5044lD) interfaceC4675jUA).p());
    }

    public static boolean q(@Nullable InterfaceC4675jU interfaceC4675jU) {
        return (n(interfaceC4675jU, SC.d) || n(interfaceC4675jU, SC.e)) && ((FC) interfaceC4675jU).q() == C01.g;
    }

    public static boolean r(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull FC fc) {
        if (abstractC4649jL0 == null) {
            a(32);
            throw null;
        }
        if (fc == null) {
            a(33);
            throw null;
        }
        if (p(abstractC4649jL0, fc)) {
            return true;
        }
        Iterator<AbstractC4649jL0> it = abstractC4649jL0.V0().a().iterator();
        while (it.hasNext()) {
            if (r(it.next(), fc)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(@Nullable InterfaceC4675jU interfaceC4675jU) {
        return interfaceC4675jU != null && (interfaceC4675jU.e() instanceof InterfaceC2392Xa1);
    }

    @NotNull
    public static <D extends InterfaceC1490Lx> D t(@NotNull D d) {
        if (d == null) {
            a(59);
            throw null;
        }
        while (d.h() == InterfaceC1490Lx.a.e) {
            Collection<? extends InterfaceC1490Lx> collectionU = d.u();
            if (collectionU.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
            d = (D) collectionU.iterator().next();
        }
        return d;
    }
}
