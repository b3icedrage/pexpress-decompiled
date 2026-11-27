package com.google.android.gms.internal.gtm;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class zzta extends zzst {
    final /* synthetic */ zztb zza;

    public zzta(zztb zztbVar) {
        this.zza = zztbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzsl.zza(i, this.zza.zzc, "index");
        zztb zztbVar = this.zza;
        int i2 = i + i;
        Object obj = zztbVar.zzb[i2];
        obj.getClass();
        Object obj2 = zztbVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
