package com.google.android.gms.internal.auth;

import defpackage.C6495s7;
import io.sentry.android.core.b0;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
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
