package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4362iB1 {

    @NotNull
    public final C5450n8 a;

    @NotNull
    public final Proxy b;

    @NotNull
    public final InetSocketAddress c;

    public C4362iB1(@NotNull C5450n8 address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.a = address;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4362iB1)) {
            return false;
        }
        C4362iB1 c4362iB1 = (C4362iB1) obj;
        return Intrinsics.a(c4362iB1.a, this.a) && Intrinsics.a(c4362iB1.b, this.b) && Intrinsics.a(c4362iB1.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
