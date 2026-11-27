package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class a extends Clock implements Serializable {
    static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    a(ZoneId zoneId) {
        this.a = zoneId;
    }

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.a;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
