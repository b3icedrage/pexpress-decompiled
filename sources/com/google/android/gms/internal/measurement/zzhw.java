package com.google.android.gms.internal.measurement;

import defpackage.C6495s7;
import io.sentry.android.core.b0;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbB = C6495s7.b("Invalid double value for ", zzc(), ": ");
            sbB.append((String) obj);
            b0.c("PhenotypeFlag", sbB.toString());
            return null;
        }
    }
}
