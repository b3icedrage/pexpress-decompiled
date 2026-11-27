package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GC extends V {
    public final InterfaceC4675jU i;
    public final VN1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC(@NotNull C2720aS0 c2720aS0, @NotNull InterfaceC4675jU interfaceC4675jU, @NotNull C5638o21 c5638o21, @NotNull VN1 vn1) {
        super(c2720aS0, c5638o21);
        if (c2720aS0 == null) {
            H0(0);
            throw null;
        }
        if (interfaceC4675jU == null) {
            H0(1);
            throw null;
        }
        if (c5638o21 == null) {
            H0(2);
            throw null;
        }
        if (vn1 == null) {
            H0(3);
            throw null;
        }
        this.i = interfaceC4675jU;
        this.j = vn1;
    }

    public static /* synthetic */ void H0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = Payload.SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean D() {
        return false;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        InterfaceC4675jU interfaceC4675jU = this.i;
        if (interfaceC4675jU != null) {
            return interfaceC4675jU;
        }
        H0(4);
        throw null;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        VN1 vn1 = this.j;
        if (vn1 != null) {
            return vn1;
        }
        H0(5);
        throw null;
    }
}
