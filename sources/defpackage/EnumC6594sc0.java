package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6594sc0 {
    public static final EnumC6594sc0 d;
    public static final EnumC6594sc0 e;
    public static final EnumC6594sc0 g;
    public static final EnumC6594sc0 h;
    public static final EnumC6594sc0 i;
    public static final EnumC6594sc0 j;
    public static final /* synthetic */ EnumC6594sc0[] k;

    static {
        EnumC6594sc0 enumC6594sc0 = new EnumC6594sc0("DEFAULT", 0);
        d = enumC6594sc0;
        EnumC6594sc0 enumC6594sc1 = new EnumC6594sc0("CURRENT_EMAIL", 1);
        e = enumC6594sc1;
        EnumC6594sc0 enumC6594sc2 = new EnumC6594sc0("EMAIL_ALREADY_REGISTERED", 2);
        g = enumC6594sc2;
        EnumC6594sc0 enumC6594sc3 = new EnumC6594sc0("TOO_SHORT", 3);
        h = enumC6594sc3;
        EnumC6594sc0 enumC6594sc4 = new EnumC6594sc0("MISS_SYMBOL", 4);
        i = enumC6594sc4;
        EnumC6594sc0 enumC6594sc5 = new EnumC6594sc0("MISS_NUM", 5);
        j = enumC6594sc5;
        EnumC6594sc0[] enumC6594sc0Arr = {enumC6594sc0, enumC6594sc1, enumC6594sc2, enumC6594sc3, enumC6594sc4, enumC6594sc5};
        k = enumC6594sc0Arr;
        C1952Ru.i(enumC6594sc0Arr);
    }

    public EnumC6594sc0() {
        throw null;
    }

    public static EnumC6594sc0 valueOf(String str) {
        return (EnumC6594sc0) Enum.valueOf(EnumC6594sc0.class, str);
    }

    public static EnumC6594sc0[] values() {
        return (EnumC6594sc0[]) k.clone();
    }
}
