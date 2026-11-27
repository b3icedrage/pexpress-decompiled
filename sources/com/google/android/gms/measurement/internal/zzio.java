package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.C0663Bh;

/* JADX INFO: loaded from: classes.dex */
final class zzio implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkw zzc;
    final /* synthetic */ zzjm zzd;

    public zzio(zzjm zzjmVar, zzq zzqVar, boolean z, zzkw zzkwVar) {
        this.zzd = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z;
        this.zzc = zzkwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zzd;
        zzdx zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            C0663Bh.c(zzjmVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
