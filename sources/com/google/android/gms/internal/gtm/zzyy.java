package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zzyy implements zzzu {
    private static final zzze zza = new zzyw();
    private final zzze zzb;

    public zzyy() {
        zzze zzzeVar;
        zzxo zzxoVarZza = zzxo.zza();
        try {
            zzzeVar = (zzze) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzzeVar = zza;
        }
        zzyx zzyxVar = new zzyx(zzxoVarZza, zzzeVar);
        byte[] bArr = zzye.zzd;
        this.zzb = zzyxVar;
    }

    private static boolean zzb(zzzd zzzdVar) {
        return zzzdVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.gtm.zzzu
    public final zzzt zza(Class cls) {
        zzzv.zzs(cls);
        zzzd zzzdVarZzb = this.zzb.zzb(cls);
        if (zzzdVarZzb.zzb()) {
            return zzxv.class.isAssignableFrom(cls) ? zzzk.zzc(zzzv.zzn(), zzxi.zzb(), zzzdVarZzb.zza()) : zzzk.zzc(zzzv.zzm(), zzxi.zza(), zzzdVarZzb.zza());
        }
        if (zzxv.class.isAssignableFrom(cls)) {
            return zzb(zzzdVarZzb) ? zzzj.zzl(cls, zzzdVarZzb, zzzn.zzb(), zzyu.zze(), zzzv.zzn(), zzxi.zzb(), zzzc.zzb()) : zzzj.zzl(cls, zzzdVarZzb, zzzn.zzb(), zzyu.zze(), zzzv.zzn(), null, zzzc.zzb());
        }
        return zzb(zzzdVarZzb) ? zzzj.zzl(cls, zzzdVarZzb, zzzn.zza(), zzyu.zzd(), zzzv.zzm(), zzxi.zza(), zzzc.zza()) : zzzj.zzl(cls, zzzdVarZzb, zzzn.zza(), zzyu.zzd(), zzzv.zzm(), null, zzzc.zza());
    }
}
