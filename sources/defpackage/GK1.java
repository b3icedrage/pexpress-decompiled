package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class GK1 {
    public static final GK1 d;
    public static final GK1 e;
    public static final GK1 g;
    public static final /* synthetic */ GK1[] h;

    static {
        GK1 gk1 = new GK1("START", 0);
        d = gk1;
        GK1 gk2 = new GK1("STOP", 1);
        e = gk2;
        GK1 gk3 = new GK1("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = gk3;
        GK1[] gk1Arr = {gk1, gk2, gk3};
        h = gk1Arr;
        C1952Ru.i(gk1Arr);
    }

    public GK1() {
        throw null;
    }

    public static GK1 valueOf(String str) {
        return (GK1) Enum.valueOf(GK1.class, str);
    }

    public static GK1[] values() {
        return (GK1[]) h.clone();
    }
}
