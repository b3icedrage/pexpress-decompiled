package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1oSDK {

    @NonNull
    final String AFKeystoreWrapper;

    @NonNull
    public final Map<String, String> AFLogger;

    @NonNull
    public final String d;
    final boolean e;
    public boolean force;
    boolean i;
    final boolean registerClient;
    public final byte[] unregisterClient;
    public int v;
    public boolean w;

    public AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z, byte b) {
        this.i = true;
        this.force = false;
        this.w = true;
        this.v = -1;
        this.d = str;
        this.unregisterClient = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = map;
        this.registerClient = z;
        this.e = true;
    }

    public AFd1oSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
