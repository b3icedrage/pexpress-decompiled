package com.google.android.gms.internal.measurement;

import defpackage.K1;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class zzih extends zzig {
    private final Object zza;

    public zzih(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzih) {
            return this.zza.equals(((zzih) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return K1.a(new StringBuilder("Optional.of("), this.zza, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final boolean zzb() {
        return true;
    }
}
