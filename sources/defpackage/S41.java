package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class S41 implements JT0 {
    public static final S41 d;
    public static final S41 e;
    public static final S41 g;
    public static final S41 h;
    public static final S41 i;
    public static final S41 j;
    public static final S41 k;
    public static final S41 l;
    public static final /* synthetic */ S41[] m;

    /* JADX INFO: Fake field, exist only in values array */
    S41 EF1;

    static {
        S41 s41 = new S41("FROM_IDE", 0);
        S41 s42 = new S41("FROM_BACKEND", 1);
        S41 s43 = new S41("FROM_TEST", 2);
        S41 s44 = new S41("FROM_BUILTINS", 3);
        d = s44;
        S41 s45 = new S41("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        S41 s46 = new S41("WHEN_CHECK_OVERRIDES", 5);
        S41 s47 = new S41("FOR_SCRIPT", 6);
        S41 s48 = new S41("FROM_REFLECTION", 7);
        e = s48;
        S41 s49 = new S41("WHEN_RESOLVE_DECLARATION", 8);
        S41 s410 = new S41("WHEN_GET_DECLARATION_SCOPE", 9);
        S41 s411 = new S41("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        S41 s412 = new S41("FOR_ALREADY_TRACKED", 11);
        g = s412;
        S41 s413 = new S41("WHEN_GET_ALL_DESCRIPTORS", 12);
        h = s413;
        S41 s414 = new S41("WHEN_TYPING", 13);
        S41 s415 = new S41("WHEN_GET_SUPER_MEMBERS", 14);
        i = s415;
        S41 s416 = new S41("FOR_NON_TRACKED_SCOPE", 15);
        j = s416;
        S41 s417 = new S41("FROM_SYNTHETIC_SCOPE", 16);
        S41 s418 = new S41("FROM_DESERIALIZATION", 17);
        k = s418;
        S41 s419 = new S41("FROM_JAVA_LOADER", 18);
        l = s419;
        S41[] s41Arr = {s41, s42, s43, s44, s45, s46, s47, s48, s49, s410, s411, s412, s413, s414, s415, s416, s417, s418, s419, new S41("WHEN_GET_LOCAL_VARIABLE", 19), new S41("WHEN_FIND_BY_FQNAME", 20), new S41("WHEN_GET_COMPANION_OBJECT", 21), new S41("FOR_DEFAULT_IMPORTS", 22)};
        m = s41Arr;
        C1952Ru.i(s41Arr);
    }

    public S41() {
        throw null;
    }

    public static S41 valueOf(String str) {
        return (S41) Enum.valueOf(S41.class, str);
    }

    public static S41[] values() {
        return (S41[]) m.clone();
    }
}
