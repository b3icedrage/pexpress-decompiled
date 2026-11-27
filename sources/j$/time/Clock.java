package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Clock {
    public abstract ZoneId a();

    public abstract Instant instant();

    public static Clock systemUTC() {
        return a.b;
    }

    public static Clock b() {
        return new a(ZoneId.systemDefault());
    }

    protected Clock() {
    }
}
