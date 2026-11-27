package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DP1 {
    public static final DP1 d;
    public static final DP1 e;
    public static final DP1 g;
    public static final /* synthetic */ DP1[] h;

    static {
        DP1 dp1 = new DP1("BEGINNING", 0);
        d = dp1;
        DP1 dp2 = new DP1("MIDDLE", 1);
        e = dp2;
        DP1 dp3 = new DP1("AFTER_DOT", 2);
        g = dp3;
        DP1[] dp1Arr = {dp1, dp2, dp3};
        h = dp1Arr;
        C1952Ru.i(dp1Arr);
    }

    public DP1() {
        throw null;
    }

    public static DP1 valueOf(String str) {
        return (DP1) Enum.valueOf(DP1.class, str);
    }

    public static DP1[] values() {
        return (DP1[]) h.clone();
    }
}
