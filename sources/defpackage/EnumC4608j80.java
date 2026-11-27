package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4608j80 {
    public static final EnumC4608j80 d;
    public static final /* synthetic */ EnumC4608j80[] e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4608j80 EF0;

    static {
        EnumC4608j80 enumC4608j80 = new EnumC4608j80("EVENT", 0);
        EnumC4608j80 enumC4608j81 = new EnumC4608j80("IDENTIFY", 1);
        d = enumC4608j81;
        e = new EnumC4608j80[]{enumC4608j80, enumC4608j81};
    }

    public EnumC4608j80() {
        throw null;
    }

    public static EnumC4608j80 valueOf(String str) {
        return (EnumC4608j80) Enum.valueOf(EnumC4608j80.class, str);
    }

    public static EnumC4608j80[] values() {
        return (EnumC4608j80[]) e.clone();
    }
}
