package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1116Hc implements InterfaceC2355Wx {

    @NotNull
    public final Class<?> a;

    @NotNull
    public final ArrayList b;

    @NotNull
    public final a c;

    @NotNull
    public final List<Method> d;

    @NotNull
    public final ArrayList e;

    @NotNull
    public final ArrayList f;

    @NotNull
    public final ArrayList g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Hc$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("CALL_BY_NAME", 0);
            d = aVar;
            a aVar2 = new a("POSITIONAL_CALL", 1);
            e = aVar2;
            a[] aVarArr = {aVar, aVar2};
            g = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Hc$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("JAVA", 0);
            d = bVar;
            b bVar2 = new b("KOTLIN", 1);
            e = bVar2;
            b[] bVarArr = {bVar, bVar2};
            g = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    public C1116Hc(@NotNull Class jClass, @NotNull ArrayList parameterNames, @NotNull a callMode, @NotNull b origin, @NotNull List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.a = jClass;
        this.b = parameterNames;
        this.c = callMode;
        this.d = methods;
        ArrayList arrayList = new ArrayList(XE.m(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList;
        List<Method> list = this.d;
        ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.checkNotNull(returnType);
            List<RI0<? extends Object>> list2 = C4753jp1.a;
            Intrinsics.checkNotNullParameter(returnType, "<this>");
            Class<? extends Object> cls = C4753jp1.c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList2.add(returnType);
        }
        this.f = arrayList2;
        List<Method> list3 = this.d;
        ArrayList arrayList3 = new ArrayList(XE.m(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList3;
        if (this.c == a.e && origin == b.d) {
            ArrayList arrayList4 = this.b;
            Intrinsics.checkNotNullParameter(arrayList4, "<this>");
            ArrayList arrayList5 = new ArrayList(XE.m(arrayList4, 10));
            boolean z = false;
            for (Object obj : arrayList4) {
                boolean z2 = true;
                if (!z && Intrinsics.a(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList5.add(obj);
                }
            }
            if (!arrayList5.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[LOOP:1: B:24:0x0065->B:25:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0056, please report this as an issue */
    @Override // defpackage.InterfaceC2355Wx
    @Nullable
    public final Object a(@NotNull Object[] args) {
        Class cls;
        Object[] objArr;
        ArrayList arrayList;
        int i;
        String strD;
        Intrinsics.checkNotNullParameter(args, "args");
        InterfaceC2355Wx.a.a(this, args);
        ArrayList arrayList2 = new ArrayList(args.length);
        int length = args.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList3 = this.b;
            if (i2 >= length) {
                return C1505Mc.a(this.a, PW0.j(CollectionsKt.j0(arrayList3, arrayList2)), this.d);
            }
            Object array = args[i2];
            int i4 = i3 + 1;
            ArrayList arrayList4 = this.f;
            if (array != null) {
                cls = (Class) arrayList4.get(i3);
                if (array instanceof Class) {
                    if (array instanceof RI0) {
                        array = C7279vr.g((RI0) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (!(objArr instanceof Class[])) {
                            array = null;
                        } else if (objArr instanceof RI0[]) {
                            Intrinsics.c(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            RI0[] ri0Arr = (RI0[]) array;
                            arrayList = new ArrayList(ri0Arr.length);
                            while (i < r14) {
                                arrayList.add(C7279vr.g(ri0));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                } else {
                    array = null;
                }
            } else if (this.c == a.d) {
                array = this.g.get(i3);
            } else {
                cls = (Class) arrayList4.get(i3);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof RI0) {
                        array = C7279vr.g((RI0) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (!(objArr instanceof Class[])) {
                            array = null;
                        } else if (objArr instanceof RI0[]) {
                            Intrinsics.c(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            RI0[] ri0Arr2 = (RI0[]) array;
                            arrayList = new ArrayList(ri0Arr2.length);
                            for (RI0 ri0 : ri0Arr2) {
                                arrayList.add(C7279vr.g(ri0));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList3.get(i3);
                Class cls2 = (Class) arrayList4.get(i3);
                RI0 ri0B = Intrinsics.a(cls2, Class.class) ? C2017Sp1.a.b(RI0.class) : (cls2.isArray() && Intrinsics.a(cls2.getComponentType(), Class.class)) ? C2017Sp1.a.b(RI0[].class) : C7279vr.j(cls2);
                if (Intrinsics.a(ri0B.d(), C2017Sp1.a.b(Object[].class).d())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ri0B.d());
                    sb.append('<');
                    Class<?> componentType = C7279vr.g(ri0B).getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    sb.append(C7279vr.j(componentType).d());
                    sb.append('>');
                    strD = sb.toString();
                } else {
                    strD = ri0B.d();
                }
                throw new IllegalArgumentException("Argument #" + i3 + ' ' + str + " is not of the required type " + strD);
            }
            arrayList2.add(array);
            i2++;
            i3 = i4;
        }
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
        return this.a;
    }

    public /* synthetic */ C1116Hc(Class cls, ArrayList arrayList, a aVar) {
        b bVar = b.e;
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, aVar, bVar, arrayList2);
    }
}
