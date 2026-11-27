package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 HK0[], still in use, count: 1, list:
  (r0v1 HK0[]) from 0x001c: INVOKE (r0v1 HK0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:29)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class HK0 {
    CONTROL_GROUP('A'),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_SUPPORT_PAGE('B');

    public final char d;

    static {
        C1952Ru.i(hk0Arr);
    }

    public HK0(char c) {
        super(str, i);
        this.d = c;
    }

    public static HK0 valueOf(String str) {
        return (HK0) Enum.valueOf(HK0.class, str);
    }

    public static HK0[] values() {
        return (HK0[]) g.clone();
    }
}
