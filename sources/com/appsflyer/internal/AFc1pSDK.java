package com.appsflyer.internal;

import defpackage.C5491nL;
import defpackage.SK;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK {
    final int AFKeystoreWrapper;

    @NotNull
    final String d;

    @NotNull
    final List<AFe1zSDK> unregisterClient;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK(@NotNull String str, @NotNull List<? extends AFe1zSDK> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.d = str;
        this.unregisterClient = list;
        this.AFKeystoreWrapper = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return Intrinsics.a(this.d, aFc1pSDK.d) && Intrinsics.a(this.unregisterClient, aFc1pSDK.unregisterClient) && this.AFKeystoreWrapper == aFc1pSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFKeystoreWrapper) + C5491nL.b(this.d.hashCode() * 31, 31, this.unregisterClient);
    }

    @NotNull
    public final String toString() {
        String str = this.d;
        List<AFe1zSDK> list = this.unregisterClient;
        int i = this.AFKeystoreWrapper;
        StringBuilder sb = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb.append(str);
        sb.append(", eventTypes=");
        sb.append(list);
        sb.append(", maxCapacity=");
        return SK.b(sb, i, ")");
    }
}
