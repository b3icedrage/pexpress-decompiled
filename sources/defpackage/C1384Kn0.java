package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1384Kn0<K, V> extends GW0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    @NotNull
    public final C1306Jn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384Kn0(@NotNull RJ0<K> kSerializer, @NotNull RJ0<V> vSerializer) {
        super(kSerializer, vSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        MH1 keyDesc = kSerializer.c();
        MH1 valueDesc = vSerializer.c();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.c = new C1306Jn0("kotlin.collections.HashMap", keyDesc, valueDesc);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.c;
    }

    @Override // defpackage.Z
    public final Object e() {
        return new HashMap();
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
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
        return new HashMap((Map) null);
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map;
    }
}
