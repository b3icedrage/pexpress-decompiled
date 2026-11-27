package com.google.android.gms.internal.measurement;

import defpackage.EK;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb >= this.zza.zzc()) {
            throw new NoSuchElementException(EK.e(this.zzb, "Out of bounds index: "));
        }
        zzae zzaeVar = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return zzaeVar.zze(i);
    }
}
