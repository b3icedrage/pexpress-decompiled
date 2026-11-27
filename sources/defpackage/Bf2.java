package defpackage;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Bf2 {

    @NotNull
    public static final String a;

    static {
        String strD = AS0.d("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"WakeLocks\")");
        a = strD;
    }

    @NotNull
    public static final PowerManager.WakeLock a(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strC = C5491nL.c("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strC);
        synchronized (Cf2.a) {
            Cf2.b.put(wakeLock, strC);
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
