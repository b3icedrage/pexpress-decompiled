package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F1 extends AbstractC5308mU implements H62 {
    public final EnumC3610ed2 i;
    public final boolean j;
    public final int k;
    public final I51<InterfaceC6494s62> l;
    public final I51<AbstractC5706oM1> m;
    public final OQ1 n;

    public class a extends B1 {
        public final InterfaceC3792fV1.a c;
        public final /* synthetic */ F1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull F1 f1, OQ1 oq1, InterfaceC3792fV1.a aVar) {
            super(oq1);
            if (oq1 == null) {
                o(0);
                throw null;
            }
            this.d = f1;
            this.c = aVar;
        }

        public static /* synthetic */ void o(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final List<H62> b() {
            List<H62> list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(2);
            throw null;
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final InterfaceC5044lD c() {
            F1 f1 = this.d;
            if (f1 != null) {
                return f1;
            }
            o(3);
            throw null;
        }

        @Override // defpackage.InterfaceC6494s62
        public final boolean e() {
            return true;
        }

        @Override // defpackage.AbstractC4834kD
        public final boolean g(@NotNull InterfaceC5044lD interfaceC5044lD) {
            if (!(interfaceC5044lD instanceof H62)) {
                return false;
            }
            IY iy = IY.a;
            H62 b = (H62) interfaceC5044lD;
            F1 a = this.d;
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            return iy.b(a, b, true, FY.d);
        }

        @Override // defpackage.B1
        @NotNull
        public final Collection<AbstractC4649jL0> h() {
            List<AbstractC4649jL0> listW0 = this.d.W0();
            if (listW0 != null) {
                return listW0;
            }
            o(1);
            throw null;
        }

        @Override // defpackage.B1
        @Nullable
        public final AbstractC4649jL0 i() {
            return R70.c(Q70.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // defpackage.B1
        @NotNull
        public final InterfaceC3792fV1 k() {
            InterfaceC3792fV1.a aVar = this.c;
            if (aVar != null) {
                return aVar;
            }
            o(5);
            throw null;
        }

        @Override // defpackage.B1
        @NotNull
        public final List<AbstractC4649jL0> m(@NotNull List<AbstractC4649jL0> list) {
            if (list == null) {
                o(7);
                throw null;
            }
            List<AbstractC4649jL0> listU0 = this.d.U0(list);
            if (listU0 != null) {
                return listU0;
            }
            o(8);
            throw null;
        }

        @Override // defpackage.B1
        public final void n(@NotNull AbstractC4649jL0 abstractC4649jL0) {
            if (abstractC4649jL0 != null) {
                this.d.V0(abstractC4649jL0);
            } else {
                o(6);
                throw null;
            }
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final RK0 t() {
            RK0 rk0E = C4900kZ.e(this.d);
            if (rk0E != null) {
                return rk0E;
            }
            o(4);
            throw null;
        }

        public final String toString() {
            return this.d.getName().d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F1(@NotNull OQ1 oq1, @NotNull InterfaceC4675jU interfaceC4675jU, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, @NotNull EnumC3610ed2 enumC3610ed2, boolean z, int i, @NotNull InterfaceC3792fV1.a aVar) {
        VN1.a aVar2 = VN1.a;
        if (oq1 == null) {
            G0(0);
            throw null;
        }
        if (interfaceC4675jU == null) {
            G0(1);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(2);
            throw null;
        }
        if (c5638o21 == null) {
            G0(3);
            throw null;
        }
        if (enumC3610ed2 == null) {
            G0(4);
            throw null;
        }
        if (aVar == null) {
            G0(6);
            throw null;
        }
        super(interfaceC4675jU, interfaceC2396Xc, c5638o21, aVar2);
        this.i = enumC3610ed2;
        this.j = z;
        this.k = i;
        this.l = oq1.a(new C1(this, oq1, aVar));
        this.m = oq1.a(new E1(this, c5638o21));
        this.n = oq1;
    }

    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.H62
    public final boolean K() {
        return this.j;
    }

    @Override // defpackage.H62
    @NotNull
    public final EnumC3610ed2 S() {
        EnumC3610ed2 enumC3610ed2 = this.i;
        if (enumC3610ed2 != null) {
            return enumC3610ed2;
        }
        G0(7);
        throw null;
    }

    @NotNull
    public List<AbstractC4649jL0> U0(@NotNull List<AbstractC4649jL0> list) {
        if (list == null) {
            G0(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        G0(13);
        throw null;
    }

    public abstract void V0(@NotNull AbstractC4649jL0 abstractC4649jL0);

    @NotNull
    public abstract List<AbstractC4649jL0> W0();

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC5044lD U0() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C2964bZ.this.c0(this, builder, true);
        return (R) Unit.a;
    }

    @Override // defpackage.H62
    @NotNull
    public final List<AbstractC4649jL0> getUpperBounds() {
        List<AbstractC4649jL0> listA = ((a) p()).a();
        if (listA != null) {
            return listA;
        }
        G0(8);
        throw null;
    }

    @Override // defpackage.H62
    public final int l() {
        return this.k;
    }

    @Override // defpackage.H62
    @NotNull
    public final OQ1 o0() {
        OQ1 oq1 = this.n;
        if (oq1 != null) {
            return oq1;
        }
        G0(14);
        throw null;
    }

    @Override // defpackage.H62, defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        InterfaceC6494s62 interfaceC6494s62Invoke = this.l.invoke();
        if (interfaceC6494s62Invoke != null) {
            return interfaceC6494s62Invoke;
        }
        G0(9);
        throw null;
    }

    @Override // defpackage.H62
    public final boolean t0() {
        return false;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final AbstractC5706oM1 y() {
        AbstractC5706oM1 abstractC5706oM1Invoke = this.m.invoke();
        if (abstractC5706oM1Invoke != null) {
            return abstractC5706oM1Invoke;
        }
        G0(10);
        throw null;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC4675jU U0() {
        return this;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final H62 U0() {
        return this;
    }

    @Override // defpackage.AbstractC5308mU
    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final InterfaceC5728oU U0() {
        return this;
    }
}
