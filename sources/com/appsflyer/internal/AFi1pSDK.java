package com.appsflyer.internal;

import defpackage.C5491nL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1pSDK {
    public final long AFKeystoreWrapper;

    @Nullable
    public final String d;
    public final long registerClient;

    @Nullable
    public final String unregisterClient;

    public AFi1pSDK(long j, long j2, @Nullable String str, @Nullable String str2) {
        this.registerClient = j;
        this.AFKeystoreWrapper = j2;
        this.unregisterClient = str;
        this.d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1pSDK)) {
            return false;
        }
        AFi1pSDK aFi1pSDK = (AFi1pSDK) obj;
        return this.registerClient == aFi1pSDK.registerClient && this.AFKeystoreWrapper == aFi1pSDK.AFKeystoreWrapper && Intrinsics.a(this.unregisterClient, aFi1pSDK.unregisterClient) && Intrinsics.a(this.d, aFi1pSDK.d);
    }

    public final int hashCode() {
        int iA = C5491nL.a(Long.hashCode(this.registerClient) * 31, 31, this.AFKeystoreWrapper);
        String str = this.unregisterClient;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.registerClient + ", ttrMillis=" + this.AFKeystoreWrapper + ", piaToken=" + this.unregisterClient + ", errorCode=" + this.d + ")";
    }
}
