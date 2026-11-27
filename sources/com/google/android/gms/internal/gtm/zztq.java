package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes.dex */
final class zztq {
    public static int zza(byte[] bArr, int i, zztp zztpVar) {
        int iZzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 < 0) {
            throw zzyg.zzf();
        }
        if (i2 > bArr.length - iZzi) {
            throw zzyg.zzj();
        }
        if (i2 == 0) {
            zztpVar.zzc = zzud.zzb;
            return iZzi;
        }
        zztpVar.zzc = zzud.zzl(bArr, iZzi, i2);
        return iZzi + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzzt zzztVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) {
        Object objZze = zzztVar.zze();
        int iZzm = zzm(objZze, zzztVar, bArr, i, i2, i3, zztpVar);
        zzztVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzzt zzztVar, byte[] bArr, int i, int i2, zztp zztpVar) {
        Object objZze = zzztVar.zze();
        int iZzn = zzn(objZze, zzztVar, bArr, i, i2, zztpVar);
        zzztVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzzt zzztVar, int i, byte[] bArr, int i2, int i3, zzyd zzydVar, zztp zztpVar) {
        int iZzd = zzd(zzztVar, bArr, i2, i3, zztpVar);
        zzydVar.add(zztpVar.zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            iZzd = zzd(zzztVar, bArr, iZzi, i3, zztpVar);
            zzydVar.add(zztpVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzyd zzydVar, zztp zztpVar) {
        zzxw zzxwVar = (zzxw) zzydVar;
        int iZzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzyg.zzj();
    }

    public static int zzg(byte[] bArr, int i, zztp zztpVar) {
        int iZzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 < 0) {
            throw zzyg.zzf();
        }
        if (i2 == 0) {
            zztpVar.zzc = "";
            return iZzi;
        }
        zztpVar.zzc = new String(bArr, iZzi, i2, zzye.zzb);
        return iZzi + i2;
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzaal zzaalVar, zztp zztpVar) {
        if ((i >>> 3) == 0) {
            throw zzyg.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzl = zzl(bArr, i2, zztpVar);
            zzaalVar.zzj(i, Long.valueOf(zztpVar.zzb));
            return iZzl;
        }
        if (i4 == 1) {
            zzaalVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzi = zzi(bArr, i2, zztpVar);
            int i5 = zztpVar.zza;
            if (i5 < 0) {
                throw zzyg.zzf();
            }
            if (i5 > bArr.length - iZzi) {
                throw zzyg.zzj();
            }
            if (i5 == 0) {
                zzaalVar.zzj(i, zzud.zzb);
            } else {
                zzaalVar.zzj(i, zzud.zzl(bArr, iZzi, i5));
            }
            return iZzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzyg.zzc();
            }
            zzaalVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzaal zzaalVarZzf = zzaal.zzf();
        int i7 = 0;
        while (i2 < i3) {
            int iZzi2 = zzi(bArr, i2, zztpVar);
            i7 = zztpVar.zza;
            if (i7 == i6) {
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i7, bArr, iZzi2, i3, zzaalVarZzf, zztpVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzyg.zzg();
        }
        zzaalVar.zzj(i, zzaalVarZzf);
        return i2;
    }

    public static int zzi(byte[] bArr, int i, zztp zztpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zztpVar);
        }
        zztpVar.zza = b;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zztp zztpVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zztpVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zztpVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zztpVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zztpVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zztpVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zzyd zzydVar, zztp zztpVar) {
        zzxw zzxwVar = (zzxw) zzydVar;
        int iZzi = zzi(bArr, i2, zztpVar);
        zzxwVar.zzh(zztpVar.zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zztp zztpVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zztpVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zztpVar.zzb = j2;
        return i3;
    }

    public static int zzm(Object obj, zzzt zzztVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) {
        int iZzc = ((zzzj) zzztVar).zzc(obj, bArr, i, i2, i3, zztpVar);
        zztpVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzzt zzztVar, byte[] bArr, int i, int i2, zztp zztpVar) {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zztpVar);
            i3 = zztpVar.zza;
        }
        int i4 = iZzj;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzyg.zzj();
        }
        int i5 = i4 + i3;
        zzztVar.zzi(obj, bArr, i4, i5, zztpVar);
        zztpVar.zzc = obj;
        return i5;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zztp zztpVar) {
        if ((i >>> 3) == 0) {
            throw zzyg.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zztpVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zztpVar) + zztpVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzyg.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zztpVar);
            i6 = zztpVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zztpVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzyg.zzg();
        }
        return i2;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
