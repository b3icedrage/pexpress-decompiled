package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzxf {
    static final zzxf zza = new zzxf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzxf zzd;
    private final Map zze;

    public zzxf() {
        this.zze = new HashMap();
    }

    public static zzxf zza() {
        zzxf zzxfVar = zzd;
        if (zzxfVar != null) {
            return zzxfVar;
        }
        synchronized (zzxf.class) {
            try {
                zzxf zzxfVar2 = zzd;
                if (zzxfVar2 != null) {
                    return zzxfVar2;
                }
                zzxf zzxfVarZzb = zzxn.zzb(zzxf.class);
                zzd = zzxfVarZzb;
                return zzxfVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzxt zzb(zzzg zzzgVar, int i) {
        return (zzxt) this.zze.get(new zzxe(zzzgVar, i));
    }

    public zzxf(boolean z) {
        this.zze = Collections.EMPTY_MAP;
    }
}
