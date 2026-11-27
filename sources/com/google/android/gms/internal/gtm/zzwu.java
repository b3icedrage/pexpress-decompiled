package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzwu implements zzxx {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzws
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzwu.zzb(i);
        }
    };
    private final int zzf;

    zzwu(int i) {
        this.zzf = i;
    }

    public static zzwu zzb(int i) {
        if (i == 1) {
            return SPEED;
        }
        if (i == 2) {
            return CODE_SIZE;
        }
        if (i != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzf;
    }
}
