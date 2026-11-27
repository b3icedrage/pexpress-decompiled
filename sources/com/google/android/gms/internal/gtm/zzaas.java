package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzaas extends zzaat {
    public zzaas(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaau.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaau.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.gtm.zzaau.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.gtm.zzaau.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaau.zzb) {
            zzaau.zzi(obj, j, z);
        } else {
            zzaau.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzd(Object obj, long j, byte b) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j, b);
        } else {
            zzaau.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final boolean zzg(Object obj, long j) {
        return zzaau.zzb ? zzaau.zzt(obj, j) : zzaau.zzu(obj, j);
    }
}
