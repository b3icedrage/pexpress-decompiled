package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 S80[], still in use, count: 1, list:
  (r0v1 S80[]) from 0x001c: INVOKE (r0v1 S80[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:29)
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
public final class S80 {
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_GOOGLE("Social Google"),
    EMAIL_AUTH("Email Auth");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(s80Arr);
    }

    public S80(String str) {
        super(str, i);
        this.d = str;
    }

    public static S80 valueOf(String str) {
        return (S80) Enum.valueOf(S80.class, str);
    }

    public static S80[] values() {
        return (S80[]) g.clone();
    }
}
