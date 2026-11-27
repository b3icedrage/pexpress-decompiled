package com.google.android.gms.internal.gtm;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class zzss extends zzst {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzst zzc;

    public zzss(zzst zzstVar, int i, int i2) {
        this.zzc = zzstVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsl.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.gtm.zzst, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzst subList(int i, int i2) {
        zzsl.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
