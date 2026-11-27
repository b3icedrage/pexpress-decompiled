package defpackage;

import com.pexpress.tool.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Pt[], still in use, count: 1, list:
  (r0v1 Pt[]) from 0x003a: INVOKE (r0v1 Pt[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:59)
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
/* JADX INFO: renamed from: Pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1793Pt {
    Platform(R.id.main_platform_fragment),
    Robot(R.id.main_robot_fragment),
    Support(R.id.main_support_fragment),
    Account(R.id.main_account_fragment);

    public static final /* synthetic */ C4814k70 k;
    public final int d;

    static {
        k = C1952Ru.i(enumC1793PtArr);
    }

    public EnumC1793Pt(int i) {
        super(str, i);
        this.d = i;
    }

    public static EnumC1793Pt valueOf(String str) {
        return (EnumC1793Pt) Enum.valueOf(EnumC1793Pt.class, str);
    }

    public static EnumC1793Pt[] values() {
        return (EnumC1793Pt[]) j.clone();
    }
}
