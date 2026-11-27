package com.google.android.gms.internal.gtm;

import defpackage.FK;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzaal {
    private static final zzaal zza = new zzaal(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaal(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzaal zzc() {
        return zza;
    }

    public static zzaal zze(zzaal zzaalVar, zzaal zzaalVar2) {
        int i = zzaalVar.zzb + zzaalVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzaalVar.zzc, i);
        System.arraycopy(zzaalVar2.zzc, 0, iArrCopyOf, zzaalVar.zzb, zzaalVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzaalVar.zzd, i);
        System.arraycopy(zzaalVar2.zzd, 0, objArrCopyOf, zzaalVar.zzb, zzaalVar2.zzb);
        return new zzaal(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzaal zzf() {
        return new zzaal(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaal)) {
            return false;
        }
        zzaal zzaalVar = (zzaal) obj;
        int i = this.zzb;
        if (i == zzaalVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzaalVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzaalVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzD = zzuq.zzD(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzud zzudVar = (zzud) this.zzd[i2];
                    int i7 = zzuq.zzf;
                    int iZzd = zzudVar.zzd();
                    iB = FK.b(i6, zzuq.zzD(iZzd) + iZzd, iB);
                } else if (i5 == 3) {
                    int i8 = i4 << 3;
                    int i9 = zzuq.zzf;
                    int iZza = ((zzaal) this.zzd[i2]).zza();
                    int iZzD2 = zzuq.zzD(i8);
                    iZzD = iZzD2 + iZzD2 + iZza;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(zzyg.zza());
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzD = zzuq.zzD(i4 << 3) + 4;
                }
                iB = iZzD + iB;
            } else {
                iB = FK.b(i4 << 3, zzuq.zzE(((Long) this.zzd[i2]).longValue()), iB);
            }
        }
        this.zze = iB;
        return iB;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzD = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzud zzudVar = (zzud) this.zzd[i2];
            int i4 = zzuq.zzf;
            int iZzd = zzudVar.zzd();
            int iZzD2 = zzuq.zzD(iZzd) + iZzd;
            int iZzD3 = zzuq.zzD(16);
            int iZzD4 = zzuq.zzD(i3);
            int iZzD5 = zzuq.zzD(8);
            iZzD += zzuq.zzD(24) + iZzD2 + iZzD3 + iZzD4 + iZzD5 + iZzD5;
        }
        this.zze = iZzD;
        return iZzD;
    }

    public final zzaal zzd(zzaal zzaalVar) {
        if (zzaalVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzaalVar.zzb;
        zzm(i);
        System.arraycopy(zzaalVar.zzc, 0, this.zzc, this.zzb, zzaalVar.zzb);
        System.arraycopy(zzaalVar.zzd, 0, this.zzd, this.zzb, zzaalVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzzi.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzur zzurVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzurVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzur zzurVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzurVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzurVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzurVar.zzd(i4, (zzud) obj);
                } else if (i3 == 3) {
                    zzurVar.zzF(i4);
                    ((zzaal) obj).zzl(zzurVar);
                    zzurVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzyg.zza());
                    }
                    zzurVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzaal() {
        this(0, new int[8], new Object[8], true);
    }
}
