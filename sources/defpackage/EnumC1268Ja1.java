package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ja1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1268Ja1 {
    public static final EnumC1268Ja1 d;
    public static final EnumC1268Ja1 e;
    public static final /* synthetic */ EnumC1268Ja1[] g;

    static {
        EnumC1268Ja1 enumC1268Ja1 = new EnumC1268Ja1("RENDER_OVERRIDE", 0);
        d = enumC1268Ja1;
        EnumC1268Ja1 enumC1268Ja2 = new EnumC1268Ja1("RENDER_OPEN", 1);
        e = enumC1268Ja2;
        EnumC1268Ja1[] enumC1268Ja1Arr = {enumC1268Ja1, enumC1268Ja2, new EnumC1268Ja1("RENDER_OPEN_OVERRIDE", 2)};
        g = enumC1268Ja1Arr;
        C1952Ru.i(enumC1268Ja1Arr);
    }

    public EnumC1268Ja1() {
        throw null;
    }

    public static EnumC1268Ja1 valueOf(String str) {
        return (EnumC1268Ja1) Enum.valueOf(EnumC1268Ja1.class, str);
    }

    public static EnumC1268Ja1[] values() {
        return (EnumC1268Ja1[]) g.clone();
    }
}
