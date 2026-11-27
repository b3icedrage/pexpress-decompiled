package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1qSDK {
    public static String AFKeystoreWrapper(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, e.getMessage() != null ? e.getMessage() : "Failed to retrieve version name", e);
            return "";
        }
    }

    public static boolean AFLogger(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public static Map<String, String> W_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        byte b;
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (map.containsKey(next)) {
                    str = next;
                } else {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -1420799080) {
                        if (iHashCode != 99) {
                            if (iHashCode == 110987 && next.equals("pid")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (next.equals("c")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (next.equals("af_prt")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        str = "campaign";
                    } else if (b != 1) {
                        if (b != 2) {
                            str = next;
                        } else {
                            str = "agency";
                        }
                    }
                }
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Could not fetch app install time", e);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public static Application X_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Application or Activity Context should be used", new IllegalStateException());
            return null;
        }
    }

    public static Pair<Long, String> d(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    public static boolean registerClient(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean unregisterClient(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long unregisterClient(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, e.getMessage() != null ? e.getMessage() : "Failed to retrieve version code", e);
            return 0L;
        }
    }
}
