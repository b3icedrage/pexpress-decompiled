package com.google.android.gms.internal.gtm;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: loaded from: classes.dex */
public enum zzuv implements zzxx {
    EDITION_UNKNOWN(0),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(99997),
    EDITION_99998_TEST_ONLY(99998),
    EDITION_99999_TEST_ONLY(99999);

    private static final zzxy zzj = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzut
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzuv.zzb(i);
        }
    };
    private final int zzl;

    zzuv(int i) {
        this.zzl = i;
    }

    public static zzuv zzb(int i) {
        if (i == 0) {
            return EDITION_UNKNOWN;
        }
        if (i == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i == 2) {
            return EDITION_2_TEST_ONLY;
        }
        switch (i) {
            case 998:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT /* 1000 */:
                return EDITION_2023;
            default:
                switch (i) {
                    case 99997:
                        return EDITION_99997_TEST_ONLY;
                    case 99998:
                        return EDITION_99998_TEST_ONLY;
                    case 99999:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzl);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzl;
    }
}
