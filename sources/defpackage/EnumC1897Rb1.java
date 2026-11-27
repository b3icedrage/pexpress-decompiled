package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Rb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1897Rb1 {
    public static final EnumC1897Rb1 d;
    public static final EnumC1897Rb1 e;
    public static final EnumC1897Rb1 g;
    public static final /* synthetic */ EnumC1897Rb1[] h;

    static {
        EnumC1897Rb1 enumC1897Rb1 = new EnumC1897Rb1("ALL", 0);
        d = enumC1897Rb1;
        EnumC1897Rb1 enumC1897Rb2 = new EnumC1897Rb1("ONLY_NON_SYNTHESIZED", 1);
        e = enumC1897Rb2;
        EnumC1897Rb1 enumC1897Rb3 = new EnumC1897Rb1("NONE", 2);
        g = enumC1897Rb3;
        EnumC1897Rb1[] enumC1897Rb1Arr = {enumC1897Rb1, enumC1897Rb2, enumC1897Rb3};
        h = enumC1897Rb1Arr;
        C1952Ru.i(enumC1897Rb1Arr);
    }

    public EnumC1897Rb1() {
        throw null;
    }

    public static EnumC1897Rb1 valueOf(String str) {
        return (EnumC1897Rb1) Enum.valueOf(EnumC1897Rb1.class, str);
    }

    public static EnumC1897Rb1[] values() {
        return (EnumC1897Rb1[]) h.clone();
    }
}
