package com.google.android.gms.internal.measurement;

import defpackage.C6495s7;
import io.sentry.android.core.b0;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbB = C6495s7.b("Invalid long value for ", zzc(), ": ");
            sbB.append((String) obj);
            b0.c("PhenotypeFlag", sbB.toString());
            return null;
        }
    }
}
