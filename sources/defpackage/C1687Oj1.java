package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1687Oj1 extends AbstractC7253vj1 implements InterfaceC1609Nj1 {
    public Xc2 q;

    @NotNull
    public final InterfaceC1609Nj1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687Oj1(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, boolean z, boolean z2, boolean z3, @NotNull InterfaceC1490Lx.a aVar, @Nullable InterfaceC1609Nj1 interfaceC1609Nj1, @NotNull VN1 vn1) {
        super(c01, abstractC5533nZ, interfaceC0671Bj1, interfaceC2396Xc, C5638o21.m("<set-" + interfaceC0671Bj1.getName() + ">"), z, z2, z3, aVar, vn1);
        if (interfaceC0671Bj1 == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (c01 == null) {
            G0(2);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(3);
            throw null;
        }
        if (aVar == null) {
            G0(4);
            throw null;
        }
        if (vn1 == null) {
            G0(5);
            throw null;
        }
        this.r = interfaceC1609Nj1 != null ? interfaceC1609Nj1 : this;
    }

    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static Yc2 W0(@NotNull C1687Oj1 c1687Oj1, @NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull InterfaceC2396Xc interfaceC2396Xc) {
        if (abstractC4649jL0 == null) {
            G0(8);
            throw null;
        }
        if (interfaceC2396Xc != null) {
            return new Yc2(c1687Oj1, null, 0, interfaceC2396Xc, C6761tO1.g, abstractC4649jL0, false, false, false, null, VN1.a);
        }
        G0(9);
        throw null;
    }

    @Override // defpackage.AbstractC7253vj1, defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final InterfaceC1609Nj1 U0() {
        InterfaceC1609Nj1 interfaceC1609Nj1 = this.r;
        if (interfaceC1609Nj1 != null) {
            return interfaceC1609Nj1;
        }
        G0(13);
        throw null;
    }

    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) interfaceC5518nU.b(this, d);
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<Xc2> j() {
        Xc2 xc2 = this.q;
        if (xc2 == null) {
            throw new IllegalStateException();
        }
        List<Xc2> listSingletonList = Collections.singletonList(xc2);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        G0(11);
        throw null;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final AbstractC4649jL0 n() {
        return C4900kZ.e(this).w();
    }

    @Override // defpackage.InterfaceC1490Lx, defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC1609Nj1> u() {
        return V0(false);
    }
}
