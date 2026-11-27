package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 iL0[], still in use, count: 1, list:
  (r0v28 iL0[]) from 0x0234: INVOKE (r0v29 k70) = (r0v28 iL0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:565)
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
/* JADX INFO: renamed from: iL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4391iL0 {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final /* synthetic */ C4814k70 P;

    @NotNull
    public static final HashMap<String, EnumC4391iL0> e;

    @NotNull
    public static final List<EnumC4391iL0> g;

    @NotNull
    public static final List<EnumC4391iL0> h;

    @NotNull
    public static final List<EnumC4391iL0> i;

    @NotNull
    public static final List<EnumC4391iL0> j;

    @NotNull
    public static final List<EnumC4391iL0> k;

    @NotNull
    public static final List<EnumC4391iL0> l;

    @NotNull
    public static final List<EnumC4391iL0> m;

    @NotNull
    public static final List<EnumC4391iL0> n;

    @NotNull
    public static final List<EnumC4391iL0> o;

    @NotNull
    public static final List<EnumC4391iL0> p;

    @NotNull
    public static final List<EnumC4391iL0> q;

    @NotNull
    public static final List<EnumC4391iL0> r;

    @NotNull
    public static final Object s;
    public final boolean d;

    static {
        C4814k70 c4814k70I = C1952Ru.i(enumC4391iL0Arr);
        P = c4814k70I;
        e = new HashMap<>();
        AbstractC5838p0.b bVar = new AbstractC5838p0.b();
        while (bVar.hasNext()) {
            EnumC4391iL0 enumC4391iL0 = (EnumC4391iL0) bVar.next();
            e.put(enumC4391iL0.name(), enumC4391iL0);
        }
        C4814k70 c4814k70 = P;
        ArrayList arrayList = new ArrayList();
        c4814k70.getClass();
        AbstractC5838p0.b bVar2 = new AbstractC5838p0.b();
        while (bVar2.hasNext()) {
            Object next = bVar2.next();
            if (((EnumC4391iL0) next).d) {
                arrayList.add(next);
            }
        }
        CollectionsKt.h0(arrayList);
        CollectionsKt.h0(P);
        EnumC4391iL0 enumC4391iL1 = ANNOTATION_CLASS;
        EnumC4391iL0 enumC4391iL2 = CLASS;
        g = WE.f(enumC4391iL1, enumC4391iL2);
        h = WE.f(LOCAL_CLASS, enumC4391iL2);
        i = WE.f(CLASS_ONLY, enumC4391iL2);
        EnumC4391iL0 enumC4391iL3 = COMPANION_OBJECT;
        EnumC4391iL0 enumC4391iL4 = OBJECT;
        j = WE.f(enumC4391iL3, enumC4391iL4, enumC4391iL2);
        k = WE.f(STANDALONE_OBJECT, enumC4391iL4, enumC4391iL2);
        l = WE.f(INTERFACE, enumC4391iL2);
        m = WE.f(ENUM_CLASS, enumC4391iL2);
        EnumC4391iL0 enumC4391iL5 = ENUM_ENTRY;
        EnumC4391iL0 enumC4391iL6 = PROPERTY;
        EnumC4391iL0 enumC4391iL7 = FIELD;
        n = WE.f(enumC4391iL5, enumC4391iL6, enumC4391iL7);
        EnumC4391iL0 enumC4391iL8 = PROPERTY_SETTER;
        o = VE.c(enumC4391iL8);
        EnumC4391iL0 enumC4391iL9 = PROPERTY_GETTER;
        p = VE.c(enumC4391iL9);
        q = VE.c(FUNCTION);
        EnumC4391iL0 enumC4391iL10 = FILE;
        r = VE.c(enumC4391iL10);
        EnumC2132Uc enumC2132Uc = EnumC2132Uc.CONSTRUCTOR_PARAMETER;
        EnumC4391iL0 enumC4391iL11 = VALUE_PARAMETER;
        s = PW0.e(new Pair(enumC2132Uc, enumC4391iL11), new Pair(EnumC2132Uc.FIELD, enumC4391iL7), new Pair(EnumC2132Uc.PROPERTY, enumC4391iL6), new Pair(EnumC2132Uc.FILE, enumC4391iL10), new Pair(EnumC2132Uc.PROPERTY_GETTER, enumC4391iL9), new Pair(EnumC2132Uc.PROPERTY_SETTER, enumC4391iL8), new Pair(EnumC2132Uc.RECEIVER, enumC4391iL11), new Pair(EnumC2132Uc.SETTER_PARAMETER, enumC4391iL11), new Pair(EnumC2132Uc.PROPERTY_DELEGATE_FIELD, enumC4391iL7));
    }

    public EnumC4391iL0(boolean z) {
        super(str, i);
        this.d = z;
    }

    public static EnumC4391iL0 valueOf(String str) {
        return (EnumC4391iL0) Enum.valueOf(EnumC4391iL0.class, str);
    }

    public static EnumC4391iL0[] values() {
        return (EnumC4391iL0[]) O.clone();
    }
}
