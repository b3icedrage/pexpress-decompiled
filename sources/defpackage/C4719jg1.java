package defpackage;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4719jg1 {

    @NotNull
    public static final C2905bF0 a = new C2905bF0(EnumC5238m71.e, false);

    @NotNull
    public static final C2905bF0 b;

    @NotNull
    public static final C2905bF0 c;

    @NotNull
    public static final LinkedHashMap d;

    static {
        EnumC5238m71 enumC5238m71 = EnumC5238m71.g;
        b = new C2905bF0(enumC5238m71, false);
        c = new C2905bF0(enumC5238m71, true);
        String strK = C3787fU.k("Object");
        String strJ = C3787fU.j("Predicate");
        String strJ2 = C3787fU.j("Function");
        String strJ3 = C3787fU.j("Consumer");
        String strJ4 = C3787fU.j("BiFunction");
        String strJ5 = C3787fU.j("BiConsumer");
        String strJ6 = C3787fU.j("UnaryOperator");
        String strL = C3787fU.l("stream/Stream");
        String strL2 = C3787fU.l("Optional");
        QL1 ql1 = new QL1();
        new QL1.a(ql1, C3787fU.l("Iterator")).a("forEachRemaining", null, new C2769ag1(strJ3, 0));
        new QL1.a(ql1, C3787fU.k("Iterable")).a("spliterator", null, new NY(2));
        QL1.a aVar = new QL1.a(ql1, C3787fU.l("Collection"));
        aVar.a("removeIf", null, new C6760tO0(strJ, 2));
        aVar.a("stream", null, new DK(strL, 2));
        aVar.a("parallelStream", null, new C3477e0(strL, 3));
        QL1.a aVar2 = new QL1.a(ql1, C3787fU.l("List"));
        aVar2.a("replaceAll", null, new C1424La1(strJ6, 1));
        aVar2.a("addFirst", "2.1", new C4815k71(strK, 1));
        aVar2.a("addLast", "2.1", new C1501Ma1(strK, 1));
        aVar2.a("removeFirst", "2.1", new C2769ag1(strK, 1));
        aVar2.a("removeLast", "2.1", new C2993bg1(strK, 1));
        QL1.a aVar3 = new QL1.a(ql1, C3787fU.l("LinkedList"));
        aVar3.a("addFirst", "2.1", new C2993bg1(strK, 0));
        aVar3.a("addLast", "2.1", new CO0(strK, 2));
        aVar3.a("removeFirst", "2.1", new QK0(strK, 1));
        aVar3.a("removeLast", "2.1", new C3944gC0(strK, 2));
        QL1.a aVar4 = new QL1.a(ql1, C3787fU.l("Map"));
        aVar4.a("forEach", null, new C4321i1(strJ5, 1));
        aVar4.a("putIfAbsent", null, new C4364iC0(strK, 1));
        aVar4.a("replace", null, new BH(strK, 2));
        aVar4.a("replace", null, new C6052q1(strK, 1));
        aVar4.a("replaceAll", null, new C6261r1(strJ4, 1));
        aVar4.a("compute", null, new C3202cg1(strK, strJ4));
        aVar4.a("computeIfAbsent", null, new C3412dg1(strK, strJ2));
        aVar4.a("computeIfPresent", null, new C3621eg1(strK, strJ4));
        aVar4.a("merge", null, new C3831fg1(strK, strJ4));
        QL1.a aVar5 = new QL1.a(ql1, strL2);
        aVar5.a("empty", null, new C7942z1(strL2, 1));
        aVar5.a("of", null, new HZ(1, strK, strL2));
        aVar5.a("ofNullable", null, new C4041gg1(strK, strL2));
        aVar5.a("get", null, new C4175hJ0(strK, 3));
        aVar5.a("ifPresent", null, new C4251hg1(strJ3));
        new QL1.a(ql1, C3787fU.k("ref/Reference")).a("get", null, new E(strK, 1));
        new QL1.a(ql1, strJ).a("test", null, new C7854yc(strK, 1));
        new QL1.a(ql1, C3787fU.j("BiPredicate")).a("test", null, new C2740aZ(strK, 2));
        new QL1.a(ql1, strJ3).a("accept", null, new TZ(strK, 1));
        new QL1.a(ql1, strJ5).a("accept", null, new Q(strK, 4));
        new QL1.a(ql1, strJ2).a("apply", null, new RO0(strK, 1));
        new QL1.a(ql1, strJ4).a("apply", null, new C4460ig1(strK, 0));
        new QL1.a(ql1, C3787fU.j("Supplier")).a("get", null, new XZ(strK, 1));
        d = ql1.a;
    }
}
