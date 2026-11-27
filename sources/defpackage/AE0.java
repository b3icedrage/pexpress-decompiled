package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AE0 extends C3975gM1 implements InterfaceC2678aE0 {
    public static final a K = new a();
    public static final b L = new b();
    public int I;
    public final boolean J;

    public static class a implements InterfaceC1335Jx.a<Xc2> {
    }

    public static class b implements InterfaceC1335Jx.a<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AE0(@NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC3765fM1 interfaceC3765fM1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1, boolean z) {
        super(interfaceC4675jU, interfaceC3765fM1, interfaceC2396Xc, c5638o21, aVar, vn1);
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
        if (vn1 == null) {
            G0(4);
            throw null;
        }
        this.I = 0;
        this.J = z;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = Payload.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static AE0 j1(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull C6970uO0 c6970uO0, @NotNull C5638o21 c5638o21, @NotNull OE0 oe0, boolean z) {
        if (interfaceC4675jU == null) {
            G0(5);
            throw null;
        }
        if (c5638o21 == null) {
            G0(7);
            throw null;
        }
        if (oe0 != null) {
            return new AE0(interfaceC4675jU, null, c6970uO0, c5638o21, InterfaceC1490Lx.a.d, oe0, z);
        }
        G0(8);
        throw null;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1335Jx
    public final boolean L() {
        return JD.a(this.I);
    }

    @Override // defpackage.InterfaceC2678aE0
    @NotNull
    public final InterfaceC2678aE0 R0(@Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull ArrayList arrayList, @NotNull AbstractC4649jL0 abstractC4649jL1, @Nullable Pair pair) {
        if (abstractC4649jL1 == null) {
            G0(20);
            throw null;
        }
        ArrayList arrayListG = C1874Qu.g(arrayList, j(), this);
        C1154Ho1 c1154Ho1H = abstractC4649jL0 == null ? null : JY.h(this, abstractC4649jL0, InterfaceC2396Xc.a.a);
        AbstractC2314Wj0.a aVarZ0 = Z0(X62.b);
        aVarZ0.g = arrayListG;
        aVarZ0.k = abstractC4649jL1;
        aVarZ0.i = c1154Ho1H;
        aVarZ0.p = true;
        aVarZ0.o = true;
        AE0 ae0 = (AE0) aVarZ0.x.W0(aVarZ0);
        if (pair != null) {
            ae0.a1((InterfaceC1335Jx.a) pair.d, pair.e);
        }
        if (ae0 != null) {
            return ae0;
        }
        G0(21);
        throw null;
    }

    @Override // defpackage.C3975gM1, defpackage.AbstractC2314Wj0
    @NotNull
    public final AbstractC2314Wj0 V0(@NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull InterfaceC1490Lx.a aVar, @NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 vn1) {
        if (interfaceC4675jU == null) {
            G0(14);
            throw null;
        }
        if (aVar == null) {
            G0(15);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(16);
            throw null;
        }
        InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) interfaceC2076Tj0;
        if (c5638o21 == null) {
            c5638o21 = getName();
        }
        AE0 ae0 = new AE0(interfaceC4675jU, interfaceC3765fM1, interfaceC2396Xc, c5638o21, aVar, vn1, this.J);
        int i = this.I;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                z = true;
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                z = true;
            }
        }
        ae0.k1(z, JD.a(i));
        return ae0;
    }

    @Override // defpackage.C3975gM1
    @NotNull
    public final C3975gM1 i1(@Nullable C1154Ho1 c1154Ho1, @Nullable InterfaceC1076Go1 interfaceC1076Go1, @NotNull List list, @NotNull List list2, @NotNull List list3, @Nullable AbstractC4649jL0 abstractC4649jL0, @Nullable C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, @Nullable Map map) {
        IB bVar;
        if (list == null) {
            G0(9);
            throw null;
        }
        if (list2 == null) {
            G0(10);
            throw null;
        }
        if (list3 == null) {
            G0(11);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(12);
            throw null;
        }
        super.i1(c1154Ho1, interfaceC1076Go1, list, list2, list3, abstractC4649jL0, c01, abstractC5533nZ, map);
        U91.a.getClass();
        Intrinsics.checkNotNullParameter(this, "functionDescriptor");
        for (TB tb : U91.b) {
            tb.getClass();
            Intrinsics.checkNotNullParameter(this, "functionDescriptor");
            C5638o21 c5638o21 = tb.a;
            if (c5638o21 == null || Intrinsics.a(getName(), c5638o21)) {
                Regex regex = tb.b;
                if (regex != null) {
                    String strE = getName().e();
                    Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
                    if (!regex.d(strE)) {
                        continue;
                    }
                }
                Collection<C5638o21> collection = tb.c;
                if (collection == null || collection.contains(getName())) {
                    Intrinsics.checkNotNullParameter(this, "functionDescriptor");
                    for (InterfaceC6510sB interfaceC6510sB : tb.e) {
                        String strB = interfaceC6510sB.b(this);
                        if (strB != null) {
                            bVar = new IB.b(strB);
                            this.q = bVar.a;
                            return this;
                        }
                    }
                    String strInvoke = tb.d.invoke(this);
                    bVar = strInvoke != null ? new IB.b(strInvoke) : IB.c.b;
                    this.q = bVar.a;
                    return this;
                }
            }
        }
        bVar = IB.a.b;
        this.q = bVar.a;
        return this;
    }

    public final void k1(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.I = i;
    }
}
