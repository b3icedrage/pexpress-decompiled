package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class YT1 {
    public static final /* synthetic */ YT1[] d = {new YT1("ROTATING_PLANE", 0), new YT1("DOUBLE_BOUNCE", 1), new YT1("WAVE", 2), new YT1("WANDERING_CUBES", 3), new YT1("PULSE", 4), new YT1("CHASING_DOTS", 5), new YT1("THREE_BOUNCE", 6), new YT1("CIRCLE", 7), new YT1("CUBE_GRID", 8), new YT1("FADING_CIRCLE", 9), new YT1("FOLDING_CUBE", 10), new YT1("ROTATING_CIRCLE", 11), new YT1("MULTIPLE_PULSE", 12), new YT1("PULSE_RING", 13), new YT1("MULTIPLE_PULSE_RING", 14)};

    /* JADX INFO: Fake field, exist only in values array */
    YT1 EF5;

    public YT1() {
        throw null;
    }

    public static YT1 valueOf(String str) {
        return (YT1) Enum.valueOf(YT1.class, str);
    }

    public static YT1[] values() {
        return (YT1[]) d.clone();
    }
}
