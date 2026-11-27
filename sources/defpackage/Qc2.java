package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Qc2<M extends Member> implements InterfaceC2355Wx<M> {
    public final boolean a;

    @NotNull
    public final InterfaceC2355Wx<M> b;
    public final M c;

    @NotNull
    public final a d;

    @NotNull
    public final IntRange[] e;
    public final boolean f;

    public static final class a {

        @NotNull
        public final IntRange a;

        @NotNull
        public final List<Method>[] b;

        @Nullable
        public final Method c;

        public a(@NotNull IntRange argumentRange, @NotNull List<Method>[] unboxParameters, @Nullable Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.a = argumentRange;
            this.b = unboxParameters;
            this.c = method;
        }
    }

    public static final class b implements InterfaceC2355Wx {

        @NotNull
        public final Method a;

        @NotNull
        public final Method b;

        @NotNull
        public final ArrayList c;

        @NotNull
        public final ArrayList d;

        @NotNull
        public final ArrayList e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
        public b(@NotNull InterfaceC2076Tj0 descriptor, @NotNull AbstractC5906pJ0 container, @NotNull String constructorDesc, @NotNull List<? extends InterfaceC1582Nb1> originalParameters) {
            ?? C;
            Method methodN;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method methodK = container.k("constructor-impl", constructorDesc);
            Intrinsics.checkNotNull(methodK);
            this.a = methodK;
            Method methodK2 = container.k("box-impl", StringsKt.N(constructorDesc, "V") + C4753jp1.b(container.h()));
            Intrinsics.checkNotNull(methodK2);
            this.b = methodK2;
            ArrayList arrayList = new ArrayList(XE.m(originalParameters, 10));
            Iterator it = originalParameters.iterator();
            while (true) {
                List listC = null;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC4649jL0 type = ((InterfaceC1582Nb1) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                AbstractC5706oM1 abstractC5706oM1A = V62.a(type);
                ArrayList arrayListO = N7.o(abstractC5706oM1A);
                if (arrayListO == null) {
                    Class clsB = N7.B(abstractC5706oM1A);
                    if (clsB != null && (methodN = N7.n(clsB, descriptor)) != null) {
                        listC = VE.c(methodN);
                    }
                } else {
                    listC = arrayListO;
                }
                arrayList.add(listC);
            }
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList(XE.m(originalParameters, 10));
            int i = 0;
            for (Object obj : originalParameters) {
                int i2 = i + 1;
                if (i < 0) {
                    WE.l();
                    throw null;
                }
                InterfaceC5044lD interfaceC5044lDC = ((InterfaceC1582Nb1) obj).getType().V0().c();
                Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                FC fc = (FC) interfaceC5044lDC;
                List list = (List) this.c.get(i);
                if (list != null) {
                    C = new ArrayList(XE.m(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsK = C7437wc2.k(fc);
                    Intrinsics.checkNotNull(clsK);
                    C = VE.c(clsK);
                }
                arrayList2.add(C);
                i = i2;
            }
            this.d = arrayList2;
            Intrinsics.checkNotNullParameter(arrayList2, "<this>");
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C2904bF.o(arrayList3, (Iterable) it3.next());
            }
            this.e = arrayList3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
            ?? C;
            Intrinsics.checkNotNullParameter(args, "args");
            ArrayList other = this.c;
            Intrinsics.checkNotNullParameter(args, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            int length = args.length;
            ArrayList<Pair> arrayList = new ArrayList(Math.min(XE.m(other, 10), length));
            int i = 0;
            for (Object obj : other) {
                if (i >= length) {
                    break;
                }
                arrayList.add(new Pair(args[i], obj));
                i++;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : arrayList) {
                Object obj2 = pair.d;
                List list = (List) pair.e;
                if (list != null) {
                    C = new ArrayList(XE.m(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C.add(((Method) it.next()).invoke(obj2, new Object[0]));
                    }
                } else {
                    C = VE.c(obj2);
                }
                C2904bF.o(arrayList2, C);
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            this.a.invoke(null, Arrays.copyOf(array, array.length));
            return this.b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // defpackage.InterfaceC2355Wx
        @NotNull
        public final List<Type> b() {
            return this.e;
        }

        @Override // defpackage.InterfaceC2355Wx
        public final /* bridge */ /* synthetic */ Member c() {
            return null;
        }

        @Override // defpackage.InterfaceC2355Wx
        @NotNull
        public final Type n() {
            Class<?> returnType = this.b.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:176:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[LOOP:1: B:25:0x0074->B:27:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v39, types: [kotlin.ranges.IntRange, kotlin.ranges.c] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public Qc2(@NotNull InterfaceC2355Wx oldCaller, @NotNull InterfaceC2076Tj0 descriptor, boolean z) {
        Class clsB;
        Method declaredMethod;
        ?? r11;
        int i;
        a aVar;
        List listO;
        Method methodN;
        ArrayList arrayList;
        Iterator it;
        boolean z2 = true;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.a = z;
        if (oldCaller instanceof AbstractC2615Zx.g.c) {
            InterfaceC1076Go1 interfaceC1076Go1R0 = descriptor.r0();
            interfaceC1076Go1R0 = interfaceC1076Go1R0 == null ? descriptor.m0() : interfaceC1076Go1R0;
            AbstractC4649jL0 type = interfaceC1076Go1R0 != null ? interfaceC1076Go1R0.getType() : null;
            if (type != null && C7138vA0.h(type)) {
                if (z) {
                    List<Xc2> listJ = descriptor.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    if (listJ == null || !listJ.isEmpty()) {
                        Iterator it2 = listJ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((Xc2) it2.next()).z0()) {
                                    ArrayList arrayListO = N7.o(V62.a(type));
                                    Intrinsics.checkNotNull(arrayListO);
                                    arrayList = new ArrayList(XE.m(arrayListO, 10));
                                    it = arrayListO.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((AbstractC2615Zx.g.c) oldCaller).f, new Object[0]));
                                    }
                                    oldCaller = new AbstractC2615Zx.g.d((Method) ((AbstractC2615Zx.g) oldCaller).a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListO2 = N7.o(V62.a(type));
                    Intrinsics.checkNotNull(arrayListO2);
                    arrayList = new ArrayList(XE.m(arrayListO2, 10));
                    it = arrayListO2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((AbstractC2615Zx.g.c) oldCaller).f, new Object[0]));
                    }
                    oldCaller = new AbstractC2615Zx.g.d((Method) ((AbstractC2615Zx.g) oldCaller).a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.b = oldCaller;
        this.c = (M) oldCaller.c();
        AbstractC4649jL0 abstractC4649jL0N = descriptor.n();
        Intrinsics.checkNotNull(abstractC4649jL0N);
        if (descriptor.z()) {
            int i2 = C7138vA0.a;
            Intrinsics.checkNotNullParameter(abstractC4649jL0N, "<this>");
            AbstractC5706oM1 abstractC5706oM1I = C7138vA0.i(abstractC4649jL0N);
            AbstractC4649jL0 abstractC4649jL0J = abstractC5706oM1I != null ? X62.d(abstractC4649jL0N).j(abstractC5706oM1I, EnumC3610ed2.INVARIANT) : null;
            if (abstractC4649jL0J == null || !RK0.G(abstractC4649jL0J)) {
                clsB = N7.B(abstractC4649jL0N);
                if (clsB != null) {
                    try {
                        declaredMethod = clsB.getDeclaredMethod("box-impl", N7.n(clsB, descriptor).getReturnType());
                    } catch (NoSuchMethodException unused) {
                        throw new C3761fL0("No box method found in inline class: " + clsB + " (calling " + descriptor + ')');
                    }
                } else {
                    declaredMethod = null;
                }
            } else {
                declaredMethod = null;
            }
        } else {
            clsB = N7.B(abstractC4649jL0N);
            if (clsB != null) {
                declaredMethod = clsB.getDeclaredMethod("box-impl", N7.n(clsB, descriptor).getReturnType());
            } else {
                declaredMethod = null;
            }
        }
        if (C7138vA0.a(descriptor)) {
            IntRange.INSTANCE.getClass();
            aVar = new a(IntRange.j, new List[0], declaredMethod);
        } else {
            int i3 = -1;
            if (!(oldCaller instanceof AbstractC2615Zx.g.c) && !(oldCaller instanceof AbstractC2615Zx.g.d)) {
                if (descriptor instanceof InterfaceC3550eL) {
                    if (!(oldCaller instanceof InterfaceC7919yu)) {
                        i3 = 0;
                    }
                } else if (descriptor.m0() == null || (oldCaller instanceof InterfaceC7919yu)) {
                    i3 = 0;
                } else {
                    InterfaceC4675jU interfaceC4675jUE = descriptor.e();
                    Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                    if (C7138vA0.f(interfaceC4675jUE)) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                }
            }
            int i4 = oldCaller instanceof AbstractC2615Zx.g.d ? -((AbstractC2615Zx.g.d) oldCaller).f.length : i3;
            Member memberC = oldCaller.c();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC1076Go1 interfaceC1076Go1R1 = descriptor.r0();
            AbstractC4649jL0 type2 = interfaceC1076Go1R1 != null ? interfaceC1076Go1R1.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (descriptor instanceof InterfaceC3550eL) {
                FC fcH = ((InterfaceC3550eL) descriptor).H();
                Intrinsics.checkNotNullExpressionValue(fcH, "getConstructedClass(...)");
                if (fcH.R()) {
                    InterfaceC4675jU interfaceC4675jUE2 = fcH.e();
                    Intrinsics.c(interfaceC4675jUE2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((FC) interfaceC4675jUE2).y());
                }
            } else {
                InterfaceC4675jU interfaceC4675jUE3 = descriptor.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE3, "getContainingDeclaration(...)");
                if (interfaceC4675jUE3 instanceof FC) {
                    FC makeKotlinParameterTypes = (FC) interfaceC4675jUE3;
                    Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
                    if (C7138vA0.f(makeKotlinParameterTypes)) {
                        if (memberC == null) {
                            r11 = false;
                        } else {
                            Class<?> declaringClass = memberC.getDeclaringClass();
                            if (declaringClass == null ? false : !C7279vr.j(declaringClass).s()) {
                                r11 = true;
                            } else {
                                r11 = false;
                            }
                        }
                        if (r11 == true) {
                            AbstractC5706oM1 abstractC5706oM1Y = makeKotlinParameterTypes.y();
                            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
                            arrayList2.add(C0564Aa.s(abstractC5706oM1Y));
                        } else {
                            arrayList2.add(makeKotlinParameterTypes.y());
                        }
                    }
                }
            }
            List<Xc2> listJ2 = descriptor.j();
            Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
            Iterator it3 = listJ2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Xc2) it3.next()).getType());
            }
            if (this.a) {
                Iterator it4 = arrayList2.iterator();
                int size = 0;
                while (it4.hasNext()) {
                    ArrayList arrayListO3 = N7.o(V62.a((AbstractC4649jL0) it4.next()));
                    size += arrayListO3 != null ? arrayListO3.size() : 1;
                }
                i = ((size + 31) / 32) + 1;
            } else {
                i = 0;
            }
            int i5 = (descriptor.z() ? 1 : 0) + i;
            Iterator it5 = arrayList2.iterator();
            int size2 = 0;
            while (it5.hasNext()) {
                ArrayList arrayListO4 = N7.o(V62.a((AbstractC4649jL0) it5.next()));
                size2 += arrayListO4 != null ? arrayListO4.size() : 1;
            }
            int i6 = size2 + i4 + i5;
            boolean z3 = this.a;
            if (N7.g(this) != i6) {
                throw new C3761fL0("Inconsistent number of parameters in the descriptor and Java reflection object: " + N7.g(this) + " != " + i6 + "\nCalling: " + descriptor + "\nParameter types: " + this.b.b() + ")\nDefault: " + z3);
            }
            IntRange intRangeI = f.i(Math.max(i3, 0), arrayList2.size() + i3);
            List[] listArr = new List[i6];
            int i7 = 0;
            while (i7 < i6) {
                if ((i7 <= intRangeI.e && intRangeI.d <= i7) == true) {
                    AbstractC5706oM1 abstractC5706oM1A = V62.a((AbstractC4649jL0) arrayList2.get(i7 - i3));
                    listO = N7.o(abstractC5706oM1A);
                    if (listO == null) {
                        Class clsB2 = N7.B(abstractC5706oM1A);
                        if (clsB2 == null || (methodN = N7.n(clsB2, descriptor)) == null) {
                            listO = null;
                        } else {
                            listO = VE.c(methodN);
                        }
                    }
                } else {
                    listO = null;
                }
                listArr[i7] = listO;
                i7++;
            }
            aVar = new a(intRangeI, listArr, declaredMethod);
        }
        this.d = aVar;
        CQ0 cq0B = VE.b();
        InterfaceC2355Wx<M> interfaceC2355Wx = this.b;
        int length = interfaceC2355Wx instanceof AbstractC2615Zx.g.d ? ((AbstractC2615Zx.g.d) interfaceC2355Wx).f.length : interfaceC2355Wx instanceof AbstractC2615Zx.g.c ? 1 : 0;
        if (length > 0) {
            cq0B.add(f.i(0, length));
        }
        List<Method>[] listArr2 = aVar.b;
        int length2 = listArr2.length;
        int i8 = 0;
        while (i8 < length2) {
            List<Method> list = listArr2[i8];
            int size3 = (list != null ? list.size() : 1) + length;
            cq0B.add(f.i(length, size3));
            i8++;
            length = size3;
        }
        this.e = (IntRange[]) VE.a(cq0B).toArray(new IntRange[0]);
        ?? r12 = this.d.a;
        if ((r12 instanceof Collection) && ((Collection) r12).isEmpty()) {
            z2 = false;
        } else {
            Iterator<Integer> it6 = r12.iterator();
            while (((DB0) it6).g) {
                List<Method> list2 = this.d.b[((CB0) it6).b()];
                if ((list2 != null && list2.size() > 1) != false) {
                }
            }
            z2 = false;
        }
        this.f = z2;
    }

    @Override // defpackage.InterfaceC2355Wx
    @Nullable
    public final Object a(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
        Method method;
        Object objInvoke;
        Object objE;
        Object objE2;
        Intrinsics.checkNotNullParameter(args, "args");
        a aVar = this.d;
        IntRange intRange = aVar.a;
        List<Method>[] listArr = aVar.b;
        if (!intRange.isEmpty()) {
            boolean z = this.f;
            int i = intRange.e;
            int i2 = intRange.d;
            if (z) {
                CQ0 cq0 = new CQ0(args.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    cq0.add(args[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = args[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, new Object[0]);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objE2 = C7437wc2.e(returnType);
                                }
                                cq0.add(objE2);
                            }
                        } else {
                            cq0.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                Intrinsics.checkNotNullParameter(args, "<this>");
                int length = args.length - 1;
                if (i4 <= length) {
                    while (true) {
                        cq0.add(args[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                args = VE.a(cq0).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objE = args[i5];
                    } else {
                        List<Method> list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) CollectionsKt.U(list2) : null;
                        objE = args[i5];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, new Object[0]);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objE = C7437wc2.e(returnType2);
                            }
                        }
                    }
                    objArr[i5] = objE;
                }
                args = objArr;
            }
        }
        Object objA = this.b.a(args);
        return (objA == MN.d || (method = aVar.c) == null || (objInvoke = method.invoke(null, objA)) == null) ? objA : objInvoke;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final List<Type> b() {
        return this.b.b();
    }

    @Override // defpackage.InterfaceC2355Wx
    public final M c() {
        return this.c;
    }

    @NotNull
    public final IntRange d(int i) {
        IntRange[] intRangeArr = this.e;
        if (i >= 0 && i < intRangeArr.length) {
            return intRangeArr[i];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(i, i, 1);
        }
        int length = ((IntRange) C1526Mj.y(intRangeArr)).e + 1 + (i - intRangeArr.length);
        return new IntRange(length, length, 1);
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final Type n() {
        return this.b.n();
    }
}
