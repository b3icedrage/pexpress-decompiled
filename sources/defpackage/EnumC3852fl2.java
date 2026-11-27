package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fl2[], still in use, count: 1, list:
  (r0v1 fl2[]) from 0x0036: INVOKE (r0v1 fl2[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:55)
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
/* JADX INFO: renamed from: fl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3852fl2 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ C4814k70 l;
    public final char d;
    public final char e;

    static {
        l = C1952Ru.i(enumC3852fl2Arr);
    }

    public EnumC3852fl2(char c, char c2) {
        super(str, i);
        this.d = c;
        this.e = c2;
    }

    public static EnumC3852fl2 valueOf(String str) {
        return (EnumC3852fl2) Enum.valueOf(EnumC3852fl2.class, str);
    }

    public static EnumC3852fl2[] values() {
        return (EnumC3852fl2[]) k.clone();
    }
}
