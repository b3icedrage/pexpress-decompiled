package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C0<K, V, V2> implements InterfaceC5331mb0<Map<K, V2>> {
    public final Map<K, InterfaceC1454Lk1<V>> a;

    public static abstract class a<K, V, V2> {
        public final LinkedHashMap<K, InterfaceC1454Lk1<V>> a;

        public a(int i) {
            this.a = new LinkedHashMap<>(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final void a(Serializable serializable, InterfaceC1454Lk1 interfaceC1454Lk1) {
            LinkedHashMap<K, InterfaceC1454Lk1<V>> linkedHashMap = this.a;
            C0957Fb.h(interfaceC1454Lk1, "provider");
            linkedHashMap.put(serializable, interfaceC1454Lk1);
        }
    }

    public C0(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }
}
