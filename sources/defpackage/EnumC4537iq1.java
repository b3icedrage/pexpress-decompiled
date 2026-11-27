package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 iq1[], still in use, count: 1, list:
  (r0v1 iq1[]) from 0x0062: INVOKE (r0v1 iq1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:99)
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
/* JADX INFO: renamed from: iq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4537iq1 implements InterfaceC1983Se0 {
    IGNORE_CASE(2, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(UserVerificationMethods.USER_VERIFY_PATTERN, 0, 2, null);

    public final int d;

    static {
        C1952Ru.i(enumC4537iq1Arr);
    }

    public EnumC4537iq1() {
        throw null;
    }

    public EnumC4537iq1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i);
        this.d = i;
    }

    public static EnumC4537iq1 valueOf(String str) {
        return (EnumC4537iq1) Enum.valueOf(EnumC4537iq1.class, str);
    }

    public static EnumC4537iq1[] values() {
        return (EnumC4537iq1[]) h.clone();
    }

    @Override // defpackage.InterfaceC1983Se0
    public final int getValue() {
        return this.d;
    }
}
