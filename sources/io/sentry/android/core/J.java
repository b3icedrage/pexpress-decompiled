package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import defpackage.C2688aH1;
import defpackage.InterfaceC4761js0;
import defpackage.N7;
import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.protocol.C4523e;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class J {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile J i;

    @NotNull
    public static final C4527a j = new C4527a();

    @NotNull
    public final Context a;

    @NotNull
    public final SentryAndroidOptions b;

    @NotNull
    public final E c;

    @Nullable
    public final Boolean d;

    @Nullable
    public final F.a e;

    @Nullable
    public final F.b f;

    @NotNull
    public final io.sentry.protocol.n g;

    @Nullable
    public final Long h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC4761js0.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC4761js0.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC4761js0.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x010a A[PHI: r6
      0x010a: PHI (r6v11 java.lang.Process) = (r6v38 java.lang.Process), (r6v39 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    public J(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        String str;
        F.a aVar;
        F.b bVar;
        Bundle bundle;
        Process process;
        Process processExec;
        Process process2;
        Process process3;
        boolean z;
        boolean z2;
        boolean z3;
        this.a = context;
        this.b = sentryAndroidOptions;
        this.c = new E(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.h.c.a();
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.d = "Android";
        nVar.e = Build.VERSION.RELEASE;
        nVar.h = Build.DISPLAY;
        ILogger logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        String str2 = property;
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    str2 = line;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e) {
                logger.d(NG1.ERROR, "Exception while attempting to read kernel information", e);
                str2 = property;
            }
        }
        if (str2 != 0) {
            nVar.i = str2;
        }
        boolean z4 = false;
        if (sentryAndroidOptions.isEnableRootCheck()) {
            io.sentry.android.core.internal.util.o oVar = new io.sentry.android.core.internal.util.o(this.a, this.c, sentryAndroidOptions.getLogger());
            oVar.b.getClass();
            String str3 = Build.TAGS;
            if (str3 == null || !str3.contains("test-keys")) {
                String[] strArr = oVar.d;
                int length = strArr.length;
                int i2 = 0;
                str2 = str2;
                while (true) {
                    ILogger iLogger = oVar.c;
                    if (i2 >= length) {
                        process = "su";
                        try {
                            try {
                                processExec = oVar.f.exec(new String[]{"/system/xbin/which", "su"});
                                try {
                                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), io.sentry.android.core.internal.util.o.g));
                                    try {
                                        z = bufferedReader2.readLine() != null;
                                        bufferedReader2.close();
                                        processExec.destroy();
                                        str2 = processExec;
                                    } catch (Throwable th3) {
                                        try {
                                            bufferedReader2.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (IOException unused) {
                                    iLogger.a(NG1.DEBUG, "SU isn't found on this Device.", new Object[0]);
                                    process3 = processExec;
                                    process2 = processExec;
                                    if (processExec != null) {
                                        process2.destroy();
                                        process3 = process2;
                                    }
                                    z = false;
                                    str2 = process3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    iLogger.d(NG1.DEBUG, "Error when trying to check if SU exists.", th);
                                    process3 = processExec;
                                    process2 = processExec;
                                    if (processExec != null) {
                                        process2.destroy();
                                        process3 = process2;
                                    }
                                    z = false;
                                    str2 = process3;
                                }
                            } catch (Throwable th6) {
                                if (process != 0) {
                                    process.destroy();
                                }
                                throw th6;
                            }
                        } catch (IOException unused2) {
                            processExec = null;
                        } catch (Throwable th7) {
                            th = th7;
                            processExec = null;
                        }
                        if (!z) {
                            io.sentry.util.p.b(iLogger, "The ILogger object is required.");
                            PackageManager packageManager = oVar.a.getPackageManager();
                            if (packageManager == null) {
                                z2 = false;
                                str2 = str2;
                                break;
                            }
                            str2 = oVar.e;
                            int length2 = str2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    z2 = false;
                                    str2 = str2;
                                    break;
                                }
                                String str4 = str2[i3];
                                try {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        packageManager.getPackageInfo(str4, PackageManager.PackageInfoFlags.of(0L));
                                    } else {
                                        packageManager.getPackageInfo(str4, 0);
                                    }
                                    z2 = true;
                                    str2 = str2;
                                    break;
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    i3++;
                                }
                            }
                            if (!z2) {
                                z3 = false;
                                process = str2;
                                break;
                            }
                            break;
                        }
                    } else {
                        String str5 = strArr[i2];
                        try {
                            if (!new File(str5).exists()) {
                                i2++;
                                str2 = str2;
                            }
                        } catch (RuntimeException e2) {
                            str2 = "Error when trying to check if root file %s exists.";
                            iLogger.c(NG1.ERROR, e2, "Error when trying to check if root file %s exists.", str5);
                        }
                    }
                    z3 = true;
                    process = str2;
                    break;
                }
                nVar.j = Boolean.valueOf(z3);
            } else {
                z3 = true;
                process = str2;
                nVar.j = Boolean.valueOf(z3);
            }
        }
        this.g = nVar;
        this.d = this.c.a();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        try {
            PackageInfo packageInfoC = F.c(context, this.c);
            PackageManager packageManager2 = context.getPackageManager();
            if (packageInfoC == null || packageManager2 == null) {
                aVar = null;
            } else {
                str = packageInfoC.packageName;
                try {
                    String installerPackageName = packageManager2.getInstallerPackageName(str);
                    aVar = new F.a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused4) {
                    logger2.a(NG1.DEBUG, "%s package isn't installed.", str);
                    aVar = null;
                }
            }
        } catch (IllegalArgumentException unused5) {
            str = null;
        }
        this.e = aVar;
        E e3 = this.c;
        e3.getClass();
        ApplicationInfo applicationInfoA = Build.VERSION.SDK_INT >= 33 ? F.d.a(context) : F.e.a(context);
        PackageInfo packageInfoC2 = F.c(context, e3);
        if (packageInfoC2 != null) {
            String[] strArr2 = packageInfoC2.splitNames;
            if (applicationInfoA != null && (bundle = applicationInfoA.metaData) != null) {
                z4 = bundle.getBoolean("com.android.vending.splits.required");
            }
            bVar = new F.b(z4, strArr2);
        } else {
            bVar = null;
        }
        this.f = bVar;
        ActivityManager.MemoryInfo memoryInfoB = F.b(context, sentryAndroidOptions.getLogger());
        if (memoryInfoB != null) {
            this.h = Long.valueOf(memoryInfoB.totalMem);
        } else {
            this.h = null;
        }
    }

    @Nullable
    public static Float b(@NotNull Intent intent, @NotNull C2688aH1 c2688aH1) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    @NotNull
    public static J c(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (i == null) {
            C4527a.C0404a c0404aA = j.a();
            try {
                if (i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    i = new J(context, sentryAndroidOptions);
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return i;
    }

    @Nullable
    public static Boolean d(@NotNull Intent intent, @NotNull C2688aH1 c2688aH1) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0247 A[Catch: all -> 0x0286, TryCatch #4 {all -> 0x0286, blocks: (B:98:0x023f, B:101:0x0247, B:103:0x024d, B:105:0x0251, B:114:0x0269, B:109:0x0258, B:112:0x025f, B:118:0x027c, B:115:0x026c), top: B:145:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251 A[Catch: all -> 0x0286, TryCatch #4 {all -> 0x0286, blocks: (B:98:0x023f, B:101:0x0247, B:103:0x024d, B:105:0x0251, B:114:0x0269, B:109:0x0258, B:112:0x025f, B:118:0x027c, B:115:0x026c), top: B:145:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0255  */
    /* JADX WARN: Code duplicated, block: B:108:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0258 A[Catch: all -> 0x0286, TryCatch #4 {all -> 0x0286, blocks: (B:98:0x023f, B:101:0x0247, B:103:0x024d, B:105:0x0251, B:114:0x0269, B:109:0x0258, B:112:0x025f, B:118:0x027c, B:115:0x026c), top: B:145:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x026c A[Catch: all -> 0x0286, TryCatch #4 {all -> 0x0286, blocks: (B:98:0x023f, B:101:0x0247, B:103:0x024d, B:105:0x0251, B:114:0x0269, B:109:0x0258, B:112:0x025f, B:118:0x027c, B:115:0x026c), top: B:145:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:118:0x027c A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #4 {all -> 0x0286, blocks: (B:98:0x023f, B:101:0x0247, B:103:0x024d, B:105:0x0251, B:114:0x0269, B:109:0x0258, B:112:0x025f, B:118:0x027c, B:115:0x026c), top: B:145:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0293  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x027a A[ADDED_TO_REGION, EDGE_INSN: B:164:0x027a->B:117:0x027a BREAK  A[LOOP:0: B:104:0x024f->B:114:0x0269], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:57:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #6 {all -> 0x01a8, blocks: (B:65:0x0196, B:67:0x019f), top: B:150:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    @SuppressLint({"NewApi"})
    @NotNull
    public final C4523e a(boolean z, boolean z2) {
        C4523e.b bVar;
        Boolean bool;
        ILogger logger;
        DisplayMetrics displayMetrics;
        Date dateI;
        LocaleList locales;
        TimeZone timeZone;
        String strA;
        Locale locale;
        ArrayList arrayListA;
        boolean zIsCollectExternalStorageContext;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i2;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoB;
        File dataDirectory;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        String absolutePath;
        int length;
        int i3;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        Context context = this.a;
        C4523e c4523e = new C4523e();
        c4523e.e = Build.MANUFACTURER;
        c4523e.g = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        c4523e.h = F.a(sentryAndroidOptions.getLogger());
        c4523e.i = Build.MODEL;
        c4523e.j = Build.ID;
        c4523e.k = Build.SUPPORTED_ABIS;
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            c4523e.L = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            int i4 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    try {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                bVar = null;
                            } else {
                                bVar = C4523e.b.LANDSCAPE;
                            }
                            if (bVar == null) {
                                try {
                                    sentryAndroidOptions.getLogger().a(NG1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                    bVar = null;
                                } catch (Throwable th) {
                                    th = th;
                                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting device orientation.", th);
                                }
                            }
                            c4523e.o = bVar;
                            bool = this.d;
                            if (bool != null) {
                                c4523e.p = bool;
                            }
                            logger = sentryAndroidOptions.getLogger();
                            displayMetrics = context.getResources().getDisplayMetrics();
                            if (displayMetrics != null) {
                                c4523e.y = Integer.valueOf(displayMetrics.widthPixels);
                                c4523e.z = Integer.valueOf(displayMetrics.heightPixels);
                                c4523e.A = Float.valueOf(displayMetrics.density);
                                c4523e.B = Integer.valueOf(displayMetrics.densityDpi);
                            }
                            dateI = N7.i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                            c4523e.C = dateI;
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = Calendar.getInstance().getTimeZone();
                            } else {
                                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                            }
                            c4523e.D = timeZone;
                            if (c4523e.E == null) {
                                try {
                                    strA = N.a(context);
                                } catch (Throwable th2) {
                                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting installationId.", th2);
                                    strA = null;
                                }
                                c4523e.E = strA;
                            }
                            locale = Locale.getDefault();
                            if (c4523e.F == null) {
                                c4523e.F = locale.toString();
                            }
                            arrayListA = io.sentry.android.core.internal.util.h.c.a();
                            if (!arrayListA.isEmpty()) {
                                c4523e.J = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                                c4523e.I = Integer.valueOf(arrayListA.size());
                            }
                            c4523e.q = this.h;
                            if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                                zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                                intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                                if (Build.VERSION.SDK_INT >= 33) {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                                } else {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                                }
                                if (intentRegisterReceiver != null) {
                                    c4523e.l = b(intentRegisterReceiver, sentryAndroidOptions);
                                    c4523e.m = d(intentRegisterReceiver, sentryAndroidOptions);
                                    try {
                                        intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                        if (intExtra != -1) {
                                            fValueOf = Float.valueOf(intExtra / 10.0f);
                                        } else {
                                            fValueOf = null;
                                        }
                                    } catch (Throwable th3) {
                                        sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting battery temperature.", th3);
                                    }
                                    c4523e.H = fValueOf;
                                }
                                i2 = a.a[sentryAndroidOptions.getConnectionStatusProvider().J0().ordinal()];
                                if (i2 == 1) {
                                    bool2 = Boolean.FALSE;
                                } else if (i2 != 2) {
                                    bool2 = null;
                                } else {
                                    bool2 = Boolean.TRUE;
                                }
                                c4523e.n = bool2;
                                memoryInfoB = F.b(context, sentryAndroidOptions.getLogger());
                                if (memoryInfoB != null && z2) {
                                    c4523e.r = Long.valueOf(memoryInfoB.availMem);
                                    c4523e.t = Boolean.valueOf(memoryInfoB.lowMemory);
                                }
                                dataDirectory = Environment.getDataDirectory();
                                if (dataDirectory != null) {
                                    StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                    try {
                                        lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th4) {
                                        sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting total internal storage amount.", th4);
                                        lValueOf2 = null;
                                    }
                                    c4523e.u = lValueOf2;
                                    try {
                                        lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th5) {
                                        sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting unused internal storage amount.", th5);
                                        lValueOf3 = null;
                                    }
                                    c4523e.v = lValueOf3;
                                }
                                if (zIsCollectExternalStorageContext) {
                                    externalFilesDir = context.getExternalFilesDir(null);
                                    try {
                                        externalFilesDirs = context.getExternalFilesDirs(null);
                                        if (externalFilesDirs != null) {
                                            if (externalFilesDir != null) {
                                                absolutePath = externalFilesDir.getAbsolutePath();
                                            } else {
                                                absolutePath = null;
                                            }
                                            length = externalFilesDirs.length;
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < length) {
                                                    file = externalFilesDirs[i3];
                                                    if (file != null) {
                                                        if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                            break;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    i3++;
                                                }
                                            }
                                            if (file != null) {
                                                statFs = new StatFs(file.getPath());
                                            } else {
                                                statFs = null;
                                            }
                                            if (statFs != null) {
                                                try {
                                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                                } catch (Throwable th6) {
                                                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting total external storage amount.", th6);
                                                    lValueOf = null;
                                                }
                                                c4523e.w = lValueOf;
                                                try {
                                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                                } catch (Throwable th7) {
                                                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting unused external storage amount.", th7);
                                                }
                                                c4523e.x = lValueOf4;
                                            }
                                        } else {
                                            sentryAndroidOptions.getLogger().a(NG1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                        }
                                        file = null;
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            statFs = null;
                                        }
                                    } catch (Throwable unused) {
                                        sentryAndroidOptions.getLogger().a(NG1.INFO, "Not possible to read external files directory", new Object[0]);
                                    }
                                    if (statFs != null) {
                                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                        c4523e.w = lValueOf;
                                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                        c4523e.x = lValueOf4;
                                    }
                                }
                                if (c4523e.G == null) {
                                    c4523e.G = sentryAndroidOptions.getConnectionStatusProvider().O();
                                }
                            }
                            return c4523e;
                        }
                        bVar = C4523e.b.PORTRAIT;
                        dateI = N7.i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    } catch (IllegalArgumentException e) {
                        sentryAndroidOptions.getLogger().c(NG1.ERROR, e, "Error getting the device's boot time.", new Object[0]);
                        dateI = null;
                    }
                    if (bVar == null) {
                        sentryAndroidOptions.getLogger().a(NG1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        bVar = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    bVar = null;
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting device orientation.", th);
                    c4523e.o = bVar;
                    bool = this.d;
                    if (bool != null) {
                        c4523e.p = bool;
                    }
                    logger = sentryAndroidOptions.getLogger();
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        c4523e.y = Integer.valueOf(displayMetrics.widthPixels);
                        c4523e.z = Integer.valueOf(displayMetrics.heightPixels);
                        c4523e.A = Float.valueOf(displayMetrics.density);
                        c4523e.B = Integer.valueOf(displayMetrics.densityDpi);
                    }
                    dateI = N7.i(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    c4523e.C = dateI;
                    locales = context.getResources().getConfiguration().getLocales();
                    if (locales.isEmpty()) {
                        timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                    } else {
                        timeZone = Calendar.getInstance().getTimeZone();
                    }
                    c4523e.D = timeZone;
                    if (c4523e.E == null) {
                        strA = N.a(context);
                        c4523e.E = strA;
                    }
                    locale = Locale.getDefault();
                    if (c4523e.F == null) {
                        c4523e.F = locale.toString();
                    }
                    arrayListA = io.sentry.android.core.internal.util.h.c.a();
                    if (!arrayListA.isEmpty()) {
                        c4523e.J = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                        c4523e.I = Integer.valueOf(arrayListA.size());
                    }
                    c4523e.q = this.h;
                    if (z) {
                        zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                        intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                        if (Build.VERSION.SDK_INT >= 33) {
                            intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                        } else {
                            intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                        }
                        if (intentRegisterReceiver != null) {
                            c4523e.l = b(intentRegisterReceiver, sentryAndroidOptions);
                            c4523e.m = d(intentRegisterReceiver, sentryAndroidOptions);
                            intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                            if (intExtra != -1) {
                                fValueOf = Float.valueOf(intExtra / 10.0f);
                            } else {
                                fValueOf = null;
                            }
                            c4523e.H = fValueOf;
                        }
                        i2 = a.a[sentryAndroidOptions.getConnectionStatusProvider().J0().ordinal()];
                        if (i2 == 1) {
                            bool2 = Boolean.FALSE;
                        } else if (i2 != 2) {
                            bool2 = null;
                        } else {
                            bool2 = Boolean.TRUE;
                        }
                        c4523e.n = bool2;
                        memoryInfoB = F.b(context, sentryAndroidOptions.getLogger());
                        if (memoryInfoB != null) {
                            c4523e.r = Long.valueOf(memoryInfoB.availMem);
                            c4523e.t = Boolean.valueOf(memoryInfoB.lowMemory);
                        }
                        dataDirectory = Environment.getDataDirectory();
                        if (dataDirectory != null) {
                            StatFs statFs3 = new StatFs(dataDirectory.getPath());
                            lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                            c4523e.u = lValueOf2;
                            lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                            c4523e.v = lValueOf3;
                        }
                        if (zIsCollectExternalStorageContext) {
                            externalFilesDir = context.getExternalFilesDir(null);
                            externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs != null) {
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                } else {
                                    absolutePath = null;
                                }
                                length = externalFilesDirs.length;
                                i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        file = externalFilesDirs[i3];
                                        if (file != null) {
                                            if (absolutePath != null) {
                                                break;
                                            }
                                        }
                                        i3++;
                                    }
                                }
                                if (file != null) {
                                    statFs = new StatFs(file.getPath());
                                } else {
                                    statFs = null;
                                }
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    c4523e.w = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    c4523e.x = lValueOf4;
                                }
                            } else {
                                sentryAndroidOptions.getLogger().a(NG1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                            }
                            file = null;
                            if (file != null) {
                                statFs = new StatFs(file.getPath());
                            } else {
                                statFs = null;
                            }
                            if (statFs != null) {
                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                c4523e.w = lValueOf;
                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                c4523e.x = lValueOf4;
                            }
                        }
                        if (c4523e.G == null) {
                            c4523e.G = sentryAndroidOptions.getConnectionStatusProvider().O();
                        }
                    }
                    return c4523e;
                }
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th9) {
                logger.d(NG1.ERROR, "Error getting DisplayMetrics.", th9);
                displayMetrics = null;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        c4523e.o = bVar;
        bool = this.d;
        if (bool != null) {
            c4523e.p = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            c4523e.y = Integer.valueOf(displayMetrics.widthPixels);
            c4523e.z = Integer.valueOf(displayMetrics.heightPixels);
            c4523e.A = Float.valueOf(displayMetrics.density);
            c4523e.B = Integer.valueOf(displayMetrics.densityDpi);
        }
        c4523e.C = dateI;
        locales = context.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
        } else {
            timeZone = Calendar.getInstance().getTimeZone();
        }
        c4523e.D = timeZone;
        if (c4523e.E == null) {
            strA = N.a(context);
            c4523e.E = strA;
        }
        locale = Locale.getDefault();
        if (c4523e.F == null) {
            c4523e.F = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.h.c.a();
        if (!arrayListA.isEmpty()) {
            c4523e.J = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            c4523e.I = Integer.valueOf(arrayListA.size());
        }
        c4523e.q = this.h;
        if (z) {
            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
            }
            if (intentRegisterReceiver != null) {
                c4523e.l = b(intentRegisterReceiver, sentryAndroidOptions);
                c4523e.m = d(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                c4523e.H = fValueOf;
            }
            i2 = a.a[sentryAndroidOptions.getConnectionStatusProvider().J0().ordinal()];
            if (i2 == 1) {
                bool2 = Boolean.FALSE;
            } else if (i2 != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            c4523e.n = bool2;
            memoryInfoB = F.b(context, sentryAndroidOptions.getLogger());
            if (memoryInfoB != null) {
                c4523e.r = Long.valueOf(memoryInfoB.availMem);
                c4523e.t = Boolean.valueOf(memoryInfoB.lowMemory);
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs4 = new StatFs(dataDirectory.getPath());
                lValueOf2 = Long.valueOf(statFs4.getBlockCountLong() * statFs4.getBlockSizeLong());
                c4523e.u = lValueOf2;
                lValueOf3 = Long.valueOf(statFs4.getAvailableBlocksLong() * statFs4.getBlockSizeLong());
                c4523e.v = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                externalFilesDir = context.getExternalFilesDir(null);
                externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs != null) {
                    if (externalFilesDir != null) {
                        absolutePath = externalFilesDir.getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    length = externalFilesDirs.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            file = externalFilesDirs[i3];
                            if (file != null) {
                                if (absolutePath != null) {
                                    break;
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                    if (file != null) {
                        statFs = new StatFs(file.getPath());
                    } else {
                        statFs = null;
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        c4523e.w = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        c4523e.x = lValueOf4;
                    }
                } else {
                    sentryAndroidOptions.getLogger().a(NG1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                }
                file = null;
                if (file != null) {
                    statFs = new StatFs(file.getPath());
                } else {
                    statFs = null;
                }
                if (statFs != null) {
                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                    c4523e.w = lValueOf;
                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    c4523e.x = lValueOf4;
                }
            }
            if (c4523e.G == null) {
                c4523e.G = sentryAndroidOptions.getConnectionStatusProvider().O();
            }
        }
        return c4523e;
    }
}
