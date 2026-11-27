package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2615Zx<M extends Member> implements InterfaceC2355Wx<M> {

    @NotNull
    public final M a;

    @NotNull
    public final Type b;

    @Nullable
    public final Class<?> c;

    @NotNull
    public final List<Type> d;

    /* JADX INFO: renamed from: Zx$a */
    public static final class a extends AbstractC2615Zx<Constructor<?>> implements InterfaceC7919yu {

        @Nullable
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@NotNull Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : C1371Kj.e(genericParameterTypes, 1, genericParameterTypes.length - 1)));
            this.e = obj;
        }

        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            Constructor constructor = (Constructor) this.a;
            C4952km0 c4952km0 = new C4952km0(3);
            c4952km0.a(this.e);
            c4952km0.b(args);
            c4952km0.a(null);
            ArrayList arrayList = (ArrayList) c4952km0.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: Zx$b */
    public static final class b extends AbstractC2615Zx<Constructor<?>> {
        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            Constructor constructor = (Constructor) this.a;
            C4952km0 c4952km0 = new C4952km0(2);
            c4952km0.b(args);
            c4952km0.a(null);
            ArrayList arrayList = (ArrayList) c4952km0.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: Zx$c */
    public static final class c extends AbstractC2615Zx<Constructor<?>> implements InterfaceC7919yu {

        @Nullable
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes);
            this.e = obj;
        }

        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            Constructor constructor = (Constructor) this.a;
            C4952km0 c4952km0 = new C4952km0(2);
            c4952km0.a(this.e);
            c4952km0.b(args);
            ArrayList arrayList = (ArrayList) c4952km0.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: Zx$d */
    public static final class d extends AbstractC2615Zx<Constructor<?>> {
        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            return ((Constructor) this.a).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: renamed from: Zx$e */
    public static abstract class e extends AbstractC2615Zx<Field> {

        /* JADX INFO: renamed from: Zx$e$a */
        public static final class a extends e implements InterfaceC7919yu {

            @Nullable
            public final Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Field field, @Nullable Object obj) {
                super(field, false);
                Intrinsics.checkNotNullParameter(field, "field");
                this.e = obj;
            }

            @Override // defpackage.AbstractC2615Zx.e, defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                return ((Field) this.a).get(this.e);
            }
        }

        /* JADX INFO: renamed from: Zx$e$b */
        public static final class b extends e implements InterfaceC7919yu {
        }

        /* JADX INFO: renamed from: Zx$e$c */
        public static final class c extends e {
        }

        /* JADX INFO: renamed from: Zx$e$d */
        public static final class d extends e {
            @Override // defpackage.AbstractC2615Zx
            public final void d(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                e(C1526Mj.r(args));
            }
        }

        /* JADX INFO: renamed from: Zx$e$e, reason: collision with other inner class name */
        public static final class C0211e extends e {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(Field field, boolean z) {
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            return ((Field) this.a).get(this.c != null ? C1526Mj.q(args) : null);
        }
    }

    /* JADX INFO: renamed from: Zx$f */
    public static abstract class f extends AbstractC2615Zx<Field> {
        public final boolean e;

        /* JADX INFO: renamed from: Zx$f$a */
        public static final class a extends f implements InterfaceC7919yu {

            @Nullable
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Field field, boolean z, @Nullable Object obj) {
                super(field, z, false);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f = obj;
            }

            @Override // defpackage.AbstractC2615Zx.f, defpackage.InterfaceC2355Wx
            @NotNull
            public final Object a(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                ((Field) this.a).set(this.f, C1526Mj.q(args));
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: Zx$f$b */
        public static final class b extends f implements InterfaceC7919yu {
            @Override // defpackage.AbstractC2615Zx.f, defpackage.InterfaceC2355Wx
            @NotNull
            public final Object a(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                ((Field) this.a).set(null, C1526Mj.y(args));
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: Zx$f$c */
        public static final class c extends f {
        }

        /* JADX INFO: renamed from: Zx$f$d */
        public static final class d extends f {
            @Override // defpackage.AbstractC2615Zx.f, defpackage.AbstractC2615Zx
            public final void d(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.d(args);
                e(C1526Mj.r(args));
            }
        }

        /* JADX INFO: renamed from: Zx$f$e */
        public static final class e extends f {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Field field, boolean z, boolean z2) {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            super(field, TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
            this.e = z;
        }

        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public Object a(@NotNull Object[] args) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            ((Field) this.a).set(this.c != null ? C1526Mj.q(args) : null, C1526Mj.y(args));
            return Unit.a;
        }

        @Override // defpackage.AbstractC2615Zx
        public void d(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            if (this.e && C1526Mj.y(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2615Zx(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> listF;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            C4952km0 c4952km0 = new C4952km0(2);
            c4952km0.a(cls);
            c4952km0.b(typeArr);
            ArrayList arrayList = (ArrayList) c4952km0.a;
            listF = WE.f(arrayList.toArray(new Type[arrayList.size()]));
            listF = listF == null ? C1526Mj.F(typeArr) : listF;
        }
        this.d = listF;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final List<Type> b() {
        return this.d;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final M c() {
        return this.a;
    }

    public void d(@NotNull Object[] objArr) {
        InterfaceC2355Wx.a.a(this, objArr);
    }

    public final void e(@Nullable Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final Type n() {
        return this.b;
    }

    /* JADX INFO: renamed from: Zx$g */
    public static abstract class g extends AbstractC2615Zx<Method> {
        public final boolean e;

        /* JADX INFO: renamed from: Zx$g$a */
        public static final class a extends g implements InterfaceC7919yu {

            @Nullable
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Method method, @Nullable Object obj) {
                super(method, false, 4);
                Intrinsics.checkNotNullParameter(method, "method");
                this.f = obj;
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                return f(args, this.f);
            }
        }

        /* JADX INFO: renamed from: Zx$g$b */
        public static final class b extends g implements InterfaceC7919yu {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Method method) {
                super(method, false, 4);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                return f(args, null);
            }
        }

        /* JADX INFO: renamed from: Zx$g$c */
        public static final class c extends g implements InterfaceC7919yu {

            @Nullable
            public final Object f;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(@NotNull Method method, @Nullable Object obj) {
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C1371Kj.e(genericParameterTypes, 1, genericParameterTypes.length)));
                this.f = obj;
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                C4952km0 c4952km0 = new C4952km0(2);
                c4952km0.a(this.f);
                c4952km0.b(args);
                ArrayList arrayList = (ArrayList) c4952km0.a;
                return f(arrayList.toArray(new Object[arrayList.size()]), null);
            }
        }

        /* JADX INFO: renamed from: Zx$g$d */
        public static final class d extends g implements InterfaceC7919yu {

            @NotNull
            public final Object[] f;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(@NotNull Method method, @NotNull Object[] boundReceiverComponents) {
                Collection collectionC;
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                int length = boundReceiverComponents.length;
                Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
                if (length < 0) {
                    throw new IllegalArgumentException(C1332Jw.a(length, "Requested element count ", " is less than zero.").toString());
                }
                int length2 = genericParameterTypes.length - length;
                length2 = length2 < 0 ? 0 : length2;
                Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
                if (length2 < 0) {
                    throw new IllegalArgumentException(C1332Jw.a(length2, "Requested element count ", " is less than zero.").toString());
                }
                if (length2 == 0) {
                    collectionC = C5653o60.d;
                } else {
                    int length3 = genericParameterTypes.length;
                    if (length2 >= length3) {
                        collectionC = C1526Mj.F(genericParameterTypes);
                    } else if (length2 == 1) {
                        collectionC = VE.c(genericParameterTypes[length3 - 1]);
                    } else {
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i = length3 - length2; i < length3; i++) {
                            arrayList.add(genericParameterTypes[i]);
                        }
                        collectionC = arrayList;
                    }
                }
                super(method, false, (Type[]) collectionC.toArray(new Type[0]));
                this.f = boundReceiverComponents;
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                C4952km0 c4952km0 = new C4952km0(2);
                c4952km0.b(this.f);
                c4952km0.b(args);
                ArrayList arrayList = (ArrayList) c4952km0.a;
                return f(arrayList.toArray(new Object[arrayList.size()]), null);
            }
        }

        /* JADX INFO: renamed from: Zx$g$e */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Method method) {
                super(method, false, 6);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                return f(args.length <= 1 ? new Object[0] : C1371Kj.e(args, 1, args.length), args[0]);
            }
        }

        /* JADX INFO: renamed from: Zx$g$f */
        public static final class f extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(@NotNull Method method) {
                super(method, true, 4);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                e(C1526Mj.r(args));
                return f(args.length <= 1 ? new Object[0] : C1371Kj.e(args, 1, args.length), null);
            }
        }

        /* JADX INFO: renamed from: Zx$g$g, reason: collision with other inner class name */
        public static final class C0212g extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0212g(@NotNull Method method) {
                super(method, false, 6);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // defpackage.InterfaceC2355Wx
            @Nullable
            public final Object a(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                InterfaceC2355Wx.a.a(this, args);
                return f(args, null);
            }
        }

        public /* synthetic */ g(Method method, boolean z, int i) {
            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
        }

        @Nullable
        public final Object f(@NotNull Object[] args, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.e ? Unit.a : ((Method) this.a).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
            this.e = Intrinsics.a(genericReturnType, Void.TYPE);
        }
    }
}
