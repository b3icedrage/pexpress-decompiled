package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C0663Bh;
import defpackage.C0741Ch;
import defpackage.C8045zW0;
import defpackage.C8092zj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzhx extends zzf {

    @VisibleForTesting
    protected zzhw zza;
    final zzs zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzgr zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzai zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzla zzn;

    public zzhx(zzfr zzfrVar) {
        super(zzfrVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhl(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzfrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzew zzewVarZzm = this.zzt.zzm();
            zzfr zzfrVar = zzewVarZzm.zzt;
            zzewVarZzm.zzg();
            SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzhx zzhxVar;
        zzg();
        String strZza = this.zzt.zzm().zzh.zza();
        if (strZza == null) {
            zzhxVar = this;
        } else if ("unset".equals(strZza)) {
            zzhxVar = this;
            zzhxVar.zzY(Payload.TYPE_APP, "_npa", null, this.zzt.zzav().currentTimeMillis());
        } else {
            zzhxVar = this;
            zzhxVar.zzY(Payload.TYPE_APP, "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzhxVar.zzt.zzav().currentTimeMillis());
        }
        if (!zzhxVar.zzt.zzJ() || !zzhxVar.zzc) {
            zzhxVar.zzt.zzay().zzc().zza("Updating Scion state (FE)");
            zzhxVar.zzt.zzt().zzI();
            return;
        }
        zzhxVar.zzt.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzof.zzc();
        if (zzhxVar.zzt.zzf().zzs(null, zzdu.zzad)) {
            zzhxVar.zzt.zzu().zza.zza();
        }
        zzhxVar.zzt.zzaz().zzp(new zzgz(this));
    }

    public static /* bridge */ /* synthetic */ void zzv(zzhx zzhxVar, zzai zzaiVar, zzai zzaiVar2) {
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzah zzahVar = zzahVarArr[i];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z = true;
                break;
            }
        }
        boolean zZzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || zZzl) {
            zzhxVar.zzt.zzh().zzo();
        }
    }

    public static /* synthetic */ void zzw(zzhx zzhxVar, zzai zzaiVar, int i, long j, boolean z, boolean z2) {
        zzhxVar.zzg();
        zzhxVar.zza();
        if (j <= zzhxVar.zzl && zzai.zzj(zzhxVar.zzm, i)) {
            zzhxVar.zzt.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzew zzewVarZzm = zzhxVar.zzt.zzm();
        zzfr zzfrVar = zzewVarZzm.zzt;
        zzewVarZzm.zzg();
        if (!zzewVarZzm.zzl(i)) {
            zzhxVar.zzt.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
        editorEdit.putString("consent_settings", zzaiVar.zzh());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        zzhxVar.zzl = j;
        zzhxVar.zzm = i;
        zzhxVar.zzt.zzt().zzF(z);
        if (z2) {
            zzhxVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaz().zzp(new zzhg(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle bundleZza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzaf(obj)) {
                    this.zzt.zzv().zzN(this.zzn, null, 27, null, null, 0);
                }
                this.zzt.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlb.zzah(str)) {
                this.zzt.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else {
                zzlb zzlbVarZzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzlbVarZzv.zzaa("param", str, 100, obj)) {
                    this.zzt.zzv().zzO(bundleZza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int iZzc = this.zzt.zzf().zzc();
        if (bundleZza.size() > iZzc) {
            int i = 0;
            for (String str2 : new TreeSet(bundleZza.keySet())) {
                i++;
                if (i > iZzc) {
                    bundleZza.remove(str2);
                }
            }
            this.zzt.zzv().zzN(this.zzn, null, 26, null, null, 0);
            this.zzt.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(bundleZza);
        this.zzt.zzt().zzH(bundleZza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = Payload.TYPE_APP;
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.zzt.zzs().zzx(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.zzd != null && !zzlb.zzah(str2)) {
            z3 = false;
        }
        zzM(str3, str2, j, bundle2, z2, z3, z, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfr.zzO();
        zzM("auto", str2, this.zzt.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzav().currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j, Bundle bundle) {
        zzg();
        boolean z = true;
        if (this.zzd != null && !zzlb.zzah(str2)) {
            z = false;
        }
        zzI(str, str2, j, bundle, true, z, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        int i;
        long j2;
        long j3;
        String str4;
        long j4;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzn = this.zzt.zzh().zzn();
        if (listZzn != null && !listZzn.contains(str2)) {
            this.zzt.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzau());
                } catch (Exception e) {
                    this.zzt.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzaw();
            zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzav().currentTimeMillis());
        }
        zzhx zzhxVar = this;
        zzhxVar.zzt.zzaw();
        if (z && zzlb.zzal(str2)) {
            zzhxVar.zzt.zzv().zzL(bundle, zzhxVar.zzt.zzm().zzs.zza());
        }
        if (!z3) {
            zzhxVar.zzt.zzaw();
            if (!"_iap".equals(str2)) {
                zzlb zzlbVarZzv = zzhxVar.zzt.zzv();
                int i2 = 2;
                if (zzlbVarZzv.zzac("event", str2)) {
                    if (zzlbVarZzv.zzZ("event", zzgo.zza, zzgo.zzb, str2)) {
                        zzlbVarZzv.zzt.zzf();
                        if (zzlbVarZzv.zzY("event", 40, str2)) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 13;
                    }
                }
                if (i2 != 0) {
                    zzhxVar.zzt.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", zzhxVar.zzt.zzj().zzd(str2));
                    zzlb zzlbVarZzv2 = zzhxVar.zzt.zzv();
                    zzhxVar.zzt.zzf();
                    zzhxVar.zzt.zzv().zzN(zzhxVar.zzn, null, i2, "_ev", zzlbVarZzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzhxVar.zzt.zzaw();
        zzie zzieVarZzj = zzhxVar.zzt.zzs().zzj(false);
        if (zzieVarZzj != null && !bundle.containsKey("_sc")) {
            zzieVarZzj.zzd = true;
        }
        zzlb.zzK(zzieVarZzj, bundle, z && !z3);
        boolean zEquals = "am".equals(str5);
        boolean zZzah = zzlb.zzah(str2);
        if (!z || zzhxVar.zzd == null || zZzah) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                zzhxVar.zzt.zzay().zzc().zzc("Passing event to registered event handler (FE)", zzhxVar.zzt.zzj().zzd(str2), zzhxVar.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzhxVar.zzd);
                zzhxVar.zzd.interceptEvent(str5, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (zzhxVar.zzt.zzM()) {
            int iZzh = zzhxVar.zzt.zzv().zzh(str2);
            if (iZzh != 0) {
                zzhxVar.zzt.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", zzhxVar.zzt.zzj().zzd(str2));
                zzlb zzlbVarZzv3 = zzhxVar.zzt.zzv();
                zzhxVar.zzt.zzf();
                zzhxVar.zzt.zzv().zzN(zzhxVar.zzn, str3, iZzh, "_ev", zzlbVarZzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzy = zzhxVar.zzt.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleZzy);
            zzhxVar.zzt.zzaw();
            if (zzhxVar.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                i = 0;
                j2 = 0;
            } else {
                zzka zzkaVar = zzhxVar.zzt.zzu().zzb;
                j2 = 0;
                long jElapsedRealtime = zzkaVar.zzc.zzt.zzav().elapsedRealtime();
                i = 0;
                long j5 = jElapsedRealtime - zzkaVar.zzb;
                zzkaVar.zzb = jElapsedRealtime;
                if (j5 > 0) {
                    zzhxVar.zzt.zzv().zzI(bundleZzy, j5);
                }
            }
            zznw.zzc();
            if (zzhxVar.zzt.zzf().zzs(null, zzdu.zzac)) {
                if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                    zzlb zzlbVarZzv4 = zzhxVar.zzt.zzv();
                    String string = bundleZzy.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzkz.zza(string, zzlbVarZzv4.zzt.zzm().zzp.zza())) {
                        zzlbVarZzv4.zzt.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzlbVarZzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String strZza = zzhxVar.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleZzy.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzy);
            if (zzhxVar.zzt.zzm().zzj.zza() > j2 && zzhxVar.zzt.zzm().zzk(j) && zzhxVar.zzt.zzm().zzm.zzb()) {
                C8045zW0.b(zzhxVar.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                j3 = j2;
                str4 = "_ae";
                j4 = j;
                zzhxVar.zzY("auto", "_sid", null, zzhxVar.zzt.zzav().currentTimeMillis());
                zzhxVar.zzY("auto", "_sno", null, zzhxVar.zzt.zzav().currentTimeMillis());
                zzhxVar.zzY("auto", "_se", null, zzhxVar.zzt.zzav().currentTimeMillis());
                zzhxVar = zzhxVar;
                zzhxVar.zzt.zzm().zzk.zzb(j3);
            } else {
                j3 = j2;
                str4 = "_ae";
                j4 = j;
            }
            if (bundleZzy.getLong("extend_session", j3) == 1) {
                C8045zW0.b(zzhxVar.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzhxVar.zzt.zzu().zza.zzb(j4, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = i; i3 < size; i3++) {
                String str6 = (String) arrayList2.get(i3);
                if (str6 != null) {
                    zzhxVar.zzt.zzv();
                    Object obj = bundleZzy.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzy.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i4 = i;
            while (i4 < arrayList.size()) {
                Bundle bundleZzt = (Bundle) arrayList.get(i4);
                String str7 = i4 != 0 ? "_ep" : str2;
                bundleZzt.putString("_o", str5);
                if (z2) {
                    bundleZzt = zzhxVar.zzt.zzv().zzt(bundleZzt);
                }
                Bundle bundle2 = bundleZzt;
                zzhxVar.zzt.zzt().zzA(new zzaw(str7, new zzau(bundle2), str5, j4), str3);
                if (!z4) {
                    Iterator it = zzhxVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzgs) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i4++;
                str5 = str;
                j4 = j;
            }
            zzhxVar.zzt.zzaw();
            if (zzhxVar.zzt.zzs().zzj(i) == null || !str4.equals(str2)) {
                return;
            }
            zzhxVar.zzt.zzu().zzb.zzd(true, true, zzhxVar.zzt.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.add(zzgsVar)) {
            return;
        }
        C0741Ch.c(this.zzt, "OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.zzg.set(null);
        this.zzt.zzaz().zzp(new zzhe(this, j));
    }

    public final void zzL(long j, boolean z) {
        zzg();
        zza();
        this.zzt.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkc zzkcVarZzu = this.zzt.zzu();
        zzkcVarZzu.zzg();
        zzkcVarZzu.zzb.zza();
        zzpd.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzam)) {
            this.zzt.zzh().zzo();
        }
        boolean zZzJ = this.zzt.zzJ();
        zzew zzewVarZzm = this.zzt.zzm();
        zzewVarZzm.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzewVarZzm.zzt.zzm().zzp.zza())) {
            zzewVarZzm.zzp.zzb(null);
        }
        zzof.zzc();
        zzag zzagVarZzf = zzewVarZzm.zzt.zzf();
        zzdt zzdtVar = zzdu.zzad;
        if (zzagVarZzf.zzs(null, zzdtVar)) {
            zzewVarZzm.zzj.zzb(0L);
        }
        zzewVarZzm.zzk.zzb(0L);
        if (!zzewVarZzm.zzt.zzf().zzv()) {
            zzewVarZzm.zzi(!zZzJ);
        }
        zzewVarZzm.zzq.zzb(null);
        zzewVarZzm.zzr.zzb(0L);
        zzewVarZzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzof.zzc();
        if (this.zzt.zzf().zzs(null, zzdtVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zZzJ;
    }

    public final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaz().zzp(new zzhb(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzN(String str, String str2, long j, Object obj) {
        this.zzt.zzaz().zzp(new zzhc(this, str, str2, obj, j));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C0741Ch.c(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgn.zza(bundle2, "app_id", String.class, null);
        zzgn.zza(bundle2, "origin", String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzay().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzay().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object objZzB = this.zzt.zzv().zzB(string, obj);
        if (objZzB == null) {
            this.zzt.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzgn.zzb(bundle2, objZzB);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.zzt.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.zzt.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j3));
        } else {
            this.zzt.zzaz().zzp(new zzhf(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String strZzg = zzai.zzg(bundle);
        if (strZzg != null) {
            this.zzt.zzay().zzl().zzb("Ignoring invalid consent setting", strZzg);
            this.zzt.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i, j);
    }

    public final void zzS(zzai zzaiVar, int i, long j) {
        zzai zzaiVar2;
        boolean zZzk;
        boolean z;
        zzai zzaiVar3;
        boolean z2;
        zza();
        if (i != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzt.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzaiVar2 = this.zzi;
                boolean z3 = false;
                if (zzai.zzj(i, this.zzj)) {
                    zZzk = zzaiVar.zzk(this.zzi);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    z = true;
                    if (zzaiVar.zzi(zzahVar) && !this.zzi.zzi(zzahVar)) {
                        z3 = true;
                    }
                    zzai zzaiVarZzd = zzaiVar.zzd(this.zzi);
                    this.zzi = zzaiVarZzd;
                    this.zzj = i;
                    boolean z4 = z3;
                    zzaiVar3 = zzaiVarZzd;
                    z2 = z4;
                } else {
                    zZzk = false;
                    z = false;
                    zzaiVar3 = zzaiVar;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.zzt.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (zZzk) {
            this.zzg.set(null);
            this.zzt.zzaz().zzq(new zzhr(this, zzaiVar3, j, i, andIncrement, z2, zzaiVar2));
            return;
        }
        zzhs zzhsVar = new zzhs(this, zzaiVar3, i, andIncrement, z2, zzaiVar2);
        if (i == 30 || i == -10) {
            this.zzt.zzaz().zzq(zzhsVar);
        } else {
            this.zzt.zzaz().zzp(zzhsVar);
        }
    }

    public final void zzT(zzgr zzgrVar) {
        zzgr zzgrVar2;
        zzg();
        zza();
        if (zzgrVar != null && zzgrVar != (zzgrVar2 = this.zzd)) {
            Preconditions.checkState(zzgrVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgrVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaz().zzp(new zzhq(this, bool));
    }

    public final void zzV(zzai zzaiVar) {
        zzg();
        boolean z = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzew zzewVarZzm = this.zzt.zzm();
            zzfr zzfrVar = zzewVarZzm.zzt;
            zzewVarZzm.zzg();
            Boolean boolValueOf = zzewVarZzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzewVarZzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzav().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int iZzl;
        int iZzd;
        Object objZzB;
        String str3 = str == null ? Payload.TYPE_APP : str;
        if (!z) {
            zzlb zzlbVarZzv = this.zzt.zzv();
            if (!zzlbVarZzv.zzac("user property", str2)) {
                i = 6;
            } else if (zzlbVarZzv.zzZ("user property", zzgq.zza, null, str2)) {
                zzlbVarZzv.zzt.zzf();
                if (zzlbVarZzv.zzY("user property", 24, str2)) {
                    i = 0;
                } else {
                    i = 6;
                }
            } else {
                iZzl = 15;
            }
            if (i != 0) {
                zzlb zzlbVarZzv2 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzN(this.zzn, null, i, "_ev", zzlbVarZzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
            } else {
                if (obj != null) {
                    zzN(str3, str2, j, null);
                    return;
                }
                iZzd = this.zzt.zzv().zzd(str2, obj);
                if (iZzd != 0) {
                    zzlb zzlbVarZzv3 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzN(this.zzn, null, iZzd, "_ev", zzlbVarZzv3.zzD(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                } else {
                    objZzB = this.zzt.zzv().zzB(str2, obj);
                    if (objZzB != null) {
                        zzN(str3, str2, j, objZzB);
                    }
                }
            }
        }
        iZzl = this.zzt.zzv().zzl(str2);
        i = iZzl;
        if (i != 0) {
            zzlb zzlbVarZzv4 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzN(this.zzn, null, i, "_ev", zzlbVarZzv4.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj != null) {
                zzN(str3, str2, j, null);
                return;
            }
            iZzd = this.zzt.zzv().zzd(str2, obj);
            if (iZzd != 0) {
                zzlb zzlbVarZzv5 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzN(this.zzn, null, iZzd, "_ev", zzlbVarZzv5.zzD(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
            } else {
                objZzB = this.zzt.zzv().zzB(str2, obj);
                if (objZzB != null) {
                    zzN(str3, str2, j, objZzB);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    public final void zzY(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    long j2 = true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    Long lValueOf = Long.valueOf(j2);
                    this.zzt.zzm().zzh.zzb(j2 == 1 ? "true" : "false");
                    obj2 = lValueOf;
                } else if (obj == null) {
                    this.zzt.zzm().zzh.zzb("unset");
                    obj2 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                obj2 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzt.zzJ()) {
            C8045zW0.b(this.zzt, "User property not set since app measurement is disabled");
        } else if (this.zzt.zzM()) {
            this.zzt.zzt().zzK(new zzkw(str3, j, obj2, str));
        }
    }

    public final void zzZ(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.remove(zzgsVar)) {
            return;
        }
        C0741Ch.c(this.zzt, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhi(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzhp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzho(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhn(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzie zzieVarZzi = this.zzt.zzs().zzi();
        if (zzieVarZzi != null) {
            return zzieVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzie zzieVarZzi = this.zzt.zzs().zzi();
        if (zzieVarZzi != null) {
            return zzieVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhm(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaz().zzs()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzaw();
        if (zzab.zza()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhh(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlb.zzH(list);
        }
        this.zzt.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        C8045zW0.b(this.zzt, "Getting user properties (FE)");
        if (this.zzt.zzaz().zzs()) {
            C0663Bh.c(this.zzt, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        this.zzt.zzaw();
        if (zzab.zza()) {
            C0663Bh.c(this.zzt, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhd(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.EMPTY_LIST;
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.zzt.zzaz().zzs()) {
            C0663Bh.c(this.zzt, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        this.zzt.zzaw();
        if (zzab.zza()) {
            C0663Bh.c(this.zzt, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhj(this, atomicReference, null, str, str2, z));
        List<zzkw> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        C8092zj c8092zj = new C8092zj(list.size());
        for (zzkw zzkwVar : list) {
            Object objZza = zzkwVar.zza();
            if (objZza != null) {
                c8092zj.put(zzkwVar.zzb, objZza);
            }
        }
        return c8092zj;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzdu.zzX)) {
                zzag zzagVarZzf = this.zzt.zzf();
                zzagVarZzf.zzt.zzaw();
                Boolean boolZzk = zzagVarZzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (boolZzk != null && boolZzk.booleanValue()) {
                    this.zzt.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgy
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhx zzhxVar = this.zza;
                            zzhxVar.zzg();
                            if (zzhxVar.zzt.zzm().zzn.zzb()) {
                                zzhxVar.zzt.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzhxVar.zzt.zzm().zzo.zza();
                            zzhxVar.zzt.zzm().zzo.zzb(1 + jZza);
                            zzhxVar.zzt.zzf();
                            if (jZza < 5) {
                                zzhxVar.zzt.zzE();
                            } else {
                                C0741Ch.c(zzhxVar.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhxVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzew zzewVarZzm = this.zzt.zzm();
            zzewVarZzm.zzg();
            String string = zzewVarZzm.zza().getString("previous_os_version", null);
            zzewVarZzm.zzt.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }
}
