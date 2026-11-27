package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.annotation.NonNull;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 implements C2943bS.b {

    @Nullable
    public static C5564nh A;

    @Nullable
    public static C5774oh B;

    @Nullable
    public static C5984ph C;

    @Nullable
    public static C1128Hg D;

    @Nullable
    public static C1284Jg E;

    @Nullable
    public static C1362Kg F;

    @Nullable
    public static C1440Lg G;

    @Nullable
    public static C2564Zg H;

    @Nullable
    public static C1517Mg I;

    @Nullable
    public static C1598Ng J;

    @Nullable
    public static C1676Og K;

    @Nullable
    public static C1206Ig L;

    @Nullable
    public static C1754Pg M;

    @Nullable
    public static C1832Qg N;

    @Nullable
    public static C1988Sg O;

    @Nullable
    public static C2408Xg P;

    @Nullable
    public static C2486Yg Q;

    @Nullable
    public static C2066Tg R;

    @Nullable
    public static C2222Vg S;

    @Nullable
    public static C2304Wg T;

    @Nullable
    public static C2771ah U;

    @Nullable
    public static C2995bh V;
    public static final int[] e = new int[0];
    public static final long[] g = new long[0];
    public static final Object[] h = new Object[0];
    public static final U0 i = new U0(2);

    @NotNull
    public static final U0 j = new U0(3);

    @NotNull
    public static final U0 k = new U0(6);

    @Nullable
    public static C1050Gg l;

    @Nullable
    public static C1206Ig m;

    @Nullable
    public static C2144Ug n;

    @Nullable
    public static C3414dh o;

    @Nullable
    public static C3623eh p;

    @Nullable
    public static C3833fh q;

    @Nullable
    public static C4043gh r;

    @Nullable
    public static C4253hh s;

    @Nullable
    public static C4462ih t;

    @Nullable
    public static C4721jh u;

    @Nullable
    public static C1910Rg v;

    @Nullable
    public static C3204ch w;

    @Nullable
    public static C4931kh x;

    @Nullable
    public static C5141lh y;

    @Nullable
    public static C5354mh z;
    public final /* synthetic */ int d;

    public /* synthetic */ U0(int i2) {
        this.d = i2;
    }

    public static final C1758Ph0 a(C1758Ph0 c1758Ph0, String str) {
        C1758Ph0 c1758Ph0C = c1758Ph0.c(C5638o21.k(str));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
        return c1758Ph0C;
    }

    public static int b(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static int c(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void d(@NonNull String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    @NonNull
    public static void f(Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void g(@NotNull File location) throws IOException {
        Intrinsics.checkNotNullParameter(location, "location");
        if (location.exists() || location.mkdirs() || location.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + location);
    }

    public static void h(@NotNull Context context, @Nullable String str, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (str == null || StringsKt.I(str) || !d.o(str, "https", false)) {
            return;
        }
        if (C6333rM.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            DownloadManager.Request notificationVisibility = new DownloadManager.Request(Uri.parse(str)).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName).setNotificationVisibility(1);
            Object systemService = context.getSystemService("download");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).enqueue(notificationVisibility);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static void i(LinkedList linkedList, Throwable th, StackTraceElement[] stackTraceElementArr) {
        int i2;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTraceElementArr == null) {
            i2 = 0;
        } else {
            int length = stackTrace.length - 1;
            i2 = 0;
            for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
                i2++;
                length--;
            }
        }
        String strConcat = (stackTraceElementArr != null ? "Caused by: " : "").concat(th.getClass().getName());
        if (th.getMessage() != null) {
            StringBuilder sbB = K1.b(strConcat, ": ");
            sbB.append(th.getMessage());
            strConcat = sbB.toString();
        }
        linkedList.add(strConcat);
        for (int i3 = 0; i3 < stackTrace.length - i2; i3++) {
            linkedList.add("\tat " + stackTrace[i3].toString());
        }
        if (i2 != 0) {
            linkedList.add("\t... " + i2 + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            i(linkedList, cause, stackTrace);
        }
    }

    @Nullable
    public static final String j(@Nullable String str) {
        Object objA;
        if (str == null) {
            return null;
        }
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = new URI(str).getHost();
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        return (String) (objA instanceof C1717Ot1.b ? null : objA);
    }

    public static boolean k(int i2, CharSequence charSequence) {
        if (i2 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i2);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static final boolean l(AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC != null) {
            if (C7138vA0.b(interfaceC5044lDC)) {
                Intrinsics.checkNotNullParameter(interfaceC5044lDC, "<this>");
                if (C7138vA0.f(interfaceC5044lDC) && !C4900kZ.g((FC) interfaceC5044lDC).equals(C4194hP1.h)) {
                    return true;
                }
            }
            if (C7138vA0.h(abstractC4649jL0)) {
                return true;
            }
        }
        InterfaceC5044lD interfaceC5044lDC2 = abstractC4649jL0.V0().c();
        H62 h62 = interfaceC5044lDC2 instanceof H62 ? (H62) interfaceC5044lDC2 : null;
        return h62 != null && l(C0564Aa.n(h62));
    }

    public static int m(char c, int i2, int i3, CharSequence charSequence) {
        while (i2 < i3) {
            if (charSequence.charAt(i2) != c) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int n(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    @NotNull
    public static final void o(@NotNull RI0 baseClass, @Nullable String str) {
        String string;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.f() + '\'';
        if (str == null) {
            string = C1742Pc.d(JwtParser.SEPARATOR_CHAR, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbA = C5896pG.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            C5896pG.b(sbA, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbA.append(baseClass.f());
            sbA.append("' has to be sealed and '@Serializable'.");
            string = sbA.toString();
        }
        throw new ZH1(string);
    }

    @Nullable
    public Unit p(@NotNull O42 o42, @NotNull AbstractC7926yw0 abstractC7926yw0) {
        if (abstractC7926yw0 instanceof VU1) {
            o42.a(((VU1) abstractC7926yw0).a);
        } else if (abstractC7926yw0 instanceof I70) {
            o42.c(((I70) abstractC7926yw0).a);
        }
        return Unit.a;
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        int i2 = C4900kZ.a;
        Collection<? extends InterfaceC1335Jx> collectionU = ((Xc2) obj).u();
        ArrayList arrayList = new ArrayList(XE.m(collectionU, 10));
        Iterator<T> it = collectionU.iterator();
        while (it.hasNext()) {
            arrayList.add(((Xc2) it.next()).U0());
        }
        return arrayList;
    }

    public String toString() {
        switch (this.d) {
            case 6:
                return "coil.transition.NoneTransition";
            default:
                return super.toString();
        }
    }
}
