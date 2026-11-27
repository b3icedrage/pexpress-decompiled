package kotlinx.serialization.json;

import defpackage.C5934pS1;
import defpackage.C6110qH0;
import defpackage.InterfaceC6745tJ0;
import defpackage.ML0;
import defpackage.RJ0;
import defpackage.XH1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = C6110qH0.class)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, InterfaceC6745tJ0 {

    @NotNull
    public static final Companion Companion = new Companion();

    @NotNull
    public final Map<String, JsonElement> d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "LRJ0;", "Lkotlinx/serialization/json/JsonObject;", "serializer", "()LRJ0;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final RJ0<JsonObject> serializer() {
            return C6110qH0.a;
        }
    }

    public static final class a extends ML0 implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<? extends String, ? extends JsonElement> entry) {
            Map.Entry<? extends String, ? extends JsonElement> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "<name for destructuring parameter 0>");
            String key = entry2.getKey();
            JsonElement value = entry2.getValue();
            StringBuilder sb = new StringBuilder();
            C5934pS1.a(key, sb);
            sb.append(':');
            sb.append(value);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(@NotNull Map<String, ? extends JsonElement> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.d = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.d.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        JsonElement value = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.d.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.d.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return Intrinsics.a(this.d, obj);
    }

    @Override // java.util.Map
    public final JsonElement get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.d.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.d.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @NotNull
    public final String toString() {
        return CollectionsKt.J(this.d.entrySet(), ",", "{", "}", a.d, 24);
    }

    @Override // java.util.Map
    public final Collection<JsonElement> values() {
        return this.d.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
