package defpackage;

import com.pexpress.tool.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tc0[], still in use, count: 1, list:
  (r0v1 tc0[]) from 0x0020: INVOKE (r0v1 tc0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:33)
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
/* JADX INFO: renamed from: tc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6804tc0 {
    WrongChar(R.string.nickname_characters_hint_text),
    BadLength(R.string.nickname_symbols_hint_text);

    public final int d;

    static {
        C1952Ru.i(enumC6804tc0Arr);
    }

    public EnumC6804tc0(int i) {
        super(str, i);
        this.d = i;
    }

    public static EnumC6804tc0 valueOf(String str) {
        return (EnumC6804tc0) Enum.valueOf(EnumC6804tc0.class, str);
    }

    public static EnumC6804tc0[] values() {
        return (EnumC6804tc0[]) h.clone();
    }
}
