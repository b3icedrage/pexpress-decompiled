package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KY1 {
    public static final KY1 d;
    public static final KY1 e;
    public static final KY1 g;
    public static final KY1 h;
    public static final /* synthetic */ KY1[] i;

    static {
        KY1 ky1 = new KY1("READING_THREAD", 0);
        d = ky1;
        KY1 ky2 = new KY1("WRITING_THREAD", 1);
        e = ky2;
        KY1 ky3 = new KY1("CONNECT_THREAD", 2);
        g = ky3;
        KY1 ky4 = new KY1("FINISH_THREAD", 3);
        h = ky4;
        i = new KY1[]{ky1, ky2, ky3, ky4};
    }

    public KY1() {
        throw null;
    }

    public static KY1 valueOf(String str) {
        return (KY1) Enum.valueOf(KY1.class, str);
    }

    public static KY1[] values() {
        return (KY1[]) i.clone();
    }
}
