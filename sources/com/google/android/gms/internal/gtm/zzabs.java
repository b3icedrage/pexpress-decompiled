package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public final class zzabs extends zzxv implements zzzh {
    private static final zzyb zza = new zzyb<Integer, zzaby>() { // from class: com.google.android.gms.internal.gtm.zzabs.1
        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzaby zzb(Integer num) {
            throw null;
        }
    };
    private static final zzabs zzd;
    private zzya zze = zzxv.zzag();

    static {
        zzabs zzabsVar = new zzabs();
        zzd = zzabsVar;
        zzxv.zzan(zzabs.class, zzabsVar);
    }

    private zzabs() {
    }

    public static zzabs zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzxv.zzak(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zze", zzabx.zza});
        }
        if (i2 == 3) {
            return new zzabs();
        }
        zzabl zzablVar = null;
        if (i2 == 4) {
            return new zzabt(zzablVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
