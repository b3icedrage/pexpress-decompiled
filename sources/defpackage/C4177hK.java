package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4177hK {

    @NotNull
    public final List<C3967gK> a;
    public int b;
    public boolean c;
    public boolean d;

    public C4177hK(@NotNull List<C3967gK> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.a = connectionSpecs;
    }

    @NotNull
    public final C3967gK a(@NotNull SSLSocket sslSocket) throws UnknownServiceException {
        C3967gK connectionSpec;
        int i;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i2 = this.b;
        List<C3967gK> list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = list.get(i2);
            if (connectionSpec.b(sslSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (list.get(i3).b(sslSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = C6806tc2.q(enabledCipherSuites, strArr, C3943gC.c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            C7948z21 c7948z21 = C7948z21.a;
            Intrinsics.c(c7948z21, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            tlsVersionsIntersection = C6806tc2.q(enabledProtocols2, strArr2, c7948z21);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        C3943gC.a comparator = C3943gC.c;
        byte[] bArr = C6806tc2.a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        C3967gK.a aVar = new C3967gK.a();
        aVar.a = connectionSpec.a;
        aVar.b = strArr;
        aVar.c = strArr2;
        aVar.d = connectionSpec.b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        C3967gK c3967gKA = aVar.a();
        if (c3967gKA.c() != null) {
            sslSocket.setEnabledProtocols(c3967gKA.d);
        }
        if (c3967gKA.a() != null) {
            sslSocket.setEnabledCipherSuites(c3967gKA.c);
        }
        return connectionSpec;
    }
}
