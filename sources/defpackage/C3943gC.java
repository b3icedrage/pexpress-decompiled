package defpackage;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943gC {

    @NotNull
    public static final b b;

    @NotNull
    public static final a c;

    @NotNull
    public static final LinkedHashMap d;

    @NotNull
    public static final C3943gC e;

    @NotNull
    public static final C3943gC f;

    @NotNull
    public static final C3943gC g;

    @NotNull
    public static final C3943gC h;

    @NotNull
    public static final C3943gC i;

    @NotNull
    public static final C3943gC j;

    @NotNull
    public static final C3943gC k;

    @NotNull
    public static final C3943gC l;

    @NotNull
    public static final C3943gC m;

    @NotNull
    public static final C3943gC n;

    @NotNull
    public static final C3943gC o;

    @NotNull
    public static final C3943gC p;

    @NotNull
    public static final C3943gC q;

    @NotNull
    public static final C3943gC r;

    @NotNull
    public static final C3943gC s;

    @NotNull
    public static final C3943gC t;

    @NotNull
    public final String a;

    /* JADX INFO: renamed from: gC$a */
    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a = str;
            String b = str2;
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            int iMin = Math.min(a.length(), b.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = a.charAt(i);
                char cCharAt2 = b.charAt(i);
                if (cCharAt != cCharAt2) {
                    return Intrinsics.e(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a.length();
            int length2 = b.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: gC$b */
    public static final class b {
        public static final C3943gC a(b bVar, String str) {
            C3943gC c3943gC = new C3943gC(str);
            C3943gC.d.put(str, c3943gC);
            return c3943gC;
        }

        public static String c(String str) {
            if (d.o(str, "TLS_", false)) {
                StringBuilder sb = new StringBuilder("SSL_");
                String strSubstring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!d.o(str, "SSL_", false)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder("TLS_");
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring2);
            return sb2.toString();
        }

        @NotNull
        public final synchronized C3943gC b(@NotNull String javaName) {
            C3943gC c3943gC;
            try {
                Intrinsics.checkNotNullParameter(javaName, "javaName");
                LinkedHashMap linkedHashMap = C3943gC.d;
                c3943gC = (C3943gC) linkedHashMap.get(javaName);
                if (c3943gC == null) {
                    c3943gC = (C3943gC) linkedHashMap.get(c(javaName));
                    if (c3943gC == null) {
                        c3943gC = new C3943gC(javaName);
                    }
                    linkedHashMap.put(javaName, c3943gC);
                }
            } catch (Throwable th) {
                throw th;
            }
            return c3943gC;
        }
    }

    static {
        b bVar = new b();
        b = bVar;
        c = new a();
        d = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        e = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        h = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b.a(bVar, "TLS_FALLBACK_SCSV");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = b.a(bVar, "TLS_AES_128_GCM_SHA256");
        s = b.a(bVar, "TLS_AES_256_GCM_SHA384");
        t = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public C3943gC(String str) {
        this.a = str;
    }

    @NotNull
    public final String toString() {
        return this.a;
    }
}
