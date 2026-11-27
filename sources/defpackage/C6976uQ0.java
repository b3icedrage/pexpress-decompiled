package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6976uQ0<K, V> extends GW0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    @NotNull
    public final C1306Jn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6976uQ0(@NotNull RJ0<K> kSerializer, @NotNull RJ0<V> vSerializer) {
        super(kSerializer, vSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        MH1 keyDesc = kSerializer.c();
        MH1 valueDesc = vSerializer.c();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.c = new C1306Jn0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.c;
    }

    @Override // defpackage.Z
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.Z
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
