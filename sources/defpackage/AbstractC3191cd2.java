package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3191cd2 extends AbstractC5308mU implements InterfaceC2982bd2 {
    public AbstractC4649jL0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3191cd2(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull VN1 vn1) {
        super(interfaceC4675jU, interfaceC2396Xc, c5638o21, vn1);
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
        this.i = abstractC4649jL0;
    }

    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public boolean L() {
        return false;
    }

    @Override // defpackage.Sc2
    @NotNull
    public final AbstractC4649jL0 getType() {
        AbstractC4649jL0 abstractC4649jL0 = this.i;
        if (abstractC4649jL0 != null) {
            return abstractC4649jL0;
        }
        G0(4);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<Xc2> j() {
        List<Xc2> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(6);
        throw null;
    }

    public InterfaceC1076Go1 m0() {
        return null;
    }

    @NotNull
    public AbstractC4649jL0 n() {
        AbstractC4649jL0 type = getType();
        if (type != null) {
            return type;
        }
        G0(10);
        throw null;
    }

    public InterfaceC1076Go1 r0() {
        return null;
    }

    @NotNull
    public List<H62> w() {
        List<H62> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(8);
        throw null;
    }
}
