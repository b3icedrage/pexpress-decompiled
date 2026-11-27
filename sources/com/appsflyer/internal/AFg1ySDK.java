package com.appsflyer.internal;

import defpackage.C5807oq;
import defpackage.EF0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {

    @NotNull
    final String AFKeystoreWrapper;
    final int AFLogger;
    final int d;
    final int registerClient;
    final int unregisterClient;

    public AFg1ySDK(int i, int i2, int i3, int i4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = i;
        this.d = i2;
        this.registerClient = i3;
        this.AFLogger = i4;
        this.AFKeystoreWrapper = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.unregisterClient == aFg1ySDK.unregisterClient && this.d == aFg1ySDK.d && this.registerClient == aFg1ySDK.registerClient && this.AFLogger == aFg1ySDK.AFLogger && Intrinsics.a(this.AFKeystoreWrapper, aFg1ySDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return this.AFKeystoreWrapper.hashCode() + EF0.a(this.AFLogger, EF0.a(this.registerClient, EF0.a(this.d, Integer.hashCode(this.unregisterClient) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i = this.unregisterClient;
        int i2 = this.d;
        int i3 = this.registerClient;
        int i4 = this.AFLogger;
        String str = this.AFKeystoreWrapper;
        StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
        sb.append(i);
        sb.append(", gdprApplies=");
        sb.append(i2);
        sb.append(", cmpSdkId=");
        sb.append(i3);
        sb.append(", cmpSdkVersion=");
        sb.append(i4);
        sb.append(", tcString=");
        return C5807oq.b(sb, str, ")");
    }
}
