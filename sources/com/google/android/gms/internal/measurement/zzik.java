package com.google.android.gms.internal.measurement;

import defpackage.K1;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class zzik implements zzii {

    @CheckForNull
    volatile zzii zza;
    volatile boolean zzb;

    @CheckForNull
    Object zzc;

    public zzik(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object objA = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objA == null) {
            objA = K1.a(new StringBuilder("<supplier that returned "), this.zzc, ">");
        }
        return K1.a(sb, objA, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzii zziiVar = this.zza;
                        zziiVar.getClass();
                        Object objZza = zziiVar.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        this.zza = null;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
