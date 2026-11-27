package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C5807oq;

/* JADX INFO: loaded from: classes.dex */
final class zzee implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeh zzf;

    public zzee(zzeh zzehVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzehVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzew zzewVarZzm = this.zzf.zzt.zzm();
        if (!zzewVarZzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeh zzehVar = this.zzf;
        if (zzehVar.zza == 0) {
            if (zzehVar.zzt.zzf().zzy()) {
                zzeh zzehVar2 = this.zzf;
                zzehVar2.zzt.zzaw();
                zzehVar2.zza = 'C';
            } else {
                zzeh zzehVar3 = this.zzf;
                zzehVar3.zzt.zzaw();
                zzehVar3.zza = 'c';
            }
        }
        zzeh zzehVar4 = this.zzf;
        if (zzehVar4.zzb < 0) {
            zzehVar4.zzt.zzf().zzh();
            zzehVar4.zzb = 74029L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        zzeh zzehVar5 = this.zzf;
        char c = zzehVar5.zza;
        long j = zzehVar5.zzb;
        String strZzo = zzeh.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        String strB = C5807oq.b(sb, ":", strZzo);
        if (strB.length() > 1024) {
            strB = this.zzb.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
        }
        zzeu zzeuVar = zzewVarZzm.zzb;
        if (zzeuVar != null) {
            zzeuVar.zzb(strB, 1L);
        }
    }
}
