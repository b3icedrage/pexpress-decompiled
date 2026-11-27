package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.C0663Bh;
import defpackage.C0741Ch;
import defpackage.C2629a1;
import defpackage.C8045zW0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class zzjm extends zzf {
    private final zzjl zza;
    private zzdx zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkd zze;
    private final List zzf;
    private final zzap zzg;

    public zzjm(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzf = new ArrayList();
        this.zze = new zzkd(zzfrVar.zzav());
        this.zza = new zzjl(this);
        this.zzd = new zziw(this, zzfrVar);
        this.zzg = new zziy(this, zzfrVar);
    }

    private final zzq zzO(boolean z) {
        Pair pairZza;
        this.zzt.zzaw();
        zzdy zzdyVarZzh = this.zzt.zzh();
        String strB = null;
        if (z) {
            zzeh zzehVarZzay = this.zzt.zzay();
            if (zzehVarZzay.zzt.zzm().zzb != null && (pairZza = zzehVarZzay.zzt.zzm().zzb.zza()) != null && pairZza != zzew.zza) {
                strB = C2629a1.b(String.valueOf(pairZza.second), ":", (String) pairZza.first);
            }
        }
        return zzdyVarZzh.zzj(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzt.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.zzt.zzay().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzt.zzf();
        zzapVar.zzd(((Long) zzdu.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            C0663Bh.c(this.zzt, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjm zzjmVar, ComponentName componentName) {
        zzjmVar.zzg();
        if (zzjmVar.zzb != null) {
            zzjmVar.zzb = null;
            zzjmVar.zzt.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjmVar.zzg();
            zzjmVar.zzr();
        }
    }

    public final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjb(this, true, zzO(true), this.zzt.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(12451000) == 0) {
            zzR(new zzix(this, zzawVar, str, zzcfVar));
        } else {
            C0741Ch.c(this.zzt, "Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzS(zzcfVar, new byte[0]);
        }
    }

    public final void zzC() {
        zzg();
        zza();
        zzq zzqVarZzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zziq(this, zzqVarZzO));
    }

    @VisibleForTesting
    public final void zzD(zzdx zzdxVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int size;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i = 100;
        int i2 = 0;
        while (i2 < 1001 && i == 100) {
            ArrayList arrayList = new ArrayList();
            List listZzi = this.zzt.zzi().zzi(100);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i3);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzdxVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.zzt.zzay().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        zzdxVar.zzt((zzkw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.zzt.zzay().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzdxVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.zzt.zzay().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    C0663Bh.c(this.zzt, "Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i = size;
        }
    }

    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzaw();
        zzR(new zzjc(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzja(this, zzO(false)));
        }
    }

    public final void zzG(zzie zzieVar) {
        zzg();
        zza();
        zzR(new zziu(this, zzieVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zziv(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zziz(this, zzO(true)));
    }

    @VisibleForTesting
    public final void zzJ(zzdx zzdxVar) {
        zzg();
        Preconditions.checkNotNull(zzdxVar);
        this.zzb = zzdxVar;
        zzQ();
        zzP();
    }

    public final void zzK(zzkw zzkwVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzio(this, zzO(true), this.zzt.zzi().zzp(zzkwVar), zzkwVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzt.zzv().zzm() >= ((Integer) zzdu.zzaf.zza(null)).intValue();
    }

    public final boolean zzN() {
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            zzew zzewVarZzm = this.zzt.zzm();
            zzewVarZzm.zzg();
            boolean z = false;
            Boolean boolValueOf = !zzewVarZzm.zza().contains("use_service") ? null : Boolean.valueOf(zzewVarZzm.zza().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.zzt.zzaw();
                if (this.zzt.zzh().zzh() == 1) {
                    z = true;
                } else {
                    C8045zW0.b(this.zzt, "Checking service availability");
                    int iZzo = this.zzt.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        C8045zW0.b(this.zzt, "Service available");
                    } else if (iZzo == 1) {
                        C8045zW0.b(this.zzt, "Service missing");
                    } else if (iZzo != 2) {
                        if (iZzo == 3) {
                            C0741Ch.c(this.zzt, "Service disabled");
                        } else if (iZzo == 9) {
                            C0741Ch.c(this.zzt, "Service invalid");
                        } else if (iZzo != 18) {
                            this.zzt.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                        } else {
                            C0741Ch.c(this.zzt, "Service updating");
                        }
                        z2 = false;
                    } else {
                        this.zzt.zzay().zzc().zza("Service container out of date");
                        if (this.zzt.zzv().zzm() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && this.zzt.zzf().zzx()) {
                    C0663Bh.c(this.zzt, "No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    zzew zzewVarZzm2 = this.zzt.zzm();
                    zzewVarZzm2.zzg();
                    SharedPreferences.Editor editorEdit = zzewVarZzm2.zza().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.zzc = Boolean.valueOf(z2);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzq zzqVarZzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzit(this, zzqVarZzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzt.zzf().zzx()) {
            return;
        }
        this.zzt.zzaw();
        List<ResolveInfo> listQueryIntentServices = this.zzt.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            C0663Bh.c(this.zzt, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzaw();
        intent.setComponent(new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzis(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzir(this, atomicReference, zzO(false)));
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzje(this, str, str2, zzO(false), zzcfVar));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        zzR(new zzip(this, atomicReference, zzO(false), z));
    }

    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z) {
        zzg();
        zza();
        zzR(new zzin(this, str, str2, zzO(false), z, zzcfVar));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        zzR(new zzjf(this, atomicReference, null, str2, str3, zzO(false), z));
    }
}
