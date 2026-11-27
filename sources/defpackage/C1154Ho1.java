package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ho1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1154Ho1 extends X0 {
    public final InterfaceC4675jU g;
    public final Y0 h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1154Ho1(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull Y0 y0, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        this(interfaceC4675jU, y0, interfaceC2396Xc, C6761tO1.d);
        if (interfaceC4675jU == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc != null) {
        } else {
            G0(2);
            throw null;
        }
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        InterfaceC4675jU interfaceC4675jU = this.g;
        if (interfaceC4675jU != null) {
            return interfaceC4675jU;
        }
        G0(8);
        throw null;
    }

    @Override // defpackage.InterfaceC1076Go1
    @NotNull
    public final InterfaceC1232Io1 getValue() {
        Y0 y0 = this.h;
        if (y0 != null) {
            return y0;
        }
        G0(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154Ho1(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull Y0 y0, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21) {
        super(interfaceC2396Xc, c5638o21);
        if (interfaceC4675jU == null) {
            G0(3);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(5);
            throw null;
        }
        if (c5638o21 != null) {
            this.g = interfaceC4675jU;
            this.h = y0;
            return;
        }
        G0(6);
        throw null;
    }
}
