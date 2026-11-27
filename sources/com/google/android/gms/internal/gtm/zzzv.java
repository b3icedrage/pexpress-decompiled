package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzzv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzaak zzc;
    private static final zzaak zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzaak zzaakVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzaakVar = (zzaak) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzaakVar;
        zzd = new zzaam();
    }

    public static void zzA(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzp(i, list, z);
    }

    public static void zzB(int i, List list, zzur zzurVar, zzzt zzztVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzurVar.zzq(i, list.get(i2), zzztVar);
        }
    }

    public static void zzC(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzs(i, list, z);
    }

    public static void zzD(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzu(i, list, z);
    }

    public static void zzE(int i, List list, zzur zzurVar, zzzt zzztVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzurVar.zzv(i, list.get(i2), zzztVar);
        }
    }

    public static void zzF(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzy(i, list, z);
    }

    public static void zzG(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzA(i, list, z);
    }

    public static void zzH(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzC(i, list, z);
    }

    public static void zzI(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzE(i, list, z);
    }

    public static void zzJ(int i, List list, zzur zzurVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzH(i, list);
    }

    public static void zzK(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzJ(i, list, z);
    }

    public static void zzL(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzL(i, list, z);
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzxw)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzxw zzxwVar = (zzxw) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzuq.zzz(zzxwVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuq.zzD(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuq.zzD(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzxw)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzxw zzxwVar = (zzxw) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzuq.zzz(zzxwVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyv)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzyv zzyvVar = (zzyv) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzuq.zzE(zzyvVar.zze(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzh(int i, Object obj, zzzt zzztVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzym)) {
            return zzuq.zzD(i2) + zzuq.zzB((zzzg) obj, zzztVar);
        }
        int i3 = zzuq.zzf;
        int iZza = ((zzym) obj).zza();
        return zzuq.zzD(i2) + zzuq.zzD(iZza) + iZza;
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzxw)) {
            int iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzuq.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzD;
        }
        zzxw zzxwVar = (zzxw) list;
        int iZzD2 = 0;
        while (i < size) {
            int iZze = zzxwVar.zze(i);
            iZzD2 += zzuq.zzD((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzD2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyv)) {
            int iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzuq.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzE;
        }
        zzyv zzyvVar = (zzyv) list;
        int iZzE2 = 0;
        while (i < size) {
            long jZze = zzyvVar.zze(i);
            iZzE2 += zzuq.zzE((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzE2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzxw)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzuq.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzxw zzxwVar = (zzxw) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzuq.zzD(zzxwVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyv)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzyv zzyvVar = (zzyv) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzuq.zzE(zzyvVar.zze(i));
            i++;
        }
        return iZzE2;
    }

    public static zzaak zzm() {
        return zzc;
    }

    public static zzaak zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i, List list, zzxz zzxzVar, Object obj2, zzaak zzaakVar) {
        if (zzxzVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzxzVar.zza(iIntValue)) {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzaakVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzxzVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzp(obj, i, iIntValue2, obj2, zzaakVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzaak zzaakVar) {
        if (obj2 == null) {
            obj2 = zzaakVar.zzc(obj);
        }
        zzaakVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzq(zzxg zzxgVar, Object obj, Object obj2) {
        zzxk zzxkVarZzb = zzxgVar.zzb(obj2);
        if (zzxkVarZzb.zza.isEmpty()) {
            return;
        }
        zzxgVar.zzc(obj).zzj(zzxkVarZzb);
    }

    public static void zzr(zzaak zzaakVar, Object obj, Object obj2) {
        zzaakVar.zzo(obj, zzaakVar.zze(zzaakVar.zzd(obj), zzaakVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzxv.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzt(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzu(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzc(i, list, z);
    }

    public static void zzv(int i, List list, zzur zzurVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zze(i, list);
    }

    public static void zzw(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzg(i, list, z);
    }

    public static void zzx(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzj(i, list, z);
    }

    public static void zzy(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzl(i, list, z);
    }

    public static void zzz(int i, List list, zzur zzurVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzn(i, list, z);
    }
}
