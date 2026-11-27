package defpackage;

import io.jsonwebtoken.JwtParser;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5872p81 implements HostnameVerifier {

    @NotNull
    public static final C5872p81 a = new C5872p81();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C5653o60.d;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C5653o60.d;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(C1332Jw.a(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbC = C1332Jw.c(length2, "endIndex > string.length: ", " > ");
            sbC.append(str.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    public static boolean c(@NotNull String host, @NotNull X509Certificate certificate) {
        boolean zA;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = C6806tc2.a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (C6806tc2.f.d(host)) {
            String strV = C1874Qu.v(host);
            List listA = a(certificate, 7);
            if (listA == null || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.a(strV, C1874Qu.v((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale locale = Locale.US;
            host = C4564j.g(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(certificate, 2);
        if (listA2 == null || !listA2.isEmpty()) {
            for (String strG : listA2) {
                if (host == null || host.length() == 0 || d.o(host, ".", false) || d.h(host, "..", false) || strG == null || strG.length() == 0 || d.o(strG, ".", false) || d.h(strG, "..", false)) {
                    zA = false;
                } else {
                    String strConcat = !d.h(host, ".", false) ? host.concat(".") : host;
                    if (!d.h(strG, ".", false)) {
                        strG = strG.concat(".");
                    }
                    if (b(strG)) {
                        Locale locale2 = Locale.US;
                        strG = C4564j.g(locale2, "US", strG, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!StringsKt.C(strG, "*", false)) {
                        zA = Intrinsics.a(strConcat, strG);
                    } else if (!d.o(strG, "*.", false) || StringsKt.F('*', 1, 4, strG) != -1 || strConcat.length() < strG.length() || "*.".equals(strG)) {
                        zA = false;
                    } else {
                        String strSubstring = strG.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (d.h(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || StringsKt.J(JwtParser.SEPARATOR_CHAR, length - 1, 4, strConcat) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
