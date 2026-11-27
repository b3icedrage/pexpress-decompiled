package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class AC extends AbstractC2314Wj0 implements InterfaceC7984zC {
    public final boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AC(@NotNull FC fc, @Nullable InterfaceC3550eL interfaceC3550eL, @NotNull InterfaceC2396Xc interfaceC2396Xc, boolean z, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        super(interfaceC2396Xc, aVar, fc, interfaceC3550eL, C6761tO1.e, vn1);
        if (fc == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (aVar == null) {
            G0(2);
            throw null;
        }
        if (vn1 == null) {
            G0(3);
            throw null;
        }
        this.I = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx C(FC fc, C01 c01, QW qw) {
        return (InterfaceC7984zC) super.C(fc, c01, qw);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1490Lx
    public final void D0(@NotNull Collection<? extends InterfaceC1490Lx> collection) {
        if (collection != null) {
            return;
        }
        G0(22);
        throw null;
    }

    @Override // defpackage.InterfaceC3550eL
    public final boolean G() {
        return this.I;
    }

    @Override // defpackage.InterfaceC3550eL
    @NotNull
    public final FC H() {
        FC fcE = e();
        if (fcE != null) {
            return fcE;
        }
        G0(18);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final InterfaceC2076Tj0 C(FC fc, C01 c01, QW qw) {
        return (InterfaceC7984zC) super.C(fc, c01, qw);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) interfaceC5518nU.e(this, d);
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AC V0(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 vn1) {
        if (interfaceC4675jU == null) {
            G0(23);
            throw null;
        }
        if (aVar == null) {
            G0(24);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(25);
            throw null;
        }
        InterfaceC1490Lx.a aVar2 = InterfaceC1490Lx.a.d;
        if (aVar == aVar2 || aVar == InterfaceC1490Lx.a.h) {
            return new AC((FC) interfaceC4675jU, this, interfaceC2396Xc, this.I, aVar2, vn1);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC4675jU + "\nkind: " + aVar);
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC4675jU
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final FC e() {
        FC fc = (FC) super.e();
        if (fc != null) {
            return fc;
        }
        G0(17);
        throw null;
    }

    public final void g1(@NotNull List list, @NotNull AbstractC5533nZ abstractC5533nZ) {
        if (list == null) {
            G0(13);
            throw null;
        }
        if (abstractC5533nZ != null) {
            h1(list, abstractC5533nZ, e().A());
        } else {
            G0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void h1(@NotNull List list, @NotNull AbstractC5533nZ abstractC5533nZ, @NotNull List list2) {
        InterfaceC1076Go1 interfaceC1076Go1S0;
        List<InterfaceC1076Go1> listO0;
        if (list == null) {
            G0(10);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(11);
            throw null;
        }
        if (list2 == null) {
            G0(12);
            throw null;
        }
        FC fcE = e();
        if (fcE.R()) {
            InterfaceC4675jU interfaceC4675jUE = fcE.e();
            if (interfaceC4675jUE instanceof FC) {
                interfaceC1076Go1S0 = ((FC) interfaceC4675jUE).S0();
            } else {
                interfaceC1076Go1S0 = null;
            }
        } else {
            interfaceC1076Go1S0 = null;
        }
        FC fcE2 = e();
        if (fcE2.O0().isEmpty()) {
            listO0 = Collections.EMPTY_LIST;
            if (listO0 == null) {
                G0(16);
                throw null;
            }
        } else {
            listO0 = fcE2.O0();
            if (listO0 == null) {
                G0(15);
                throw null;
            }
        }
        Y0(null, interfaceC1076Go1S0, listO0, list2, list, null, C01.e, abstractC5533nZ);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1490Lx, defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC2076Tj0> u() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        G0(21);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.IU1
    @Nullable
    public final InterfaceC7984zC b(@NotNull X62 x62) {
        if (x62 != null) {
            return (InterfaceC7984zC) super.b(x62);
        }
        G0(20);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC7984zC U0() {
        InterfaceC7984zC interfaceC7984zC = (InterfaceC7984zC) super.U0();
        if (interfaceC7984zC != null) {
            return interfaceC7984zC;
        }
        G0(19);
        throw null;
    }
}
