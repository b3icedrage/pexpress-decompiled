package defpackage;

import android.annotation.SuppressLint;
import io.sentry.okhttp.d;
import io.sentry.okhttp.h;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SO1 {
    @SuppressLint({"TrustAllX509TrustManager"})
    @NotNull
    public static C6711t81 a(@Nullable O1 o1, @Nullable Long l) {
        try {
            C8103zl2.a.incrementAndGet();
            TrustManager[] trustManagerArr = {new RO1()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            C6711t81.a aVar = new C6711t81.a();
            if (o1 != null) {
                aVar.a(o1);
            }
            aVar.a(new C5157ll());
            aVar.a(new KX1());
            aVar.a(new h(new C1332Jw(), VE.c(new C0928Er0(400, 599)), VE.c(C2688aH1.DEFAULT_PROPAGATION_TARGETS), 1));
            if (o1 != null) {
                EnumC5513nS0 enumC5513nS0 = C3461dv.a;
                C1237Iq0.a LOGGER_LEVEL = C1237Iq0.a.d;
                Intrinsics.checkNotNullExpressionValue(LOGGER_LEVEL, "LOGGER_LEVEL");
                aVar.a(new C3364dS1());
            }
            C4478il originalEventListener = C4478il.b;
            Intrinsics.checkNotNullParameter(originalEventListener, "originalEventListener");
            Intrinsics.checkNotNullExpressionValue(SD1.a, "getInstance(...)");
            d eventListener = new d(new QN(originalEventListener, 1));
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            byte[] bArr = C6806tc2.a;
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            aVar.e = new VI1(eventListener);
            Intrinsics.checkNotNull(socketFactory);
            TrustManager trustManager = trustManagerArr[0];
            Intrinsics.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            aVar.b(socketFactory, (X509TrustManager) trustManager);
            Vf2 hostnameVerifier = new Vf2();
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!hostnameVerifier.equals(aVar.t)) {
                aVar.B = null;
            }
            aVar.t = hostnameVerifier;
            if (l != null) {
                long jLongValue = l.longValue();
                TimeUnit unit = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                aVar.z = C6806tc2.b("interval", jLongValue, unit);
            }
            return new C6711t81(aVar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
