package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758Ph0 {
    public static final C1758Ph0 c = new C1758Ph0("");

    @NotNull
    public final C1836Qh0 a;
    public transient C1758Ph0 b;

    public C1758Ph0(@NotNull String str) {
        if (str != null) {
            this.a = new C1836Qh0(this, str);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static C1758Ph0 j(@NotNull C5638o21 c5638o21) {
        if (c5638o21 == null) {
            a(14);
            throw null;
        }
        if (c5638o21 != null) {
            return new C1758Ph0(new C1836Qh0(c5638o21.e(), c.i(), c5638o21));
        }
        C1836Qh0.a(17);
        throw null;
    }

    @NotNull
    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        C1836Qh0.a(4);
        throw null;
    }

    @NotNull
    public final C1758Ph0 c(@NotNull C5638o21 c5638o21) {
        if (c5638o21 != null) {
            return new C1758Ph0(this.a.b(c5638o21), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    @NotNull
    public final C1758Ph0 e() {
        C1758Ph0 c1758Ph0 = this.b;
        if (c1758Ph0 != null) {
            if (c1758Ph0 != null) {
                return c1758Ph0;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        C1836Qh0 c1836Qh0 = this.a;
        C1836Qh0 c1836Qh1 = c1836Qh0.c;
        if (c1836Qh1 == null) {
            if (c1836Qh0.a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            c1836Qh0.c();
            c1836Qh1 = c1836Qh0.c;
            if (c1836Qh1 == null) {
                C1836Qh0.a(8);
                throw null;
            }
        }
        C1758Ph0 c1758Ph1 = new C1758Ph0(c1836Qh1);
        this.b = c1758Ph1;
        return c1758Ph1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1758Ph0) && this.a.equals(((C1758Ph0) obj).a);
    }

    @NotNull
    public final C5638o21 f() {
        C5638o21 c5638o21F = this.a.f();
        if (c5638o21F != null) {
            return c5638o21F;
        }
        a(9);
        throw null;
    }

    @NotNull
    public final C5638o21 g() {
        C1836Qh0 c1836Qh0 = this.a;
        if (c1836Qh0.a.isEmpty()) {
            C5638o21 c5638o21 = C1836Qh0.e;
            if (c5638o21 != null) {
                return c5638o21;
            }
            C1836Qh0.a(12);
            throw null;
        }
        C5638o21 c5638o21F = c1836Qh0.f();
        if (c5638o21F != null) {
            return c5638o21F;
        }
        C1836Qh0.a(13);
        throw null;
    }

    public final boolean h(@NotNull C5638o21 c5638o21) {
        if (c5638o21 == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (!str.isEmpty()) {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            String strE = c5638o21.e();
            if (iIndexOf == strE.length() && str.regionMatches(0, strE, 0, iIndexOf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @NotNull
    public final C1836Qh0 i() {
        C1836Qh0 c1836Qh0 = this.a;
        if (c1836Qh0 != null) {
            return c1836Qh0;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public C1758Ph0(@NotNull C1836Qh0 c1836Qh0) {
        if (c1836Qh0 != null) {
            this.a = c1836Qh0;
        } else {
            a(2);
            throw null;
        }
    }

    public C1758Ph0(@NotNull C1836Qh0 c1836Qh0, C1758Ph0 c1758Ph0) {
        this.a = c1836Qh0;
        this.b = c1758Ph0;
    }
}
