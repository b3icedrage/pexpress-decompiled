package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zzbo implements Runnable {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzbs zzb;

    public zzbo(zzbs zzbsVar, zzez zzezVar) {
        this.zzb = zzbsVar;
        this.zza = zzezVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzb.zza.zzj(this.zza);
    }
}
