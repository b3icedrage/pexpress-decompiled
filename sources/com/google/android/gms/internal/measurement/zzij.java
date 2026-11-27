package com.google.android.gms.internal.measurement;

import defpackage.K1;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class zzij implements Serializable, zzii {
    final zzii zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzij(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        return K1.a(new StringBuilder("Suppliers.memoize("), this.zzb ? K1.a(new StringBuilder("<supplier that returned "), this.zzc, ">") : this.zza, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
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
