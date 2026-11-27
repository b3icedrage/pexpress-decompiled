package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends zzxv implements zzzh {
    private static final zzai zza;
    private int zzd;
    private zzam zzf;
    private zzy zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzai zzaiVar = new zzai();
        zza = zzaiVar;
        zzxv.zzan(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public final zzy zza() {
        zzy zzyVar = this.zzg;
        return zzyVar == null ? zzy.zzc() : zzyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzai();
        }
        zzn zznVar = null;
        if (i2 == 4) {
            return new zzah(zznVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }
}
