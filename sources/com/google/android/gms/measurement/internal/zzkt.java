package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C8092zj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzkt implements zzgm {
    private static volatile zzkt zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzie zzD;
    private String zzE;

    @VisibleForTesting
    long zza;
    private final zzfi zzc;
    private final zzen zzd;
    private zzam zze;
    private zzep zzf;
    private zzkf zzg;
    private zzaa zzh;
    private final zzkv zzi;
    private zzic zzj;
    private zzjo zzk;
    private final zzki zzl;
    private zzez zzm;
    private final zzfr zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzla zzF = new zzko(this);

    public zzkt(zzku zzkuVar, zzfr zzfrVar) {
        Preconditions.checkNotNull(zzkuVar);
        this.zzn = zzfr.zzp(zzkuVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzki(this);
        zzkv zzkvVar = new zzkv(this);
        zzkvVar.zzX();
        this.zzi = zzkvVar;
        zzen zzenVar = new zzen(this);
        zzenVar.zzX();
        this.zzd = zzenVar;
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzX();
        this.zzc = zzfiVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkj(this, zzkuVar));
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze.zzj("_err");
        zzfwVarZze.zzi(i);
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze.zzaC();
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze2.zzj("_ev");
        zzfwVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze2.zzaC();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    public static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, @NonNull String str) {
        List listZzp = zzfsVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad != null && !boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping. appId", zzeh.zzn(str));
            return null;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        return new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String strZzw = zzhVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzky zzkyVarZzp = zzamVar.zzp(zzgcVar.zzap(), str);
        zzky zzkyVar = (zzkyVarZzp == null || zzkyVarZzp.zze == null) ? new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(j)) : new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzkyVarZzp.zze).longValue() + j));
        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzglVarZzd.zzf(str);
        zzglVarZzd.zzg(zzav().currentTimeMillis());
        zzglVarZzd.zze(((Long) zzkyVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
        int iZza = zzkv.zza(zzgcVar, str);
        if (iZza >= 0) {
            zzgcVar.zzam(iZza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzkyVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzkyVar.zze);
        }
    }

    private final void zzag() {
        long jMax;
        long jMax2;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkf zzkfVar = this.zzg;
                zzal(zzkfVar);
                zzkfVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkf zzkfVar2 = this.zzg;
            zzal(zzkfVar2);
            zzkfVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax3 = Math.max(0L, ((Long) zzdu.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzt.zza(null)).longValue());
            } else {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            jMax = Math.max(0L, ((Long) zzdu.zzs.zza(null)).longValue());
        }
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        long j = 0;
        long jZzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        boolean z2 = z;
        long jMax4 = Math.max(jZzd, zzamVar4.zze());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            long jMin = jMax3 + jAbs2;
            if (z2 && jMax5 > 0) {
                jMin = Math.min(jAbs2, jMax5) + jMax;
            }
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            jMax2 = !zzkvVar.zzw(jMax5, jMax) ? jMax5 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzdu.zzB.zza(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzg();
                    jMax2 += Math.max(j, ((Long) zzdu.zzA.zza(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j = 0;
                }
            }
            j = 0;
        }
        if (jMax2 == j) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkf zzkfVar3 = this.zzg;
            zzal(zzkfVar3);
            zzkfVar3.zza();
            return;
        }
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        if (!zzenVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkf zzkfVar4 = this.zzg;
            zzal(zzkfVar4);
            zzkfVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzdu.zzq.zza(null)).longValue());
        zzkv zzkvVar2 = this.zzi;
        zzal(zzkvVar2);
        if (!zzkvVar2.zzw(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax2 - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzdu.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkf zzkfVar5 = this.zzg;
        zzal(zzkfVar5);
        zzkfVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x038e A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03a6 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x03c4 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x03de A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:126:0x03f0 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0400  */
    /* JADX WARN: Code duplicated, block: B:132:0x040b  */
    /* JADX WARN: Code duplicated, block: B:133:0x040d A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0442  */
    /* JADX WARN: Code duplicated, block: B:142:0x0443 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0454  */
    /* JADX WARN: Code duplicated, block: B:147:0x045b A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0465 A[Catch: all -> 0x00e6, LOOP:3: B:145:0x0455->B:149:0x0465, LOOP_END, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0484  */
    /* JADX WARN: Code duplicated, block: B:154:0x0495 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:157:0x04a8 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x04df  */
    /* JADX WARN: Code duplicated, block: B:168:0x04e2 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x04ee A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:173:0x0501 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x052e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0582 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x058d A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0593 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x059c  */
    /* JADX WARN: Code duplicated, block: B:385:0x0b70 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:183:0x054d, B:27:0x00f5, B:29:0x0103, B:32:0x0123, B:34:0x0129, B:36:0x013b, B:38:0x0149, B:40:0x0159, B:41:0x0166, B:42:0x016b, B:45:0x0184, B:119:0x03c4, B:120:0x03d0, B:123:0x03de, B:129:0x0401, B:126:0x03f0, B:152:0x0489, B:154:0x0495, B:157:0x04a8, B:159:0x04b9, B:161:0x04c5, B:182:0x0537, B:168:0x04e2, B:170:0x04ee, B:173:0x0501, B:175:0x0512, B:177:0x051e, B:133:0x040d, B:135:0x0419, B:137:0x0425, B:150:0x046b, B:142:0x0443, B:145:0x0455, B:147:0x045b, B:149:0x0465, B:70:0x01e4, B:73:0x01ee, B:75:0x01fc, B:80:0x024a, B:76:0x021a, B:78:0x022a, B:84:0x0253, B:87:0x0284, B:88:0x02ae, B:90:0x02e6, B:92:0x02ed, B:95:0x02f9, B:97:0x0334, B:98:0x034f, B:100:0x0355, B:102:0x0365, B:107:0x037d, B:103:0x036d, B:111:0x0386, B:114:0x038e, B:115:0x03a6, B:186:0x055f, B:188:0x056d, B:190:0x0578, B:202:0x05ad, B:192:0x0582, B:194:0x058d, B:196:0x0593, B:199:0x059f, B:201:0x05a7, B:203:0x05b0, B:204:0x05bc, B:207:0x05c4, B:209:0x05d6, B:210:0x05e2, B:212:0x05ea, B:216:0x060f, B:218:0x0634, B:220:0x0645, B:222:0x064b, B:224:0x0657, B:225:0x0686, B:227:0x068c, B:229:0x069a, B:230:0x069e, B:231:0x06a1, B:232:0x06a4, B:233:0x06b2, B:235:0x06b8, B:237:0x06c8, B:238:0x06cf, B:240:0x06db, B:241:0x06e2, B:242:0x06e5, B:244:0x0723, B:245:0x0736, B:247:0x073c, B:250:0x0757, B:252:0x0772, B:254:0x0789, B:256:0x078e, B:258:0x0792, B:260:0x0796, B:262:0x07a0, B:263:0x07aa, B:265:0x07ae, B:267:0x07b4, B:268:0x07c2, B:269:0x07cb, B:337:0x0a00, B:271:0x07d8, B:273:0x07ef, B:278:0x0809, B:280:0x082e, B:281:0x0836, B:283:0x083c, B:285:0x084e, B:291:0x0864, B:293:0x087a, B:295:0x089f, B:297:0x08ab, B:299:0x08c0, B:300:0x08fc, B:306:0x0918, B:308:0x0923, B:310:0x0927, B:312:0x092b, B:314:0x092f, B:315:0x093b, B:316:0x0940, B:318:0x0946, B:320:0x095e, B:321:0x0963, B:336:0x09fd, B:322:0x097a, B:324:0x097e, B:328:0x09a9, B:330:0x09d1, B:331:0x09d8, B:335:0x09ee, B:325:0x098f, B:276:0x07f5, B:338:0x0a0a, B:340:0x0a18, B:341:0x0a1e, B:342:0x0a26, B:344:0x0a2c, B:347:0x0a46, B:349:0x0a57, B:369:0x0ac7, B:371:0x0acd, B:373:0x0ae5, B:376:0x0aec, B:381:0x0b1b, B:383:0x0b5e, B:386:0x0b93, B:387:0x0b97, B:388:0x0ba2, B:390:0x0be5, B:391:0x0bf2, B:393:0x0c01, B:396:0x0c1a, B:398:0x0c33, B:385:0x0b70, B:377:0x0af4, B:379:0x0b00, B:380:0x0b04, B:399:0x0c4a, B:400:0x0c62, B:403:0x0c6a, B:404:0x0c6f, B:405:0x0c7f, B:407:0x0c99, B:408:0x0cb4, B:409:0x0cbd, B:413:0x0cdb, B:412:0x0cc8, B:350:0x0a6f, B:352:0x0a75, B:354:0x0a7d, B:356:0x0a84, B:362:0x0a92, B:364:0x0a99, B:366:0x0ab8, B:368:0x0abf, B:367:0x0abc, B:363:0x0a96, B:355:0x0a81, B:213:0x05ef, B:215:0x05f5, B:416:0x0cee), top: B:425:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0408 A[EDGE_INSN: B:436:0x0408->B:130:0x0408 BREAK  A[LOOP:2: B:120:0x03d0->B:129:0x0401], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c9  */
    private final boolean zzah(String str, long j) {
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        int iZzc;
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB;
        Long lValueOf;
        String str2;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        zzkq zzkqVar;
        int i7;
        int i8;
        int i9;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        String strZzh;
        int iCharCount;
        int iCodePointAt;
        byte b;
        String str3 = "_ai";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzkq zzkqVar2 = new zzkq(this, null);
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzU(null, j, this.zzA, zzkqVar2);
            List list = zzkqVar2.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzkqVar2.zza.zzby();
                zzgcVar.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar2 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar3 = null;
                int i13 = 0;
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                int i17 = 0;
                while (true) {
                    i = i14;
                    com.google.android.gms.internal.measurement.zzfs zzfsVar4 = zzfsVar2;
                    if (i13 >= zzkqVar2.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar5 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzkqVar2.zzc.get(i13)).zzby();
                    zzfi zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    com.google.android.gms.internal.measurement.zzfs zzfsVar6 = zzfsVar3;
                    if (zzfiVar.zzr(zzkqVar2.zza.zzx(), zzfsVar5.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(zzkqVar2.zza.zzx()), this.zzn.zzj().zzd(zzfsVar5.zzo()));
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        if (!zzfiVar2.zzp(zzkqVar2.zza.zzx())) {
                            zzfi zzfiVar3 = this.zzc;
                            zzal(zzfiVar3);
                            if (!zzfiVar3.zzs(zzkqVar2.zza.zzx()) && !"_err".equals(zzfsVar5.zzo())) {
                                zzv().zzN(this.zzF, zzkqVar2.zza.zzx(), 11, "_ev", zzfsVar5.zzo(), 0);
                            }
                        }
                        str2 = str3;
                        i9 = i13;
                        i14 = i;
                        zzfsVar3 = zzfsVar6;
                    } else {
                        if (zzfsVar5.zzo().equals(zzgo.zza(str3))) {
                            zzfsVar5.zzi(str3);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i18 = 0;
                                while (i18 < zzfsVar5.zza()) {
                                    String str4 = str3;
                                    if ("ad_platform".equals(zzfsVar5.zzn(i18).zzg()) && !zzfsVar5.zzn(i18).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar5.zzn(i18).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i18++;
                                    str3 = str4;
                                }
                            }
                        }
                        str2 = str3;
                        zzfi zzfiVar4 = this.zzc;
                        zzal(zzfiVar4);
                        boolean zZzq = zzfiVar4.zzq(zzkqVar2.zza.zzx(), zzfsVar5.zzo());
                        if (zZzq) {
                            z = zZzq;
                            i2 = i13;
                            i3 = i17;
                        } else {
                            zzal(this.zzi);
                            String strZzo = zzfsVar5.zzo();
                            Preconditions.checkNotEmpty(strZzo);
                            z = zZzq;
                            int iHashCode = strZzo.hashCode();
                            i3 = i17;
                            i2 = i13;
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strZzo.equals("_ui")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strZzo.equals("_ug")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strZzo.equals("_in")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b != 0 && b != 1 && b != 2) {
                                i15 = i15;
                                i6 = i3;
                                z = false;
                            }
                            if (z) {
                                arrayList = new ArrayList(zzfsVar5.zzp());
                                i10 = 0;
                                i11 = -1;
                                i12 = -1;
                                while (true) {
                                    i7 = i6;
                                    zzkqVar = zzkqVar2;
                                    if (i10 < arrayList.size()) {
                                        break;
                                    }
                                    if (AppMeasurementSdk.ConditionalUserProperty.VALUE.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i10)).zzg())) {
                                        i11 = i10;
                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i10)).zzg())) {
                                        i12 = i10;
                                    }
                                    i10++;
                                    i6 = i7;
                                    zzkqVar2 = zzkqVar;
                                }
                                if (i11 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i11)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i11)).zzu()) {
                                        if (i12 == -1) {
                                            strZzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i12)).zzh();
                                            if (strZzh.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strZzh.length()) {
                                                    iCodePointAt = strZzh.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        zzfsVar5.zzh(i11);
                                        zzab(zzfsVar5, "_c");
                                        zzaa(zzfsVar5, 19, "currency");
                                        break;
                                    }
                                    zzay().zzl().zza("Value must be specified with a numeric type.");
                                    zzfsVar5.zzh(i11);
                                    zzab(zzfsVar5, "_c");
                                    zzaa(zzfsVar5, 18, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                }
                                if ("_e".equals(zzfsVar5.zzo())) {
                                    zzal(this.zzi);
                                    if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_fr") != null) {
                                        i15 = i15;
                                    } else if (zzfsVar6 != null || Math.abs(zzfsVar6.zzc() - zzfsVar5.zzc()) > 1000) {
                                        zzfsVar4 = zzfsVar5;
                                        i15 = i;
                                    } else {
                                        com.google.android.gms.internal.measurement.zzfs zzfsVar7 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar6.clone();
                                        if (zzaj(zzfsVar5, zzfsVar7)) {
                                            zzgcVar.zzS(i16, zzfsVar7);
                                            i15 = i15;
                                            zzfsVar = null;
                                            zzfsVar3 = null;
                                        } else {
                                            zzfsVar = zzfsVar5;
                                            i15 = i;
                                            zzfsVar3 = zzfsVar6;
                                        }
                                        zzfsVar4 = zzfsVar;
                                    }
                                    zzfsVar3 = zzfsVar6;
                                } else {
                                    if ("_vs".equals(zzfsVar5.zzo())) {
                                        zzal(this.zzi);
                                        if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_et") == null) {
                                            if (zzfsVar4 != null || Math.abs(zzfsVar4.zzc() - zzfsVar5.zzc()) > 1000) {
                                                i15 = i15;
                                                zzfsVar3 = zzfsVar5;
                                                i16 = i;
                                            } else {
                                                com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar4.clone();
                                                if (zzaj(zzfsVar8, zzfsVar5)) {
                                                    i8 = i15;
                                                    zzgcVar.zzS(i8, zzfsVar8);
                                                    zzfsVar3 = null;
                                                    zzfsVar4 = null;
                                                } else {
                                                    i8 = i15;
                                                    zzfsVar3 = zzfsVar5;
                                                    i16 = i;
                                                }
                                                i15 = i8;
                                            }
                                        }
                                    }
                                    i15 = i15;
                                    zzfsVar3 = zzfsVar6;
                                }
                                zzkqVar2 = zzkqVar;
                                i9 = i2;
                                zzkqVar2.zzc.set(i9, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC());
                                i14 = i + 1;
                                zzgcVar.zzk(zzfsVar5);
                                i17 = i7;
                            } else {
                                zzkqVar = zzkqVar2;
                                i7 = i6;
                            }
                            if ("_e".equals(zzfsVar5.zzo())) {
                                zzal(this.zzi);
                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_fr") != null) {
                                    if (zzfsVar6 != null) {
                                    }
                                    zzfsVar4 = zzfsVar5;
                                    i15 = i;
                                } else {
                                    i15 = i15;
                                }
                                zzfsVar3 = zzfsVar6;
                            } else {
                                if ("_vs".equals(zzfsVar5.zzo())) {
                                    zzal(this.zzi);
                                    if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_et") == null) {
                                        if (zzfsVar4 != null) {
                                            i15 = i15;
                                            zzfsVar3 = zzfsVar5;
                                            i16 = i;
                                        } else {
                                            i15 = i15;
                                            zzfsVar3 = zzfsVar5;
                                            i16 = i;
                                        }
                                    }
                                }
                                i15 = i15;
                                zzfsVar3 = zzfsVar6;
                            }
                            zzkqVar2 = zzkqVar;
                            i9 = i2;
                            zzkqVar2.zzc.set(i9, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC());
                            i14 = i + 1;
                            zzgcVar.zzk(zzfsVar5);
                            i17 = i7;
                        }
                        int i19 = 0;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            z2 = z3;
                            if (i19 >= zzfsVar5.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar5.zzn(i19).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar5.zzn(i19).zzby();
                                zzfwVar.zzi(1L);
                                zzfsVar5.zzk(i19, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaC());
                                z4 = z4;
                                z3 = true;
                            } else {
                                boolean z5 = z4;
                                if ("_r".equals(zzfsVar5.zzn(i19).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar5.zzn(i19).zzby();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar5.zzk(i19, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaC());
                                    z3 = z2;
                                    z4 = true;
                                } else {
                                    z3 = z2;
                                    z4 = z5;
                                }
                            }
                            i19++;
                        }
                        boolean z6 = z4;
                        if (!z2 && z) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze.zzj("_c");
                            zzfwVarZze.zzi(1L);
                            zzfsVar5.zze(zzfwVarZze);
                        }
                        if (!z6) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze2.zzj("_r");
                            zzfwVarZze2.zzi(1L);
                            zzfsVar5.zze(zzfwVarZze2);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        if (zzamVar3.zzl(zza(), zzkqVar2.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkqVar2.zza.zzx(), zzdu.zzn)) {
                            zzab(zzfsVar5, "_r");
                            i4 = i3;
                        } else {
                            i4 = 1;
                        }
                        if (zzlb.zzai(zzfsVar5.zzo()) && z) {
                            zzam zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            i5 = i4;
                            if (zzamVar4.zzl(zza(), zzkqVar2.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkqVar2.zza.zzx(), zzdu.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z7 = false;
                                int i20 = -1;
                                for (int i21 = 0; i21 < zzfsVar5.zza(); i21++) {
                                    com.google.android.gms.internal.measurement.zzfx zzfxVarZzn = zzfsVar5.zzn(i21);
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = zzfwVar3;
                                    if ("_c".equals(zzfxVarZzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzfxVarZzn.zzby();
                                        i20 = i21;
                                    } else if ("_err".equals(zzfxVarZzn.zzg())) {
                                        zzfwVar3 = zzfwVar4;
                                        z7 = true;
                                    } else {
                                        zzfwVar3 = zzfwVar4;
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzfw zzfwVar5 = zzfwVar3;
                                if (z7) {
                                    if (zzfwVar5 != null) {
                                        zzfsVar5.zzh(i20);
                                    } else {
                                        zzfwVar5 = null;
                                        if (zzfwVar5 != null) {
                                            com.google.android.gms.internal.measurement.zzfw zzfwVar6 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar5.clone();
                                            zzfwVar6.zzj("_err");
                                            zzfwVar6.zzi(10L);
                                            zzfsVar5.zzk(i20, (com.google.android.gms.internal.measurement.zzfx) zzfwVar6.zzaC());
                                        } else {
                                            zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                        }
                                    }
                                } else if (zzfwVar5 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar7 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar5.clone();
                                    zzfwVar7.zzj("_err");
                                    zzfwVar7.zzi(10L);
                                    zzfsVar5.zzk(i20, (com.google.android.gms.internal.measurement.zzfx) zzfwVar7.zzaC());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                }
                            }
                        } else {
                            i5 = i4;
                        }
                        i6 = i5;
                        if (z) {
                            arrayList = new ArrayList(zzfsVar5.zzp());
                            i10 = 0;
                            i11 = -1;
                            i12 = -1;
                            while (true) {
                                i7 = i6;
                                zzkqVar = zzkqVar2;
                                if (i10 < arrayList.size()) {
                                    break;
                                    break;
                                }
                                if (AppMeasurementSdk.ConditionalUserProperty.VALUE.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i10)).zzg())) {
                                    i11 = i10;
                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i10)).zzg())) {
                                    i12 = i10;
                                }
                                i10++;
                                i6 = i7;
                                zzkqVar2 = zzkqVar;
                            }
                            if (i11 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i11)).zzw()) {
                                }
                                if (i12 == -1) {
                                    strZzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i12)).zzh();
                                    if (strZzh.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strZzh.length()) {
                                            iCodePointAt = strZzh.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                zzfsVar5.zzh(i11);
                                zzab(zzfsVar5, "_c");
                                zzaa(zzfsVar5, 19, "currency");
                                break;
                            }
                            if ("_e".equals(zzfsVar5.zzo())) {
                                zzal(this.zzi);
                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_fr") != null) {
                                    if (zzfsVar6 != null) {
                                    }
                                    zzfsVar4 = zzfsVar5;
                                    i15 = i;
                                } else {
                                    i15 = i15;
                                }
                                zzfsVar3 = zzfsVar6;
                            } else {
                                if ("_vs".equals(zzfsVar5.zzo())) {
                                    zzal(this.zzi);
                                    if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_et") == null) {
                                        if (zzfsVar4 != null) {
                                            i15 = i15;
                                            zzfsVar3 = zzfsVar5;
                                            i16 = i;
                                        } else {
                                            i15 = i15;
                                            zzfsVar3 = zzfsVar5;
                                            i16 = i;
                                        }
                                    }
                                }
                                i15 = i15;
                                zzfsVar3 = zzfsVar6;
                            }
                            zzkqVar2 = zzkqVar;
                            i9 = i2;
                            zzkqVar2.zzc.set(i9, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC());
                            i14 = i + 1;
                            zzgcVar.zzk(zzfsVar5);
                            i17 = i7;
                        } else {
                            zzkqVar = zzkqVar2;
                            i7 = i6;
                        }
                        if ("_e".equals(zzfsVar5.zzo())) {
                            zzal(this.zzi);
                            if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_fr") != null) {
                                if (zzfsVar6 != null) {
                                }
                                zzfsVar4 = zzfsVar5;
                                i15 = i;
                            } else {
                                i15 = i15;
                            }
                            zzfsVar3 = zzfsVar6;
                        } else {
                            if ("_vs".equals(zzfsVar5.zzo())) {
                                zzal(this.zzi);
                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC(), "_et") == null) {
                                    if (zzfsVar4 != null) {
                                        i15 = i15;
                                        zzfsVar3 = zzfsVar5;
                                        i16 = i;
                                    } else {
                                        i15 = i15;
                                        zzfsVar3 = zzfsVar5;
                                        i16 = i;
                                    }
                                }
                            }
                            i15 = i15;
                            zzfsVar3 = zzfsVar6;
                        }
                        zzkqVar2 = zzkqVar;
                        i9 = i2;
                        zzkqVar2.zzc.set(i9, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaC());
                        i14 = i + 1;
                        zzgcVar.zzk(zzfsVar5);
                        i17 = i7;
                    }
                    zzfsVar2 = zzfsVar4;
                    i13 = i9 + 1;
                    str3 = str2;
                }
                int i22 = i17;
                long j6 = 0;
                long jLongValue = 0;
                int i23 = i;
                int i24 = 0;
                while (i24 < i23) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze = zzgcVar.zze(i24);
                    if ("_e".equals(zzftVarZze.zzh())) {
                        zzal(this.zzi);
                        if (zzkv.zzB(zzftVarZze, "_fr") != null) {
                            zzgcVar.zzA(i24);
                            i23--;
                            i24--;
                        } else {
                            zzal(this.zzi);
                            zzfxVarZzB = zzkv.zzB(zzftVarZze, "_et");
                            if (zzfxVarZzB != null) {
                                if (zzfxVarZzB.zzw()) {
                                    lValueOf = Long.valueOf(zzfxVarZzB.zzd());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf != null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        zzal(this.zzi);
                        zzfxVarZzB = zzkv.zzB(zzftVarZze, "_et");
                        if (zzfxVarZzB != null) {
                            if (zzfxVarZzB.zzw()) {
                                lValueOf = Long.valueOf(zzfxVarZzB.zzd());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                jLongValue += lValueOf.longValue();
                            }
                        }
                    }
                    i24++;
                }
                zzaf(zzgcVar, jLongValue, false);
                Iterator it = zzgcVar.zzas().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzgcVar.zzap(), "_se");
                        break;
                    }
                }
                if (zzkv.zza(zzgcVar, "_sid") >= 0) {
                    zzaf(zzgcVar, jLongValue, true);
                } else {
                    int iZza = zzkv.zza(zzgcVar, "_se");
                    if (iZza >= 0) {
                        zzgcVar.zzB(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                    }
                }
                zzkv zzkvVar = this.zzi;
                zzal(zzkvVar);
                zzkvVar.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfi zzfiVar5 = zzkvVar.zzf.zzc;
                zzal(zzfiVar5);
                if (zzfiVar5.zzn(zzgcVar.zzap())) {
                    zzam zzamVar6 = zzkvVar.zzf.zze;
                    zzal(zzamVar6);
                    zzh zzhVarZzj = zzamVar6.zzj(zzgcVar.zzap());
                    if (zzhVarZzj != null && zzhVarZzj.zzah() && zzkvVar.zzt.zzg().zze()) {
                        zzkvVar.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd.zzf("_npa");
                        zzglVarZzd.zzg(zzkvVar.zzt.zzg().zza());
                        zzglVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
                        int i25 = 0;
                        while (true) {
                            if (i25 >= zzgcVar.zzb()) {
                                zzgcVar.zzm(zzgmVar);
                                break;
                            }
                            if ("_npa".equals(zzgcVar.zzao(i25).zzf())) {
                                zzgcVar.zzam(i25, zzgmVar);
                                break;
                            }
                            i25++;
                        }
                    }
                }
                zzgcVar.zzai(Long.MAX_VALUE);
                zzgcVar.zzQ(Long.MIN_VALUE);
                for (int i26 = 0; i26 < zzgcVar.zza(); i26++) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze2 = zzgcVar.zze(i26);
                    if (zzftVarZze2.zzd() < zzgcVar.zzd()) {
                        zzgcVar.zzai(zzftVarZze2.zzd());
                    }
                    if (zzftVarZze2.zzd() > zzgcVar.zzc()) {
                        zzgcVar.zzQ(zzftVarZze2.zzd());
                    }
                }
                zzgcVar.zzz();
                zzgcVar.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar.zzf(zzaaVar.zza(zzgcVar.zzap(), zzgcVar.zzas(), zzgcVar.zzat(), Long.valueOf(zzgcVar.zzd()), Long.valueOf(zzgcVar.zzc())));
                if (zzg().zzw(zzkqVar2.zza.zzx())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzG = zzv().zzG();
                    int i27 = 0;
                    while (i27 < zzgcVar.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar9 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar.zze(i27).zzby();
                        if (zzfsVar9.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str5 = (String) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC(), "_en");
                            zzas zzasVarZzn = (zzas) map.get(str5);
                            if (zzasVarZzn == null) {
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzasVarZzn = zzamVar7.zzn(zzkqVar2.zza.zzx(), (String) Preconditions.checkNotNull(str5));
                                if (zzasVarZzn != null) {
                                    map.put(str5, zzasVarZzn);
                                }
                            }
                            if (zzasVarZzn != null && zzasVarZzn.zzi == null) {
                                Long l = zzasVarZzn.zzj;
                                if (l != null && l.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar9, "_sr", zzasVarZzn.zzj);
                                }
                                Boolean bool = zzasVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar9, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC());
                            }
                            zzgcVar.zzS(i27, zzfsVar9);
                            j4 = j6;
                        } else {
                            zzfi zzfiVar6 = this.zzc;
                            zzal(zzfiVar6);
                            String strZzx = zzkqVar2.zza.zzx();
                            String strZza = zzfiVar6.zza(strZzx, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j3 = j6;
                            } else {
                                try {
                                    j3 = Long.parseLong(strZza);
                                } catch (NumberFormatException e) {
                                    zzfiVar6.zzt.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(strZzx), e);
                                    j3 = j6;
                                }
                            }
                            long j7 = j6;
                            long jZzr = zzv().zzr(zzfsVar9.zzc(), j3);
                            com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC();
                            j4 = j7;
                            Long l2 = 1L;
                            if (TextUtils.isEmpty("_dbg")) {
                                j5 = j3;
                                zzfi zzfiVar7 = this.zzc;
                                zzal(zzfiVar7);
                                iZzc = zzfiVar7.zzc(zzkqVar2.zza.zzx(), zzfsVar9.zzo());
                            } else {
                                Iterator it2 = zzftVar.zzi().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                                        j5 = j3;
                                        if (!"_dbg".equals(zzfxVar.zzg())) {
                                            j3 = j5;
                                        } else if (l2.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            iZzc = 1;
                                        } else {
                                            zzfi zzfiVar8 = this.zzc;
                                            zzal(zzfiVar8);
                                            iZzc = zzfiVar8.zzc(zzkqVar2.zza.zzx(), zzfsVar9.zzo());
                                        }
                                    } else {
                                        j5 = j3;
                                        zzfi zzfiVar9 = this.zzc;
                                        zzal(zzfiVar9);
                                        iZzc = zzfiVar9.zzc(zzkqVar2.zza.zzx(), zzfsVar9.zzo());
                                    }
                                }
                            }
                            if (iZzc <= 0) {
                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar9.zzo(), Integer.valueOf(iZzc));
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC());
                                zzgcVar.zzS(i27, zzfsVar9);
                            } else {
                                zzas zzasVarZza = (zzas) map.get(zzfsVar9.zzo());
                                if (zzasVarZza == null) {
                                    zzam zzamVar8 = this.zze;
                                    zzal(zzamVar8);
                                    zzasVarZza = zzamVar8.zzn(zzkqVar2.zza.zzx(), zzfsVar9.zzo());
                                    if (zzasVarZza == null) {
                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkqVar2.zza.zzx(), zzfsVar9.zzo());
                                        zzasVarZza = new zzas(zzkqVar2.zza.zzx(), zzfsVar9.zzo(), 1L, 1L, 1L, zzfsVar9.zzc(), 0L, null, null, null, null);
                                    }
                                }
                                zzal(this.zzi);
                                Long l3 = (Long) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC(), "_eid");
                                boolean z8 = l3 != null;
                                if (iZzc == 1) {
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC());
                                    if (z8 && (zzasVarZza.zzi != null || zzasVarZza.zzj != null || zzasVarZza.zzk != null)) {
                                        map.put(zzfsVar9.zzo(), zzasVarZza.zza(null, null, null));
                                    }
                                    zzgcVar.zzS(i27, zzfsVar9);
                                } else {
                                    if (secureRandomZzG.nextInt(iZzc) == 0) {
                                        zzal(this.zzi);
                                        Long lValueOf2 = Long.valueOf(iZzc);
                                        zzkv.zzz(zzfsVar9, "_sr", lValueOf2);
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC());
                                        if (z8) {
                                            zzasVarZza = zzasVarZza.zza(null, lValueOf2, null);
                                        }
                                        map.put(zzfsVar9.zzo(), zzasVarZza.zzb(zzfsVar9.zzc(), jZzr));
                                        secureRandomZzG = secureRandomZzG;
                                        zzkqVar2 = zzkqVar2;
                                    } else {
                                        Long l4 = zzasVarZza.zzh;
                                        if ((l4 != null ? l4.longValue() : zzv().zzr(zzfsVar9.zzb(), j5)) != jZzr) {
                                            zzal(this.zzi);
                                            zzkv.zzz(zzfsVar9, "_efs", 1L);
                                            zzal(this.zzi);
                                            Long lValueOf3 = Long.valueOf(iZzc);
                                            zzkv.zzz(zzfsVar9, "_sr", lValueOf3);
                                            arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar9.zzaC());
                                            if (z8) {
                                                zzasVarZza = zzasVarZza.zza(null, lValueOf3, Boolean.TRUE);
                                            }
                                            map.put(zzfsVar9.zzo(), zzasVarZza.zzb(zzfsVar9.zzc(), jZzr));
                                        } else if (z8) {
                                            map.put(zzfsVar9.zzo(), zzasVarZza.zza(l3, null, null));
                                        }
                                        zzgcVar = zzgcVar;
                                    }
                                    zzgcVar.zzS(i27, zzfsVar9);
                                }
                                i27++;
                                secureRandomZzG = secureRandomZzG;
                                j6 = j4;
                                zzkqVar2 = zzkqVar2;
                            }
                        }
                        zzkqVar2 = zzkqVar2;
                        i27++;
                        secureRandomZzG = secureRandomZzG;
                        j6 = j4;
                        zzkqVar2 = zzkqVar2;
                    }
                    j2 = j6;
                    zzkq zzkqVar3 = zzkqVar2;
                    if (arrayList2.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzE((zzas) entry.getValue());
                    }
                    zzkqVar2 = zzkqVar3;
                } else {
                    j2 = 0;
                }
                String strZzx2 = zzkqVar2.zza.zzx();
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzh zzhVarZzj2 = zzamVar10.zzj(strZzx2);
                if (zzhVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                } else if (zzgcVar.zza() > 0) {
                    long jZzn = zzhVarZzj2.zzn();
                    if (jZzn != j2) {
                        zzgcVar.zzab(jZzn);
                    } else {
                        zzgcVar.zzv();
                    }
                    long jZzp = zzhVarZzj2.zzp();
                    if (jZzp != j2) {
                        jZzn = jZzp;
                    }
                    if (jZzn != j2) {
                        zzgcVar.zzac(jZzn);
                    } else {
                        zzgcVar.zzw();
                    }
                    zzhVarZzj2.zzE();
                    zzgcVar.zzI((int) zzhVarZzj2.zzo());
                    zzhVarZzj2.zzab(zzgcVar.zzd());
                    zzhVarZzj2.zzZ(zzgcVar.zzc());
                    String strZzs = zzhVarZzj2.zzs();
                    if (strZzs != null) {
                        zzgcVar.zzW(strZzs);
                    } else {
                        zzgcVar.zzs();
                    }
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzD(zzhVarZzj2);
                }
                if (zzgcVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfi zzfiVar10 = this.zzc;
                    zzal(zzfiVar10);
                    com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar10.zze(zzkqVar2.zza.zzx());
                    if (zzffVarZze != null && zzffVarZze.zzs()) {
                        zzgcVar.zzK(zzffVarZze.zzc());
                    } else if (zzkqVar2.zza.zzF().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC();
                    zzamVar12.zzg();
                    zzamVar12.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzx());
                    Preconditions.checkState(zzgdVar.zzbe());
                    zzamVar12.zzz();
                    long jCurrentTimeMillis = zzamVar12.zzt.zzav().currentTimeMillis();
                    long jZzk = zzgdVar.zzk();
                    zzamVar12.zzt.zzf();
                    if (jZzk >= jCurrentTimeMillis - zzag.zzA()) {
                        long jZzk2 = zzgdVar.zzk();
                        zzamVar12.zzt.zzf();
                        if (jZzk2 > zzag.zzA() + jCurrentTimeMillis) {
                            zzamVar12.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                        }
                    } else {
                        zzamVar12.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    }
                    byte[] bArrZzbu = zzgdVar.zzbu();
                    try {
                        zzkv zzkvVar2 = zzamVar12.zzf.zzi;
                        zzal(zzkvVar2);
                        byte[] bArrZzy = zzkvVar2.zzy(bArrZzbu);
                        zzamVar12.zzt.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", bArrZzy);
                        contentValues.put("has_realtime", Integer.valueOf(i22));
                        if (zzgdVar.zzbk()) {
                            contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                        }
                        try {
                            if (zzamVar12.zzh().insert("queue", null, contentValues) == -1) {
                                zzamVar12.zzt.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(zzgdVar.zzx()));
                            }
                        } catch (SQLiteException e2) {
                            zzamVar12.zzt.zzay().zzd().zzc("Error storing bundle. appId", zzeh.zzn(zzgdVar.zzx()), e2);
                        }
                    } catch (IOException e3) {
                        zzamVar12.zzt.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeh.zzn(zzgdVar.zzx()), e3);
                    }
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkqVar2.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i28 = 0; i28 < list2.size(); i28++) {
                    if (i28 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i28)).longValue());
                }
                sb.append(")");
                int iDelete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    zzamVar13.zzt.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzx2, strZzx2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzt.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(strZzx2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_sc");
        String strZzh = zzfxVarZzB == null ? null : zzfxVarZzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB2 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_pc");
        String strZzh2 = zzfxVarZzB2 != null ? zzfxVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB3 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_et");
        if (zzfxVarZzB3 == null || !zzfxVarZzB3.zzw() || zzfxVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfxVarZzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB4 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_et");
        if (zzfxVarZzB4 != null && zzfxVarZzB4.zzd() > 0) {
            jZzd += zzfxVarZzB4.zzd();
        }
        zzal(this.zzi);
        zzkv.zzz(zzfsVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzkv.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkh zzal(zzkh zzkhVar) {
        if (zzkhVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkhVar.zzY()) {
            return zzkhVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkhVar.getClass())));
    }

    public static zzkt zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkt.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzkt((zzku) Preconditions.checkNotNull(new zzku(context)), null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzkt zzktVar, zzku zzkuVar) {
        zzktVar.zzaz().zzg();
        zzktVar.zzm = new zzez(zzktVar);
        zzam zzamVar = new zzam(zzktVar);
        zzamVar.zzX();
        zzktVar.zze = zzamVar;
        zzktVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzktVar.zzc));
        zzjo zzjoVar = new zzjo(zzktVar);
        zzjoVar.zzX();
        zzktVar.zzk = zzjoVar;
        zzaa zzaaVar = new zzaa(zzktVar);
        zzaaVar.zzX();
        zzktVar.zzh = zzaaVar;
        zzic zzicVar = new zzic(zzktVar);
        zzicVar.zzX();
        zzktVar.zzj = zzicVar;
        zzkf zzkfVar = new zzkf(zzktVar);
        zzkfVar.zzX();
        zzktVar.zzg = zzkfVar;
        zzktVar.zzf = new zzep(zzktVar);
        if (zzktVar.zzr != zzktVar.zzs) {
            zzktVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzktVar.zzr), Integer.valueOf(zzktVar.zzs));
        }
        zzktVar.zzo = true;
    }

    @VisibleForTesting
    public final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzay().zzd().zzb("Failed to read from channel", e);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i > iZzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                return;
            }
            if (i < iZzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                        return;
                    } catch (IOException e2) {
                        zzay().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
            }
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int iZza;
        int iIndexOf;
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        Set setZzk = zzfiVar.zzk(str);
        if (setZzk != null) {
            zzgcVar.zzi(setZzk);
        }
        zzfi zzfiVar2 = this.zzc;
        zzal(zzfiVar2);
        if (zzfiVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfi zzfiVar3 = this.zzc;
        zzal(zzfiVar3);
        if (zzfiVar3.zzy(str)) {
            if (zzg().zzs(str, zzdu.zzaq)) {
                String strZzar = zzgcVar.zzar();
                if (!TextUtils.isEmpty(strZzar) && (iIndexOf = strZzar.indexOf(".")) != -1) {
                    zzgcVar.zzY(strZzar.substring(0, iIndexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfi zzfiVar4 = this.zzc;
        zzal(zzfiVar4);
        if (zzfiVar4.zzz(str) && (iZza = zzkv.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(iZza);
        }
        zzfi zzfiVar5 = this.zzc;
        zzal(zzfiVar5);
        if (zzfiVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfi zzfiVar6 = this.zzc;
        zzal(zzfiVar6);
        if (zzfiVar6.zzu(str)) {
            zzgcVar.zzn();
            zzks zzksVar = (zzks) this.zzC.get(str);
            if (zzksVar == null) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            } else if (zzg().zzi(str, zzdu.zzR) + zzksVar.zzb < zzav().elapsedRealtime()) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            }
            zzgcVar.zzR(zzksVar.zza);
        }
        zzfi zzfiVar7 = this.zzc;
        zzal(zzfiVar7);
        if (zzfiVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    public final void zzD(zzh zzhVar) {
        C8092zj c8092zj;
        C8092zj c8092zj2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzki zzkiVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzhVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzhVar.zzr();
        }
        C8092zj c8092zj3 = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzdu.zzd.zza(null)).encodedAuthority((String) zzdu.zze.zza(null)).path("config/app/".concat(String.valueOf(strZzy))).appendQueryParameter("platform", "android");
        zzkiVar.zzt.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfi zzfiVar = this.zzc;
            zzal(zzfiVar);
            com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar.zze(str);
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            String strZzh = zzfiVar2.zzh(str);
            if (zzffVarZze == null) {
                c8092zj = c8092zj3;
            } else {
                if (TextUtils.isEmpty(strZzh)) {
                    c8092zj2 = null;
                } else {
                    c8092zj2 = new C8092zj();
                    c8092zj2.put("If-Modified-Since", strZzh);
                }
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    String strZzf = zzfiVar3.zzf(str);
                    if (!TextUtils.isEmpty(strZzf)) {
                        if (c8092zj2 == null) {
                            c8092zj2 = new C8092zj();
                        }
                        c8092zj3 = c8092zj2;
                        c8092zj3.put("If-None-Match", strZzf);
                        c8092zj = c8092zj3;
                    }
                }
                c8092zj = c8092zj2;
            }
            this.zzt = true;
            zzen zzenVar = this.zzd;
            zzal(zzenVar);
            zzkl zzklVar = new zzkl(this);
            zzenVar.zzg();
            zzenVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzklVar);
            zzenVar.zzt.zzaz().zzo(new zzem(zzenVar, str, url, null, c8092zj, zzklVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(zzhVar.zzt()), string);
        }
    }

    public final void zzE(zzaw zzawVar, zzq zzqVar) {
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzaz().zzg();
        zzie zzieVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzieVar = this.zzD;
        }
        zzlb.zzK(zzieVar, zzeiVarZzb.zzd, false);
        zzaw zzawVarZza = zzeiVarZzb.zza();
        zzal(this.zzi);
        if (zzkv.zzA(zzawVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list != null) {
                if (!list.contains(zzawVarZza.zza)) {
                    zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzawVarZza.zza, zzawVarZza.zzc);
                    return;
                } else {
                    Bundle bundleZzc = zzawVarZza.zzb.zzc();
                    bundleZzc.putLong("ga_safelisted", 1L);
                    zzawVarZza = new zzaw(zzawVarZza.zza, new zzau(bundleZzc), zzawVarZza.zzc, zzawVarZza.zzd);
                }
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j < 0) {
                    zzamVar2.zzt.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    listZzt = Collections.EMPTY_LIST;
                } else {
                    listZzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar2 = zzacVar.zzg;
                        if (zzawVar2 != null) {
                            zzY(new zzaw(zzawVar2, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzt.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    listZzt2 = Collections.EMPTY_LIST;
                } else {
                    listZzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar3 = zzacVar2.zzk;
                        if (zzawVar3 != null) {
                            arrayList.add(zzawVar3);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVarZza.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzt.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    listZzt3 = Collections.EMPTY_LIST;
                } else {
                    listZzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzkw zzkwVar = zzacVar3.zzc;
                        zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzkwVar.zzb, j, Preconditions.checkNotNull(zzkwVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzkyVar)) {
                            zzay().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzeh.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        }
                        zzaw zzawVar4 = zzacVar3.zzi;
                        if (zzawVar4 != null) {
                            arrayList2.add(zzawVar4);
                        }
                        zzacVar3.zzc = new zzkw(zzkyVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVarZza, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    public final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(str));
            return;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        zzG(zzawVar, new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    public final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzlb zzlbVarZzv = zzv();
        Bundle bundle = zzeiVarZzb.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzlbVarZzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzeiVarZzb, zzg().zzd(zzqVar.zza));
        zzaw zzawVarZza = zzeiVarZzb.zza();
        if ("_cmp".equals(zzawVarZza.zza) && "referrer API v2".equals(zzawVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzawVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzkw("_lgclid", zzawVarZza.zzd, strZzg, "auto"), zzqVar);
            }
        }
        zzE(zzawVarZza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r10
      0x0047: PHI (r10v11 int) = (r10v2 int), (r10v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    @VisibleForTesting
    public final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzae();
                throw th2;
            }
        }
        zzef zzefVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzefVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzhVarZzj = zzamVar2.zzj(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (zzhVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(str));
            } else if (z || i == 404) {
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    List list2 = map != null ? (List) map.get("ETag") : null;
                    if (list2 == null || list2.isEmpty()) {
                        str2 = null;
                    } else {
                        str2 = (String) list2.get(0);
                    }
                } else {
                    str2 = null;
                }
                if (i == 404 || i == 304) {
                    zzfi zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    if (zzfiVar.zze(str) == null) {
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        zzfiVar2.zzt(str, null, null, null);
                    }
                } else {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    zzfiVar3.zzt(str, bArr, str3, str2);
                }
                zzhVarZzj.zzL(zzav().currentTimeMillis());
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzD(zzhVarZzj);
                if (i == 404) {
                    zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                } else {
                    zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                }
                zzen zzenVar = this.zzd;
                zzal(zzenVar);
                if (zzenVar.zza() && zzai()) {
                    zzX();
                } else {
                    zzag();
                }
            } else {
                zzhVarZzj.zzU(zzav().currentTimeMillis());
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzD(zzhVarZzj);
                zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzfi zzfiVar4 = this.zzc;
                zzal(zzfiVar4);
                zzfiVar4.zzl(str);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i == 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzag();
            }
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzC();
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
            this.zzt = false;
            zzae();
        } catch (Throwable th3) {
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzx();
            throw th3;
        }
    }

    public final void zzJ(boolean z) {
        zzag();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #2 {all -> 0x00a1, blocks: (B:15:0x0062, B:16:0x0066, B:18:0x006c, B:19:0x0072, B:20:0x008d, B:23:0x0099, B:24:0x00a0, B:28:0x00a4, B:29:0x00b3, B:31:0x00b5, B:33:0x00b9, B:36:0x00c0, B:37:0x00c1), top: B:62:0x0062, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[Catch: all -> 0x0010, SQLiteException -> 0x00e8, TryCatch #0 {SQLiteException -> 0x00e8, blocks: (B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc), top: B:60:0x0029, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x0010, PHI: r8
      0x0128: PHI (r8v18 int) = (r8v2 int), (r8v0 int) binds: [B:13:0x0027, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0128, B:55:0x015f, B:54:0x0150, B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc, B:49:0x00fd), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[Catch: all -> 0x0010, TryCatch #1 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0128, B:55:0x015f, B:54:0x0150, B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc, B:49:0x00fd), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0098 A[SYNTHETIC] */
    @VisibleForTesting
    public final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzen zzenVar;
        zzam zzamVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzae();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i == 200) {
            if (th == null) {
                try {
                    this.zzk.zzc.zzb(zzav().currentTimeMillis());
                    this.zzk.zzd.zzb(0L);
                    zzag();
                    zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                jLongValue = l.longValue();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    zzamVar.zzt.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                List list2 = this.zzz;
                                if (list2 == null || !list2.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzC();
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzx();
                        this.zzz = null;
                        zzenVar = this.zzd;
                        zzal(zzenVar);
                        if (zzenVar.zza() || !zzai()) {
                            this.zzA = -1L;
                            zzag();
                        } else {
                            zzX();
                        }
                        this.zza = 0L;
                    } catch (Throwable th3) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    this.zza = zzav().elapsedRealtime();
                    zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzy(list);
                zzag();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzw();
                while (r8.hasNext()) {
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    jLongValue = l.longValue();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
                this.zzz = null;
                zzenVar = this.zzd;
                zzal(zzenVar);
                if (zzenVar.zza()) {
                    this.zzA = -1L;
                    zzag();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                } else {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzy(list);
                zzag();
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            } else {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzamVar11.zzy(list);
            zzag();
        }
        this.zzu = false;
        zzae();
    }

    /* JADX WARN: Code duplicated, block: B:132:0x03f1 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x041d A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0457 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x045f A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0465 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0472  */
    /* JADX WARN: Code duplicated, block: B:150:0x0478 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0484 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x048a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0494  */
    /* JADX WARN: Code duplicated, block: B:157:0x0497  */
    /* JADX WARN: Code duplicated, block: B:160:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x04d2 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04da A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x04e8 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x04f1 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0506 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0536 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x054d A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0551 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0203 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020e A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x021a  */
    /* JADX WARN: Code duplicated, block: B:73:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0239  */
    /* JADX WARN: Code duplicated, block: B:83:0x023d A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0261 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0270 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0280 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:23:0x00a5, B:25:0x00b4, B:45:0x010b, B:47:0x011e, B:49:0x0136, B:50:0x015d, B:52:0x01b5, B:54:0x01c0, B:59:0x01cf, B:67:0x0203, B:69:0x020e, B:74:0x0221, B:77:0x022f, B:81:0x023a, B:83:0x023d, B:84:0x025c, B:86:0x0261, B:89:0x0280, B:93:0x0293, B:95:0x02bd, B:98:0x02c7, B:100:0x02d6, B:130:0x03c5, B:132:0x03f1, B:133:0x03f4, B:135:0x041d, B:175:0x04f1, B:176:0x04f4, B:184:0x0569, B:137:0x0432, B:142:0x0457, B:144:0x045f, B:146:0x0465, B:150:0x0478, B:154:0x048d, B:158:0x0499, B:161:0x04ae, B:166:0x04d2, B:168:0x04da, B:170:0x04e2, B:172:0x04e8, B:164:0x04bf, B:152:0x0484, B:140:0x0443, B:101:0x02e9, B:103:0x0316, B:104:0x0327, B:106:0x032e, B:108:0x0334, B:110:0x033e, B:112:0x0344, B:114:0x034a, B:116:0x0350, B:117:0x0355, B:123:0x037d, B:126:0x0382, B:127:0x0396, B:128:0x03a6, B:129:0x03b6, B:177:0x0506, B:179:0x0536, B:180:0x0539, B:181:0x054d, B:183:0x0551, B:87:0x0270, B:63:0x01e7, B:31:0x00c5, B:33:0x00c9, B:37:0x00da, B:39:0x00eb, B:41:0x00f5, B:44:0x00fd), top: B:190:0x00a5, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c3  */
    public final void zzL(zzq zzqVar) {
        long j;
        long j2;
        int i;
        zzas zzasVarZzn;
        boolean z;
        long j3;
        Bundle bundle;
        zzez zzezVar;
        String str;
        long j4;
        Bundle bundle2;
        long j5;
        String str2;
        long jZzc;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j6;
        long j7;
        long j8;
        boolean z2;
        long j9;
        long j10;
        boolean z3;
        String strZzw;
        boolean z4;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
            if (zzhVarZzj != null && TextUtils.isEmpty(zzhVarZzj.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzhVarZzj.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzhVarZzj);
                zzfi zzfiVar = this.zzc;
                zzal(zzfiVar);
                zzfiVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long jCurrentTimeMillis = zzqVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            long j11 = jCurrentTimeMillis;
            this.zzn.zzg().zzd();
            int i2 = zzqVar.zzn;
            if (i2 != 0 && i2 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzqVar.zza), Integer.valueOf(i2));
                i2 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzky zzkyVarZzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzkyVarZzp != null && !"auto".equals(zzkyVarZzp.zzb)) {
                    j = 1;
                } else if (zzqVar.zzr != null) {
                    j = 1;
                    zzkw zzkwVar = new zzkw("_npa", j11, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzkyVarZzp == null || !zzkyVarZzp.zze.equals(zzkwVar.zzd)) {
                        zzW(zzkwVar, zzqVar);
                    }
                } else {
                    j = 1;
                    if (zzkyVarZzp != null) {
                        zzP(new zzkw("_npa", j11, null, "auto"), zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzhVarZzj2 != null) {
                    j2 = j;
                    if (zzv().zzam(zzqVar.zzb, zzhVarZzj2.zzy(), zzqVar.zzq, zzhVarZzj2.zzr())) {
                        zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(zzhVarZzj2.zzt()));
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        String strZzt = zzhVarZzj2.zzt();
                        zzamVar6.zzW();
                        zzamVar6.zzg();
                        Preconditions.checkNotEmpty(strZzt);
                        try {
                            SQLiteDatabase sQLiteDatabaseZzh = zzamVar6.zzh();
                            String[] strArr = {strZzt};
                            int iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                            zzoi.zzc();
                            i = i2;
                            try {
                                int iDelete2 = zzamVar6.zzt.zzf().zzs(null, zzdu.zzat) ? iDelete + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr) : iDelete;
                                if (iDelete2 > 0) {
                                    zzamVar6.zzt.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete2));
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                zzamVar6.zzt.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(strZzt), e);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            i = i2;
                        }
                        zzhVarZzj2 = null;
                    }
                    if (zzhVarZzj2 != null) {
                        if (zzhVarZzj2.zzb() != -2147483648L) {
                            j10 = -2147483648L;
                            z3 = zzhVarZzj2.zzb() != zzqVar.zzj;
                            strZzw = zzhVarZzj2.zzw();
                            if (zzhVarZzj2.zzb() == j10 || strZzw == null || strZzw.equals(zzqVar.zzc)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z3 | z4) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("_pv", strZzw);
                                zzaw zzawVar = new zzaw("_au", new zzau(bundle3), "auto", j11);
                                j11 = j11;
                                zzE(zzawVar, zzqVar);
                            }
                        } else {
                            j10 = -2147483648L;
                        }
                        strZzw = zzhVarZzj2.zzw();
                        if (zzhVarZzj2.zzb() == j10) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z3 | z4) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("_pv", strZzw);
                            zzaw zzawVar2 = new zzaw("_au", new zzau(bundle4), "auto", j11);
                            j11 = j11;
                            zzE(zzawVar2, zzqVar);
                        }
                    }
                    zzd(zzqVar);
                    if (i == 0) {
                        zzam zzamVar7 = this.zze;
                        zzal(zzamVar7);
                        zzasVarZzn = zzamVar7.zzn(zzqVar.zza, "_f");
                        z = false;
                    } else {
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        zzasVarZzn = zzamVar8.zzn(zzqVar.zza, "_v");
                        z = true;
                    }
                    if (zzasVarZzn == null) {
                        j3 = ((j11 / 3600000) + j2) * 3600000;
                        if (z) {
                            zzW(new zzkw("_fvt", j11, Long.valueOf(j3), "auto"), zzqVar);
                            zzaz().zzg();
                            zzB();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle.putLong("_dac", 1L);
                            }
                            zzG(new zzaw("_v", new zzau(bundle), "auto", j11), zzqVar);
                        } else {
                            zzW(new zzkw("_fot", j11, Long.valueOf(j3), "auto"), zzqVar);
                            zzaz().zzg();
                            zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                            str = zzqVar.zza;
                            if (str != null || str.isEmpty()) {
                                j4 = j11;
                                zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                zzezVar.zza.zzaz().zzg();
                                if (zzezVar.zza()) {
                                    zzey zzeyVar = new zzey(zzezVar, str);
                                    zzezVar.zza.zzaz().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    j4 = j11;
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzezVar.zza.zzau().getPackageManager();
                                    if (packageManager == null) {
                                        zzezVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                            zzezVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str3 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str3) && zzezVar.zza()) {
                                                    try {
                                                        zzezVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzezVar.zza.zzau(), new Intent(intent), zzeyVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e3) {
                                                        zzezVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e3.getMessage());
                                                    }
                                                } else {
                                                    zzezVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzezVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                                    j4 = j11;
                                }
                            }
                            zzaz().zzg();
                            zzB();
                            bundle2 = new Bundle();
                            j5 = j2;
                            bundle2.putLong("_c", j5);
                            bundle2.putLong("_r", j5);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j5);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", j5);
                            }
                            str2 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar9 = this.zze;
                            zzal(zzamVar9);
                            Preconditions.checkNotEmpty(str2);
                            zzamVar9.zzg();
                            zzamVar9.zzW();
                            jZzc = zzamVar9.zzc(str2, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() == null) {
                                zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str2));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str2, 0);
                                } catch (PackageManager.NameNotFoundException e4) {
                                    zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(str2), e4);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    j7 = packageInfo.firstInstallTime;
                                    if (j7 != 0) {
                                        if (j7 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzdu.zzab)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jZzc == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                j8 = 0;
                                            }
                                            j8 = jZzc;
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            j8 = jZzc;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        Long lValueOf = Long.valueOf(j9);
                                        long j12 = j4;
                                        j4 = j12;
                                        zzW(new zzkw("_fi", j12, lValueOf, "auto"), zzqVar);
                                        jZzc = j8;
                                    } else {
                                        applicationInfo = null;
                                    }
                                } else {
                                    applicationInfo = null;
                                }
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str2, 0);
                                } catch (PackageManager.NameNotFoundException e5) {
                                    zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(str2), e5);
                                }
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        j6 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j6 = 1;
                                    }
                                    if ((applicationInfo.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                        bundle2.putLong("_sysu", j6);
                                    }
                                }
                            }
                            if (jZzc >= 0) {
                                bundle2.putLong("_pfo", jZzc);
                            }
                            zzG(new zzaw("_f", new zzau(bundle2), "auto", j4), zzqVar);
                        }
                    } else if (zzqVar.zzi) {
                        zzG(new zzaw("_cd", new zzau(new Bundle()), "auto", j11), zzqVar);
                    }
                    zzam zzamVar10 = this.zze;
                    zzal(zzamVar10);
                    zzamVar10.zzC();
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzx();
                }
                j2 = j;
                i = i2;
                if (zzhVarZzj2 != null) {
                    if (zzhVarZzj2.zzb() != -2147483648L) {
                        j10 = -2147483648L;
                        if (zzhVarZzj2.zzb() != zzqVar.zzj) {
                        }
                        strZzw = zzhVarZzj2.zzw();
                        if (zzhVarZzj2.zzb() == j10) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z3 | z4) {
                            Bundle bundle5 = new Bundle();
                            bundle5.putString("_pv", strZzw);
                            zzaw zzawVar3 = new zzaw("_au", new zzau(bundle5), "auto", j11);
                            j11 = j11;
                            zzE(zzawVar3, zzqVar);
                        }
                    } else {
                        j10 = -2147483648L;
                    }
                    strZzw = zzhVarZzj2.zzw();
                    if (zzhVarZzj2.zzb() == j10) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z3 | z4) {
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("_pv", strZzw);
                        zzaw zzawVar4 = new zzaw("_au", new zzau(bundle6), "auto", j11);
                        j11 = j11;
                        zzE(zzawVar4, zzqVar);
                    }
                }
                zzd(zzqVar);
                if (i == 0) {
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    zzasVarZzn = zzamVar12.zzn(zzqVar.zza, "_f");
                    z = false;
                } else {
                    zzam zzamVar13 = this.zze;
                    zzal(zzamVar13);
                    zzasVarZzn = zzamVar13.zzn(zzqVar.zza, "_v");
                    z = true;
                }
                if (zzasVarZzn == null) {
                    j3 = ((j11 / 3600000) + j2) * 3600000;
                    if (z) {
                        zzW(new zzkw("_fot", j11, Long.valueOf(j3), "auto"), zzqVar);
                        zzaz().zzg();
                        zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                        str = zzqVar.zza;
                        if (str != null) {
                            j4 = j11;
                            zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaz().zzg();
                            zzB();
                            bundle2 = new Bundle();
                            j5 = j2;
                            bundle2.putLong("_c", j5);
                            bundle2.putLong("_r", j5);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j5);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", j5);
                            }
                            str2 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar14 = this.zze;
                            zzal(zzamVar14);
                            Preconditions.checkNotEmpty(str2);
                            zzamVar14.zzg();
                            zzamVar14.zzW();
                            jZzc = zzamVar14.zzc(str2, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() == null) {
                                zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str2));
                            } else {
                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str2, 0);
                                if (packageInfo != null) {
                                    j7 = packageInfo.firstInstallTime;
                                    if (j7 != 0) {
                                        if (j7 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzdu.zzab)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jZzc == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                j8 = 0;
                                            }
                                            j8 = jZzc;
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            j8 = jZzc;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        Long lValueOf2 = Long.valueOf(j9);
                                        long j13 = j4;
                                        j4 = j13;
                                        zzW(new zzkw("_fi", j13, lValueOf2, "auto"), zzqVar);
                                        jZzc = j8;
                                    } else {
                                        applicationInfo = null;
                                    }
                                } else {
                                    applicationInfo = null;
                                }
                                applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str2, 0);
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        j6 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j6 = 1;
                                    }
                                    if ((applicationInfo.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                        bundle2.putLong("_sysu", j6);
                                    }
                                }
                            }
                            if (jZzc >= 0) {
                                bundle2.putLong("_pfo", jZzc);
                            }
                            zzG(new zzaw("_f", new zzau(bundle2), "auto", j4), zzqVar);
                        } else {
                            j4 = j11;
                            zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaz().zzg();
                            zzB();
                            bundle2 = new Bundle();
                            j5 = j2;
                            bundle2.putLong("_c", j5);
                            bundle2.putLong("_r", j5);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j5);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", j5);
                            }
                            str2 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar15 = this.zze;
                            zzal(zzamVar15);
                            Preconditions.checkNotEmpty(str2);
                            zzamVar15.zzg();
                            zzamVar15.zzW();
                            jZzc = zzamVar15.zzc(str2, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() == null) {
                                zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str2));
                            } else {
                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str2, 0);
                                if (packageInfo != null) {
                                    j7 = packageInfo.firstInstallTime;
                                    if (j7 != 0) {
                                        if (j7 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzdu.zzab)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jZzc == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                j8 = 0;
                                            }
                                            j8 = jZzc;
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            j8 = jZzc;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        Long lValueOf3 = Long.valueOf(j9);
                                        long j14 = j4;
                                        j4 = j14;
                                        zzW(new zzkw("_fi", j14, lValueOf3, "auto"), zzqVar);
                                        jZzc = j8;
                                    } else {
                                        applicationInfo = null;
                                    }
                                } else {
                                    applicationInfo = null;
                                }
                                applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str2, 0);
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        j6 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j6 = 1;
                                    }
                                    if ((applicationInfo.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                        bundle2.putLong("_sysu", j6);
                                    }
                                }
                            }
                            if (jZzc >= 0) {
                                bundle2.putLong("_pfo", jZzc);
                            }
                            zzG(new zzaw("_f", new zzau(bundle2), "auto", j4), zzqVar);
                        }
                    } else {
                        zzW(new zzkw("_fvt", j11, Long.valueOf(j3), "auto"), zzqVar);
                        zzaz().zzg();
                        zzB();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle.putLong("_dac", 1L);
                        }
                        zzG(new zzaw("_v", new zzau(bundle), "auto", j11), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    zzG(new zzaw("_cd", new zzau(new Bundle()), "auto", j11), zzqVar);
                }
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzC();
                zzam zzamVar17 = this.zze;
                zzal(zzamVar17);
                zzamVar17.zzx();
            } catch (Throwable th) {
                zzam zzamVar18 = this.zze;
                zzal(zzamVar18);
                zzamVar18.zzx();
                throw th;
            }
        }
    }

    public final void zzM() {
        this.zzr++;
    }

    public final void zzN(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeh.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzP(zzkw zzkwVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzkwVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzkw("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzkwVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzkwVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzkwVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzkwVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    @VisibleForTesting
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzamVar.zzt.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzie zzieVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzieVar != null) {
            this.zzE = str;
            this.zzD = zzieVar;
        }
    }

    public final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    public final void zzT(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    public final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzkw zzkwVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar.zzb, zzacVarZzk.zzc.zzc, zzkwVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzkw zzkwVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar2.zzb, zzacVar2.zzd, zzkwVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzkw zzkwVar3 = zzacVar2.zzc;
                    zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzkwVar3.zzb, zzkwVar3.zzc, Preconditions.checkNotNull(zzkwVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzkyVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    public final void zzW(zzkw zzkwVar, zzq zzqVar) {
        zzas zzasVarZzn;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int iZzl = zzv().zzl(zzkwVar.zzb);
            int length = 0;
            if (iZzl != 0) {
                zzlb zzlbVarZzv = zzv();
                String str = zzkwVar.zzb;
                zzg();
                String strZzD = zzlbVarZzv.zzD(str, 24, true);
                String str2 = zzkwVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, iZzl, "_ev", strZzD, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzkwVar.zzb, zzkwVar.zza());
            if (iZzd != 0) {
                zzlb zzlbVarZzv2 = zzv();
                String str3 = zzkwVar.zzb;
                zzg();
                String strZzD2 = zzlbVarZzv2.zzD(str3, 24, true);
                Object objZza = zzkwVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzv().zzN(this.zzF, zzqVar.zza, iZzd, "_ev", strZzD2, length);
                return;
            }
            Object objZzB = zzv().zzB(zzkwVar.zzb, zzkwVar.zza());
            if (objZzB == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.zzb)) {
                long j = zzkwVar.zzc;
                String str4 = zzkwVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzky zzkyVarZzp = zzamVar.zzp(str5, "_sno");
                if (zzkyVarZzp != null) {
                    Object obj = zzkyVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzkyVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkyVarZzp.zze);
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzasVarZzn = zzamVar2.zzn(str5, "_s");
                        if (zzasVarZzn != null) {
                            jLongValue = zzasVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (zzkyVarZzp != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkyVarZzp.zze);
                    }
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzasVarZzn = zzamVar3.zzn(str5, "_s");
                    if (zzasVarZzn != null) {
                        jLongValue = zzasVarZzn.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                zzW(new zzkw("_sno", j, Long.valueOf(jLongValue + 1), str4), zzqVar);
            }
            zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzkwVar.zzf), zzkwVar.zzb, zzkwVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzkyVar.zzc), objZzB);
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzamVar4.zzw();
            try {
                if ("_id".equals(zzkyVar.zzc)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzky zzkyVarZzp2 = zzamVar5.zzp(zzqVar.zza, "_id");
                    if (zzkyVarZzp2 != null && !zzkyVar.zze.equals(zzkyVarZzp2.zze)) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                boolean zZzL = zzamVar7.zzL(zzkyVar);
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020c A[Catch: all -> 0x01a3, SQLiteException -> 0x01f9, TryCatch #1 {all -> 0x01a3, blocks: (B:77:0x0194, B:79:0x019a, B:87:0x01af, B:88:0x01b5, B:89:0x01b9, B:91:0x01bf, B:92:0x01c6, B:93:0x01db, B:95:0x01e1, B:96:0x01eb, B:98:0x01f1, B:104:0x01fb, B:106:0x0206, B:108:0x020c, B:109:0x0213, B:112:0x022a), top: B:265:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:135:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02bf A[Catch: all -> 0x0293, TRY_ENTER, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x02c8 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02d4 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02de A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0301 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x0316 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0344 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0353  */
    /* JADX WARN: Code duplicated, block: B:183:0x0378 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0387  */
    /* JADX WARN: Code duplicated, block: B:189:0x038b A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x03c3 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c8 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03d0 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x03d8 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x03e7 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0412 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0423  */
    /* JADX WARN: Code duplicated, block: B:209:0x0446 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x047b A[Catch: all -> 0x0293, TRY_LEAVE, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0496 A[Catch: all -> 0x0293, MalformedURLException -> 0x0503, TryCatch #4 {MalformedURLException -> 0x0503, blocks: (B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4), top: B:267:0x0484, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x04a4 A[Catch: all -> 0x0293, MalformedURLException -> 0x0503, TryCatch #4 {MalformedURLException -> 0x0503, blocks: (B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4), top: B:267:0x0484, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x04b6 A[Catch: all -> 0x0293, MalformedURLException -> 0x0503, TryCatch #4 {MalformedURLException -> 0x0503, blocks: (B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4), top: B:267:0x0484, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0519 A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x058d A[Catch: all -> 0x0293, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x0598 A[Catch: all -> 0x0293, TRY_LEAVE, TryCatch #15 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:67:0x013a, B:71:0x0162, B:75:0x016a, B:153:0x02c2, B:155:0x02c8, B:157:0x02d4, B:158:0x02d8, B:160:0x02de, B:162:0x02f2, B:166:0x02fb, B:168:0x0301, B:174:0x0326, B:171:0x0316, B:173:0x0320, B:175:0x0329, B:177:0x0344, B:181:0x0354, B:183:0x0378, B:189:0x038b, B:191:0x03c3, B:193:0x03c8, B:195:0x03d0, B:196:0x03d3, B:198:0x03d8, B:199:0x03db, B:201:0x03e7, B:202:0x03fd, B:203:0x0403, B:205:0x0412, B:207:0x0424, B:209:0x0446, B:211:0x0484, B:213:0x0496, B:215:0x04ab, B:217:0x04b6, B:218:0x04bf, B:214:0x04a4, B:220:0x0503, B:210:0x047b, B:138:0x028e, B:224:0x0519, B:225:0x051c, B:152:0x02bf, B:226:0x051d, B:231:0x055a, B:251:0x0587, B:253:0x058d, B:255:0x0598, B:239:0x0568, B:259:0x05a3, B:260:0x05a6), top: B:278:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[LOOP:1: B:158:0x02d8->B:299:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x028e A[ADDED_TO_REGION, EDGE_INSN: B:307:0x028e->B:138:0x028e BREAK  A[LOOP:4: B:88:0x01b5->B:137:0x0286], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x01e1 A[EDGE_INSN: B:311:0x01e1->B:95:0x01e1 BREAK  A[LOOP:5: B:93:0x01db->B:118:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0136 A[Catch: all -> 0x0034, TryCatch #8 {all -> 0x0034, blocks: (B:5:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:37:0x00c9, B:43:0x00f7, B:47:0x010c, B:63:0x0131, B:65:0x0136, B:66:0x0139, B:80:0x019c), top: B:269:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a A[Catch: all -> 0x01a3, SQLiteException -> 0x01a8, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:77:0x0194, B:79:0x019a, B:87:0x01af, B:88:0x01b5, B:89:0x01b9, B:91:0x01bf, B:92:0x01c6, B:93:0x01db, B:95:0x01e1, B:96:0x01eb, B:98:0x01f1, B:104:0x01fb, B:106:0x0206, B:108:0x020c, B:109:0x0213, B:112:0x022a), top: B:265:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01af A[Catch: all -> 0x01a3, SQLiteException -> 0x01a8, TRY_ENTER, TryCatch #1 {all -> 0x01a3, blocks: (B:77:0x0194, B:79:0x019a, B:87:0x01af, B:88:0x01b5, B:89:0x01b9, B:91:0x01bf, B:92:0x01c6, B:93:0x01db, B:95:0x01e1, B:96:0x01eb, B:98:0x01f1, B:104:0x01fb, B:106:0x0206, B:108:0x020c, B:109:0x0213, B:112:0x022a), top: B:265:0x0194 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:209:0x0446, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x056c: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:1389), block:B:241:0x056c */
    public final void zzX() {
        boolean z;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursorRawQuery;
        String string;
        zzh zzhVarZzj;
        int iZze;
        int iMax;
        zzam zzamVar;
        boolean z2;
        boolean z3;
        Cursor cursor3;
        int i;
        Cursor cursor4;
        List listSubList;
        com.google.android.gms.internal.measurement.zzga zzgaVarZza;
        int size;
        ArrayList arrayList;
        int i2;
        boolean zZzi;
        boolean zZzi2;
        int i3;
        int i4;
        String strZzm;
        String strZzi;
        String string2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        Iterator it;
        String strZzJ;
        int i5;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar2;
        Cursor cursorQuery;
        Cursor cursor5;
        ArrayList arrayList2;
        int length;
        long j;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i6;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        Cursor cursorRawQuery2;
        zzaz().zzg();
        zzB();
        int i7 = 1;
        this.zzv = true;
        int i8 = 0;
        try {
            this.zzn.zzaw();
            Boolean boolZzj = this.zzn.zzt().zzj();
            try {
                if (boolZzj == null) {
                    zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                    this.zzv = false;
                } else if (boolZzj.booleanValue()) {
                    zzay().zzd().zza("Upload called in the client side when service should be used");
                    this.zzv = false;
                } else if (this.zza > 0) {
                    zzag();
                    this.zzv = false;
                } else {
                    zzaz().zzg();
                    if (this.zzy != null) {
                        zzay().zzj().zza("Uploading requested multiple times");
                        this.zzv = false;
                    } else {
                        zzen zzenVar = this.zzd;
                        zzal(zzenVar);
                        if (zzenVar.zza()) {
                            long jCurrentTimeMillis = zzav().currentTimeMillis();
                            Cursor cursor6 = null;
                            int iZze2 = zzg().zze(null, zzdu.zzP);
                            zzg();
                            long jZzz = jCurrentTimeMillis - zzag.zzz();
                            for (int i9 = 0; i9 < iZze2 && zzah(null, jZzz); i9++) {
                            }
                            long jZza = this.zzk.zzc.zza();
                            if (jZza != 0) {
                                zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                            }
                            zzam zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            String strZzr = zzamVar2.zzr();
                            long j2 = -1;
                            if (TextUtils.isEmpty(strZzr)) {
                                try {
                                    this.zzA = -1L;
                                    zzam zzamVar3 = this.zze;
                                    zzal(zzamVar3);
                                    zzg();
                                    long jZzz2 = jCurrentTimeMillis - zzag.zzz();
                                    zzamVar3.zzg();
                                    zzamVar3.zzW();
                                    try {
                                        cursorRawQuery = zzamVar3.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz2)});
                                        try {
                                            if (cursorRawQuery.moveToFirst()) {
                                                string = cursorRawQuery.getString(0);
                                                cursorRawQuery.close();
                                            } else {
                                                zzamVar3.zzt.zzay().zzj().zza("No expired configs for apps with pending events");
                                                cursorRawQuery.close();
                                                string = null;
                                            }
                                        } catch (SQLiteException e) {
                                            e = e;
                                            zzamVar3.zzt.zzay().zzd().zzb("Error selecting expired configs", e);
                                            if (cursorRawQuery != null) {
                                            }
                                            string = null;
                                            if (!TextUtils.isEmpty(string)) {
                                                zzam zzamVar4 = this.zze;
                                                zzal(zzamVar4);
                                                zzhVarZzj = zzamVar4.zzj(string);
                                                if (zzhVarZzj != null) {
                                                    zzD(zzhVarZzj);
                                                }
                                            }
                                            this.zzv = false;
                                            zzae();
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursorRawQuery = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = null;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                    if (!TextUtils.isEmpty(string)) {
                                        zzam zzamVar5 = this.zze;
                                        zzal(zzamVar5);
                                        zzhVarZzj = zzamVar5.zzj(string);
                                        if (zzhVarZzj != null) {
                                            zzD(zzhVarZzj);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                }
                            } else {
                                if (this.zzA == -1) {
                                    zzam zzamVar6 = this.zze;
                                    zzal(zzamVar6);
                                    try {
                                        cursorRawQuery2 = zzamVar6.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursorRawQuery2.moveToFirst()) {
                                                    j2 = cursorRawQuery2.getLong(0);
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                zzamVar6.zzt.zzay().zzd().zzb("Error querying raw events", e);
                                                if (cursorRawQuery2 != null) {
                                                }
                                                this.zzA = j2;
                                                iZze = zzg().zze(strZzr, zzdu.zzf);
                                                iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                                zzamVar = this.zze;
                                                zzal(zzamVar);
                                                zzamVar.zzg();
                                                zzamVar.zzW();
                                                if (iZze > 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                Preconditions.checkArgument(z2);
                                                if (iMax > 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                Preconditions.checkArgument(z3);
                                                Preconditions.checkNotEmpty(strZzr);
                                                cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                                try {
                                                    try {
                                                        if (cursorQuery.moveToFirst()) {
                                                            arrayList2 = new ArrayList();
                                                            length = 0;
                                                            while (true) {
                                                                j = cursorQuery.getLong(i8);
                                                                try {
                                                                    byte[] blob = cursorQuery.getBlob(i7);
                                                                    i = i7;
                                                                    try {
                                                                        try {
                                                                            zzkv zzkvVar = zzamVar.zzf.zzi;
                                                                            zzal(zzkvVar);
                                                                            try {
                                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                                                bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                                                                while (true) {
                                                                                    i6 = gZIPInputStream.read(bArr);
                                                                                    if (i6 <= 0) {
                                                                                        break;
                                                                                    }
                                                                                    cursor5 = cursorQuery;
                                                                                    try {
                                                                                        byteArrayOutputStream.write(bArr, 0, i6);
                                                                                        cursorQuery = cursor5;
                                                                                    } catch (IOException e4) {
                                                                                        e = e4;
                                                                                    }
                                                                                }
                                                                                gZIPInputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                byteArray = byteArrayOutputStream.toByteArray();
                                                                                if (arrayList2.isEmpty()) {
                                                                                }
                                                                                try {
                                                                                    zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                                                                    if (!cursorQuery.isNull(2)) {
                                                                                        zzgcVar2.zzaf(cursorQuery.getInt(2));
                                                                                    }
                                                                                    length += byteArray.length;
                                                                                    arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC(), Long.valueOf(j)));
                                                                                } catch (IOException e5) {
                                                                                    zzamVar.zzt.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeh.zzn(strZzr), e5);
                                                                                }
                                                                                cursor5 = cursorQuery;
                                                                            } catch (IOException e6) {
                                                                                e = e6;
                                                                                cursor5 = cursorQuery;
                                                                            }
                                                                        } catch (SQLiteException e7) {
                                                                            e = e7;
                                                                            cursor5 = cursorQuery;
                                                                            cursor4 = cursor5;
                                                                            try {
                                                                                zzamVar.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(strZzr), e);
                                                                                listSubList = Collections.EMPTY_LIST;
                                                                                if (cursor4 != null) {
                                                                                    cursor4.close();
                                                                                }
                                                                                if (!listSubList.isEmpty()) {
                                                                                    if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                                        it = listSubList.iterator();
                                                                                        while (true) {
                                                                                            if (!it.hasNext()) {
                                                                                                strZzJ = null;
                                                                                                break;
                                                                                            }
                                                                                            zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                                                            if (!zzgdVar2.zzJ().isEmpty()) {
                                                                                                strZzJ = zzgdVar2.zzJ();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (strZzJ != null) {
                                                                                            for (i5 = 0; i5 < listSubList.size(); i5++) {
                                                                                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i5)).first;
                                                                                                if (zzgdVar.zzJ().isEmpty()) {
                                                                                                    listSubList = listSubList.subList(0, i5);
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                                                    size = listSubList.size();
                                                                                    arrayList = new ArrayList(listSubList.size());
                                                                                    if (zzg().zzt(strZzr)) {
                                                                                        i2 = 0;
                                                                                    } else {
                                                                                        i2 = 0;
                                                                                    }
                                                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                    zzpd.zzc();
                                                                                    if (zzg().zzs(null, zzdu.zzal)) {
                                                                                        i3 = 0;
                                                                                    } else {
                                                                                        i3 = 0;
                                                                                    }
                                                                                    for (i4 = 0; i4 < size; i4++) {
                                                                                        zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i4)).first).zzby();
                                                                                        arrayList.add((Long) ((Pair) listSubList.get(i4)).second);
                                                                                        zzg().zzh();
                                                                                        zzgcVar.zzal(74029L);
                                                                                        zzgcVar.zzak(jCurrentTimeMillis);
                                                                                        this.zzn.zzaw();
                                                                                        zzgcVar.zzag(false);
                                                                                        if (i2 == 0) {
                                                                                            zzgcVar.zzq();
                                                                                        }
                                                                                        if (!zZzi) {
                                                                                            zzgcVar.zzx();
                                                                                            zzgcVar.zzt();
                                                                                        }
                                                                                        if (!zZzi2) {
                                                                                            zzgcVar.zzn();
                                                                                        }
                                                                                        zzC(strZzr, zzgcVar);
                                                                                        if (i3 == 0) {
                                                                                            zzgcVar.zzy();
                                                                                        }
                                                                                        if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                            byte[] bArrZzbu = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                                                            zzkv zzkvVar2 = this.zzi;
                                                                                            zzal(zzkvVar2);
                                                                                            zzgcVar.zzJ(zzkvVar2.zzd(bArrZzbu));
                                                                                        }
                                                                                        zzgaVarZza.zza(zzgcVar);
                                                                                    }
                                                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                        zzkv zzkvVar3 = this.zzi;
                                                                                        zzal(zzkvVar3);
                                                                                        strZzm = zzkvVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                                                    } else {
                                                                                        strZzm = null;
                                                                                    }
                                                                                    zzal(this.zzi);
                                                                                    byte[] bArrZzbu2 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                                                    zzfi zzfiVar = this.zzl.zzf.zzc;
                                                                                    zzal(zzfiVar);
                                                                                    strZzi = zzfiVar.zzi(strZzr);
                                                                                    if (TextUtils.isEmpty(strZzi)) {
                                                                                        string2 = (String) zzdu.zzp.zza(null);
                                                                                    } else {
                                                                                        Uri uri = Uri.parse((String) zzdu.zzp.zza(null));
                                                                                        Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                        builderBuildUpon.authority(strZzi + "." + uri.getAuthority());
                                                                                        string2 = builderBuildUpon.build().toString();
                                                                                    }
                                                                                    try {
                                                                                        URL url = new URL(string2);
                                                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                        if (this.zzy != null) {
                                                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                        } else {
                                                                                            this.zzy = new ArrayList(arrayList);
                                                                                        }
                                                                                        this.zzk.zzd.zzb(jCurrentTimeMillis);
                                                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu2.length), strZzm);
                                                                                        this.zzu = i;
                                                                                        zzen zzenVar2 = this.zzd;
                                                                                        zzal(zzenVar2);
                                                                                        zzkk zzkkVar = new zzkk(this, strZzr);
                                                                                        zzenVar2.zzg();
                                                                                        zzenVar2.zzW();
                                                                                        Preconditions.checkNotNull(url);
                                                                                        Preconditions.checkNotNull(bArrZzbu2);
                                                                                        Preconditions.checkNotNull(zzkkVar);
                                                                                        zzenVar2.zzt.zzaz().zzo(new zzem(zzenVar2, strZzr, url, bArrZzbu2, null, zzkkVar));
                                                                                    } catch (MalformedURLException unused) {
                                                                                        zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(strZzr), string2);
                                                                                    }
                                                                                }
                                                                                this.zzv = false;
                                                                                zzae();
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                cursor3 = cursor4;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (IOException e8) {
                                                                        e = e8;
                                                                        cursor5 = cursorQuery;
                                                                        zzamVar.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(strZzr), e);
                                                                        if (cursor5.moveToNext()) {
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                        cursor5.close();
                                                                        listSubList = arrayList2;
                                                                        if (!listSubList.isEmpty()) {
                                                                            if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                                it = listSubList.iterator();
                                                                                while (true) {
                                                                                    if (!it.hasNext()) {
                                                                                        strZzJ = null;
                                                                                        break;
                                                                                    }
                                                                                    zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                                                    if (!zzgdVar2.zzJ().isEmpty()) {
                                                                                        strZzJ = zzgdVar2.zzJ();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (strZzJ != null) {
                                                                                    while (i5 < listSubList.size()) {
                                                                                        zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i5)).first;
                                                                                        if (zzgdVar.zzJ().isEmpty()) {
                                                                                            listSubList = listSubList.subList(0, i5);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                                            size = listSubList.size();
                                                                            arrayList = new ArrayList(listSubList.size());
                                                                            if (zzg().zzt(strZzr)) {
                                                                                i2 = 0;
                                                                            } else {
                                                                                i2 = 0;
                                                                            }
                                                                            zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                            zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                            zzpd.zzc();
                                                                            if (zzg().zzs(null, zzdu.zzal)) {
                                                                                i3 = 0;
                                                                            } else {
                                                                                i3 = 0;
                                                                            }
                                                                            while (i4 < size) {
                                                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i4)).first).zzby();
                                                                                arrayList.add((Long) ((Pair) listSubList.get(i4)).second);
                                                                                zzg().zzh();
                                                                                zzgcVar.zzal(74029L);
                                                                                zzgcVar.zzak(jCurrentTimeMillis);
                                                                                this.zzn.zzaw();
                                                                                zzgcVar.zzag(false);
                                                                                if (i2 == 0) {
                                                                                    zzgcVar.zzq();
                                                                                }
                                                                                if (!zZzi) {
                                                                                    zzgcVar.zzx();
                                                                                    zzgcVar.zzt();
                                                                                }
                                                                                if (!zZzi2) {
                                                                                    zzgcVar.zzn();
                                                                                }
                                                                                zzC(strZzr, zzgcVar);
                                                                                if (i3 == 0) {
                                                                                    zzgcVar.zzy();
                                                                                }
                                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                    byte[] bArrZzbu3 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                                                    zzkv zzkvVar4 = this.zzi;
                                                                                    zzal(zzkvVar4);
                                                                                    zzgcVar.zzJ(zzkvVar4.zzd(bArrZzbu3));
                                                                                }
                                                                                zzgaVarZza.zza(zzgcVar);
                                                                            }
                                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                zzkv zzkvVar5 = this.zzi;
                                                                                zzal(zzkvVar5);
                                                                                strZzm = zzkvVar5.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                                            } else {
                                                                                strZzm = null;
                                                                            }
                                                                            zzal(this.zzi);
                                                                            byte[] bArrZzbu4 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                                            zzfi zzfiVar2 = this.zzl.zzf.zzc;
                                                                            zzal(zzfiVar2);
                                                                            strZzi = zzfiVar2.zzi(strZzr);
                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                Uri uri2 = Uri.parse((String) zzdu.zzp.zza(null));
                                                                                Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                                builderBuildUpon2.authority(strZzi + "." + uri2.getAuthority());
                                                                                string2 = builderBuildUpon2.build().toString();
                                                                            } else {
                                                                                string2 = (String) zzdu.zzp.zza(null);
                                                                            }
                                                                            URL url2 = new URL(string2);
                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                            if (this.zzy != null) {
                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                            } else {
                                                                                this.zzy = new ArrayList(arrayList);
                                                                            }
                                                                            this.zzk.zzd.zzb(jCurrentTimeMillis);
                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu4.length), strZzm);
                                                                            this.zzu = i;
                                                                            zzen zzenVar3 = this.zzd;
                                                                            zzal(zzenVar3);
                                                                            zzkk zzkkVar2 = new zzkk(this, strZzr);
                                                                            zzenVar3.zzg();
                                                                            zzenVar3.zzW();
                                                                            Preconditions.checkNotNull(url2);
                                                                            Preconditions.checkNotNull(bArrZzbu4);
                                                                            Preconditions.checkNotNull(zzkkVar2);
                                                                            zzenVar3.zzt.zzaz().zzo(new zzem(zzenVar3, strZzr, url2, bArrZzbu4, null, zzkkVar2));
                                                                        }
                                                                        this.zzv = false;
                                                                        zzae();
                                                                    }
                                                                } catch (IOException e9) {
                                                                    e = e9;
                                                                    i = i7;
                                                                }
                                                                try {
                                                                    if (cursor5.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i7 = i;
                                                                    cursorQuery = cursor5;
                                                                    i8 = 0;
                                                                } catch (SQLiteException e10) {
                                                                    e = e10;
                                                                    cursor4 = cursor5;
                                                                    zzamVar.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(strZzr), e);
                                                                    listSubList = Collections.EMPTY_LIST;
                                                                    if (cursor4 != null) {
                                                                        cursor4.close();
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    cursor3 = cursor5;
                                                                    if (cursor3 != null) {
                                                                        cursor3.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            cursor5.close();
                                                            listSubList = arrayList2;
                                                        } else {
                                                            listSubList = Collections.EMPTY_LIST;
                                                            cursorQuery.close();
                                                            i = 1;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        cursor5 = cursorQuery;
                                                    }
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    i = 1;
                                                }
                                                if (!listSubList.isEmpty()) {
                                                    if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                        it = listSubList.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                strZzJ = null;
                                                                break;
                                                            }
                                                            zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                            if (!zzgdVar2.zzJ().isEmpty()) {
                                                                strZzJ = zzgdVar2.zzJ();
                                                                break;
                                                            }
                                                        }
                                                        if (strZzJ != null) {
                                                            while (i5 < listSubList.size()) {
                                                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i5)).first;
                                                                if (zzgdVar.zzJ().isEmpty()) {
                                                                    listSubList = listSubList.subList(0, i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (zzg().zzt(strZzr)) {
                                                        i2 = 0;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                    zzpd.zzc();
                                                    if (zzg().zzs(null, zzdu.zzal)) {
                                                        i3 = 0;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    while (i4 < size) {
                                                        zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i4)).first).zzby();
                                                        arrayList.add((Long) ((Pair) listSubList.get(i4)).second);
                                                        zzg().zzh();
                                                        zzgcVar.zzal(74029L);
                                                        zzgcVar.zzak(jCurrentTimeMillis);
                                                        this.zzn.zzaw();
                                                        zzgcVar.zzag(false);
                                                        if (i2 == 0) {
                                                            zzgcVar.zzq();
                                                        }
                                                        if (!zZzi) {
                                                            zzgcVar.zzx();
                                                            zzgcVar.zzt();
                                                        }
                                                        if (!zZzi2) {
                                                            zzgcVar.zzn();
                                                        }
                                                        zzC(strZzr, zzgcVar);
                                                        if (i3 == 0) {
                                                            zzgcVar.zzy();
                                                        }
                                                        if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                            byte[] bArrZzbu5 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                            zzkv zzkvVar6 = this.zzi;
                                                            zzal(zzkvVar6);
                                                            zzgcVar.zzJ(zzkvVar6.zzd(bArrZzbu5));
                                                        }
                                                        zzgaVarZza.zza(zzgcVar);
                                                    }
                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                        zzkv zzkvVar7 = this.zzi;
                                                        zzal(zzkvVar7);
                                                        strZzm = zzkvVar7.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                    } else {
                                                        strZzm = null;
                                                    }
                                                    zzal(this.zzi);
                                                    byte[] bArrZzbu6 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                    zzfi zzfiVar3 = this.zzl.zzf.zzc;
                                                    zzal(zzfiVar3);
                                                    strZzi = zzfiVar3.zzi(strZzr);
                                                    if (TextUtils.isEmpty(strZzi)) {
                                                        Uri uri3 = Uri.parse((String) zzdu.zzp.zza(null));
                                                        Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                                        builderBuildUpon3.authority(strZzi + "." + uri3.getAuthority());
                                                        string2 = builderBuildUpon3.build().toString();
                                                    } else {
                                                        string2 = (String) zzdu.zzp.zza(null);
                                                    }
                                                    URL url3 = new URL(string2);
                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                    if (this.zzy != null) {
                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                    } else {
                                                        this.zzy = new ArrayList(arrayList);
                                                    }
                                                    this.zzk.zzd.zzb(jCurrentTimeMillis);
                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu6.length), strZzm);
                                                    this.zzu = i;
                                                    zzen zzenVar4 = this.zzd;
                                                    zzal(zzenVar4);
                                                    zzkk zzkkVar3 = new zzkk(this, strZzr);
                                                    zzenVar4.zzg();
                                                    zzenVar4.zzW();
                                                    Preconditions.checkNotNull(url3);
                                                    Preconditions.checkNotNull(bArrZzbu6);
                                                    Preconditions.checkNotNull(zzkkVar3);
                                                    zzenVar4.zzt.zzaz().zzo(new zzem(zzenVar4, strZzr, url3, bArrZzbu6, null, zzkkVar3));
                                                }
                                                this.zzv = false;
                                                zzae();
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cursor6 = cursorRawQuery2;
                                            if (cursor6 != null) {
                                                cursor6.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        cursorRawQuery2 = null;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                    cursorRawQuery2.close();
                                    this.zzA = j2;
                                }
                                iZze = zzg().zze(strZzr, zzdu.zzf);
                                iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                if (iZze > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Preconditions.checkArgument(z2);
                                if (iMax > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Preconditions.checkArgument(z3);
                                Preconditions.checkNotEmpty(strZzr);
                                try {
                                    cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                    if (cursorQuery.moveToFirst()) {
                                        listSubList = Collections.EMPTY_LIST;
                                        cursorQuery.close();
                                        i = 1;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        length = 0;
                                        while (true) {
                                            j = cursorQuery.getLong(i8);
                                            byte[] blob2 = cursorQuery.getBlob(i7);
                                            i = i7;
                                            zzkv zzkvVar8 = zzamVar.zzf.zzi;
                                            zzal(zzkvVar8);
                                            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                            while (true) {
                                                i6 = gZIPInputStream.read(bArr);
                                                if (i6 <= 0) {
                                                    break;
                                                    break;
                                                } else {
                                                    cursor5 = cursorQuery;
                                                    byteArrayOutputStream.write(bArr, 0, i6);
                                                    cursorQuery = cursor5;
                                                }
                                                try {
                                                    zzkvVar8.zzt.zzay().zzd().zzb("Failed to ungzip content", e);
                                                    throw e;
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    zzamVar.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(strZzr), e);
                                                    if (cursor5.moveToNext()) {
                                                        break;
                                                        break;
                                                    } else {
                                                        break;
                                                        break;
                                                    }
                                                    cursor5.close();
                                                    listSubList = arrayList2;
                                                    if (!listSubList.isEmpty()) {
                                                        if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                            it = listSubList.iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    strZzJ = null;
                                                                    break;
                                                                }
                                                                zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                                if (!zzgdVar2.zzJ().isEmpty()) {
                                                                    strZzJ = zzgdVar2.zzJ();
                                                                    break;
                                                                }
                                                            }
                                                            if (strZzJ != null) {
                                                                while (i5 < listSubList.size()) {
                                                                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i5)).first;
                                                                    if (zzgdVar.zzJ().isEmpty()) {
                                                                        listSubList = listSubList.subList(0, i5);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                        size = listSubList.size();
                                                        arrayList = new ArrayList(listSubList.size());
                                                        if (zzg().zzt(strZzr)) {
                                                            i2 = 0;
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                        zzpd.zzc();
                                                        if (zzg().zzs(null, zzdu.zzal)) {
                                                            i3 = 0;
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        while (i4 < size) {
                                                            zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i4)).first).zzby();
                                                            arrayList.add((Long) ((Pair) listSubList.get(i4)).second);
                                                            zzg().zzh();
                                                            zzgcVar.zzal(74029L);
                                                            zzgcVar.zzak(jCurrentTimeMillis);
                                                            this.zzn.zzaw();
                                                            zzgcVar.zzag(false);
                                                            if (i2 == 0) {
                                                                zzgcVar.zzq();
                                                            }
                                                            if (!zZzi) {
                                                                zzgcVar.zzx();
                                                                zzgcVar.zzt();
                                                            }
                                                            if (!zZzi2) {
                                                                zzgcVar.zzn();
                                                            }
                                                            zzC(strZzr, zzgcVar);
                                                            if (i3 == 0) {
                                                                zzgcVar.zzy();
                                                            }
                                                            if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                byte[] bArrZzbu7 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                                zzkv zzkvVar9 = this.zzi;
                                                                zzal(zzkvVar9);
                                                                zzgcVar.zzJ(zzkvVar9.zzd(bArrZzbu7));
                                                            }
                                                            zzgaVarZza.zza(zzgcVar);
                                                        }
                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                            zzkv zzkvVar10 = this.zzi;
                                                            zzal(zzkvVar10);
                                                            strZzm = zzkvVar10.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                        } else {
                                                            strZzm = null;
                                                        }
                                                        zzal(this.zzi);
                                                        byte[] bArrZzbu8 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                        zzfi zzfiVar4 = this.zzl.zzf.zzc;
                                                        zzal(zzfiVar4);
                                                        strZzi = zzfiVar4.zzi(strZzr);
                                                        if (TextUtils.isEmpty(strZzi)) {
                                                            Uri uri4 = Uri.parse((String) zzdu.zzp.zza(null));
                                                            Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                                            builderBuildUpon4.authority(strZzi + "." + uri4.getAuthority());
                                                            string2 = builderBuildUpon4.build().toString();
                                                        } else {
                                                            string2 = (String) zzdu.zzp.zza(null);
                                                        }
                                                        URL url4 = new URL(string2);
                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                        if (this.zzy != null) {
                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                        } else {
                                                            this.zzy = new ArrayList(arrayList);
                                                        }
                                                        this.zzk.zzd.zzb(jCurrentTimeMillis);
                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu8.length), strZzm);
                                                        this.zzu = i;
                                                        zzen zzenVar5 = this.zzd;
                                                        zzal(zzenVar5);
                                                        zzkk zzkkVar4 = new zzkk(this, strZzr);
                                                        zzenVar5.zzg();
                                                        zzenVar5.zzW();
                                                        Preconditions.checkNotNull(url4);
                                                        Preconditions.checkNotNull(bArrZzbu8);
                                                        Preconditions.checkNotNull(zzkkVar4);
                                                        zzenVar5.zzt.zzaz().zzo(new zzem(zzenVar5, strZzr, url4, bArrZzbu8, null, zzkkVar4));
                                                    }
                                                    this.zzv = false;
                                                    zzae();
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream2.close();
                                            byteArray = byteArrayOutputStream.toByteArray();
                                            if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                                cursor5 = cursorQuery;
                                                break;
                                            }
                                            zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                            if (!cursorQuery.isNull(2)) {
                                                zzgcVar2.zzaf(cursorQuery.getInt(2));
                                            }
                                            length += byteArray.length;
                                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC(), Long.valueOf(j)));
                                            cursor5 = cursorQuery;
                                            if (cursor5.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            } else {
                                                i7 = i;
                                                cursorQuery = cursor5;
                                                i8 = 0;
                                            }
                                        }
                                        cursor5.close();
                                        listSubList = arrayList2;
                                    }
                                } catch (SQLiteException e14) {
                                    e = e14;
                                    i = 1;
                                    cursor4 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor3 = null;
                                }
                                if (!listSubList.isEmpty()) {
                                    if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                        it = listSubList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                strZzJ = null;
                                                break;
                                            }
                                            zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                            if (!zzgdVar2.zzJ().isEmpty()) {
                                                strZzJ = zzgdVar2.zzJ();
                                                break;
                                            }
                                        }
                                        if (strZzJ != null) {
                                            while (i5 < listSubList.size()) {
                                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i5)).first;
                                                if (zzgdVar.zzJ().isEmpty() && !zzgdVar.zzJ().equals(strZzJ)) {
                                                    listSubList = listSubList.subList(0, i5);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                    size = listSubList.size();
                                    arrayList = new ArrayList(listSubList.size());
                                    if (zzg().zzt(strZzr) || !zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                        i2 = 0;
                                    } else {
                                        i2 = i;
                                    }
                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                    zzpd.zzc();
                                    if (zzg().zzs(null, zzdu.zzal) || !zzg().zzs(strZzr, zzdu.zzan)) {
                                        i3 = 0;
                                    } else {
                                        i3 = i;
                                    }
                                    while (i4 < size) {
                                        zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listSubList.get(i4)).first).zzby();
                                        arrayList.add((Long) ((Pair) listSubList.get(i4)).second);
                                        zzg().zzh();
                                        zzgcVar.zzal(74029L);
                                        zzgcVar.zzak(jCurrentTimeMillis);
                                        this.zzn.zzaw();
                                        zzgcVar.zzag(false);
                                        if (i2 == 0) {
                                            zzgcVar.zzq();
                                        }
                                        if (!zZzi) {
                                            zzgcVar.zzx();
                                            zzgcVar.zzt();
                                        }
                                        if (!zZzi2) {
                                            zzgcVar.zzn();
                                        }
                                        zzC(strZzr, zzgcVar);
                                        if (i3 == 0) {
                                            zzgcVar.zzy();
                                        }
                                        if (zzg().zzs(strZzr, zzdu.zzT)) {
                                            byte[] bArrZzbu9 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                            zzkv zzkvVar11 = this.zzi;
                                            zzal(zzkvVar11);
                                            zzgcVar.zzJ(zzkvVar11.zzd(bArrZzbu9));
                                        }
                                        zzgaVarZza.zza(zzgcVar);
                                    }
                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                        zzkv zzkvVar12 = this.zzi;
                                        zzal(zzkvVar12);
                                        strZzm = zzkvVar12.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                    } else {
                                        strZzm = null;
                                    }
                                    zzal(this.zzi);
                                    byte[] bArrZzbu10 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                    zzfi zzfiVar5 = this.zzl.zzf.zzc;
                                    zzal(zzfiVar5);
                                    strZzi = zzfiVar5.zzi(strZzr);
                                    if (TextUtils.isEmpty(strZzi)) {
                                        Uri uri5 = Uri.parse((String) zzdu.zzp.zza(null));
                                        Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                                        builderBuildUpon5.authority(strZzi + "." + uri5.getAuthority());
                                        string2 = builderBuildUpon5.build().toString();
                                    } else {
                                        string2 = (String) zzdu.zzp.zza(null);
                                    }
                                    URL url5 = new URL(string2);
                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                    if (this.zzy != null) {
                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.zzy = new ArrayList(arrayList);
                                    }
                                    this.zzk.zzd.zzb(jCurrentTimeMillis);
                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu10.length), strZzm);
                                    this.zzu = i;
                                    zzen zzenVar6 = this.zzd;
                                    zzal(zzenVar6);
                                    zzkk zzkkVar5 = new zzkk(this, strZzr);
                                    zzenVar6.zzg();
                                    zzenVar6.zzW();
                                    Preconditions.checkNotNull(url5);
                                    Preconditions.checkNotNull(bArrZzbu10);
                                    Preconditions.checkNotNull(zzkkVar5);
                                    zzenVar6.zzt.zzaz().zzo(new zzem(zzenVar6, strZzr, url5, bArrZzbu10, null, zzkkVar5));
                                }
                            }
                            this.zzv = false;
                        } else {
                            zzay().zzj().zza("Network not connected, ignoring upload request");
                            zzag();
                            this.zzv = false;
                        }
                    }
                }
                zzae();
            } catch (Throwable th9) {
                th = th9;
                z = false;
                this.zzv = z;
                zzae();
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            z = false;
            this.zzv = z;
            zzae();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015b A[PHI: r27
      0x015b: PHI (r27v6 long) = (r27v1 long), (r27v1 long), (r27v7 long) binds: [B:65:0x01e4, B:67:0x01f2, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x016b A[Catch: all -> 0x0148, TRY_ENTER, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0182 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0192  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e6 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f4 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0205 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x020b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02a5 A[Catch: all -> 0x0148, TryCatch #5 {all -> 0x0148, blocks: (B:28:0x0122, B:31:0x0132, B:33:0x013c, B:39:0x014b, B:83:0x02d3, B:92:0x0308, B:94:0x0340, B:96:0x0345, B:97:0x035c, B:101:0x036f, B:103:0x0388, B:105:0x038e, B:106:0x03a5, B:111:0x03cc, B:115:0x03ed, B:116:0x0404, B:119:0x0415, B:122:0x0432, B:123:0x0446, B:125:0x0450, B:127:0x045d, B:129:0x0463, B:130:0x046c, B:131:0x047a, B:133:0x0492, B:142:0x04c3, B:143:0x04d8, B:145:0x0505, B:148:0x051d, B:151:0x055e, B:153:0x058c, B:155:0x05c9, B:156:0x05ce, B:158:0x05d6, B:159:0x05db, B:161:0x05e3, B:162:0x05e8, B:164:0x05f8, B:166:0x0606, B:168:0x060e, B:169:0x0613, B:171:0x061c, B:172:0x0620, B:174:0x062d, B:175:0x0632, B:177:0x0659, B:179:0x0661, B:180:0x0666, B:182:0x066c, B:183:0x066f, B:185:0x0687, B:188:0x0690, B:189:0x06aa, B:191:0x06b0, B:193:0x06c6, B:195:0x06d2, B:197:0x06df, B:202:0x06fd, B:203:0x070d, B:208:0x0718, B:209:0x071b, B:211:0x0739, B:213:0x073d, B:215:0x074f, B:217:0x0753, B:219:0x075e, B:220:0x0767, B:222:0x07a6, B:224:0x07b0, B:225:0x07b3, B:227:0x07c0, B:229:0x07e0, B:230:0x07ed, B:231:0x0823, B:233:0x082b, B:235:0x0835, B:236:0x0842, B:238:0x084c, B:239:0x0859, B:240:0x0866, B:242:0x086c, B:244:0x089c, B:245:0x08df, B:246:0x08ea, B:247:0x08f6, B:249:0x08fc, B:258:0x094a, B:259:0x0998, B:261:0x09a7, B:275:0x0a0a, B:266:0x09c1, B:267:0x09c4, B:252:0x0908, B:254:0x0934, B:272:0x09dd, B:273:0x09f4, B:274:0x09f5, B:152:0x057c, B:139:0x04aa, B:86:0x02e9, B:87:0x02f0, B:89:0x02f6, B:91:0x0302, B:45:0x015f, B:48:0x016b, B:50:0x0182, B:56:0x01a0, B:64:0x01e0, B:66:0x01e6, B:68:0x01f4, B:70:0x0205, B:73:0x0216, B:80:0x029a, B:82:0x02a5, B:74:0x023d, B:75:0x0257, B:79:0x027f, B:78:0x026b, B:59:0x01ae, B:63:0x01d6), top: B:291:0x0122, inners: #1, #2, #3, #7 }] */
    public final void zzY(zzaw zzawVar, zzq zzqVar) {
        String strZzg;
        long jLongValue;
        String upperCase;
        String strConcat;
        zzky zzkyVarZzp;
        String str;
        zzam zzamVar;
        zzky zzkyVar;
        Object obj;
        zzam zzamVar2;
        Object obj2;
        double dDoubleValue;
        long length;
        int i;
        long jDelete;
        zzar zzarVar;
        zzas zzasVar;
        ArrayList arrayList;
        int i2;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzkv.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        if (zzfiVar.zzr(str2, zzawVar.zza)) {
            zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(str2), this.zzn.zzj().zzd(zzawVar.zza));
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            if (!zzfiVar2.zzp(str2)) {
                zzfi zzfiVar3 = this.zzc;
                zzal(zzfiVar3);
                if (!zzfiVar3.zzs(str2)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzN(this.zzF, str2, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzh zzhVarZzj = zzamVar3.zzj(str2);
            if (zzhVarZzj != null) {
                long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzhVarZzj.zzl(), zzhVarZzj.zzc()));
                zzg();
                if (jAbs > ((Long) zzdu.zzy.zza(null)).longValue()) {
                    zzay().zzc().zza("Fetching config for blocked app");
                    zzD(zzhVarZzj);
                    return;
                }
                return;
            }
            return;
        }
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzv().zzM(zzeiVarZzb, zzg().zzd(str2));
        zzaw zzawVarZza = zzeiVarZzb.zza();
        if (Log.isLoggable(zzay().zzq(), 2)) {
            zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzawVarZza));
        }
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        zzamVar4.zzw();
        try {
            zzd(zzqVar);
            boolean z = "ecommerce_purchase".equals(zzawVarZza.zza) || ProductAction.ACTION_PURCHASE.equals(zzawVarZza.zza) || ProductAction.ACTION_REFUND.equals(zzawVarZza.zza);
            if ("_iap".equals(zzawVarZza.zza)) {
                strZzg = zzawVarZza.zzb.zzg("currency");
                if (z) {
                    dDoubleValue = zzawVarZza.zzb.zzd(AppMeasurementSdk.ConditionalUserProperty.VALUE).doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        dDoubleValue = zzawVarZza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue() * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str2), Double.valueOf(dDoubleValue));
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzC();
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzx();
                        return;
                    }
                    jLongValue = Math.round(dDoubleValue);
                    if (ProductAction.ACTION_REFUND.equals(zzawVarZza.zza)) {
                        jLongValue = -jLongValue;
                    }
                } else {
                    jNanoTime = jNanoTime;
                    jLongValue = zzawVarZza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue();
                }
                if (TextUtils.isEmpty(strZzg)) {
                    str = "_err";
                    obj = null;
                } else {
                    upperCase = strZzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strConcat = "_ltv_".concat(upperCase);
                        zzam zzamVar7 = this.zze;
                        zzal(zzamVar7);
                        zzkyVarZzp = zzamVar7.zzp(str2, strConcat);
                        if (zzkyVarZzp != null) {
                            obj2 = zzkyVarZzp.zze;
                            if (obj2 instanceof Long) {
                                long jLongValue2 = ((Long) obj2).longValue();
                                String str3 = zzawVarZza.zzc;
                                long jCurrentTimeMillis = zzav().currentTimeMillis();
                                Long lValueOf = Long.valueOf(jLongValue2 + jLongValue);
                                str = "_err";
                                zzkyVar = new zzky(str2, str3, strConcat, jCurrentTimeMillis, lValueOf);
                                str2 = str2;
                                obj = null;
                            } else {
                                long j = jLongValue;
                                str = "_err";
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze = zzg().zze(str2, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str2);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(iZze)});
                                } catch (SQLiteException e) {
                                    zzamVar.zzt.zzay().zzd().zzc("Error pruning currencies. appId", zzeh.zzn(str2), e);
                                }
                                obj = null;
                                zzkyVar = new zzky(str2, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(j));
                                str2 = str2;
                            }
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            if (!zzamVar2.zzL(zzkyVar)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str2), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                                zzv().zzN(this.zzF, str2, 9, null, null, 0);
                            }
                        } else {
                            long j2 = jLongValue;
                            str = "_err";
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            int iZze2 = zzg().zze(str2, zzdu.zzD) - 1;
                            Preconditions.checkNotEmpty(str2);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(iZze2)});
                            obj = null;
                            zzkyVar = new zzky(str2, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(j2));
                            str2 = str2;
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            if (!zzamVar2.zzL(zzkyVar)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str2), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                                zzv().zzN(this.zzF, str2, 9, null, null, 0);
                            }
                        }
                    } else {
                        str = "_err";
                        obj = null;
                    }
                }
            } else {
                if (z) {
                    z = true;
                    strZzg = zzawVarZza.zzb.zzg("currency");
                    if (z) {
                        dDoubleValue = zzawVarZza.zzb.zzd(AppMeasurementSdk.ConditionalUserProperty.VALUE).doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzawVarZza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d) {
                        }
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str2), Double.valueOf(dDoubleValue));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        zzamVar8.zzC();
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzx();
                        return;
                    }
                    jNanoTime = jNanoTime;
                    jLongValue = zzawVarZza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue();
                    if (TextUtils.isEmpty(strZzg)) {
                        upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            strConcat = "_ltv_".concat(upperCase);
                            zzam zzamVar10 = this.zze;
                            zzal(zzamVar10);
                            zzkyVarZzp = zzamVar10.zzp(str2, strConcat);
                            if (zzkyVarZzp != null) {
                                obj2 = zzkyVarZzp.zze;
                                if (obj2 instanceof Long) {
                                    long j3 = jLongValue;
                                    str = "_err";
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    int iZze3 = zzg().zze(str2, zzdu.zzD) - 1;
                                    Preconditions.checkNotEmpty(str2);
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                    zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(iZze3)});
                                    obj = null;
                                    zzkyVar = new zzky(str2, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(j3));
                                    str2 = str2;
                                } else {
                                    long jLongValue3 = ((Long) obj2).longValue();
                                    String str4 = zzawVarZza.zzc;
                                    long jCurrentTimeMillis2 = zzav().currentTimeMillis();
                                    Long lValueOf2 = Long.valueOf(jLongValue3 + jLongValue);
                                    str = "_err";
                                    zzkyVar = new zzky(str2, str4, strConcat, jCurrentTimeMillis2, lValueOf2);
                                    str2 = str2;
                                    obj = null;
                                }
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                if (!zzamVar2.zzL(zzkyVar)) {
                                    zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str2), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                                    zzv().zzN(this.zzF, str2, 9, null, null, 0);
                                }
                            } else {
                                long j4 = jLongValue;
                                str = "_err";
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze4 = zzg().zze(str2, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str2);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(iZze4)});
                                obj = null;
                                zzkyVar = new zzky(str2, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(j4));
                                str2 = str2;
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                if (!zzamVar2.zzL(zzkyVar)) {
                                    zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str2), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                                    zzv().zzN(this.zzF, str2, 9, null, null, 0);
                                }
                            }
                        }
                    }
                } else {
                    jNanoTime = jNanoTime;
                }
                str = "_err";
                obj = null;
            }
            boolean zZzai = zzlb.zzai(zzawVarZza.zza);
            boolean zEquals = str.equals(zzawVarZza.zza);
            zzv();
            zzau zzauVar = zzawVarZza.zzb;
            if (zzauVar == null) {
                length = 0;
            } else {
                zzat zzatVar = new zzat(zzauVar);
                length = 0;
                while (zzatVar.hasNext()) {
                    Object objZzf = zzauVar.zzf(zzatVar.next());
                    if (objZzf instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objZzf).length;
                    }
                }
            }
            long j5 = length + 1;
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            String str5 = str2;
            zzak zzakVarZzm = zzamVar11.zzm(zza(), str5, j5, true, zZzai, false, zEquals, false);
            long j6 = zzakVarZzm.zzb;
            zzg();
            long jIntValue = j6 - ((long) ((Integer) zzdu.zzj.zza(obj)).intValue());
            if (jIntValue > 0) {
                if (jIntValue % 1000 == 1) {
                    zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(str5), Long.valueOf(zzakVarZzm.zzb));
                }
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzC();
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                zzamVar13.zzx();
                return;
            }
            if (zZzai) {
                long j7 = zzakVarZzm.zza;
                zzg();
                long jIntValue2 = j7 - ((long) ((Integer) zzdu.zzl.zza(obj)).intValue());
                if (jIntValue2 > 0) {
                    if (jIntValue2 % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(str5), Long.valueOf(zzakVarZzm.zza));
                    }
                    zzv().zzN(this.zzF, str5, 16, "_ev", zzawVarZza.zza, 0);
                    zzam zzamVar14 = this.zze;
                    zzal(zzamVar14);
                    zzamVar14.zzC();
                    zzam zzamVar15 = this.zze;
                    zzal(zzamVar15);
                    zzamVar15.zzx();
                    return;
                }
            }
            if (zEquals) {
                long jMax = zzakVarZzm.zzd - ((long) Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzdu.zzk))));
                if (jMax > 0) {
                    if (jMax == 1) {
                        zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(str5), Long.valueOf(zzakVarZzm.zzd));
                    }
                    zzam zzamVar16 = this.zze;
                    zzal(zzamVar16);
                    zzamVar16.zzC();
                    zzam zzamVar17 = this.zze;
                    zzal(zzamVar17);
                    zzamVar17.zzx();
                    return;
                }
            }
            Bundle bundleZzc = zzawVarZza.zzb.zzc();
            zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
            if (zzv().zzae(str5)) {
                zzv().zzO(bundleZzc, "_dbg", 1L);
                zzv().zzO(bundleZzc, "_r", 1L);
            }
            if ("_s".equals(zzawVarZza.zza)) {
                zzam zzamVar18 = this.zze;
                zzal(zzamVar18);
                zzky zzkyVarZzp2 = zzamVar18.zzp(zzqVar.zza, "_sno");
                if (zzkyVarZzp2 != null && (zzkyVarZzp2.zze instanceof Long)) {
                    zzv().zzO(bundleZzc, "_sno", zzkyVarZzp2.zze);
                }
            }
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            Preconditions.checkNotEmpty(str5);
            zzamVar19.zzg();
            zzamVar19.zzW();
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzamVar19.zzh();
                int iMin = Math.min(1000000, zzamVar19.zzt.zzf().zze(str5, zzdu.zzo));
                i = 0;
                try {
                    jDelete = sQLiteDatabaseZzh.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str5, String.valueOf(Math.max(0, iMin))});
                } catch (SQLiteException e2) {
                    e = e2;
                    zzamVar19.zzt.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(str5), e);
                    jDelete = 0;
                }
            } catch (SQLiteException e3) {
                e = e3;
                i = 0;
            }
            if (jDelete > 0) {
                zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(str5), Long.valueOf(jDelete));
            }
            int i3 = i;
            zzar zzarVar2 = new zzar(this.zzn, zzawVarZza.zzc, str5, zzawVarZza.zza, zzawVarZza.zzd, 0L, bundleZzc);
            zzam zzamVar20 = this.zze;
            zzal(zzamVar20);
            zzas zzasVarZzn = zzamVar20.zzn(str5, zzarVar2.zzb);
            if (zzasVarZzn == null) {
                zzam zzamVar21 = this.zze;
                zzal(zzamVar21);
                if (zzamVar21.zzf(str5) >= zzg().zzb(str5) && zZzai) {
                    zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeh.zzn(str5), this.zzn.zzj().zzd(zzarVar2.zzb), Integer.valueOf(zzg().zzb(str5)));
                    zzv().zzN(this.zzF, str5, 8, null, null, 0);
                    zzam zzamVar22 = this.zze;
                    zzal(zzamVar22);
                    zzamVar22.zzx();
                    return;
                }
                zzasVar = new zzas(str5, zzarVar2.zzb, 0L, 0L, 0L, zzarVar2.zzd, 0L, null, null, null, null);
                zzarVar = zzarVar2;
            } else {
                zzar zzarVarZza = zzarVar2.zza(this.zzn, zzasVarZzn.zzf);
                zzas zzasVarZzc = zzasVarZzn.zzc(zzarVarZza.zzd);
                zzarVar = zzarVarZza;
                zzasVar = zzasVarZzc;
            }
            zzam zzamVar23 = this.zze;
            zzal(zzamVar23);
            zzamVar23.zzE(zzasVar);
            zzaz().zzg();
            zzB();
            Preconditions.checkNotNull(zzarVar);
            Preconditions.checkNotNull(zzqVar);
            Preconditions.checkNotEmpty(zzarVar.zza);
            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
            com.google.android.gms.internal.measurement.zzgc zzgcVarZzt = com.google.android.gms.internal.measurement.zzgd.zzt();
            zzgcVarZzt.zzad(1);
            zzgcVarZzt.zzZ("android");
            if (!TextUtils.isEmpty(zzqVar.zza)) {
                zzgcVarZzt.zzD(zzqVar.zza);
            }
            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                zzgcVarZzt.zzF(zzqVar.zzd);
            }
            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                zzgcVarZzt.zzG(zzqVar.zzc);
            }
            zzpd.zzc();
            if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan) && !TextUtils.isEmpty(zzqVar.zzx)) {
                zzgcVarZzt.zzah(zzqVar.zzx);
            }
            long j8 = zzqVar.zzj;
            if (j8 != -2147483648L) {
                zzgcVarZzt.zzH((int) j8);
            }
            zzgcVarZzt.zzV(zzqVar.zze);
            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                zzgcVarZzt.zzU(zzqVar.zzb);
            }
            zzgcVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
            if (zzgcVarZzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                zzgcVarZzt.zzC(zzqVar.zzq);
            }
            long j9 = zzqVar.zzf;
            if (j9 != 0) {
                zzgcVarZzt.zzM(j9);
            }
            zzgcVarZzt.zzP(zzqVar.zzs);
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            Map mapZzc = zzdu.zzc(zzkvVar.zzf.zzn.zzau());
            if (mapZzc != null && !mapZzc.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                int iIntValue = ((Integer) zzdu.zzO.zza(null)).intValue();
                for (Map.Entry entry : mapZzc.entrySet()) {
                    if (((String) entry.getKey()).startsWith("measurement.id.")) {
                        try {
                            int i4 = Integer.parseInt((String) entry.getValue());
                            if (i4 != 0) {
                                arrayList2.add(Integer.valueOf(i4));
                                if (arrayList2.size() >= iIntValue) {
                                    zzkvVar.zzt.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList2.size()));
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } catch (NumberFormatException e4) {
                            zzkvVar.zzt.zzay().zzk().zzb("Experiment ID NumberFormatException", e4);
                        }
                    }
                }
                arrayList = arrayList2.isEmpty() ? null : arrayList2;
            }
            if (arrayList != null) {
                zzgcVarZzt.zzh(arrayList);
            }
            zzai zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
            zzah zzahVar = zzah.AD_STORAGE;
            if (zzaiVarZzc.zzi(zzahVar) && zzqVar.zzo) {
                Pair pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzqVar.zzo) {
                    zzgcVarZzt.zzae((String) pairZzd.first);
                    Object obj3 = pairZzd.second;
                    if (obj3 != null) {
                        zzgcVarZzt.zzX(((Boolean) obj3).booleanValue());
                    }
                }
            }
            this.zzn.zzg().zzu();
            zzgcVarZzt.zzN(Build.MODEL);
            this.zzn.zzg().zzu();
            zzgcVarZzt.zzY(Build.VERSION.RELEASE);
            zzgcVarZzt.zzaj((int) this.zzn.zzg().zzb());
            zzgcVarZzt.zzan(this.zzn.zzg().zzc());
            if (this.zzn.zzJ()) {
                zzgcVarZzt.zzap();
                if (!TextUtils.isEmpty(null)) {
                    zzgcVarZzt.zzO(null);
                }
            }
            zzam zzamVar24 = this.zze;
            zzal(zzamVar24);
            zzh zzhVarZzj2 = zzamVar24.zzj(zzqVar.zza);
            if (zzhVarZzj2 == null) {
                zzhVarZzj2 = new zzh(this.zzn, zzqVar.zza);
                zzhVarZzj2.zzH(zzw(zzaiVarZzc));
                zzhVarZzj2.zzV(zzqVar.zzk);
                zzhVarZzj2.zzW(zzqVar.zzb);
                if (zzaiVarZzc.zzi(zzahVar)) {
                    zzhVarZzj2.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                }
                zzhVarZzj2.zzaa(0L);
                zzhVarZzj2.zzab(0L);
                zzhVarZzj2.zzZ(0L);
                zzhVarZzj2.zzJ(zzqVar.zzc);
                zzhVarZzj2.zzK(zzqVar.zzj);
                zzhVarZzj2.zzI(zzqVar.zzd);
                zzhVarZzj2.zzX(zzqVar.zze);
                zzhVarZzj2.zzS(zzqVar.zzf);
                zzhVarZzj2.zzac(zzqVar.zzh);
                zzhVarZzj2.zzT(zzqVar.zzs);
                zzam zzamVar25 = this.zze;
                zzal(zzamVar25);
                zzamVar25.zzD(zzhVarZzj2);
            }
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzj2.zzu())) {
                zzgcVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj2.zzu()));
            }
            if (!TextUtils.isEmpty(zzhVarZzj2.zzx())) {
                zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj2.zzx()));
            }
            zzam zzamVar26 = this.zze;
            zzal(zzamVar26);
            List listZzu = zzamVar26.zzu(zzqVar.zza);
            for (int i5 = i3; i5 < listZzu.size(); i5++) {
                com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                zzglVarZzd.zzf(((zzky) listZzu.get(i5)).zzc);
                zzglVarZzd.zzg(((zzky) listZzu.get(i5)).zzd);
                zzkv zzkvVar2 = this.zzi;
                zzal(zzkvVar2);
                zzkvVar2.zzu(zzglVarZzd, ((zzky) listZzu.get(i5)).zze);
                zzgcVarZzt.zzl(zzglVarZzd);
            }
            try {
                zzam zzamVar27 = this.zze;
                zzal(zzamVar27);
                com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVarZzt.zzaC();
                zzamVar27.zzg();
                zzamVar27.zzW();
                Preconditions.checkNotNull(zzgdVar);
                Preconditions.checkNotEmpty(zzgdVar.zzx());
                byte[] bArrZzbu = zzgdVar.zzbu();
                zzkv zzkvVar3 = zzamVar27.zzf.zzi;
                zzal(zzkvVar3);
                long jZzd = zzkvVar3.zzd(bArrZzbu);
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", zzgdVar.zzx());
                contentValues.put("metadata_fingerprint", Long.valueOf(jZzd));
                contentValues.put("metadata", bArrZzbu);
                try {
                    zzamVar27.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                    zzam zzamVar28 = this.zze;
                    zzal(zzamVar28);
                    zzat zzatVar2 = new zzat(zzarVar.zzf);
                    while (true) {
                        if (!zzatVar2.hasNext()) {
                            zzfi zzfiVar4 = this.zzc;
                            zzal(zzfiVar4);
                            boolean zZzq = zzfiVar4.zzq(zzarVar.zza, zzarVar.zzb);
                            zzam zzamVar29 = this.zze;
                            zzal(zzamVar29);
                            zzak zzakVarZzl = zzamVar29.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                            if (!zZzq || zzakVarZzl.zze >= zzg().zze(zzarVar.zza, zzdu.zzn)) {
                                i2 = i3;
                                break;
                            }
                        } else if ("_r".equals(zzatVar2.next())) {
                        }
                        i2 = 1;
                        break;
                    }
                    zzamVar28.zzg();
                    zzamVar28.zzW();
                    Preconditions.checkNotNull(zzarVar);
                    Preconditions.checkNotEmpty(zzarVar.zza);
                    zzkv zzkvVar4 = zzamVar28.zzf.zzi;
                    zzal(zzkvVar4);
                    byte[] bArrZzbu2 = zzkvVar4.zzj(zzarVar).zzbu();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", zzarVar.zza);
                    contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzarVar.zzb);
                    contentValues2.put("timestamp", Long.valueOf(zzarVar.zzd));
                    contentValues2.put("metadata_fingerprint", Long.valueOf(jZzd));
                    contentValues2.put("data", bArrZzbu2);
                    contentValues2.put("realtime", Integer.valueOf(i2));
                    try {
                        if (zzamVar28.zzh().insert("raw_events", null, contentValues2) == -1) {
                            zzamVar28.zzt.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzarVar.zza));
                        } else {
                            this.zza = 0L;
                        }
                    } catch (SQLiteException e5) {
                        zzamVar28.zzt.zzay().zzd().zzc("Error storing raw event. appId", zzeh.zzn(zzarVar.zza), e5);
                    }
                    zzam zzamVar30 = this.zze;
                    zzal(zzamVar30);
                    zzamVar30.zzC();
                    zzam zzamVar31 = this.zze;
                    zzal(zzamVar31);
                    zzamVar31.zzx();
                    zzag();
                    zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                } catch (SQLiteException e6) {
                    zzamVar27.zzt.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(zzgdVar.zzx()), e6);
                    throw e6;
                }
            } catch (IOException e7) {
                zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeh.zzn(zzgcVarZzt.zzap()), e7);
            }
        } catch (Throwable th) {
            zzam zzamVar32 = this.zze;
            zzal(zzamVar32);
            zzamVar32.zzx();
            throw th;
        }
    }

    @VisibleForTesting
    public final boolean zzZ() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzay().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzay().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzay().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    public final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzjo zzjoVar = this.zzk;
        zzjoVar.zzW();
        zzjoVar.zzg();
        long jZza = zzjoVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzjoVar.zzt.zzv().zzG().nextInt(86400000)) + 1;
            zzjoVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    public final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkr zzkrVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzks(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
        zzai zzaiVarZzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String strZzf = zzaiVarZzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
            }
            if (zzaiVarZzc.zzi(zzahVar)) {
                zzhVarZzj.zzae(strZzf);
            }
        } else if (zzaiVarZzc.zzi(zzahVar) && strZzf != null && !strZzf.equals(zzhVarZzj.zzA())) {
            zzhVarZzj.zzae(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzaiVarZzc).first)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzky zzkyVar = new zzky(zzqVar.zza, "auto", "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzkyVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzu()) && zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzH(zzw(zzaiVarZzc));
        }
        zzhVarZzj.zzW(zzqVar.zzb);
        zzhVarZzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzV(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzhVarZzj.zzX(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzJ(zzqVar.zzc);
        }
        zzhVarZzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzI(str);
        }
        zzhVarZzj.zzS(zzqVar.zzf);
        zzhVarZzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzY(zzqVar.zzg);
        }
        zzhVarZzj.zzG(zzqVar.zzo);
        zzhVarZzj.zzad(zzqVar.zzr);
        zzhVarZzj.zzT(zzqVar.zzs);
        zzpd.zzc();
        if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan)) {
            zzhVarZzj.zzag(zzqVar.zzx);
        }
        zznt.zzc();
        if (zzg().zzs(null, zzdu.zzaj)) {
            zzhVarZzj.zzaf(zzqVar.zzt);
        } else {
            zznt.zzc();
            if (zzg().zzs(null, zzdu.zzai)) {
                zzhVarZzj.zzaf(null);
            }
        }
        if (zzhVarZzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzai zzh(String str) {
        String string;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                zzai zzaiVarZzb = zzai.zzb(string);
                zzV(str, zzaiVarZzb);
                return zzaiVarZzb;
            } catch (SQLiteException e) {
                zzamVar.zzt.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzec zzj() {
        return this.zzn.zzj();
    }

    public final zzen zzl() {
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        return zzenVar;
    }

    public final zzep zzm() {
        zzep zzepVar = this.zzf;
        if (zzepVar != null) {
            return zzepVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfi zzo() {
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        return zzfiVar;
    }

    public final zzfr zzq() {
        return this.zzn;
    }

    public final zzic zzr() {
        zzic zzicVar = this.zzj;
        zzal(zzicVar);
        return zzicVar;
    }

    public final zzjo zzs() {
        return this.zzk;
    }

    public final zzkv zzu() {
        zzkv zzkvVar = this.zzi;
        zzal(zzkvVar);
        return zzkvVar;
    }

    public final zzlb zzv() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    public final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzkm(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzqVar.zza), e);
            return null;
        }
    }

    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
