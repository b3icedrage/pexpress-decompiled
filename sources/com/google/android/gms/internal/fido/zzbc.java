package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzbc extends zzbe {
    final char[] zza;

    public zzbc(String str, String str2) {
        zzbb zzbbVar = new zzbb("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbbVar, null);
        this.zza = new char[UserVerificationMethods.USER_VERIFY_NONE];
        zzam.zzc(zzbbVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzbbVar.zza(i >>> 4);
            this.zza[i | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzbbVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzam.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | UserVerificationMethods.USER_VERIFY_HANDPRINT]);
        }
    }
}
