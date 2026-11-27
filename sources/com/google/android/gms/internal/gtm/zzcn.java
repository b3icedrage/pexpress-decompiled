package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzcn implements Callable {
    final /* synthetic */ zzcp zza;

    public zzcn(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.zza.zzc();
    }
}
