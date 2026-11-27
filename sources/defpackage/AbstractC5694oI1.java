package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5694oI1 {

    /* JADX INFO: renamed from: oI1$a */
    public interface a {
        @NotNull
        AbstractC5694oI1 a(@NotNull C2695aK c2695aK, @NotNull Method method);
    }

    /* JADX INFO: renamed from: oI1$b */
    public static final class b extends AbstractC5694oI1 {

        @NotNull
        public final D80<?> a;
        public final C2695aK b;
        public final AbstractC4836kD1 c;
        public final UR1<Object, Object> d;

        /* JADX INFO: renamed from: oI1$b$a */
        public static final class a implements a {
            public final AbstractC4836kD1 a;
            public final D80.b b;
            public final WK0 c;

            public a(@NotNull AbstractC4836kD1 scheduler, @NotNull D80.b eventMapperFactory, @NotNull WK0 streamAdapterResolver) {
                Intrinsics.checkNotNullParameter(scheduler, "scheduler");
                Intrinsics.checkNotNullParameter(eventMapperFactory, "eventMapperFactory");
                Intrinsics.checkNotNullParameter(streamAdapterResolver, "streamAdapterResolver");
                this.a = scheduler;
                this.b = eventMapperFactory;
                this.c = streamAdapterResolver;
            }

            @Override // defpackage.AbstractC5694oI1.a
            public final AbstractC5694oI1 a(C2695aK connection, Method method) {
                D80.e eVar;
                D80 fVar;
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(method, "method");
                Class[] clsArr = new Class[0];
                if (!(method.getGenericParameterTypes().length == 0)) {
                    throw new IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
                }
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "genericParameterTypes");
                ArrayList<Pair> arrayListI = C1526Mj.I(genericParameterTypes, clsArr);
                if (!arrayListI.isEmpty()) {
                    for (Pair pair : arrayListI) {
                        Type type = (Type) pair.d;
                        Class cls = (Class) pair.e;
                        if (cls != type && !cls.isInstance(type)) {
                            throw new IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
                        }
                    }
                }
                Class cls2 = new Class[]{ParameterizedType.class}[0];
                if (cls2 != method.getGenericReturnType() && !cls2.isInstance(method.getGenericReturnType())) {
                    throw new IllegalArgumentException(("Receive method must return ParameterizedType: " + method).toString());
                }
                Type hasUnresolvableType = method.getGenericReturnType();
                Intrinsics.checkNotNullExpressionValue(hasUnresolvableType, "genericReturnType");
                Intrinsics.checkNotNullParameter(hasUnresolvableType, "$this$hasUnresolvableType");
                if (C5189lv.i(hasUnresolvableType)) {
                    throw new IllegalArgumentException(("Method return type must not include a type variable or wildcard: " + method.getGenericReturnType()).toString());
                }
                Type genericReturnType = method.getGenericReturnType();
                if (genericReturnType == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
                ParameterizedType returnType = (ParameterizedType) genericReturnType;
                Annotation[] annotations = method.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations, "method.annotations");
                D80.b bVar = this.b;
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                Class clsG = C5207m.g(D80.a.a(returnType));
                if (Intrinsics.a(clsG, AbstractC2882b80.class)) {
                    fVar = D80.d.a;
                } else {
                    if (AbstractC2882b80.class.isAssignableFrom(clsG)) {
                        throw new IllegalArgumentException("Subclasses of Event is not supported");
                    }
                    if (InterfaceC7394wP0.a.class.equals(clsG)) {
                        fVar = D80.g.b;
                    } else {
                        if (InterfaceC7394wP0.a.class.isAssignableFrom(clsG)) {
                            throw new IllegalArgumentException("Subclasses of Lifecycle.Event is not supported");
                        }
                        if (Pf2.a.class.equals(clsG)) {
                            fVar = D80.i.b;
                        } else {
                            if (Pf2.a.class.isAssignableFrom(clsG)) {
                                throw new IllegalArgumentException("Subclasses of WebSocket.Event is not supported");
                            }
                            if (CP1.class.equals(clsG)) {
                                fVar = D80.h.b;
                            } else {
                                if (CP1.class.isAssignableFrom(clsG)) {
                                    throw new IllegalArgumentException("Subclasses of State is not supported");
                                }
                                Type typeA = D80.a.a(returnType);
                                if (Intrinsics.a(C5207m.g(typeA), AbstractC5953pZ.class)) {
                                    typeA = D80.a.a((ParameterizedType) typeA);
                                }
                                InterfaceC6793tZ0<Object> interfaceC6793tZ0A = bVar.b.a(typeA, annotations);
                                LinkedHashMap linkedHashMap = bVar.a;
                                if (linkedHashMap.containsKey(interfaceC6793tZ0A)) {
                                    Object obj = linkedHashMap.get(interfaceC6793tZ0A);
                                    Intrinsics.checkNotNull(obj);
                                    eVar = (D80.e) obj;
                                } else {
                                    D80.e eVar2 = new D80.e(interfaceC6793tZ0A);
                                    linkedHashMap.put(interfaceC6793tZ0A, eVar2);
                                    eVar = eVar2;
                                }
                                fVar = eVar;
                                if (!Intrinsics.a(clsG, AbstractC5953pZ.class)) {
                                    fVar = new D80.f(eVar);
                                }
                            }
                        }
                    }
                }
                Type type2 = method.getGenericReturnType();
                Intrinsics.checkNotNullExpressionValue(type2, "method.genericReturnType");
                WK0 wk0 = this.c;
                Intrinsics.checkNotNullParameter(type2, "type");
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) wk0.d).iterator();
                while (it.hasNext()) {
                    try {
                        return new b(fVar, connection, this.a, ((UR1.a) it.next()).a(type2));
                    } catch (Throwable th) {
                        arrayList.add(th);
                    }
                }
                Object[] array = arrayList.toArray(new Throwable[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Throwable[] thArr = (Throwable[]) array;
                throw new IllegalStateException("Cannot resolve stream adapter for type " + type2 + JwtParser.SEPARATOR_CHAR, new HH((Throwable[]) Arrays.copyOf(thArr, thArr.length)));
            }
        }

        public b(@NotNull D80<?> eventMapper, @NotNull C2695aK connection, @NotNull AbstractC4836kD1 scheduler, @NotNull UR1<Object, ? extends Object> streamAdapter) {
            Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(scheduler, "scheduler");
            Intrinsics.checkNotNullParameter(streamAdapter, "streamAdapter");
            this.a = eventMapper;
            this.b = connection;
            this.c = scheduler;
            this.d = streamAdapter;
        }
    }

    /* JADX INFO: renamed from: oI1$c */
    public static final class c extends AbstractC5694oI1 {
        public final C2695aK a;
        public final InterfaceC6793tZ0<Object> b;

        /* JADX INFO: renamed from: oI1$c$a */
        public static final class a implements a {
            public final C7003uZ0 a;

            public a(@NotNull C7003uZ0 messageAdapterResolver) {
                Intrinsics.checkNotNullParameter(messageAdapterResolver, "messageAdapterResolver");
                this.a = messageAdapterResolver;
            }

            @Override // defpackage.AbstractC5694oI1.a
            public final AbstractC5694oI1 a(C2695aK connection, Method method) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(method, "method");
                Class[] clsArr = {Object.class};
                if (!(method.getGenericParameterTypes().length == 1)) {
                    throw new IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
                }
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "genericParameterTypes");
                ArrayList<Pair> arrayListI = C1526Mj.I(genericParameterTypes, clsArr);
                if (!arrayListI.isEmpty()) {
                    for (Pair pair : arrayListI) {
                        Type type = (Type) pair.d;
                        Class cls = (Class) pair.e;
                        if (cls != type && !cls.isInstance(type)) {
                            throw new IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
                        }
                    }
                }
                Class cls2 = Void.TYPE;
                Intrinsics.checkNotNullExpressionValue(cls2, "Void.TYPE");
                Class[] clsArr2 = {Boolean.TYPE, cls2};
                for (int i = 0; i < 2; i++) {
                    Class cls3 = clsArr2[i];
                    if (cls3 == method.getGenericReturnType() || cls3.isInstance(method.getGenericReturnType())) {
                        Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "genericParameterTypes");
                        Object objQ = C1526Mj.q(genericParameterTypes2);
                        Intrinsics.checkNotNullExpressionValue(objQ, "genericParameterTypes.first()");
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "parameterAnnotations");
                        Object objQ2 = C1526Mj.q(parameterAnnotations);
                        Intrinsics.checkNotNullExpressionValue(objQ2, "parameterAnnotations.first()");
                        return new c(connection, this.a.a((Type) objQ, (Annotation[]) objQ2));
                    }
                }
                throw new IllegalArgumentException(("Send method must return Boolean or Void: " + method).toString());
            }
        }

        public c(@NotNull C2695aK connection, @NotNull InterfaceC6793tZ0<Object> messageAdapter) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
            this.a = connection;
            this.b = messageAdapter;
        }
    }
}
