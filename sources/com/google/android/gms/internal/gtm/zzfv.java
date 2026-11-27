package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzfv extends zzbu {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzfv(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public final String zza() {
        zzV();
        return this.zzb;
    }

    public final String zzb() {
        zzV();
        return this.zza;
    }

    public final boolean zzc() {
        zzV();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context contextZzo = zzo();
        try {
            applicationInfo = contextZzo.getPackageManager().getApplicationInfo(contextZzo.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (PackageManager.NameNotFoundException e) {
            zzR("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzQ("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        zzbx zzbxVarZzt = zzt();
        zzey zzeyVar = (zzey) new zzcu(zzbxVarZzt, new zzex(zzbxVarZzt)).zza(i);
        if (zzeyVar != null) {
            zzN("Loading global XML config values");
            String str = zzeyVar.zza;
            if (str != null) {
                this.zzb = str;
                zzF("XML config - app name", str);
            }
            String str2 = zzeyVar.zzb;
            if (str2 != null) {
                this.zza = str2;
                zzF("XML config - app version", str2);
            }
            String str3 = zzeyVar.zzc;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                if ("verbose".equals(lowerCase)) {
                    i2 = 0;
                } else if ("info".equals(lowerCase)) {
                    i2 = 1;
                } else if ("warning".equals(lowerCase)) {
                    i2 = 2;
                } else {
                    i2 = "error".equals(lowerCase) ? 3 : -1;
                }
                if (i2 >= 0) {
                    zzO("XML config - log level", Integer.valueOf(i2));
                }
            }
            int i3 = zzeyVar.zzd;
            if (i3 >= 0) {
                this.zzd = i3;
                this.zzc = true;
                zzF("XML config - dispatch period (sec)", Integer.valueOf(i3));
            }
            int i4 = zzeyVar.zze;
            if (i4 != -1) {
                boolean z = 1 == i4;
                this.zzf = z;
                this.zze = true;
                zzF("XML config - dry run", Boolean.valueOf(z));
            }
        }
    }

    public final boolean zze() {
        zzV();
        return this.zze;
    }

    public final boolean zzf() {
        zzV();
        return false;
    }
}
