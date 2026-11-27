package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {
    public final List<b> e;

    public a(@NotNull List<b> list, @NotNull ILogger iLogger) {
        super(iLogger);
        this.e = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            Map<String, String> mapA = it.next().a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
