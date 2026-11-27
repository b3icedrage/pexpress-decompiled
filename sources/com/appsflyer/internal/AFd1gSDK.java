package com.appsflyer.internal;

import defpackage.C4694ja0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1gSDK {

    @NotNull
    final String AFLogger;

    @NotNull
    final String registerClient;

    public AFd1gSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.registerClient = str;
        this.AFLogger = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1gSDK)) {
            return false;
        }
        AFd1gSDK aFd1gSDK = (AFd1gSDK) obj;
        return Intrinsics.a(this.registerClient, aFd1gSDK.registerClient) && Intrinsics.a(this.AFLogger, aFd1gSDK.AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode() + (this.registerClient.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return C4694ja0.a("HostConfig(prefix=", this.registerClient, ", host=", this.AFLogger, ")");
    }
}
