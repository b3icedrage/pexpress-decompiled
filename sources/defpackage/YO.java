package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class YO {
    public static final SO q = new SO();
    public final Context a;
    public final C6142qS b;
    public final C4402iP c;
    public final C6592sb2 d;
    public final RO e;
    public final C7503wv0 f;
    public final C4448id0 g;
    public final C1434Le h;
    public final C5303mS0 i;
    public final C5080lP j;
    public final C6795ta k;
    public final WI1 l;
    public C7813yP m;
    public final TaskCompletionSource<Boolean> n = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> p = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task d;

        public a(Task task) {
            this.d = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(Boolean bool) {
            return YO.this.e.b(new XO(this, bool));
        }
    }

    public YO(Context context, RO ro, C7503wv0 c7503wv0, C6142qS c6142qS, C4448id0 c4448id0, C4402iP c4402iP, C1434Le c1434Le, C6592sb2 c6592sb2, C5303mS0 c5303mS0, WI1 wi1, C5080lP c5080lP, C6795ta c6795ta) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = ro;
        this.f = c7503wv0;
        this.b = c6142qS;
        this.g = c4448id0;
        this.c = c4402iP;
        this.h = c1434Le;
        this.d = c6592sb2;
        this.i = c5303mS0;
        this.j = c5080lP;
        this.k = c6795ta;
        this.l = wi1;
    }

    public static void a(YO yo, String str) {
        Integer num;
        yo.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        C7503wv0 c7503wv0 = yo.f;
        String str2 = c7503wv0.c;
        C1434Le c1434Le = yo.h;
        C1464Lo c1464Lo = new C1464Lo(str2, c1434Le.f, c1434Le.g, c7503wv0.c(), C4564j.a(c1434Le.d != null ? 4 : 1), c1434Le.h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        C1622No c1622No = new C1622No(C7155vG.h());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        C7155vG.a aVar = C7155vG.a.d;
        String str5 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        C7155vG.a aVar2 = C7155vG.a.d;
        if (zIsEmpty) {
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            C7155vG.a aVar3 = (C7155vG.a) C7155vG.a.e.get(str5.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        }
        int iOrdinal = aVar2.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jE = C7155vG.e();
        boolean zG = C7155vG.g();
        int iC = C7155vG.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        yo.j.d(str, jCurrentTimeMillis, new C1386Ko(c1464Lo, c1622No, new C1541Mo(iOrdinal, iAvailableProcessors, jE, blockCount, zG, iC)));
        C5303mS0 c5303mS0 = yo.i;
        c5303mS0.b.a();
        c5303mS0.b = C5303mS0.c;
        if (str != null) {
            c5303mS0.b = new C0989Fl1(c5303mS0.a.b(str, "userlog"));
        }
        WI1 wi1 = yo.l;
        C5923pP c5923pP = wi1.a;
        Charset charset = AbstractC5713oP.a;
        C2165Un.a aVar4 = new C2165Un.a();
        aVar4.a = "18.3.5";
        C1434Le c1434Le2 = c5923pP.c;
        String str9 = c1434Le2.a;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar4.b = str9;
        C7503wv0 c7503wv1 = c5923pP.b;
        String strC = c7503wv1.c();
        if (strC == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar4.d = strC;
        String str10 = c1434Le2.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar4.e = str10;
        String str11 = c1434Le2.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar4.f = str11;
        aVar4.c = 4;
        C3022bo.a aVar5 = new C3022bo.a();
        aVar5.e = Boolean.FALSE;
        aVar5.c = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar5.b = str;
        String str12 = C5923pP.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar5.a = str12;
        String str13 = c7503wv1.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String strC2 = c7503wv1.c();
        C4576j00 c4576j00 = c1434Le2.h;
        if (c4576j00.b == null) {
            c4576j00.b = new C4576j00.a(c4576j00);
        }
        C4576j00.a aVar6 = c4576j00.b;
        String str14 = aVar6.a;
        if (aVar6 == null) {
            c4576j00.b = new C4576j00.a(c4576j00);
        }
        aVar5.f = new C3231co(str13, str10, str11, strC2, str14, c4576j00.b.b);
        C6221qo.a aVar7 = new C6221qo.a();
        aVar7.a = 3;
        if (str3 == null) {
            throw new NullPointerException("Null version");
        }
        aVar7.b = str3;
        if (str4 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar7.c = str4;
        aVar7.d = Boolean.valueOf(C7155vG.h());
        aVar5.h = aVar7.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) C5923pP.f.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jE2 = C7155vG.e();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zG2 = C7155vG.g();
        int iC2 = C7155vG.c();
        C3860fo.a aVar8 = new C3860fo.a();
        aVar8.a = Integer.valueOf(iIntValue);
        if (str6 == null) {
            throw new NullPointerException("Null model");
        }
        aVar8.b = str6;
        aVar8.c = Integer.valueOf(iAvailableProcessors2);
        aVar8.d = Long.valueOf(jE2);
        aVar8.e = Long.valueOf(blockCount2);
        aVar8.f = Boolean.valueOf(zG2);
        aVar8.g = Integer.valueOf(iC2);
        if (str7 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        aVar8.h = str7;
        if (str8 == null) {
            throw new NullPointerException("Null modelClass");
        }
        aVar8.i = str8;
        aVar5.i = aVar8.a();
        aVar5.k = 3;
        aVar4.g = aVar5.a();
        C2165Un c2165UnA = aVar4.a();
        C4448id0 c4448id0 = wi1.b.b;
        AbstractC5713oP.e eVar = c2165UnA.h;
        if (eVar == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String strG = eVar.g();
        try {
            C7393wP.f.getClass();
            YK yk = C6342rP.a;
            yk.getClass();
            StringWriter stringWriter = new StringWriter();
            try {
                DG0 dg0 = (DG0) yk.d;
                WH0 wh0 = new WH0(stringWriter, dg0.a, dg0.b, dg0.c, dg0.d);
                wh0.g(c2165UnA);
                wh0.i();
                wh0.b.flush();
            } catch (IOException unused) {
            }
            C7393wP.f(c4448id0.b(strG, "report"), stringWriter.toString());
            File fileB = c4448id0.b(strG, "start-time");
            long jI = eVar.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(j.a.b(new FileOutputStream(fileB), fileB), C7393wP.d);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(jI * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public static Task b(YO yo) {
        Task taskCall;
        yo.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C4448id0.e(yo.g.b.listFiles(q))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    b0.f("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC2934bP(yo, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                b0.f("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z, C7587xJ1 c7587xJ1) {
        int i;
        ApplicationExitInfo applicationExitInfoA;
        String string;
        int i2;
        long j;
        C1255Iw0<AbstractC5713oP.a.AbstractC0456a> c1255Iw0;
        WI1 wi1 = this.l;
        ArrayList arrayList = new ArrayList(wi1.b.c());
        if (arrayList.size() <= z) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        C6326rJ1.a aVar = c7587xJ1.b().b;
        C7393wP c7393wP = wi1.b;
        if (!aVar.b || Build.VERSION.SDK_INT < 30) {
            i = 2;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            List historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                C4448id0 c4448id0 = this.g;
                C5303mS0 c5303mS0 = new C5303mS0(c4448id0);
                c5303mS0.b = C5303mS0.c;
                if (str != null) {
                    c5303mS0.b = new C0989Fl1(c4448id0.b(str, "userlog"));
                }
                YZ0 yz0 = new YZ0(c4448id0);
                C6592sb2 c6592sb2 = new C6592sb2(str, c4448id0, this.e);
                c6592sb2.d.a.getReference().a(yz0.b(str, false));
                c6592sb2.e.a.getReference().a(yz0.b(str, true));
                c6592sb2.f.set(yz0.c(str), false);
                long jLastModified = c7393wP.b.b(str, "start-time").lastModified();
                Iterator it = historicalProcessExitReasons.iterator();
                do {
                    if (it.hasNext()) {
                        applicationExitInfoA = C4722jh0.a(it.next());
                        if (applicationExitInfoA.getTimestamp() < jLastModified) {
                        }
                    }
                    applicationExitInfoA = null;
                    break;
                } while (applicationExitInfoA.getReason() != 6);
                if (applicationExitInfoA == null) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } else {
                    try {
                        InputStream traceInputStream = applicationExitInfoA.getTraceInputStream();
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i3 = traceInputStream.read(bArr);
                                if (i3 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                }
                                string = null;
                            }
                            string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } else {
                            string = null;
                        }
                    } catch (IOException e) {
                        b0.f("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoA.toString() + " Error: " + e, null);
                    }
                    C2325Wn.a aVar2 = new C2325Wn.a();
                    aVar2.d = Integer.valueOf(applicationExitInfoA.getImportance());
                    String processName = applicationExitInfoA.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar2.b = processName;
                    aVar2.c = Integer.valueOf(applicationExitInfoA.getReason());
                    aVar2.g = Long.valueOf(applicationExitInfoA.getTimestamp());
                    aVar2.a = Integer.valueOf(applicationExitInfoA.getPid());
                    aVar2.e = Long.valueOf(applicationExitInfoA.getPss());
                    aVar2.f = Long.valueOf(applicationExitInfoA.getRss());
                    aVar2.h = string;
                    C2325Wn c2325WnA = aVar2.a();
                    C5923pP c5923pP = wi1.a;
                    int i4 = c5923pP.a.getResources().getConfiguration().orientation;
                    C4070go.a aVar3 = new C4070go.a();
                    aVar3.b = "anr";
                    long j2 = c2325WnA.g;
                    aVar3.a = Long.valueOf(j2);
                    if (c5923pP.e.b().b.c) {
                        ArrayList arrayList2 = c5923pP.c.c;
                        if (arrayList2.size() > 0) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                int i5 = i4;
                                C3671ev c3671ev = (C3671ev) it2.next();
                                Iterator it3 = it2;
                                String str2 = c3671ev.a;
                                if (str2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                long j3 = j2;
                                String str3 = c3671ev.b;
                                if (str3 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str4 = c3671ev.c;
                                if (str4 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList3.add(new C2429Xn(str3, str2, str4));
                                it2 = it3;
                                j2 = j3;
                                i4 = i5;
                            }
                            i2 = i4;
                            j = j2;
                            c1255Iw0 = new C1255Iw0<>(arrayList3);
                        } else {
                            i2 = i4;
                            j = j2;
                            c1255Iw0 = null;
                        }
                    } else {
                        i2 = i4;
                        j = j2;
                        c1255Iw0 = null;
                    }
                    C2325Wn.a aVar4 = new C2325Wn.a();
                    aVar4.d = Integer.valueOf(c2325WnA.d);
                    String str5 = c2325WnA.b;
                    if (str5 == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar4.b = str5;
                    aVar4.c = Integer.valueOf(c2325WnA.c);
                    aVar4.g = Long.valueOf(j);
                    aVar4.a = Integer.valueOf(c2325WnA.a);
                    aVar4.e = Long.valueOf(c2325WnA.e);
                    aVar4.f = Long.valueOf(c2325WnA.f);
                    aVar4.h = c2325WnA.h;
                    aVar4.i = c1255Iw0;
                    C2325Wn c2325WnA2 = aVar4.a();
                    aVar3.c = new C4280ho(new C4489io(null, null, c2325WnA2, new C5168lo("0", "0", 0L), c5923pP.a()), null, null, Boolean.valueOf(c2325WnA2.d != 100), i2);
                    aVar3.d = c5923pP.b(i2);
                    C4070go c4070goA = aVar3.a();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    c7393wP.d(WI1.a(c4070goA, c5303mS0, c6592sb2), str, true);
                }
                i = 2;
            } else {
                i = 2;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        }
        C5080lP c5080lP = this.j;
        if (c5080lP.c(str)) {
            Log.isLoggable("FirebaseCrashlytics", i);
            c5080lP.a(str).getClass();
            b0.f("FirebaseCrashlytics", "No minidump data found for session " + str, null);
        }
        boolean z2 = false;
        Object obj = z != 0 ? (String) arrayList.get(0) : null;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C4448id0 c4448id1 = c7393wP.b;
        c4448id1.getClass();
        File file = c4448id1.a;
        C4448id0.a(new File(file, ".com.google.firebase.crashlytics"));
        C4448id0.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            C4448id0.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> navigableSetC = c7393wP.c();
        if (obj != null) {
            navigableSetC.remove(obj);
        }
        int size = navigableSetC.size();
        File file2 = c4448id1.c;
        if (size > 8) {
            while (navigableSetC.size() > 8) {
                String str6 = (String) navigableSetC.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                C4448id0.d(new File(file2, str6));
                navigableSetC.remove(str6);
            }
        }
        for (String str7 : navigableSetC) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            C6762tP c6762tP = C7393wP.h;
            File file3 = new File(file2, str7);
            file3.mkdirs();
            List listE = C4448id0.e(file3.listFiles(c6762tP));
            if (!listE.isEmpty()) {
                Collections.sort(listE);
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = listE.iterator();
                boolean z3 = z2;
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    C6342rP c6342rP = C7393wP.f;
                    if (!zHasNext) {
                        if (!arrayList4.isEmpty()) {
                            String strC = new YZ0(c4448id1).c(str7);
                            File fileB = c4448id1.b(str7, "report");
                            try {
                                String strE = C7393wP.e(fileB);
                                c6342rP.getClass();
                                C2165Un c2165UnG = C6342rP.g(strE);
                                C2165Un.a aVarI = c2165UnG.i();
                                AbstractC5713oP.e eVar = c2165UnG.h;
                                if (eVar != null) {
                                    C3022bo.a aVarL = eVar.l();
                                    aVarL.d = Long.valueOf(jCurrentTimeMillis);
                                    aVarL.e = Boolean.valueOf(z3);
                                    if (strC != null) {
                                        aVarL.g = new C6430ro(strC);
                                    }
                                    aVarI.g = aVarL.a();
                                }
                                C2165Un c2165UnA = aVarI.a();
                                C1255Iw0<AbstractC5713oP.e.d> c1255Iw1 = new C1255Iw0<>(arrayList4);
                                AbstractC5713oP.e eVar2 = c2165UnA.h;
                                if (eVar2 == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                C2165Un.a aVarI2 = c2165UnA.i();
                                C3022bo.a aVarL2 = eVar2.l();
                                aVarL2.j = c1255Iw1;
                                aVarI2.g = aVarL2.a();
                                C2165Un c2165UnA2 = aVarI2.a();
                                AbstractC5713oP.e eVar3 = c2165UnA2.h;
                                if (eVar3 == null) {
                                    break;
                                }
                                File file4 = z3 ? new File(c4448id1.e, eVar3.g()) : new File(c4448id1.d, eVar3.g());
                                YK yk = C6342rP.a;
                                yk.getClass();
                                StringWriter stringWriter = new StringWriter();
                                try {
                                    DG0 dg0 = (DG0) yk.d;
                                    WH0 wh0 = new WH0(stringWriter, dg0.a, dg0.b, dg0.c, dg0.d);
                                    wh0.g(c2165UnA2);
                                    wh0.i();
                                    wh0.b.flush();
                                } catch (IOException unused) {
                                }
                                C7393wP.f(file4, stringWriter.toString());
                                break;
                            } catch (IOException e2) {
                                b0.f("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB, e2);
                                break;
                            }
                        }
                        b0.f("FirebaseCrashlytics", "Could not parse event files for session " + str7, null);
                        break;
                    }
                    File file5 = (File) it4.next();
                    try {
                        String strE2 = C7393wP.e(file5);
                        c6342rP.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE2));
                            try {
                                C4070go c4070goD = C6342rP.d(jsonReader);
                                jsonReader.close();
                                arrayList4.add(c4070goD);
                                if (z3) {
                                    z3 = true;
                                } else {
                                    String name = file5.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IllegalStateException e3) {
                            throw new IOException(e3);
                        }
                    } catch (IOException e4) {
                        b0.f("FirebaseCrashlytics", "Could not add event to report for " + file5, e4);
                    }
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
            C4448id0.d(new File(file2, str7));
            z2 = false;
        }
        C6326rJ1.b bVar = c7393wP.c.b().a;
        ArrayList arrayListB = c7393wP.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it5 = arrayListB.subList(4, size2).iterator();
        while (it5.hasNext()) {
            ((File) it5.next()).delete();
        }
    }

    public final boolean d(C7587xJ1 c7587xJ1) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        C7813yP c7813yP = this.m;
        if (c7813yP != null && c7813yP.i.get()) {
            b0.f("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            c(true, c7587xJ1);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return true;
        } catch (Exception e) {
            b0.d("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> e(Task<C6326rJ1> task) {
        Task<Void> task2;
        Task task3;
        C4448id0 c4448id0 = this.l.b.b;
        boolean zIsEmpty = C4448id0.e(c4448id0.d.listFiles()).isEmpty();
        TaskCompletionSource<Boolean> taskCompletionSource = this.n;
        if (zIsEmpty && C4448id0.e(c4448id0.e.listFiles()).isEmpty() && C4448id0.e(c4448id0.f.listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        C6142qS c6142qS = this.b;
        if (c6142qS.a()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (c6142qS.b) {
                task2 = c6142qS.c.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new C8056za());
            Log.isLoggable("FirebaseCrashlytics", 3);
            Task<Boolean> task4 = this.o.getTask();
            ExecutorService executorService = Ac2.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            RF0 rf0 = new RF0(taskCompletionSource2);
            taskOnSuccessTask.continueWith(rf0);
            task4.continueWith(rf0);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new a(task));
    }
}
