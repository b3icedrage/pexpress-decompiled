package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vu1[], still in use, count: 1, list:
  (r0v1 vu1[]) from 0x005a: INVOKE (r0v1 vu1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:91)
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
/* JADX INFO: renamed from: vu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7290vu1 {
    LOW(R.string.risk_low_text, R.color.lowRisk, Integer.valueOf(R.drawable.ic_low_risk)),
    MEDIUM(R.string.medium_risk_text, R.color.mediumRisk, Integer.valueOf(R.drawable.ic_medium_risk)),
    HIGH(R.string.high_risk_text, R.color.highRisk, Integer.valueOf(R.drawable.ic_high_risk)),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(R.string.fixed_initial_amount_title, R.color.textGrey, null);

    public final int d;
    public final int e;

    @Nullable
    public final Integer g;

    static {
        C1952Ru.i(enumC7290vu1Arr);
    }

    public EnumC7290vu1(int i, int i2, Integer num) {
        super(str, i);
        this.d = i;
        this.e = i2;
        this.g = num;
    }

    public static EnumC7290vu1 valueOf(String str) {
        return (EnumC7290vu1) Enum.valueOf(EnumC7290vu1.class, str);
    }

    public static EnumC7290vu1[] values() {
        return (EnumC7290vu1[]) k.clone();
    }
}
