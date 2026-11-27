package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends zzxv implements zzzh {
    private static final zzi zza;
    private int zzd;
    private zzam zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzi zziVar = new zzi();
        zza = zziVar;
        zzxv.zzan(zzi.class, zziVar);
    }

    private zzi() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzi();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzh(zzcVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
