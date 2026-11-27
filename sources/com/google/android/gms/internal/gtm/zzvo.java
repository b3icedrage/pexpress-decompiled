package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzvo implements zzxx {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvm
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvo.zzb(i);
        }
    };
    private final int zzf;

    zzvo(int i) {
        this.zzf = i;
    }

    public static zzvo zzb(int i) {
        if (i == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return ALLOW;
        }
        if (i != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
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
