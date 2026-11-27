package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I41 {
    public static final I41 d;
    public static final I41 e;
    public static final I41 g;
    public static final I41 h;
    public static final I41 i;
    public static final I41 j;
    public static final /* synthetic */ I41[] k;

    static {
        I41 i41 = new I41("SELECT_ACCOUNT", 0);
        d = i41;
        I41 i42 = new I41("REGISTRATION", 1);
        e = i42;
        I41 i43 = new I41("PLATFORM", 2);
        g = i43;
        I41 i44 = new I41("OLD_ONBOARDING", 3);
        h = i44;
        I41 i45 = new I41("ROBOT", 4);
        i = i45;
        I41 i46 = new I41("STUB", 5);
        j = i46;
        I41[] i41Arr = {i41, i42, i43, i44, i45, i46};
        k = i41Arr;
        C1952Ru.i(i41Arr);
    }

    public I41() {
        throw null;
    }

    public static I41 valueOf(String str) {
        return (I41) Enum.valueOf(I41.class, str);
    }

    public static I41[] values() {
        return (I41[]) k.clone();
    }
}
