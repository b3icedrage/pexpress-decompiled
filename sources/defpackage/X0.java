package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X0 extends AbstractC4885kU implements InterfaceC1076Go1 {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC1335Jx
    public final boolean L() {
        return false;
    }

    @Override // defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC1335Jx U0() {
        return this;
    }

    @Override // defpackage.InterfaceC5938pU, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.i iVar = C5323mZ.f;
        if (iVar != null) {
            return iVar;
        }
        G0(9);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(getName());
        return (R) Unit.a;
    }

    @Override // defpackage.Sc2
    @NotNull
    public final AbstractC4649jL0 getType() {
        AbstractC4649jL0 type = getValue().getType();
        if (type != null) {
            return type;
        }
        G0(6);
        throw null;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        return VN1.a;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<Xc2> j() {
        List<Xc2> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(7);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 m0() {
        return null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final AbstractC4649jL0 n() {
        return getType();
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 r0() {
        return null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC1335Jx> u() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        G0(8);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<H62> w() {
        List<H62> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(5);
        throw null;
    }

    @Override // defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC4675jU U0() {
        return this;
    }

    @Override // defpackage.IU1
    @Nullable
    public final X0 b(@NotNull X62 x62) {
        if (x62 == null) {
            G0(3);
            throw null;
        }
        if (!x62.a.f()) {
            AbstractC4649jL0 abstractC4649jL0J = e() instanceof FC ? x62.j(getType(), EnumC3610ed2.OUT_VARIANCE) : x62.j(getType(), EnumC3610ed2.INVARIANT);
            if (abstractC4649jL0J == null) {
                return null;
            }
            if (abstractC4649jL0J != getType()) {
                return new C1154Ho1(e(), new D42(abstractC4649jL0J, null), k());
            }
        }
        return this;
    }
}
