package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztk;
import com.google.android.gms.internal.gtm.zztl;

/* JADX INFO: loaded from: classes.dex */
public abstract class zztk<MessageType extends zztl<MessageType, BuilderType>, BuilderType extends zztk<MessageType, BuilderType>> implements zzzf {
    @Override // 
    public abstract zztk zzv();

    public abstract zztk zzw(zztl zztlVar);

    @Override // com.google.android.gms.internal.gtm.zzzf
    public final /* bridge */ /* synthetic */ zzzf zzx(zzzg zzzgVar) {
        if (zzax().getClass().isInstance(zzzgVar)) {
            return zzw((zztl) zzzgVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    public /* bridge */ /* synthetic */ zzzf zzy(zzuj zzujVar, zzxf zzxfVar) {
        throw null;
    }
}
