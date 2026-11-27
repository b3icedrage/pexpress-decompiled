package com.google.android.gms.internal.gtm;

import defpackage.C1039Gc0;

/* JADX INFO: loaded from: classes.dex */
final class zzso {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C1039Gc0.d("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
