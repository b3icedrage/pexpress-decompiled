package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class C01 {

    @NotNull
    public static final a d;
    public static final C01 e;
    public static final C01 g;
    public static final C01 h;
    public static final C01 i;
    public static final /* synthetic */ C01[] j;

    public static final class a {
    }

    static {
        C01 c01 = new C01("FINAL", 0);
        e = c01;
        C01 c02 = new C01("SEALED", 1);
        g = c02;
        C01 c03 = new C01("OPEN", 2);
        h = c03;
        C01 c04 = new C01("ABSTRACT", 3);
        i = c04;
        C01[] c01Arr = {c01, c02, c03, c04};
        j = c01Arr;
        C1952Ru.i(c01Arr);
        d = new a();
    }

    public C01() {
        throw null;
    }

    public static C01 valueOf(String str) {
        return (C01) Enum.valueOf(C01.class, str);
    }

    public static C01[] values() {
        return (C01[]) j.clone();
    }
}
