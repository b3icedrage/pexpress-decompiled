package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: q81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6082q81 implements HostnameVerifier {
    public static final C6082q81 a = new C6082q81();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        boolean z2 = true;
        boolean z3 = false;
        if (b.matcher(str).matches()) {
            List<String> listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (str.equalsIgnoreCase(listA.get(i2))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List<String> listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i3 = 0;
        boolean z4 = false;
        while (i3 < size2) {
            if (c(lowerCase, listA2.get(i3))) {
                return true;
            }
            i3++;
            z4 = true;
        }
        if (!z4) {
            I20 i20 = new I20(x509Certificate.getSubjectX500Principal());
            i20.c = 0;
            i20.d = 0;
            i20.e = 0;
            i20.f = 0;
            String str3 = i20.a;
            i20.g = str3.toCharArray();
            String strC = i20.c();
            String str4 = null;
            if (strC == null) {
                z = z3;
            } else {
                while (true) {
                    int i4 = i20.c;
                    int i5 = i20.b;
                    if (i4 == i5) {
                        break;
                    }
                    char c4 = i20.g[i4];
                    char c5 = c3;
                    boolean z5 = z2;
                    if (c4 == '\"') {
                        z = z3;
                        int i6 = i4 + 1;
                        i20.c = i6;
                        i20.d = i6;
                        i20.e = i6;
                        while (true) {
                            int i7 = i20.c;
                            if (i7 == i5) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = i20.g;
                            char c6 = cArr2[i7];
                            if (c6 == '\"') {
                                i20.c = i7 + 1;
                                while (true) {
                                    int i8 = i20.c;
                                    if (i8 >= i5 || i20.g[i8] != ' ') {
                                        break;
                                    }
                                    i20.c = i8 + 1;
                                }
                                char[] cArr3 = i20.g;
                                int i9 = i20.d;
                                str2 = new String(cArr3, i9, i20.e - i9);
                                break;
                            }
                            if (c6 == '\\') {
                                cArr2[i20.e] = i20.b();
                            } else {
                                cArr2[i20.e] = c6;
                            }
                            i20.c++;
                            i20.e++;
                        }
                    } else if (c4 == '#') {
                        z = z3;
                        if (i4 + 4 >= i5) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        i20.d = i4;
                        i20.c = i4 + 1;
                        while (true) {
                            int i10 = i20.c;
                            if (i10 == i5 || (c = (cArr = i20.g)[i10]) == '+' || c == ',' || c == ';') {
                                i20.e = i10;
                                break;
                            }
                            if (c == ' ') {
                                i20.e = i10;
                                i20.c = i10 + 1;
                                while (true) {
                                    int i11 = i20.c;
                                    if (i11 >= i5 || i20.g[i11] != ' ') {
                                        break;
                                    }
                                    i20.c = i11 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i10] = (char) (c + ' ');
                                }
                                i20.c = i10 + 1;
                            }
                        }
                        int i12 = i20.e;
                        int i13 = i20.d;
                        int i14 = i12 - i13;
                        if (i14 < 5 || (i14 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i15 = i14 / 2;
                        byte[] bArr = new byte[i15];
                        int i16 = i13 + 1;
                        for (?? r12 = z; r12 < i15; r12++) {
                            bArr[r12] = (byte) i20.a(i16);
                            i16 += 2;
                        }
                        str2 = new String(i20.g, i20.d, i14);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        z = z3;
                        str2 = "";
                    } else {
                        i20.d = i4;
                        i20.e = i4;
                        while (true) {
                            int i17 = i20.c;
                            if (i17 >= i5) {
                                char[] cArr4 = i20.g;
                                int i18 = i20.d;
                                str2 = new String(cArr4, i18, i20.e - i18);
                                z = z3;
                            } else {
                                char[] cArr5 = i20.g;
                                char c7 = cArr5[i17];
                                if (c7 != ' ') {
                                    if (c7 != ';') {
                                        if (c7 == '\\') {
                                            z = z3;
                                            int i19 = i20.e;
                                            i20.e = i19 + 1;
                                            cArr5[i19] = i20.b();
                                            i20.c++;
                                        } else if (c7 != '+' && c7 != ',') {
                                            int i21 = i20.e;
                                            z = z3;
                                            i20.e = i21 + 1;
                                            cArr5[i21] = c7;
                                            i20.c = i17 + 1;
                                        }
                                        z3 = z;
                                    }
                                    z = z3;
                                    int i22 = i20.d;
                                    str2 = new String(cArr5, i22, i20.e - i22);
                                } else {
                                    z = z3;
                                    int i23 = i20.e;
                                    i20.f = i23;
                                    i20.c = i17 + 1;
                                    i20.e = i23 + 1;
                                    cArr5[i23] = ' ';
                                    while (true) {
                                        i = i20.c;
                                        if (i >= i5) {
                                            break;
                                        }
                                        char[] cArr6 = i20.g;
                                        if (cArr6[i] != ' ') {
                                            break;
                                        }
                                        int i24 = i20.e;
                                        i20.e = i24 + 1;
                                        cArr6[i24] = ' ';
                                        i20.c = i + 1;
                                    }
                                    if (i == i5 || (c2 = i20.g[i]) == ',' || c2 == '+' || c2 == ';') {
                                        char[] cArr7 = i20.g;
                                        int i25 = i20.d;
                                        str2 = new String(cArr7, i25, i20.f - i25);
                                    } else {
                                        z3 = z;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str4 = str2;
                    } else {
                        int i26 = i20.c;
                        if (i26 < i5) {
                            char c8 = i20.g[i26];
                            if (c8 != ',' && c8 != ';' && c8 != '+') {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            i20.c = i26 + 1;
                            strC = i20.c();
                            if (strC == null) {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            c3 = c5;
                            z2 = z5;
                            z3 = z;
                        }
                    }
                }
                z = z3;
            }
            return str4 != null ? c(lowerCase, str4) : z;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
