package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zzzb {
    public static final boolean zza(Object obj) {
        return !((zzza) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzza zzzaVarZzb = (zzza) obj;
        zzza zzzaVar = (zzza) obj2;
        if (!zzzaVar.isEmpty()) {
            if (!zzzaVarZzb.zze()) {
                zzzaVarZzb = zzzaVarZzb.zzb();
            }
            zzzaVarZzb.zzd(zzzaVar);
        }
        return zzzaVarZzb;
    }
}
