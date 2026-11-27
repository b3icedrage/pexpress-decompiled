package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2920bK0 {
    public static final EnumC2920bK0 d;
    public static final EnumC2920bK0 e;
    public static final EnumC2920bK0 g;
    public static final /* synthetic */ EnumC2920bK0[] h;

    static {
        EnumC2920bK0 enumC2920bK0 = new EnumC2920bK0("INVARIANT", 0);
        d = enumC2920bK0;
        EnumC2920bK0 enumC2920bK1 = new EnumC2920bK0("IN", 1);
        e = enumC2920bK1;
        EnumC2920bK0 enumC2920bK2 = new EnumC2920bK0("OUT", 2);
        g = enumC2920bK2;
        EnumC2920bK0[] enumC2920bK0Arr = {enumC2920bK0, enumC2920bK1, enumC2920bK2};
        h = enumC2920bK0Arr;
        C1952Ru.i(enumC2920bK0Arr);
    }

    public EnumC2920bK0() {
        throw null;
    }

    public static EnumC2920bK0 valueOf(String str) {
        return (EnumC2920bK0) Enum.valueOf(EnumC2920bK0.class, str);
    }

    public static EnumC2920bK0[] values() {
        return (EnumC2920bK0[]) h.clone();
    }
}
