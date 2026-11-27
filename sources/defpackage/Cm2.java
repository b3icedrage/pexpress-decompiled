package defpackage;

import androidx.cardview.widget.CardView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Cm2 implements UR1, InterfaceC3529eE {
    public static C5642o31 d;
    public static String[] e;

    public static final void b(AbstractC6578sX1 abstractC6578sX1, C7839yX1 c7839yX1, String str) {
        Logger logger = C8049zX1.i;
        StringBuilder sb = new StringBuilder();
        sb.append(c7839yX1.b);
        sb.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC6578sX1.a);
        logger.fine(sb.toString());
    }

    @NotNull
    public static final C2814ao1 c(@NotNull KM1 km1) {
        Intrinsics.checkNotNullParameter(km1, "<this>");
        return new C2814ao1(km1);
    }

    @NotNull
    public static final C3024bo1 e(@NotNull UN1 un1) {
        Intrinsics.checkNotNullParameter(un1, "<this>");
        return new C3024bo1(un1);
    }

    @NotNull
    public static final String g(long j) {
        String strC;
        if (j <= -999500000) {
            strC = C0681Bn.c(new StringBuilder(), (j - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j <= -999500) {
            strC = C0681Bn.c(new StringBuilder(), (j - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j <= 0) {
            strC = C0681Bn.c(new StringBuilder(), (j - ((long) PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), " µs");
        } else if (j < 999500) {
            strC = C0681Bn.c(new StringBuilder(), (j + ((long) PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), " µs");
        } else {
            strC = j < 999500000 ? C0681Bn.c(new StringBuilder(), (j + ((long) 500000)) / ((long) 1000000), " ms") : C0681Bn.c(new StringBuilder(), (j + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        String str = String.format("%6s", Arrays.copyOf(new Object[]{strC}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static C3103cB1 h(InterfaceC3473dz interfaceC3473dz) {
        return (C3103cB1) ((CardView.a) interfaceC3473dz).a;
    }

    public static final boolean i(@NotNull AssertionError assertionError) {
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.C(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Y90 j(@NotNull final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new Y90(Executors.newScheduledThreadPool(1, new ThreadFactory(str, atomicInteger) { // from class: GY1
            public final /* synthetic */ String d;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, this.d);
                thread.setDaemon(true);
                return thread;
            }
        }));
    }

    @NotNull
    public static final String k(@NotNull C5638o21 c5638o21) {
        Intrinsics.checkNotNullParameter(c5638o21, "<this>");
        String strE = c5638o21.e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        if (!CK0.a.contains(strE)) {
            for (int i = 0; i < strE.length(); i++) {
                char cCharAt = strE.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strE.length() != 0 && Character.isJavaIdentifierStart(strE.codePointAt(0))) {
                String strE2 = c5638o21.e();
                Intrinsics.checkNotNullExpressionValue(strE2, "asString(...)");
                return strE2;
            }
        }
        StringBuilder sb = new StringBuilder();
        String strE3 = c5638o21.e();
        Intrinsics.checkNotNullExpressionValue(strE3, "asString(...)");
        sb.append("`" + strE3);
        sb.append('`');
        return sb.toString();
    }

    @NotNull
    public static final String l(@NotNull List pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            C5638o21 c5638o21 = (C5638o21) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(k(c5638o21));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final String m(@NotNull String lowerRendered, @NotNull String lowerPrefix, @NotNull String upperRendered, @NotNull String upperPrefix, @NotNull String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (!d.o(lowerRendered, lowerPrefix, false) || !d.o(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strC = Z0.c(foldedPrefix, strSubstring);
        if (Intrinsics.a(strSubstring, strSubstring2)) {
            return strC;
        }
        if (!r(strSubstring, strSubstring2)) {
            return null;
        }
        return strC + '!';
    }

    @NotNull
    public static final C7466wk o(@NotNull Socket socket) throws IOException {
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        AN1 an1 = new AN1(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        C1190Ia1 sink = new C1190Ia1(outputStream, an1);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C7466wk(an1, sink);
    }

    @NotNull
    public static final C7676xk p(@NotNull Socket socket) throws IOException {
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        AN1 an1 = new AN1(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        IA0 source = new IA0(inputStream, an1);
        Intrinsics.checkNotNullParameter(source, "source");
        return new C7676xk(an1, source);
    }

    @NotNull
    public static final IA0 q(@NotNull InputStream inputStream) {
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new IA0(inputStream, new LZ1());
    }

    public static final boolean r(@NotNull String lower, @NotNull String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.a(lower, d.m(upper, "?", ""))) {
            return true;
        }
        if (d.h(upper, "?", false)) {
            if (Intrinsics.a(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.a(sb.toString(), upper);
    }

    @Override // defpackage.UR1
    public Object a(C1441Lg0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return stream;
    }

    @Override // defpackage.InterfaceC3529eE
    public long d() {
        return System.currentTimeMillis();
    }

    @NotNull
    public N62 f(@NotNull H62 parameter, @NotNull VE0 typeAttr, @NotNull M62 typeParameterUpperBoundEraser, @NotNull AbstractC4649jL0 erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof VE0)) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
            Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
            return new P62(erasedUpperBound, EnumC3610ed2.OUT_VARIANCE);
        }
        if (!typeAttr.c) {
            typeAttr = typeAttr.c(YE0.d);
        }
        int iOrdinal = typeAttr.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new P62(erasedUpperBound, EnumC3610ed2.INVARIANT);
            }
            throw new C6489s51();
        }
        if (!parameter.S().e) {
            return new P62(C4900kZ.e(parameter).n(), EnumC3610ed2.INVARIANT);
        }
        List<H62> listB = erasedUpperBound.V0().b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        if (!listB.isEmpty()) {
            return new P62(erasedUpperBound, EnumC3610ed2.OUT_VARIANCE);
        }
        O62 o62L = C3089c72.l(parameter, typeAttr);
        Intrinsics.checkNotNull(o62L);
        return o62L;
    }

    public void n(InterfaceC3473dz interfaceC3473dz, float f) {
        C3103cB1 c3103cB1H = h(interfaceC3473dz);
        CardView.a aVar = (CardView.a) interfaceC3473dz;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != c3103cB1H.e || c3103cB1H.f != useCompatPadding || c3103cB1H.g != preventCornerOverlap) {
            c3103cB1H.e = f;
            c3103cB1H.f = useCompatPadding;
            c3103cB1H.g = preventCornerOverlap;
            c3103cB1H.b(null);
            c3103cB1H.invalidateSelf();
        }
        s(interfaceC3473dz);
    }

    public void s(InterfaceC3473dz interfaceC3473dz) {
        CardView.a aVar = (CardView.a) interfaceC3473dz;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f = h(interfaceC3473dz).e;
        float f2 = h(interfaceC3473dz).a;
        CardView cardView = CardView.this;
        int iCeil = (int) Math.ceil(C3313dB1.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C3313dB1.b(f, f2, cardView.getPreventCornerOverlap()));
        aVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
