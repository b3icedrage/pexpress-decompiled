package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 cZ[], still in use, count: 1, list:
  (r0v3 cZ[]) from 0x00a8: INVOKE (r0v3 cZ[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:169)
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
/* JADX INFO: renamed from: cZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3173cZ {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    @NotNull
    public static final Set<EnumC3173cZ> e;

    @NotNull
    public static final Set<EnumC3173cZ> g;
    public final boolean d;

    static {
        C1952Ru.i(new EnumC3173cZ[]{r0, r1, r3, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
        EnumC3173cZ[] enumC3173cZArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC3173cZ enumC3173cZ : enumC3173cZArrValues) {
            if (enumC3173cZ.d) {
                arrayList.add(enumC3173cZ);
            }
        }
        e = CollectionsKt.h0(arrayList);
        g = C1526Mj.H(values());
    }

    public EnumC3173cZ(boolean z) {
        super(str, i);
        this.d = z;
    }

    public static EnumC3173cZ valueOf(String str) {
        return (EnumC3173cZ) Enum.valueOf(EnumC3173cZ.class, str);
    }

    public static EnumC3173cZ[] values() {
        return (EnumC3173cZ[]) v.clone();
    }
}
