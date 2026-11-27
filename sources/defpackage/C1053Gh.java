package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053Gh {
    public static int a(AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    @NonNull
    public static String b(@NonNull Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
