package defpackage;

import android.database.Cursor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3043bv {
    public static final C2432Xo a = new C2432Xo();

    public static /* synthetic */ void a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 10) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    public static final NO b(String str, Object[] objArr) {
        Throwable th;
        int i;
        if (objArr == null || objArr.length == 0) {
            th = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            } else {
                th = null;
            }
        }
        int i2 = 0;
        if (th != null) {
            if (objArr == null || objArr.length == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            if (length > 0) {
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            objArr = objArr2;
        }
        if (str == null) {
            return new NO(null, objArr);
        }
        if (objArr == null) {
            return new NO(str, null);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new NO(str, objArr);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new NO(sb.toString(), objArr);
            }
            if (iIndexOf == 0) {
                sb.append((CharSequence) str, i3, iIndexOf);
                c(sb, objArr[i2], new HashMap());
                i = iIndexOf + 2;
            } else {
                int i4 = iIndexOf - 1;
                if (str.charAt(i4) != '\\') {
                    sb.append((CharSequence) str, i3, iIndexOf);
                    c(sb, objArr[i2], new HashMap());
                } else if (iIndexOf < 2 || str.charAt(iIndexOf - 2) != '\\') {
                    i2--;
                    sb.append((CharSequence) str, i3, i4);
                    sb.append('{');
                    i = iIndexOf + 1;
                } else {
                    sb.append((CharSequence) str, i3, i4);
                    c(sb, objArr[i2], new HashMap());
                }
                i = iIndexOf + 2;
            }
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new NO(sb.toString(), objArr);
    }

    public static void c(StringBuilder sb, Object obj, HashMap map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            try {
                sb.append(obj.toString());
                return;
            } catch (Throwable th) {
                C7016uc2.b("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
                sb.append("[FAILED toString()]");
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            sb.append('[');
            int length = zArr.length;
            while (i < length) {
                sb.append(zArr[i]);
                if (i != length - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            sb.append('[');
            int length2 = bArr.length;
            while (i < length2) {
                sb.append((int) bArr[i]);
                if (i != length2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            sb.append('[');
            int length3 = cArr.length;
            while (i < length3) {
                sb.append(cArr[i]);
                if (i != length3 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            sb.append('[');
            int length4 = sArr.length;
            while (i < length4) {
                sb.append((int) sArr[i]);
                if (i != length4 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            sb.append('[');
            int length5 = iArr.length;
            while (i < length5) {
                sb.append(iArr[i]);
                if (i != length5 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            sb.append('[');
            int length6 = jArr.length;
            while (i < length6) {
                sb.append(jArr[i]);
                if (i != length6 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            sb.append('[');
            int length7 = fArr.length;
            while (i < length7) {
                sb.append(fArr[i]);
                if (i != length7 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            sb.append('[');
            int length8 = dArr.length;
            while (i < length8) {
                sb.append(dArr[i]);
                if (i != length8 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            sb.append(']');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length9 = objArr.length;
            while (i < length9) {
                c(sb, objArr[i], map);
                if (i != length9 - 1) {
                    sb.append(", ");
                }
                i++;
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    public static final void d(@NotNull C3213cj0 db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        CQ0 cq0B = VE.b();
        Cursor cursorF = db.f("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorF.moveToNext()) {
            try {
                cq0B.add(cursorF.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(cursorF, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.a;
        cursorF.close();
        ListIterator listIterator = VE.a(cq0B).listIterator(0);
        while (true) {
            CQ0.c cVar = (CQ0.c) listIterator;
            if (!cVar.hasNext()) {
                return;
            }
            String triggerName = (String) cVar.next();
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (d.o(triggerName, "room_fts_content_sync_", false)) {
                db.E("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static C5638o21 e(C5638o21 c5638o21, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c5638o21.e) {
            String strF = c5638o21.f();
            Intrinsics.checkNotNullExpressionValue(strF, "getIdentifier(...)");
            if (d.o(strF, str, false) && strF.length() != str.length() && ('a' > (cCharAt = strF.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    StringBuilder sbF = C1039Gc0.f(str2);
                    sbF.append(StringsKt.M(strF, str));
                    return C5638o21.k(sbF.toString());
                }
                if (!z) {
                    return c5638o21;
                }
                String strM = StringsKt.M(strF, str);
                Intrinsics.checkNotNullParameter(strM, "<this>");
                if (strM.length() != 0 && C3686f.o(0, strM)) {
                    if (strM.length() == 1 || !C3686f.o(1, strM)) {
                        Intrinsics.checkNotNullParameter(strM, "<this>");
                        if (strM.length() != 0 && 'A' <= (cCharAt2 = strM.charAt(0)) && cCharAt2 < '[') {
                            char lowerCase = Character.toLowerCase(cCharAt2);
                            String strSubstring = strM.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            strM = lowerCase + strSubstring;
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(strM, "<this>");
                        Iterator<Integer> it = new IntRange(0, strM.length() - 1, 1).iterator();
                        do {
                            if (!((DB0) it).g) {
                                next = null;
                                break;
                            }
                            next = ((CB0) it).next();
                        } while (C3686f.o(((Number) next).intValue(), strM));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            StringBuilder sb = new StringBuilder();
                            String strSubstring2 = strM.substring(0, iIntValue);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            sb.append(C3686f.r(strSubstring2));
                            String strSubstring3 = strM.substring(iIntValue);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            sb.append(strSubstring3);
                            strM = sb.toString();
                        } else {
                            strM = C3686f.r(strM);
                        }
                    }
                }
                if (C5638o21.l(strM)) {
                    return C5638o21.k(strM);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final Cursor f(@NotNull QA1 db, @NotNull SA1 sqLiteQuery) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return db.l(sqLiteQuery);
    }

    public static final long g(@NotNull C2895bC c2895bC) {
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        long j = 0;
        do {
            j += (long) (c2895bC.c - c2895bC.b);
            c2895bC = c2895bC.g();
        } while (c2895bC != null);
        return j;
    }

    @NotNull
    public static final C6970uO0 h(@NotNull LO0 lo0, @NotNull WD0 annotationsOwner) {
        Intrinsics.checkNotNullParameter(lo0, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new C6970uO0(lo0, annotationsOwner, false);
    }
}
