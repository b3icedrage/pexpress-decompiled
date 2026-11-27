package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4593j41 {
    public static final EnumC4593j41 d;
    public static final EnumC4593j41 e;
    public static final EnumC4593j41 g;
    public static final EnumC4593j41 h;
    public static final EnumC4593j41 i;
    public static final EnumC4593j41 j;
    public static final /* synthetic */ EnumC4593j41[] k;

    static {
        EnumC4593j41 enumC4593j41 = new EnumC4593j41("NOT_REQUIRED", 0);
        d = enumC4593j41;
        EnumC4593j41 enumC4593j42 = new EnumC4593j41("CONNECTED", 1);
        e = enumC4593j42;
        EnumC4593j41 enumC4593j43 = new EnumC4593j41("UNMETERED", 2);
        g = enumC4593j43;
        EnumC4593j41 enumC4593j44 = new EnumC4593j41("NOT_ROAMING", 3);
        h = enumC4593j44;
        EnumC4593j41 enumC4593j45 = new EnumC4593j41("METERED", 4);
        i = enumC4593j45;
        EnumC4593j41 enumC4593j46 = new EnumC4593j41("TEMPORARILY_UNMETERED", 5);
        j = enumC4593j46;
        k = new EnumC4593j41[]{enumC4593j41, enumC4593j42, enumC4593j43, enumC4593j44, enumC4593j45, enumC4593j46};
    }

    public EnumC4593j41() {
        throw null;
    }

    public static EnumC4593j41 valueOf(String str) {
        return (EnumC4593j41) Enum.valueOf(EnumC4593j41.class, str);
    }

    public static EnumC4593j41[] values() {
        return (EnumC4593j41[]) k.clone();
    }
}
