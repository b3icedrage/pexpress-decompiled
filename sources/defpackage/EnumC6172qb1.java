package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6172qb1 {
    public static final EnumC6172qb1 d;
    public static final EnumC6172qb1 e;
    public static final EnumC6172qb1 g;
    public static final /* synthetic */ EnumC6172qb1[] h;

    static {
        EnumC6172qb1 enumC6172qb1 = new EnumC6172qb1("NONE", 0);
        d = enumC6172qb1;
        EnumC6172qb1 enumC6172qb2 = new EnumC6172qb1("ZERO", 1);
        e = enumC6172qb2;
        EnumC6172qb1 enumC6172qb3 = new EnumC6172qb1("SPACE", 2);
        g = enumC6172qb3;
        EnumC6172qb1[] enumC6172qb1Arr = {enumC6172qb1, enumC6172qb2, enumC6172qb3};
        h = enumC6172qb1Arr;
        C1952Ru.i(enumC6172qb1Arr);
    }

    public EnumC6172qb1() {
        throw null;
    }

    public static EnumC6172qb1 valueOf(String str) {
        return (EnumC6172qb1) Enum.valueOf(EnumC6172qb1.class, str);
    }

    public static EnumC6172qb1[] values() {
        return (EnumC6172qb1[]) h.clone();
    }
}
