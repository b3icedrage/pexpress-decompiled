package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class zzcx implements Runnable {
    final /* synthetic */ zzcy zza;

    public zzcx(zzcy zzcyVar) {
        this.zza = zzcyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zza.zzb.zzd().zzi(this);
            return;
        }
        zzcy zzcyVar = this.zza;
        boolean zZzh = zzcyVar.zzh();
        zzcyVar.zzd = 0L;
        if (zZzh) {
            this.zza.zza();
        }
    }
}
