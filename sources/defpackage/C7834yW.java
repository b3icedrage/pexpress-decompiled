package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7834yW implements InterfaceC7809yN1 {

    @NotNull
    public final a a;

    @Nullable
    public InterfaceC7809yN1 b;

    /* JADX INFO: renamed from: yW$a */
    public interface a {
        boolean b(@NotNull SSLSocket sSLSocket);

        @NotNull
        InterfaceC7809yN1 c(@NotNull SSLSocket sSLSocket);
    }

    public C7834yW(@NotNull a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.a = socketAdapterFactory;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.a.b(sslSocket);
    }

    @Override // defpackage.InterfaceC7809yN1
    @Nullable
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        InterfaceC7809yN1 interfaceC7809yN1E = e(sslSocket);
        if (interfaceC7809yN1E != null) {
            return interfaceC7809yN1E.c(sslSocket);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        InterfaceC7809yN1 interfaceC7809yN1E = e(sslSocket);
        if (interfaceC7809yN1E != null) {
            interfaceC7809yN1E.d(sslSocket, str, protocols);
        }
    }

    public final synchronized InterfaceC7809yN1 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
