package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t92[], still in use, count: 1, list:
  (r0v1 t92[]) from 0x0046: INVOKE (r0v1 t92[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:71)
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
/* JADX INFO: renamed from: t92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6716t92 {
    UBYTEARRAY(QC.a.a("kotlin/UByteArray", false)),
    USHORTARRAY(QC.a.a("kotlin/UShortArray", false)),
    UINTARRAY(QC.a.a("kotlin/UIntArray", false)),
    ULONGARRAY(QC.a.a("kotlin/ULongArray", false));


    @NotNull
    public final C5638o21 d;

    static {
        C1952Ru.i(enumC6716t92Arr);
    }

    public EnumC6716t92(QC qc) {
        super(str, i);
        this.d = qc.f();
    }

    public static EnumC6716t92 valueOf(String str) {
        return (EnumC6716t92) Enum.valueOf(EnumC6716t92.class, str);
    }

    public static EnumC6716t92[] values() {
        return (EnumC6716t92[]) j.clone();
    }
}
