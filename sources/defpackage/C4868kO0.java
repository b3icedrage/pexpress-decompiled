package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: kO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4868kO0 extends C5921pO0 {

    /* JADX INFO: renamed from: kO0$a */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, C4868kO0> d;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.d.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C4868kO0 value = this.d.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof IZ0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C4868kO0 value = this.d.getValue();
            IZ0 iz0 = value.a;
            value.b = null;
            value.a = (IZ0) obj;
            return iz0;
        }
    }

    /* JADX INFO: renamed from: kO0$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.d.next();
            if (!(next.getValue() instanceof C4868kO0)) {
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

    @Override // defpackage.C5921pO0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // defpackage.C5921pO0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
