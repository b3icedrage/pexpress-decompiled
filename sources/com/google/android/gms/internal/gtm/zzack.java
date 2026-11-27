package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzack extends zzxr implements zzzh {
    private static final zzack zzd;
    private int zze;
    private zzacm zzf;
    private byte zzg = 2;

    static {
        zzack zzackVar = new zzack();
        zzd = zzackVar;
        zzxv.zzan(zzack.class, zzackVar);
    }

    private zzack() {
    }

    public static zzack zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzxv.zzak(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzack();
        }
        zzaci zzaciVar = null;
        if (i2 == 4) {
            return new zzacj(zzaciVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
