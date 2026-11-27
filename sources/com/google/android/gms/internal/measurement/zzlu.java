package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzlu {
    private static final zzlu zza = new zzlu();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzly zzb = new zzle();

    private zzlu() {
    }

    public static zzlu zza() {
        return zza;
    }

    public final zzlx zzb(Class cls) {
        zzkn.zzf(cls, "messageType");
        zzlx zzlxVar = (zzlx) this.zzc.get(cls);
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzlxVarZza = this.zzb.zza(cls);
        zzkn.zzf(cls, "messageType");
        zzkn.zzf(zzlxVarZza, "schema");
        zzlx zzlxVar2 = (zzlx) this.zzc.putIfAbsent(cls, zzlxVarZza);
        return zzlxVar2 == null ? zzlxVarZza : zzlxVar2;
    }
}
