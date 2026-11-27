package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends zzxv implements zzzh {
    private static final zzy zza;
    private byte zzg = 2;
    private zzyd zzd = zzxv.zzah();
    private zzyd zze = zzxv.zzah();
    private zzyd zzf = zzxv.zzah();

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzxv.zzan(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public static zzy zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzd", zzam.class, "zze", zzam.class, "zzf", zzw.class});
        }
        if (i2 == 3) {
            return new zzy();
        }
        zzn zznVar = null;
        if (i2 == 4) {
            return new zzx(zznVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }
}
