package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: En0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0916En0 {

    @NotNull
    public final ZZ1 a;

    @NotNull
    public final C3943gC b;

    @NotNull
    public final List<Certificate> c;

    @NotNull
    public final KW1 d;

    /* JADX INFO: renamed from: En0$a */
    public static final class a {

        /* JADX INFO: renamed from: En0$a$a, reason: collision with other inner class name */
        public static final class C0025a extends ML0 implements Function0<List<? extends Certificate>> {
            public final /* synthetic */ List<Certificate> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0025a(List<? extends Certificate> list) {
                super(0);
                this.d = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.d;
            }
        }

        @NotNull
        public static C0916En0 a(@NotNull SSLSession sSLSession) throws IOException {
            List listM;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            C3943gC c3943gCB = C3943gC.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            ZZ1 zz1A = ZZ1.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listM = peerCertificates != null ? C6806tc2.m(Arrays.copyOf(peerCertificates, peerCertificates.length)) : C5653o60.d;
            } catch (SSLPeerUnverifiedException unused) {
                listM = C5653o60.d;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new C0916En0(zz1A, c3943gCB, localCertificates != null ? C6806tc2.m(Arrays.copyOf(localCertificates, localCertificates.length)) : C5653o60.d, new C0025a(listM));
        }
    }

    /* JADX INFO: renamed from: En0$b */
    public static final class b extends ML0 implements Function0<List<? extends Certificate>> {
        public final /* synthetic */ ML0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.d = (ML0) function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ML0, kotlin.jvm.functions.Function0] */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.d.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C5653o60.d;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0916En0(@NotNull ZZ1 tlsVersion, @NotNull C3943gC cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.a = tlsVersion;
        this.b = cipherSuite;
        this.c = localCertificates;
        this.d = XO0.b(new b(peerCertificatesFn));
    }

    @NotNull
    public final List<Certificate> a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0916En0)) {
            return false;
        }
        C0916En0 c0916En0 = (C0916En0) obj;
        return c0916En0.a == this.a && Intrinsics.a(c0916En0.b, this.b) && Intrinsics.a(c0916En0.a(), a()) && Intrinsics.a(c0916En0.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(XE.m(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
