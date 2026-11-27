package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SC {
    public static final SC d;
    public static final SC e;
    public static final SC g;
    public static final SC h;
    public static final SC i;
    public static final SC j;
    public static final /* synthetic */ SC[] k;

    static {
        SC sc = new SC("CLASS", 0);
        d = sc;
        SC sc2 = new SC("INTERFACE", 1);
        e = sc2;
        SC sc3 = new SC("ENUM_CLASS", 2);
        g = sc3;
        SC sc4 = new SC("ENUM_ENTRY", 3);
        h = sc4;
        SC sc5 = new SC("ANNOTATION_CLASS", 4);
        i = sc5;
        SC sc6 = new SC("OBJECT", 5);
        j = sc6;
        SC[] scArr = {sc, sc2, sc3, sc4, sc5, sc6};
        k = scArr;
        C1952Ru.i(scArr);
    }

    public SC() {
        throw null;
    }

    public static SC valueOf(String str) {
        return (SC) Enum.valueOf(SC.class, str);
    }

    public static SC[] values() {
        return (SC[]) k.clone();
    }

    public final boolean b() {
        return this == j || this == h;
    }
}
