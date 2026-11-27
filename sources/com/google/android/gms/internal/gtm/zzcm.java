package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzcm extends zzbu {
    private boolean zza;
    private final zzcg zzb;
    private final zzfg zzc;
    private final zzfe zzd;
    private final zzce zze;
    private long zzf;
    private final zzcy zzg;
    private final zzcy zzh;
    private final zzfq zzi;
    private long zzj;
    private boolean zzk;

    public zzcm(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        Preconditions.checkNotNull(zzbyVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfe(zzbxVar);
        this.zzb = new zzcg(zzbxVar);
        this.zzc = new zzfg(zzbxVar);
        this.zze = new zzce(zzbxVar);
        this.zzi = new zzfq(zzC());
        this.zzg = new zzci(this, zzbxVar);
        this.zzh = new zzcj(this, zzbxVar);
    }

    private final void zzaf() {
        zzda zzdaVarZzy = zzy();
        if (zzdaVarZzy.zze()) {
            zzdaVarZzy.zza();
        }
    }

    private final void zzag() {
        if (this.zzg.zzh()) {
            zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzah() {
        long jZzc;
        zzda zzdaVarZzy = zzy();
        if (zzdaVarZzy.zzc() && !zzdaVarZzy.zze()) {
            com.google.android.gms.analytics.zzr.zzh();
            zzV();
            try {
                jZzc = this.zzb.zzc();
            } catch (SQLiteException e) {
                zzJ("Failed to get min/max hit times from local store", e);
                jZzc = 0;
            }
            if (jZzc != 0) {
                long jAbs = Math.abs(zzC().currentTimeMillis() - jZzc);
                zzw();
                if (jAbs <= ((Long) zzew.zzn.zzb()).longValue()) {
                    zzw();
                    zzO("Dispatch alarm scheduled (ms)", Long.valueOf(zzcv.zzd()));
                    zzdaVarZzy.zzb();
                }
            }
        }
    }

    private final void zzai(zzbz zzbzVar, zzay zzayVar) {
        Preconditions.checkNotNull(zzbzVar);
        Preconditions.checkNotNull(zzayVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzt());
        zzaVar.zzc(zzbzVar.zzc());
        zzaVar.zzd(zzbzVar.zzf());
        com.google.android.gms.analytics.zzh zzhVarZza = zzaVar.zza();
        zzbg zzbgVar = (zzbg) zzhVarZza.zzb(zzbg.class);
        zzbgVar.zzk("data");
        zzbgVar.zzl(true);
        zzhVarZza.zzg(zzayVar);
        zzbb zzbbVar = (zzbb) zzhVarZza.zzb(zzbb.class);
        zzax zzaxVar = (zzax) zzhVarZza.zzb(zzax.class);
        for (Map.Entry entry : zzbzVar.zzd().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                zzaxVar.zzk(str2);
            } else if ("av".equals(str)) {
                zzaxVar.zzl(str2);
            } else if ("aid".equals(str)) {
                zzaxVar.zzi(str2);
            } else if ("aiid".equals(str)) {
                zzaxVar.zzj(str2);
            } else if ("uid".equals(str)) {
                zzbgVar.zzm(str2);
            } else {
                zzbbVar.zze(str, str2);
            }
        }
        zzG("Sending installation campaign to", zzbzVar.zzc(), zzayVar);
        zzhVarZza.zzj(zzA().zza());
        zzhVarZza.zzk();
    }

    private final boolean zzaj(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzcm zzcmVar) {
        try {
            zzcmVar.zzb.zza();
            zzcmVar.zzad();
        } catch (SQLiteException e) {
            zzcmVar.zzR("Failed to delete stale hits", e);
        }
        zzcy zzcyVar = zzcmVar.zzh;
        zzcmVar.zzw();
        zzcyVar.zzg(86400000L);
    }

    public final void zzY(long j) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (j < 0) {
            j = 0;
        }
        this.zzf = j;
        zzad();
    }

    public final void zzZ() {
        zzV();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().zzi(new zzck(this));
    }

    public final long zza() {
        long j = this.zzf;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        zzw();
        long jLongValue = ((Long) zzew.zzi.zzb()).longValue();
        zzfv zzfvVarZzB = zzB();
        zzfvVarZzB.zzV();
        if (!zzfvVarZzB.zzc) {
            return jLongValue;
        }
        zzfv zzfvVarZzB2 = zzB();
        zzfvVarZzB2.zzV();
        return ((long) zzfvVarZzB2.zzd) * 1000;
    }

    public final void zzaa() {
        zzV();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        Context contextZza = zzt().zza();
        if (!zzfk.zzb(contextZza)) {
            zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfp.zzh(contextZza)) {
            zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(contextZza)) {
            zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (!zzaj("android.permission.INTERNET")) {
            zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (zzfp.zzh(zzo())) {
            zzN("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzab()) {
                zzi();
            }
        }
        zzad();
    }

    public final void zzab() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzE("Sync dispatching local hits");
        long j = this.zzj;
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e) {
            zzJ("Sync local dispatch failed", e);
            zzad();
        }
    }

    public final void zzac() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        zzad();
    }

    public final void zzad() {
        long jMin;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzab()) {
                    this.zzd.zzc();
                    zzag();
                    zzaf();
                    return;
                }
                if (!((Boolean) zzew.zzJ.zzb()).booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzag();
                        zzaf();
                        zzah();
                        return;
                    }
                }
                zzah();
                long jZza = zza();
                long jZzb = zzA().zzb();
                if (jZzb != 0) {
                    jMin = jZza - Math.abs(zzC().currentTimeMillis() - jZzb);
                    if (jMin <= 0) {
                        zzw();
                        jMin = Math.min(zzcv.zze(), jZza);
                    }
                } else {
                    zzw();
                    jMin = Math.min(zzcv.zze(), jZza);
                }
                zzO("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(jMin);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, jMin + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzag();
        zzaf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzae() {
        boolean z;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzN("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z = false;
        } else {
            zzw();
            z = true;
        }
        boolean zZze = this.zzc.zze();
        if (z && !zZze) {
            zzN("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int iZzh = zzcv.zzh();
        zzw();
        long jMax = Math.max(iZzh, zzcv.zzg());
        ArrayList arrayList = new ArrayList();
        long jMax2 = 0;
        while (true) {
            try {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List listZzj = this.zzb.zzj(jMax);
                        if (listZzj.isEmpty()) {
                            zzN("Store is empty, nothing to dispatch");
                            zzag();
                            zzaf();
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e) {
                                zzJ("Failed to commit local dispatch transaction", e);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                        zzO("Hits loaded from store. count", Integer.valueOf(listZzj.size()));
                        Iterator it = listZzj.iterator();
                        while (it.hasNext()) {
                            if (((zzez) it.next()).zzb() == jMax2) {
                                zzK("Database contains successfully uploaded hit", Long.valueOf(jMax2), Integer.valueOf(listZzj.size()));
                                zzag();
                                zzaf();
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e2) {
                                    zzJ("Failed to commit local dispatch transaction", e2);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                        if (this.zze.zzg()) {
                            zzw();
                            zzN("Service connected, sending hits to the service");
                            while (!listZzj.isEmpty()) {
                                zzez zzezVar = (zzez) listZzj.get(0);
                                if (!this.zze.zzh(zzezVar)) {
                                    break;
                                }
                                jMax2 = Math.max(jMax2, zzezVar.zzb());
                                listZzj.remove(zzezVar);
                                zzF("Hit sent do device AnalyticsService for delivery", zzezVar);
                                try {
                                    this.zzb.zzn(zzezVar.zzb());
                                    arrayList.add(Long.valueOf(zzezVar.zzb()));
                                } catch (SQLiteException e3) {
                                    zzJ("Failed to remove hit that was send for delivery", e3);
                                    zzag();
                                    zzaf();
                                    try {
                                        this.zzb.zzaa();
                                        this.zzb.zzZ();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        zzJ("Failed to commit local dispatch transaction", e4);
                                        zzag();
                                        zzaf();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzc.zze()) {
                            List listZzc = this.zzc.zzc(listZzj);
                            Iterator it2 = listZzc.iterator();
                            while (it2.hasNext()) {
                                jMax2 = Math.max(jMax2, ((Long) it2.next()).longValue());
                            }
                            try {
                                this.zzb.zzY(listZzc);
                                arrayList.addAll(listZzc);
                            } catch (SQLiteException e5) {
                                zzJ("Failed to remove successfully uploaded hits", e5);
                                zzag();
                                zzaf();
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e6) {
                                    zzJ("Failed to commit local dispatch transaction", e6);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e7) {
                                zzJ("Failed to commit local dispatch transaction", e7);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                        } catch (SQLiteException e8) {
                            zzJ("Failed to commit local dispatch transaction", e8);
                            zzag();
                            zzaf();
                            return false;
                        }
                    } catch (SQLiteException e9) {
                        zzR("Failed to read hits from persisted store", e9);
                        zzag();
                        zzaf();
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                            return false;
                        } catch (SQLiteException e10) {
                            zzJ("Failed to commit local dispatch transaction", e10);
                            zzag();
                            zzaf();
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    this.zzb.zzaa();
                    this.zzb.zzZ();
                    throw th;
                }
                this.zzb.zzaa();
                this.zzb.zzZ();
                throw th;
            } catch (SQLiteException e11) {
                zzJ("Failed to commit local dispatch transaction", e11);
                zzag();
                zzaf();
                return false;
            }
        }
    }

    public final long zzb(zzbz zzbzVar, boolean z) {
        Preconditions.checkNotNull(zzbzVar);
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        try {
            this.zzb.zzm();
            zzcg zzcgVar = this.zzb;
            String strZzb = zzbzVar.zzb();
            Preconditions.checkNotEmpty(strZzb);
            zzcgVar.zzV();
            com.google.android.gms.analytics.zzr.zzh();
            int iDelete = zzcgVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", strZzb});
            if (iDelete > 0) {
                zzcgVar.zzO("Deleted property records", Integer.valueOf(iDelete));
            }
            long jZze = this.zzb.zze(0L, zzbzVar.zzb(), zzbzVar.zzc());
            zzbzVar.zze(1 + jZze);
            zzcg zzcgVar2 = this.zzb;
            Preconditions.checkNotNull(zzbzVar);
            zzcgVar2.zzV();
            com.google.android.gms.analytics.zzr.zzh();
            SQLiteDatabase sQLiteDatabaseZzf = zzcgVar2.zzf();
            Map mapZzd = zzbzVar.zzd();
            Preconditions.checkNotNull(mapZzd);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : mapZzd.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", (Long) 0L);
            contentValues.put("cid", zzbzVar.zzb());
            contentValues.put("tid", zzbzVar.zzc());
            contentValues.put("adid", Integer.valueOf(zzbzVar.zzf() ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(zzbzVar.zza()));
            contentValues.put("params", encodedQuery);
            try {
                if (sQLiteDatabaseZzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                    zzcgVar2.zzI("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                zzcgVar2.zzJ("Error storing a property", e);
            }
            this.zzb.zzaa();
            return jZze;
        } catch (SQLiteException e2) {
            zzJ("Failed to update Analytics property", e2);
            return -1L;
        } finally {
            try {
                this.zzb.zzZ();
            } catch (SQLiteException e3) {
                zzJ("Failed to end transaction", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzdb zzdbVar) {
        zzg(zzdbVar, this.zzj);
    }

    public final void zzg(zzdb zzdbVar, long j) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jZzb = zzA().zzb();
        zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jZzb != 0 ? Math.abs(zzC().currentTimeMillis() - jZzb) : -1L));
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(null);
            }
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e) {
            zzJ("Local dispatch failed", e);
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(e);
            }
        }
    }

    public final void zzh() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzN("Delete all hits from local store");
        try {
            zzcg zzcgVar = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcgVar.zzV();
            zzcgVar.zzf().delete("hits2", null, null);
            zzcg zzcgVar2 = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcgVar2.zzV();
            zzcgVar2.zzf().delete("properties", null, null);
            zzad();
        } catch (SQLiteException e) {
            zzR("Failed to delete hits from store", e);
        }
        zzi();
        if (this.zze.zze()) {
            zzN("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzcv.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(((Long) zzew.zzO.zzb()).longValue())) {
                this.zzi.zzb();
                zzN("Connecting to service");
                if (this.zze.zzf()) {
                    zzN("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01c1 A[Catch: SQLiteException -> 0x00cc, TryCatch #4 {SQLiteException -> 0x00cc, blocks: (B:16:0x0079, B:17:0x0098, B:19:0x009e, B:21:0x00b2, B:23:0x00ba, B:25:0x00c2, B:28:0x00cf, B:31:0x00db, B:33:0x00e4, B:79:0x01f8, B:34:0x00ef, B:36:0x010a, B:38:0x011b, B:62:0x017c, B:39:0x011e, B:50:0x0168, B:64:0x018f, B:65:0x0192, B:66:0x0193, B:68:0x01c1, B:70:0x01d0, B:78:0x01f3, B:69:0x01c9, B:71:0x01d5, B:73:0x01e1, B:76:0x01e9), top: B:90:0x0079, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c9 A[Catch: SQLiteException -> 0x00cc, TryCatch #4 {SQLiteException -> 0x00cc, blocks: (B:16:0x0079, B:17:0x0098, B:19:0x009e, B:21:0x00b2, B:23:0x00ba, B:25:0x00c2, B:28:0x00cf, B:31:0x00db, B:33:0x00e4, B:79:0x01f8, B:34:0x00ef, B:36:0x010a, B:38:0x011b, B:62:0x017c, B:39:0x011e, B:50:0x0168, B:64:0x018f, B:65:0x0192, B:66:0x0193, B:68:0x01c1, B:70:0x01d0, B:78:0x01f3, B:69:0x01c9, B:71:0x01d5, B:73:0x01e1, B:76:0x01e9), top: B:90:0x0079, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1 A[Catch: SQLiteException -> 0x01e7, TryCatch #1 {SQLiteException -> 0x01e7, blocks: (B:71:0x01d5, B:73:0x01e1, B:76:0x01e9), top: B:84:0x01d5, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: SQLiteException -> 0x01e7, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01e7, blocks: (B:71:0x01d5, B:73:0x01e1, B:76:0x01e9), top: B:84:0x01d5, outer: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.database.Cursor] */
    public final void zzj(zzez zzezVar) throws Throwable {
        String strZzk;
        long jInsert;
        List list;
        Pair pairZza;
        zzez zzezVarZze = zzezVar;
        ?? Query = "hit_id";
        Preconditions.checkNotNull(zzezVarZze);
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (this.zzk) {
            zzE("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zzO("Delivering hit", zzezVarZze);
        }
        if (TextUtils.isEmpty(zzezVarZze.zzf()) && (pairZza = zzA().zze().zza()) != null) {
            String str = ((Long) pairZza.second) + ":" + ((String) pairZza.first);
            HashMap map = new HashMap(zzezVarZze.zzg());
            map.put("_m", str);
            zzezVarZze = zzez.zze(this, zzezVarZze, map);
        }
        zzez zzezVar2 = zzezVarZze;
        zzi();
        if (this.zze.zzh(zzezVar2)) {
            zzE("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        zzw();
        try {
            zzcg zzcgVar = this.zzb;
            Preconditions.checkNotNull(zzezVar2);
            com.google.android.gms.analytics.zzr.zzh();
            zzcgVar.zzV();
            Preconditions.checkNotNull(zzezVar2);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : zzezVar2.zzg().entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2)) {
                    builder.appendQueryParameter(str2, (String) entry.getValue());
                }
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            String str3 = encodedQuery;
            if (str3.length() > 8192) {
                zzcgVar.zzz().zzb(zzezVar2, "Hit length exceeds the maximum allowed size");
            } else {
                zzcgVar.zzw();
                int iIntValue = ((Integer) zzew.zzf.zzb()).intValue();
                long jZzb = zzcgVar.zzb();
                ?? r9 = 0;
                if (jZzb > iIntValue - 1) {
                    com.google.android.gms.analytics.zzr.zzh();
                    zzcgVar.zzV();
                    long j = (jZzb - ((long) iIntValue)) + 1;
                    if (j <= 0) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzf = zzcgVar.zzf();
                            ArrayList arrayList = new ArrayList();
                            try {
                                Query = sQLiteDatabaseZzf.query("hits2", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Long.toString(j));
                                try {
                                    if (Query.moveToFirst()) {
                                        do {
                                            arrayList.add(Long.valueOf(Query.getLong(0)));
                                        } while (Query.moveToNext());
                                    }
                                } catch (SQLiteException e) {
                                    e = e;
                                    zzcgVar.zzR("Error selecting hit ids", e);
                                    if (Query != 0) {
                                    }
                                    list = arrayList;
                                    zzcgVar.zzR("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                                    zzcgVar.zzY(list);
                                    SQLiteDatabase sQLiteDatabaseZzf2 = zzcgVar.zzf();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("hit_string", str3);
                                    contentValues.put("hit_time", Long.valueOf(zzezVar2.zzd()));
                                    contentValues.put("hit_app_id", Integer.valueOf(zzezVar2.zza()));
                                    if (zzezVar2.zzh()) {
                                        zzcgVar.zzw();
                                        strZzk = zzcv.zzi();
                                    } else {
                                        zzcgVar.zzw();
                                        strZzk = zzcv.zzk();
                                    }
                                    contentValues.put("hit_url", strZzk);
                                    jInsert = sQLiteDatabaseZzf2.insert("hits2", null, contentValues);
                                    if (jInsert == -1) {
                                        zzcgVar.zzI("Failed to insert a hit (got -1)");
                                    } else {
                                        zzcgVar.zzG("Hit saved to database. db-id, hit", Long.valueOf(jInsert), zzezVar2);
                                    }
                                    zzad();
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                Query = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                throw th;
                            }
                            Query.close();
                            list = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            r9 = Query;
                        }
                    }
                    zzcgVar.zzR("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                    zzcgVar.zzY(list);
                }
                SQLiteDatabase sQLiteDatabaseZzf3 = zzcgVar.zzf();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("hit_string", str3);
                contentValues2.put("hit_time", Long.valueOf(zzezVar2.zzd()));
                contentValues2.put("hit_app_id", Integer.valueOf(zzezVar2.zza()));
                if (zzezVar2.zzh()) {
                    zzcgVar.zzw();
                    strZzk = zzcv.zzi();
                } else {
                    zzcgVar.zzw();
                    strZzk = zzcv.zzk();
                }
                contentValues2.put("hit_url", strZzk);
                try {
                    jInsert = sQLiteDatabaseZzf3.insert("hits2", null, contentValues2);
                    if (jInsert == -1) {
                        zzcgVar.zzI("Failed to insert a hit (got -1)");
                    } else {
                        zzcgVar.zzG("Hit saved to database. db-id, hit", Long.valueOf(jInsert), zzezVar2);
                    }
                } catch (SQLiteException e3) {
                    zzcgVar.zzJ("Error storing a hit", e3);
                }
            }
            zzad();
        } catch (SQLiteException e4) {
            zzJ("Delivery failed to save hit to a database", e4);
            zzz().zzb(zzezVar2, "deliver: failed to insert hit to database");
        }
    }

    public final void zzk(zzbz zzbzVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzF("Sending first hit to property", zzbzVar.zzc());
        zzfq zzfqVarZzf = zzA().zzf();
        zzw();
        if (zzfqVarZzf.zzc(zzcv.zzc())) {
            return;
        }
        String strZzg = zzA().zzg();
        if (TextUtils.isEmpty(strZzg)) {
            return;
        }
        zzay zzayVarZzb = zzfu.zzb(zzz(), strZzg);
        zzF("Found relevant installation campaign", zzayVarZzb);
        zzai(zzbzVar, zzayVarZzb);
    }

    public final void zzl() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zzj = zzC().currentTimeMillis();
    }

    public final void zzm() {
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzw();
        if (!zzcv.zzl()) {
            zzQ("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzN("Service not connected");
            return;
        }
        if (this.zzb.zzab()) {
            return;
        }
        zzN("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzcg zzcgVar = this.zzb;
                zzw();
                List listZzj = zzcgVar.zzj(zzcv.zzh());
                if (listZzj.isEmpty()) {
                    zzad();
                    return;
                }
                while (!listZzj.isEmpty()) {
                    zzez zzezVar = (zzez) listZzj.get(0);
                    if (!this.zze.zzh(zzezVar)) {
                        zzad();
                        return;
                    }
                    listZzj.remove(zzezVar);
                    try {
                        this.zzb.zzn(zzezVar.zzb());
                    } catch (SQLiteException e) {
                        zzJ("Failed to remove hit that was send for delivery", e);
                        zzag();
                        zzaf();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                zzJ("Failed to read hits from store", e2);
                zzag();
                zzaf();
                return;
            }
        }
    }

    public final void zzn(String str) {
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        zzay zzayVarZzb = zzfu.zzb(zzz(), str);
        if (zzayVarZzb == null) {
            zzR("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String strZzg = zzA().zzg();
        if (str.equals(strZzg)) {
            zzQ("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(strZzg)) {
            zzK("Ignoring multiple install campaigns. original, new", strZzg, str);
            return;
        }
        zzA().zzh(str);
        zzfq zzfqVarZzf = zzA().zzf();
        zzw();
        if (zzfqVarZzf.zzc(zzcv.zzc())) {
            zzR("Campaign received too late, ignoring", zzayVarZzb);
            return;
        }
        zzF("Received installation campaign", zzayVarZzb);
        zzcg zzcgVar = this.zzb;
        zzcgVar.zzV();
        com.google.android.gms.analytics.zzr.zzh();
        SQLiteDatabase sQLiteDatabaseZzf = zzcgVar.zzf();
        Cursor cursorQuery = null;
        try {
            try {
                zzcgVar.zzw();
                int iIntValue = ((Integer) zzew.zzh.zzb()).intValue();
                cursorQuery = sQLiteDatabaseZzf.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(iIntValue));
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        long j = cursorQuery.getInt(3);
                        Map mapZzl = zzcgVar.zzl(cursorQuery.getString(4));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            zzcgVar.zzS("Read property with empty client id or tracker id", string, string2);
                        } else {
                            arrayList.add(new zzbz(0L, string, string2, z, j, mapZzl));
                        }
                    } while (cursorQuery.moveToNext());
                }
                if (arrayList.size() >= iIntValue) {
                    zzcgVar.zzQ("Sending hits to too many properties. Campaign report might be incorrect");
                }
                cursorQuery.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzai((zzbz) it.next(), zzayVarZzb);
                }
            } catch (SQLiteException e) {
                zzcgVar.zzJ("Error loading hits from the database", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
