package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zzbp implements Runnable {
    final /* synthetic */ zzbs zza;

    public zzbp(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzh();
    }
}
