package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7709xu implements InterfaceC7809yN1 {

    @NotNull
    public static final a a = new a();

    /* JADX INFO: renamed from: xu$a */
    public static final class a implements C7834yW.a {
        @Override // defpackage.C7834yW.a
        public final boolean b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            boolean z = C7499wu.d;
            return false;
        }

        @Override // defpackage.C7834yW.a
        @NotNull
        public final InterfaceC7809yN1 c(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C7709xu();
        }
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean a() {
        boolean z = C7499wu.d;
        return C7499wu.d;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // defpackage.InterfaceC7809yN1
    @Nullable
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            parameters.setApplicationProtocols((String[]) C1903Rd1.a.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
