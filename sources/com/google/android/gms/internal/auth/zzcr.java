package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.C8092zj;

/* JADX INFO: loaded from: classes.dex */
public final class zzcr {
    private static final C8092zj zza = new C8092zj();

    public static synchronized Uri zza(String str) {
        C8092zj c8092zj = zza;
        Uri uri = (Uri) c8092zj.getOrDefault("com.google.android.gms.auth_account", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c8092zj.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
