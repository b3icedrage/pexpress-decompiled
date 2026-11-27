package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.C8092zj;

/* JADX INFO: loaded from: classes.dex */
public final class zzhq {
    private static final C8092zj zza = new C8092zj();

    public static synchronized Uri zza(String str) {
        C8092zj c8092zj = zza;
        Uri uri = (Uri) c8092zj.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c8092zj.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
