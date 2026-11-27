package com.appsflyer.internal;

import defpackage.C5896pG;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1xSDK {

    @Nullable
    public final String AFKeystoreWrapper;
    public final boolean d;

    @Nullable
    public final String registerClient;

    @NotNull
    public final String unregisterClient;

    public AFi1xSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = str;
        this.AFKeystoreWrapper = str2;
        this.registerClient = str3;
        this.d = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1xSDK)) {
            return false;
        }
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return Intrinsics.a(this.unregisterClient, aFi1xSDK.unregisterClient) && Intrinsics.a(this.AFKeystoreWrapper, aFi1xSDK.AFKeystoreWrapper) && Intrinsics.a(this.registerClient, aFi1xSDK.registerClient) && this.d == aFi1xSDK.d;
    }

    public final int hashCode() {
        int iHashCode = this.unregisterClient.hashCode() * 31;
        String str = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registerClient;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.unregisterClient;
        String str2 = this.AFKeystoreWrapper;
        String str3 = this.registerClient;
        boolean z = this.d;
        StringBuilder sbA = C5896pG.a("NetworkData(networkType=", str, ", carrierName=", str2, ", simOperator=");
        sbA.append(str3);
        sbA.append(", isVpnEnabled=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }
}
