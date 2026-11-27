package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzabh extends zzxv implements zzzh {
    private static final zzabh zza;
    private int zzd;
    private int zze;
    private String zzf = "*";

    static {
        zzabh zzabhVar = new zzabh();
        zza = zzabhVar;
        zzxv.zzan(zzabh.class, zzabhVar);
    }

    private zzabh() {
    }

    public static zzabh zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzabj.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzabh();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzabg(zzabfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
