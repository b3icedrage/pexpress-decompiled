package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zzbl implements Runnable {
    final /* synthetic */ zzbs zza;

    public zzbl(zzbs zzbsVar, boolean z) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzad();
    }
}
