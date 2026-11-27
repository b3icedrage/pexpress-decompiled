package defpackage;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class C1892Ra implements InterfaceC7809yN1 {
    @Override // defpackage.InterfaceC7809yN1
    public final boolean a() {
        C1903Rd1 c1903Rd1 = C1903Rd1.a;
        return C1903Rd1.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // defpackage.InterfaceC7809yN1
    @SuppressLint({"NewApi"})
    @Nullable
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.InterfaceC7809yN1
    @SuppressLint({"NewApi"})
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            sSLParameters.setApplicationProtocols((String[]) C1903Rd1.a.a(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
