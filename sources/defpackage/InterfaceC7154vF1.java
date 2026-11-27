package defpackage;

import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7154vF1 {
    static boolean b(@Nullable String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.a(NG1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    @Nullable
    C6944uF1 a(@NotNull SD1 sd1, @NotNull C2688aH1 c2688aH1);
}
