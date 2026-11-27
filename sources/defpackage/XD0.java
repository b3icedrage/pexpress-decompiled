package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class XD0 {

    @NotNull
    public static final Object a = PW0.e(new Pair("PACKAGE", EnumSet.noneOf(EnumC4391iL0.class)), new Pair("TYPE", EnumSet.of(EnumC4391iL0.CLASS, EnumC4391iL0.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(EnumC4391iL0.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(EnumC4391iL0.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(EnumC4391iL0.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(EnumC4391iL0.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(EnumC4391iL0.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(EnumC4391iL0.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(EnumC4391iL0.FUNCTION, EnumC4391iL0.PROPERTY_GETTER, EnumC4391iL0.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(EnumC4391iL0.TYPE)));

    @NotNull
    public static final Object b = PW0.e(new Pair("RUNTIME", EnumC4181hL0.d), new Pair("CLASS", EnumC4181hL0.e), new Pair("SOURCE", EnumC4181hL0.g));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static C1059Gj a(@NotNull List arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC6310rE0) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC4391iL0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(((InterfaceC6310rE0) it.next()).d().e());
            if (iterable == null) {
                iterable = C6702t60.d;
            }
            C2904bF.o(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(XE.m(arrayList2, 10));
        for (EnumC4391iL0 enumC4391iL0 : arrayList2) {
            C1758Ph0 topLevelFqName = C4194hP1.a.u;
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            QC qc = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
            C5638o21 c5638o21K = C5638o21.k(enumC4391iL0.name());
            Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
            arrayList3.add(new C6286r70(qc, c5638o21K));
        }
        return new C1059Gj(arrayList3, C4690jZ.g);
    }
}
