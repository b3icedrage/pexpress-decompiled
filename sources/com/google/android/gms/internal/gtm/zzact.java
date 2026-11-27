package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzact extends zzxv implements zzzh {
    private static final zzact zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzact zzactVar = new zzact();
        zza = zzactVar;
        zzxv.zzan(zzact.class, zzactVar);
    }

    private zzact() {
    }

    public static zzact zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzact();
        }
        zzacr zzacrVar = null;
        if (i2 == 4) {
            return new zzacs(zzacrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
