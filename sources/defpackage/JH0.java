package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class JH0 {
    public static final JH0 d;
    public static final JH0 e;
    public static final JH0 g;
    public static final JH0 h;
    public static final JH0 i;
    public static final JH0 j;
    public static final JH0 k;
    public static final JH0 l;
    public static final JH0 m;
    public static final JH0 n;
    public static final /* synthetic */ JH0[] o;

    static {
        JH0 jh0 = new JH0("BEGIN_ARRAY", 0);
        d = jh0;
        JH0 jh1 = new JH0("END_ARRAY", 1);
        e = jh1;
        JH0 jh2 = new JH0("BEGIN_OBJECT", 2);
        g = jh2;
        JH0 jh3 = new JH0("END_OBJECT", 3);
        h = jh3;
        JH0 jh4 = new JH0("NAME", 4);
        i = jh4;
        JH0 jh5 = new JH0("STRING", 5);
        j = jh5;
        JH0 jh6 = new JH0("NUMBER", 6);
        k = jh6;
        JH0 jh7 = new JH0("BOOLEAN", 7);
        l = jh7;
        JH0 jh8 = new JH0("NULL", 8);
        m = jh8;
        JH0 jh9 = new JH0("END_DOCUMENT", 9);
        n = jh9;
        o = new JH0[]{jh0, jh1, jh2, jh3, jh4, jh5, jh6, jh7, jh8, jh9};
    }

    public JH0() {
        throw null;
    }

    public static JH0 valueOf(String str) {
        return (JH0) Enum.valueOf(JH0.class, str);
    }

    public static JH0[] values() {
        return (JH0[]) o.clone();
    }
}
