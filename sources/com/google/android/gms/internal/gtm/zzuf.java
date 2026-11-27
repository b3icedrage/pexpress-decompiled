package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzuf extends zzuj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzuf(byte[] bArr, int i, int i2, boolean z, zzue zzueVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i2;
        this.zzh = 0;
    }

    private final void zzI() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzg = 0;
            return;
        }
        int i3 = i - i2;
        this.zzg = i3;
        this.zzf = i - i3;
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final void zzA(int i) {
        this.zzj = i;
        zzI();
    }

    public final void zzB(int i) throws zzyg {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzyg.zzj();
        }
        throw zzyg.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final boolean zzC() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final boolean zzE(int i) throws zzyg {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzyg.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.zze;
                int i4 = this.zzh;
                this.zzh = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzyg.zze();
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzyg.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws zzyg {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzyg.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zze(int i) {
        if (i < 0) {
            throw zzyg.zzf();
        }
        int i2 = i + this.zzh;
        if (i2 < 0) {
            throw zzyg.zzg();
        }
        int i3 = this.zzj;
        if (i2 > i3) {
            throw zzyg.zzj();
        }
        this.zzj = i2;
        zzI();
        return i3;
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzh() {
        return zzj();
    }

    public final int zzi() throws zzyg {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzyg.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int zzj() {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzl() {
        return zzuj.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzm() throws zzyg {
        if (zzC()) {
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzyg.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final long zzp() {
        return zzr();
    }

    public final long zzq() throws zzyg {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzyg.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long zzr() {
        long j;
        long j2;
        int i = this.zzh;
        int i2 = this.zzf;
        if (i2 != i) {
            byte[] bArr = this.zze;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzh = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzh = i4;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() throws zzyg {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZza = zza();
            j |= ((long) (bZza & 127)) << i;
            if ((bZza & 128) == 0) {
                return j;
            }
        }
        throw zzyg.zze();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final long zzu() {
        return zzuj.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final zzud zzw() throws zzyg {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzj <= i - i2) {
                zzud zzudVarZzl = zzud.zzl(this.zze, i2, iZzj);
                this.zzh += iZzj;
                return zzudVarZzl;
            }
        }
        if (iZzj == 0) {
            return zzud.zzb;
        }
        if (iZzj > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (iZzj <= i3 - i4) {
                int i5 = iZzj + i4;
                this.zzh = i5;
                return new zzua(Arrays.copyOfRange(this.zze, i4, i5));
            }
        }
        if (iZzj <= 0) {
            throw zzyg.zzf();
        }
        throw zzyg.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final String zzx() throws zzyg {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzj <= i - i2) {
                String str = new String(this.zze, i2, iZzj, zzye.zzb);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzyg.zzf();
        }
        throw zzyg.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final String zzy() throws zzyg {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzj <= i - i2) {
                String strZzd = zzaaz.zzd(this.zze, i2, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzyg.zzf();
        }
        throw zzyg.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzuj
    public final void zzz(int i) throws zzyg {
        if (this.zzi != i) {
            throw zzyg.zzb();
        }
    }
}
