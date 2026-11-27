package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzvx implements zzxx {
    UTF8_VALIDATION_UNKNOWN(0),
    UNVERIFIED(1),
    VERIFY(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvv
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvx.zzb(i);
        }
    };
    private final int zzf;

    zzvx(int i) {
        this.zzf = i;
    }

    public static zzvx zzb(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 1) {
            return UNVERIFIED;
        }
        if (i != 2) {
            return null;
        }
        return VERIFY;
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
