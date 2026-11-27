package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4579j1<TAnnotation> {

    /* JADX INFO: renamed from: j1$a */
    public static final class a {

        @Nullable
        public final InterfaceC5702oL0 a;

        @Nullable
        public final C3114cF0 b;

        @Nullable
        public final J62 c;

        public a(@Nullable InterfaceC5702oL0 interfaceC5702oL0, @Nullable C3114cF0 c3114cF0, @Nullable J62 j62) {
            this.a = interfaceC5702oL0;
            this.b = c3114cF0;
            this.c = j62;
        }
    }

    public static void a(Object obj, ArrayList arrayList, C4321i1 c4321i1) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c4321i1.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, c4321i1);
            }
        }
    }

    public static EnumC5238m71 c(InterfaceC5702oL0 interfaceC5702oL0) {
        AbstractC5706oM1 abstractC5706oM1H;
        AbstractC5706oM1 abstractC5706oM1H2;
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC2299We0 abstractC2299We0G = InterfaceC4366iD.a.g(interfaceC5702oL0);
        if (abstractC2299We0G == null || (abstractC5706oM1H = InterfaceC4366iD.a.M(abstractC2299We0G)) == null) {
            abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
            Intrinsics.checkNotNull(abstractC5706oM1H);
        }
        if (InterfaceC4366iD.a.E(abstractC5706oM1H)) {
            return EnumC5238m71.e;
        }
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC2299We0 abstractC2299We0G2 = InterfaceC4366iD.a.g(interfaceC5702oL0);
        if (abstractC2299We0G2 == null || (abstractC5706oM1H2 = InterfaceC4366iD.a.X(abstractC2299We0G2)) == null) {
            abstractC5706oM1H2 = InterfaceC4366iD.a.h(interfaceC5702oL0);
            Intrinsics.checkNotNull(abstractC5706oM1H2);
        }
        if (InterfaceC4366iD.a.E(abstractC5706oM1H2)) {
            return null;
        }
        return EnumC5238m71.g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:69:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:3: B:30:0x0067->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v13 */
    public final C5448n71 b(J62 receiver) {
        ?? arrayList;
        AbstractC4649jL0 abstractC4649jL0E;
        EnumC5238m71 enumC5238m71;
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        if (!(receiver instanceof VO0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver == null) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }
        List<AbstractC4649jL0> upperBounds = ((H62) receiver).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!InterfaceC4366iD.a.A((InterfaceC5702oL0) it.next())) {
                if (upperBounds.isEmpty()) {
                    if (upperBounds.isEmpty()) {
                        return null;
                    }
                    for (InterfaceC5702oL0 interfaceC5702oL0 : upperBounds) {
                        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                        if (C6621sj.e((AbstractC4649jL0) interfaceC5702oL0) != null) {
                            arrayList = new ArrayList();
                            for (InterfaceC5702oL0 interfaceC5702oL1 : upperBounds) {
                                Intrinsics.checkNotNullParameter(interfaceC5702oL1, "<this>");
                                abstractC4649jL0E = C6621sj.e((AbstractC4649jL0) interfaceC5702oL1);
                                if (abstractC4649jL0E != null) {
                                    arrayList.add(abstractC4649jL0E);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = upperBounds.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (upperBounds.isEmpty()) {
                            return null;
                        }
                        while (r1.hasNext()) {
                            Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                            if (C6621sj.e((AbstractC4649jL0) interfaceC5702oL0) != null) {
                                arrayList = new ArrayList();
                                while (r2.hasNext()) {
                                    Intrinsics.checkNotNullParameter(interfaceC5702oL1, "<this>");
                                    abstractC4649jL0E = C6621sj.e((AbstractC4649jL0) interfaceC5702oL1);
                                    if (abstractC4649jL0E != null) {
                                        arrayList.add(abstractC4649jL0E);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (c((InterfaceC5702oL0) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                if (arrayList.isEmpty()) {
                    enumC5238m71 = EnumC5238m71.e;
                    break;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        enumC5238m71 = EnumC5238m71.e;
                        break;
                    }
                    if (!InterfaceC4366iD.a.G((InterfaceC5702oL0) it3.next())) {
                        enumC5238m71 = EnumC5238m71.g;
                        break;
                    }
                }
                return new C5448n71(enumC5238m71, arrayList != upperBounds);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fO0, java.lang.Object] */
    public final ArrayList d(InterfaceC5702oL0 interfaceC5702oL0) {
        RL1 rl1 = (RL1) this;
        C3114cF0 c3114cF0 = (C3114cF0) rl1.c.d.getValue();
        C2054Tc c2054TcE = rl1.e();
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        a aVar = new a(interfaceC5702oL0, c2054TcE.b(c3114cF0, ((AbstractC4649jL0) interfaceC5702oL0).k()), null);
        C4321i1 c4321i1 = new C4321i1(this, 0);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, c4321i1);
        return arrayList;
    }
}
