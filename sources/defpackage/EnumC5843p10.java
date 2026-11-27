package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p10[], still in use, count: 1, list:
  (r0v1 p10[]) from 0x0038: INVOKE (r0v1 p10[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:57)
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
/* JADX INFO: renamed from: p10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5843p10 {
    PENDING(0),
    OPENING(1),
    DELAYED(2),
    OPENING_DELAYED(3),
    DONE(4);

    public final int d;

    static {
        C1952Ru.i(enumC5843p10Arr);
    }

    public EnumC5843p10(int i) {
        super(str, i);
        this.d = i;
    }

    public static EnumC5843p10 valueOf(String str) {
        return (EnumC5843p10) Enum.valueOf(EnumC5843p10.class, str);
    }

    public static EnumC5843p10[] values() {
        return (EnumC5843p10[]) k.clone();
    }
}
