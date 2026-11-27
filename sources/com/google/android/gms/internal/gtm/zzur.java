package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzur {
    private final zzuq zza;

    private zzur(zzuq zzuqVar) {
        byte[] bArr = zzye.zzd;
        this.zza = zzuqVar;
        zzuqVar.zze = this;
    }

    public static zzur zza(zzuq zzuqVar) {
        zzur zzurVar = zzuqVar.zze;
        return zzurVar != null ? zzurVar : new zzur(zzuqVar);
    }

    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzB(int i, int i2) {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzuq zzuqVar = this.zza;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                zzuqVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iZzD += zzuq.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzu(iZzD);
        while (i2 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            zzuqVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public final void zzD(int i, long j) {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzuq zzuqVar = this.zza;
                long jLongValue = ((Long) list.get(i2)).longValue();
                zzuqVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZzE += zzuq.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzu(iZzE);
        while (i2 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            zzuqVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Deprecated
    public final void zzF(int i) {
        this.zza.zzs(i, 3);
    }

    public final void zzG(int i, String str) {
        this.zza.zzq(i, str);
    }

    public final void zzH(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzyo)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzyo zzyoVar = (zzyo) list;
        while (i2 < list.size()) {
            Object objZzf = zzyoVar.zzf(i2);
            if (objZzf instanceof String) {
                this.zza.zzq(i, (String) objZzf);
            } else {
                this.zza.zzM(i, (zzud) objZzf);
            }
            i2++;
        }
    }

    public final void zzI(int i, int i2) {
        this.zza.zzt(i, i2);
    }

    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzD += zzuq.zzD(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzD);
        while (i2 < list.size()) {
            this.zza.zzu(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzK(int i, long j) {
        this.zza.zzv(i, j);
    }

    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzE += zzuq.zzE(((Long) list.get(i3)).longValue());
        }
        this.zza.zzu(iZzE);
        while (i2 < list.size()) {
            this.zza.zzw(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzb(int i, boolean z) {
        this.zza.zzL(i, z);
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
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzL(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzK(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzd(int i, zzud zzudVar) {
        this.zza.zzM(i, zzudVar);
    }

    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzM(i, (zzud) list.get(i2));
        }
    }

    public final void zzf(int i, double d) {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void zzh(int i) {
        this.zza.zzs(i, 4);
    }

    public final void zzi(int i, int i2) {
        this.zza.zzl(i, i2);
    }

    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzz = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzz += zzuq.zzz(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzz);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, int i2) {
        this.zza.zzh(i, i2);
    }

    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, long j) {
        this.zza.zzj(i, j);
    }

    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzo(int i, float f) {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void zzq(int i, Object obj, zzzt zzztVar) {
        zzuq zzuqVar = this.zza;
        zzuqVar.zzs(i, 3);
        zzztVar.zzm((zzzg) obj, zzuqVar.zze);
        zzuqVar.zzs(i, 4);
    }

    public final void zzr(int i, int i2) {
        this.zza.zzl(i, i2);
    }

    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzz = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzz += zzuq.zzz(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzz);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzt(int i, long j) {
        this.zza.zzv(i, j);
    }

    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzE += zzuq.zzE(((Long) list.get(i3)).longValue());
        }
        this.zza.zzu(iZzE);
        while (i2 < list.size()) {
            this.zza.zzw(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzv(int i, Object obj, zzzt zzztVar) {
        this.zza.zzn(i, (zzzg) obj, zzztVar);
    }

    public final void zzw(int i, Object obj) {
        if (obj instanceof zzud) {
            this.zza.zzp(i, (zzud) obj);
        } else {
            this.zza.zzo(i, (zzzg) obj);
        }
    }

    public final void zzx(int i, int i2) {
        this.zza.zzh(i, i2);
    }

    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzz(int i, long j) {
        this.zza.zzj(i, j);
    }
}
