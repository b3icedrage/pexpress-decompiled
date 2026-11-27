package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: uW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6994uW0<K, V> extends C0<K, V, V> {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: uW0$a */
    public static final class a<K, V> extends C0.a<K, V, V> {
    }

    static {
        C0957Fb.h(Collections.EMPTY_MAP, "instance cannot be null");
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        Map<K, InterfaceC1454Lk1<V>> map = this.a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        for (Map.Entry<K, InterfaceC1454Lk1<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
