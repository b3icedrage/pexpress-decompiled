package kotlin.text;

import defpackage.C1952Ru;
import defpackage.C4814k70;
import defpackage.C5668oA;
import defpackage.KW1;
import defpackage.XO0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 kotlin.text.b[], still in use, count: 1, list:
  (r0v7 kotlin.text.b[]) from 0x00d7: INVOKE (r0v7 kotlin.text.b[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:216)
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
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    UNDEFINED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER(3),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER_SEPARATOR(4),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER_TERMINATOR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ARABIC_NUMBER(6),
    /* JADX INFO: Fake field, exist only in values array */
    COMMON_NUMBER_SEPARATOR(7),
    /* JADX INFO: Fake field, exist only in values array */
    NONSPACING_MARK(8),
    /* JADX INFO: Fake field, exist only in values array */
    BOUNDARY_NEUTRAL(9),
    /* JADX INFO: Fake field, exist only in values array */
    PARAGRAPH_SEPARATOR(10),
    /* JADX INFO: Fake field, exist only in values array */
    SEGMENT_SEPARATOR(11),
    /* JADX INFO: Fake field, exist only in values array */
    WHITESPACE(12),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER_NEUTRALS(13),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT_EMBEDDING(14),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT_OVERRIDE(15),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT_EMBEDDING(16),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT_OVERRIDE(17),
    /* JADX INFO: Fake field, exist only in values array */
    POP_DIRECTIONAL_FORMAT(18);


    @NotNull
    public static final a e = new a(null);

    @NotNull
    public static final KW1 g = XO0.b(new C5668oA(0));
    public static final /* synthetic */ C4814k70 k;
    public final int d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        k = C1952Ru.i(new b[]{r1, r0, r3, r4, new b(3), new b(4), new b(5), new b(6), new b(7), new b(8), new b(9), new b(10), new b(11), new b(12), new b(13), new b(14), new b(15), new b(16), new b(17), new b(18)});
    }

    public b(int i) {
        super(str, i);
        this.d = i;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) j.clone();
    }
}
