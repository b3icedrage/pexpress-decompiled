package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JY {

    public static class a extends AC {
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 22:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Nullable
    public static C1154Ho1 b(@NotNull InterfaceC1335Jx interfaceC1335Jx, @Nullable AbstractC4649jL0 abstractC4649jL0, @Nullable C5638o21 c5638o21, @NotNull InterfaceC2396Xc interfaceC2396Xc, int i) {
        if (interfaceC2396Xc == null) {
            a(33);
            throw null;
        }
        if (abstractC4649jL0 == null) {
            return null;
        }
        return new C1154Ho1(interfaceC1335Jx, new DM(interfaceC1335Jx, abstractC4649jL0, c5638o21, null), interfaceC2396Xc, C6477s21.a(i));
    }

    @NotNull
    public static C0983Fj1 c(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        if (interfaceC0671Bj1 != null) {
            return i(interfaceC0671Bj1, interfaceC2396Xc, true, interfaceC0671Bj1.i());
        }
        a(13);
        throw null;
    }

    @NotNull
    public static C1687Oj1 d(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        if (interfaceC0671Bj1 == null) {
            a(0);
            throw null;
        }
        VN1 vn1I = interfaceC0671Bj1.i();
        if (vn1I != null) {
            return j(interfaceC0671Bj1, interfaceC2396Xc, c0193a, true, interfaceC0671Bj1.d(), vn1I);
        }
        a(6);
        throw null;
    }

    @Nullable
    public static C0749Cj1 e(@NotNull V v) {
        if (v == null) {
            a(26);
            throw null;
        }
        S01 s01D = C4432iZ.d(v);
        Q01<InterfaceC3777fQ1> q01 = C3987gQ1.a;
        Intrinsics.checkNotNullParameter(s01D, "<this>");
        InterfaceC3777fQ1 interfaceC3777fQ1 = (InterfaceC3777fQ1) s01D.g0(C3987gQ1.a);
        if (interfaceC3777fQ1 == null) {
            interfaceC3777fQ1 = CD.a;
        }
        FC fcA = interfaceC3777fQ1.a(s01D);
        if (fcA == null) {
            return null;
        }
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        C01 c01 = C01.e;
        C5323mZ.h hVar = C5323mZ.e;
        C5638o21 c5638o21 = C4194hP1.b;
        InterfaceC1490Lx.a aVar = InterfaceC1490Lx.a.h;
        C0749Cj1 c0749Cj1W0 = C0749Cj1.W0(v, c01, hVar, false, c5638o21, aVar, v.i());
        C0983Fj1 c0983Fj1 = new C0983Fj1(c0749Cj1W0, c0193a, c01, hVar, false, false, false, aVar, null, v.i());
        c0749Cj1W0.Y0(c0983Fj1, null, null, null);
        C5655o62.e.getClass();
        C5655o62 attributes = C5655o62.g;
        InterfaceC6494s62 constructor = fcA.p();
        List arguments = Collections.singletonList(new P62(v.y()));
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        AbstractC5706oM1 abstractC5706oM1C = C5492nL0.c(attributes, constructor, arguments, false, null);
        List list = Collections.EMPTY_LIST;
        c0749Cj1W0.a1(abstractC5706oM1C, list, null, null, list);
        c0983Fj1.X0(c0749Cj1W0.n());
        return c0749Cj1W0;
    }

    @NotNull
    public static C3975gM1 f(@NotNull V v) {
        if (v == null) {
            a(24);
            throw null;
        }
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        C3975gM1 c3975gM1F1 = C3975gM1.f1(v, C4194hP1.c, InterfaceC1490Lx.a.h, v.i());
        Yc2 yc2 = new Yc2(c3975gM1F1, null, 0, c0193a, C5638o21.k(AppMeasurementSdk.ConditionalUserProperty.VALUE), C4900kZ.e(v).u(), false, false, false, null, v.i());
        List list = Collections.EMPTY_LIST;
        return c3975gM1F1.Y0(null, null, list, list, Collections.singletonList(yc2), v.y(), C01.e, C5323mZ.e);
    }

    @NotNull
    public static C3975gM1 g(@NotNull V v) {
        if (v == null) {
            a(22);
            throw null;
        }
        C3975gM1 c3975gM1F1 = C3975gM1.f1(v, C4194hP1.a, InterfaceC1490Lx.a.h, v.i());
        List list = Collections.EMPTY_LIST;
        RK0 rk0E = C4900kZ.e(v);
        EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
        return c3975gM1F1.Y0(null, null, list, list, list, rk0E.g(v.y()), C01.e, C5323mZ.e);
    }

    @Nullable
    public static C1154Ho1 h(@NotNull InterfaceC1335Jx interfaceC1335Jx, @Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        if (abstractC4649jL0 == null) {
            return null;
        }
        return new C1154Ho1(interfaceC1335Jx, new C1189Ia0(interfaceC1335Jx, abstractC4649jL0, null), interfaceC2396Xc);
    }

    @NotNull
    public static C0983Fj1 i(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull VN1 vn1) {
        if (interfaceC0671Bj1 == null) {
            a(17);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            a(18);
            throw null;
        }
        if (vn1 != null) {
            return new C0983Fj1(interfaceC0671Bj1, interfaceC2396Xc, interfaceC0671Bj1.q(), interfaceC0671Bj1.d(), z, false, false, InterfaceC1490Lx.a.d, null, vn1);
        }
        a(19);
        throw null;
    }

    @NotNull
    public static C1687Oj1 j(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC2396Xc interfaceC2396Xc2, boolean z, @NotNull AbstractC5533nZ abstractC5533nZ, @NotNull VN1 vn1) {
        if (interfaceC0671Bj1 == null) {
            a(7);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            a(8);
            throw null;
        }
        if (interfaceC2396Xc2 == null) {
            a(9);
            throw null;
        }
        if (abstractC5533nZ == null) {
            a(10);
            throw null;
        }
        if (vn1 == null) {
            a(11);
            throw null;
        }
        C1687Oj1 c1687Oj1 = new C1687Oj1(interfaceC0671Bj1, interfaceC2396Xc, interfaceC0671Bj1.q(), abstractC5533nZ, z, false, false, InterfaceC1490Lx.a.d, null, vn1);
        c1687Oj1.q = C1687Oj1.W0(c1687Oj1, interfaceC0671Bj1.getType(), interfaceC2396Xc2);
        return c1687Oj1;
    }

    public static boolean k(@NotNull InterfaceC2076Tj0 interfaceC2076Tj0) {
        if (interfaceC2076Tj0.h() != InterfaceC1490Lx.a.h) {
            return false;
        }
        InterfaceC4675jU interfaceC4675jUE = interfaceC2076Tj0.e();
        int i = C4432iZ.a;
        return C4432iZ.n(interfaceC4675jUE, SC.g);
    }
}
