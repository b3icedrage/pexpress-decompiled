package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V extends O01 {
    public final C5638o21 d;
    public final I51<AbstractC5706oM1> e;
    public final I51<QY0> g;
    public final I51<InterfaceC1076Go1> h;

    public V(@NotNull C2720aS0 c2720aS0, @NotNull C5638o21 c5638o21) {
        if (c2720aS0 == null) {
            H0(0);
            throw null;
        }
        if (c5638o21 == null) {
            H0(1);
            throw null;
        }
        this.d = c5638o21;
        this.e = new C2720aS0.h(c2720aS0, new S(this, 0));
        this.g = new C2720aS0.h(c2720aS0, new T(this, 0));
        this.h = new C2720aS0.h(c2720aS0, new U(this, 0));
    }

    public static /* synthetic */ void H0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.FC
    @NotNull
    public QY0 E0() {
        QY0 qy0Invoke = this.g.invoke();
        if (qy0Invoke != null) {
            return qy0Invoke;
        }
        H0(4);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public QY0 L0() {
        QY0 qy0G0 = G0(C4900kZ.i(C4432iZ.d(this)));
        if (qy0G0 != null) {
            return qy0G0;
        }
        H0(17);
        throw null;
    }

    @Override // defpackage.O01
    @NotNull
    public QY0 N(@NotNull T62 t62, @NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 == null) {
            H0(11);
            throw null;
        }
        if (!t62.f()) {
            return new MU1(G0(abstractC6331rL0), X62.e(t62));
        }
        QY0 qy0G0 = G0(abstractC6331rL0);
        if (qy0G0 != null) {
            return qy0G0;
        }
        H0(12);
        throw null;
    }

    @Override // defpackage.IU1
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public FC b(@NotNull X62 x62) {
        if (x62 != null) {
            return x62.a.f() ? this : new C4193hP0(this, x62);
        }
        H0(18);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public List<InterfaceC1076Go1> O0() {
        List<InterfaceC1076Go1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(6);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final InterfaceC1076Go1 S0() {
        InterfaceC1076Go1 interfaceC1076Go1Invoke = this.h.invoke();
        if (interfaceC1076Go1Invoke != null) {
            return interfaceC1076Go1Invoke;
        }
        H0(5);
        throw null;
    }

    @Override // defpackage.O01, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC5044lD U0() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) ((C2964bZ.a) interfaceC5518nU).f(this, (StringBuilder) d);
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        C5638o21 c5638o21 = this.d;
        if (c5638o21 != null) {
            return c5638o21;
        }
        H0(2);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 h0(@NotNull T62 t62) {
        QY0 qy0N = N(t62, C4900kZ.i(C4432iZ.d(this)));
        if (qy0N != null) {
            return qy0N;
        }
        H0(16);
        throw null;
    }

    @Override // defpackage.FC, defpackage.InterfaceC5044lD
    @NotNull
    public final AbstractC5706oM1 y() {
        AbstractC5706oM1 abstractC5706oM1Invoke = this.e.invoke();
        if (abstractC5706oM1Invoke != null) {
            return abstractC5706oM1Invoke;
        }
        H0(20);
        throw null;
    }

    @Override // defpackage.O01, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC4675jU U0() {
        return this;
    }

    @Override // defpackage.O01, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final FC U0() {
        return this;
    }
}
