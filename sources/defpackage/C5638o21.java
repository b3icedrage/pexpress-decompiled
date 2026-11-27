package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5638o21 implements Comparable<C5638o21> {

    @NotNull
    public final String d;
    public final boolean e;

    public C5638o21(@NotNull String str, boolean z) {
        if (str == null) {
            b(0);
            throw null;
        }
        this.d = str;
        this.e = z;
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static C5638o21 i(@NotNull String str) {
        if (str != null) {
            return str.startsWith("<") ? m(str) : k(str);
        }
        b(9);
        throw null;
    }

    @NotNull
    public static C5638o21 k(@NotNull String str) {
        if (str != null) {
            return new C5638o21(str, false);
        }
        b(5);
        throw null;
    }

    public static boolean l(@NotNull String str) {
        if (str == null) {
            b(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static C5638o21 m(@NotNull String str) {
        if (str == null) {
            b(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C5638o21(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5638o21 c5638o21) {
        return this.d.compareTo(c5638o21.d);
    }

    @NotNull
    public final String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        b(1);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5638o21)) {
            return false;
        }
        C5638o21 c5638o21 = (C5638o21) obj;
        return this.e == c5638o21.e && this.d.equals(c5638o21.d);
    }

    @NotNull
    public final String f() {
        if (this.e) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strE = e();
        if (strE != null) {
            return strE;
        }
        b(2);
        throw null;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        return this.d;
    }
}
