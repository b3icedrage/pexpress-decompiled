package com.google.android.gms.internal.auth;

import defpackage.K1;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class zzdl implements zzdj {

    @CheckForNull
    volatile zzdj zza;
    volatile boolean zzb;

    @CheckForNull
    Object zzc;

    public zzdl(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object objA = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objA == null) {
            objA = K1.a(new StringBuilder("<supplier that returned "), this.zzc, ">");
        }
        return K1.a(sb, objA, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzdj zzdjVar = this.zza;
                        zzdjVar.getClass();
                        Object objZza = zzdjVar.zza();
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
