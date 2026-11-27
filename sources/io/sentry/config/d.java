package io.sentry.config;

import io.sentry.util.x;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {
    @NotNull
    public static String f(@NotNull String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.f
    @Nullable
    public final String a(@NotNull String str) {
        return x.d(System.getenv(f(str)));
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map d() {
        String strD;
        String str = f("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strD = x.d(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strD);
            }
        }
        return concurrentHashMap;
    }
}
