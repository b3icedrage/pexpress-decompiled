package com.google.android.gms.internal.gtm;

import defpackage.EK;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzsx extends zzsq implements Set {

    @CheckForNull
    private transient zzst zza;

    public static int zzf(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzsx zzi(Object obj, Object obj2, Object obj3) {
        return zzl(3, "", "0", "false");
    }

    public static zzsx zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "GET", "HEAD", "POST", "PUT");
    }

    private static zzsx zzl(int i, Object... objArr) {
        if (i == 0) {
            return zztf.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzth(obj);
        }
        int iZzf = zzf(i);
        Object[] objArr2 = new Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(EK.e(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzsp.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzth(obj4);
        }
        if (zzf(i4) < iZzf / 2) {
            return zzl(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zztf(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsx) && zzk() && ((zzsx) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zztg.zza(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzti iterator();

    public final zzst zzg() {
        zzst zzstVar = this.zza;
        if (zzstVar != null) {
            return zzstVar;
        }
        zzst zzstVarZzh = zzh();
        this.zza = zzstVarZzh;
        return zzstVarZzh;
    }

    public zzst zzh() {
        Object[] array = toArray();
        int i = zzst.zzd;
        return zzst.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
