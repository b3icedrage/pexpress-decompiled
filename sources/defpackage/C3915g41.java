package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3915g41 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C4125h41 a;

    public C3915g41(C4125h41 c4125h41) {
        this.a = c4125h41;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        AS0 as0C = AS0.c();
        String str = C4335i41.a;
        Objects.toString(capabilities);
        as0C.getClass();
        C4125h41 c4125h41 = this.a;
        c4125h41.c(C4335i41.a(c4125h41.f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        AS0 as0C = AS0.c();
        String str = C4335i41.a;
        as0C.getClass();
        C4125h41 c4125h41 = this.a;
        c4125h41.c(C4335i41.a(c4125h41.f));
    }
}
