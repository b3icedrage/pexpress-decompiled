package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzys extends zzyu {
    public /* synthetic */ zzys(zzyr zzyrVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final List zza(Object obj, long j) {
        zzyd zzydVar = (zzyd) zzaau.zzf(obj, j);
        if (zzydVar.zzc()) {
            return zzydVar;
        }
        int size = zzydVar.size();
        zzyd zzydVarZzd = zzydVar.zzd(size == 0 ? 10 : size + size);
        zzaau.zzs(obj, j, zzydVarZzd);
        return zzydVarZzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzb(Object obj, long j) {
        ((zzyd) zzaau.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzc(Object obj, Object obj2, long j) {
        zzyd zzydVarZzd = (zzyd) zzaau.zzf(obj, j);
        zzyd zzydVar = (zzyd) zzaau.zzf(obj2, j);
        int size = zzydVarZzd.size();
        int size2 = zzydVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzydVarZzd.zzc()) {
                zzydVarZzd = zzydVarZzd.zzd(size2 + size);
            }
            zzydVarZzd.addAll(zzydVar);
        }
        if (size > 0) {
            zzydVar = zzydVarZzd;
        }
        zzaau.zzs(obj, j, zzydVar);
    }

    private zzys() {
        super(null);
    }
}
