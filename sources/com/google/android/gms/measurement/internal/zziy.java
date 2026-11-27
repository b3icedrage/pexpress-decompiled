package com.google.android.gms.measurement.internal;

import defpackage.C0741Ch;

/* JADX INFO: loaded from: classes.dex */
final class zziy extends zzap {
    final /* synthetic */ zzjm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzjm zzjmVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjmVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        C0741Ch.c(this.zza.zzt, "Tasks have been queued for a long time");
    }
}
