package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzxv implements zzzh {
    private static final zzg zza;
    private int zzd;
    private zzam zzf;
    private byte zzh = 2;
    private zzyd zze = zzxv.zzah();
    private String zzg = "";

    static {
        zzg zzgVar = new zzg();
        zza = zzgVar;
        zzxv.zzan(zzg.class, zzgVar);
    }

    private zzg() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", zzi.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzg();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzf(zzcVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
