package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2519Yr {
    public static final EnumC2519Yr d;
    public static final EnumC2519Yr e;
    public static final EnumC2519Yr g;
    public static final /* synthetic */ EnumC2519Yr[] h;

    static {
        EnumC2519Yr enumC2519Yr = new EnumC2519Yr("LOOSE", 0);
        d = enumC2519Yr;
        EnumC2519Yr enumC2519Yr2 = new EnumC2519Yr("WIN", 1);
        e = enumC2519Yr2;
        EnumC2519Yr enumC2519Yr3 = new EnumC2519Yr("EQUAL", 2);
        g = enumC2519Yr3;
        EnumC2519Yr[] enumC2519YrArr = {enumC2519Yr, enumC2519Yr2, enumC2519Yr3};
        h = enumC2519YrArr;
        C1952Ru.i(enumC2519YrArr);
    }

    public EnumC2519Yr() {
        throw null;
    }

    public static EnumC2519Yr valueOf(String str) {
        return (EnumC2519Yr) Enum.valueOf(EnumC2519Yr.class, str);
    }

    public static EnumC2519Yr[] values() {
        return (EnumC2519Yr[]) h.clone();
    }
}
