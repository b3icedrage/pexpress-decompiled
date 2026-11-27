package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3495e41 {
    public static final EnumC3495e41 d;
    public static final EnumC3495e41 e;
    public static final EnumC3495e41 g;
    public static final EnumC3495e41 h;
    public static final EnumC3495e41 i;
    public static final EnumC3495e41 j;
    public static final EnumC3495e41 k;
    public static final EnumC3495e41 l;
    public static final /* synthetic */ EnumC3495e41[] m;

    static {
        EnumC3495e41 enumC3495e41 = new EnumC3495e41("CONNECT", 0);
        d = enumC3495e41;
        EnumC3495e41 enumC3495e42 = new EnumC3495e41("OPEN", 1);
        e = enumC3495e42;
        EnumC3495e41 enumC3495e43 = new EnumC3495e41("FAILED_ONCE", 2);
        g = enumC3495e43;
        EnumC3495e41 enumC3495e44 = new EnumC3495e41("FAILED", 3);
        h = enumC3495e44;
        EnumC3495e41 enumC3495e45 = new EnumC3495e41("FAILED_WS_MESSAGE", 4);
        i = enumC3495e45;
        EnumC3495e41 enumC3495e46 = new EnumC3495e41("FAILED_PLATFORM", 5);
        EnumC3495e41 enumC3495e47 = new EnumC3495e41("CLOSE", 6);
        j = enumC3495e47;
        EnumC3495e41 enumC3495e48 = new EnumC3495e41("PROGRESS", 7);
        k = enumC3495e48;
        EnumC3495e41 enumC3495e49 = new EnumC3495e41("RECONNECT", 8);
        l = enumC3495e49;
        EnumC3495e41[] enumC3495e41Arr = {enumC3495e41, enumC3495e42, enumC3495e43, enumC3495e44, enumC3495e45, enumC3495e46, enumC3495e47, enumC3495e48, enumC3495e49};
        m = enumC3495e41Arr;
        C1952Ru.i(enumC3495e41Arr);
    }

    public EnumC3495e41() {
        throw null;
    }

    public static EnumC3495e41 valueOf(String str) {
        return (EnumC3495e41) Enum.valueOf(EnumC3495e41.class, str);
    }

    public static EnumC3495e41[] values() {
        return (EnumC3495e41[]) m.clone();
    }
}
