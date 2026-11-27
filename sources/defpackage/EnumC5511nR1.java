package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nR1[], still in use, count: 1, list:
  (r0v1 nR1[]) from 0x001e: INVOKE (r0v1 nR1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:31)
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
/* JADX INFO: renamed from: nR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5511nR1 {
    FREE(EnumC2868b42.e),
    PRO(EnumC2868b42.d);


    @NotNull
    public static final a e;

    @NotNull
    public final EnumC2868b42 d;

    /* JADX INFO: renamed from: nR1$a */
    public static final class a {
    }

    static {
        C1952Ru.i(enumC5511nR1Arr);
        e = new a();
    }

    public EnumC5511nR1(EnumC2868b42 enumC2868b42) {
        super(str, i);
        this.d = enumC2868b42;
    }

    public static EnumC5511nR1 valueOf(String str) {
        return (EnumC5511nR1) Enum.valueOf(EnumC5511nR1.class, str);
    }

    public static EnumC5511nR1[] values() {
        return (EnumC5511nR1[]) i.clone();
    }
}
