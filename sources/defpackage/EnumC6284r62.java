package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6284r62 {
    public static final EnumC6284r62 d;
    public static final EnumC6284r62 e;
    public static final EnumC6284r62 g;
    public static final /* synthetic */ EnumC6284r62[] h;

    static {
        EnumC6284r62 enumC6284r62 = new EnumC6284r62("FLEXIBLE_LOWER", 0);
        d = enumC6284r62;
        EnumC6284r62 enumC6284r63 = new EnumC6284r62("FLEXIBLE_UPPER", 1);
        e = enumC6284r63;
        EnumC6284r62 enumC6284r64 = new EnumC6284r62("INFLEXIBLE", 2);
        g = enumC6284r64;
        EnumC6284r62[] enumC6284r62Arr = {enumC6284r62, enumC6284r63, enumC6284r64};
        h = enumC6284r62Arr;
        C1952Ru.i(enumC6284r62Arr);
    }

    public EnumC6284r62() {
        throw null;
    }

    public static EnumC6284r62 valueOf(String str) {
        return (EnumC6284r62) Enum.valueOf(EnumC6284r62.class, str);
    }

    public static EnumC6284r62[] values() {
        return (EnumC6284r62[]) h.clone();
    }
}
