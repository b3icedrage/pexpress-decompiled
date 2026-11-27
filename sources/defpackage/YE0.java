package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class YE0 {
    public static final YE0 d;
    public static final YE0 e;
    public static final YE0 g;
    public static final /* synthetic */ YE0[] h;

    static {
        YE0 ye0 = new YE0("INFLEXIBLE", 0);
        d = ye0;
        YE0 ye1 = new YE0("FLEXIBLE_UPPER_BOUND", 1);
        e = ye1;
        YE0 ye2 = new YE0("FLEXIBLE_LOWER_BOUND", 2);
        g = ye2;
        YE0[] ye0Arr = {ye0, ye1, ye2};
        h = ye0Arr;
        C1952Ru.i(ye0Arr);
    }

    public YE0() {
        throw null;
    }

    public static YE0 valueOf(String str) {
        return (YE0) Enum.valueOf(YE0.class, str);
    }

    public static YE0[] values() {
        return (YE0[]) h.clone();
    }
}
