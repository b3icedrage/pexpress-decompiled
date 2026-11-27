package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.JwtParser;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum DI0 {
    BOOLEAN(EnumC6405rh1.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC6405rh1.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC6405rh1.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC6405rh1.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC6405rh1.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC6405rh1.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC6405rh1.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC6405rh1.DOUBLE, "double", "D", "java.lang.Double");

    public static final HashMap q = new HashMap();
    public static final EnumMap r = new EnumMap(EnumC6405rh1.class);
    public static final HashMap s = new HashMap();
    public static final HashSet t = new HashSet();
    public static final HashMap u = new HashMap();
    public final EnumC6405rh1 d;
    public final String e;
    public final String g;
    public final C1758Ph0 h;

    static {
        for (DI0 di0 : values()) {
            q.put(di0.e, di0);
            r.put(di0.i(), di0);
            s.put(di0.f(), di0);
            String strReplace = di0.h.b().replace(JwtParser.SEPARATOR_CHAR, '/');
            t.add(strReplace);
            u.put(strReplace, "(" + di0.g + ")L" + strReplace + ";");
        }
    }

    DI0(@NotNull EnumC6405rh1 enumC6405rh1, @NotNull String str, String str2, String str3) {
        if (enumC6405rh1 == null) {
            b(8);
            throw null;
        }
        this.d = enumC6405rh1;
        this.e = str;
        this.g = str2;
        this.h = new C1758Ph0(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 6:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static DI0 e(@NotNull String str) {
        DI0 di0 = (DI0) q.get(str);
        if (di0 != null) {
            return di0;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    @NotNull
    public final String f() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        b(14);
        throw null;
    }

    @NotNull
    public final EnumC6405rh1 i() {
        EnumC6405rh1 enumC6405rh1 = this.d;
        if (enumC6405rh1 != null) {
            return enumC6405rh1;
        }
        b(12);
        throw null;
    }
}
