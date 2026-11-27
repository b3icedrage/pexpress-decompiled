package io.sentry.util.network;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    public interface a<T> {
        @Nullable
        io.sentry.util.network.a a(@NotNull T t);
    }

    public interface b<T> {
        @NotNull
        LinkedHashMap a(@NotNull Object obj);
    }

    @NotNull
    public static <T> e a(@NotNull T t, @Nullable Long l, boolean z, @NotNull a<T> aVar, @NotNull List<String> list, @NotNull b<T> bVar) {
        io.sentry.util.network.a aVarA = z ? aVar.a(t) : null;
        LinkedHashMap linkedHashMapA = bVar.a(t);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        for (String str : list) {
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new e(l, aVarA, linkedHashMap);
    }
}
