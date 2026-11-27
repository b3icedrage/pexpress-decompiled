package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V3 {
    public static final V3 d;
    public static final V3 e;
    public static final V3 g;
    public static final V3 h;
    public static final /* synthetic */ V3[] i;

    static {
        V3 v3 = new V3("MAIN_INFO", 0);
        d = v3;
        V3 v4 = new V3("BALANCE", 1);
        e = v4;
        V3 v5 = new V3("SETTINGS", 2);
        g = v5;
        V3 v6 = new V3("LOGOUT", 3);
        h = v6;
        V3[] v3Arr = {v3, v4, v5, v6};
        i = v3Arr;
        C1952Ru.i(v3Arr);
    }

    public V3() {
        throw null;
    }

    public static V3 valueOf(String str) {
        return (V3) Enum.valueOf(V3.class, str);
    }

    public static V3[] values() {
        return (V3[]) i.clone();
    }
}
