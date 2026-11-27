package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rh1[], still in use, count: 1, list:
  (r0v1 rh1[]) from 0x0066: INVOKE (r0v1 rh1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:103)
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
/* JADX INFO: renamed from: rh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6405rh1 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    @NotNull
    public static final Set<EnumC6405rh1> i;

    @NotNull
    public final C5638o21 d;

    @NotNull
    public final C5638o21 e;

    @NotNull
    public final Object g;

    @NotNull
    public final Object h;

    static {
        EnumC6405rh1 enumC6405rh1 = CHAR;
        EnumC6405rh1 enumC6405rh2 = BYTE;
        EnumC6405rh1 enumC6405rh3 = SHORT;
        EnumC6405rh1 enumC6405rh4 = INT;
        EnumC6405rh1 enumC6405rh5 = FLOAT;
        EnumC6405rh1 enumC6405rh6 = LONG;
        EnumC6405rh1 enumC6405rh7 = DOUBLE;
        C1952Ru.i(enumC6405rh1Arr);
        EnumC6405rh1[] elements = {enumC6405rh1, enumC6405rh2, enumC6405rh3, enumC6405rh4, enumC6405rh5, enumC6405rh6, enumC6405rh7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i = C1526Mj.H(elements);
    }

    public EnumC6405rh1(String str) {
        super(str, i);
        C5638o21 c5638o21K = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        this.d = c5638o21K;
        C5638o21 c5638o21K2 = C5638o21.k(str.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        this.e = c5638o21K2;
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.g = XO0.a(enumC4403iP0, new GZ(this, 4));
        this.h = XO0.a(enumC4403iP0, new C6196qh1(this));
    }

    public static EnumC6405rh1 valueOf(String str) {
        return (EnumC6405rh1) Enum.valueOf(EnumC6405rh1.class, str);
    }

    public static EnumC6405rh1[] values() {
        return (EnumC6405rh1[]) r.clone();
    }
}
