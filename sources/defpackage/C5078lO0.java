package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5078lO0 extends C5501nO0 {

    /* JADX INFO: renamed from: lO0$a */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, C5078lO0> d;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C5078lO0 value = this.d.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof GZ0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C5078lO0 value = this.d.getValue();
            GZ0 gz0 = value.a;
            value.b = null;
            value.a = (GZ0) obj;
            return gz0;
        }
    }

    /* JADX INFO: renamed from: lO0$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.d.next();
            if (!(next.getValue() instanceof C5078lO0)) {
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

    @Override // defpackage.C5501nO0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // defpackage.C5501nO0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
