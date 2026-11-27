package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5225m40 {
    public static final EnumC5225m40 d;
    public static final EnumC5225m40 e;
    public static final EnumC5225m40 g;
    public static final /* synthetic */ EnumC5225m40[] h;

    static {
        EnumC5225m40 enumC5225m40 = new EnumC5225m40("BOTH", 0);
        d = enumC5225m40;
        EnumC5225m40 enumC5225m41 = new EnumC5225m40("IPV4_ONLY", 1);
        e = enumC5225m41;
        EnumC5225m40 enumC5225m42 = new EnumC5225m40("IPV6_ONLY", 2);
        g = enumC5225m42;
        h = new EnumC5225m40[]{enumC5225m40, enumC5225m41, enumC5225m42};
    }

    public EnumC5225m40() {
        throw null;
    }

    public static EnumC5225m40 valueOf(String str) {
        return (EnumC5225m40) Enum.valueOf(EnumC5225m40.class, str);
    }

    public static EnumC5225m40[] values() {
        return (EnumC5225m40[]) h.clone();
    }
}
