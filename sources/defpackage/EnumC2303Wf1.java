package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Wf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2303Wf1 {
    public static final EnumC2303Wf1 d;
    public static final /* synthetic */ EnumC2303Wf1[] e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2303Wf1 EF0;

    static {
        EnumC2303Wf1 enumC2303Wf1 = new EnumC2303Wf1("EXACT", 0);
        EnumC2303Wf1 enumC2303Wf2 = new EnumC2303Wf1("INEXACT", 1);
        EnumC2303Wf1 enumC2303Wf3 = new EnumC2303Wf1("AUTOMATIC", 2);
        d = enumC2303Wf3;
        e = new EnumC2303Wf1[]{enumC2303Wf1, enumC2303Wf2, enumC2303Wf3};
    }

    public EnumC2303Wf1() {
        throw null;
    }

    public static EnumC2303Wf1 valueOf(String str) {
        return (EnumC2303Wf1) Enum.valueOf(EnumC2303Wf1.class, str);
    }

    public static EnumC2303Wf1[] values() {
        return (EnumC2303Wf1[]) e.clone();
    }
}
