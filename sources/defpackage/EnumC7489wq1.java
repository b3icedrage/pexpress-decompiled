package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 wq1[], still in use, count: 1, list:
  (r0v17 wq1[]) from 0x00ed: INVOKE (r0v17 wq1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:238)
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
/* JADX INFO: renamed from: wq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7489wq1 {
    REGISTER("register"),
    LOGIN("login"),
    DUO_AUTH("duo_auth"),
    CLEAR_DATA("clear_data"),
    SAVE_TOKEN("save_token"),
    WS_AUTH("ws_auth"),
    PLATFORM_PROFILE("platform_profile"),
    ADD_USER("add_user"),
    PENDING_ADD_USER("pending_add_user"),
    OUR_USER("our_user"),
    CONFIG("config"),
    CONVERSION("conversion"),
    PENDING_REGISTRATION_ANALYTICS("pending_registration_analytics"),
    ANALYTICS("analytics"),
    OPEN_PLATFORM("open_platform"),
    SKIP_TUTORIAL("skip_tutorial"),
    VALIDATION("validation");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC7489wq1Arr);
    }

    public EnumC7489wq1(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC7489wq1 valueOf(String str) {
        return (EnumC7489wq1) Enum.valueOf(EnumC7489wq1.class, str);
    }

    public static EnumC7489wq1[] values() {
        return (EnumC7489wq1[]) w.clone();
    }
}
