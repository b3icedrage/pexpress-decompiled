package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5404mv1 {
    public static final EnumC5404mv1 d;
    public static final EnumC5404mv1 e;
    public static final EnumC5404mv1 g;
    public static final EnumC5404mv1 h;
    public static final /* synthetic */ EnumC5404mv1[] i;

    static {
        EnumC5404mv1 enumC5404mv1 = new EnumC5404mv1("Strategies", 0);
        d = enumC5404mv1;
        EnumC5404mv1 enumC5404mv2 = new EnumC5404mv1("TradingOptions", 1);
        e = enumC5404mv2;
        EnumC5404mv1 enumC5404mv3 = new EnumC5404mv1("LossLimit", 2);
        g = enumC5404mv3;
        EnumC5404mv1 enumC5404mv4 = new EnumC5404mv1("ProfitLimit", 3);
        h = enumC5404mv4;
        EnumC5404mv1[] enumC5404mv1Arr = {enumC5404mv1, enumC5404mv2, enumC5404mv3, enumC5404mv4};
        i = enumC5404mv1Arr;
        C1952Ru.i(enumC5404mv1Arr);
    }

    public EnumC5404mv1() {
        throw null;
    }

    public static EnumC5404mv1 valueOf(String str) {
        return (EnumC5404mv1) Enum.valueOf(EnumC5404mv1.class, str);
    }

    public static EnumC5404mv1[] values() {
        return (EnumC5404mv1[]) i.clone();
    }
}
