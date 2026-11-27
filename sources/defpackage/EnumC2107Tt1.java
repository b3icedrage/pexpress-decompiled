package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Tt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2107Tt1 {
    public static final EnumC2107Tt1 d;
    public static final EnumC2107Tt1 e;
    public static final EnumC2107Tt1 g;
    public static final EnumC2107Tt1 h;
    public static final EnumC2107Tt1 i;
    public static final /* synthetic */ EnumC2107Tt1[] j;

    static {
        EnumC2107Tt1 enumC2107Tt1 = new EnumC2107Tt1("Success", 0);
        d = enumC2107Tt1;
        EnumC2107Tt1 enumC2107Tt2 = new EnumC2107Tt1("BadParam", 1);
        e = enumC2107Tt2;
        EnumC2107Tt1 enumC2107Tt3 = new EnumC2107Tt1("OutOfRangeStartIndex", 2);
        EnumC2107Tt1 enumC2107Tt4 = new EnumC2107Tt1("OutOfRangeEndIndex", 3);
        g = enumC2107Tt4;
        EnumC2107Tt1 enumC2107Tt5 = new EnumC2107Tt1("AllocErr", 4);
        h = enumC2107Tt5;
        EnumC2107Tt1 enumC2107Tt6 = new EnumC2107Tt1("InternalError", 5);
        i = enumC2107Tt6;
        j = new EnumC2107Tt1[]{enumC2107Tt1, enumC2107Tt2, enumC2107Tt3, enumC2107Tt4, enumC2107Tt5, enumC2107Tt6};
    }

    public EnumC2107Tt1() {
        throw null;
    }

    public static EnumC2107Tt1 valueOf(String str) {
        return (EnumC2107Tt1) Enum.valueOf(EnumC2107Tt1.class, str);
    }

    public static EnumC2107Tt1[] values() {
        return (EnumC2107Tt1[]) j.clone();
    }
}
