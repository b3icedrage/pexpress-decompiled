package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzzp {
    private static final zzzp zza = new zzzp();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzzu zzb = new zzyy();

    private zzzp() {
    }

    public static zzzp zza() {
        return zza;
    }

    public final zzzt zzb(Class cls) {
        zzye.zzc(cls, "messageType");
        zzzt zzztVar = (zzzt) this.zzc.get(cls);
        if (zzztVar != null) {
            return zzztVar;
        }
        zzzt zzztVarZza = this.zzb.zza(cls);
        zzye.zzc(cls, "messageType");
        zzzt zzztVar2 = (zzzt) this.zzc.putIfAbsent(cls, zzztVarZza);
        return zzztVar2 == null ? zzztVarZza : zzztVar2;
    }
}
