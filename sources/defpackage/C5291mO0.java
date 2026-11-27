package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: mO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5291mO0 extends C5711oO0 {

    /* JADX INFO: renamed from: mO0$a */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, C5291mO0> d;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C5291mO0 value = this.d.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof HZ0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C5291mO0 value = this.d.getValue();
            HZ0 hz0 = value.a;
            value.a = (HZ0) obj;
            return hz0;
        }
    }

    /* JADX INFO: renamed from: mO0$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.d.next();
            if (!(next.getValue() instanceof C5291mO0)) {
                return next;
            }
            a aVar = new a();
            aVar.d = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
        }
    }

    public final HZ0 a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
