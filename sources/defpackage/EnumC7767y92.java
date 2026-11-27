package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y92[], still in use, count: 1, list:
  (r0v1 y92[]) from 0x003e: INVOKE (r0v1 y92[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:63)
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
/* JADX INFO: renamed from: y92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7767y92 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(QC.a.a("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(QC.a.a("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(QC.a.a("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(QC.a.a("kotlin/ULong", false));


    @NotNull
    public final QC d;

    @NotNull
    public final C5638o21 e;

    @NotNull
    public final QC g;

    static {
        C1952Ru.i(enumC7767y92Arr);
    }

    public EnumC7767y92(QC qc) {
        super(str, i);
        this.d = qc;
        C5638o21 c5638o21F = qc.f();
        this.e = c5638o21F;
        C5638o21 c5638o21K = C5638o21.k(c5638o21F.e() + "Array");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        this.g = new QC(qc.a, c5638o21K);
    }

    public static EnumC7767y92 valueOf(String str) {
        return (EnumC7767y92) Enum.valueOf(EnumC7767y92.class, str);
    }

    public static EnumC7767y92[] values() {
        return (EnumC7767y92[]) h.clone();
    }
}
