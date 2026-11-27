package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6799tb {

    @NotNull
    public final Context a;

    @NotNull
    public final DS0 b;
    public final boolean c;

    public C6799tb(@NotNull Context context, @NotNull DS0 logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = context;
        this.b = logger;
        boolean z = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        this.c = z;
        if (z) {
            return;
        }
        logger.warn("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }
}
