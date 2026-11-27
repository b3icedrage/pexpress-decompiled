package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5490nK1 {
    public static final EnumC5490nK1 d;
    public static final EnumC5490nK1 e;
    public static final /* synthetic */ EnumC5490nK1[] g;

    static {
        EnumC5490nK1 enumC5490nK1 = new EnumC5490nK1("Pictures", 0);
        d = enumC5490nK1;
        EnumC5490nK1 enumC5490nK2 = new EnumC5490nK1("Downloads", 1);
        e = enumC5490nK2;
        EnumC5490nK1[] enumC5490nK1Arr = {enumC5490nK1, enumC5490nK2};
        g = enumC5490nK1Arr;
        C1952Ru.i(enumC5490nK1Arr);
    }

    public EnumC5490nK1() {
        throw null;
    }

    public static EnumC5490nK1 valueOf(String str) {
        return (EnumC5490nK1) Enum.valueOf(EnumC5490nK1.class, str);
    }

    public static EnumC5490nK1[] values() {
        return (EnumC5490nK1[]) g.clone();
    }
}
