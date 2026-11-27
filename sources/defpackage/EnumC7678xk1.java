package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7678xk1 {
    public static final EnumC7678xk1 d;
    public static final EnumC7678xk1 e;
    public static final EnumC7678xk1 g;
    public static final /* synthetic */ EnumC7678xk1[] h;

    static {
        EnumC7678xk1 enumC7678xk1 = new EnumC7678xk1("PROTO2", 0);
        d = enumC7678xk1;
        EnumC7678xk1 enumC7678xk2 = new EnumC7678xk1("PROTO3", 1);
        e = enumC7678xk2;
        EnumC7678xk1 enumC7678xk3 = new EnumC7678xk1("EDITIONS", 2);
        g = enumC7678xk3;
        h = new EnumC7678xk1[]{enumC7678xk1, enumC7678xk2, enumC7678xk3};
    }

    public EnumC7678xk1() {
        throw null;
    }

    public static EnumC7678xk1 valueOf(String str) {
        return (EnumC7678xk1) Enum.valueOf(EnumC7678xk1.class, str);
    }

    public static EnumC7678xk1[] values() {
        return (EnumC7678xk1[]) h.clone();
    }
}
