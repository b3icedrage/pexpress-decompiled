package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LC {
    public static final LC d;
    public static final LC e;
    public static final /* synthetic */ LC[] g;

    static {
        LC lc = new LC("NONE", 0);
        d = lc;
        LC lc2 = new LC("ALL_JSON_OBJECTS", 1);
        LC lc3 = new LC("POLYMORPHIC", 2);
        e = lc3;
        LC[] lcArr = {lc, lc2, lc3};
        g = lcArr;
        C1952Ru.i(lcArr);
    }

    public LC() {
        throw null;
    }

    public static LC valueOf(String str) {
        return (LC) Enum.valueOf(LC.class, str);
    }

    public static LC[] values() {
        return (LC[]) g.clone();
    }
}
