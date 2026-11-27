package io.sentry.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4529c {
    @Nullable
    public static ConcurrentHashMap a(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }
}
