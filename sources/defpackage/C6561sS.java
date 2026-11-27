package defpackage;

import androidx.annotation.NonNull;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.android.gms.common.annotation.KeepForSdk;
import io.sentry.ILogger;
import java.io.EOFException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class C6561sS implements ILogger {
    public static final C6561sS a = new C6561sS();

    public static DG e() {
        DG dg = new DG(true);
        dg.V(null);
        return dg;
    }

    @NotNull
    public static final FS0 f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        FS0 fs0C = MS0.c(name);
        Intrinsics.checkNotNullExpressionValue(fs0C, "getLogger(name)");
        return fs0C;
    }

    @NotNull
    public static final void g(@NotNull Qd2 qd2, @NotNull Function1 action) {
        Intrinsics.checkNotNullParameter(qd2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        C5189lv.k(C8056za.j(qd2), C6266r20.a, new Ud2(action, null), 2);
    }

    public static SimpleDateFormat i(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(EK.e(i, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(EK.e(i2, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final boolean k(@NotNull C1481Lu c1481Lu) {
        Intrinsics.checkNotNullParameter(c1481Lu, "<this>");
        try {
            C1481Lu c1481Lu2 = new C1481Lu();
            long j = c1481Lu.e;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            c1481Lu.p(c1481Lu2, 0L, j2);
            int i = 0;
            while (i < 16) {
                i++;
                if (c1481Lu2.t()) {
                    return true;
                }
                int iR0 = c1481Lu2.R0();
                if (!Character.isISOControl(iR0) || Character.isWhitespace(iR0)) {
                }
                return false;
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object l(@NotNull C4923kf c4923kf, @NotNull CommonError commonError, boolean z, @NotNull LM lm) {
        Fl2 fl2;
        if (lm instanceof Fl2) {
            fl2 = (Fl2) lm;
            int i = fl2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl2.e = i - Integer.MIN_VALUE;
            } else {
                fl2 = new Fl2(lm);
            }
        } else {
            fl2 = new Fl2(lm);
        }
        Object obj = fl2.d;
        MN mn = MN.d;
        int i2 = fl2.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (!C1603Nh1.a(commonError)) {
                return Boolean.FALSE;
            }
            GP1 gp1 = c4923kf.f;
            Intrinsics.checkNotNullParameter(gp1, "<this>");
            Object value = gp1.getValue();
            if (value == null ? false : gp1.d(value, null)) {
                EnumC0936Eu level = EnumC0936Eu.e;
                Pair pair = new Pair("error_kind", UF.b(commonError));
                String strF = C2017Sp1.a.b(commonError.getClass()).f();
                if (strF == null) {
                    strF = "Unknown";
                }
                Map extra = PW0.e(pair, new Pair("error_class", strF), new Pair("code", new Integer(commonError.getCode())), new Pair("is_real", Boolean.valueOf(z)));
                Intrinsics.checkNotNullParameter(level, "level");
                Intrinsics.checkNotNullParameter("ws_auth_revoked", "reason");
                Intrinsics.checkNotNullParameter(extra, "extra");
                C1988Sg c1988Sg = U0.O;
                if (c1988Sg != null) {
                    c1988Sg.l("auth", "auth.logout", level, PW0.h(extra, new Pair("reason", "ws_auth_revoked")));
                }
                C2486Yg c2486Yg = U0.Q;
                if (c2486Yg != null) {
                    c2486Yg.invoke("ws_auth_revoked", extra);
                }
                C7540x51 c7540x51 = C7540x51.e;
                Gl2 gl2 = new Gl2(c4923kf, null);
                fl2.e = 1;
                if (C5189lv.p(c7540x51, gl2, fl2) == mn) {
                    return mn;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    public static int m(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (U0.k(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (U0.k(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static int n(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (U0.k(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int o(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (U0.k(i2, charSequence)) {
                    i = i2;
                } else {
                    if (cCharAt == c) {
                        return i;
                    }
                    if (c == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c) {
                    return i;
                }
                if (c == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public static final int p(@NotNull BE1 be1, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(be1, "<this>");
        int[] iArr = be1.j;
        int i3 = i + 1;
        int length = be1.i.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull NG1 ng1, @NotNull String str, @Nullable Object... objArr) {
        System.out.println(ng1 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean b(@Nullable NG1 ng1) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull NG1 ng1, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(ng1 + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.ILogger
    public void d(@NotNull NG1 ng1, @NotNull String str, @Nullable Throwable th) {
        if (th == null) {
            a(ng1, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(ng1 + ": " + str2 + "\n" + stringWriter.toString());
    }

    public void h(@NonNull C3549eK1 c3549eK1, float f, float f2) {
        throw null;
    }

    public boolean j() {
        throw null;
    }

    public void r(boolean z) {
        throw null;
    }

    public void q(boolean z) {
    }
}
