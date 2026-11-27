package com.appsflyer.internal;

import defpackage.C5491nL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFf1xSDK {

    @Nullable
    final AFh1dSDK AFKeystoreWrapper;

    @NotNull
    final String AFLogger;

    @Nullable
    final AFd1fSDK<?> d;

    @Nullable
    final String e;
    final long registerClient;

    @Nullable
    final AFh1aSDK unregisterClient;

    @Nullable
    final Throwable v;

    public AFf1xSDK(@NotNull String str, long j, @Nullable AFd1fSDK<?> aFd1fSDK, @Nullable AFh1aSDK aFh1aSDK, @Nullable AFh1dSDK aFh1dSDK, @Nullable String str2, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger = str;
        this.registerClient = j;
        this.d = aFd1fSDK;
        this.unregisterClient = aFh1aSDK;
        this.AFKeystoreWrapper = aFh1dSDK;
        this.e = str2;
        this.v = th;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1xSDK)) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj;
        return Intrinsics.a(this.AFLogger, aFf1xSDK.AFLogger) && this.registerClient == aFf1xSDK.registerClient && Intrinsics.a(this.d, aFf1xSDK.d) && Intrinsics.a(this.unregisterClient, aFf1xSDK.unregisterClient) && this.AFKeystoreWrapper == aFf1xSDK.AFKeystoreWrapper && Intrinsics.a(this.e, aFf1xSDK.e) && Intrinsics.a(this.v, aFf1xSDK.v);
    }

    public final int hashCode() {
        int iA = C5491nL.a(this.AFLogger.hashCode() * 31, 31, this.registerClient);
        AFd1fSDK<?> aFd1fSDK = this.d;
        int iHashCode = (iA + (aFd1fSDK == null ? 0 : aFd1fSDK.hashCode())) * 31;
        AFh1aSDK aFh1aSDK = this.unregisterClient;
        int iHashCode2 = (iHashCode + (aFh1aSDK == null ? 0 : aFh1aSDK.hashCode())) * 31;
        AFh1dSDK aFh1dSDK = this.AFKeystoreWrapper;
        int iHashCode3 = (iHashCode2 + (aFh1dSDK == null ? 0 : aFh1dSDK.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.v;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SaveMetadataParams(cdnToken=" + this.AFLogger + ", updateStartTime=" + this.registerClient + ", response=" + this.d + ", config=" + this.unregisterClient + ", signatureStatus=" + this.AFKeystoreWrapper + ", cdnCacheStatus=" + this.e + ", error=" + this.v + ")";
    }
}
