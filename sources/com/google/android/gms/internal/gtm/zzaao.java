package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzaao implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzaap zzb;

    public zzaao(zzaap zzaapVar) {
        this.zzb = zzaapVar;
        this.zza = zzaapVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
