package com.appsflyer.internal;

import defpackage.C5491nL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK {

    @NotNull
    public final String AFKeystoreWrapper;
    public final boolean AFLogger;
    public final long unregisterClient;

    public AFg1sSDK(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = str;
        this.unregisterClient = j;
        this.AFLogger = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1sSDK)) {
            return false;
        }
        AFg1sSDK aFg1sSDK = (AFg1sSDK) obj;
        return Intrinsics.a(this.AFKeystoreWrapper, aFg1sSDK.AFKeystoreWrapper) && this.unregisterClient == aFg1sSDK.unregisterClient && this.AFLogger == aFg1sSDK.AFLogger;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.AFLogger) + C5491nL.a(this.AFKeystoreWrapper.hashCode() * 31, 31, this.unregisterClient);
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.AFKeystoreWrapper + ", receivedTime=" + this.unregisterClient + ", isQueued=" + this.AFLogger + ")";
    }
}
