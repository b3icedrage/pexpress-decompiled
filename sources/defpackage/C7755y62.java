package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7755y62 {

    @NotNull
    public final LinkedHashMap a;

    public C7755y62(@NotNull LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.a = map;
    }

    @NotNull
    public final C7755y62 a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C2905bF0 c2905bF0 = (C2905bF0) entry.getValue();
            linkedHashMap2.put(key, new C2905bF0(c2905bF0.a, c2905bF0.b, c2905bF0.c, true));
        }
        return new C7755y62(linkedHashMap2);
    }
}
