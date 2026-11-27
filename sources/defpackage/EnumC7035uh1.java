package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7035uh1 {
    public static final EnumC7035uh1 d;
    public static final EnumC7035uh1 e;
    public static final EnumC7035uh1 g;
    public static final EnumC7035uh1 h;
    public static final /* synthetic */ EnumC7035uh1[] i;

    static {
        EnumC7035uh1 enumC7035uh1 = new EnumC7035uh1("IMMEDIATE", 0);
        d = enumC7035uh1;
        EnumC7035uh1 enumC7035uh2 = new EnumC7035uh1("HIGH", 1);
        e = enumC7035uh2;
        EnumC7035uh1 enumC7035uh3 = new EnumC7035uh1("NORMAL", 2);
        g = enumC7035uh3;
        EnumC7035uh1 enumC7035uh4 = new EnumC7035uh1("LOW", 3);
        h = enumC7035uh4;
        i = new EnumC7035uh1[]{enumC7035uh1, enumC7035uh2, enumC7035uh3, enumC7035uh4};
    }

    public EnumC7035uh1() {
        throw null;
    }

    public static EnumC7035uh1 valueOf(String str) {
        return (EnumC7035uh1) Enum.valueOf(EnumC7035uh1.class, str);
    }

    public static EnumC7035uh1[] values() {
        return (EnumC7035uh1[]) i.clone();
    }
}
