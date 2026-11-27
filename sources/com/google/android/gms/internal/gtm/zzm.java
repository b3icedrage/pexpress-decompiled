package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzm extends zzxv implements zzzh {
    private static final zzm zza;
    private byte zzf = 2;
    private zzyd zzd = zzxv.zzah();
    private zzyd zze = zzxv.zzah();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzxv.zzan(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzd", zzk.class, "zze", zzg.class});
        }
        if (i2 == 3) {
            return new zzm();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzl(zzcVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
