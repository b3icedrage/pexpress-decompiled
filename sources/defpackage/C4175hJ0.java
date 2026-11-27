package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4175hJ0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4175hJ0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(Intrinsics.a((RI0) obj, (RI0) this.e));
            case 1:
                C5638o21 name = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                QO0 qo0 = (QO0) this.e;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((C2720aS0.k) qo0.f).invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strA = C3689f01.a((InterfaceC3765fM1) obj2, 2);
                    Object arrayList = linkedHashMap.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strA, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionA = C1738Pa1.a(list, PO0.d);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionA);
                    }
                }
                qo0.m(linkedHashSet, name);
                LO0 lo0 = qo0.b;
                return CollectionsKt.e0(lo0.a.r.c(lo0, linkedHashSet));
            case 2:
                C1758Ph0 fqName = (C1758Ph0) obj;
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                T01 t01 = (T01) this.e;
                return t01.j.a(t01, fqName, t01.g);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.c);
                return Unit.a;
        }
    }
}
