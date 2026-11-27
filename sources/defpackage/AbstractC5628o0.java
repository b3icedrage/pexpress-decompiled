package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5628o0 extends F1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5628o0(@NotNull C2720aS0 c2720aS0, @NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @NotNull EnumC3610ed2 enumC3610ed2, boolean z, int i, @NotNull InterfaceC3792fV1.a aVar) {
        super(c2720aS0, interfaceC4675jU, interfaceC2396Xc, c5638o21, enumC3610ed2, z, i, aVar);
        if (c2720aS0 == null) {
            G0(0);
            throw null;
        }
        if (interfaceC4675jU == null) {
            G0(1);
            throw null;
        }
        if (c5638o21 == null) {
            G0(3);
            throw null;
        }
        if (aVar != null) {
        } else {
            G0(6);
            throw null;
        }
    }

    public static /* synthetic */ void G0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC4885kU
    public final String toString() {
        String str = "";
        String str2 = this.j ? "reified " : "";
        if (S() != EnumC3610ed2.INVARIANT) {
            str = S() + " ";
        }
        return str2 + str + getName();
    }
}
