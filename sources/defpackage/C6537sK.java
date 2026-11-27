package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6537sK implements InterfaceC7809yN1 {

    @NotNull
    public static final a a = new a();

    /* JADX INFO: renamed from: sK$a */
    public static final class a implements C7834yW.a {
        @Override // defpackage.C7834yW.a
        public final boolean b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C6327rK.d && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // defpackage.C7834yW.a
        @NotNull
        public final InterfaceC7809yN1 c(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C6537sK();
        }
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean a() {
        boolean z = C6327rK.d;
        return C6327rK.d;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // defpackage.InterfaceC7809yN1
    @Nullable
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C1903Rd1.a.a(protocols).toArray(new String[0]));
        }
    }
}
