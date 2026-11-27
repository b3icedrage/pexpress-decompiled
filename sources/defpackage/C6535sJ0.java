package defpackage;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6535sJ0 extends PI0<Object> implements InterfaceC1764Pj0<Object>, InterfaceC6325rJ0<Object>, Function0, Function1, InterfaceC6622sj0, InterfaceC6832tj0, InterfaceC7042uj0, InterfaceC7252vj0, InterfaceC7463wj0, InterfaceC7673xj0, InterfaceC7883yj0, InterfaceC8093zj0, InterfaceC0592Aj0, InterfaceC0670Bj0, Function2, InterfaceC0826Dj0, InterfaceC0904Ej0, InterfaceC0982Fj0, InterfaceC1060Gj0, InterfaceC1138Hj0, InterfaceC1216Ij0, InterfaceC1294Jj0, InterfaceC1372Kj0, InterfaceC1450Lj0, InterfaceC1527Mj0 {
    public static final /* synthetic */ IJ0<Object>[] o;

    @NotNull
    public final AbstractC5906pJ0 i;

    @NotNull
    public final String j;

    @Nullable
    public final Object k;

    @NotNull
    public final C1939Rp1.a l;

    @NotNull
    public final Object m;

    @NotNull
    public final Object n;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        o = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C6535sJ0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public C6535sJ0(AbstractC5906pJ0 abstractC5906pJ0, String str, String str2, InterfaceC2076Tj0 interfaceC2076Tj0, Object obj) {
        this.i = abstractC5906pJ0;
        this.j = str2;
        this.k = obj;
        this.l = C1939Rp1.a(interfaceC2076Tj0, new C7804yM(1, this, str));
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        int i = 2;
        this.m = XO0.a(enumC4403iP0, new C1194Ic(this, i));
        this.n = XO0.a(enumC4403iP0, new C5612nv(this, i));
    }

    @Override // defpackage.InterfaceC1216Ij0
    @Nullable
    public final Object c(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Serializable serializable) {
        return a(obj, obj2, obj3, obj4, serializable);
    }

    public final boolean equals(@Nullable Object obj) {
        C6535sJ0 c6535sJ0B = C7437wc2.b(obj);
        return c6535sJ0B != null && Intrinsics.a(this.i, c6535sJ0B.i) && Intrinsics.a(getName(), c6535sJ0B.getName()) && Intrinsics.a(this.j, c6535sJ0B.j) && Intrinsics.a(this.k, c6535sJ0B.k);
    }

    @Override // defpackage.InterfaceC1764Pj0
    public final int getArity() {
        return N7.g(i());
    }

    @Override // defpackage.JI0
    @NotNull
    public final String getName() {
        String strE = o().getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        return strE;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((getName().hashCode() + (this.i.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.PI0
    @NotNull
    public final InterfaceC2355Wx<?> i() {
        return (InterfaceC2355Wx) this.m.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        return a(new Object[0]);
    }

    @Override // defpackage.PI0
    @NotNull
    public final AbstractC5906pJ0 j() {
        return this.i;
    }

    @Override // defpackage.InterfaceC1060Gj0
    @Nullable
    public final Object k(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return a(obj, obj2, obj3);
    }

    @Override // defpackage.InterfaceC1138Hj0
    @Nullable
    public final Object l(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4) {
        return a(obj, obj2, obj3, obj4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.PI0
    @Nullable
    public final InterfaceC2355Wx<?> m() {
        return (InterfaceC2355Wx) this.n.getValue();
    }

    @Override // defpackage.InterfaceC1294Jj0
    @Nullable
    public final Object q(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Serializable serializable) {
        return a(obj, obj2, obj3, obj4, obj5, serializable);
    }

    @Override // defpackage.PI0
    public final boolean t() {
        return this.k != AbstractC1568Mx.a.d;
    }

    @NotNull
    public final String toString() {
        C2964bZ c2964bZ = C2593Zp1.a;
        return C2593Zp1.b(o());
    }

    public final AbstractC2615Zx<Constructor<?>> u(Constructor<?> constructor, InterfaceC2076Tj0 descriptor, boolean z) {
        Object obj = this.k;
        Class<?> cls = null;
        if (!z) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            InterfaceC7984zC interfaceC7984zC = descriptor instanceof InterfaceC7984zC ? (InterfaceC7984zC) descriptor : null;
            if (interfaceC7984zC != null && !C5323mZ.e(interfaceC7984zC.d())) {
                FC fcH = interfaceC7984zC.H();
                Intrinsics.checkNotNullExpressionValue(fcH, "getConstructedClass(...)");
                if (!C7138vA0.f(fcH) && !C4432iZ.q(interfaceC7984zC.H())) {
                    List<Xc2> listJ = interfaceC7984zC.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    if (listJ == null || !listJ.isEmpty()) {
                        Iterator<T> it = listJ.iterator();
                        while (it.hasNext()) {
                            AbstractC4649jL0 type = ((Xc2) it.next()).getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            if (U0.l(type)) {
                                if (t()) {
                                    return new AbstractC2615Zx.a(constructor, N7.b(obj, o()));
                                }
                                Intrinsics.checkNotNullParameter(constructor, "constructor");
                                Class<?> declaringClass = constructor.getDeclaringClass();
                                Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                                return new AbstractC2615Zx.b(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C1371Kj.e(genericParameterTypes, 0, genericParameterTypes.length - 1)));
                            }
                        }
                    }
                }
            }
        }
        if (t()) {
            return new AbstractC2615Zx.c(constructor, N7.b(obj, o()));
        }
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Class<?> declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
        Class<?> declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new AbstractC2615Zx.d(constructor, declaringClass2, cls, genericParameterTypes2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public final AbstractC2615Zx.g v(Method method) {
        AbstractC4649jL0 type;
        if (!t()) {
            return new AbstractC2615Zx.g.C0212g(method);
        }
        InterfaceC1076Go1 interfaceC1076Go1M0 = o().m0();
        Object objB = this.k;
        if (interfaceC1076Go1M0 == null || (type = interfaceC1076Go1M0.getType()) == null || !C7138vA0.c(type)) {
            objB = N7.b(objB, o());
        } else {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) C1526Mj.r(parameterTypes);
            if (cls == null || !cls.isInterface()) {
                objB = N7.b(objB, o());
            }
        }
        return new AbstractC2615Zx.g.c(method, objB);
    }

    @Override // defpackage.PI0
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2076Tj0 o() {
        IJ0<Object> ij0 = o[0];
        Object objInvoke = this.l.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (InterfaceC2076Tj0) objInvoke;
    }

    @Override // defpackage.JI0
    public final boolean z() {
        return o().z();
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Object obj) {
        return a(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@Nullable Object obj, @Nullable Object obj2) {
        return a(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6535sJ0(@NotNull AbstractC5906pJ0 container, @NotNull InterfaceC2076Tj0 descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strE = descriptor.getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        this(container, strE, DB1.c(descriptor).a(), descriptor, AbstractC1568Mx.a.d);
    }
}
