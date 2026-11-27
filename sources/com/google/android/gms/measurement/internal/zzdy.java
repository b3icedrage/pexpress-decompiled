package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import defpackage.C8045zW0;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zzdy extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzdy(zzfr zzfrVar, long j) {
        super(zzfrVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0194  */
    /* JADX WARN: Code duplicated, block: B:54:0x0195 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a6 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x020f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0224  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    public final void zzd() {
        String str;
        String string;
        Object[] objArr;
        int iZza;
        List listZzp;
        Iterator it;
        String strZzc;
        String str2;
        Context contextZzau;
        String strZzz;
        String packageName = this.zzt.zzau().getPackageName();
        PackageManager packageManager = this.zzt.zzau().getPackageManager();
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        String str3 = "Unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzt.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeh.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzt.zzau().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzt.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeh.zzn(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i;
                this.zze = string;
                this.zzf = 0L;
                if (TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx())) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                iZza = this.zzt.zza();
                switch (iZza) {
                    case 0:
                        C8045zW0.b(this.zzt, "App measurement collection enabled");
                        break;
                    case 1:
                        this.zzt.zzay().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        C8045zW0.b(this.zzt, "App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzt.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzt.zzay().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        C8045zW0.b(this.zzt, "App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzt.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzt.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzt.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzt.zzaw();
                if (objArr != false) {
                    this.zzl = this.zzt.zzw();
                }
                strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
                this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
                if (!TextUtils.isEmpty(strZzc)) {
                    contextZzau = this.zzt.zzau();
                    strZzz = this.zzt.zzz();
                    Preconditions.checkNotNull(contextZzau);
                    Resources resources = contextZzau.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfj.zza(contextZzau);
                    }
                    this.zzl = zzfj.zzb("admob_app_id", resources, strZzz);
                }
                if (iZza == 0) {
                    zzef zzefVarZzj = this.zzt.zzay().zzj();
                    String str4 = this.zza;
                    if (TextUtils.isEmpty(this.zzk)) {
                        str2 = this.zzl;
                    } else {
                        str2 = this.zzk;
                    }
                    zzefVarZzj.zzc("App measurement enabled for app package, google app id", str4, str2);
                }
                this.zzh = null;
                this.zzt.zzaw();
                listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                if (listZzp != null) {
                    this.zzh = listZzp;
                } else if (listZzp.isEmpty()) {
                    this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzp.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzh = listZzp;
                        }
                    } while (this.zzt.zzv().zzab("safelisted event", (String) it.next()));
                }
                if (packageManager != null) {
                    this.zzj = InstantApps.isInstantApp(this.zzt.zzau()) ? 1 : 0;
                } else {
                    this.zzj = 0;
                }
            }
            this.zzt.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeh.zzn(packageName));
            strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
            this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                contextZzau = this.zzt.zzau();
                strZzz = this.zzt.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources2 = contextZzau.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfj.zza(contextZzau);
                }
                this.zzl = zzfj.zzb("admob_app_id", resources2, strZzz);
            }
            if (iZza == 0) {
                zzef zzefVarZzj2 = this.zzt.zzay().zzj();
                String str5 = this.zza;
                if (TextUtils.isEmpty(this.zzk)) {
                    str2 = this.zzl;
                } else {
                    str2 = this.zzk;
                }
                zzefVarZzj2.zzc("App measurement enabled for app package, google app id", str5, str2);
            }
        } catch (IllegalStateException e) {
            this.zzt.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeh.zzn(packageName), e);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
            objArr = false;
        } else {
            objArr = false;
        }
        iZza = this.zzt.zza();
        switch (iZza) {
            case 0:
                C8045zW0.b(this.zzt, "App measurement collection enabled");
                break;
            case 1:
                this.zzt.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                C8045zW0.b(this.zzt, "App measurement deactivated via the init parameters");
                break;
            case 3:
                this.zzt.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                this.zzt.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                C8045zW0.b(this.zzt, "App measurement disabled via the init parameters");
                break;
            case 6:
                this.zzt.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                this.zzt.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                this.zzt.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzaw();
        if (objArr != false) {
            this.zzl = this.zzt.zzw();
        }
        this.zzh = null;
        this.zzt.zzaw();
        listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
        if (listZzp != null) {
            this.zzh = listZzp;
        } else if (listZzp.isEmpty()) {
            this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzp.iterator();
            do {
                if (it.hasNext()) {
                    this.zzh = listZzp;
                }
            } while (this.zzt.zzv().zzab("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.zzj = InstantApps.isInstantApp(this.zzt.zzau()) ? 1 : 0;
        } else {
            this.zzj = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzq, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x016f: MOVE (r20v0 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq) (LINE:368)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x015d: MOVE (r20v2 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq) (LINE:350)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x0138: MOVE (r20v3 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq) (LINE:313)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x00e8: MOVE (r20v5 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq) (LINE:233)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String str;
        zzg();
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        this.zzt.zzay().zzc().zza("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.zzm = str;
        this.zzn = this.zzt.zzav().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
