package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzay;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzbb;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbf;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbj;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import defpackage.R51;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzb extends zzbt implements zzt {
    private static DecimalFormat zza;
    private final zzbx zzb;
    private final String zzc;
    private final Uri zzd;

    public zzb(zzbx zzbxVar, String str) {
        super(zzbxVar);
        Preconditions.checkNotEmpty(str);
        this.zzb = zzbxVar;
        this.zzc = str;
        this.zzd = zza(str);
    }

    public static Uri zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static String zzc(double d) {
        if (zza == null) {
            zza = new DecimalFormat("0.######");
        }
        return zza.format(d);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public static Map zzd(zzh zzhVar) {
        String string;
        HashMap map = new HashMap();
        zzbb zzbbVar = (zzbb) zzhVar.zzc(zzbb.class);
        if (zzbbVar != null) {
            for (Map.Entry entry : zzbbVar.zzd().entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    string = null;
                } else if (value instanceof String) {
                    string = (String) value;
                    if (TextUtils.isEmpty(string)) {
                        string = null;
                    }
                } else if (value instanceof Double) {
                    Double d = (Double) value;
                    if (d.doubleValue() != 0.0d) {
                        string = zzc(d.doubleValue());
                    } else {
                        string = null;
                    }
                } else if (!(value instanceof Boolean)) {
                    string = value.toString();
                } else if (value != Boolean.FALSE) {
                    string = "1";
                } else {
                    string = null;
                }
                if (string != null) {
                    map.put((String) entry.getKey(), string);
                }
            }
        }
        zzbg zzbgVar = (zzbg) zzhVar.zzc(zzbg.class);
        if (zzbgVar != null) {
            zzf(map, "t", zzbgVar.zzf());
            zzf(map, "cid", zzbgVar.zze());
            zzf(map, "uid", zzbgVar.zzg());
            zzf(map, "sc", null);
            zzg(map, "ni", zzbgVar.zzo());
            zzf(map, "adid", zzbgVar.zzd());
            zzg(map, "ate", zzbgVar.zzn());
        }
        zzbh zzbhVar = (zzbh) zzhVar.zzc(zzbh.class);
        if (zzbhVar != null) {
            zzf(map, "cd", null);
            double dZzd = zzbhVar.zzd();
            if (dZzd != 0.0d) {
                map.put(R51.PUSH_ADDITIONAL_DATA_KEY, zzc(dZzd));
            }
            zzf(map, "dr", null);
        }
        if (((zzbe) zzhVar.zzc(zzbe.class)) != null) {
            zzf(map, "ec", null);
            zzf(map, "ea", null);
            zzf(map, "el", null);
        }
        zzay zzayVar = (zzay) zzhVar.zzc(zzay.class);
        if (zzayVar != null) {
            zzf(map, "cn", zzayVar.zzl());
            zzf(map, "cs", zzayVar.zzm());
            zzf(map, "cm", zzayVar.zzk());
            zzf(map, "ck", zzayVar.zzj());
            zzf(map, "cc", zzayVar.zzf());
            zzf(map, "ci", zzayVar.zzi());
            zzf(map, "anid", zzayVar.zze());
            zzf(map, "gclid", zzayVar.zzh());
            zzf(map, "dclid", zzayVar.zzg());
            zzf(map, "aclid", zzayVar.zzd());
        }
        if (((zzbf) zzhVar.zzc(zzbf.class)) != null) {
            zzf(map, "exd", null);
        }
        if (((zzbi) zzhVar.zzc(zzbi.class)) != null) {
            zzf(map, "sn", null);
            zzf(map, "sa", null);
            zzf(map, "st", null);
        }
        if (((zzbj) zzhVar.zzc(zzbj.class)) != null) {
            zzf(map, "utv", null);
            zzf(map, "utc", null);
            zzf(map, "utl", null);
        }
        zzaz zzazVar = (zzaz) zzhVar.zzc(zzaz.class);
        if (zzazVar != null) {
            for (Map.Entry entry2 : zzazVar.zzd().entrySet()) {
                String strZzb = zzd.zzb(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(strZzb)) {
                    map.put(strZzb, (String) entry2.getValue());
                }
            }
        }
        zzba zzbaVar = (zzba) zzhVar.zzc(zzba.class);
        if (zzbaVar != null) {
            for (Map.Entry entry3 : zzbaVar.zzd().entrySet()) {
                String strZze = zzd.zze(((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(strZze)) {
                    map.put(strZze, zzc(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        zzbd zzbdVar = (zzbd) zzhVar.zzc(zzbd.class);
        if (zzbdVar != null) {
            Iterator it = zzbdVar.zze().iterator();
            int i = 1;
            while (it.hasNext()) {
                map.putAll(((Promotion) it.next()).zza(zzd.zzm(i)));
                i++;
            }
            Iterator it2 = zzbdVar.zzd().iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                map.putAll(((Product) it2.next()).zza(zzd.zzk(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry4 : zzbdVar.zzf().entrySet()) {
                List list = (List) entry4.getValue();
                String strZzh = zzd.zzh(i3);
                Iterator it3 = list.iterator();
                int i4 = 1;
                while (it3.hasNext()) {
                    map.putAll(((Product) it3.next()).zza(strZzh.concat(zzd.zzi(i4))));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry4.getKey())) {
                    map.put(strZzh.concat("nm"), (String) entry4.getKey());
                }
                i3++;
            }
        }
        zzbc zzbcVar = (zzbc) zzhVar.zzc(zzbc.class);
        if (zzbcVar != null) {
            zzf(map, "ul", zzbcVar.zzd());
            int i5 = zzbcVar.zza;
            int i6 = zzbcVar.zzb;
            if (i5 > 0 && i6 > 0) {
                map.put("sr", i5 + "x" + i6);
            }
        }
        zzax zzaxVar = (zzax) zzhVar.zzc(zzax.class);
        if (zzaxVar != null) {
            zzf(map, "an", zzaxVar.zzf());
            zzf(map, "aid", zzaxVar.zzd());
            zzf(map, "aiid", zzaxVar.zze());
            zzf(map, "av", zzaxVar.zzg());
        }
        return map;
    }

    private static void zzf(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private static void zzg(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    @Override // com.google.android.gms.analytics.zzt
    public final Uri zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.analytics.zzt
    public final void zze(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkArgument(zzhVar.zzm(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzh zzhVar2 = new zzh(zzhVar);
        zzbg zzbgVar = (zzbg) zzhVar2.zzb(zzbg.class);
        if (TextUtils.isEmpty(zzbgVar.zzf())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(zzbgVar.zze())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without client id");
            return;
        }
        if (this.zzb.zzc().getAppOptOut()) {
            return;
        }
        if (zzfu.zzj(0.0d, zzbgVar.zze())) {
            zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
            return;
        }
        Map mapZzd = zzd(zzhVar2);
        mapZzd.put("v", "1");
        mapZzd.put("_v", zzbv.zzb);
        mapZzd.put("tid", this.zzc);
        if (this.zzb.zzc().isDryRunEnabled()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : mapZzd.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            zzM("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
            return;
        }
        HashMap map = new HashMap();
        zzfu.zzg(map, "uid", zzbgVar.zzg());
        zzax zzaxVar = (zzax) zzhVar.zzc(zzax.class);
        if (zzaxVar != null) {
            zzfu.zzg(map, "an", zzaxVar.zzf());
            zzfu.zzg(map, "aid", zzaxVar.zzd());
            zzfu.zzg(map, "av", zzaxVar.zzg());
            zzfu.zzg(map, "aiid", zzaxVar.zze());
        }
        mapZzd.put("_s", String.valueOf(zzs().zza(new zzbz(0L, zzbgVar.zze(), this.zzc, !TextUtils.isEmpty(zzbgVar.zzd()), 0L, map))));
        zzs().zzh(new zzez(zzz(), mapZzd, zzhVar.zza(), true));
    }
}
