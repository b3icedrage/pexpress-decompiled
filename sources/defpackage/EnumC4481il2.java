package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: il2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4481il2 {
    public static final EnumC4481il2 d;
    public static final EnumC4481il2 e;
    public static final /* synthetic */ EnumC4481il2[] g;

    static {
        EnumC4481il2 enumC4481il2 = new EnumC4481il2("EVENT", 0);
        d = enumC4481il2;
        EnumC4481il2 enumC4481il3 = new EnumC4481il2("FLUSH", 1);
        e = enumC4481il3;
        g = new EnumC4481il2[]{enumC4481il2, enumC4481il3};
    }

    public EnumC4481il2() {
        throw null;
    }

    public static EnumC4481il2 valueOf(String str) {
        return (EnumC4481il2) Enum.valueOf(EnumC4481il2.class, str);
    }

    public static EnumC4481il2[] values() {
        return (EnumC4481il2[]) g.clone();
    }
}
