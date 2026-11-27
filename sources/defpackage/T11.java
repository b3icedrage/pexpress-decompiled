package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class T11 extends GC {
    public final SC k;
    public C01 l;
    public C5323mZ.h m;
    public ZC n;
    public ArrayList o;
    public final ArrayList p;
    public final C2720aS0.a q;

    /* JADX WARN: Illegal instructions before constructor call */
    public T11(@NotNull C6073q60 c6073q60, @NotNull C5638o21 c5638o21, @NotNull C2720aS0.a aVar) {
        SC sc = SC.e;
        VN1.a aVar2 = VN1.a;
        if (c5638o21 == null) {
            H0(2);
            throw null;
        }
        if (aVar == null) {
            H0(4);
            throw null;
        }
        super(aVar, c6073q60, c5638o21, aVar2);
        this.p = new ArrayList();
        this.q = aVar;
        this.k = sc;
    }

    public static /* synthetic */ void H0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            return arrayList;
        }
        H0(15);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean E() {
        return false;
    }

    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        return null;
    }

    @Override // defpackage.O01
    @NotNull
    public final QY0 G0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 == null) {
            H0(16);
            throw null;
        }
        QY0.b bVar = QY0.b.b;
        if (bVar != null) {
            return bVar;
        }
        H0(17);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean I() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<FC> P() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(19);
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return false;
    }

    @Override // defpackage.FC
    @Nullable
    public final InterfaceC7984zC X() {
        return null;
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 Y() {
        QY0.b bVar = QY0.b.b;
        if (bVar != null) {
            return bVar;
        }
        H0(18);
        throw null;
    }

    @Override // defpackage.FC
    @Nullable
    public final FC a0() {
        return null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.h hVar = this.m;
        if (hVar != null) {
            return hVar;
        }
        H0(10);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        SC sc = this.k;
        if (sc != null) {
            return sc;
        }
        H0(8);
        throw null;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return InterfaceC2396Xc.a.a;
    }

    @Override // defpackage.FC
    public final boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        ZC zc = this.n;
        if (zc != null) {
            return zc;
        }
        H0(11);
        throw null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        C01 c01 = this.l;
        if (c01 != null) {
            return c01;
        }
        H0(7);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection r() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        H0(13);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return AbstractC4885kU.N0(this);
    }
}
