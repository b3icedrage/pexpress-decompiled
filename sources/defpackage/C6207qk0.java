package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: qk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6207qk0 {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        C6170qb.d();
    }

    public C6207qk0(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
