package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 aJ1[], still in use, count: 1, list:
  (r0v21 aJ1[]) from 0x012f: INVOKE (r0v21 aJ1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:304)
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
/* JADX INFO: renamed from: aJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2694aJ1 {
    TOKEN_ID_KEY("token_id"),
    EMAIL_KEY("email"),
    NICKNAME_KEY("nickname"),
    /* JADX INFO: Fake field, exist only in values array */
    AVATAR_URL_KEY("avatar"),
    APP_NAME("app_name"),
    IS_USER_ACTIVATED_KEY("activated"),
    PLATFORM_ID_KEY("plid"),
    FIREBASE_ID_KEY("frbid"),
    AD_ID_KEY("adid"),
    DID_USER_START_DEMO_TRADING_KEY("start_demo"),
    PLATFORM_NAME_KEY("platform_name"),
    SOURCE_KEY(Payload.SOURCE),
    REG_KEY("reg"),
    FCM_KEY("fcm_token"),
    LANGUAGE_KEY("lang"),
    USER_BALANCE_KEY("balance"),
    EXPERIMENTS_KEY("ab_test"),
    VERSION_KEY("app_version"),
    PLATFORM_WS("platform_ws"),
    USER_LOOKUP("user_lookup"),
    VERIFIED("verified");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC2694aJ1Arr);
    }

    public EnumC2694aJ1(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC2694aJ1 valueOf(String str) {
        return (EnumC2694aJ1) Enum.valueOf(EnumC2694aJ1.class, str);
    }

    public static EnumC2694aJ1[] values() {
        return (EnumC2694aJ1[]) z.clone();
    }
}
