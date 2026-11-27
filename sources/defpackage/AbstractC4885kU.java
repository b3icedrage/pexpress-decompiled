package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4885kU extends C5642o31 implements InterfaceC4675jU {

    @NotNull
    public final C5638o21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4885kU(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21) {
        super(interfaceC2396Xc);
        if (interfaceC2396Xc == null) {
            G0(0);
            throw null;
        }
        if (c5638o21 == null) {
            G0(1);
            throw null;
        }
        this.e = c5638o21;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static String N0(@NotNull InterfaceC4675jU interfaceC4675jU) {
        try {
            String str = XY.c.w(interfaceC4675jU) + "[" + interfaceC4675jU.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC4675jU)) + "]";
            if (str != null) {
                return str;
            }
            G0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC4675jU.getClass().getSimpleName() + " " + interfaceC4675jU.getName();
            if (str2 != null) {
                return str2;
            }
            G0(6);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        C5638o21 c5638o21 = this.e;
        if (c5638o21 != null) {
            return c5638o21;
        }
        G0(2);
        throw null;
    }

    public String toString() {
        return N0(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC4675jU U0() {
        return this;
    }
}
