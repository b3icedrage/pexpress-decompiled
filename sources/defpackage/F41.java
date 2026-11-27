package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F41 {
    public static final F41 d;
    public static final F41 e;
    public static final /* synthetic */ F41[] g;

    static {
        F41 f41 = new F41("AUTO_PLACED", 0);
        d = f41;
        F41 f42 = new F41("MANUAL_PLACED", 1);
        e = f42;
        F41[] f41Arr = {f41, f42};
        g = f41Arr;
        C1952Ru.i(f41Arr);
    }

    public F41() {
        throw null;
    }

    public static F41 valueOf(String str) {
        return (F41) Enum.valueOf(F41.class, str);
    }

    public static F41[] values() {
        return (F41[]) g.clone();
    }
}
