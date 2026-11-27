package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.C1039Gc0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzec {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzeb zzd;

    public zzec(zzeb zzebVar) {
        this.zzd = zzebVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbF = C1039Gc0.f("[");
        for (Object obj : objArr) {
            String strZzb = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (strZzb != null) {
                if (sbF.length() != 1) {
                    sbF.append(", ");
                }
                sbF.append(strZzb);
            }
        }
        sbF.append("]");
        return sbF.toString();
    }

    public final String zzb(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbF = C1039Gc0.f("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbF.length() != 8) {
                sbF.append(", ");
            }
            sbF.append(zze(str));
            sbF.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZza = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZza = zza((Object[]) obj);
            } else {
                strZza = obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbF.append(strZza);
        }
        sbF.append("}]");
        return sbF.toString();
    }

    public final String zzc(zzaw zzawVar) {
        String string;
        if (!this.zzd.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzawVar.zzc);
        sb.append(",name=");
        sb.append(zzd(zzawVar.zza));
        sb.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        if (zzauVar == null) {
            string = null;
        } else {
            string = !this.zzd.zza() ? zzauVar.toString() : zzb(zzauVar.zzc());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgo.zzc, zzgo.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgp.zzb, zzgp.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? C1039Gc0.d("experiment_id(", str, ")") : zzg(str, zzgq.zzb, zzgq.zza, zzc);
        }
        return str;
    }
}
