package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6808td0 {
    public static final EnumC6808td0 d;
    public static final EnumC6808td0 e;
    public static final EnumC6808td0 g;
    public static final /* synthetic */ EnumC6808td0[] h;

    static {
        EnumC6808td0 enumC6808td0 = new EnumC6808td0("DENY", 0);
        d = enumC6808td0;
        EnumC6808td0 enumC6808td1 = new EnumC6808td0("NEUTRAL", 1);
        e = enumC6808td1;
        EnumC6808td0 enumC6808td2 = new EnumC6808td0("ACCEPT", 2);
        g = enumC6808td2;
        h = new EnumC6808td0[]{enumC6808td0, enumC6808td1, enumC6808td2};
    }

    public EnumC6808td0() {
        throw null;
    }

    public static EnumC6808td0 valueOf(String str) {
        return (EnumC6808td0) Enum.valueOf(EnumC6808td0.class, str);
    }

    public static EnumC6808td0[] values() {
        return (EnumC6808td0[]) h.clone();
    }
}
