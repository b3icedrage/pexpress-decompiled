package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzzk implements zzzt {
    private final zzzg zza;
    private final zzaak zzb;
    private final boolean zzc;
    private final zzxg zzd;

    private zzzk(zzaak zzaakVar, zzxg zzxgVar, zzzg zzzgVar) {
        this.zzb = zzaakVar;
        this.zzc = zzxgVar.zzi(zzzgVar);
        this.zzd = zzxgVar;
        this.zza = zzzgVar;
    }

    public static zzzk zzc(zzaak zzaakVar, zzxg zzxgVar, zzzg zzzgVar) {
        return new zzzk(zzaakVar, zzxgVar, zzzgVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zza(Object obj) {
        zzaak zzaakVar = this.zzb;
        int iZzb = zzaakVar.zzb(zzaakVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final Object zze() {
        zzzg zzzgVar = this.zza;
        return zzzgVar instanceof zzxv ? ((zzxv) zzzgVar).zzad() : zzzgVar.zzau().zzE();
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzg(Object obj, Object obj2) {
        zzzv.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzzv.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzh(Object obj, zzzs zzzsVar, zzxf zzxfVar) {
        boolean zZzQ;
        zzaak zzaakVar = this.zzb;
        Object objZzc = zzaakVar.zzc(obj);
        zzxg zzxgVar = this.zzd;
        zzxk zzxkVarZzc = zzxgVar.zzc(obj);
        while (zzzsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzzsVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzxgVar.zzd(zzxfVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzxgVar.zzg(zzzsVar, objZzd, zzxfVar, zzxkVarZzc);
                        } else {
                            zZzQ = zzaakVar.zzp(objZzc, zzzsVar);
                        }
                    } else {
                        zZzQ = zzzsVar.zzQ();
                    }
                    if (!zZzQ) {
                        zzaakVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzd2 = null;
                    int iZzj = 0;
                    zzud zzudVarZzp = null;
                    while (zzzsVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzzsVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzzsVar.zzj();
                            objZzd2 = zzxgVar.zzd(zzxfVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzxgVar.zzg(zzzsVar, objZzd2, zzxfVar, zzxkVarZzc);
                            } else {
                                zzudVarZzp = zzzsVar.zzp();
                            }
                        } else if (!zzzsVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzzsVar.zzd() != 12) {
                        throw zzyg.zzb();
                    }
                    if (zzudVarZzp != null) {
                        if (objZzd2 != null) {
                            zzxgVar.zzh(zzudVarZzp, objZzd2, zzxfVar, zzxkVarZzc);
                        } else {
                            zzaakVar.zzk(objZzc, iZzj, zzudVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzaakVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzaakVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[EDGE_INSN: B:61:0x00c3->B:33:0x00c3 BREAK  A[LOOP:1: B:17:0x0069->B:64:0x0069], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zztp zztpVar) throws zzyg {
        int iZzi;
        zzxv zzxvVar = (zzxv) obj;
        zzaal zzaalVarZzf = zzxvVar.zzc;
        if (zzaalVarZzf == zzaal.zzc()) {
            zzaalVarZzf = zzaal.zzf();
            zzxvVar.zzc = zzaalVarZzf;
        }
        zzaal zzaalVar = zzaalVarZzf;
        zzxk zzxkVarZzT = ((zzxr) obj).zzT();
        Object objZzd = null;
        while (i < i2) {
            int iZzi2 = zztq.zzi(bArr, i, zztpVar);
            int i3 = zztpVar.zza;
            if (i3 == 11) {
                int i4 = i2;
                zztp zztpVar2 = zztpVar;
                int i5 = 0;
                zzud zzudVar = null;
                while (true) {
                    if (iZzi2 >= i4) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zztq.zzi(bArr, iZzi2, zztpVar2);
                    int i6 = zztpVar2.zza;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == 2) {
                        if (i8 != 0) {
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            iZzi2 = zztq.zzo(i6, bArr, iZzi, i4, zztpVar2);
                        } else {
                            iZzi2 = zztq.zzi(bArr, iZzi, zztpVar2);
                            i5 = zztpVar2.zza;
                            objZzd = this.zzd.zzd(zztpVar2.zzd, this.zza, i5);
                        }
                    } else {
                        if (i7 == 3) {
                            if (objZzd != null) {
                                zzxt zzxtVar = (zzxt) objZzd;
                                int iZzd = zztq.zzd(zzzp.zza().zzb(zzxtVar.zzc.getClass()), bArr, iZzi, i4, zztpVar2);
                                zzxkVarZzT.zzk(zzxtVar.zzd, zztpVar2.zzc);
                                iZzi2 = iZzd;
                            } else if (i8 == 2) {
                                iZzi2 = zztq.zza(bArr, iZzi, zztpVar2);
                                zzudVar = (zzud) zztpVar2.zzc;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iZzi2 = zztq.zzo(i6, bArr, iZzi, i4, zztpVar2);
                        }
                    }
                }
                if (zzudVar != null) {
                    zzaalVar.zzj((i5 << 3) | 2, zzudVar);
                }
                i = iZzi;
                i2 = i4;
                zztpVar = zztpVar2;
            } else if ((i3 & 7) == 2) {
                objZzd = this.zzd.zzd(zztpVar.zzd, this.zza, i3 >>> 3);
                if (objZzd != null) {
                    zzxt zzxtVar2 = (zzxt) objZzd;
                    i = zztq.zzd(zzzp.zza().zzb(zzxtVar2.zzc.getClass()), bArr, iZzi2, i2, zztpVar);
                    zzxkVarZzT.zzk(zzxtVar2.zzd, zztpVar.zzc);
                } else {
                    i = zztq.zzh(i3, bArr, iZzi2, i2, zzaalVar, zztpVar);
                }
            } else {
                i = zztq.zzo(i3, bArr, iZzi2, i2, zztpVar);
            }
        }
        if (i != i2) {
            throw zzyg.zzg();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzj(Object obj, Object obj2) {
        zzaak zzaakVar = this.zzb;
        if (!zzaakVar.zzd(obj).equals(zzaakVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzm(Object obj, zzur zzurVar) {
        Iterator itZzg = this.zzd.zzb(obj).zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzxj zzxjVar = (zzxj) entry.getKey();
            if (zzxjVar.zze() != zzabb.MESSAGE || zzxjVar.zzg()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzxjVar.zzf();
            if (entry instanceof zzyj) {
                zzurVar.zzw(zzxjVar.zza(), ((zzyj) entry).zza().zzb());
            } else {
                zzurVar.zzw(zzxjVar.zza(), entry.getValue());
            }
        }
        zzaak zzaakVar = this.zzb;
        zzaakVar.zzr(zzaakVar.zzd(obj), zzurVar);
    }
}
