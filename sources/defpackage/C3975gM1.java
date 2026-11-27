package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3975gM1 extends AbstractC2314Wj0 implements InterfaceC3765fM1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3975gM1(@NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC3765fM1 interfaceC3765fM1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        super(interfaceC2396Xc, aVar, interfaceC4675jU, interfaceC3765fM1, c5638o21, vn1);
        if (interfaceC4675jU == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (c5638o21 == null) {
            G0(2);
            throw null;
        }
        if (aVar == null) {
            G0(3);
            throw null;
        }
        if (vn1 != null) {
        } else {
            G0(4);
            throw null;
        }
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = Payload.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static C3975gM1 f1(@NotNull FC fc, @NotNull C5638o21 c5638o21, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        if (fc == null) {
            G0(5);
            throw null;
        }
        if (c5638o21 == null) {
            G0(7);
            throw null;
        }
        if (vn1 != null) {
            return new C3975gM1(fc, null, c0193a, c5638o21, aVar, vn1);
        }
        G0(9);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    @NotNull
    public InterfaceC2076Tj0.a<? extends InterfaceC3765fM1> K0() {
        return Z0(X62.b);
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    public AbstractC2314Wj0 V0(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 vn1) {
        if (interfaceC4675jU == null) {
            G0(25);
            throw null;
        }
        if (aVar == null) {
            G0(26);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(27);
            throw null;
        }
        InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) interfaceC2076Tj0;
        if (c5638o21 == null) {
            c5638o21 = getName();
        }
        return new C3975gM1(interfaceC4675jU, interfaceC3765fM1, interfaceC2396Xc, c5638o21, aVar, vn1);
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public InterfaceC3765fM1 C(FC fc, C01 c01, QW qw) {
        return (InterfaceC3765fM1) super.C(fc, c01, qw);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3765fM1 U0() {
        InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) super.U0();
        if (interfaceC3765fM1 != null) {
            return interfaceC3765fM1;
        }
        G0(24);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final C3975gM1 Y0(@Nullable C1154Ho1 c1154Ho1, @Nullable InterfaceC1076Go1 interfaceC1076Go1, @NotNull List list, @NotNull List list2, @NotNull List list3, @Nullable AbstractC4649jL0 abstractC4649jL0, @Nullable C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ) {
        if (list == null) {
            G0(14);
            throw null;
        }
        if (list2 == null) {
            G0(15);
            throw null;
        }
        if (list3 == null) {
            G0(16);
            throw null;
        }
        if (abstractC5533nZ != null) {
            return i1(c1154Ho1, interfaceC1076Go1, list, list2, list3, abstractC4649jL0, c01, abstractC5533nZ, null);
        }
        G0(17);
        throw null;
    }

    @NotNull
    public C3975gM1 i1(@Nullable C1154Ho1 c1154Ho1, @Nullable InterfaceC1076Go1 interfaceC1076Go1, @NotNull List list, @NotNull List list2, @NotNull List list3, @Nullable AbstractC4649jL0 abstractC4649jL0, @Nullable C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, @Nullable Map map) {
        if (list == null) {
            G0(19);
            throw null;
        }
        if (list2 == null) {
            G0(20);
            throw null;
        }
        if (list3 == null) {
            G0(21);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(22);
            throw null;
        }
        super.Y0(c1154Ho1, interfaceC1076Go1, list, list2, list3, abstractC4649jL0, c01, abstractC5533nZ);
        if (map != null && !map.isEmpty()) {
            this.H = new LinkedHashMap(map);
        }
        return this;
    }
}
