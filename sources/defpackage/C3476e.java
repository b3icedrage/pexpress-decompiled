package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3476e implements J71, InterfaceC5931pR1 {

    @NotNull
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NotNull
    public static final C3476e e = new C3476e();

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static void b(HS0 hs0, Object obj, ReflectiveOperationException reflectiveOperationException) {
        C4538ir c4538ir = hs0.g;
        if (c4538ir == null) {
            return;
        }
        c4538ir.a(new N70("Failed to instantiate ch.qos.logback.classic.gaffer.GafferConfigurator", reflectiveOperationException, 2, obj));
    }

    public static final C2065Tf1 d(AbstractC5706oM1 abstractC5706oM1, InterfaceC5257mD interfaceC5257mD, int i) {
        if (interfaceC5257mD == null || R70.f(interfaceC5257mD)) {
            return null;
        }
        int size = interfaceC5257mD.A().size() + i;
        if (interfaceC5257mD.R()) {
            List<N62> listSubList = abstractC5706oM1.T0().subList(i, size);
            InterfaceC4675jU interfaceC4675jUE = interfaceC5257mD.e();
            return new C2065Tf1(interfaceC5257mD, listSubList, d(abstractC5706oM1, interfaceC4675jUE instanceof InterfaceC5257mD ? (InterfaceC5257mD) interfaceC4675jUE : null, size));
        }
        if (size != abstractC5706oM1.T0().size()) {
            C4432iZ.o(interfaceC5257mD);
        }
        return new C2065Tf1(interfaceC5257mD, abstractC5706oM1.T0().subList(i, abstractC5706oM1.T0().size()), null);
    }

    @NotNull
    public static final List f(@NotNull InterfaceC5257mD interfaceC5257mD) {
        List<H62> listB;
        Object next;
        InterfaceC6494s62 interfaceC6494s62P;
        Intrinsics.checkNotNullParameter(interfaceC5257mD, "<this>");
        List<H62> listA = interfaceC5257mD.A();
        Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
        if (!interfaceC5257mD.R() && !(interfaceC5257mD.e() instanceof InterfaceC1335Jx)) {
            return listA;
        }
        int i = C4900kZ.a;
        Intrinsics.checkNotNullParameter(interfaceC5257mD, "<this>");
        Intrinsics.checkNotNullParameter(interfaceC5257mD, "<this>");
        C4690jZ c4690jZ = C4690jZ.e;
        Sequence sequenceG = JH1.g(FH1.e(interfaceC5257mD, c4690jZ), 1);
        C2515Yp1 predicate = C2515Yp1.g;
        Intrinsics.checkNotNullParameter(sequenceG, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List listP = JH1.p(JH1.k(JH1.h(new C5319mX1(sequenceG), C3846fk0.h), CH.h));
        Intrinsics.checkNotNullParameter(interfaceC5257mD, "<this>");
        Intrinsics.checkNotNullParameter(interfaceC5257mD, "<this>");
        Iterator it = JH1.g(FH1.e(interfaceC5257mD, c4690jZ), 1).iterator();
        do {
            listB = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof FC));
        FC fc = (FC) next;
        if (fc != null && (interfaceC6494s62P = fc.p()) != null) {
            listB = interfaceC6494s62P.b();
        }
        if (listB == null) {
            listB = C5653o60.d;
        }
        if (listP.isEmpty() && listB.isEmpty()) {
            List<H62> listA2 = interfaceC5257mD.A();
            Intrinsics.checkNotNullExpressionValue(listA2, "getDeclaredTypeParameters(...)");
            return listA2;
        }
        ArrayList<H62> arrayListQ = CollectionsKt.Q(listP, listB);
        ArrayList arrayList = new ArrayList(XE.m(arrayListQ, 10));
        for (H62 h62 : arrayListQ) {
            Intrinsics.checkNotNull(h62);
            arrayList.add(new C3264cz(h62, interfaceC5257mD, listA.size()));
        }
        return CollectionsKt.Q(listA, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    @Nullable
    public static final RJ0 g(@NotNull RI0 ri0, @NotNull RJ0... args) {
        Object obj;
        RJ0 rj0;
        Class<?> cls;
        boolean z;
        Object obj2;
        C8078zf1 c8078zf1;
        Object obj3;
        RJ0 rj1;
        Field field;
        C8078zf1 c8078zf2;
        RJ0 rj0K;
        C8078zf1 c8078zf3;
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Class clsG = C7279vr.g(ri0);
        RJ0[] args2 = (RJ0[]) Arrays.copyOf(args, args.length);
        Intrinsics.checkNotNullParameter(clsG, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        if (clsG.isEnum() && clsG.getAnnotation(XH1.class) == null && clsG.getAnnotation(InterfaceC7237vf1.class) == null) {
            Object[] enumConstants = clsG.getEnumConstants();
            String canonicalName = clsG.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
            Intrinsics.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C6077q70((Enum[]) enumConstants, canonicalName);
        }
        if (clsG.isInterface()) {
            XH1 xh1 = (XH1) clsG.getAnnotation(XH1.class);
            if (xh1 != null) {
                Class<? extends RJ0<?>> clsWith = xh1.with();
                C2251Vp1 c2251Vp1 = C2017Sp1.a;
                if (c2251Vp1.b(clsWith).equals(c2251Vp1.b(C8078zf1.class))) {
                    c8078zf3 = new C8078zf1(C7279vr.j(clsG));
                } else {
                    c8078zf3 = null;
                }
            } else {
                c8078zf3 = new C8078zf1(C7279vr.j(clsG));
            }
            if (c8078zf3 != null) {
                return c8078zf3;
            }
        }
        RJ0[] rj0Arr = (RJ0[]) Arrays.copyOf(args2, args2.length);
        try {
            Field declaredField = clsG.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        RJ0 rj0K2 = obj == null ? null : k(obj, (RJ0[]) Arrays.copyOf(rj0Arr, rj0Arr.length));
        if (rj0K2 != null) {
            return rj0K2;
        }
        String canonicalName2 = clsG.getCanonicalName();
        int i = 0;
        if (canonicalName2 == null || d.o(canonicalName2, "java.", false) || d.o(canonicalName2, "kotlin.", false)) {
            rj0 = null;
        } else {
            Field[] declaredFields = clsG.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field2 = null;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 >= length) {
                    if (!z2) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i2];
                if (Intrinsics.a(field3.getName(), "INSTANCE") && Intrinsics.a(field3.getType(), clsG) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z2) {
                        z2 = true;
                        field2 = field3;
                    }
                }
                i2++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                rj0 = null;
            } else {
                Object obj4 = field2.get(null);
                Method[] methods = clsG.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z3 = false;
                while (true) {
                    if (i3 >= length2) {
                        if (!z3) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i3];
                    if (Intrinsics.a(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.a(method2.getReturnType(), RJ0.class)) {
                            if (!z3) {
                                method = method2;
                                z3 = true;
                            }
                        }
                    }
                    i3++;
                    method = null;
                    break;
                }
                if (method == null) {
                    rj0 = null;
                } else {
                    Object objInvoke = method.invoke(obj4, new Object[0]);
                    if (objInvoke instanceof RJ0) {
                        rj0 = (RJ0) objInvoke;
                    } else {
                        rj0 = null;
                    }
                }
            }
        }
        if (rj0 != null) {
            return rj0;
        }
        RJ0[] rj0Arr2 = (RJ0[]) Arrays.copyOf(args2, args2.length);
        Class<?>[] declaredClasses = clsG.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i4];
            if (cls.getAnnotation(InterfaceC6687t21.class) != null) {
                break;
            }
            i4++;
        }
        if (cls == null) {
            z = true;
            obj2 = null;
        } else {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            try {
                Field declaredField2 = clsG.getDeclaredField(simpleName);
                z = true;
                try {
                    declaredField2.setAccessible(true);
                    obj2 = declaredField2.get(null);
                } catch (Throwable unused2) {
                    obj2 = null;
                }
            } catch (Throwable unused3) {
                z = true;
            }
        }
        if (obj2 == null || (rj0K = k(obj2, (RJ0[]) Arrays.copyOf(rj0Arr2, rj0Arr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsG.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                boolean z4 = false;
                Class<?> cls2 = null;
                while (true) {
                    if (i < length4) {
                        Class<?> cls3 = declaredClasses2[i];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z4) {
                                z4 = z;
                                cls2 = cls3;
                            }
                        }
                        i++;
                    } else if (!z4) {
                    }
                    cls2 = null;
                    break;
                }
                if (cls2 == null || (field = cls2.getField("INSTANCE")) == null) {
                    c8078zf1 = null;
                    obj3 = null;
                } else {
                    c8078zf1 = null;
                    try {
                        obj3 = field.get(null);
                    } catch (NoSuchFieldException unused4) {
                    }
                }
                rj1 = obj3 instanceof RJ0 ? (RJ0) obj3 : c8078zf1;
            } catch (NoSuchFieldException unused5) {
                c8078zf1 = null;
            }
        } else {
            rj1 = rj0K;
            c8078zf1 = null;
        }
        if (rj1 != null) {
            return rj1;
        }
        if (clsG.getAnnotation(InterfaceC7237vf1.class) == null) {
            XH1 xh2 = (XH1) clsG.getAnnotation(XH1.class);
            if (xh2 != null) {
                Class<? extends RJ0<?>> clsWith2 = xh2.with();
                C2251Vp1 c2251Vp2 = C2017Sp1.a;
                if (c2251Vp2.b(clsWith2).equals(c2251Vp2.b(C8078zf1.class))) {
                    c8078zf2 = new C8078zf1(C7279vr.j(clsG));
                }
            }
            c8078zf2 = c8078zf1;
        } else {
            c8078zf2 = new C8078zf1(C7279vr.j(clsG));
        }
        return c8078zf2;
    }

    public static View h(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    @Nullable
    public static final Object i(@NotNull Gson gson, @NotNull String json, @NotNull Class classOfT) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        if (StringsKt.I(json) || json.equals("null")) {
            return null;
        }
        try {
            return gson.d(classOfT, json);
        } catch (HH0 e2) {
            C2144Ug c2144Ug = U0.n;
            if (c2144Ug == null) {
                return null;
            }
            c2144Ug.k(classOfT.getSimpleName(), Integer.valueOf(json.length()), e2);
            return null;
        }
    }

    @NotNull
    public static final C6251qy j(@NotNull JM jm) {
        C6251qy c6251qy;
        C6251qy c6251qy2;
        if (!(jm instanceof C5004l20)) {
            return new C6251qy(1, jm);
        }
        C5004l20 c5004l20 = (C5004l20) jm;
        c5004l20.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5004l20.l;
            Object obj = atomicReferenceFieldUpdater.get(c5004l20);
            GW1 gw1 = UE.d;
            c6251qy = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c5004l20, gw1);
                c6251qy2 = null;
                break;
            }
            if (obj instanceof C6251qy) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c5004l20, obj, gw1)) {
                        c6251qy2 = (C6251qy) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c5004l20) == obj);
            } else if (obj != gw1 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c6251qy2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C6251qy.k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c6251qy2);
            if (!(obj2 instanceof MG) || ((MG) obj2).d == null) {
                C6251qy.j.set(c6251qy2, 536870911);
                atomicReferenceFieldUpdater2.set(c6251qy2, Q6.d);
                c6251qy = c6251qy2;
            } else {
                c6251qy2.n();
            }
            if (c6251qy != null) {
                return c6251qy;
            }
        }
        return new C6251qy(2, jm);
    }

    public static final RJ0 k(Object obj, RJ0... rj0Arr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (rj0Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = rj0Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = RJ0.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(rj0Arr, rj0Arr.length));
            if (objInvoke instanceof RJ0) {
                return (RJ0) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    @NotNull
    public static final InterfaceC6245qw l(@NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull CoroutineContext context, @Nullable Long l, @NotNull InterfaceC1060Gj0 listener) {
        Intrinsics.checkNotNullParameter(interfaceC0942Ew, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return SN.a(C6215qm0.d, context, true, new C0630Aw(l, interfaceC0942Ew, listener, null)).e;
    }

    public static C1895Rb m(TH0 th0, C3788fU0 c3788fU0) {
        return new C1895Rb(AK0.a(th0, c3788fU0, 1.0f, C3742fF.d, false), 0);
    }

    public static C1973Sb n(AbstractC7580xH0 abstractC7580xH0, C3788fU0 c3788fU0, boolean z) {
        return new C1973Sb(AK0.a(abstractC7580xH0, c3788fU0, z ? C7857yc2.c() : 1.0f, C1952Ru.d, false), 0);
    }

    public static C2051Tb o(TH0 th0, C3788fU0 c3788fU0, int i) {
        C1303Jm0 c1303Jm0 = new C1303Jm0();
        c1303Jm0.d = i;
        ArrayList arrayListA = AK0.a(th0, c3788fU0, 1.0f, c1303Jm0, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            C7589xK0 c7589xK0 = (C7589xK0) arrayListA.get(i2);
            C1147Hm0 c1147Hm0 = (C1147Hm0) c7589xK0.b;
            C1147Hm0 c1147Hm1 = (C1147Hm0) c7589xK0.c;
            if (c1147Hm0 != null && c1147Hm1 != null) {
                float[] fArr = c1147Hm0.a;
                int length = fArr.length;
                float[] fArr2 = c1147Hm1.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    c7589xK0 = new C7589xK0(c1147Hm0.a(fArrCopyOfRange), c1147Hm1.a(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, c7589xK0);
        }
        return new C2051Tb(arrayListA, 0);
    }

    public static C2129Ub p(TH0 th0, C3788fU0 c3788fU0) {
        return new C2129Ub(AK0.a(th0, c3788fU0, 1.0f, C5208m0.g, false), 0);
    }

    public static C2393Xb q(TH0 th0, C3788fU0 c3788fU0) {
        return new C2393Xb(AK0.a(th0, c3788fU0, C7857yc2.c(), C6397rf1.d, true), 0);
    }

    public static final boolean r(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.a(method, "GET") || Intrinsics.a(method, "HEAD")) ? false : true;
    }

    public static void s(HS0 hs0, Object obj, URL url) {
        C5154lk0 c5154lk0;
        try {
            c5154lk0 = (C5154lk0) Class.forName("lk0").getConstructor(HS0.class).newInstance(hs0);
        } catch (ClassNotFoundException e2) {
            b(hs0, obj, e2);
            c5154lk0 = null;
        } catch (IllegalAccessException e3) {
            b(hs0, obj, e3);
            c5154lk0 = null;
        } catch (InstantiationException e4) {
            b(hs0, obj, e4);
            c5154lk0 = null;
        } catch (NoSuchMethodException e5) {
            b(hs0, obj, e5);
            c5154lk0 = null;
        } catch (InvocationTargetException e6) {
            b(hs0, obj, e6);
            c5154lk0 = null;
        }
        if (c5154lk0 != null) {
            c5154lk0.e(url);
        }
    }

    public static String t(double d2) {
        return "Percents(value=" + d2 + ")";
    }

    @Override // defpackage.InterfaceC5931pR1
    public void c(AbstractC5422n1 newCalculator) {
        Intrinsics.checkNotNullParameter(newCalculator, "newCalculator");
        Intrinsics.checkNotNullParameter("Empty strategy!", "message");
        throw new H51("Empty strategy!");
    }

    @Override // defpackage.J71
    public Object e() {
        return new TreeMap();
    }
}
