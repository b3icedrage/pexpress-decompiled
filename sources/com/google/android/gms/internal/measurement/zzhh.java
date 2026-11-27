package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.C2703aM1;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class zzhh {
    private final C2703aM1 zza;

    public zzhh(C2703aM1 c2703aM1) {
        this.zza = c2703aM1;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C2703aM1 c2703aM1 = (C2703aM1) this.zza.getOrDefault(uri.toString(), null);
        if (c2703aM1 == null) {
            return null;
        }
        return (String) c2703aM1.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
