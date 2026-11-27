package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6784tW0<K, V> extends AbstractC6958uK0<K, V, Map.Entry<? extends K, ? extends V>> {

    @NotNull
    public final OH1 c;

    /* JADX INFO: renamed from: tW0$a */
    public static final class a<K, V> implements Map.Entry<K, V>, InterfaceC6745tJ0 {
        public final K d;
        public final V e;

        public a(K k, V v) {
            this.d = k;
            this.e = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.d, aVar.d) && Intrinsics.a(this.e, aVar.e);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.d;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.e;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public final String toString() {
            return "MapEntry(key=" + this.d + ", value=" + this.e + ')';
        }
    }

    /* JADX INFO: renamed from: tW0$b */
    public static final class b extends ML0 implements Function1<YC, Unit> {
        public final /* synthetic */ RJ0<K> d;
        public final /* synthetic */ RJ0<V> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RJ0<K> rj0, RJ0<V> rj1) {
            super(1);
            this.d = rj0;
            this.e = rj1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(YC yc) {
            YC buildSerialDescriptor = yc;
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            YC.a(buildSerialDescriptor, "key", this.d.c());
            YC.a(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.e.c());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6784tW0(@NotNull RJ0<K> keySerializer, @NotNull RJ0<V> valueSerializer) {
        super(keySerializer, valueSerializer);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.c = SH1.c("kotlin.collections.Map.Entry", RS1.c.a, new MH1[0], new b(keySerializer, valueSerializer));
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.c;
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object e(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object f(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object g(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
