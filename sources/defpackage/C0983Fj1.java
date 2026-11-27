package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0983Fj1 extends AbstractC7253vj1 implements InterfaceC0905Ej1 {
    public AbstractC4649jL0 q;

    @NotNull
    public final InterfaceC0905Ej1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0983Fj1(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, boolean z, boolean z2, boolean z3, @NotNull InterfaceC1490Lx.a aVar, @Nullable InterfaceC0905Ej1 interfaceC0905Ej1, @NotNull VN1 vn1) {
        super(c01, abstractC5533nZ, interfaceC0671Bj1, interfaceC2396Xc, C5638o21.m("<get-" + interfaceC0671Bj1.getName() + ">"), z, z2, z3, aVar, vn1);
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
        this.r = interfaceC0905Ej1 != null ? interfaceC0905Ej1 : this;
    }

    public static /* synthetic */ void G0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC7253vj1, defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0905Ej1 U0() {
        InterfaceC0905Ej1 interfaceC0905Ej1 = this.r;
        if (interfaceC0905Ej1 != null) {
            return interfaceC0905Ej1;
        }
        G0(8);
        throw null;
    }

    public final void X0(AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            abstractC4649jL0 = I0().getType();
        }
        this.q = abstractC4649jL0;
    }

    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) interfaceC5518nU.a(this, d);
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
    public final AbstractC4649jL0 n() {
        return this.q;
    }

    @Override // defpackage.InterfaceC1490Lx, defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC0905Ej1> u() {
        return V0(true);
    }
}
