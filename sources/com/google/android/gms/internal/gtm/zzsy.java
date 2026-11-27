package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzsy extends zzti {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzsy(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
