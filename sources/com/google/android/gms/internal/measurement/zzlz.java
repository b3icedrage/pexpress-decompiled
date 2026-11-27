package com.google.android.gms.internal.measurement;

import defpackage.C0663Bh;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzlz {
    private static final Class zza;
    private static final zzmo zzb;
    private static final zzmo zzc;
    private static final zzmo zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmq();
    }

    public static zzmo zzA() {
        return zzc;
    }

    public static zzmo zzB() {
        return zzd;
    }

    public static Object zzC(Object obj, int i, List list, zzkj zzkjVar, Object obj2, zzmo zzmoVar) {
        Object objZzD = null;
        if (zzkjVar == null) {
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzkjVar.zza(iIntValue)) {
                    objZzD = zzD(obj, i, iIntValue, objZzD, zzmoVar);
                    it.remove();
                }
            }
            return objZzD;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzkjVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                objZzD = zzD(obj, i, iIntValue2, objZzD, zzmoVar);
            }
        }
        if (i2 == size) {
            return objZzD;
        }
        list.subList(i2, size).clear();
        return objZzD;
    }

    public static Object zzD(Object obj, int i, int i2, Object obj2, zzmo zzmoVar) {
        if (obj2 == null) {
            obj2 = zzmoVar.zzc(obj);
        }
        zzmoVar.zzf(obj2, i, i2);
        return obj2;
    }

    public static void zzE(zzjs zzjsVar, Object obj, Object obj2) {
        zzjsVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmo zzmoVar, Object obj, Object obj2) {
        zzmoVar.zzh(obj, zzmoVar.zze(zzmoVar.zzd(obj), zzmoVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkf.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzc(i, list, z);
    }

    public static void zzI(int i, List list, zzng zzngVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zze(i, list);
    }

    public static void zzJ(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzg(i, list, z);
    }

    public static void zzK(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzj(i, list, z);
    }

    public static void zzL(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzl(i, list, z);
    }

    public static void zzM(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzn(i, list, z);
    }

    public static void zzN(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzp(i, list, z);
    }

    public static void zzO(int i, List list, zzng zzngVar, zzlx zzlxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjn) zzngVar).zzq(i, list.get(i2), zzlxVar);
        }
    }

    public static void zzP(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzs(i, list, z);
    }

    public static void zzQ(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzu(i, list, z);
    }

    public static void zzR(int i, List list, zzng zzngVar, zzlx zzlxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjn) zzngVar).zzv(i, list.get(i2), zzlxVar);
        }
    }

    public static void zzS(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzx(i, list, z);
    }

    public static void zzT(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzz(i, list, z);
    }

    public static void zzU(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzB(i, list, z);
    }

    public static void zzV(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzD(i, list, z);
    }

    public static void zzW(int i, List list, zzng zzngVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzG(i, list);
    }

    public static void zzX(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzI(i, list, z);
    }

    public static void zzY(int i, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzK(i, list, z);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 1) * size;
    }

    public static void zzaa(zzlh zzlhVar, Object obj, Object obj2, long j) {
        zzmy.zzs(obj, j, zzlh.zzb(zzmy.zzf(obj, j), zzmy.zzf(obj2, j)));
    }

    private static zzmo zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmo) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjm.zzz(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzz += zzjm.zzt((zzje) list.get(i2));
        }
        return iZzz;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int iZzv = 0;
            while (i < size) {
                iZzv += zzjm.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzv;
        }
        zzkg zzkgVar = (zzkg) list;
        int iZzv2 = 0;
        while (i < size) {
            iZzv2 += zzjm.zzv(zzkgVar.zze(i));
            i++;
        }
        return iZzv2;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzlx zzlxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzu += zzjm.zzu(i, (zzlm) list.get(i2), zzlxVar);
        }
        return iZzu;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int iZzv = 0;
            while (i < size) {
                iZzv += zzjm.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzv;
        }
        zzkg zzkgVar = (zzkg) list;
        int iZzv2 = 0;
        while (i < size) {
            iZzv2 += zzjm.zzv(zzkgVar.zze(i));
            i++;
        }
        return iZzv2;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzjm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzlb zzlbVar = (zzlb) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzjm.zzB(zzlbVar.zza(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzo(int i, Object obj, zzlx zzlxVar) {
        if (!(obj instanceof zzks)) {
            return zzjm.zzx((zzlm) obj, zzlxVar) + zzjm.zzA(i << 3);
        }
        int iZzA = zzjm.zzA(i << 3);
        int iZza = ((zzks) obj).zza();
        return C0663Bh.b(iZza, iZza, iZzA);
    }

    public static int zzp(int i, List list, zzlx zzlxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjm.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzz = (obj instanceof zzks ? zzjm.zzw((zzks) obj) : zzjm.zzx((zzlm) obj, zzlxVar)) + iZzz;
        }
        return iZzz;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzjm.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zzkg zzkgVar = (zzkg) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZze = zzkgVar.zze(i);
            iZzA2 += zzjm.zzA((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzjm.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzlb zzlbVar = (zzlb) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZza = zzlbVar.zza(i);
            iZzB2 += zzjm.zzB((jZza >> 63) ^ (jZza + jZza));
            i++;
        }
        return iZzB2;
    }

    public static int zzu(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjm.zzz(i) * size;
        if (!(list instanceof zzku)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzz = (obj instanceof zzje ? zzjm.zzt((zzje) obj) : zzjm.zzy((String) obj)) + iZzz;
                i2++;
            }
            return iZzz;
        }
        zzku zzkuVar = (zzku) list;
        while (i2 < size) {
            Object objZzf = zzkuVar.zzf(i2);
            iZzz = (objZzf instanceof zzje ? zzjm.zzt((zzje) objZzf) : zzjm.zzy((String) objZzf)) + iZzz;
            i2++;
        }
        return iZzz;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzjm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzkg zzkgVar = (zzkg) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzjm.zzA(zzkgVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzjm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzlb zzlbVar = (zzlb) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzjm.zzB(zzlbVar.zza(i));
            i++;
        }
        return iZzB2;
    }

    public static zzmo zzz() {
        return zzb;
    }
}
