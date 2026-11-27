package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
abstract class zzaak {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzud zzudVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzzs zzzsVar) throws zzyg {
        int iZzd = zzzsVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzzsVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzzsVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzzsVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzyg.zza();
            }
            zzh(obj, i, zzzsVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzzsVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzzsVar)) {
        }
        if ((4 | i3) != zzzsVar.zzd()) {
            throw zzyg.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }

    public abstract boolean zzq(zzzs zzzsVar);

    public abstract void zzr(Object obj, zzur zzurVar);

    public abstract void zzs(Object obj, zzur zzurVar);
}
