package com.google.android.gms.internal.gtm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzuq extends zztt {
    private static final Logger zza = Logger.getLogger(zzuq.class.getName());
    private static final boolean zzb = zzaau.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzur zze;

    private zzuq() {
    }

    public static int zzA(zzzg zzzgVar) {
        int iZzX = zzzgVar.zzX();
        return zzD(iZzX) + iZzX;
    }

    public static int zzB(zzzg zzzgVar, zzzt zzztVar) {
        int iZzQ = ((zztl) zzzgVar).zzQ(zzztVar);
        return zzD(iZzQ) + iZzQ;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzaaz.zzc(str);
        } catch (zzaay unused) {
            length = str.getBytes(zzye.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzE(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    @Deprecated
    public static int zzy(int i, zzzg zzzgVar, zzzt zzztVar) {
        int iZzQ = ((zztl) zzzgVar).zzQ(zzztVar);
        int iZzD = zzD(i << 3);
        return iZzD + iZzD + iZzQ;
    }

    public static int zzz(int i) {
        if (i >= 0) {
            return zzD(i);
        }
        return 10;
    }

    public final void zzF(String str, zzaay zzaayVar) throws zzun {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaayVar);
        byte[] bytes = str.getBytes(zzye.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzun(e);
        }
    }

    public abstract void zzJ();

    public abstract void zzK(byte b);

    public abstract void zzL(int i, boolean z);

    public abstract void zzM(int i, zzud zzudVar);

    @Override // com.google.android.gms.internal.gtm.zztt
    public abstract void zza(byte[] bArr, int i, int i2);

    public abstract int zzb();

    public abstract void zzh(int i, int i2);

    public abstract void zzi(int i);

    public abstract void zzj(int i, long j);

    public abstract void zzk(long j);

    public abstract void zzl(int i, int i2);

    public abstract void zzm(int i);

    public abstract void zzn(int i, zzzg zzzgVar, zzzt zzztVar);

    public abstract void zzo(int i, zzzg zzzgVar);

    public abstract void zzp(int i, zzud zzudVar);

    public abstract void zzq(int i, String str);

    public abstract void zzs(int i, int i2);

    public abstract void zzt(int i, int i2);

    public abstract void zzu(int i);

    public abstract void zzv(int i, long j);

    public abstract void zzw(long j);

    public /* synthetic */ zzuq(zzup zzupVar) {
    }
}
