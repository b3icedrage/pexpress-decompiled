package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzvu implements zzxx {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvs
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvu.zzb(i);
        }
    };
    private final int zzf;

    zzvu(int i) {
        this.zzf = i;
    }

    public static zzvu zzb(int i) {
        if (i == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return PACKED;
        }
        if (i != 2) {
            return null;
        }
        return EXPANDED;
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
