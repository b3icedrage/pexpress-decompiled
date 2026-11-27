package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: rS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6351rS {
    public final InterfaceC2318Wk1 a;
    public final boolean b;

    public C6351rS(Context context, String str, InterfaceC2318Wk1 interfaceC2318Wk1) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context contextCreateDeviceProtectedStorageContext = C6333rM.createDeviceProtectedStorageContext(context);
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.a = interfaceC2318Wk1;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.b = z;
    }
}
