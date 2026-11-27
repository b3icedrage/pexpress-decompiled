package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4851kI1 {
    public static final EnumC4851kI1 d;
    public static final EnumC4851kI1 e;
    public static final /* synthetic */ EnumC4851kI1[] g;

    static {
        EnumC4851kI1 enumC4851kI1 = new EnumC4851kI1("US", 0);
        d = enumC4851kI1;
        EnumC4851kI1 enumC4851kI2 = new EnumC4851kI1("EU", 1);
        e = enumC4851kI2;
        g = new EnumC4851kI1[]{enumC4851kI1, enumC4851kI2};
    }

    public EnumC4851kI1() {
        throw null;
    }

    public static EnumC4851kI1 valueOf(String str) {
        return (EnumC4851kI1) Enum.valueOf(EnumC4851kI1.class, str);
    }

    public static EnumC4851kI1[] values() {
        return (EnumC4851kI1[]) g.clone();
    }
}
