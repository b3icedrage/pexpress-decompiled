package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzbr implements Callable {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.zza.zza.zzab();
        return null;
    }
}
