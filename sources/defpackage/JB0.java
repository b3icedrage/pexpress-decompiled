package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class JB0 {
    public static final /* synthetic */ JB0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    JB0 EF5;

    static {
        JB0[] jb0Arr = {new JB0("COMMON_SUPER_TYPE", 0), new JB0("INTERSECTION_TYPE", 1)};
        d = jb0Arr;
        C1952Ru.i(jb0Arr);
    }

    public JB0() {
        throw null;
    }

    public static JB0 valueOf(String str) {
        return (JB0) Enum.valueOf(JB0.class, str);
    }

    public static JB0[] values() {
        return (JB0[]) d.clone();
    }
}
