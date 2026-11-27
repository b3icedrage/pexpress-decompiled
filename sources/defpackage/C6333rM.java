package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: rM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C6333rM {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* JADX INFO: renamed from: rM$a */
    public static class a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: rM$b */
    public static class b {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: rM$c */
    public static class c {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: rM$d */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, C6333rM.obtainAndCheckReceiverPermission(context), handler);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: rM$e */
    public static class e {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: rM$f */
    public static class f {
        @NonNull
        public static Context a(@NonNull Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                b0.e(C6333rM.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: renamed from: rM$g */
    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return B61.a.a(new B61(context).b) ? 0 : -1;
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        return c.a(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    b0.e(TAG, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return a.a(context);
    }

    public static int getColor(@NonNull Context context, int i) {
        return b.a(context, i);
    }

    public static ColorStateList getColorStateList(@NonNull Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        C7708xt1.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C7708xt1.d dVar = new C7708xt1.d(resources, theme);
        synchronized (C7708xt1.c) {
            try {
                SparseArray<C7708xt1.c> sparseArray = C7708xt1.b.get(dVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (cVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || cVar.c != 0) {
                            if (theme == null || cVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = cVar.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = C3952gF.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                b0.f("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return C7708xt1.b.b(resources, i, theme);
        }
        synchronized (C7708xt1.c) {
            try {
                WeakHashMap<C7708xt1.d, SparseArray<C7708xt1.c>> weakHashMap = C7708xt1.b;
                SparseArray<C7708xt1.c> sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i, new C7708xt1.c(colorStateListA, dVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0068 A[EXC_TOP_SPLITTER, PHI: r1
      0x0068: PHI (r1v5 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:35:0x0075, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @NonNull
    public static Context getContextForLanguage(@NonNull Context context) {
        String attributeValue;
        OR0 or0A;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService("locale");
            or0A = systemService != null ? new OR0(new QR0(RR0.a(systemService))) : OR0.b;
        } else {
            synchronized (C4994l.a) {
                attributeValue = "";
                try {
                    try {
                        FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        try {
                            try {
                                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                                xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                                int depth = xmlPullParserNewPullParser.getDepth();
                                while (true) {
                                    int next = xmlPullParserNewPullParser.next();
                                    if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                        if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                            attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException | XmlPullParserException unused3) {
                            b0.e("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (FileNotFoundException unused4) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            or0A = OR0.a(attributeValue);
        }
        if (Build.VERSION.SDK_INT > 32 || or0A.a.a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        OI.b(configuration, or0A);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(@NonNull Context context) {
        return c.b(context);
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(@NonNull Context context, int i) {
        return a.b(context, i);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : new V90(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(@NonNull Context context) {
        return a.c(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (C6772tS0.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(C1039Gc0.d("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (i5 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
