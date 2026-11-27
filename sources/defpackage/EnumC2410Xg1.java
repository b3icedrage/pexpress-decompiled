package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Xg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2410Xg1 {
    public static final EnumC2410Xg1 d;
    public static final /* synthetic */ EnumC2410Xg1[] e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2410Xg1 EF0;

    static {
        EnumC2410Xg1 enumC2410Xg1 = new EnumC2410Xg1("SRGB", 0);
        EnumC2410Xg1 enumC2410Xg2 = new EnumC2410Xg1("DISPLAY_P3", 1);
        d = enumC2410Xg2;
        e = new EnumC2410Xg1[]{enumC2410Xg1, enumC2410Xg2};
    }

    public EnumC2410Xg1() {
        throw null;
    }

    public static EnumC2410Xg1 valueOf(String str) {
        return (EnumC2410Xg1) Enum.valueOf(EnumC2410Xg1.class, str);
    }

    public static EnumC2410Xg1[] values() {
        return (EnumC2410Xg1[]) e.clone();
    }
}
