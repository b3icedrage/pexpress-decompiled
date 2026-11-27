package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7977z92 {

    @NotNull
    public static final Set<C5638o21> a;

    @NotNull
    public static final HashMap<QC, QC> b;

    @NotNull
    public static final HashMap<QC, QC> c;

    @NotNull
    public static final LinkedHashSet d;

    static {
        EnumC7767y92[] enumC7767y92ArrValues = EnumC7767y92.values();
        ArrayList arrayList = new ArrayList(enumC7767y92ArrValues.length);
        for (EnumC7767y92 enumC7767y92 : enumC7767y92ArrValues) {
            arrayList.add(enumC7767y92.e);
        }
        a = CollectionsKt.h0(arrayList);
        EnumC6716t92[] enumC6716t92ArrValues = EnumC6716t92.values();
        ArrayList arrayList2 = new ArrayList(enumC6716t92ArrValues.length);
        for (EnumC6716t92 enumC6716t92 : enumC6716t92ArrValues) {
            arrayList2.add(enumC6716t92.d);
        }
        CollectionsKt.h0(arrayList2);
        b = new HashMap<>();
        c = new HashMap<>();
        Pair[] pairs = {new Pair(EnumC6716t92.UBYTEARRAY, C5638o21.k("ubyteArrayOf")), new Pair(EnumC6716t92.USHORTARRAY, C5638o21.k("ushortArrayOf")), new Pair(EnumC6716t92.UINTARRAY, C5638o21.k("uintArrayOf")), new Pair(EnumC6716t92.ULONGARRAY, C5638o21.k("ulongArrayOf"))};
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PW0.i(new HashMap(OW0.a(4)), pairs);
        EnumC7767y92[] enumC7767y92ArrValues2 = EnumC7767y92.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC7767y92 enumC7767y93 : enumC7767y92ArrValues2) {
            linkedHashSet.add(enumC7767y93.g.f());
        }
        d = linkedHashSet;
        for (EnumC7767y92 enumC7767y94 : EnumC7767y92.values()) {
            HashMap<QC, QC> map = b;
            QC qc = enumC7767y94.g;
            QC qc2 = enumC7767y94.d;
            map.put(qc, qc2);
            c.put(qc2, enumC7767y94.g);
        }
    }

    public static final boolean a(@NotNull AbstractC4649jL0 type) {
        InterfaceC5044lD descriptor;
        Intrinsics.checkNotNullParameter(type, "type");
        if (C3089c72.n(type) || (descriptor = type.V0().c()) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        InterfaceC4675jU interfaceC4675jUE = descriptor.e();
        return (interfaceC4675jUE instanceof InterfaceC2392Xa1) && Intrinsics.a(((InterfaceC2392Xa1) interfaceC4675jUE).c(), C4194hP1.l) && a.contains(descriptor.getName());
    }
}
