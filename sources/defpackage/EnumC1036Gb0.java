package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1036Gb0 {
    public static final EnumC1036Gb0 d;
    public static final EnumC1036Gb0 e;
    public static final EnumC1036Gb0 g;
    public static final EnumC1036Gb0 h;
    public static final /* synthetic */ EnumC1036Gb0[] i;

    static {
        EnumC1036Gb0 enumC1036Gb0 = new EnumC1036Gb0("TRADING", 0);
        d = enumC1036Gb0;
        EnumC1036Gb0 enumC1036Gb1 = new EnumC1036Gb0("ROBOTS", 1);
        e = enumC1036Gb1;
        EnumC1036Gb0 enumC1036Gb2 = new EnumC1036Gb0("ACCOUNT", 2);
        g = enumC1036Gb2;
        EnumC1036Gb0 enumC1036Gb3 = new EnumC1036Gb0("DEPOSITWITHDRAW", 3);
        h = enumC1036Gb3;
        EnumC1036Gb0[] enumC1036Gb0Arr = {enumC1036Gb0, enumC1036Gb1, enumC1036Gb2, enumC1036Gb3};
        i = enumC1036Gb0Arr;
        C1952Ru.i(enumC1036Gb0Arr);
    }

    public EnumC1036Gb0() {
        throw null;
    }

    public static EnumC1036Gb0 valueOf(String str) {
        return (EnumC1036Gb0) Enum.valueOf(EnumC1036Gb0.class, str);
    }

    public static EnumC1036Gb0[] values() {
        return (EnumC1036Gb0[]) i.clone();
    }
}
