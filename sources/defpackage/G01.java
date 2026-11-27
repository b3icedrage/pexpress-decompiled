package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class G01<A, B> {
    public final F01 a = new F01(500);

    public static final class a<A> {
        public static final ArrayDeque b;
        public A a;

        static {
            char[] cArr = C6177qc2.a;
            b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.a = obj;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
