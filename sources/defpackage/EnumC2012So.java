package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2012So {
    public static final EnumC2012So d;
    public static final EnumC2012So e;
    public static final EnumC2012So g;
    public static final EnumC2012So h;
    public static final EnumC2012So i;
    public static final /* synthetic */ EnumC2012So[] j;

    static {
        EnumC2012So enumC2012So = new EnumC2012So("SESSIONS", 0);
        d = enumC2012So;
        EnumC2012So enumC2012So2 = new EnumC2012So("APP_LIFECYCLES", 1);
        e = enumC2012So2;
        EnumC2012So enumC2012So3 = new EnumC2012So("DEEP_LINKS", 2);
        g = enumC2012So3;
        EnumC2012So enumC2012So4 = new EnumC2012So("SCREEN_VIEWS", 3);
        h = enumC2012So4;
        EnumC2012So enumC2012So5 = new EnumC2012So("ELEMENT_INTERACTIONS", 4);
        i = enumC2012So5;
        j = new EnumC2012So[]{enumC2012So, enumC2012So2, enumC2012So3, enumC2012So4, enumC2012So5};
    }

    public EnumC2012So() {
        throw null;
    }

    public static EnumC2012So valueOf(String str) {
        return (EnumC2012So) Enum.valueOf(EnumC2012So.class, str);
    }

    public static EnumC2012So[] values() {
        return (EnumC2012So[]) j.clone();
    }
}
