package com.google.android.gms.internal.auth;

import android.util.Base64;
import defpackage.C6495s7;
import io.sentry.android.core.b0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbB = C6495s7.b("Invalid byte[] value for ", zzc(), ": ");
            sbB.append((String) obj);
            b0.c("PhenotypeFlag", sbB.toString());
            return null;
        }
    }
}
