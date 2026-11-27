package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
public enum zzvl implements zzxx {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);

    private static final zzxy zze = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzvj
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzvl.zzb(i);
        }
    };
    private final int zzg;

    zzvl(int i) {
        this.zzg = i;
    }

    public static zzvl zzb(int i) {
        if (i == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i == 1) {
            return EXPLICIT;
        }
        if (i == 2) {
            return IMPLICIT;
        }
        if (i != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzg;
    }
}
