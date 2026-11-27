package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    public static final class a extends n {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // io.sentry.transport.n
        public final int a() {
            return this.a;
        }

        @Override // io.sentry.transport.n
        public final boolean b() {
            return false;
        }
    }

    public static final class b extends n {
        public static final b a = new b();

        @Override // io.sentry.transport.n
        public final int a() {
            return -1;
        }

        @Override // io.sentry.transport.n
        public final boolean b() {
            return true;
        }
    }

    public abstract int a();

    public abstract boolean b();
}
