package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5908pK extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ Q2 a;
    public final /* synthetic */ C5698oK b;
    public final /* synthetic */ C6399rg c;
    public final /* synthetic */ C1907Rf d;

    public C5908pK(Q2 q2, C5698oK c5698oK, C6399rg c6399rg, C1907Rf c1907Rf) {
        this.a = q2;
        this.b = c5698oK;
        this.c = c6399rg;
        this.d = c1907Rf;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.a.invoke();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        C5698oK c5698oK = this.b;
        GP1 gp1 = c5698oK.e;
        Boolean boolValueOf = Boolean.valueOf(networkCapabilities.hasCapability(12));
        gp1.getClass();
        gp1.m(null, boolValueOf);
        Boolean boolValueOf2 = Boolean.valueOf(networkCapabilities.hasTransport(4));
        GP1 gp2 = c5698oK.f;
        gp2.getClass();
        gp2.m(null, boolValueOf2);
        Boolean boolValueOf3 = Boolean.valueOf(networkCapabilities.hasTransport(1));
        GP1 gp3 = c5698oK.g;
        gp3.getClass();
        gp3.m(null, boolValueOf3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        GP1 gp1 = this.b.e;
        Boolean bool = Boolean.FALSE;
        gp1.getClass();
        gp1.m(null, bool);
        this.d.invoke();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        GP1 gp1 = this.b.e;
        Boolean bool = Boolean.FALSE;
        gp1.getClass();
        gp1.m(null, bool);
        this.c.invoke();
    }
}
