package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5357mh2 {
    public static final EnumC5357mh2 d;
    public static final EnumC5357mh2 e;
    public static final EnumC5357mh2 g;
    public static final EnumC5357mh2 h;
    public static final EnumC5357mh2 i;
    public static final /* synthetic */ EnumC5357mh2[] j;

    static {
        EnumC5357mh2 enumC5357mh2 = new EnumC5357mh2("CREATED", 0);
        d = enumC5357mh2;
        EnumC5357mh2 enumC5357mh3 = new EnumC5357mh2("CONNECTING", 1);
        e = enumC5357mh3;
        EnumC5357mh2 enumC5357mh4 = new EnumC5357mh2("OPEN", 2);
        g = enumC5357mh4;
        EnumC5357mh2 enumC5357mh5 = new EnumC5357mh2("CLOSING", 3);
        h = enumC5357mh5;
        EnumC5357mh2 enumC5357mh6 = new EnumC5357mh2("CLOSED", 4);
        i = enumC5357mh6;
        j = new EnumC5357mh2[]{enumC5357mh2, enumC5357mh3, enumC5357mh4, enumC5357mh5, enumC5357mh6};
    }

    public EnumC5357mh2() {
        throw null;
    }

    public static EnumC5357mh2 valueOf(String str) {
        return (EnumC5357mh2) Enum.valueOf(EnumC5357mh2.class, str);
    }

    public static EnumC5357mh2[] values() {
        return (EnumC5357mh2[]) j.clone();
    }
}
