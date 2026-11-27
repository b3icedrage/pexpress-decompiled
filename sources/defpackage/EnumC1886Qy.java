package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Qy[], still in use, count: 1, list:
  (r0v1 Qy[]) from 0x0036: INVOKE (r0v1 Qy[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:55)
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
/* JADX INFO: renamed from: Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1886Qy {
    REQUIRED("config_required"),
    NOT_REQUIRED("not_required"),
    CONFIG_FAILED("config_failed"),
    CONFIG_FAILED_SKIPPED("config_failed_skipped");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC1886QyArr);
    }

    public EnumC1886Qy(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC1886Qy valueOf(String str) {
        return (EnumC1886Qy) Enum.valueOf(EnumC1886Qy.class, str);
    }

    public static EnumC1886Qy[] values() {
        return (EnumC1886Qy[]) j.clone();
    }
}
