package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7253vj1 extends AbstractC5308mU implements InterfaceC7043uj1 {
    public boolean i;
    public final boolean j;
    public final C01 k;
    public final InterfaceC0671Bj1 l;
    public final boolean m;
    public final InterfaceC1490Lx.a n;
    public AbstractC5533nZ o;

    @Nullable
    public InterfaceC2076Tj0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7253vj1(@NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, @NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C5638o21 c5638o21, boolean z, boolean z2, boolean z3, InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        super(interfaceC0671Bj1.e(), interfaceC2396Xc, c5638o21, vn1);
        if (c01 == null) {
            G0(0);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(1);
            throw null;
        }
        if (interfaceC0671Bj1 == null) {
            G0(2);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(3);
            throw null;
        }
        if (vn1 == null) {
            G0(5);
            throw null;
        }
        this.p = null;
        this.k = c01;
        this.o = abstractC5533nZ;
        this.l = interfaceC0671Bj1;
        this.i = z;
        this.j = z2;
        this.m = z3;
        this.n = aVar;
    }

    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx C(FC fc, C01 c01, QW qw) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean C0() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return this.j;
    }

    @Override // defpackage.InterfaceC1490Lx
    public final void D0(@NotNull Collection<? extends InterfaceC1490Lx> collection) {
        if (collection != null) {
            return;
        }
        G0(16);
        throw null;
    }

    @Override // defpackage.InterfaceC7043uj1
    @NotNull
    public final InterfaceC0671Bj1 I0() {
        InterfaceC0671Bj1 interfaceC0671Bj1 = this.l;
        if (interfaceC0671Bj1 != null) {
            return interfaceC0671Bj1;
        }
        G0(13);
        throw null;
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean J0() {
        return false;
    }

    @Override // defpackage.InterfaceC1335Jx
    public final boolean L() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final <V> V T(InterfaceC1335Jx.a<V> aVar) {
        return null;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    public abstract InterfaceC7043uj1 U0();

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean V() {
        return false;
    }

    @NotNull
    public final ArrayList V0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends InterfaceC1490Lx> it = I0().u().iterator();
        while (it.hasNext()) {
            InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) it.next();
            InterfaceC0726Cc interfaceC0726CcF = z ? interfaceC0671Bj1.f() : interfaceC0671Bj1.g();
            if (interfaceC0726CcF != null) {
                arrayList.add(interfaceC0726CcF);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean W() {
        return false;
    }

    @Override // defpackage.InterfaceC2076Tj0, defpackage.IU1
    @NotNull
    public final InterfaceC2076Tj0 b(@NotNull X62 x62) {
        if (x62 != null) {
            return this;
        }
        G0(7);
        throw null;
    }

    @Override // defpackage.InterfaceC5938pU, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        AbstractC5533nZ abstractC5533nZ = this.o;
        if (abstractC5533nZ != null) {
            return abstractC5533nZ;
        }
        G0(11);
        throw null;
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx.a h() {
        InterfaceC1490Lx.a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        G0(6);
        throw null;
    }

    @Override // defpackage.InterfaceC2076Tj0
    @Nullable
    public final InterfaceC2076Tj0 l0() {
        return this.p;
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 m0() {
        return I0().m0();
    }

    @Override // defpackage.GY0
    @NotNull
    public final C01 q() {
        C01 c01 = this.k;
        if (c01 != null) {
            return c01;
        }
        G0(10);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 r0() {
        return I0().r0();
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<H62> w() {
        List<H62> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(9);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<InterfaceC1076Go1> w0() {
        List<InterfaceC1076Go1> listW0 = I0().w0();
        if (listW0 != null) {
            return listW0;
        }
        G0(14);
        throw null;
    }

    @Override // defpackage.InterfaceC2076Tj0
    public final boolean z() {
        return false;
    }

    @Override // defpackage.IU1
    @NotNull
    public final /* bridge */ /* synthetic */ InterfaceC5095lU b(@NotNull X62 x62) {
        b(x62);
        return this;
    }
}
