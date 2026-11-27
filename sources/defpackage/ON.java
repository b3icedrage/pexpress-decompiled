package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ON {
    public static final ON d;
    public static final ON e;
    public static final ON g;
    public static final ON h;
    public static final /* synthetic */ ON[] i;

    static {
        ON on = new ON("DEFAULT", 0);
        d = on;
        ON on2 = new ON("LAZY", 1);
        e = on2;
        ON on3 = new ON("ATOMIC", 2);
        g = on3;
        ON on4 = new ON("UNDISPATCHED", 3);
        h = on4;
        ON[] onArr = {on, on2, on3, on4};
        i = onArr;
        C1952Ru.i(onArr);
    }

    public ON() {
        throw null;
    }

    public static ON valueOf(String str) {
        return (ON) Enum.valueOf(ON.class, str);
    }

    public static ON[] values() {
        return (ON[]) i.clone();
    }
}
