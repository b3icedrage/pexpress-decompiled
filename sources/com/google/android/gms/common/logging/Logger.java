package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import defpackage.NG1;
import defpackage.SG1;
import io.sentry.android.core.b0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        b0.d(this.zza, format(str, objArr), th);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull Object... objArr) {
        b0.e(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        b0.g(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Object... objArr) {
        b0.c(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th) {
        String str = this.zza;
        b0.a(str, NG1.ERROR, null, th);
        b0.b(SG1.FATAL, null, th);
        Log.wtf(str, th);
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
