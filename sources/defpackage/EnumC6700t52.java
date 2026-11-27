package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6700t52 {
    public static final EnumC6700t52 d;
    public static final EnumC6700t52 e;
    public static final EnumC6700t52 g;
    public static final EnumC6700t52 h;
    public static final /* synthetic */ EnumC6700t52[] i;

    static {
        EnumC6700t52 enumC6700t52 = new EnumC6700t52("SUCCESSFUL", 0);
        d = enumC6700t52;
        EnumC6700t52 enumC6700t53 = new EnumC6700t52("REREGISTER", 1);
        e = enumC6700t53;
        EnumC6700t52 enumC6700t54 = new EnumC6700t52("CANCELLED", 2);
        g = enumC6700t54;
        EnumC6700t52 enumC6700t55 = new EnumC6700t52("ALREADY_SELECTED", 3);
        h = enumC6700t55;
        EnumC6700t52[] enumC6700t52Arr = {enumC6700t52, enumC6700t53, enumC6700t54, enumC6700t55};
        i = enumC6700t52Arr;
        C1952Ru.i(enumC6700t52Arr);
    }

    public EnumC6700t52() {
        throw null;
    }

    public static EnumC6700t52 valueOf(String str) {
        return (EnumC6700t52) Enum.valueOf(EnumC6700t52.class, str);
    }

    public static EnumC6700t52[] values() {
        return (EnumC6700t52[]) i.clone();
    }
}
