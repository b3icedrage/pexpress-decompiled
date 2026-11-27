package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzacm extends zzxv implements zzzh {
    private static final zzacm zza;
    private int zzd;
    private String zze = "";

    static {
        zzacm zzacmVar = new zzacm();
        zza = zzacmVar;
        zzxv.zzan(zzacm.class, zzacmVar);
    }

    private zzacm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzacm();
        }
        zzaci zzaciVar = null;
        if (i2 == 4) {
            return new zzacl(zzaciVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
