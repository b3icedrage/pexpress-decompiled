package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    @NotNull
    public final ArrayList a;

    public c(@NotNull ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // io.sentry.config.f
    @Nullable
    public final String a(@NotNull String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String strA = ((f) it.next()).a(str);
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.sentry.config.f
    @NotNull
    public final Map d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((f) it.next()).d());
        }
        return concurrentHashMap;
    }
}
