package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4366iD extends Y62 {

    /* JADX INFO: renamed from: iD$a */
    public static final class a {
        public static boolean A(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return C3686f.n((AbstractC4649jL0) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean B(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                InterfaceC5044lD interfaceC5044lDC = ((InterfaceC6494s62) receiver).c();
                FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
                return (fc != null ? fc.F0() : null) instanceof C6928uA0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean C(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return receiver instanceof KB0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean D(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return receiver instanceof C4622jC0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean E(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                return ((AbstractC5706oM1) receiver).W0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean F(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return RK0.I((InterfaceC6494s62) receiver, C4194hP1.a.b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean G(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return C3089c72.e((AbstractC4649jL0) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean H(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return RK0.G((AbstractC4649jL0) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean I(@NotNull InterfaceC3054bz receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5226m41) {
                return ((C5226m41) receiver).k;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean J(@NotNull InterfaceC4812k62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N62) {
                return ((N62) receiver).c();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean K(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof AbstractC5706oM1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
            }
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) receiver;
            Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
            if (abstractC4649jL0 instanceof AbstractC5632o1) {
                return true;
            }
            return (abstractC4649jL0 instanceof BW) && (((BW) abstractC4649jL0).e instanceof AbstractC5632o1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean L(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof AbstractC5706oM1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
            }
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) receiver;
            Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
            if (abstractC4649jL0 instanceof XT1) {
                return true;
            }
            return (abstractC4649jL0 instanceof BW) && (((BW) abstractC4649jL0).e instanceof XT1);
        }

        @NotNull
        public static AbstractC5706oM1 M(@NotNull InterfaceC2559Ze0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC2299We0) {
                return ((AbstractC2299We0) receiver).e;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static P92 N(@NotNull InterfaceC3054bz receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5226m41) {
                return ((C5226m41) receiver).h;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static P92 O(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof P92) {
                return C6971uO1.a((P92) receiver, false);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static AbstractC5706oM1 P(@NotNull CW receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof BW) {
                return ((BW) receiver).e;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static int Q(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return ((InterfaceC6494s62) receiver).b().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static Set R(@NotNull InterfaceC4366iD interfaceC4366iD, @NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            InterfaceC6494s62 interfaceC6494s62J = interfaceC4366iD.J(receiver);
            if (interfaceC6494s62J instanceof KB0) {
                return ((KB0) interfaceC6494s62J).a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static N62 S(@NotNull InterfaceC2540Yy receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5436n41) {
                return ((C5436n41) receiver).a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static C4624jD T(@NotNull InterfaceC4366iD interfaceC4366iD, @NotNull InterfaceC6126qM1 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof AbstractC5706oM1) {
                AbstractC7124v62.a aVar = AbstractC7124v62.b;
                AbstractC4649jL0 kotlinType = (AbstractC4649jL0) type;
                Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                return new C4624jD(interfaceC4366iD, aVar.a(kotlinType.V0(), kotlinType.T0()).c());
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(type);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, type.getClass(), sb).toString());
        }

        @NotNull
        public static Collection U(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                Collection<AbstractC4649jL0> collectionA = ((InterfaceC6494s62) receiver).a();
                Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                return collectionA;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static C5436n41 V(@NotNull InterfaceC3054bz receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5226m41) {
                return ((C5226m41) receiver).g;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static InterfaceC6494s62 W(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                return ((AbstractC5706oM1) receiver).V0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static AbstractC5706oM1 X(@NotNull InterfaceC2559Ze0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC2299We0) {
                return ((AbstractC2299We0) receiver).g;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static InterfaceC5702oL0 Y(@NotNull InterfaceC4366iD interfaceC4366iD, @NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6126qM1) {
                return interfaceC4366iD.C((InterfaceC6126qM1) receiver, true);
            }
            if (!(receiver instanceof InterfaceC2559Ze0)) {
                throw new IllegalStateException("sealed");
            }
            InterfaceC2559Ze0 interfaceC2559Ze0 = (InterfaceC2559Ze0) receiver;
            return interfaceC4366iD.k0(interfaceC4366iD.C(interfaceC4366iD.i0(interfaceC2559Ze0), true), interfaceC4366iD.C(interfaceC4366iD.P(interfaceC2559Ze0), true));
        }

        @NotNull
        public static AbstractC5706oM1 Z(@NotNull InterfaceC6126qM1 receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                return ((AbstractC5706oM1) receiver).Z0(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean a(@NotNull InterfaceC6704t62 c1, @NotNull InterfaceC6704t62 c2) {
            Intrinsics.checkNotNullParameter(c1, "c1");
            Intrinsics.checkNotNullParameter(c2, "c2");
            if (!(c1 instanceof InterfaceC6494s62)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(c1);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, c1.getClass(), sb).toString());
            }
            if (c2 instanceof InterfaceC6494s62) {
                return Intrinsics.a(c1, c2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c2);
            sb2.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, c2.getClass(), sb2).toString());
        }

        public static int b(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return ((AbstractC4649jL0) receiver).T0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static InterfaceC4602j62 c(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                return (InterfaceC4602j62) receiver;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static InterfaceC3054bz d(@NotNull InterfaceC4366iD interfaceC4366iD, @NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                if (receiver instanceof C6545sM1) {
                    return interfaceC4366iD.L(((C6545sM1) receiver).e);
                }
                if (receiver instanceof C5226m41) {
                    return (C5226m41) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static BW e(@NotNull InterfaceC6126qM1 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5706oM1) {
                if (receiver instanceof BW) {
                    return (BW) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static Y40 f(@NotNull AbstractC2299We0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Y40) {
                return (Y40) receiver;
            }
            return null;
        }

        @Nullable
        public static AbstractC2299We0 g(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                P92 p92Y0 = ((AbstractC4649jL0) receiver).Y0();
                if (p92Y0 instanceof AbstractC2299We0) {
                    return (AbstractC2299We0) p92Y0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static AbstractC5706oM1 h(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                P92 p92Y0 = ((AbstractC4649jL0) receiver).Y0();
                if (p92Y0 instanceof AbstractC5706oM1) {
                    return (AbstractC5706oM1) p92Y0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static P62 i(@NotNull InterfaceC5702oL0 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return C0564Aa.b((AbstractC4649jL0) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static AbstractC5706oM1 j(@NotNull InterfaceC6126qM1 type) {
            List<N62> listT0;
            ArrayList arrayList;
            EnumC2120Ty captureStatus = EnumC2120Ty.d;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(captureStatus, "status");
            if (!(type instanceof AbstractC5706oM1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(type);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, type.getClass(), sb).toString());
            }
            AbstractC5706oM1 type2 = (AbstractC5706oM1) type;
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(captureStatus, "status");
            BZ bz = null;
            if (type2.T0().size() == type2.V0().b().size() && ((listT0 = type2.T0()) == null || !listT0.isEmpty())) {
                Iterator<T> it = listT0.iterator();
                while (it.hasNext()) {
                    if (((N62) it.next()).b() != EnumC3610ed2.INVARIANT) {
                        List<H62> listB = type2.V0().b();
                        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                        ArrayList<Pair> arrayListJ0 = CollectionsKt.j0(listT0, listB);
                        arrayList = new ArrayList(XE.m(arrayListJ0, 10));
                        for (Pair pair : arrayListJ0) {
                            N62 projection = (N62) pair.d;
                            H62 typeParameter = (H62) pair.e;
                            if (projection.b() != EnumC3610ed2.INVARIANT) {
                                P92 p92Y0 = (projection.c() || projection.b() != EnumC3610ed2.IN_VARIANCE) ? null : projection.getType().Y0();
                                Intrinsics.checkNotNull(typeParameter);
                                Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
                                Intrinsics.checkNotNullParameter(projection, "projection");
                                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                                projection = C0564Aa.b(new C5226m41(captureStatus, new C5436n41(projection, bz, typeParameter, 6), p92Y0, (C5655o62) null, false, 56));
                            }
                            arrayList.add(projection);
                        }
                        X62 x62C = AbstractC7124v62.b.a(type2.V0(), arrayList).c();
                        int size = listT0.size();
                        for (int i = 0; i < size; i++) {
                            N62 n62 = listT0.get(i);
                            N62 n63 = (N62) arrayList.get(i);
                            if (n62.b() != EnumC3610ed2.INVARIANT) {
                                List<AbstractC4649jL0> upperBounds = type2.V0().b().get(i).getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                                ArrayList supertypes = new ArrayList();
                                Iterator<T> it2 = upperBounds.iterator();
                                while (it2.hasNext()) {
                                    supertypes.add(AbstractC5912pL0.a.e.w(x62C.h((AbstractC4649jL0) it2.next(), EnumC3610ed2.INVARIANT).Y0()));
                                }
                                if (!n62.c() && n62.b() == EnumC3610ed2.OUT_VARIANCE) {
                                    supertypes.add(AbstractC5912pL0.a.e.w(n62.getType().Y0()));
                                }
                                AbstractC4649jL0 type3 = n63.getType();
                                Intrinsics.c(type3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                C5436n41 c5436n41 = ((C5226m41) type3).g;
                                c5436n41.getClass();
                                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                                c5436n41.b = new CZ(1, supertypes);
                            }
                        }
                    }
                }
                arrayList = null;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                return C5492nL0.c(type2.U0(), type2.V0(), arrayList, type2.W0(), null);
            }
            return null;
        }

        @NotNull
        public static EnumC2120Ty k(@NotNull InterfaceC3054bz receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5226m41) {
                return ((C5226m41) receiver).e;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static P92 l(@NotNull InterfaceC4366iD interfaceC4366iD, @NotNull InterfaceC6126qM1 lowerBound, @NotNull InterfaceC6126qM1 upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC5706oM1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC4366iD);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, interfaceC4366iD.getClass(), sb).toString());
            }
            if (upperBound instanceof AbstractC5706oM1) {
                return C5492nL0.a((AbstractC5706oM1) lowerBound, (AbstractC5706oM1) upperBound);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC4366iD);
            sb2.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, interfaceC4366iD.getClass(), sb2).toString());
        }

        @NotNull
        public static InterfaceC4812k62 m(@NotNull InterfaceC5702oL0 receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC4649jL0) {
                return ((AbstractC4649jL0) receiver).T0().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static J62 n(@NotNull InterfaceC6704t62 receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                H62 h62 = ((InterfaceC6494s62) receiver).b().get(i);
                Intrinsics.checkNotNullExpressionValue(h62, "get(...)");
                return h62;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static P92 o(@NotNull InterfaceC4812k62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N62) {
                return ((N62) receiver).getType().Y0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static H62 p(@NotNull InterfaceC3508e72 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C41) {
                return ((C41) receiver).d();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @Nullable
        public static H62 q(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                InterfaceC5044lD interfaceC5044lDC = ((InterfaceC6494s62) receiver).c();
                if (interfaceC5044lDC instanceof H62) {
                    return (H62) interfaceC5044lDC;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static EnumC3718f72 r(@NotNull InterfaceC4812k62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof N62) {
                EnumC3610ed2 enumC3610ed2B = ((N62) receiver).b();
                Intrinsics.checkNotNullExpressionValue(enumC3610ed2B, "getProjectionKind(...)");
                return C4994l.c(enumC3610ed2B);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        @NotNull
        public static EnumC3718f72 s(@NotNull J62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof H62) {
                EnumC3610ed2 enumC3610ed2S = ((H62) receiver).S();
                Intrinsics.checkNotNullExpressionValue(enumC3610ed2S, "getVariance(...)");
                return C4994l.c(enumC3610ed2S);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean t(@NotNull AbstractC4649jL0 receiver, @NotNull C1758Ph0 fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver != null) {
                return receiver.k().P(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean u(@NotNull J62 receiver, @Nullable InterfaceC6704t62 interfaceC6704t62) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof H62)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
            }
            H62 h62 = (H62) receiver;
            if (interfaceC6704t62 == null ? true : interfaceC6704t62 instanceof InterfaceC6494s62) {
                return C0564Aa.q(h62, (InterfaceC6494s62) interfaceC6704t62, 4);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(h62);
            sb2.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, h62.getClass(), sb2).toString());
        }

        public static boolean v(@NotNull InterfaceC6126qM1 a, @NotNull InterfaceC6126qM1 b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            if (!(a instanceof AbstractC5706oM1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(a);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, a.getClass(), sb).toString());
            }
            if (b instanceof AbstractC5706oM1) {
                return ((AbstractC5706oM1) a).T0() == ((AbstractC5706oM1) b).T0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(b);
            sb2.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, b.getClass(), sb2).toString());
        }

        public static boolean w(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return RK0.I((InterfaceC6494s62) receiver, C4194hP1.a.a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean x(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return ((InterfaceC6494s62) receiver).c() instanceof FC;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }

        public static boolean y(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof InterfaceC6494s62)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
            }
            InterfaceC5044lD interfaceC5044lDC = ((InterfaceC6494s62) receiver).c();
            FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
            if (fc != null) {
                Intrinsics.checkNotNullParameter(fc, "<this>");
                if (fc.q() == C01.e && fc.h() != SC.g && fc.h() != SC.h && fc.h() != SC.i) {
                    return true;
                }
            }
            return false;
        }

        public static boolean z(@NotNull InterfaceC6704t62 receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof InterfaceC6494s62) {
                return ((InterfaceC6494s62) receiver).e();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
        }
    }

    @NotNull
    P92 k0(@NotNull InterfaceC6126qM1 interfaceC6126qM1, @NotNull InterfaceC6126qM1 interfaceC6126qM2);
}
