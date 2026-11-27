package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzvr implements zzxx {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);

    private static final zzxy zzd = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvp
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvr.zzb(i);
        }
    };
    private final int zzf;

    zzvr(int i) {
        this.zzf = i;
    }

    public static zzvr zzb(int i) {
        if (i == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return LENGTH_PREFIXED;
        }
        if (i != 2) {
            return null;
        }
        return DELIMITED;
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
