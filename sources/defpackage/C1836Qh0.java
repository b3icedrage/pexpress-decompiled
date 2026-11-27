package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1836Qh0 {
    public static final C5638o21 e = C5638o21.m("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final a g = new a();

    @NotNull
    public final String a;
    public transient C1758Ph0 b;
    public transient C1836Qh0 c;
    public transient C5638o21 d;

    /* JADX INFO: renamed from: Qh0$a */
    public static class a implements Function1<String, C5638o21> {
        @Override // kotlin.jvm.functions.Function1
        public final C5638o21 invoke(String str) {
            return C5638o21.i(str);
        }
    }

    public C1836Qh0(@NotNull C1758Ph0 c1758Ph0, @NotNull String str) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (c1758Ph0 == null) {
            a(1);
            throw null;
        }
        this.a = str;
        this.b = c1758Ph0;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                case 14:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public final C1836Qh0 b(@NotNull C5638o21 c5638o21) {
        String strE;
        if (c5638o21 == null) {
            a(9);
            throw null;
        }
        String str = this.a;
        if (str.isEmpty()) {
            strE = c5638o21.e();
        } else {
            strE = str + "." + c5638o21.e();
        }
        return new C1836Qh0(strE, this, c5638o21);
    }

    public final void c() {
        String str = this.a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = C5638o21.i(str.substring(iLastIndexOf + 1));
            this.c = new C1836Qh0(str.substring(0, iLastIndexOf));
        } else {
            this.d = C5638o21.i(str);
            this.c = C1758Ph0.c.i();
        }
    }

    public final boolean d() {
        if (this.b != null) {
            return true;
        }
        String str = this.a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    @NotNull
    public final List<C5638o21> e() {
        List<C5638o21> list;
        String str = this.a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f.split(str);
            Intrinsics.checkNotNullParameter(strArrSplit, "<this>");
            a transform = g;
            Intrinsics.checkNotNullParameter(transform, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                transform.getClass();
                arrayList.add(C5638o21.i(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1836Qh0) && this.a.equals(((C1836Qh0) obj).a);
    }

    @NotNull
    public final C5638o21 f() {
        C5638o21 c5638o21 = this.d;
        if (c5638o21 != null) {
            if (c5638o21 != null) {
                return c5638o21;
            }
            a(10);
            throw null;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        C5638o21 c5638o22 = this.d;
        if (c5638o22 != null) {
            return c5638o22;
        }
        a(11);
        throw null;
    }

    @NotNull
    public final C1758Ph0 g() {
        C1758Ph0 c1758Ph0 = this.b;
        if (c1758Ph0 == null) {
            C1758Ph0 c1758Ph1 = new C1758Ph0(this);
            this.b = c1758Ph1;
            return c1758Ph1;
        }
        if (c1758Ph0 != null) {
            return c1758Ph0;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        String strE = this.a;
        if (strE.isEmpty()) {
            strE = e.e();
        }
        if (strE != null) {
            return strE;
        }
        a(18);
        throw null;
    }

    public C1836Qh0(@NotNull String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public C1836Qh0(@NotNull String str, C1836Qh0 c1836Qh0, C5638o21 c5638o21) {
        if (str != null) {
            this.a = str;
            this.c = c1836Qh0;
            this.d = c5638o21;
            return;
        }
        a(3);
        throw null;
    }
}
