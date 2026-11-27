package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: iP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4403iP0 {
    public static final EnumC4403iP0 d;
    public static final EnumC4403iP0 e;
    public static final /* synthetic */ EnumC4403iP0[] g;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4403iP0 EF0;

    static {
        EnumC4403iP0 enumC4403iP0 = new EnumC4403iP0("SYNCHRONIZED", 0);
        EnumC4403iP0 enumC4403iP1 = new EnumC4403iP0("PUBLICATION", 1);
        d = enumC4403iP1;
        EnumC4403iP0 enumC4403iP2 = new EnumC4403iP0("NONE", 2);
        e = enumC4403iP2;
        EnumC4403iP0[] enumC4403iP0Arr = {enumC4403iP0, enumC4403iP1, enumC4403iP2};
        g = enumC4403iP0Arr;
        C1952Ru.i(enumC4403iP0Arr);
    }

    public EnumC4403iP0() {
        throw null;
    }

    public static EnumC4403iP0 valueOf(String str) {
        return (EnumC4403iP0) Enum.valueOf(EnumC4403iP0.class, str);
    }

    public static EnumC4403iP0[] values() {
        return (EnumC4403iP0[]) g.clone();
    }
}
