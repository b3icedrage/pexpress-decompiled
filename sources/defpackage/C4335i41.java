package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4335i41 {

    @NotNull
    public static final String a;

    static {
        String strD = AS0.d("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"NetworkStateTracker\")");
        a = strD;
    }

    @NotNull
    public static final C3705f41 a(@NotNull ConnectivityManager connectivityManager) {
        boolean zB;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = C4331i31.a(connectivityManager, C4589j31.a(connectivityManager));
            zB = networkCapabilitiesA != null ? C4331i31.b(networkCapabilitiesA, 16) : false;
        } catch (SecurityException e) {
            AS0.c().b(a, "Unable to validate active network", e);
        }
        return new C3705f41(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
