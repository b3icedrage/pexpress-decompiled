package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7778yD0 {
    public static final EnumC7778yD0 d;
    public static final EnumC7778yD0 e;
    public static final /* synthetic */ EnumC7778yD0[] g;

    static {
        EnumC7778yD0 enumC7778yD0 = new EnumC7778yD0("Default", 0);
        d = enumC7778yD0;
        EnumC7778yD0 enumC7778yD1 = new EnumC7778yD0("WithCheckboxes", 1);
        e = enumC7778yD1;
        EnumC7778yD0[] enumC7778yD0Arr = {enumC7778yD0, enumC7778yD1};
        g = enumC7778yD0Arr;
        C1952Ru.i(enumC7778yD0Arr);
    }

    public EnumC7778yD0() {
        throw null;
    }

    public static EnumC7778yD0 valueOf(String str) {
        return (EnumC7778yD0) Enum.valueOf(EnumC7778yD0.class, str);
    }

    public static EnumC7778yD0[] values() {
        return (EnumC7778yD0[]) g.clone();
    }
}
