package defpackage;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
public final class U31 implements S31 {
    public final Object d;
    public final Object e;
    public final Object g;

    public U31(E60 e60, Object obj, C4227ha1 c4227ha1) {
        this.d = e60;
        this.e = obj;
        this.g = c4227ha1;
    }

    public static final void b(U31 u31, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) u31.e).getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        boolean z3 = false;
        for (Network it : allNetworks) {
            if (Intrinsics.a(it, network)) {
                z2 = z;
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) u31.e).getNetworkCapabilities(it);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        PW1 pw1 = (PW1) u31.g;
        if (pw1.d.get() == null) {
            pw1.a();
        } else {
            pw1.g = z3;
        }
    }

    @Override // defpackage.S31
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.e;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        for (Network it : allNetworks) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(it);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.S31
    public void shutdown() {
        ((ConnectivityManager) this.e).unregisterNetworkCallback((T31) this.d);
    }

    public U31(@NotNull ConnectivityManager connectivityManager, @NotNull PW1 listener) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.e = connectivityManager;
        this.g = listener;
        T31 t31 = new T31(this);
        this.d = t31;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), t31);
    }
}
