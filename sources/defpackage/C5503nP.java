package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import io.sentry.android.core.b0;
import io.sentry.okhttp.h;
import io.sentry.util.network.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5503nP implements InterfaceC5056lH, c.b {
    public final /* synthetic */ Object d;

    public /* synthetic */ C5503nP(Object obj) {
        this.d = obj;
    }

    @Override // io.sentry.util.network.c.b
    public LinkedHashMap a(Object obj) {
        C0857Dt1 resp = (C0857Dt1) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        C2813ao0 c2813ao0 = resp.j;
        ((h) this.d).getClass();
        return h.f(c2813ao0);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [YO] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        String str;
        int i;
        int i2;
        String str2;
        Task<Void> task;
        Task taskOnSuccessTask;
        ?? r5;
        boolean z;
        boolean z2;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        C6326rJ1 c6326rJ1A;
        ((CrashlyticsRegistrar) this.d).getClass();
        C1198Id0 c1198Id0 = (C1198Id0) c1480Lt1.a(C1198Id0.class);
        InterfaceC7203vW interfaceC7203vWH = c1480Lt1.h(InterfaceC4660jP.class);
        InterfaceC7203vW interfaceC7203vWH2 = c1480Lt1.h(InterfaceC5746oa.class);
        InterfaceC2400Xd0 interfaceC2400Xd0 = (InterfaceC2400Xd0) c1480Lt1.a(InterfaceC2400Xd0.class);
        c1198Id0.a();
        Context context = c1198Id0.a;
        String packageName = context.getPackageName();
        C4448id0 c4448id0 = new C4448id0(context);
        C6142qS c6142qS = new C6142qS(c1198Id0);
        C7503wv0 c7503wv0 = new C7503wv0(context, packageName, interfaceC2400Xd0, c6142qS);
        C5080lP c5080lP = new C5080lP(interfaceC7203vWH);
        C7215va c7215va = new C7215va(interfaceC7203vWH2);
        C4192hP c4192hP = new C4192hP(c1198Id0, c7503wv0, c5080lP, c6142qS, new C6585sa(c7215va), new C6795ta(c7215va), c4448id0, C3177ca0.a("Crashlytics Exception Handler"));
        c1198Id0.a();
        String str3 = c1198Id0.c.b;
        int iD = C7155vG.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD == 0) {
            iD = C7155vG.d(context, "com.crashlytics.android.build_id", "string");
        }
        String string = iD != 0 ? context.getResources().getString(iD) : null;
        ArrayList arrayList = new ArrayList();
        int iD2 = C7155vG.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD3 = C7155vG.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD4 = C7155vG.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
            str = null;
            i = 1;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4));
            i2 = 3;
            Log.isLoggable("FirebaseCrashlytics", 3);
        } else {
            String[] stringArray = context.getResources().getStringArray(iD2);
            String[] stringArray2 = context.getResources().getStringArray(iD3);
            String[] stringArray3 = context.getResources().getStringArray(iD4);
            str = null;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i3 = 0; i3 < stringArray3.length; i3++) {
                    arrayList.add(new C3671ev(stringArray[i3], stringArray2[i3], stringArray3[i3]));
                }
                i = 1;
            } else {
                i = 1;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            i2 = 3;
        }
        Log.isLoggable("FirebaseCrashlytics", i2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = ((C3671ev) it.next()).a;
            Log.isLoggable("FirebaseCrashlytics", i2);
            i2 = 3;
        }
        C4576j00 c4576j00 = new C4576j00(context);
        try {
            String packageName2 = context.getPackageName();
            String strD = c7503wv0.d();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string2 = Integer.toString(packageInfo.versionCode);
            String str5 = packageInfo.versionName;
            if (str5 == null) {
                str5 = "0.0";
            }
            String str6 = str5;
            C1434Le c1434Le = new C1434Le(str3, string, arrayList, strD, packageName2, string2, str6, c4576j00);
            String str7 = str3;
            String str8 = string2;
            Log.isLoggable("FirebaseCrashlytics", 2);
            ExecutorService executorServiceA = C3177ca0.a("com.google.firebase.crashlytics.startup");
            C7279vr c7279vr = new C7279vr();
            String strD2 = c7503wv0.d();
            C3481e1 c3481e1 = new C3481e1();
            ZB0 zb0 = new ZB0(c3481e1);
            C7087ux c7087ux = new C7087ux(c4448id0);
            Locale locale = Locale.US;
            YK yk = new YK(C1039Gc0.d("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str7, "/settings"), c7279vr);
            String str9 = Build.MANUFACTURER;
            String str10 = C7503wv0.h;
            String strB = C2629a1.b(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
            String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
            String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
            int iD5 = C7155vG.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iD5 == 0) {
                iD5 = C7155vG.d(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {iD5 != 0 ? context.getResources().getString(iD5) : str, str7, str6, str8};
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (true) {
                str2 = str7;
                if (i4 >= 4) {
                    break;
                }
                String str11 = strArr[i4];
                String str12 = str8;
                if (str11 != null) {
                    arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                }
                i4++;
                str7 = str2;
                str8 = str12;
            }
            String str13 = str8;
            Collections.sort(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            String string3 = sb.toString();
            C7587xJ1 c7587xJ1 = new C7587xJ1(context, new FJ1(str2, strB, strReplaceAll, strReplaceAll2, c7503wv0, string3.length() > 0 ? C7155vG.i(string3) : str, str6, str13, C4564j.a(strD2 == null ? i : 4)), c3481e1, zb0, c7087ux, yk, c6142qS);
            EnumC6746tJ1 enumC6746tJ1 = EnumC6746tJ1.d;
            boolean zEquals = c7587xJ1.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(c7587xJ1.b.f);
            AtomicReference<TaskCompletionSource<C6326rJ1>> atomicReference = c7587xJ1.i;
            AtomicReference<C6326rJ1> atomicReference2 = c7587xJ1.h;
            if (!zEquals || (c6326rJ1A = c7587xJ1.a(enumC6746tJ1)) == null) {
                C6326rJ1 c6326rJ1A2 = c7587xJ1.a(EnumC6746tJ1.g);
                if (c6326rJ1A2 != null) {
                    atomicReference2.set(c6326rJ1A2);
                    atomicReference.get().trySetResult(c6326rJ1A2);
                }
                C6142qS c6142qS2 = c7587xJ1.g;
                Task<Void> task2 = c6142qS2.e.getTask();
                synchronized (c6142qS2.b) {
                    task = c6142qS2.c.getTask();
                }
                ExecutorService executorService = Ac2.a;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                C6741tI c6741tI = new C6741tI(taskCompletionSource);
                task2.continueWith(executorServiceA, c6741tI);
                task.continueWith(executorServiceA, c6741tI);
                Task task3 = taskCompletionSource.getTask();
                C7377wJ1 c7377wJ1 = new C7377wJ1();
                c7377wJ1.d = c7587xJ1;
                taskOnSuccessTask = task3.onSuccessTask(executorServiceA, c7377wJ1);
            } else {
                atomicReference2.set(c6326rJ1A);
                atomicReference.get().trySetResult(c6326rJ1A);
                taskOnSuccessTask = Tasks.forResult(str);
            }
            taskOnSuccessTask.continueWith(executorServiceA, new QO(3));
            RO ro = c4192hP.m;
            C4448id0 c4448id1 = c4192hP.i;
            Context context2 = c4192hP.a;
            if (context2 == null || (resources = context2.getResources()) == null) {
                r5 = i;
            } else {
                int iD6 = C7155vG.d(context2, "com.crashlytics.RequireBuildId", "bool");
                if (iD6 > 0) {
                    r5 = resources.getBoolean(iD6);
                } else {
                    int iD7 = C7155vG.d(context2, "com.crashlytics.RequireBuildId", "string");
                    if (iD7 > 0) {
                        r5 = Boolean.parseBoolean(context2.getString(iD7));
                    } else {
                        r5 = i;
                    }
                }
            }
            if (r5 == 0) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else if (TextUtils.isEmpty(c1434Le.b)) {
                b0.c("FirebaseCrashlytics", ".");
                b0.c("FirebaseCrashlytics", ".     |  | ");
                b0.c("FirebaseCrashlytics", ".     |  |");
                b0.c("FirebaseCrashlytics", ".     |  |");
                b0.c("FirebaseCrashlytics", ".   \\ |  | /");
                b0.c("FirebaseCrashlytics", ".    \\    /");
                b0.c("FirebaseCrashlytics", ".     \\  /");
                b0.c("FirebaseCrashlytics", ".      \\/");
                b0.c("FirebaseCrashlytics", ".");
                b0.c("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                b0.c("FirebaseCrashlytics", ".");
                b0.c("FirebaseCrashlytics", ".      /\\");
                b0.c("FirebaseCrashlytics", ".     /  \\");
                b0.c("FirebaseCrashlytics", ".    /    \\");
                b0.c("FirebaseCrashlytics", ".   / |  | \\");
                b0.c("FirebaseCrashlytics", ".     |  |");
                b0.c("FirebaseCrashlytics", ".     |  |");
                b0.c("FirebaseCrashlytics", ".     |  |");
                b0.c("FirebaseCrashlytics", ".");
                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            }
            new C2839ax(c4192hP.h);
            String str14 = C2839ax.b;
            try {
                c4192hP.f = new C4402iP("crash_marker", c4448id1);
                c4192hP.e = new C4402iP("initialization_marker", c4448id1);
                C6592sb2 c6592sb2 = new C6592sb2(str14, c4448id1, ro);
                C5303mS0 c5303mS0 = new C5303mS0(c4448id1);
                WO1[] wo1Arr = new WO1[i];
                z = false;
                try {
                    wo1Arr[0] = new C4019gb();
                    try {
                        WI1 wi1B = WI1.b(c4192hP.a, c4192hP.h, c4192hP.i, c1434Le, c5303mS0, c6592sb2, new C4376iG0(wo1Arr), c7587xJ1, c4192hP.c);
                        c7587xJ1 = c7587xJ1;
                        c4192hP.g = new YO(c4192hP.a, c4192hP.m, c4192hP.h, c4192hP.b, c4192hP.i, c4192hP.f, c1434Le, c6592sb2, c5303mS0, wi1B, c4192hP.n, c4192hP.k);
                        C4402iP c4402iP = c4192hP.e;
                        String str15 = c4402iP.a;
                        C4448id0 c4448id2 = c4402iP.b;
                        c4448id2.getClass();
                        boolean zExists = new File(c4448id2.b, str15).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) Ac2.a(ro.a(new CallableC3982gP(c4192hP))));
                        } catch (Exception unused) {
                        }
                        YO yo = c4192hP.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        yo.getClass();
                        yo.e.a(new CallableC2710aP(yo, str14));
                        C7813yP c7813yP = new C7813yP(new TO(yo), c7587xJ1, defaultUncaughtExceptionHandler, yo.j);
                        yo.m = c7813yP;
                        Thread.setDefaultUncaughtExceptionHandler(c7813yP);
                        if (!zExists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            z2 = true;
                        } else {
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            Future<?> futureSubmit = c4192hP.l.submit(new RunnableC3562eP(c4192hP, c7587xJ1));
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            try {
                                try {
                                    try {
                                        futureSubmit.get(4L, TimeUnit.SECONDS);
                                    } catch (InterruptedException e) {
                                        b0.d("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
                                    }
                                } catch (ExecutionException e2) {
                                    b0.d("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
                                }
                            } catch (TimeoutException e3) {
                                b0.d("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
                            }
                            z2 = z;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        c7587xJ1 = c7587xJ1;
                        b0.d("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                        c4192hP.g = str;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception e6) {
                e = e6;
                z = false;
            }
            Tasks.call(executorServiceA, new CallableC1587Nd0(z2, c4192hP, c7587xJ1));
            return new C1668Od0(c4192hP);
        } catch (PackageManager.NameNotFoundException e7) {
            String str16 = str;
            b0.d("FirebaseCrashlytics", "Error retrieving app package info.", e7);
            return str16;
        }
    }
}
