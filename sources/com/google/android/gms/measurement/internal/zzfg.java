package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzfg implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzef zzefVarZzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzefVarZzc = this.zza.zzt.zzay().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzefVarZzc = this.zza.zzt.zzay().zzj();
            } else if (i2 != 4) {
                zzefVarZzc = this.zza.zzt.zzay().zzi();
            } else if (z) {
                zzefVarZzc = this.zza.zzt.zzay().zzm();
            } else {
                zzefVarZzc = !z2 ? this.zza.zzt.zzay().zzl() : this.zza.zzt.zzay().zzk();
            }
        } else if (z) {
            zzefVarZzc = this.zza.zzt.zzay().zzh();
        } else {
            zzefVarZzc = !z2 ? this.zza.zzt.zzay().zze() : this.zza.zzt.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzefVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzefVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzefVarZzc.zza(str);
        } else {
            zzefVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
