package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664Oc implements InterfaceC1583Nc {
    public final AbstractC5706oM1 a;
    public final Map<C5638o21, CK<?>> b;
    public final VN1 c;

    public C1664Oc(@NotNull AbstractC5706oM1 abstractC5706oM1, @NotNull Map map, @NotNull VN1 vn1) {
        if (abstractC5706oM1 == null) {
            b(0);
            throw null;
        }
        if (map == null) {
            b(1);
            throw null;
        }
        this.a = abstractC5706oM1;
        this.b = map;
        this.c = vn1;
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = Payload.SOURCE;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC1583Nc
    @Nullable
    public final C1758Ph0 c() {
        FC fcD = C4900kZ.d(this);
        if (fcD != null) {
            if (R70.f(fcD)) {
                fcD = null;
            }
            if (fcD != null) {
                return C4900kZ.c(fcD);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final AbstractC4649jL0 getType() {
        AbstractC5706oM1 abstractC5706oM1 = this.a;
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        b(3);
        throw null;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final VN1 i() {
        VN1 vn1 = this.c;
        if (vn1 != null) {
            return vn1;
        }
        b(5);
        throw null;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        Map<C5638o21, CK<?>> map = this.b;
        if (map != null) {
            return map;
        }
        b(4);
        throw null;
    }

    public final String toString() {
        return XY.a.x(this, null);
    }
}
