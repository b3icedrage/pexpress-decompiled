package com.google.android.gms.internal.measurement;

import defpackage.C1039Gc0;
import defpackage.C2629a1;
import defpackage.V31;
import defpackage.Z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return C1039Gc0.d("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        zzg zzgVar2;
        int iZza;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(Z0.c(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = r10;
                str4 = "charAt";
                b = str.equals(str3) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    b = 14;
                    str3 = r10;
                }
                str3 = r10;
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str3 = r10;
                }
                str3 = r10;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str3 = r10;
                    b = 0;
                } else {
                    str3 = r10;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = r10;
                    str4 = "charAt";
                    b = 1;
                } else {
                    str3 = "hasOwnProperty";
                    str4 = "charAt";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 11;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b = 16;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str3 = r10;
                    str4 = "charAt";
                    b = 3;
                } else {
                    str3 = "hasOwnProperty";
                    str4 = "charAt";
                }
                break;
            default:
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
        }
        String strZzi = "undefined";
        switch (b) {
            case 0:
                zzh.zzj(str4, 1, list);
                int iZza2 = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str5 = this.zza;
                return (iZza2 < 0 || iZza2 >= str5.length()) ? zzap.zzm : new zzat(String.valueOf(str5.charAt(iZza2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i5 = 0; i5 < list.size(); i5++) {
                    sb.append(zzgVar.zzb((zzap) list.get(i5)).zzi());
                }
                return new zzat(sb.toString());
            case 2:
                zzh.zzh(str3, 1, list);
                String str6 = this.zza;
                zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return zzap.zzk;
                }
                double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str6.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str7 = this.zza;
                String strZzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                return new zzah(Double.valueOf(str7.lastIndexOf(strZzi2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zza(dDoubleValue2)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str8 = strZzi;
                String str9 = this.zza;
                int iIndexOf = str9.indexOf(str8);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzapVarZza instanceof zzai) {
                    i2 = 0;
                    zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str8), new zzah(Double.valueOf(iIndexOf)), this));
                } else {
                    i2 = 0;
                }
                return new zzat(C2629a1.b(str9.substring(i2, iIndexOf), zzapVarZza.zzi(), str9.substring(str8.length() + iIndexOf)));
            case 7:
                zzh.zzj("search", 1, list);
                Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
            case 8:
                zzh.zzj("slice", 2, list);
                String str10 = this.zza;
                double dZza = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                int iMax = (int) (dZza < 0.0d ? Math.max(((double) str10.length()) + dZza, 0.0d) : Math.min(dZza, str10.length()));
                double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str10.length());
                return new zzat(str10.substring(iMax, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str10.length()) + dZza2, 0.0d) : Math.min(dZza2, str10.length()))) - iMax) + iMax));
            case 9:
                zzh.zzj("split", 2, list);
                String str11 = this.zza;
                if (str11.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str11.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    int length = strArrSplit.length;
                    if (!strZzi3.isEmpty() || length <= 0) {
                        i3 = length;
                        i4 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i3 = length - 1;
                        i4 = zIsEmpty;
                        if (!strArrSplit[i3].isEmpty()) {
                            i3 = length;
                            i4 = zIsEmpty;
                        }
                    }
                    if (length > jZzd) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList.add(new zzat(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzj("substring", 2, list);
                String str12 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZza = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str12.length();
                int iMin = Math.min(Math.max(iZza, 0), str12.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str12.length());
                return new zzat(str12.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase());
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case 13:
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
