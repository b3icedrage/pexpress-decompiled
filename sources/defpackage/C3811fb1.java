package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: fb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3811fb1 {
    static {
        AS0.d("PackageManagerHelper");
    }

    public static void a(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            AS0.c().getClass();
        } catch (Exception unused) {
            AS0.c().getClass();
        }
    }
}
