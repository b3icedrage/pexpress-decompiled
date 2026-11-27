package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class I62 extends F1 {
    public final ArrayList o;
    public boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    public I62(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull EnumC3610ed2 enumC3610ed2, @NotNull C5638o21 c5638o21, int i, @NotNull OQ1 oq1) {
        InterfaceC3792fV1.a aVar = InterfaceC3792fV1.a.a;
        if (interfaceC4675jU == null) {
            G0(19);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(20);
            throw null;
        }
        if (enumC3610ed2 == null) {
            G0(21);
            throw null;
        }
        if (c5638o21 == null) {
            G0(22);
            throw null;
        }
        if (oq1 == null) {
            G0(25);
            throw null;
        }
        super(oq1, interfaceC4675jU, interfaceC2396Xc, c5638o21, enumC3610ed2, z, i, aVar);
        this.o = new ArrayList(1);
        this.p = false;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 11:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static I62 X0(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull EnumC3610ed2 enumC3610ed2, @NotNull C5638o21 c5638o21, int i, @NotNull OQ1 oq1) {
        if (interfaceC4675jU == null) {
            G0(6);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(7);
            throw null;
        }
        if (enumC3610ed2 == null) {
            G0(8);
            throw null;
        }
        if (c5638o21 == null) {
            G0(9);
            throw null;
        }
        if (oq1 != null) {
            return new I62(interfaceC4675jU, interfaceC2396Xc, z, enumC3610ed2, c5638o21, i, oq1);
        }
        G0(11);
        throw null;
    }

    @NotNull
    public static I62 Y0(@NotNull V v, @NotNull EnumC3610ed2 enumC3610ed2, @NotNull C5638o21 c5638o21, int i, @NotNull C2720aS0 c2720aS0) {
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        if (v == null) {
            G0(0);
            throw null;
        }
        if (c2720aS0 == null) {
            G0(4);
            throw null;
        }
        I62 i62X0 = X0(v, c0193a, false, enumC3610ed2, c5638o21, i, c2720aS0);
        AbstractC5706oM1 abstractC5706oM1M = C4900kZ.e(v).m();
        if (i62X0.p) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + i62X0.Z0());
        }
        if (!C3686f.n(abstractC5706oM1M)) {
            i62X0.o.add(abstractC5706oM1M);
        }
        if (!i62X0.p) {
            i62X0.p = true;
            return i62X0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + i62X0.Z0());
    }

    @Override // defpackage.F1
    public final void V0(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 != null) {
            return;
        }
        G0(27);
        throw null;
    }

    @Override // defpackage.F1
    @NotNull
    public final List<AbstractC4649jL0> W0() {
        if (!this.p) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + Z0());
        }
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            return arrayList;
        }
        G0(28);
        throw null;
    }

    public final String Z0() {
        return getName() + " declared in " + C4432iZ.g(e());
    }
}
