package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3717f71 extends ProxySelector {

    @NotNull
    public static final C3717f71 a = new C3717f71();

    @Override // java.net.ProxySelector
    @NotNull
    public final List<Proxy> select(@Nullable URI uri) {
        if (uri != null) {
            return VE.c(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
    }
}
