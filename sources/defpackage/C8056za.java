package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.pexpress.tool.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Stack;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8056za implements SuccessContinuation, InterfaceC7096v {

    @NotNull
    public static final C4159hE d = new C4159hE(null);

    @NotNull
    public static final C8056za e = new C8056za();
    public static final Class[] g = {String.class};
    public static C8056za h;

    public static int b(int i, int i2) {
        return C4162hF.d(i, (Color.alpha(i) * i2) / 255);
    }

    public static Object c(C1528Mj1 c1528Mj1, String str, Class cls) {
        if (str != null) {
            String strTrim = str.trim();
            if (String.class.isAssignableFrom(cls)) {
                return strTrim;
            }
            if (Integer.TYPE.isAssignableFrom(cls)) {
                return new Integer(strTrim);
            }
            if (Long.TYPE.isAssignableFrom(cls)) {
                return new Long(strTrim);
            }
            if (Float.TYPE.isAssignableFrom(cls)) {
                return new Float(strTrim);
            }
            if (Double.TYPE.isAssignableFrom(cls)) {
                return new Double(strTrim);
            }
            if (Boolean.TYPE.isAssignableFrom(cls)) {
                if ("true".equalsIgnoreCase(strTrim)) {
                    return Boolean.TRUE;
                }
                if ("false".equalsIgnoreCase(strTrim)) {
                    return Boolean.FALSE;
                }
            } else {
                if (cls.isEnum()) {
                    return Enum.valueOf(cls, strTrim);
                }
                if (f(cls)) {
                    try {
                        return cls.getMethod("valueOf", g).invoke(null, strTrim);
                    } catch (Exception unused) {
                        c1528Mj1.l("Failed to invoke valueOf{} method in class [" + cls.getName() + "] with value [" + strTrim + "]");
                    }
                } else if (Charset.class.isAssignableFrom(cls)) {
                    try {
                        return Charset.forName(str);
                    } catch (UnsupportedCharsetException e2) {
                        c1528Mj1.m("Failed to get charset [" + str + "]", e2);
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public static InterfaceC1013Ft1 d(int i, @Nullable String str) throws JSONException {
        if (i == 200) {
            return new UU1();
        }
        if (i == 400) {
            return new C1781Pp(new JSONObject(str));
        }
        if (i == 413) {
            return new C1666Oc1(new JSONObject(str));
        }
        if (i == 429) {
            return new C4788k02(new JSONObject(str));
        }
        if (i == 408) {
            return new PZ1();
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject.put("error", str);
            }
        }
        return new C7220vb0(jSONObject);
    }

    public static final int e(@NotNull Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return fragment.getResources().getDimensionPixelSize(i);
    }

    public static boolean f(Class cls) {
        Method method = null;
        try {
            method = cls.getMethod("valueOf", g);
        } catch (NoSuchMethodException | SecurityException unused) {
        }
        if (method == null) {
            return false;
        }
        return Modifier.isStatic(method.getModifiers());
    }

    public static int g(@NonNull Context context, int i, int i2) {
        TypedValue typedValueA = C6577sX0.a(context, i);
        if (typedValueA == null) {
            return i2;
        }
        int i3 = typedValueA.resourceId;
        return i3 != 0 ? C6333rM.getColor(context, i3) : typedValueA.data;
    }

    public static int h(@NonNull View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueC = C6577sX0.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueC.resourceId;
        return i2 != 0 ? C6333rM.getColor(context, i2) : typedValueC.data;
    }

    public static final int i(@NotNull Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return C6333rM.getColor(fragment.requireContext(), i);
    }

    @NotNull
    public static final KN j(@NotNull Qd2 qd2) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(qd2, "<this>");
        HashMap map = qd2.a;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = qd2.a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        KN kn = (KN) obj2;
        if (kn != null) {
            return kn;
        }
        C4002gV1 c4002gV1A = C0564Aa.a();
        RV rv = C6266r20.a;
        Object objI = qd2.i(new C5890pE(CoroutineContext.Element.a.c(c4002gV1A, QV0.a.s1())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        Intrinsics.checkNotNullExpressionValue(objI, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (KN) objI;
    }

    public static Object k(String str, Class cls, HS0 hs0) throws V40, C7298vx0 {
        ClassLoader classLoaderA = C6559sR0.a(hs0);
        str.getClass();
        try {
            Class<?> clsLoadClass = classLoaderA.loadClass(str);
            if (cls.isAssignableFrom(clsLoadClass)) {
                return clsLoadClass.newInstance();
            }
            throw new C7298vx0();
        } catch (C7298vx0 e2) {
            throw e2;
        } catch (Throwable th) {
            throw new V40("Failed to instantiate type ".concat(str), th);
        }
    }

    public static boolean l(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal<double[]> threadLocal = C4162hF.a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static boolean m(String str) {
        return str == null || "".equals(str);
    }

    public static boolean n(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ' && cCharAt != '\"' && cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}' && cCharAt != '(' && cCharAt != ')') {
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        break;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                                break;
                        }
                        break;
                }
            }
            return false;
        }
        return true;
    }

    public static int o(float f, int i, int i2) {
        return C4162hF.b(C4162hF.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final void p(@NotNull Exception exc, @NotNull DS0 logger, @NotNull String message) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(message, "message");
        String message2 = exc.getMessage();
        if (message2 != null) {
            logger.error(message + ": " + message2);
        }
        if (exc.getStackTrace() != null) {
            logger.error("Stack trace: " + J90.b(exc));
        }
    }

    public static final void r(@NotNull CommonError error, @NotNull String flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(error, "error");
        String strB = UF.b(error);
        C1910Rg c1910Rg = U0.v;
        if (c1910Rg != null) {
            c1910Rg.invoke(new RuntimeException(C5491nL.c("Pending add user skipped: ", strB)), PW0.e(new Pair("phase", "pending_add_user_skipped"), new Pair("fingerprint_hint", C2629a1.b(flow, ":", strB)), new Pair("level", "warning"), new Pair("flow", flow), new Pair("error_code", Integer.valueOf(error.getCode())), new Pair("error_platform_code", KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, error.getPlatformCode()))));
        }
    }

    public static void s(Fragment fragment, String text, View view, int i) {
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        View viewRequireView = fragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        Pd2.c(viewRequireView, text, R.drawable.ic_snackbar_successful_action, null, null, view, -1);
    }

    public static String t(String str, C3315dC0 c3315dC0, InterfaceC7884yj1 interfaceC7884yj1) {
        try {
            C6699t51 c6699t51B = C7329w51.b(str);
            C7329w51 c7329w51 = new C7329w51(c6699t51B, c3315dC0, interfaceC7884yj1);
            StringBuilder sb = new StringBuilder();
            c7329w51.a(c6699t51B, sb, new Stack<>());
            return sb.toString();
        } catch (C2900bD1 e2) {
            throw new IllegalArgumentException(C1039Gc0.d("Failed to parse input [", str, "]"), e2);
        }
    }

    public static final long u(long j, long j2, long j3, @NotNull String str) {
        String property;
        int i = C3379dX1.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lC0 = StringsKt.c0(property);
        if (lC0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lC0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int v(int i, int i2, String str) {
        return (int) u(i, 1, (i2 & 8) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 2097150, str);
    }

    public static boolean w(String str, boolean z) {
        if (str != null) {
            String strTrim = str.trim();
            if ("true".equalsIgnoreCase(strTrim)) {
                return true;
            }
            if ("false".equalsIgnoreCase(strTrim)) {
                return false;
            }
        }
        return z;
    }

    public static Class x(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    public static final int y(@NotNull C2895bC c2895bC, @NotNull C2895bC other, int i) {
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(other.c - other.b, i);
        int i2 = c2895bC.e;
        int i3 = c2895bC.c;
        int i4 = i2 - i3;
        if (i4 <= iMin) {
            int i5 = c2895bC.f;
            if ((i5 - i2) + i4 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i3 + iMin) - i2 > 0) {
                c2895bC.e = i5;
            }
        }
        WY0.a(other.a, c2895bC.a, other.b, iMin, i3);
        other.c(iMin);
        c2895bC.a(iMin);
        return iMin;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public static final Object z(@NotNull LM frame) {
        Object obj;
        CoroutineContext context = frame.getContext();
        ED.h(context);
        JM jmB = C5885pC0.b(frame);
        C5004l20 c5004l20 = jmB instanceof C5004l20 ? (C5004l20) jmB : null;
        if (c5004l20 == null) {
            obj = Unit.a;
        } else {
            DN dn = c5004l20.h;
            if (dn.k1(context)) {
                c5004l20.j = Unit.a;
                c5004l20.g = 1;
                dn.j1(context, c5004l20);
            } else {
                Pl2 pl2 = new Pl2();
                CoroutineContext coroutineContextT = context.t(pl2);
                Unit unit = Unit.a;
                c5004l20.j = unit;
                c5004l20.g = 1;
                dn.j1(coroutineContextT, c5004l20);
                if (pl2.e) {
                    A80 a80A = EY1.a();
                    C6202qj<AbstractC5427n20<?>> c6202qj = a80A.i;
                    if (c6202qj != null ? c6202qj.isEmpty() : true) {
                        obj = Unit.a;
                    } else {
                        if (a80A.g >= 4294967296L) {
                            c5004l20.j = unit;
                            c5004l20.g = 1;
                            a80A.t1(c5004l20);
                            obj = MN.d;
                        } else {
                            a80A.u1(true);
                            try {
                                c5004l20.run();
                                do {
                                } while (a80A.w1());
                            } catch (Throwable th) {
                                try {
                                    c5004l20.g(th, null);
                                } catch (Throwable th2) {
                                    a80A.s1(true);
                                    throw th2;
                                }
                            }
                            a80A.s1(true);
                            obj = Unit.a;
                        }
                    }
                }
            }
            obj = MN.d;
        }
        MN mn = MN.d;
        if (obj == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj == mn ? obj : Unit.a;
    }

    @Override // defpackage.InterfaceC7096v
    public String a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1, str.length()) : str;
    }

    public void q(@NotNull EnumC4608j80 enumC4608j80, @NotNull C3091c80 c3091c80) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }
}
