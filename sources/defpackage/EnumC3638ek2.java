package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ek2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3638ek2 {
    public static final EnumC3638ek2 d;
    public static final EnumC3638ek2 e;
    public static final EnumC3638ek2 g;
    public static final EnumC3638ek2 h;
    public static final EnumC3638ek2 i;
    public static final EnumC3638ek2 j;
    public static final /* synthetic */ EnumC3638ek2[] k;

    static {
        EnumC3638ek2 enumC3638ek2 = new EnumC3638ek2("ENQUEUED", 0);
        d = enumC3638ek2;
        EnumC3638ek2 enumC3638ek3 = new EnumC3638ek2("RUNNING", 1);
        e = enumC3638ek3;
        EnumC3638ek2 enumC3638ek4 = new EnumC3638ek2("SUCCEEDED", 2);
        g = enumC3638ek4;
        EnumC3638ek2 enumC3638ek5 = new EnumC3638ek2("FAILED", 3);
        h = enumC3638ek5;
        EnumC3638ek2 enumC3638ek6 = new EnumC3638ek2("BLOCKED", 4);
        i = enumC3638ek6;
        EnumC3638ek2 enumC3638ek7 = new EnumC3638ek2("CANCELLED", 5);
        j = enumC3638ek7;
        k = new EnumC3638ek2[]{enumC3638ek2, enumC3638ek3, enumC3638ek4, enumC3638ek5, enumC3638ek6, enumC3638ek7};
    }

    public EnumC3638ek2() {
        throw null;
    }

    public static EnumC3638ek2 valueOf(String str) {
        return (EnumC3638ek2) Enum.valueOf(EnumC3638ek2.class, str);
    }

    public static EnumC3638ek2[] values() {
        return (EnumC3638ek2[]) k.clone();
    }

    public final boolean b() {
        return this == g || this == h || this == j;
    }
}
