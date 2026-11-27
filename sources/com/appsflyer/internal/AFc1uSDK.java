package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.BG;
import defpackage.C1039Gc0;
import defpackage.C1332Jw;
import defpackage.C1526Mj;
import defpackage.C2904bF;
import defpackage.C6179qd0;
import defpackage.C6621sj;
import defpackage.PW0;
import defpackage.QF1;
import defpackage.VE;
import defpackage.WE;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1uSDK implements AFc1vSDK {

    @NotNull
    private final AFc1qSDK AFKeystoreWrapper;

    @NotNull
    private final Map<String, Integer> AFLogger;

    @NotNull
    private final AFc1kSDK d;

    @NotNull
    private final AFd1zSDK registerClient;

    public AFc1uSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.registerClient = aFd1zSDK;
        this.d = aFc1kSDK;
        this.AFKeystoreWrapper = new AFc1qSDK(WE.f(new AFc1pSDK("ConversionsCache", VE.c(AFd1bSDK.CONVERSION), 1), new AFc1pSDK("AttrCache", VE.c(AFd1bSDK.ATTR), 1), new AFc1pSDK("OtherCache", WE.f(AFd1bSDK.LAUNCH, AFd1bSDK.INAPP, AFd1bSDK.ADREVENUE, AFd1bSDK.ARS_VALIDATE, AFd1bSDK.PURCHASE_VALIDATE, AFd1bSDK.MANUAL_PURCHASE_VALIDATION), 40)));
        this.AFLogger = PW0.f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void registerClient() {
        for (AFc1pSDK aFc1pSDK : this.AFKeystoreWrapper.d) {
            String str = aFc1pSDK.d;
            Context context = this.registerClient.d;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.AFLogger;
                String str2 = aFc1pSDK.d;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.AFLogger.put(aFc1pSDK.d, 0);
            }
        }
    }

    private static AFc1sSDK unregisterClient(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(io.sentry.instrumentation.file.f.a.a(file, new FileInputStream(file)), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1sSDK aFc1sSDK = new AFc1sSDK(cArr);
                aFc1sSDK.registerClient = file.getName();
                inputStreamReader.close();
                return aFc1sSDK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.CACHE, "Error while loading request from cache", e, false, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1sSDK> AFKeystoreWrapper() {
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.registerClient.d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFKeystoreWrapper.d.iterator();
            while (it.hasNext()) {
                String str = ((AFc1pSDK) it.next()).d;
                Context context3 = this.registerClient.d;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                C2904bF.p(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1sSDK aFc1sSDKUnregisterClient = unregisterClient(file2);
                if (aFc1sSDKUnregisterClient != null) {
                    arrayList.add(aFc1sSDKUnregisterClient);
                }
            }
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, C1332Jw.a(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFLogger(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.registerClient.d;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.registerClient.d;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, C1039Gc0.d("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.AFKeystoreWrapper.d.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1pSDK) it.next()).d;
            Context context3 = this.registerClient.d;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return registerClient(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void d() {
        try {
            if (this.d.AFLogger("AF_CACHE_VERSION", -1) == 3) {
                Context context = this.registerClient.d;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.registerClient.d;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.d.d("AF_CACHE_VERSION", 3);
                Context context3 = this.registerClient.d;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.registerClient.d;
                    Intrinsics.checkNotNull(context4);
                    C6179qd0.d(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.registerClient.d;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            registerClient();
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void unregisterClient() {
        try {
            Context context = this.registerClient.d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFKeystoreWrapper.d.iterator();
            while (it.hasNext()) {
                String str = ((AFc1pSDK) it.next()).d;
                Context context3 = this.registerClient.d;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.CACHE;
                        AFLoggerBase.i$default(aFLogger, logTag, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFLoggerBase.i$default(aFLogger, logTag, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.registerClient.d;
            Intrinsics.checkNotNull(context4);
            C6179qd0.d(new File(context4.getFilesDir(), "AFRequestCache"));
            registerClient();
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
        }
    }

    private final boolean registerClient(File file) {
        try {
            file.delete();
            registerClient();
            return true;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, C1039Gc0.d("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1pSDK registerClient(AFe1zSDK aFe1zSDK) {
        Object next;
        Iterator<T> it = this.AFKeystoreWrapper.d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1pSDK) next).unregisterClient.contains(aFe1zSDK)) {
                return (AFc1pSDK) next;
            }
        }
        next = null;
        return (AFc1pSDK) next;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Number] */
    @Override // com.appsflyer.internal.AFc1vSDK
    @Nullable
    public final String registerClient(@NotNull AFc1sSDK aFc1sSDK) {
        String str;
        Exception exc;
        File file;
        String str2;
        List listB;
        List<File> listA0;
        File file2;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        try {
            AFe1zSDK aFe1zSDK = aFc1sSDK.AFLogger;
            Intrinsics.checkNotNullExpressionValue(aFe1zSDK, "");
            Context context = this.registerClient.d;
            Intrinsics.checkNotNull(context);
            File file3 = new File(new File(context.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK));
            if (!file3.exists()) {
                try {
                    file3.mkdirs();
                } catch (Exception e) {
                    exc = e;
                    file = null;
                    str = null;
                    if (file != null) {
                        file.delete();
                    }
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.CACHE;
            AFLoggerBase.i$default(aFLogger, logTag, "Caching request with URL: " + aFc1sSDK.unregisterClient, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file3, strValueOf);
            try {
                file.createNewFile();
                String path = file.getPath();
                FileOutputStream fileOutputStream = new FileOutputStream(path, true);
                if (QF1.e().p().isTracingEnabled()) {
                    if (path != null) {
                        str = null;
                        try {
                            file2 = new File(path);
                        } catch (Exception e2) {
                            e = e2;
                            exc = e;
                            if (file != null) {
                                file.delete();
                            }
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                            return str;
                        }
                    } else {
                        str = null;
                        file2 = null;
                    }
                    fileOutputStream = new io.sentry.instrumentation.file.j(io.sentry.instrumentation.file.j.c(file2, fileOutputStream, true));
                } else {
                    str = null;
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1sSDK.AFKeystoreWrapper);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1sSDK.unregisterClient);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1sSDK.d, 2));
                    outputStreamWriter.write(10);
                    AFe1zSDK aFe1zSDK2 = aFc1sSDK.AFLogger;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1zSDK2.unregisterClient());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1sSDK.e;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1sSDK.e;
                        Intrinsics.c(map2, "");
                        String string = new JSONObject(map2).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    Unit unit = Unit.a;
                    outputStreamWriter.close();
                    AFLoggerBase.i$default(aFLogger, logTag, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1zSDK aFe1zSDK3 = aFc1sSDK.AFLogger;
                    Intrinsics.checkNotNullExpressionValue(aFe1zSDK3, "");
                    AFc1pSDK aFc1pSDKRegisterClient = registerClient(aFe1zSDK3);
                    ?? ValueOf = aFc1pSDKRegisterClient != null ? Integer.valueOf(aFc1pSDKRegisterClient.AFKeystoreWrapper) : str;
                    if (ValueOf == 0) {
                        return strValueOf;
                    }
                    int iIntValue = ValueOf.intValue();
                    Map<String, Integer> map3 = this.AFLogger;
                    AFc1pSDK aFc1pSDKRegisterClient2 = registerClient(aFe1zSDK3);
                    if (aFc1pSDKRegisterClient2 != null && (str2 = aFc1pSDKRegisterClient2.d) != null) {
                        Integer num = map3.get(str2);
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        if (iIntValue2 >= iIntValue) {
                            int i = (iIntValue2 + 1) - iIntValue;
                            AFLoggerBase.i$default(aFLogger, logTag, "Cache overflown for type " + aFe1zSDK3 + ", removing " + i + " item(s)", false, 4, null);
                            Context context2 = this.registerClient.d;
                            Intrinsics.checkNotNull(context2);
                            File file4 = new File(new File(context2.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK3));
                            if (!file4.exists()) {
                                file4.mkdirs();
                            }
                            File[] fileArrListFiles = file4.listFiles();
                            if (fileArrListFiles != null && (listB = C1526Mj.B(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1uSDK.2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return BG.a(((File) t).getName(), ((File) t2).getName());
                                }
                            })) != null && (listA0 = CollectionsKt.a0(i, listB)) != null) {
                                for (File file5 : listA0) {
                                    file5.delete();
                                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Cache entry " + file5.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        registerClient();
                        return strValueOf;
                    }
                    throw new UnsupportedOperationException("Cache do not support this type of events");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str = null;
            }
        } catch (Exception e4) {
            str = null;
            exc = e4;
            file = null;
        }
    }

    private final String unregisterClient(AFe1zSDK aFe1zSDK) {
        String str;
        AFc1pSDK aFc1pSDKRegisterClient = registerClient(aFe1zSDK);
        if (aFc1pSDKRegisterClient == null || (str = aFc1pSDKRegisterClient.d) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }
}
