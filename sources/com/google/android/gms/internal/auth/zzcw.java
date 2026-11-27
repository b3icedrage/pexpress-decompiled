package com.google.android.gms.internal.auth;

import defpackage.C6495s7;
import io.sentry.android.core.b0;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbB = C6495s7.b("Invalid boolean value for ", zzc(), ": ");
        sbB.append((String) obj);
        b0.c("PhenotypeFlag", sbB.toString());
        return null;
    }
}
