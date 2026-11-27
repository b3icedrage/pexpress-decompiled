package com.google.android.gms.internal.gtm;

import defpackage.C4564j;
import defpackage.EK;

/* JADX INFO: loaded from: classes.dex */
final class zztx extends zzua {
    private final int zzc;

    public zztx(byte[] bArr, int i, int i2) {
        super(bArr);
        zzud.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(EK.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C4564j.c(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzua
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final int zzd() {
        return this.zzc;
    }
}
