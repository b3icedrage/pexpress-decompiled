package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5308mU extends AbstractC4885kU implements InterfaceC5095lU {

    @NotNull
    public final InterfaceC4675jU g;

    @NotNull
    public final VN1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5308mU(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @NotNull VN1 vn1) {
        super(interfaceC2396Xc, c5638o21);
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
        if (vn1 == null) {
            G0(3);
            throw null;
        }
        this.g = interfaceC4675jU;
        this.h = vn1;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public InterfaceC4675jU e() {
        InterfaceC4675jU interfaceC4675jU = this.g;
        if (interfaceC4675jU != null) {
            return interfaceC4675jU;
        }
        G0(5);
        throw null;
    }

    @NotNull
    public VN1 i() {
        VN1 vn1 = this.h;
        if (vn1 != null) {
            return vn1;
        }
        G0(6);
        throw null;
    }

    @Override // defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5728oU U0() {
        return this;
    }
}
