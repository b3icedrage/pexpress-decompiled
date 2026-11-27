package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v27 la[], still in use, count: 1, list:
  (r0v27 la[]) from 0x0221: INVOKE (r0v27 la[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:546)
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
/* JADX INFO: renamed from: la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5113la {
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY("Chogort day", true),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_WRONG("Chogort day of week", true),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_OUR("Chogort week", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHOGORT_MONTH("Chogort month", true),
    CURRENCY("Currency", true),
    USER_ID("user_id", false),
    ENTER_WRONG_ACCOUNT("Enter wrong account", false),
    REGISTRATED("Registrated", false),
    AFF_ID("Aff_id", false),
    EMAIL("email_registered", false),
    FTD("is_ftd", false),
    /* JADX INFO: Fake field, exist only in values array */
    APP_NAME("app_name", true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_SCREEN_WIDTH("device_screen_width", true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_SCREEN_HEIGHT("device_screen_height", true),
    /* JADX INFO: Fake field, exist only in values array */
    START_VERSION("Start Version", true),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_OUR("device_screen_ratio", true),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY("Chat", true),
    PLATFORM_APP_INSTALLED("Platform app installed", true),
    SHOW("Show", true),
    COUNTER_MAKE_DEPOSIT("Counter make deposit", false),
    COUNTER_WIN_DEMO("Counter win demo", false),
    COUNTER_WIN_REAL("Counter win real", false),
    COUNTER_LOSE_DEMO("Counter lose demo", false),
    COUNTER_LOSE_REAL("Counter lose real", false),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_WRONG("Battery Optimization", false),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_OUR("Promocode", true),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY("Low memory", true),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_OUR("Verification Our", false),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION_WRONG("Verification Wrong ", false),
    INITIAL_WRONG_BALANCE("Initial Wrong Balance", false),
    PUSH_ALLOWED("pushAllowed", false),
    RATE_DONE_VALUE("rate", false),
    GOOGLE_PLAY_TRANSITION("is_review_gogle_play_transition", false),
    CHAT_TRANSITION("is_review_chat_transition", false),
    LANGUAGE("Language", false),
    /* JADX INFO: Fake field, exist only in values array */
    CURRENT_OS("Platform", true);


    @InterfaceC2691aI1("text")
    @NotNull
    public final String d;

    @InterfaceC2691aI1("once")
    public final boolean e;

    static {
        C1952Ru.i(enumC5113laArr);
    }

    public EnumC5113la(String str, boolean z) {
        super(str, i);
        this.d = str;
        this.e = z;
    }

    public static EnumC5113la valueOf(String str) {
        return (EnumC5113la) Enum.valueOf(EnumC5113la.class, str);
    }

    public static EnumC5113la[] values() {
        return (EnumC5113la[]) A.clone();
    }
}
