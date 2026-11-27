package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: qS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6142qS {
    public final C1198Id0 a;
    public final Boolean d;
    public final Object b = new Object();
    public final TaskCompletionSource<Void> c = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> e = new TaskCompletionSource<>();

    public C6142qS(C1198Id0 c1198Id0) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        c1198Id0.a();
        Context context = c1198Id0.a;
        this.a = c1198Id0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        Boolean boolValueOf2 = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf2 == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                b0.d("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            boolValueOf2 = boolValueOf == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
        }
        this.d = boolValueOf2;
        synchronized (this.b) {
            try {
                if (a()) {
                    this.c.trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.d;
            zBooleanValue = bool != null ? bool.booleanValue() : this.a.h();
            Log.isLoggable("FirebaseCrashlytics", 3);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }
}
