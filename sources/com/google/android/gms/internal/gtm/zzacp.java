package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzacp extends zzxv implements zzzh {
    private static final zzacp zza;
    private int zzd;
    private boolean zze;

    static {
        zzacp zzacpVar = new zzacp();
        zza = zzacpVar;
        zzxv.zzan(zzacp.class, zzacpVar);
    }

    private zzacp() {
    }

    public static zzacp zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzacp();
        }
        zzacn zzacnVar = null;
        if (i2 == 4) {
            return new zzaco(zzacnVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
