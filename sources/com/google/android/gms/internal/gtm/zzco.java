package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzco implements Callable {
    final /* synthetic */ zzcp zza;

    public zzco(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.zza.zzf();
    }
}
