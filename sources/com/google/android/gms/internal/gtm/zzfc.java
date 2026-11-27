package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import com.google.android.gms.analytics.Logger;
import defpackage.K1;
import io.sentry.android.core.b0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzfc {
    private static volatile Logger zza = new zzcw();

    public static Logger zza() {
        return zza;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String string;
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                StringBuilder sbB = K1.b(str, ":");
                sbB.append((String) obj);
                string = sbB.toString();
            } else {
                string = str;
            }
            b0.c((String) zzew.zzc.zzb(), string);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.error(str);
        }
    }

    public static void zzc(Logger logger) {
        zza = logger;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzN(str);
        } else if (zzf(0)) {
        }
        Logger logger = zza;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfd zzfdVarZza = zzfd.zza();
        if (zzfdVarZza != null) {
            zzfdVarZza.zzQ(str);
        } else if (zzf(2)) {
            b0.e((String) zzew.zzc.zzb(), str);
        }
        Logger logger = zza;
        if (logger != null) {
            logger.warn(str);
        }
    }

    public static boolean zzf(int i) {
        return zza != null && zza.getLogLevel() <= i;
    }
}
