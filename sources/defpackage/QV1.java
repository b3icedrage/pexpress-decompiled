package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class QV1 {
    public static final QV1 d;
    public static final QV1 e;
    public static final QV1 g;
    public static final QV1 h;
    public static final /* synthetic */ QV1[] i;

    static {
        QV1 qv1 = new QV1("NEED_HELP", 0);
        d = qv1;
        QV1 qv2 = new QV1("FAQ", 1);
        e = qv2;
        QV1 qv3 = new QV1("POPULAR_QUESTIONS", 2);
        g = qv3;
        QV1 qv4 = new QV1("ISSUE_CATEGORIES", 3);
        h = qv4;
        QV1[] qv1Arr = {qv1, qv2, qv3, qv4};
        i = qv1Arr;
        C1952Ru.i(qv1Arr);
    }

    public QV1() {
        throw null;
    }

    public static QV1 valueOf(String str) {
        return (QV1) Enum.valueOf(QV1.class, str);
    }

    public static QV1[] values() {
        return (QV1[]) i.clone();
    }
}
